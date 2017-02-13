package edu.squat.headlesskamp;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.system.System;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import edu.kit.ipd.sdq.kamp.core.ArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp.core.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository;
import edu.squat.pcm.PCMHelper;

public class MediaStoreKAMPTest extends AbstractKAMPTest {
	public static String dirPath = "file:////Users/santiagovidal/Documents/Programacion/kamp-test/MediaStore3-Nightly/Model/MediaStore3_Model/";

	@Override
	public String getInitialModelName() {
		return "MediaStore3";
	}
	
	@Override
	public String getChangeScenarioName() {
		return "MediaStore3-Cache";
	}
	
	@Override
	public ArchitectureVersion setupInitialModel(String initialArchitectureName) {
		// Loading original PCM models
		String repositoryFile = dirPath + "ms.repository";
		String baseSystemFile = dirPath + "ms_base.system";
		Repository repository = PCMHelper.loadRepositoryModel(repositoryFile);
		System baseSystem = PCMHelper.loadSystemModel(baseSystemFile);
		// Setting up KAMP additional models (empty) for the original variant
		FieldOfActivityAnnotationRepository fieldOfActivityRepository = ArchitectureModelFactoryFacade.createFieldOfActivityAnnotationsRepository();
		ModificationRepository internalModificationMarkRepository = ArchitectureModelFactoryFacade.createModificationMarkRepository();
		ComponentInternalDependencyRepository componentInternalDependencyRepository = ArchitectureModelFactoryFacade.createComponentInternalDependencyRepository();
		// Creating the architecture version for KAMP
		ArchitectureVersion baseAV = new ArchitectureVersion(initialArchitectureName, 
				repository, baseSystem, 
				fieldOfActivityRepository, internalModificationMarkRepository, componentInternalDependencyRepository);
		// Setup internal dependencies
		ArchitectureModelFactoryFacade.setupComponentInternalDependenciesPessimistic(baseAV);
		// TBD
		return baseAV;
	}
	
	@SuppressWarnings("unused")
	@Override
	public ArchitectureVersion setupChangedModel(String changeScenarioName) {
		// Cloning the architecture for making changes to add a cache
		ArchitectureVersion changedAV = KAMPHelper.createArchitectureVersionClone(baseAV, changeScenarioName);
		// Searching components affected by this change scenario
		/*OperationInterface downloadInterface = (OperationInterface) ArchitectureModelLookup.lookUpInterfaceByName(changedAV, "IDownload");
		BasicComponent fileStorageComponent = (BasicComponent) ArchitectureModelLookup.lookUpComponentByName(changedAV, "FileStorage");*/
		OperationInterface fileStorageInterface = (OperationInterface) ArchitectureModelLookup.lookUpInterfaceByName(changedAV, "IFileStorage");
		/*BasicComponent mediaAccessComponent = (BasicComponent) ArchitectureModelLookup.lookUpComponentByName(changedAV, "MediaAccess");*/
		// Creating new elements and deleting existing ones
		CompositeDataType dataType = ArchitectureModelFactoryFacade.createCompositeDatatype(baseAV, "mydatatype");
		OperationSignature signature = ArchitectureModelFactoryFacade.createSignatureForInterface(fileStorageInterface, "myOperation");
		ArchitectureModelFactoryFacade.createParameterForSignature(signature, "myParameter", dataType);
		// Marking modifications for fulfilling this change scenario
		/*ArchitectureModelFactoryFacade.assignInternalModificationMarkToInterface(changedAV, downloadInterface);
		ArchitectureModelFactoryFacade.assignInternalModificationMarkToComponent(changedAV, mediaAccessComponent);*/
		//
		return changedAV;
	}
	
	@Override
	public void runTest() {
		try {
			baseAV = this.setupInitialModel(this.getInitialModelName());
			changedAV = this.setupChangedModel(this.getChangeScenarioName());
			this.deriveWorkplan();
			this.runChangeAnalysis();
			this.tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		MediaStoreKAMPTest testNew = new MediaStoreKAMPTest();
		testNew.runTest();
	}
}
