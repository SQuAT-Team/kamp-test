package edu.squat.transformations.modifiability.wrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.trace.Trace;
import org.eclipse.emf.henshin.trace.TraceFactory;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.allocation.AllocationFactory;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.CompositionFactory;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.StartAction;
import org.palladiosimulator.pcm.seff.StopAction;

import edu.squat.transformations.modifiability.PCMTransformerRunner;
import edu.squat.transformations.modifiability.RunnerHelper;
import edu.squat.transformations.modifiability.Tactic;

public class WrapperRunner extends PCMTransformerRunner {
	private final static String TRACE_Wrapped = "wrap";
	private final static String TRACE_Affected = "affected";
	@SuppressWarnings("unused")
	private final static String TRACE_Wrapper = "wrapper";
	private final static String TRACE_Connection = "connection";
	private final static String TRACE_AssemblyContext = "assembly-cont";
	private final static String TRACE_AssemblyConnector = "assembly-conn";
	private final static String TRACE_AllocationContext = "allocation-cont";
	//
	private Engine engine;
	//
	private Rule createInitialTrace;
	private Rule markComponents2Wrap;
	private Rule createWrapper;
	private Rule reconnectComponents2Wrapper;
	
	public WrapperRunner() {
		super();
	}

	
	@Override
	public void loadRules() {
		createInitialTrace = (Rule) module.getUnit("createInitialTrace");
		//createInitialTrace.setCheckDangling(false);
		markComponents2Wrap = (Rule) module.getUnit("markComponents2Wrap");
		createWrapper = (Rule) module.getUnit("createWrapper");
		//createWrapper.setCheckDangling(false);
		reconnectComponents2Wrapper = (Rule) module.getUnit("reconnectComponents2Wrapper");
	}
	
	@Override
	public void run(boolean saveResult) {
		candidateTactics = new ArrayList<Tactic>();
		//Create and configure an engine
		engine = new EngineImpl();
		//engine.getOptions().put(engine.OPTION_CHECK_DANGLING, false);

		//Run the first and second rule to create the initial traces
		RuleApplication firstRule = this.runFirstRule(graph);
		boolean successFirstRule = firstRule.execute(monitor);
		RuleApplication secondRule = this.runSecondRule(graph);
		boolean successSecondRule = secondRule.execute(monitor);
		
		//If the transformation was successful continue with the other rules
		if(successFirstRule && successSecondRule) {
			System.out.println("Successfully marked components and interfaces that could be wrapped");
			Trace root = RunnerHelper.getTraceRoot(graph);
			
			List<Trace> candidateTraces = this.computeCandidates(root);
			//Avoiding references to the graph because we are going to clone it...we need emf-less references
			List<Integer> candidatePointers = this.transformToPointers(root, candidateTraces);
			
			int counter = 0;
			while(counter < candidatePointers.size()) {
				//Cloning the graph
				EGraph tempGraph = graph.copy(null);
				Trace tempRoot = RunnerHelper.getTraceRoot(tempGraph);
				//Repository tempRepository = RunnerHelper.getRepositoryRoot(tempGraph);
				//Getting the interfaces
				Trace tempCandidateTrace = this.convertToCandidate(tempRoot, candidatePointers.get(counter));
				//Removing all but the chain
				tempRoot.getSubTraces().clear();
				tempRoot.getSubTraces().add(tempCandidateTrace);
			
				//Configuring and executing the third rule
				RuleApplication thirdRule = this.runThirdRule(tempGraph);
				
				//Duplicating the interface for the intermediate
				OperationInterface oldInterface = (OperationInterface) thirdRule.getResultParameterValue("iWrap");	
				BasicComponent newComponent = (BasicComponent) thirdRule.getResultParameterValue("cWrapper");
				OperationInterface newInterface = (OperationInterface) thirdRule.getResultParameterValue("iWrapper");		
				this.duplicateInterface(oldInterface, newInterface);
				
				//Save the name for the files
				String interfaceName = oldInterface.getEntityName();
				String fileName = interfaceName;
				
				//Creating a service effect specification for the intermediate
				this.createSEFF(oldInterface, newComponent, newInterface);
				
				//Configuring and executing the fourth rule
				this.runFourthRule(tempGraph);
				
				if(this.arePerformanceModelsLoaded()) {
					//Adjust the system and allocation models by executing a monolithic method (ugly but fast)
					this.fixSystemAndAllocation(tempGraph, oldInterface, newComponent, newInterface);
				}

				//Clean up and delete old assembly connectors
				this.runLastRule(tempGraph);
				
				//Store the results
				this.addTactic(null, tempGraph, null);
				if (saveResult) {
					RunnerHelper.saveRepositoryResult(
							resourceSet, 
							tempGraph, 
							resultRepositoryFilename.replace("#REPLACEMENT#", String.valueOf(counter) + "-" + fileName));
					if(this.arePerformanceModelsLoaded()) {
						RunnerHelper.saveSystemResult(
								resourceSet, 
								tempGraph, 
								resultSystemFilename.replace("#REPLACEMENT#", String.valueOf(counter) + "-" + fileName));
						RunnerHelper.saveResourceEnvironmentResult(
								resourceSet, 
								tempGraph, 
								resultResourceEnvironmentFilename.replace("#REPLACEMENT#", String.valueOf(counter) + "-" + fileName));
						RunnerHelper.saveAllocationResult(
								resourceSet, 
								tempGraph, 
								resultAllocationFilename.replace("#REPLACEMENT#", String.valueOf(counter) + "-" + fileName));
					}
					if(this.isUsageModelLoaded()) {
						RunnerHelper.saveUsageResult(
								resourceSet, 
								tempGraph, 
								resultUsageFilename.replace("#REPLACEMENT#", String.valueOf(counter) + "-" + fileName));
					}
				}
				counter++;
			}
		}
		else {
			System.out.println("Could not mark components and interfaces that could use a wrapper");
		}
	}

