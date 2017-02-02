package edu.squat.transformations.modifiability.insinter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.LoopUnit;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.impl.LoopUnitImpl;
import org.eclipse.emf.henshin.trace.Trace;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.StartAction;
import org.palladiosimulator.pcm.seff.StopAction;

import edu.squat.transformations.modifiability.PCMTransformerRunner;
import edu.squat.transformations.modifiability.RunnerHelper;
import edu.squat.transformations.modifiability.Tactic;

public class InsInterRunner extends PCMTransformerRunner {
	//
	private Engine engine;
	//
	private Rule markComponent2Isolate;
	private Rule createIntermediaryComponent;
	private Rule rewireComponents2Intermediary;
	private Rule removeDuplicateRequiredRoles;
	
	public InsInterRunner() {
		super();
	}

	
	@Override
	public void loadRules() {
		markComponent2Isolate = (Rule) module.getUnit("markComponent2Isolate");
		//markComponents2Isolate.setCheckDangling(false);
		createIntermediaryComponent = (Rule) module.getUnit("createIntermediaryComponent");
		rewireComponents2Intermediary = (Rule) module.getUnit("rewireComponents2Intermediary");
		removeDuplicateRequiredRoles = (Rule) module.getUnit("removeDuplicateRequiredRoles");
	}
	
	
	@SuppressWarnings({"unused"})
	@Override
	public void run(boolean saveResult) {
		candidateTactics = new ArrayList<Tactic>();
		//Create and configure an engine
		engine = new EngineImpl();
		//engine.getOptions().put(engine.OPTION_CHECK_DANGLING, false);

		//Run the first rule to create the traces
		RuleApplication app = this.runFirstRule(graph);
		boolean success = app.execute(monitor);
		//If the transformation was successful continue with the other rules
		if(success) {
			System.out.println("Successfully marked components and interfaces that could use an intermediate");
			Trace root = RunnerHelper.getTraceRoot(graph);
			Repository repository = RunnerHelper.getRepositoryRoot(graph);
			
			List<List<OperationInterface>> chainInterfacesHolder = this.computeCandidateRefactorings(root);
			//Avoiding references to the graph because we are going to clone it...we need emf-less references
			List<List<Integer>> chainInterfacesPointer = this.transformToPointers(root, repository, chainInterfacesHolder);
			
			int counter = 0;
			while(counter < chainInterfacesPointer.size()) {
				//Cloning the graph
				EGraph tempGraph = graph.copy(null);
				Trace tempRoot = RunnerHelper.getTraceRoot(tempGraph);
				Repository tempRepository = RunnerHelper.getRepositoryRoot(tempGraph);
				//Getting the interfaces
				List<OperationInterface> chainInterface = this.convertToInterfaces(tempRoot, tempRepository, chainInterfacesPointer.get(counter));
				//Getting the traces
				List<Trace> traceMatches = this.collectMatchTraces(tempRoot, chainInterface);
				List<Trace> traceLeftRight = this.collectLeftRightTraces(traceMatches);
				//Removing all but the chain
				tempRoot.getSubTraces().clear();
				tempRoot.getSubTraces().addAll(traceMatches);
				tempRoot.getSubTraces().addAll(traceLeftRight);
				
				List<BasicComponent> components = new ArrayList<BasicComponent>();
				this.gatherEntities(tempRoot, "component", components);
				List<OperationInterface> interfaces = new ArrayList<OperationInterface>();
				this.gatherEntities(tempRoot, "interface", interfaces);
				String componentsName = this.assemblyName(components);
				String interfacesName = this.assemblyName(interfaces);
				
				if(components.size() > 2) {
					System.out.println("Successfully created trace elements for inserting an intermediate between components " + componentsName);
					System.out.println("Successfully created trace elements for inserting an intermediate for interfaces " + interfacesName);
					
					//Configuring and executing the second rule
					RuleApplication secondRule = this.runSecondRule(tempGraph, componentsName, interfacesName);
					//Duplicating the interface for the intermediate
					BasicComponent newComponent = (BasicComponent) secondRule.getResultParameterValue("newComp");
					OperationInterface newInterface = (OperationInterface) secondRule.getResultParameterValue("newInt");		
					this.duplicateInterface(interfaces, newInterface);		
					//Creating a basic service effect specification for the intermediate
					this.createSEFF(newComponent, newInterface);

					//Configuring and executing the third rule
					UnitApplication thirdRule = this.runThirdRule(tempGraph);
					
					//Configuring and executing the fourth rule
					UnitApplication fourthRule = this.runFourthRule(tempGraph);
					
					//Store the results
					this.addTactic(null, tempGraph, null);
					if (saveResult) {
						RunnerHelper.saveRepositoryResult(
								resourceSet, 
								tempGraph, 
								repositoryFilename.replace("#REPLACEMENT#", String.valueOf(counter) + "-" + interfacesName));
					}
				}
				else {
					System.out.println("The transformation did not continue because it was a 1-to-1 intermediate");
					System.out.println("It was useless to create an intermediate between components " + componentsName + " and interfaces " + interfacesName);
				}
				counter++;
			}
		}
		else {
			System.out.println("Could not mark components and interfaces that could use an intermediate");
		}
	}
	
