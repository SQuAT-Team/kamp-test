package edu.squat.headlesskamp;

import java.util.List;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.system.SystemPackage;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage;
import de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency;
import de.uka.ipd.sdq.internalmodificationmark.InternalmodificationmarkPackage;
import edu.kit.ipd.sdq.kamp.core.Activity;
import edu.kit.ipd.sdq.kamp.core.ArchitectureAnnotationFactory;
import edu.kit.ipd.sdq.kamp.core.ArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp.core.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp.core.ArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.core.ChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp.core.derivation.DifferenceCalculation;
//import edu.kit.ipd.sdq.kamp.test.TestPathProvider;

public class KAMPTest {
	private final static String TESTNAME = "DissRunningExampleTest";
	private final static String PROJECTPATH = "file:////Users/alejandrorago/Documents/Implementacion/Repositorios/kamp-test/edu.squat.headlesskamp/tests/";
	
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
	
	ArchitectureVersion baseArchitectureVersion;

	public static final String CHANGEREQUEST_A1 = "A1";
	public static final String CHANGEREQUEST_A2 = "A2";
	public static final String CHANGEREQUEST_B = "B";
	public static final String CHANGEREQUEST_C = "C";
	public static final String CHANGEREQUEST_D = "D";

	@Before
	public void setUp() throws Exception {
		//TestPathProvider.resetTestProject(TESTNAME);
		
		baseArchitectureVersion = setupBasePCMModel("basemodel");
		//ArchitectureVersionPersistency.save(TestPathProvider.getTestPath(TESTNAME), baseArchitectureVersion.getName(), baseArchitectureVersion);
		//ArchitectureVersionPersistency.save(PROJECTPATH+TESTNAME, baseArchitectureVersion.getName(), baseArchitectureVersion);
	}