	private List<Trace> computeCandidates(Trace root) {
		List<Trace> candidates = new ArrayList<Trace>();
		List<Trace> wraps = RunnerHelper.getTraces(root, TRACE_Wrapped, false);
		for(Trace wrap : wraps)
			//if(this.isCandidate(wrap))
				candidates.add(wrap);
		return candidates;
	}
	
	private boolean isCandidate(Trace wrap) {
		List<Trace> affectedComponents = RunnerHelper.getTraces(wrap, TRACE_Affected, false);
		if(affectedComponents.size() > 1)
			return true;
		else
			return false;
	}
	
	private List<Integer> transformToPointers(Trace root, List<Trace> candidateTraces) {
		List<Integer> pointers = new ArrayList<Integer>();
		List<Trace> wraps = RunnerHelper.getTraces(root, TRACE_Wrapped, false);
		for(Trace candidate : candidateTraces) {
			int pointer = wraps.indexOf(candidate);
			pointers.add(pointer);
		}
		return pointers;
	}

	private Trace convertToCandidate(Trace tempRoot, Integer index) {
		List<Trace> wraps = RunnerHelper.getTraces(tempRoot, TRACE_Wrapped, false);
		Trace candidate = wraps.get(index);
		return candidate;
	}

	private void fixSystemAndAllocation(EGraph graph, OperationInterface oldInterface, BasicComponent newComponent, OperationInterface newInterface) {
		Trace traceRoot = RunnerHelper.getTraceRoot(graph);
		Repository repositoryRoot = RunnerHelper.getRepositoryRoot(graph);
		org.palladiosimulator.pcm.system.System systemRoot = RunnerHelper.getSystemRoot(graph);
		
		//Create the assembly context
		AssemblyContext wrapperAssemblyContext = CompositionFactory.eINSTANCE.createAssemblyContext();
		wrapperAssemblyContext.setEncapsulatedComponent__AssemblyContext(newComponent);
		wrapperAssemblyContext.setEntityName(RunnerHelper.getAssemblyContextName(newComponent));
		systemRoot.getAssemblyContexts__ComposedStructure().add(wrapperAssemblyContext);
		Trace assemblyContextTrace = TraceFactory.eINSTANCE.createTrace();
		assemblyContextTrace.setName(TRACE_AssemblyContext);
		//assemblyContextTrace.getSource().add(null);
		assemblyContextTrace.getTarget().add((EObject) wrapperAssemblyContext);
		traceRoot.getSubTraces().add(assemblyContextTrace);
		
		//Find providing components
		List<BasicComponent> providingComponents = new ArrayList<BasicComponent>();
		for(RepositoryComponent component : repositoryRoot.getComponents__Repository()) {
			if(component instanceof BasicComponent) {
				BasicComponent basicComponent = (BasicComponent) component;
				for(ProvidedRole providedRole : basicComponent.getProvidedRoles_InterfaceProvidingEntity()) {
					if(providedRole instanceof OperationProvidedRole) {
						OperationProvidedRole operationProvidedRole = (OperationProvidedRole) providedRole;
						if(operationProvidedRole.getProvidedInterface__OperationProvidedRole().equals(oldInterface))
							providingComponents.add(basicComponent);
					}
				}
			}
		}
		
		//Find affected components
		List<BasicComponent> affectedComponents = new ArrayList<BasicComponent>();
		Trace wrapTrace = RunnerHelper.getTraces(traceRoot, TRACE_Wrapped, false).get(0);
		List<Trace> affectedTraces = RunnerHelper.getTraces(wrapTrace, TRACE_Affected, false);
		for(Trace affectedTrace : affectedTraces) {
			BasicComponent affectedComponent = (BasicComponent) affectedTrace.getSource().get(0);
			affectedComponents.add(affectedComponent);
		}
		//Reconnect the assembly connectors
		List<Connector> connectorsToAdd = new ArrayList<Connector>();
		Iterator<Connector> connectors = systemRoot.getConnectors__ComposedStructure().iterator();
		while(connectors.hasNext()) {
			Connector connector = connectors.next();
			if(connector instanceof ProvidedDelegationConnector) {
				//ProvidedDelegationConnector oldDelegationConnector = (ProvidedDelegationConnector) connector;
				//DO NOTHING
			}
			if(connector instanceof AssemblyConnector) {
				AssemblyConnector oldConnector = (AssemblyConnector) connector;
				AssemblyContext providingAssemblyContext = oldConnector.getProvidingAssemblyContext_AssemblyConnector();
				AssemblyContext requiringAssemblyContext = oldConnector.getRequiringAssemblyContext_AssemblyConnector();
				BasicComponent providingComponent = (BasicComponent) providingAssemblyContext.getEncapsulatedComponent__AssemblyContext();
				BasicComponent requiringComponent = (BasicComponent) requiringAssemblyContext.getEncapsulatedComponent__AssemblyContext();
				
				if(providingComponents.contains(providingComponent) && affectedComponents.contains(requiringComponent)) {
					AssemblyConnector wrapperConnector = CompositionFactory.eINSTANCE.createAssemblyConnector();
					wrapperConnector.setEntityName(RunnerHelper.getAssemblyConnectorName(requiringAssemblyContext, wrapperAssemblyContext));
					wrapperConnector.setProvidingAssemblyContext_AssemblyConnector(wrapperAssemblyContext);
					wrapperConnector.setRequiringAssemblyContext_AssemblyConnector(requiringAssemblyContext);
					OperationProvidedRole wrapperProvidedRole = RunnerHelper.findProvidedRole(newComponent, newInterface);
					OperationRequiredRole wrapperRequiredRole = RunnerHelper.findRequiredRole(requiringComponent, newInterface);
					wrapperConnector.setProvidedRole_AssemblyConnector(wrapperProvidedRole);
					wrapperConnector.setRequiredRole_AssemblyConnector(wrapperRequiredRole);
					connectorsToAdd.add(wrapperConnector);
					//
					Trace connectorTrace = TraceFactory.eINSTANCE.createTrace();
					connectorTrace.setName(TRACE_AssemblyConnector);
					connectorTrace.getSource().add((EObject) oldConnector);
					connectorTrace.getTarget().add((EObject) wrapperConnector);
					traceRoot.getSubTraces().add(connectorTrace);
				}
			}
		}
		//Create a new assembly connector between the wrapper and the wrapped component
		for(BasicComponent oldComponent : providingComponents) {
			List<AssemblyContext> wrapAssemblyContexts = RunnerHelper.findAssemblyContexts(oldComponent, systemRoot);
			for(AssemblyContext wrapAssemblyContext : wrapAssemblyContexts) {
				AssemblyConnector wrapConnector = CompositionFactory.eINSTANCE.createAssemblyConnector();
				wrapConnector.setEntityName(RunnerHelper.getAssemblyConnectorName(wrapperAssemblyContext, wrapAssemblyContext));
				wrapConnector.setProvidingAssemblyContext_AssemblyConnector(wrapAssemblyContext);
				wrapConnector.setRequiringAssemblyContext_AssemblyConnector(wrapperAssemblyContext);
				OperationProvidedRole wrapProvidedRole = RunnerHelper.findProvidedRole(oldComponent, oldInterface);
				OperationRequiredRole wrapRequiredRole = RunnerHelper.findRequiredRole(newComponent, oldInterface);
				wrapConnector.setProvidedRole_AssemblyConnector(wrapProvidedRole);
				wrapConnector.setRequiredRole_AssemblyConnector(wrapRequiredRole);
				connectorsToAdd.add(wrapConnector);
				//
				Trace connectorTrace = TraceFactory.eINSTANCE.createTrace();
				connectorTrace.setName(TRACE_AssemblyConnector);
				//connectorTrace.getSource().add(null);
				connectorTrace.getTarget().add((EObject) wrapConnector);
				traceRoot.getSubTraces().add(connectorTrace);
			}
		}
		
		//Add all the connectors to the system model
		systemRoot.getConnectors__ComposedStructure().addAll(connectorsToAdd);
		
		//Find the resources allocated to assembly contexts encapsulating the old component
		Allocation allocationRoot = RunnerHelper.getAllocationRoot(graph);
		Map<ResourceContainer, Integer> counter = new HashMap<ResourceContainer, Integer>();
		for(BasicComponent oldComponent : providingComponents) {
			List<AssemblyContext> assemblyContexts = RunnerHelper.findAssemblyContexts(oldComponent, systemRoot);
			for(AssemblyContext assemblyContext : assemblyContexts) {
				ResourceContainer resourceContainer = RunnerHelper.findAllocationResourceContainer(assemblyContext, allocationRoot);
				if(counter.containsKey(resourceContainer))
					counter.put(resourceContainer, counter.get(resourceContainer) + 1);
				else
					counter.put(resourceContainer, 1);
			}
		}
		//Allocate the assembly context to the resource with higher allocated resources
		ResourceContainer bestContainer = null;
		int maxAllocation = Integer.MIN_VALUE;
		for(ResourceContainer resourceContainer : counter.keySet()) {
			if(bestContainer == null || counter.get(resourceContainer) > maxAllocation) {
				bestContainer = resourceContainer;
				maxAllocation = counter.get(resourceContainer);
			}
		}
		AllocationContext wrapperAllocationContext = AllocationFactory.eINSTANCE.createAllocationContext();
		wrapperAllocationContext.setEntityName(RunnerHelper.getAllocationContextName(wrapperAssemblyContext));
		wrapperAllocationContext.setAssemblyContext_AllocationContext(wrapperAssemblyContext);
		wrapperAllocationContext.setResourceContainer_AllocationContext(bestContainer);
		allocationRoot.getAllocationContexts_Allocation().add(wrapperAllocationContext);
		//
		Trace allocationTrace = TraceFactory.eINSTANCE.createTrace();
		allocationTrace.setName(TRACE_AllocationContext);
		//allocationTrace.getSource().add(null);
		allocationTrace.getTarget().add((EObject) wrapperAllocationContext);
		traceRoot.getSubTraces().add(allocationTrace);
	}