	private RuleApplication runFirstRule(EGraph graph) {
		RuleApplication app = new RuleApplicationImpl(engine);
		app.setEGraph(graph);
		app.setRule(markComponent2Isolate);
		return app;
	}


	private RuleApplication runSecondRule(EGraph graph, String componentName, String interfaceName) {
		RuleApplication app = new RuleApplicationImpl(engine);
		app.setEGraph(graph);
		app.setRule(createIntermediaryComponent);
		app.setParameterValue("cName", componentName);
		app.setParameterValue("iName", interfaceName);
		boolean success = app.execute(monitor);
		if(success)
			System.out.println("Successfully created intermediate component and intermediate interface");
		else
			System.out.println("Could not create intermediate component and intermediate interface");
		return app;
	}


	private void duplicateInterface(List<OperationInterface> oldInterfaces, OperationInterface newInterface) {
		RepositoryFactory factory = RepositoryFactory.eINSTANCE;
		for(OperationInterface oldInterface : oldInterfaces) {
			for(OperationSignature signature : oldInterface.getSignatures__OperationInterface()) {
				OperationSignature clonedSignature = factory.createOperationSignature();
				clonedSignature.setEntityName(signature.getEntityName());
				clonedSignature.setReturnType__OperationSignature(signature.getReturnType__OperationSignature());
				for(Parameter parameter : signature.getParameters__OperationSignature()) {
					Parameter clonedParameter = factory.createParameter();
					clonedParameter.setParameterName(parameter.getParameterName());
					clonedParameter.setDataType__Parameter(parameter.getDataType__Parameter());
					clonedParameter.setEventType__Parameter(parameter.getEventType__Parameter());
					clonedSignature.getParameters__OperationSignature().add(clonedParameter);
				}
				newInterface.getSignatures__OperationInterface().add(clonedSignature);
			}
		}
		System.out.println("Successfully duplicated all the interfaces of the involved components to the intermediate one");
	}


	private void createSEFF(BasicComponent newComponent, OperationInterface newInterface) {
		SeffFactory factory = SeffFactory.eINSTANCE;
		for(OperationSignature signature : newInterface.getSignatures__OperationInterface()) {
			ResourceDemandingSEFF seff = factory.createResourceDemandingSEFF();
			seff.setDescribedService__SEFF(signature);
			StartAction start = factory.createStartAction();
			StopAction stop = factory.createStopAction();
			start.setEntityName("start");
			stop.setEntityName("stop");
			start.setSuccessor_AbstractAction(stop);
			stop.setPredecessor_AbstractAction(start);
			seff.getSteps_Behaviour().add(start);
			seff.getSteps_Behaviour().add(stop);
			newComponent.getServiceEffectSpecifications__BasicComponent().add(seff);
		}
		System.out.println("Successfully created a simple SEFF for the intermediate component and interface");
	}


	private UnitApplication runThirdRule(EGraph graph) {
		UnitApplication appLoop = new UnitApplicationImpl(engine);
		appLoop.setEGraph(graph);
		LoopUnit loop = new LoopUnitImpl();
		loop.setSubUnit(rewireComponents2Intermediary);
		appLoop.setUnit(loop);
		boolean success = appLoop.execute(monitor);
		if(success)
			System.out.println("Successfully reconnected existing components to the intermediate component and intermediate interface");
		else
			System.out.println("Could not reconnect existing components to the intermediate component and intermediate interface");
		return appLoop;
	}


	private UnitApplication runFourthRule(EGraph graph) {
		UnitApplication appLoop = new UnitApplicationImpl(engine);
		appLoop.setEGraph(graph);
		LoopUnit loop = new LoopUnitImpl();
		loop.setSubUnit(removeDuplicateRequiredRoles);
		appLoop.setUnit(loop);
		boolean success = appLoop.execute(monitor);
		if(success)
			System.out.println("Successfully removed duplicate required roles");
		else
			System.out.println("Could not remove duplicate required roles");
		return appLoop;
	}