	private static ArchitectureVersion setupBasePCMModel(String name) {
		ArchitectureVersion baseversion = ArchitectureModelFactoryFacade.createEmptyModel(name);

		// base model - repository 
		OperationInterface haendlerSchnittstelle = ArchitectureModelFactoryFacade.createInterface(baseversion, "H�ndler-Schnittstelle");
		OperationInterface kundenSchnittstelle = ArchitectureModelFactoryFacade.createInterface(baseversion, "Kunden-Schnittstelle");
		OperationInterface haendlerServerSchnittstelle = ArchitectureModelFactoryFacade.createInterface(baseversion, "H�ndler-Server-Schnittstelle");
		OperationInterface kundenServerSchnittstelle = ArchitectureModelFactoryFacade.createInterface(baseversion, "Kunden-Server-Schnittstelle");
		OperationInterface finanzdienstSchnittstelle = ArchitectureModelFactoryFacade.createInterface(baseversion, "Finanzdienst-Schnittstelle");
		OperationInterface odbcSchnittstelle = ArchitectureModelFactoryFacade.createInterface(baseversion, "ODBC-Schnittstelle");

		BasicComponent haendlerclient = ArchitectureModelFactoryFacade.createBasicComponent(baseversion, "H�ndler-Client");
		BasicComponent kundenclient = ArchitectureModelFactoryFacade.createBasicComponent(baseversion, "Kunden-Client");
		BasicComponent bestellserver = ArchitectureModelFactoryFacade.createBasicComponent(baseversion, "Bestell-Server");
		BasicComponent datenbank = ArchitectureModelFactoryFacade.createBasicComponent(baseversion, "Datenbank");
		BasicComponent finanzdienst = ArchitectureModelFactoryFacade.createBasicComponent(baseversion, "Finanzdienst");
		
				
		ArchitectureModelFactoryFacade.createProvidedRole(haendlerclient, haendlerSchnittstelle);
		ArchitectureModelFactoryFacade.createRequiredRole(haendlerclient, haendlerServerSchnittstelle);

		ArchitectureModelFactoryFacade.createProvidedRole(kundenclient, kundenSchnittstelle);
		ArchitectureModelFactoryFacade.createRequiredRole(kundenclient, kundenServerSchnittstelle);

		ProvidedRole bestellserverHaendlerServerSchnittstellenAngebot = ArchitectureModelFactoryFacade.createProvidedRole(bestellserver, haendlerServerSchnittstelle);
		ProvidedRole bestellserverKundenServerSchnittstellenAngebot = ArchitectureModelFactoryFacade.createProvidedRole(bestellserver, kundenServerSchnittstelle);
		RequiredRole bestellserverServerFinanzdienstSchnittstellenNachfrage = ArchitectureModelFactoryFacade.createRequiredRole(bestellserver, finanzdienstSchnittstelle);
		RequiredRole bestellserverServerDatenbankSchnittstellenNachfrage = ArchitectureModelFactoryFacade.createRequiredRole(bestellserver, odbcSchnittstelle);

		ArchitectureModelFactoryFacade.createProvidedRole(datenbank, odbcSchnittstelle);
		ArchitectureModelFactoryFacade.createProvidedRole(finanzdienst, finanzdienstSchnittstelle);

		// base model - system
		
		ArchitectureModelFactoryFacade.createAssemblyContext(haendlerclient, baseversion);
		ArchitectureModelFactoryFacade.createAssemblyContext(kundenclient, baseversion);
		ArchitectureModelFactoryFacade.createAssemblyContext(bestellserver, baseversion);
		ArchitectureModelFactoryFacade.createAssemblyContext(datenbank, baseversion);
		ArchitectureModelFactoryFacade.createAssemblyContext(finanzdienst, baseversion);
		
		AssemblyConnector connectorHaenderClientToServer = ArchitectureModelFactoryFacade.createAssemblyConnector(haendlerclient, bestellserver, baseversion);
		AssemblyConnector connectorKundenClientToServer = ArchitectureModelFactoryFacade.createAssemblyConnector(kundenclient, bestellserver, baseversion);
		AssemblyConnector connectorServerToDatenbank = ArchitectureModelFactoryFacade.createAssemblyConnector(bestellserver, datenbank, baseversion);
		AssemblyConnector connectorServerToFinanzdienst = ArchitectureModelFactoryFacade.createAssemblyConnector(bestellserver, finanzdienst, baseversion);
		
		// component internal dependencies
		ArchitectureModelFactoryFacade.setupComponentInternalDependenciesPessimistic(baseversion);
		ArchitectureModelFactoryFacade.createComponentInternalDependency(baseversion, haendlerclient.getProvidedRoles_InterfaceProvidingEntity().get(0), haendlerclient.getRequiredRoles_InterfaceRequiringEntity().get(0));
		ArchitectureModelFactoryFacade.createComponentInternalDependency(baseversion, kundenclient.getProvidedRoles_InterfaceProvidingEntity().get(0), kundenclient.getRequiredRoles_InterfaceRequiringEntity().get(0));
		ArchitectureModelFactoryFacade.createComponentInternalDependency(baseversion, bestellserverHaendlerServerSchnittstellenAngebot, bestellserverServerFinanzdienstSchnittstellenNachfrage);
		ArchitectureModelFactoryFacade.createComponentInternalDependency(baseversion, bestellserverHaendlerServerSchnittstellenAngebot, bestellserverServerDatenbankSchnittstellenNachfrage);
		ArchitectureModelFactoryFacade.createComponentInternalDependency(baseversion, bestellserverKundenServerSchnittstellenAngebot, bestellserverServerDatenbankSchnittstellenNachfrage);

		// model annotations 
		
		// development artefacts
		ArchitectureAnnotationFactory.createSourceFileAggregationAnnotation(baseversion, kundenclient, 120, "JavaScript");
		ArchitectureAnnotationFactory.createSourceFileAggregationAnnotation(baseversion, haendlerclient, 130, "Java");
		ArchitectureAnnotationFactory.createSourceFileAggregationAnnotation(baseversion, bestellserver, 152, "PHP");
		ArchitectureAnnotationFactory.createMetadataFileAnnotation(baseversion, kundenclient, "Datenbankschema", "SQL-DDL");
		
		// testing
		ArchitectureAnnotationFactory.createUnitTestAggregation(baseversion, 
				kundenclient.getProvidedRoles_InterfaceProvidingEntity().get(0), 30, "");
		ArchitectureAnnotationFactory.createUnitTestAggregation(baseversion, 
				haendlerclient.getProvidedRoles_InterfaceProvidingEntity().get(0), 33, "");
		ArchitectureAnnotationFactory.createUnitTestAggregation(baseversion, 
				bestellserver.getProvidedRoles_InterfaceProvidingEntity().get(0), 50, "");
		ArchitectureAnnotationFactory.createIntegrationTestAggregation(baseversion, connectorKundenClientToServer, 35, "");
		ArchitectureAnnotationFactory.createIntegrationTestAggregation(baseversion, connectorHaenderClientToServer, 33, "");
		ArchitectureAnnotationFactory.createIntegrationTestAggregation(baseversion, connectorServerToFinanzdienst, 41, "");
		ArchitectureAnnotationFactory.createIntegrationTestAggregation(baseversion, connectorServerToDatenbank, 28, "");

		ArchitectureAnnotationFactory.createAcceptanceTestAggregation(baseversion, kundenclient.getProvidedRoles_InterfaceProvidingEntity().get(0), 38, "");
		ArchitectureAnnotationFactory.createAcceptanceTestAggregation(baseversion, haendlerclient.getProvidedRoles_InterfaceProvidingEntity().get(0), 42, "");

		// building
		ArchitectureAnnotationFactory.createBuildConfiguration(baseversion, new RepositoryComponent[] {kundenclient, haendlerclient, bestellserver}, "build.xml", "");

		// distribution/release management	
		ArchitectureAnnotationFactory.createReleaseConfiguration(baseversion, new RepositoryComponent[] {kundenclient}, "", "Installierf�higer Kunden-Client");
		ArchitectureAnnotationFactory.createReleaseConfiguration(baseversion, new RepositoryComponent[] {haendlerclient}, "", "Installierf�higer H�ndler-Client");
		ArchitectureAnnotationFactory.createReleaseConfiguration(baseversion, new RepositoryComponent[] {bestellserver}, "", "Installierf�higer Bestell-Server");
		
		// deployment
		ArchitectureAnnotationFactory.createRuntimeInstanceAggregation(baseversion, new RepositoryComponent[] {kundenclient}, 1000, "");
		ArchitectureAnnotationFactory.createRuntimeInstanceAggregation(baseversion, new RepositoryComponent[] {haendlerclient}, 10, "");
		ArchitectureAnnotationFactory.createRuntimeInstanceAggregation(baseversion, new RepositoryComponent[] {bestellserver}, 1, "");
		ArchitectureAnnotationFactory.createRuntimeInstanceAggregation(baseversion, new RepositoryComponent[] {datenbank}, 1, "");
		
		// staff assignment
		//ArchitectureAnnotationFactory.createStaffAssignmentDeveloper(baseversion, )
		
		return baseversion;
	}

