package edu.squat.transformations.modifiability.insinter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.LoopUnit;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.impl.LoopUnitImpl;
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
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.StartAction;
import org.palladiosimulator.pcm.seff.StopAction;

import edu.squat.transformations.modifiability.PCMTransformerRunner;
import edu.squat.transformations.modifiability.RunnerHelper;
import edu.squat.transformations.modifiability.Tactic;

@SuppressWarnings("unused")
public class InsInterRunner extends PCMTransformerRunner {
	private final static String TRACE_Left = "left";
	private final static String TRACE_Right = "right";
	private final static String TRACE_Match = "match";
	private final static String TRACE_Intermediate = "intermediate";
	private final static String TRACE_AssemblyContext = "assembly-cont";
	private final static String TRACE_AssemblyConnector = "assembly-conn";
	private final static String TRACE_AllocationContext = "allocation-cont";
	//
	private Engine engine;
	//
	private Rule markComponent2Isolate;
	private Rule createIntermediaryComponent;
	private Rule rewireComponents2Intermediary;
	private Rule removeDuplicateRequiredRoles;
	private Unit rewireComponents2IntermediaryLoop;
	private Unit removeDuplicateRequiredRolesLoop;
	
	public InsInterRunner() {
		super();
	}

	
	@Override
	public void loadRules() {
		markComponent2Isolate = (Rule) module.getUnit("markComponent2Isolate");
		//markComponents2Isolate.setCheckDangling(false);
		createIntermediaryComponent = (Rule) module.getUnit("createIntermediaryComponent");
		rewireComponents2Intermediary = (Rule) module.getUnit("rewireComponents2Intermediary");
		//rewireComponents2Intermediary.setCheckDangling(false);
		removeDuplicateRequiredRoles = (Rule) module.getUnit("removeDuplicateRequiredRoles");
		rewireComponents2IntermediaryLoop = module.getUnit("rewireComponents2IntermediaryLoop");
		removeDuplicateRequiredRolesLoop = module.getUnit("removeDuplicateRequiredRolesLoop");
	}
	
	
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
					
					if(this.arePerformanceModelsLoaded()) {
						//Adjust the system and allocation models by executing a monolithic method (ugly but fast)
						this.fixSystemAndAllocation(tempGraph, newComponent, newInterface, components, interfaces);
						//Clean up and delete old assembly connectors
						this.runLastRule(tempGraph);
					}
					
