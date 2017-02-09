package io.github.squat_team.modifiability.kamp;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.core.entity.InterfaceProvidingEntity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.impl.BasicComponentImpl;
import org.palladiosimulator.pcm.repository.impl.OperationProvidedRoleImpl;

import edu.kit.ipd.sdq.kamp.core.Activity;
import edu.kit.ipd.sdq.kamp.core.ActivityElementType;
import edu.kit.ipd.sdq.kamp.core.ArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp.core.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.core.ArchitectureVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.model.ResponseMeasureType;
import io.github.squat_team.modifiability.ModifiabilityInstruction;
import io.github.squat_team.modifiability.ModifiabilityPCMScenario;

@SuppressWarnings("unused")
public class KAMPPCMBot extends AbstractPCMBot {
	public static String TYPE_ELEMENTS = "Elements";
	public static String TYPE_COMPLEXITY = "Complexity";
	public static String TYPE_EFFORT = "Effort";
	//
	protected ArchitectureVersion baseAV;
	protected ArchitectureVersion changedAV;
	//
	private String evaluationType = TYPE_COMPLEXITY;
	
	public KAMPPCMBot(PCMScenario scenario) {
		super(scenario);
	}
	
	public String getEvaluationType() {
		return evaluationType;
	}
	
	public void setEvaluationType(String evaluationType) {
		this.evaluationType = evaluationType;
	}

