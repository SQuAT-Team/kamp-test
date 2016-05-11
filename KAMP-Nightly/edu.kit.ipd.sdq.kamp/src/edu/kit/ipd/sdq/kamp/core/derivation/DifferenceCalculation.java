package edu.kit.ipd.sdq.kamp.core.derivation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.dsig.Reference;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.diff.*;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.InnerDeclaration;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Signature;
import edu.kit.ipd.sdq.kamp.core.Activity;
import edu.kit.ipd.sdq.kamp.core.ActivityElementType;
import edu.kit.ipd.sdq.kamp.core.ActivityType;
import edu.kit.ipd.sdq.kamp.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp.core.BasicActivity;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyProvidedRole;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifySignature;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;


public class DifferenceCalculation {
	public static List<Diff> calculateDiffModel(EObject source, EObject target) {
		IComparisonScope scope = new DefaultComparisonScope(target, source, null);
		Comparison comparison = EMFCompare.builder().build().compare(scope);

		List<Diff> differences = comparison.getDifferences();
				
		return differences;
	}
	

/*	
	public static boolean checkModelElementChangeLeftTarget(Diff diffElements, Class leftElementType) {
		if (leftElementType.isInstance( diffElements.getMatch().getLeft())) 
			return true;		
		return false;
	}
	
	*/
	
	public static boolean checkModelElement(Diff diffElements, Class leftElementType) {
		if (leftElementType.isInstance(((ReferenceChange)diffElements).getValue())) 
			return true;		
		return false;
	}
	
	public static boolean checkUpdateReference(Diff diffElements, Class leftElementType, Class leftTargetType) {
		if ((leftElementType.isInstance( diffElements.getMatch().getLeft())) && (leftTargetType.isInstance( diffElements.getMatch().getLeft()))) 
			return true;
		
		return false;
	}
	
	public static boolean detectionRuleAddedBasicComponent(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.ADD && checkModelElement(diffElements, BasicComponent.class))
				return true;
		return false;
	}
	
	public static boolean detectionRuleDeletedBasicComponent(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.DELETE && checkModelElement(diffElements, BasicComponent.class))
				return true;
		return false;
	}
	
	public static boolean detectionRuleAddedInterface(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.ADD && checkModelElement(diffElements, OperationInterface.class))
				return true;
		return false;
	}
	
	public static boolean detectionRuleDeletedInterface(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.DELETE && checkModelElement(diffElements, OperationInterface.class))
				return true;
		return false;
	}
	
	public static boolean detectionRuleAddedSignature(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.ADD && checkModelElement(diffElements, OperationSignature.class))
				return true;
		return false;
	}
	
	