	private RuleApplication runFirstRule(EGraph graph) {
		RuleApplication app = new RuleApplicationImpl(engine);
		app.setEGraph(graph);
		app.setRule(createInitialTrace);
		return app;
	}

	private RuleApplication runSecondRule(EGraph graph) {
		RuleApplication app = new RuleApplicationImpl(engine);
		app.setEGraph(graph);
		app.setRule(markComponents2Wrap);
		return app;
	}

	private RuleApplication runThirdRule(EGraph graph) {
		RuleApplication app = new RuleApplicationImpl(engine);
		app.setEGraph(graph);
		app.setRule(createWrapper);
		boolean success = app.execute(monitor);
		if(success)
			System.out.println("Successfully created the wrapper component and interface");
		else
			System.out.println("Could not create the wrapper component and interface");
		return app;
	}

	private void duplicateInterface(OperationInterface oldInterface, OperationInterface newInterface) {
		RepositoryFactory factory = RepositoryFactory.eINSTANCE;
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
		System.out.println("Successfully duplicated the interface of the wrapped component into the wrapper");
	}

	private void createSEFF(OperationInterface oldInterface, BasicComponent newComponent, OperationInterface newInterface) {
		SeffFactory factory = SeffFactory.eINSTANCE;
		for(OperationSignature signature : newInterface.getSignatures__OperationInterface()) {
			ResourceDemandingSEFF seff = factory.createResourceDemandingSEFF();
			seff.setDescribedService__SEFF(signature);
			//
			StartAction start = factory.createStartAction();
			start.setEntityName("start");
			ExternalCallAction externalCallAction = factory.createExternalCallAction();
			externalCallAction.setEntityName("External_" + newInterface.getEntityName() + "_" + signature.getEntityName());
			externalCallAction.setCalledService_ExternalService(this.findExternalSignature(signature, oldInterface));
			externalCallAction.setRole_ExternalService(this.findExternalRole(newComponent, oldInterface));
			StopAction stop = factory.createStopAction();
			stop.setEntityName("stop");
			//
			start.setSuccessor_AbstractAction(externalCallAction);
			externalCallAction.setPredecessor_AbstractAction(start);
			externalCallAction.setSuccessor_AbstractAction(stop);
			stop.setPredecessor_AbstractAction(externalCallAction);
			seff.getSteps_Behaviour().add(start);
			seff.getSteps_Behaviour().add(externalCallAction);
			seff.getSteps_Behaviour().add(stop);
			newComponent.getServiceEffectSpecifications__BasicComponent().add(seff);
		}
		System.out.println("Successfully created a simple SEFF for the wrapper component and interface");
	}