					//Store the results
					this.addTactic(null, tempGraph, null);
					if (saveResult) {
						RunnerHelper.saveRepositoryResult(
								resourceSet, 
								tempGraph, 
								resultRepositoryFilename.replace("#REPLACEMENT#", String.valueOf(counter) + "-" + interfacesName));
						if(this.arePerformanceModelsLoaded()) {
							RunnerHelper.saveSystemResult(
									resourceSet, 
									tempGraph, 
									resultSystemFilename.replace("#REPLACEMENT#", String.valueOf(counter) + "-" + interfacesName));
							RunnerHelper.saveResourceEnvironmentResult(
									resourceSet, 
									tempGraph, 
									resultResourceEnvironmentFilename.replace("#REPLACEMENT#", String.valueOf(counter) + "-" + interfacesName));
							RunnerHelper.saveAllocationResult(
									resourceSet, 
									tempGraph, 
									resultAllocationFilename.replace("#REPLACEMENT#", String.valueOf(counter) + "-" + interfacesName));
						}
						if(this.isUsageModelLoaded()) {
							RunnerHelper.saveUsageResult(
									resourceSet, 
									tempGraph, 
									resultUsageFilename.replace("#REPLACEMENT#", String.valueOf(counter) + "-" + interfacesName));
						}
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
	
	private void fixSystemAndAllocation(EGraph graph, BasicComponent intermediateComponent, OperationInterface intermediateInterface, List<BasicComponent> components, List<OperationInterface> interfaces) {
		Trace traceRoot = RunnerHelper.getTraceRoot(graph);
		org.palladiosimulator.pcm.system.System systemRoot = RunnerHelper.getSystemRoot(graph);
		
		//Create the assembly context
		AssemblyContext intermediateAssemblyContext = CompositionFactory.eINSTANCE.createAssemblyContext();
		intermediateAssemblyContext.setEncapsulatedComponent__AssemblyContext(intermediateComponent);
		intermediateAssemblyContext.setEntityName(RunnerHelper.getAssemblyContextName(intermediateComponent));
		systemRoot.getAssemblyContexts__ComposedStructure().add(intermediateAssemblyContext);
		Trace assemblyContextTrace = TraceFactory.eINSTANCE.createTrace();
		assemblyContextTrace.setName(TRACE_AssemblyContext);
		//assemblyContextTrace.getSource().add(null);
		assemblyContextTrace.getTarget().add((EObject) intermediateAssemblyContext);
		traceRoot.getSubTraces().add(assemblyContextTrace);
		
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
				OperationProvidedRole providedRole = oldConnector.getProvidedRole_AssemblyConnector();
				//OperationRequiredRole requiredRole = oldConnector.getRequiredRole_AssemblyConnector();
				
				if(components.contains(providingComponent) && components.contains(requiringComponent)) {
					if(
							interfaces.contains(providedRole.getProvidedInterface__OperationProvidedRole()) 
							//&& interfaces.contains(requiredRole.getRequiredInterface__OperationRequiredRole())
							) {
						AssemblyConnector intermediateConnector = CompositionFactory.eINSTANCE.createAssemblyConnector();
						intermediateConnector.setEntityName(RunnerHelper.getAssemblyConnectorName(requiringAssemblyContext, intermediateAssemblyContext));
						intermediateConnector.setProvidingAssemblyContext_AssemblyConnector(intermediateAssemblyContext);
						intermediateConnector.setRequiringAssemblyContext_AssemblyConnector(requiringAssemblyContext);
						OperationProvidedRole intermediateProvidedRole = RunnerHelper.findProvidedRole(intermediateComponent, intermediateInterface);
						OperationRequiredRole intermediateRequiredRole = RunnerHelper.findRequiredRole(requiringComponent, intermediateInterface);
						intermediateConnector.setProvidedRole_AssemblyConnector(intermediateProvidedRole);
						intermediateConnector.setRequiredRole_AssemblyConnector(intermediateRequiredRole);
						connectorsToAdd.add(intermediateConnector);
						//
						Trace connectorTrace = TraceFactory.eINSTANCE.createTrace();
						connectorTrace.setName(TRACE_AssemblyConnector);
						connectorTrace.getSource().add((EObject) oldConnector);
						connectorTrace.getTarget().add((EObject) intermediateConnector);
						traceRoot.getSubTraces().add(connectorTrace);
					}
				}
			}
		}
		//Create new assembly connectors for required interfaces from the intermediate
		for(RequiredRole requiredRole : intermediateComponent.getRequiredRoles_InterfaceRequiringEntity()) {
			if(requiredRole instanceof OperationRequiredRole) {
				OperationRequiredRole requiringRole = (OperationRequiredRole) requiredRole;
				OperationInterface requiredInterface = requiringRole.getRequiredInterface__OperationRequiredRole();
				BasicComponent providingComponent = null;
				OperationProvidedRole providingRole = null;
				Iterator<BasicComponent> componentIterator = components.iterator();
				while(componentIterator.hasNext() && providingComponent == null && providingRole == null) {
					BasicComponent component = componentIterator.next();
					Iterator<ProvidedRole> providedRoleIterator = component.getProvidedRoles_InterfaceProvidingEntity().iterator();
					while(providedRoleIterator.hasNext() && providingComponent == null && providingRole == null) {
						ProvidedRole providedRole = providedRoleIterator.next();
						if(providedRole instanceof OperationProvidedRole) {
							OperationProvidedRole operationProvidedRole = (OperationProvidedRole) providedRole;
							if(operationProvidedRole.getProvidedInterface__OperationProvidedRole().equals(requiredInterface)) {
								providingComponent = component;
								providingRole = operationProvidedRole;
							}
						}
					}
				}
				List<AssemblyContext> providingAssemblyContexts = RunnerHelper.findAssemblyContexts(providingComponent, systemRoot);
				for(AssemblyContext providingAssemblyContext : providingAssemblyContexts) {
					AssemblyConnector newConnector = CompositionFactory.eINSTANCE.createAssemblyConnector();
					newConnector.setEntityName(RunnerHelper.getAssemblyConnectorName(intermediateAssemblyContext, providingAssemblyContext));
					newConnector.setProvidingAssemblyContext_AssemblyConnector(providingAssemblyContext);
					newConnector.setRequiringAssemblyContext_AssemblyConnector(intermediateAssemblyContext);
					newConnector.setProvidedRole_AssemblyConnector(providingRole);
					newConnector.setRequiredRole_AssemblyConnector(requiringRole);
					connectorsToAdd.add(newConnector);
					//
					Trace connectorTrace = TraceFactory.eINSTANCE.createTrace();
					connectorTrace.setName(TRACE_AssemblyConnector);
					//connectorTrace.getSource().add(null);
					connectorTrace.getTarget().add((EObject) newConnector);
					traceRoot.getSubTraces().add(connectorTrace);
				}
				
			}
		}
		//Add all the connectors to the system model
		systemRoot.getConnectors__ComposedStructure().addAll(connectorsToAdd);
		//Filter duplicated connections
		List<AssemblyConnector> duplicatedConnectors = new ArrayList<AssemblyConnector>();
		for(int i = 0; i < systemRoot.getConnectors__ComposedStructure().size() - 1; i++) {
			Connector connectorI = systemRoot.getConnectors__ComposedStructure().get(i);
			if(connectorI instanceof AssemblyConnector) {
				AssemblyConnector assemblyConnectorI = (AssemblyConnector) connectorI;
				for(int j = i + 1; j < systemRoot.getConnectors__ComposedStructure().size() && !duplicatedConnectors.contains(assemblyConnectorI); j++) {
					Connector connectorJ = systemRoot.getConnectors__ComposedStructure().get(j);
					if(connectorJ instanceof AssemblyConnector) {
						AssemblyConnector assemblyConnectorJ = (AssemblyConnector) connectorJ;
						if(this.isDuplicated(assemblyConnectorI, assemblyConnectorJ)) {
							duplicatedConnectors.add(assemblyConnectorJ);
						}
					}
				}
			}
		}
		systemRoot.getConnectors__ComposedStructure().removeAll(duplicatedConnectors);
		//Find the first resource allocated to a assembly context
		Allocation allocationRoot = RunnerHelper.getAllocationRoot(graph);
		Map<ResourceContainer, Integer> counter = new HashMap<ResourceContainer, Integer>();
		for(BasicComponent component : components) {
			List<AssemblyContext> assemblyContexts = RunnerHelper.findAssemblyContexts(component, systemRoot);
			for(AssemblyContext assemblyContext : assemblyContexts) {
				ResourceContainer resourceContainer = RunnerHelper.findAllocationResourceContainer(assemblyContext, allocationRoot);
				if(counter.containsKey(resourceContainer))
					counter.put(resourceContainer, counter.get(resourceContainer) + 1);
				else
					counter.put(resourceContainer, 1);
			}
		}
		//Allocate the assembly context to the resource with lower allocated resources
		ResourceContainer bestContainer = null;
		int minAllocation = Integer.MAX_VALUE;
		for(ResourceContainer resourceContainer : counter.keySet()) {
			if(bestContainer == null || counter.get(resourceContainer) < minAllocation) {
				bestContainer = resourceContainer;
				minAllocation = counter.get(resourceContainer);
			}
		}
		AllocationContext intermediateAllocationContext = AllocationFactory.eINSTANCE.createAllocationContext();
		intermediateAllocationContext.setEntityName(RunnerHelper.getAllocationContextName(intermediateAssemblyContext));
		intermediateAllocationContext.setAssemblyContext_AllocationContext(intermediateAssemblyContext);
		intermediateAllocationContext.setResourceContainer_AllocationContext(bestContainer);
		allocationRoot.getAllocationContexts_Allocation().add(intermediateAllocationContext);
		//
		Trace allocationTrace = TraceFactory.eINSTANCE.createTrace();
		allocationTrace.setName(TRACE_AllocationContext);
		//allocationTrace.getSource().add(null);
		allocationTrace.getTarget().add((EObject) intermediateAllocationContext);
		traceRoot.getSubTraces().add(allocationTrace);
	}

	private boolean isDuplicated(AssemblyConnector assemblyConnectorI, AssemblyConnector assemblyConnectorJ) {
		return 
				assemblyConnectorI.getProvidingAssemblyContext_AssemblyConnector().equals(assemblyConnectorJ.getProvidingAssemblyContext_AssemblyConnector()) &&
				assemblyConnectorI.getRequiringAssemblyContext_AssemblyConnector().equals(assemblyConnectorJ.getRequiringAssemblyContext_AssemblyConnector()) &&
				assemblyConnectorI.getProvidedRole_AssemblyConnector().equals(assemblyConnectorJ.getProvidedRole_AssemblyConnector()) &&
				assemblyConnectorI.getRequiredRole_AssemblyConnector().equals(assemblyConnectorJ.getRequiredRole_AssemblyConnector());
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
		//TODO: Create external invocation in SEFF
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
		UnitApplication app = new UnitApplicationImpl(engine);
		app.setEGraph(graph);
		app.setUnit(rewireComponents2IntermediaryLoop);
		boolean success = app.execute(monitor);
		if(success)
			System.out.println("Successfully reconnected existing components to the intermediate component and intermediate interface");
		else
			System.out.println("Could not reconnect existing components to the intermediate component and intermediate interface");
		return app;
	}


	private UnitApplication runFourthRule(EGraph graph) {
		UnitApplication app = new UnitApplicationImpl(engine);
		app.setEGraph(graph);
		app.setUnit(removeDuplicateRequiredRolesLoop);
		boolean success = app.execute(monitor);
		if(success)
			System.out.println("Successfully removed duplicate required roles");
		else
			System.out.println("Could not remove duplicate required roles");
		return app;
	}
	
	private void runLastRule(EGraph graph) {
		//Removing all the traces
		Trace root = RunnerHelper.getTraceRoot(graph);
		List<Trace> assemblyConnectors = RunnerHelper.getTraces(root, TRACE_AssemblyConnector, true);
		for(Trace trace : assemblyConnectors) {
			if(trace.getSource().size() > 0) {
				EObject oldAssemblyConnector = (EObject) trace.getSource().get(0);
				EcoreUtil.delete((EObject) oldAssemblyConnector, false);
			}
		}
		//EcoreUtil.delete((EObject) root, true);
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
		String repositoryFilename, systemFilename, resourceEnvironmentFilename, allocationFilename, usageFilename;
		String resultRepositoryFilename, resultSystemFilename, resultResourceEnvironmentFilename, resultAllocationFilename, resultUsageFilename;

		InsInterRunner runner = new InsInterRunner();

		//Individual testing
		repositoryFilename = "insert-test.repository";
		resultRepositoryFilename = "insert-test-" + "#REPLACEMENT#" + ".repository";
		//runner.run(dirPath, repositoryFilename, henshinFilename, resultRepositoryFilename, true);
		
		//Multiple testing
		repositoryFilename = "insert-mult.repository";
		resultRepositoryFilename = "insert-mult-" + "#REPLACEMENT#" + ".repository";
		//runner.run(dirPath, repositoryFilename, henshinFilename, resultRepositoryFilename, true);
		
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
		
		//Complete Individual testing
		repositoryFilename = "insert-test.repository";
		systemFilename = "insert-test.system";
		resourceEnvironmentFilename = "insert-test.resourceenvironment";
		allocationFilename = "insert-test.allocation";
		resultRepositoryFilename = "insert-test-" + "#REPLACEMENT#" + ".repository";
		resultSystemFilename = "insert-test-" + "#REPLACEMENT#" + ".system";
		resultResourceEnvironmentFilename = "insert-test-" + "#REPLACEMENT#" + ".resourceenvironment";
		resultAllocationFilename = "insert-test-" + "#REPLACEMENT#" + ".allocation";
		runner.run(dirPath, 
				repositoryFilename, systemFilename, resourceEnvironmentFilename, allocationFilename,
				henshinFilename, 
				resultRepositoryFilename, resultSystemFilename, resultResourceEnvironmentFilename, resultAllocationFilename,
				true);
	}
}
