/**
 */
package edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldofactivityannotationsFactoryImpl extends EFactoryImpl implements FieldofactivityannotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FieldofactivityannotationsFactory init() {
		try {
			FieldofactivityannotationsFactory theFieldofactivityannotationsFactory = (FieldofactivityannotationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://sdq.ipd.kit.edu/KAMPFieldofactivityannotations/1.0"); 
			if (theFieldofactivityannotationsFactory != null) {
				return theFieldofactivityannotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FieldofactivityannotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldofactivityannotationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY: return createFieldOfActivityAnnotationRepository();
			case FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION: return createDevelopmentArtefactSpecification();
			case FieldofactivityannotationsPackage.SOURCE_FILE: return createSourceFile();
			case FieldofactivityannotationsPackage.SOURCE_FILE_AGGREGATION: return createSourceFileAggregation();
			case FieldofactivityannotationsPackage.METADATA_FILE: return createMetadataFile();
			case FieldofactivityannotationsPackage.METADATA_FILE_AGGREGATION: return createMetadataFileAggregation();
			case FieldofactivityannotationsPackage.BUILD_SPECIFICATION: return createBuildSpecification();
			case FieldofactivityannotationsPackage.BUILD_CONFIGURATION: return createBuildConfiguration();
			case FieldofactivityannotationsPackage.THIRD_PARTY_COMPONENT_OR_LIBRARY: return createThirdPartyComponentOrLibrary();
			case FieldofactivityannotationsPackage.TEST_SPECIFICATION: return createTestSpecification();
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION: return createReleaseSpecification();
			case FieldofactivityannotationsPackage.RELEASE_CONFIGURATION: return createReleaseConfiguration();
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION: return createDeploymentSpecification();
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE: return createRuntimeInstance();
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION: return createRuntimeInstanceAggregation();
			case FieldofactivityannotationsPackage.UNIT_TEST_CASE: return createUnitTestCase();
			case FieldofactivityannotationsPackage.ACCEPTANCE_TEST_CASE: return createAcceptanceTestCase();
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE: return createIntegrationTestCase();
			case FieldofactivityannotationsPackage.UNIT_TEST_CASE_AGGREGATION: return createUnitTestCaseAggregation();
			case FieldofactivityannotationsPackage.ACCEPTANCE_TEST_CASE_AGGREGATION: return createAcceptanceTestCaseAggregation();
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE_AGGREGATION: return createIntegrationTestCaseAggregation();
			case FieldofactivityannotationsPackage.STAFF_SPECIFICATION: return createStaffSpecification();
			case FieldofactivityannotationsPackage.PERSON_LIST: return createPersonList();
			case FieldofactivityannotationsPackage.PERSON: return createPerson();
			case FieldofactivityannotationsPackage.ROLE_LIST: return createRoleList();
			case FieldofactivityannotationsPackage.DEVELOPER: return createDeveloper();
			case FieldofactivityannotationsPackage.BUILD_CONFIGURATOR: return createBuildConfigurator();
			case FieldofactivityannotationsPackage.TEST_DEVELOPER: return createTestDeveloper();
			case FieldofactivityannotationsPackage.TESTER: return createTester();
			case FieldofactivityannotationsPackage.RELEASE_CONFIGURATOR: return createReleaseConfigurator();
			case FieldofactivityannotationsPackage.DEPLOYER: return createDeployer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepository createFieldOfActivityAnnotationRepository() {
		FieldOfActivityAnnotationRepositoryImpl fieldOfActivityAnnotationRepository = new FieldOfActivityAnnotationRepositoryImpl();
		return fieldOfActivityAnnotationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentArtefactSpecification createDevelopmentArtefactSpecification() {
		DevelopmentArtefactSpecificationImpl developmentArtefactSpecification = new DevelopmentArtefactSpecificationImpl();
		return developmentArtefactSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFile createSourceFile() {
		SourceFileImpl sourceFile = new SourceFileImpl();
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFileAggregation createSourceFileAggregation() {
		SourceFileAggregationImpl sourceFileAggregation = new SourceFileAggregationImpl();
		return sourceFileAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataFile createMetadataFile() {
		MetadataFileImpl metadataFile = new MetadataFileImpl();
		return metadataFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataFileAggregation createMetadataFileAggregation() {
		MetadataFileAggregationImpl metadataFileAggregation = new MetadataFileAggregationImpl();
		return metadataFileAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildSpecification createBuildSpecification() {
		BuildSpecificationImpl buildSpecification = new BuildSpecificationImpl();
		return buildSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildConfiguration createBuildConfiguration() {
		BuildConfigurationImpl buildConfiguration = new BuildConfigurationImpl();
		return buildConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThirdPartyComponentOrLibrary createThirdPartyComponentOrLibrary() {
		ThirdPartyComponentOrLibraryImpl thirdPartyComponentOrLibrary = new ThirdPartyComponentOrLibraryImpl();
		return thirdPartyComponentOrLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSpecification createTestSpecification() {
		TestSpecificationImpl testSpecification = new TestSpecificationImpl();
		return testSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseSpecification createReleaseSpecification() {
		ReleaseSpecificationImpl releaseSpecification = new ReleaseSpecificationImpl();
		return releaseSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseConfiguration createReleaseConfiguration() {
		ReleaseConfigurationImpl releaseConfiguration = new ReleaseConfigurationImpl();
		return releaseConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification createDeploymentSpecification() {
		DeploymentSpecificationImpl deploymentSpecification = new DeploymentSpecificationImpl();
		return deploymentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeInstance createRuntimeInstance() {
		RuntimeInstanceImpl runtimeInstance = new RuntimeInstanceImpl();
		return runtimeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeInstanceAggregation createRuntimeInstanceAggregation() {
		RuntimeInstanceAggregationImpl runtimeInstanceAggregation = new RuntimeInstanceAggregationImpl();
		return runtimeInstanceAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTestCase createUnitTestCase() {
		UnitTestCaseImpl unitTestCase = new UnitTestCaseImpl();
		return unitTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceTestCase createAcceptanceTestCase() {
		AcceptanceTestCaseImpl acceptanceTestCase = new AcceptanceTestCaseImpl();
		return acceptanceTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationTestCase createIntegrationTestCase() {
		IntegrationTestCaseImpl integrationTestCase = new IntegrationTestCaseImpl();
		return integrationTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTestCaseAggregation createUnitTestCaseAggregation() {
		UnitTestCaseAggregationImpl unitTestCaseAggregation = new UnitTestCaseAggregationImpl();
		return unitTestCaseAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceTestCaseAggregation createAcceptanceTestCaseAggregation() {
		AcceptanceTestCaseAggregationImpl acceptanceTestCaseAggregation = new AcceptanceTestCaseAggregationImpl();
		return acceptanceTestCaseAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationTestCaseAggregation createIntegrationTestCaseAggregation() {
		IntegrationTestCaseAggregationImpl integrationTestCaseAggregation = new IntegrationTestCaseAggregationImpl();
		return integrationTestCaseAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffSpecification createStaffSpecification() {
		StaffSpecificationImpl staffSpecification = new StaffSpecificationImpl();
		return staffSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonList createPersonList() {
		PersonListImpl personList = new PersonListImpl();
		return personList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleList createRoleList() {
		RoleListImpl roleList = new RoleListImpl();
		return roleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer createDeveloper() {
		DeveloperImpl developer = new DeveloperImpl();
		return developer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildConfigurator createBuildConfigurator() {
		BuildConfiguratorImpl buildConfigurator = new BuildConfiguratorImpl();
		return buildConfigurator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDeveloper createTestDeveloper() {
		TestDeveloperImpl testDeveloper = new TestDeveloperImpl();
		return testDeveloper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tester createTester() {
		TesterImpl tester = new TesterImpl();
		return tester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseConfigurator createReleaseConfigurator() {
		ReleaseConfiguratorImpl releaseConfigurator = new ReleaseConfiguratorImpl();
		return releaseConfigurator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployer createDeployer() {
		DeployerImpl deployer = new DeployerImpl();
		return deployer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldofactivityannotationsPackage getFieldofactivityannotationsPackage() {
		return (FieldofactivityannotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FieldofactivityannotationsPackage getPackage() {
		return FieldofactivityannotationsPackage.eINSTANCE;
	}

} //FieldofactivityannotationsFactoryImpl