	@After
	public void tearDown() {
		baseArchitectureVersion.delete();
		baseArchitectureVersion = null;
	}

	@Test
	public void testScenarioA1DatabaseSchemaOptimization() {
		String FOLDER = PROJECTPATH+TESTNAME+"/"+CHANGEREQUEST_A1;		
		
		//ArchitectureVersion subVersion = ArchitectureVersionPersistency.createArchitectureVersionClone(baseArchitectureVersion, TestPathProvider.getTestPath(TESTNAME), "SubVersionModifyDatabaseSchema");
		//ArchitectureVersion subVersion = ArchitectureVersionPersistency.createArchitectureVersionClone(baseArchitectureVersion, PROJECTPATH+TESTNAME, "SubVersionModifyDatabaseSchema");
		ArchitectureVersion subVersion = setupBasePCMModel("basemodel");
				
		RepositoryComponent database = ArchitectureModelLookup.lookUpComponentByName(subVersion, "Datenbank");

		assertTrue("componentUserDatabase not found", database != null);
		
		assertTrue("Number of provided roles of componentUserDatabase not equals 1", database.getProvidedRoles_InterfaceProvidingEntity().size()==1);
		
		ProvidedRole providedRoleOfDatabase = database.getProvidedRoles_InterfaceProvidingEntity().get(0);

		ArchitectureModelFactoryFacade.assignInternalModificationMarkToProvidedRoleOfComponent(subVersion, providedRoleOfDatabase);
		
		assertTrue("Internal Modification mark not set properly or not retrieved properly", ArchitectureModelLookup.lookUpInternalModificationMarkForProvidedRole(subVersion, providedRoleOfDatabase)!=null);
		
		List<Activity> baseActivityList = DifferenceCalculation.deriveWorkplan(baseArchitectureVersion, subVersion);
		
		assertTrue("No activities detected", !baseActivityList.isEmpty());
		
		//ArchitectureVersionPersistency.saveActivityListToExcelFile(FOLDER, "workplan_archbased_beforepropagationanalysis", baseActivityList);
		//ArchitectureVersionPersistency.saveActivityListToExcelFile(FOLDER, "workplan_archbased_beforepropagationanalysis", baseActivityList);

		ChangePropagationAnalysis changePropagationAnalysis = new ChangePropagationAnalysis();
		changePropagationAnalysis.runChangePropagationAnalysis(subVersion);

		RepositoryComponent bestellserver = ArchitectureModelLookup.lookUpComponentByName(subVersion, "Bestell-Server");
		
		List<RoleToRoleDependency> internalDependencies = ArchitectureModelLookup.lookUpComponentInternalDependenciesForComponent(subVersion, (BasicComponent) bestellserver);
		//assertTrue("Number of marked assembly connectors NOT THREE", ArchitectureModelLookup.lookUpMarkedAssemblyConnectors(subVersion).size()==3);
		
		
		List<Activity> baseActivityListAfterChangePropagationAnalysis = DifferenceCalculation.deriveWorkplan(baseArchitectureVersion, subVersion);
		
		assertTrue("No activities detected", !baseActivityListAfterChangePropagationAnalysis.isEmpty());

		//ArchitectureVersionPersistency.saveActivityListToExcelFile(FOLDER, "workplan_archbased_afterpropagationanalysis", baseActivityListAfterChangePropagationAnalysis);
	}
	
	public static void main(String[] args) {
		KAMPTest test = new KAMPTest();
		try {
			test.setUp();
			test.testScenarioA1DatabaseSchemaOptimization();
			test.tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