	//This is a greedy implementation for the single maximal clique problem
	//https://en.wikipedia.org/wiki/Clique_problem
	private List<List<OperationInterface>> computeCandidateRefactorings(Trace root) {
		List<List<OperationInterface>> chainHolder = new ArrayList<List<OperationInterface>>();
		List<OperationInterface> allInterfaces = new ArrayList<OperationInterface>();
		this.gatherEntities(root, "interface", allInterfaces);
		List<OperationInterface> potentialInterfaces = new ArrayList<OperationInterface>(allInterfaces);
		while(potentialInterfaces.size() > 0) {
			//Use the first interface available as seed
			OperationInterface seedInterface = potentialInterfaces.get(0);
			//Remove the first seed from the potential matches...
			potentialInterfaces.remove(seedInterface);
			//Store the chain
			List<OperationInterface> chain = new ArrayList<OperationInterface>();
			chain.add(seedInterface);
			//Expand the search for this seed
			for(OperationInterface opInterface : allInterfaces) {
				//if is the initial seed just do nothing
				if(opInterface.equals(seedInterface)) {
					//DO NOTHING
				}
				else {
					//Determine if we should add this trace to the chain
					boolean shouldKeep = this.shouldIncludeInterface(root, chain, opInterface);
					// Remove from the stack if it is either the left trace or the right trace is related to the seed 
					if(shouldKeep)
						chain.add(opInterface);
				}
			}
			//Store the chain
			chainHolder.add(chain);
			//Remove chain from the seeds
			potentialInterfaces.removeAll(chain);
		}
		return chainHolder;
	}
	
	private boolean shouldIncludeInterface(Trace root, List<OperationInterface> chain, OperationInterface newOperationInterface) {
		boolean shouldInclude = true;
		Iterator<OperationInterface> it = chain.iterator();
		while(it.hasNext() && shouldInclude) {
			OperationInterface operationInterface = it.next();
			boolean coveredByTrace = false;
			List<Trace> opTraces = this.collectMatchTraces(root, newOperationInterface, null);
			for(int i = 0; i < opTraces.size() && !coveredByTrace; i++) {
				Trace trace = opTraces.get(i);
				OperationInterface op1 = (OperationInterface) ((Trace)trace.getSource().get(0)).getTarget().get(0);
				OperationInterface op2 = (OperationInterface) ((Trace)trace.getTarget().get(0)).getTarget().get(0);
				if(
						op1.equals(operationInterface) && op2.equals(newOperationInterface) ||
						op1.equals(newOperationInterface) && op2.equals(operationInterface)
						)
					coveredByTrace = true;
			}
			if(!coveredByTrace)
				shouldInclude = false;
		}
		return shouldInclude;
	}
	
	private List<Trace> collectMatchTraces(Trace root, List<OperationInterface> chain) {
		List<Trace> traceMatches = new ArrayList<Trace>();
		for(int i = 0; i < chain.size() - 1; i++) {
			OperationInterface operationInterface1 = chain.get(i);
			for(int j = 0; j < chain.size(); j++) {
				OperationInterface operationInterface2 = chain.get(j);
				List<Trace> traceMatch = this.collectMatchTraces(root, operationInterface1, operationInterface2);
				traceMatches.addAll(traceMatch);
			}
		}
		return traceMatches;
	}


	private List<Trace> collectMatchTraces(Trace root, OperationInterface op1, OperationInterface op2) {
		List<Trace> allMatches = RunnerHelper.getTraces(root, "match", true);
		List<Trace> interfaceMatches = new ArrayList<Trace>();
		for(Trace trace : allMatches) {
			OperationInterface leftInterface = (OperationInterface) ((Trace) trace.getSource().get(0)).getTarget().get(0);
			OperationInterface rightInterface = (OperationInterface) ((Trace) trace.getTarget().get(0)).getTarget().get(0);
			if(op2 == null) {
				if(leftInterface.equals(op1) || rightInterface.equals(op1))
					interfaceMatches.add(trace);
			}
			else
				if(leftInterface.equals(op1) && rightInterface.equals(op2) ||
				leftInterface.equals(op2) && rightInterface.equals(op1))
					interfaceMatches.add(trace);
		}
		return interfaceMatches;
	}