	private OperationRequiredRole findExternalRole(BasicComponent newComponent, OperationInterface oldInterface) {
		for(RequiredRole requiredRole : newComponent.getRequiredRoles_InterfaceRequiringEntity()) {
			OperationRequiredRole operationRequiredRole = (OperationRequiredRole) requiredRole;
			if(operationRequiredRole.getRequiredInterface__OperationRequiredRole().equals(oldInterface))
				return operationRequiredRole;
		}
		return null;
	}

	private OperationSignature findExternalSignature(OperationSignature newSignature, OperationInterface oldInterface) {
		for(OperationSignature oldSignature : oldInterface.getSignatures__OperationInterface()) {
			if(oldSignature.getEntityName().equals(newSignature.getEntityName()))
				return oldSignature;
		}
		return null;
	}


	private RuleApplication runFourthRule(EGraph graph) {
		RuleApplication app = new RuleApplicationImpl(engine);
		app.setEGraph(graph);
		app.setRule(reconnectComponents2Wrapper);
		boolean success = app.execute(monitor);
		if(success)
			System.out.println("Successfully reconnected existing components to wrapper");
		else
			System.out.println("Could not reconnect existing components to wrapper");
		return app;
	}
	
	private void runLastRule(EGraph graph) {
		Trace root = RunnerHelper.getTraceRoot(graph);
		//Removing operation required roles
		Trace wrapTrace = RunnerHelper.getTraces(root, TRACE_Wrapped, false).get(0);
		List<Trace> affectedTraces = RunnerHelper.getTraces(wrapTrace, TRACE_Affected, false);
		for(Trace affectedTrace : affectedTraces) {
			BasicComponent affectedComponent = (BasicComponent) affectedTrace.getSource().get(0);
			List<Trace> connectionTraces = RunnerHelper.getTraces(affectedTrace, TRACE_Connection, false);
			for(Trace connectionTrace : connectionTraces) {
				if(connectionTrace.getSource().size() > 0) {
					OperationRequiredRole operationRequiredRole = (OperationRequiredRole) connectionTrace.getSource().get(0);
					affectedComponent.getRequiredRoles_InterfaceRequiringEntity().remove(operationRequiredRole);
					EcoreUtil.delete((EObject) operationRequiredRole, false);
				}
			}
		}
		//Removing assembly connectors
		List<Trace> assemblyConnectors = RunnerHelper.getTraces(root, TRACE_AssemblyConnector, true);
		for(Trace trace : assemblyConnectors) {
			if(trace.getSource().size() > 0) {
				EObject oldAssemblyConnector = (EObject) trace.getSource().get(0);
				EcoreUtil.delete((EObject) oldAssemblyConnector, false);
			}
		}
		//EcoreUtil.delete((EObject) root, true);
	}
	
