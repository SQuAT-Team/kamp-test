package edu.squat.headlesskamp;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.system.SystemPackage;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage;
import de.uka.ipd.sdq.internalmodificationmark.InternalmodificationmarkPackage;
import edu.kit.ipd.sdq.kamp.core.Activity;
import edu.kit.ipd.sdq.kamp.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp.core.ChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp.core.derivation.DifferenceCalculation;
import edu.kit.ipd.sdq.kamp.core.derivation.EnrichedWorkplanDerivation;

public abstract class AbstractKAMPTest {
	protected ArchitectureVersion baseAV;
	protected ArchitectureVersion changedAV;

	static {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		//PCM Packages
		EPackage.Registry.INSTANCE.put(RepositoryPackage.eNS_URI, RepositoryPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ResourceenvironmentPackage.eNS_URI, ResourceenvironmentPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(SystemPackage.eNS_URI, SystemPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(AllocationPackage.eNS_URI, AllocationPackage.eINSTANCE);
		//KAMP Packages
		EPackage.Registry.INSTANCE.put(ComponentInternalDependenciesPackage.eNS_URI, ComponentInternalDependenciesPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage.eNS_URI, de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(InternalmodificationmarkPackage.eNS_URI, InternalmodificationmarkPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage.eNS_URI, edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage.eNS_URI, edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage.eINSTANCE);
	}

	public abstract String getInitialModelName();
	public abstract String getChangeScenarioName();
	
	public abstract ArchitectureVersion setupInitialModel(String initialArchitectureName);
	public abstract ArchitectureVersion setupChangedModel(String changeScenarioName);
	
	public void deriveWorkplan() {
		// 3. Compute activities required to fulfill the change request
		// 3.1 Derivation of workplan (plain)
		List<Activity> baseActivityList = DifferenceCalculation.deriveWorkplan(baseAV, changedAV);
		System.out.println("Activity List (without change propagation):");
		KAMPHelper.printActivities(baseActivityList, null);
		// 3.2. Derivation of workplan (enriched)
		//List<Activity> enrichedActivityList = EnrichedWorkplanDerivation.deriveEnrichedWorkplan(baseAV, changedAV, baseActivityList);
		//System.out.println("Enriched Activity List:");
		//KAMPHelper.printActivities(enrichedActivityList, "Top:");
	}
	
	public void runChangeAnalysis() {
		// 3.3. Make change propagation analysis
		ChangePropagationAnalysis cia = new ChangePropagationAnalysis();
		cia.runChangePropagationAnalysis(changedAV);
		List<Activity> baseActivityList = DifferenceCalculation.deriveWorkplan(baseAV, changedAV);
		System.out.println("Activity List (with change propagation):");
		KAMPHelper.printActivities(baseActivityList, null);
	}
	
	public void tearDown() {
		baseAV.delete();
		changedAV.delete();
		baseAV = null;
		changedAV = null;
	}

	public abstract void runTest();
}