	private List<Trace> collectLeftRightTraces(List<Trace> matches) {
		List<Trace> leftRightTraces = new ArrayList<Trace>();
		for(Trace match : matches) {
			leftRightTraces.add((Trace) match.getSource().get(0));
			leftRightTraces.add((Trace) match.getTarget().get(0));
		}
		return leftRightTraces;
	}


	private List<List<Integer>> transformToPointers(Trace root, Repository repository, List<List<OperationInterface>> chainInterfacesHolder) {
		List<List<Integer>> chainHolderPointer = new ArrayList<List<Integer>>();
		for(int i = 0; i < chainInterfacesHolder.size(); i++) {
			List<OperationInterface> chain = chainInterfacesHolder.get(i);
			List<Integer> chainPointer = new ArrayList<Integer>();
			for(int chainIndex = 0; chainIndex < chain.size(); chainIndex++) {
				OperationInterface operationInterface = chain.get(chainIndex);
				int pointer = repository.getInterfaces__Repository().indexOf(operationInterface);
				chainPointer.add(pointer);
			}
			chainHolderPointer.add(chainPointer);
		}
		return chainHolderPointer;
	}

	private List<OperationInterface> convertToInterfaces(Trace root, Repository repository, List<Integer> chainInterfacesPointer) {
		List<OperationInterface> chainInterfacesHolder = new ArrayList<OperationInterface>();
		for(int i = 0; i < chainInterfacesPointer.size(); i++) {
			Integer pointer = chainInterfacesPointer.get(i);
			OperationInterface operationInterface = (OperationInterface) repository.getInterfaces__Repository().get(pointer.intValue());
			chainInterfacesHolder.add(operationInterface);
		}
		return chainInterfacesHolder;
	}


	private String assemblyName(List<? extends Entity> entities) {
		StringBuilder sb = new StringBuilder();
		for(Entity e : entities)
			sb.append(e.getEntityName()).append("+");
		String text = sb.toString();
		text = text.substring(0, text.length() - 1);
		return text;
	}


	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void gatherEntities(Trace root, String type, List list) {
		List<Trace> matches = RunnerHelper.getTraces(root, "match", true);
		for(Trace t : matches) {
			if(type.equals("component")) {
				BasicComponent leftC = (BasicComponent)(((Trace)t.getSource().get(0)).getSource().get(0));
				BasicComponent rightC = (BasicComponent)(((Trace)t.getTarget().get(0)).getSource().get(0));
				if(!list.contains(leftC)) list.add(leftC);
				if(!list.contains(rightC)) list.add(rightC);
			}
			else if(type.equals("interface")) {
				OperationInterface leftI = (OperationInterface)(((Trace)t.getSource().get(0)).getTarget().get(0));
				OperationInterface rightI = (OperationInterface)(((Trace)t.getTarget().get(0)).getTarget().get(0));
				if(!list.contains(leftI)) list.add(leftI);
				if(!list.contains(rightI)) list.add(rightI);
			}
		}
	}
	
	public static void main(String[] args) {
		String dirPath = "src/edu/squat/transformations/modifiability/insinter";
		String henshinFilename = "insinter-modular.henshin";
		String repositoryFilename;
		String resultRepositoryFilename;

		InsInterRunner runner = new InsInterRunner();

		//Individual testing
		repositoryFilename = "insert-test.repository";
		resultRepositoryFilename = "insert-test-" + "#REPLACEMENT#" + ".repository";
		runner.run(dirPath, repositoryFilename, henshinFilename, resultRepositoryFilename, true);
		
		//Multiple testing
		repositoryFilename = "insert-mult.repository";
		resultRepositoryFilename = "insert-mult-" + "#REPLACEMENT#" + ".repository";
		runner.run(dirPath, repositoryFilename, henshinFilename, resultRepositoryFilename, true);
		
		//MediaStore3 testing
		repositoryFilename = "ms.repository";
		resultRepositoryFilename = "ms-" + "#REPLACEMENT#" + ".repository";
		//runner.run(dirPath, repositoryFilename, henshinFilename, resultRepositoryFilename, true);
		
		//SimpleTactics testing
		repositoryFilename = "st.repository";
		resultRepositoryFilename = "st-" + "#REPLACEMENT#" + ".repository";
		//runner.run(dirPath, repositoryFilename, henshinFilename, resultRepositoryFilename, true);
		
		//SimpleTactics+ testing
		repositoryFilename = "stplus.repository";
		resultRepositoryFilename = "stplus-" + "#REPLACEMENT#" + ".repository";
		//runner.run(dirPath, repositoryFilename, henshinFilename, resultRepositoryFilename, true);
	}
}