	@Override
	public PCMScenarioResult analyze(PCMArchitectureInstance currentArchitecture) {
		//Run the propagation and create the result
		PCMScenarioResult scenarioResult = new PCMScenarioResult(this);
		//Register the initial architecture
		//There is no tactic, because this is just an evaluation
		scenarioResult.setAppliedTactic(null);
		//The resulting architecture is just the original one, because we did not make changes
		scenarioResult.setResultingArchitecture(currentArchitecture);
		try {
			//First convert the base model
			ArchitectureVersionWrapper baseWrapper = new ArchitectureVersionWrapper(currentArchitecture);
			baseAV = baseWrapper.transformToKAMP();
			//Pessimistic approach for CIA - This could be configured from outside...
			ArchitectureModelFactoryFacade.setupComponentInternalDependenciesPessimistic(baseAV);
			
			//Second create the changed model
			ArchitectureVersionWrapper changedWrapper = new ArchitectureVersionWrapper(currentArchitecture);
			changedAV = changedWrapper.transformToKAMP();
			this.setupChangedModel();
			//Pessimistic approach for CIA - This could be configured from outside...
			ArchitectureModelFactoryFacade.setupComponentInternalDependenciesPessimistic(changedAV);
			
			//Run Change Impact Analyses
			List<Activity> activities = KAMPHeadlessRunner.runAnalysis(baseAV, changedAV);
			//Create the result
			PCMResult result = null;
			if(evaluationType.equals(TYPE_ELEMENTS)) {
				result = new PCMResult(ResponseMeasureType.NUMERIC);
				int changes = this.computeElementsReponse(activities);
				result.setResponse(new Integer(changes));
			}
			else if(evaluationType.equals(TYPE_COMPLEXITY)) {
				result = new PCMResult(ResponseMeasureType.DECIMAL);
				float complexity = this.computeComplexityReponse(activities);
				result.setResponse(new Float(complexity));
			}
			scenarioResult.setResult(result);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return scenarioResult;
	}

	private int computeElementsReponse(List<Activity> activities) {
		//We should define how we measure changes -> work hours, complexity, number of changes, etc.
		int numberOfChanges = 0;
		for (Activity activity : activities) {
			activity.getElement();
			activity.getElementType();
			numberOfChanges++;
			if (!activity.getSubactivities().isEmpty())
				numberOfChanges += computeElementsReponse(activity.getSubactivities());
			if (!activity.getFollowupActivities().isEmpty())
				numberOfChanges += computeElementsReponse(activity.getFollowupActivities());
		}
		return numberOfChanges;
	}
	
	private float computeComplexityReponse(List<Activity> activities) {
		//We compute the complexity of a component based on tje number of operations  
		float complexityResponse=0;
		for (Activity activity : activities) {
			if(activity.getElementType()==ActivityElementType.BASICCOMPONENT){
				
				BasicComponent component= (BasicComponent) activity.getElement();
				//System.out.println(component.getEntityName());
				float componentComplexity=getComplexityForComponent(component);
				if(componentIsMappedInScenario(component))
					complexityResponse=(float) (complexityResponse+Math.pow(componentComplexity, 2));
				else
					complexityResponse=(float) (complexityResponse+Math.pow(componentComplexity, 2)/2);
			}else{
				System.out.println(activity.getElementType().name());
				System.out.println("Implement this brach please");
			}
			
		}
		//BasicComponent basicComponent = (BasicComponent) ArchitectureModelLookup.lookUpComponentByName(changedAV, componentName);
		return complexityResponse;
	}
	
	private boolean componentIsMappedInScenario(BasicComponent component){
		ModifiabilityPCMScenario modifiabilityScenario=(ModifiabilityPCMScenario) scenario;
		for(ModifiabilityInstruction change : modifiabilityScenario.getChanges()){
			switch(change.element) {
				case COMPONENT:
					String componentName = change.parameters.get("name");
					BasicComponent basicComponent = ArchitectureModelFactoryFacade.createBasicComponent(changedAV, componentName);
					if(basicComponent==component)
						return true;
					break;
				case INTERFACE:
					String interfaceName = change.parameters.get("name");
					OperationInterface operationInterface = ArchitectureModelFactoryFacade.createInterface(changedAV, interfaceName);
					 //I'm not sure what we'll do when we map an interface instead of a component
					break;
			}
		}
		return false;
	}
	private int getComplexityForComponent(BasicComponent component){
		//For the moment I'm calculating the complexity of the component based on the number of operations in the interfaces provided
		System.out.println(component.getEntityName());
		int operations=0;
		EList roles=component.getProvidedRoles_InterfaceProvidingEntity();
		for (Iterator iterator = roles.iterator(); iterator.hasNext();) {
			OperationProvidedRole role = (OperationProvidedRole) iterator.next();
			for(OperationSignature signature : role.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface()){
				System.out.println(signature.getEntityName());
			}
			operations=operations+ role.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface().size();
		}
		return operations;
	}
	
	private void setupChangedModel() throws Exception {
		if(scenario == null)
			throw new Exception("Forgot to set scenario");
		if(!(scenario instanceof ModifiabilityPCMScenario))
			throw new Exception("Wrong scenario for a modifiability bot");
		ModifiabilityPCMScenario modifiabilityScenario = (ModifiabilityPCMScenario) scenario;
		for(ModifiabilityInstruction instruction : modifiabilityScenario.getChanges())
			this.handleOperation(instruction);
	}
	
	//It would be nice to use fabian's fluent interface here...anyways, there are things that need KAMP special models...internal modification marks and others
	private void handleOperation(ModifiabilityInstruction instruction) {
		switch(instruction.operation) {
		case CREATE:
			this.handleCreateElement(instruction);
			break;
		case DELETE:
			this.handleDeleteElement(instruction);
			break;
		case MODIFY:
			this.handleModifyElement(instruction);
			break;
		default:
			break;
		}
	}
	
	private void handleCreateElement(ModifiabilityInstruction instruction) {
		switch(instruction.element) {
		case ASSEMBLYCONNECTOR:
			break;
		case ASSEMBLYCONTEXT:
			break;
		case COMPONENT:
			String componentName = instruction.parameters.get("name");
			BasicComponent basicComponent = ArchitectureModelFactoryFacade.createBasicComponent(changedAV, componentName);
			break;
		case DATATYPE:
			break;
		case INTERFACE:
			String interfaceName = instruction.parameters.get("name");
			OperationInterface operationInterface = ArchitectureModelFactoryFacade.createInterface(changedAV, interfaceName);
			break;
		case OPERATION:
			break;
		case PARAMETER:
			break;
		case PROVIDEDROLE:
			break;
		case REQUIREDROLE:
			break;
		case SIGNATURE:
			break;
		default:
			break;
		}
	}
	
	private void handleDeleteElement(ModifiabilityInstruction instruction) {
		switch(instruction.element) {
		case ASSEMBLYCONNECTOR:
			break;
		case ASSEMBLYCONTEXT:
			break;
		case COMPONENT:
			String componentName = instruction.parameters.get("name");
			BasicComponent basicComponent = 
					(BasicComponent) ArchitectureModelLookup.lookUpComponentByName(changedAV, componentName);
			ArchitectureModelFactoryFacade.deleteComponentConnector(basicComponent);
			break;
		case DATATYPE:
			break;
		case INTERFACE:
			String interfaceName = instruction.parameters.get("name");
			OperationInterface operationInterface = 
					(OperationInterface) ArchitectureModelLookup.lookUpInterfaceByName(changedAV, interfaceName);
			//Not implemented in ArchitectureModelFactoryFacade
			EcoreUtil.delete(operationInterface);
			break;
		case OPERATION:
			break;
		case PARAMETER:
			break;
		case PROVIDEDROLE:
			break;
		case REQUIREDROLE:
			break;
		case SIGNATURE:
			break;
		default:
			break;
		}
	}
	
	private void handleModifyElement(ModifiabilityInstruction instruction) {
		switch(instruction.element) {
		case ASSEMBLYCONNECTOR:
			break;
		case ASSEMBLYCONTEXT:
			break;
		case COMPONENT:
			String componentName = instruction.parameters.get("name");
			BasicComponent basicComponent = 
					(BasicComponent) ArchitectureModelLookup.lookUpComponentByName(changedAV, componentName);
			ArchitectureModelFactoryFacade.assignInternalModificationMarkToComponent(changedAV, basicComponent);
			break;
		case DATATYPE:
			break;
		case INTERFACE:
			String interfaceName = instruction.parameters.get("name");
			OperationInterface operationInterface = 
					(OperationInterface) ArchitectureModelLookup.lookUpInterfaceByName(changedAV, interfaceName);
			ArchitectureModelFactoryFacade.assignInternalModificationMarkToInterface(changedAV, operationInterface);
			break;
		case OPERATION:
			break;
		case PARAMETER:
			break;
		case PROVIDEDROLE:
			break;
		case REQUIREDROLE:
			break;
		case SIGNATURE:
			break;
		default:
			break;
		}
	}

	@Override
	public List<PCMScenarioResult> searchForAlternatives(PCMArchitectureInstance currentArchitecture) {
		return null;
	}
}