/*			 
	public static boolean detectionRuleAddedSignature(Diff diffElements) {
		if (diffElements instanceof ReferenceChange  && diffElements.getSource()==DifferenceSource.LEFT)
			if(diffElements.getKind() != DifferenceKind.DELETE && checkModelElementChangeRightTarget(diffElements, OperationSignature.class))
				return true;
		return false;
	}
	*/
	
	public static boolean detectionRuleDeletedSignature(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.DELETE && checkModelElement(diffElements, OperationSignature.class))
				return true;
		return false;
	}
	
	public static boolean detectionRuleAddedParameter(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.ADD && checkModelElement(diffElements, Parameter.class))
				return true;
		return false;
	}
	
	public static boolean detectionRuleDeletedParameter(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.DELETE && checkModelElement(diffElements, Parameter.class))
				return true;
		return false;
	}
	
	public static boolean detectionRuleAddedProvidedRole(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.ADD && checkModelElement(diffElements, OperationProvidedRole.class))
				return true;
		return false;
	}
	
	public static boolean detectionRuleDeletedProvidedRole(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.DELETE && checkModelElement(diffElements, OperationProvidedRole.class))
				return true;
		return false;
	}
	
	public static boolean detectionRuleAddedRequiredRole(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.ADD && checkModelElement(diffElements, OperationRequiredRole.class))
				return true;
		return false;
	}
	
	public static boolean detectionRuleDeletedRequiredRole(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.DELETE && checkModelElement(diffElements, OperationRequiredRole.class))
				return true;
		return false;
	}
	
	public static boolean detectionRuleDeletedInterfaceForProvidedRole(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.CHANGE && checkUpdateReference(diffElements, ProvidedRole.class, OperationInterface.class))
				return true;
		return false;
	}
	
	public static boolean detectionRuleDeletedInterfaceForRequiredRole(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.CHANGE && checkUpdateReference(diffElements, RequiredRole.class, OperationInterface.class))
				return true;
		return false;
	}
	
	public static List<Diff> foundAddedBasicComponent(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleAddedBasicComponent(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}
	
	public static List<Diff> foundAddedInterface(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleAddedInterface(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}
	
	public static List<Diff> foundDeletedBasicComponent(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleDeletedBasicComponent(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static List<Diff> foundDeletedInterface(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleDeletedInterface(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static List<Diff> foundAddedSignature(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleAddedSignature(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static List<Diff> foundDeletedSignature(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleDeletedSignature(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}
	
	public static List<Diff> foundAddedParameter(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleAddedParameter(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static List<Diff> foundDeletedParameter(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleDeletedParameter(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}


	public static List<Diff> foundDeletedInterfaceForProvidedRole(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleDeletedInterfaceForProvidedRole(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static List<Diff> foundDeletedInterfaceForRequiredRole(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleDeletedInterfaceForRequiredRole(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static List<Diff> foundAddedProvidedRole(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleAddedProvidedRole(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}
	
	public static List<Diff> foundAddedRequiredRole(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleAddedRequiredRole(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}
	
	public static List<Diff> foundDeletedProvidedRole(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleDeletedProvidedRole(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static List<Diff> foundDeletedRequiredRole(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleDeletedRequiredRole(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static List<Activity> deriveBaseWorkPlan(List<Diff> diff) {
		List<Activity> workplan = new ArrayList<Activity>();
		
		for (Diff diffElement : diff) {
			
				// INTERFACE + 
			if (detectionRuleAddedInterface(diffElement)) {
				//EObject changed = diffElement.getMatch().getLeft();	
				EObject changed = ((ReferenceChange)diffElement).getValue();
				OperationInterface architectureElement = (OperationInterface)(changed);
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.INTERFACE, architectureElement.getEntityName(), BasicActivity.ADD, 
						"F�ge Schnittstelle "+architectureElement.getEntityName()+" hinzu.");
				workplan.add(newActivity);
				newActivity.addSubactivities(SubactivityDerivation.deriveSubactivities(architectureElement, BasicActivity.ADD));
			
				// INTERFACE -
			} else if (detectionRuleDeletedInterface(diffElement)) {
				EObject changed = ((ReferenceChange)diffElement).getValue();
				OperationInterface architectureElement = (OperationInterface)(changed);
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.INTERFACE, architectureElement.getEntityName(), BasicActivity.REMOVE, 
						"Entferne Schnittstelle "+architectureElement.getEntityName()+".");
				workplan.add(newActivity);
				newActivity.addSubactivities(SubactivityDerivation.deriveSubactivities(architectureElement, BasicActivity.REMOVE));

				// SIGNATURE +
			} else if (detectionRuleAddedSignature(diffElement)) {

				// SIGNATURE -
			} else if (detectionRuleDeletedSignature(diffElement)) {

				// PARAMETER +
			} else if (detectionRuleAddedParameter(diffElement)) {
				
				// PARAMETER -
			} else if (detectionRuleDeletedParameter(diffElement)) {
		    
			    // COLLECTION-DATATYPE +
			} else if (detectionRuleAddedCollectionDatatype(diffElement)) {
				//EObject changed = diffElement.getMatch().getLeft();	
				EObject changed = ((ReferenceChange)diffElement).getValue();
				CollectionDataType architectureElement = (CollectionDataType)(changed);
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.COLLECTIONDATATYPE, architectureElement.getEntityName(), BasicActivity.ADD, 
						"F�ge Kollektions-Datentyp "+architectureElement.getEntityName()+" hinzu.");
				workplan.add(newActivity);

				// COLLECTION-DATATYPE -
			} else if (detectionRuleRemovedCollectionDatatype(diffElement)) {
				EObject changed = ((ReferenceChange)diffElement).getValue();
				CollectionDataType architectureElement = (CollectionDataType)(changed);
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.COLLECTIONDATATYPE, architectureElement.getEntityName(), BasicActivity.REMOVE, 
						"Entferne Kollektions-Datentyp "+architectureElement.getEntityName()+".");
				workplan.add(newActivity);
				
				// COMPOSITE-DATATYPE +
			} else if (detectionRuleAddedCompositeDatatype(diffElement)) {				
				//EObject changed = diffElement.getMatch().getLeft();	
				EObject changed = ((ReferenceChange)diffElement).getValue();
				CompositeDataType architectureElement = (CompositeDataType)(changed);
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.COMPOSITEDATATYPE, architectureElement.getEntityName(), BasicActivity.ADD, 
						"F�ge Komposit-Datentyp "+architectureElement.getEntityName()+" hinzu.");
				workplan.add(newActivity);

				// COMPOSITE-DATATYPE -
			} else if (detectionRuleRemovedCompositeDatatype(diffElement)) {
				EObject changed = ((ReferenceChange)diffElement).getValue();
				CompositeDataType architectureElement = (CompositeDataType)(changed);
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.COMPOSITEDATATYPE, architectureElement.getEntityName(), BasicActivity.REMOVE, 
						"Entferne Komposit-Datentyp "+architectureElement.getEntityName()+".");
				workplan.add(newActivity);
				
				// INNERDECLARATION +
			} else if (detectionRuleAddedInnerDeclaration(diffElement)) {
				//EObject changed = diffElement.getMatch().getLeft();
				EObject changed = ((ReferenceChange)diffElement).getValue();
				InnerDeclaration architectureElement = (InnerDeclaration) (changed);
				CompositeDataType datatype = architectureElement.getCompositeDataType_InnerDeclaration();
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.COMPOSITECOMPONENT, datatype.getEntityName(), BasicActivity.MODIFY, 
						"F�ge innere Deklaration zu Komposit-Datentyp "+datatype.getEntityName()+" hinzu.");
				workplan.add(newActivity);
				
				// INNERDECLARATION -
			} else if (detectionRuleRemovedInnerDeclaration(diffElement)) {
				EObject changed = ((ReferenceChange)diffElement).getValue();
				InnerDeclaration architectureElement = (InnerDeclaration) (changed);
				CompositeDataType datatype = architectureElement.getCompositeDataType_InnerDeclaration();
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.COMPOSITECOMPONENT, datatype.getEntityName(), BasicActivity.MODIFY, 
						"Entferne innere Deklaration von Komposit-Datentyp "+datatype.getEntityName()+".");
				workplan.add(newActivity);
				
				// BASIC-COMPONENT +
			} else if (detectionRuleAddedBasicComponent(diffElement)) {
				//EObject changed = diffElement.getMatch().getLeft();	
				EObject changed = ((ReferenceChange)diffElement).getValue();
				BasicComponent architectureElement = (BasicComponent) (changed);
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.BASICCOMPONENT, architectureElement.getEntityName(), BasicActivity.ADD, 
						"F�ge Basis-Komponente "+architectureElement.getEntityName()+" hinzu.");
				workplan.add(newActivity);
				newActivity.addSubactivities(SubactivityDerivation.deriveSubactivities(architectureElement, BasicActivity.ADD));
				
				// BASIC-COMPONENT -
			} else if (detectionRuleDeletedBasicComponent(diffElement)) {
				EObject changed = ((ReferenceChange)diffElement).getValue();
				BasicComponent architectureElement = (BasicComponent) (changed);
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.BASICCOMPONENT, architectureElement.getEntityName(), BasicActivity.REMOVE, 
						"Entferne Basis-Komponente "+architectureElement.getEntityName()+".");
				workplan.add(newActivity);
				newActivity.addSubactivities(SubactivityDerivation.deriveSubactivities(architectureElement, BasicActivity.REMOVE));
				
				// COMPOSITE-COMPONENT +
			} else if (detectionRuleAddedCompositeComponent(diffElement)) {
				//EObject changed = diffElement.getMatch().getLeft();	
				EObject changed = ((ReferenceChange)diffElement).getValue();
				CompositeComponent architectureElement = (CompositeComponent) (changed);
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.COMPOSITECOMPONENT, architectureElement.getEntityName(), BasicActivity.ADD, 
						"F�ge Komposit-Komponente "+architectureElement.getEntityName()+" hinzu.");
				workplan.add(newActivity);
				newActivity.addSubactivities(SubactivityDerivation.deriveSubactivities(architectureElement, BasicActivity.ADD));
				
				// COMPOSITE-COMPONENT -
			} else if (detectionRuleDeletedCompositeComponent(diffElement)) {
				EObject changed = ((ReferenceChange)diffElement).getValue();
				CompositeComponent architectureElement = (CompositeComponent) (changed);
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.COMPOSITECOMPONENT, architectureElement.getEntityName(), BasicActivity.REMOVE, 
						"Entferne Komposit-Komponente "+architectureElement.getEntityName()+".");
				workplan.add(newActivity);
				newActivity.addSubactivities(SubactivityDerivation.deriveSubactivities(architectureElement, BasicActivity.REMOVE));
			
				// PROVIDED-ROLE +
			} else if (detectionRuleAddedProvidedRole(diffElement)) {
				//EObject changed = diffElement.getMatch().getLeft();	
				EObject changed = ((ReferenceChange)diffElement).getValue();
				OperationProvidedRole architectureElement = (OperationProvidedRole)(changed);
				
				String componentName = architectureElement.getProvidingEntity_ProvidedRole().getEntityName();
				
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.PROVIDEDROLE, architectureElement.getEntityName(), BasicActivity.ADD, 
						"F�ge Schnittstellenangebot "+architectureElement.getEntityName()+" zu Komponente "+componentName+" hinzu.");
				workplan.add(newActivity);
				newActivity.addSubactivities(SubactivityDerivation.deriveSubactivities(architectureElement, BasicActivity.ADD));

				// PROVIDED-ROLE -
			} else if (detectionRuleDeletedProvidedRole(diffElement)) {
				EObject changed = ((ReferenceChange)diffElement).getValue();
				OperationProvidedRole architectureElement = (OperationProvidedRole)(changed);
				String componentName = architectureElement.getProvidingEntity_ProvidedRole().getEntityName();
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.PROVIDEDROLE, architectureElement.getEntityName(), BasicActivity.REMOVE, 
						"Entferne Schnittstellenangebot "+architectureElement.getEntityName()+" von Komponente "+componentName+".");
				workplan.add(newActivity);
				newActivity.addSubactivities(SubactivityDerivation.deriveSubactivities(architectureElement, BasicActivity.REMOVE));

				// REQUIRED-ROLE + 
			} else if (detectionRuleAddedRequiredRole(diffElement)) {
				//EObject changed = diffElement.getMatch().getLeft();	
				EObject changed = ((ReferenceChange)diffElement).getValue();
				OperationRequiredRole architectureElement = (OperationRequiredRole)(changed);
				String componentName = architectureElement.getRequiringEntity_RequiredRole().getEntityName();
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.REQUIREDROLE, architectureElement.getEntityName(), BasicActivity.ADD, 
						"F�ge Schnittstellennachfrage "+architectureElement.getEntityName()+" zu Komponente "+componentName+" hinzu.");
				workplan.add(newActivity);
				newActivity.addSubactivities(SubactivityDerivation.deriveSubactivities(architectureElement, BasicActivity.ADD));

				// REQUIRED-ROLE - 
			} else if (detectionRuleDeletedRequiredRole(diffElement)) {
				EObject changed = ((ReferenceChange)diffElement).getValue();
				OperationRequiredRole architectureElement = (OperationRequiredRole)(changed);
				String componentName = architectureElement.getRequiringEntity_RequiredRole().getEntityName();
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.REQUIREDROLE, architectureElement.getEntityName(), BasicActivity.REMOVE, 
						"Entferne Schnittstellennachfrage "+architectureElement.getEntityName()+" von Komponente "+componentName+".");
				workplan.add(newActivity);
				newActivity.addSubactivities(SubactivityDerivation.deriveSubactivities(architectureElement, BasicActivity.REMOVE));

				// ASSEMBLY-CONNECTOR +
			} else if (detectionRuleAddedAssemblyConnector(diffElement)) {
				//EObject changed = diffElement.getMatch().getLeft();	
				EObject changed = ((ReferenceChange)diffElement).getValue();
				AssemblyConnector architectureElement = (AssemblyConnector)(changed);
				
				String desc = calculateDescriptionForAssemblyConnector(architectureElement);
				
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.ASSEMBLYCONNECTOR, architectureElement.getEntityName(), BasicActivity.ADD, 
						"F�ge Assemblierungskonnektor ("+desc+") hinzu.");
				workplan.add(newActivity);
			    
				// ASSEMBLY-CONNECTOR -
			} else if (detectionRuleRemovedAssemblyConnector(diffElement)) {
				EObject changed = ((ReferenceChange)diffElement).getValue();
				AssemblyConnector architectureElement = (AssemblyConnector)(changed);
				String desc = calculateDescriptionForAssemblyConnector(architectureElement);
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, ActivityElementType.ASSEMBLYCONNECTOR, architectureElement.getEntityName(), BasicActivity.REMOVE, 
						"Entferne Assemblierungskonnektor ("+desc+").");
				workplan.add(newActivity);
			}
		} 
	
		return workplan;
	}

	private static String calculateDescriptionForAssemblyConnector(
			AssemblyConnector architectureElement) {
		String desc = architectureElement.getProvidingAssemblyContext_AssemblyConnector().getEntityName() + "." +
		architectureElement.getProvidedRole_AssemblyConnector().getEntityName() + " -> "+
		architectureElement.getRequiringAssemblyContext_AssemblyConnector().getEntityName() + "." +
		architectureElement.getRequiredRole_AssemblyConnector().getEntityName();
		return desc;
	}
	
	
//	private static EObject getReferenceTarget(DiffElement diffElement) {
//		
//		if (diffElement instanceof UpdateReference) {
//			return ((UpdateReference)diffElement).getLeftTarget();
//		} else if (diffElement instanceof ModelElementChangeLeftTarget) {
//			return ((ModelElementChangeLeftTarget)diffElement).getLeftElement();
//		}
//		
//		return null;
//	}

	public static List<Diff> foundAddedAssemblyConnector(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleAddedAssemblyConnector(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static List<Diff> foundRemovedAssemblyConnector(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleRemovedAssemblyConnector(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static boolean detectionRuleAddedAssemblyConnector(
			Diff diffElements) {
		if (diffElements instanceof ReferenceChange && checkModelElement(diffElements, AssemblyConnector.class))
			if(diffElements.getKind() == DifferenceKind.ADD)
				return true;
		return false;
	}

	public static boolean detectionRuleRemovedAssemblyConnector(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.DELETE && checkModelElement(diffElements, AssemblyConnector.class))
				return true;
		return false;
	}

	public static List<Activity> deriveWorkplan(
			ArchitectureVersion baseVersion,
			ArchitectureVersion targetVersion) {
		List<Activity> activityList = new ArrayList<Activity>();
		
		List<Diff> repositoryDiff = calculateDiffModel(baseVersion.getRepository(), targetVersion.getRepository());
		List<Diff> systemDiff = calculateDiffModel(baseVersion.getSystem(), targetVersion.getSystem());

		List<Activity> repositoryActivities = deriveBaseWorkPlan(repositoryDiff);
		activityList.addAll(repositoryActivities);

		List<Activity> systemActivities = deriveBaseWorkPlan(systemDiff);
		activityList.addAll(systemActivities);

		List<Activity> internalModificationActivities = InternalModificationDerivation.deriveInternalModifications(targetVersion);
		activityList.addAll(internalModificationActivities);
		
		return activityList;
	}

	
	public static List<Diff> foundAddedCollectionDatatype(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleAddedCollectionDatatype(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;	}

	private static boolean detectionRuleAddedCollectionDatatype(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.ADD && checkModelElement(diffElements, CollectionDataType.class))
				return true;
		return false;
	}

	public static List<Diff> foundAddedCompositeDatatype(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleAddedCompositeDatatype(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;	
	}

	private static boolean detectionRuleAddedCompositeDatatype(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.ADD && checkModelElement(diffElements, CompositeDataType.class))
				return true;
		return false;
	}
	
	public static List<Diff> foundDeletedCollectionDatatype(
			List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleRemovedCollectionDatatype(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static boolean detectionRuleRemovedCollectionDatatype(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.DELETE && checkModelElement(diffElements, CollectionDataType.class))
				return true;
		return false;
	}

	
	public static List<Diff> foundDeletedCompositeDatatype(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleRemovedCompositeDatatype(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static boolean detectionRuleRemovedCompositeDatatype(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.DELETE && checkModelElement(diffElements, CompositeDataType.class))
				return true;
		return false;
	}

	public static List<Diff> foundAddedInnerDeclarationOfCompositeDatatype(
			List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleAddedInnerDeclaration(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	public static List<Diff> foundDeletedInnerDeclarationOfCompositeDatatype(
			List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleRemovedInnerDeclaration(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	private static boolean detectionRuleAddedInnerDeclaration(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.ADD  && checkModelElement(diffElements, InnerDeclaration.class))
				return true;
		return false;
	}	

	public static boolean detectionRuleRemovedInnerDeclaration(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.DELETE && checkModelElement(diffElements, InnerDeclaration.class))
				return true;
		return false;
	}

	public static List<Diff> foundAddedCompositeComponent(List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleAddedCompositeComponent(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}


	private static boolean detectionRuleAddedCompositeComponent(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.ADD && checkModelElement(diffElements, CompositeComponent.class))
				return true;
		return false;
	}

	public static List<Diff> foundDeletedCompositeComponent(
			List<Diff> diff) {
		List<Diff> result = new ArrayList<Diff>();
		for (Diff diffElement : diff) {
			if (detectionRuleDeletedCompositeComponent(diffElement)) {
				result.add(diffElement);
			}
		} 
		return result;
	}

	private static boolean detectionRuleDeletedCompositeComponent(Diff diffElements) {
		if (diffElements instanceof ReferenceChange)
			if(diffElements.getKind() == DifferenceKind.DELETE && checkModelElement(diffElements, CompositeComponent.class))
				return true;
		return false;
	}


}