	public static void main(String[] args) {
		String dirPath = "src/edu/squat/transformations/modifiability/wrapper";
		String henshinFilename = "wrapper-modular.henshin";
		String repositoryFilename, systemFilename, resourceEnvironmentFilename, allocationFilename, usageFilename;
		String resultRepositoryFilename, resultSystemFilename, resultResourceEnvironmentFilename, resultAllocationFilename, resultUsageFilename;

		WrapperRunner runner = new WrapperRunner();
		
		//Individual testing
		repositoryFilename = "wrap-test.repository";
		resultRepositoryFilename = "wrap-test-" + "#REPLACEMENT#" + ".repository";
		//runner.run(dirPath, repositoryFilename, henshinFilename, resultRepositoryFilename, true);
		
		//Complete Individual testing
		repositoryFilename = "wrap-test.repository";
		systemFilename = "wrap-test.system";
		resourceEnvironmentFilename = "wrap-test.resourceenvironment";
		allocationFilename = "wrap-test.allocation";
		resultRepositoryFilename = "wrap-test-" + "#REPLACEMENT#" + ".repository";
		resultSystemFilename = "wrap-test-" + "#REPLACEMENT#" + ".system";
		resultResourceEnvironmentFilename = "wrap-test-" + "#REPLACEMENT#" + ".resourceenvironment";
		resultAllocationFilename = "wrap-test-" + "#REPLACEMENT#" + ".allocation";
		runner.run(dirPath, 
				repositoryFilename, systemFilename, resourceEnvironmentFilename, allocationFilename,
				henshinFilename, 
				resultRepositoryFilename, resultSystemFilename, resultResourceEnvironmentFilename, resultAllocationFilename,
				true);
		
		//Complete SimpleTactics+ testing
		repositoryFilename = "stplus.repository";
		systemFilename = "stplus.system";
		resourceEnvironmentFilename = "stplus.resourceenvironment";
		allocationFilename = "stplus.allocation";
		usageFilename = "stplus.usagemodel";
		resultRepositoryFilename = "stplus-" + "#REPLACEMENT#" + ".repository";
		resultSystemFilename = "stplus-" + "#REPLACEMENT#" + ".system";
		resultResourceEnvironmentFilename = "stplus-" + "#REPLACEMENT#" + ".resourceenvironment";
		resultAllocationFilename = "stplus-" + "#REPLACEMENT#" + ".allocation";
		resultUsageFilename = "stplus-" + "#REPLACEMENT#" + ".usagemodel";
		runner.run(dirPath, 
				repositoryFilename, systemFilename, resourceEnvironmentFilename, allocationFilename, usageFilename,
				henshinFilename, 
				resultRepositoryFilename, resultSystemFilename, resultResourceEnvironmentFilename, resultAllocationFilename, resultUsageFilename,
				true);
	}
}
