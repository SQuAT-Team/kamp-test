/**
 */
package edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.AcceptanceTestCase;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.AcceptanceTestCaseAggregation;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.BuildConfiguration;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.BuildConfigurator;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.BuildSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.Deployer;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.DeploymentSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.Developer;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.DevelopmentArtefactSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsFactory;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.File;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FileAggregation;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.IntegrationTestCase;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.IntegrationTestCaseAggregation;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.MetadataFile;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.MetadataFileAggregation;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.Person;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.PersonList;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.ReleaseConfiguration;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.ReleaseConfigurator;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.ReleaseSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.Role;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RoleList;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RuntimeInstance;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RuntimeInstanceAggregation;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.SourceFile;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.SourceFileAggregation;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.StaffSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.TestCase;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.TestCaseAggregation;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.TestDeveloper;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.TestSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.Tester;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.ThirdPartyComponentOrLibrary;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.UnitTestCase;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.UnitTestCaseAggregation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.composition.CompositionPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldofactivityannotationsPackageImpl extends EPackageImpl implements FieldofactivityannotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldOfActivityAnnotationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developmentArtefactSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataFileAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thirdPartyComponentOrLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeInstanceAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptanceTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTestCaseAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptanceTestCaseAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationTestCaseAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildConfiguratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testDeveloperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseConfiguratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseAggregationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FieldofactivityannotationsPackageImpl() {
		super(eNS_URI, FieldofactivityannotationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FieldofactivityannotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FieldofactivityannotationsPackage init() {
		if (isInited) return (FieldofactivityannotationsPackage)EPackage.Registry.INSTANCE.getEPackage(FieldofactivityannotationsPackage.eNS_URI);

		// Obtain or create and register package
		FieldofactivityannotationsPackageImpl theFieldofactivityannotationsPackage = (FieldofactivityannotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FieldofactivityannotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FieldofactivityannotationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFieldofactivityannotationsPackage.createPackageContents();

		// Initialize created meta-data
		theFieldofactivityannotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFieldofactivityannotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FieldofactivityannotationsPackage.eNS_URI, theFieldofactivityannotationsPackage);
		return theFieldofactivityannotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldOfActivityAnnotationRepository() {
		return fieldOfActivityAnnotationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_DevelopmentArtefactSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_BuildSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_TestSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_ReleaseSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_DeploymentSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_StaffSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevelopmentArtefactSpecification() {
		return developmentArtefactSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentArtefactSpecification_Parent() {
		return (EReference)developmentArtefactSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentArtefactSpecification_SourceFiles() {
		return (EReference)developmentArtefactSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentArtefactSpecification_SourceFileAggregations() {
		return (EReference)developmentArtefactSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentArtefactSpecification_MetadataFiles() {
		return (EReference)developmentArtefactSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentArtefactSpecification_MetadataFileAggregations() {
		return (EReference)developmentArtefactSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFile() {
		return sourceFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceFile_Parent() {
		return (EReference)sourceFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceFile_Component() {
		return (EReference)sourceFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFileAggregation() {
		return sourceFileAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceFileAggregation_Parent() {
		return (EReference)sourceFileAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceFileAggregation_Component() {
		return (EReference)sourceFileAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataFile() {
		return metadataFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataFile_Parent() {
		return (EReference)metadataFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataFile_Component() {
		return (EReference)metadataFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataFileAggregation() {
		return metadataFileAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataFileAggregation_Parent() {
		return (EReference)metadataFileAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataFileAggregation_Component() {
		return (EReference)metadataFileAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildSpecification() {
		return buildSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildSpecification_Parent() {
		return (EReference)buildSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildSpecification_BuildConfigurations() {
		return (EReference)buildSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildSpecification_ThirdPartyComponentOrLibraries() {
		return (EReference)buildSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildConfiguration() {
		return buildConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildConfiguration_Parent() {
		return (EReference)buildConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildConfiguration_Component() {
		return (EReference)buildConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThirdPartyComponentOrLibrary() {
		return thirdPartyComponentOrLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThirdPartyComponentOrLibrary_Parent() {
		return (EReference)thirdPartyComponentOrLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThirdPartyComponentOrLibrary_Component() {
		return (EReference)thirdPartyComponentOrLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSpecification() {
		return testSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSpecification_Parent() {
		return (EReference)testSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSpecification_UnitTestCases() {
		return (EReference)testSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSpecification_AcceptanceTestCases() {
		return (EReference)testSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSpecification_IntegrationTestCases() {
		return (EReference)testSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSpecification_UnitTestCaseAggregations() {
		return (EReference)testSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSpecification_AcceptanceTestCaseAggregations() {
		return (EReference)testSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSpecification_IntegrationTestCaseAggregations() {
		return (EReference)testSpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseSpecification() {
		return releaseSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseSpecification_ReleaseConfigurations() {
		return (EReference)releaseSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseSpecification_Parent() {
		return (EReference)releaseSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseConfiguration() {
		return releaseConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseConfiguration_Parent() {
		return (EReference)releaseConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseConfiguration_Components() {
		return (EReference)releaseConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseConfiguration_Pathname() {
		return (EAttribute)releaseConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseConfiguration_Description() {
		return (EAttribute)releaseConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentSpecification() {
		return deploymentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSpecification_RuntimeInstances() {
		return (EReference)deploymentSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSpecification_RuntimeInstanceAggregations() {
		return (EReference)deploymentSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSpecification_Parent() {
		return (EReference)deploymentSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeInstance() {
		return runtimeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeInstance_Parent() {
		return (EReference)runtimeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeInstance_Name() {
		return (EAttribute)runtimeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeInstance_Description() {
		return (EAttribute)runtimeInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeInstance_Components() {
		return (EReference)runtimeInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeInstanceAggregation() {
		return runtimeInstanceAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeInstanceAggregation_Parent() {
		return (EReference)runtimeInstanceAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeInstanceAggregation_NumberOfInstances() {
		return (EAttribute)runtimeInstanceAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeInstanceAggregation_Description() {
		return (EAttribute)runtimeInstanceAggregationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeInstanceAggregation_Components() {
		return (EReference)runtimeInstanceAggregationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitTestCase() {
		return unitTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitTestCase_Parent() {
		return (EReference)unitTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitTestCase_Providedrole() {
		return (EReference)unitTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptanceTestCase() {
		return acceptanceTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptanceTestCase_Parent() {
		return (EReference)acceptanceTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptanceTestCase_Providedrole() {
		return (EReference)acceptanceTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrationTestCase() {
		return integrationTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationTestCase_Parent() {
		return (EReference)integrationTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationTestCase_Providedrole() {
		return (EReference)integrationTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationTestCase_AssemblyConnector() {
		return (EReference)integrationTestCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitTestCaseAggregation() {
		return unitTestCaseAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitTestCaseAggregation_Parent() {
		return (EReference)unitTestCaseAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitTestCaseAggregation_Providedrole() {
		return (EReference)unitTestCaseAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptanceTestCaseAggregation() {
		return acceptanceTestCaseAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptanceTestCaseAggregation_Parent() {
		return (EReference)acceptanceTestCaseAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptanceTestCaseAggregation_Providedrole() {
		return (EReference)acceptanceTestCaseAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrationTestCaseAggregation() {
		return integrationTestCaseAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationTestCaseAggregation_Parent() {
		return (EReference)integrationTestCaseAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationTestCaseAggregation_Providedrole() {
		return (EReference)integrationTestCaseAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationTestCaseAggregation_AssemblyConnector() {
		return (EReference)integrationTestCaseAggregationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffSpecification() {
		return staffSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffSpecification_Parent() {
		return (EReference)staffSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffSpecification_PersonList() {
		return (EReference)staffSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffSpecification_RoleList() {
		return (EReference)staffSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonList() {
		return personListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonList_Parent() {
		return (EReference)personListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonList_Persons() {
		return (EReference)personListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Parent() {
		return (EReference)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Roles() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Parent() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Person() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Description() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Components() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleList() {
		return roleListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleList_Parent() {
		return (EReference)roleListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleList_Roles() {
		return (EReference)roleListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeveloper() {
		return developerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildConfigurator() {
		return buildConfiguratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestDeveloper() {
		return testDeveloperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTester() {
		return testerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseConfigurator() {
		return releaseConfiguratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployer() {
		return deployerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Filename() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Technology() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileAggregation() {
		return fileAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileAggregation_NumberOfFiles() {
		return (EAttribute)fileAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileAggregation_Technology() {
		return (EAttribute)fileAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_NameOfTest() {
		return (EAttribute)testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCaseAggregation() {
		return testCaseAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCaseAggregation_NumberOfTestcases() {
		return (EAttribute)testCaseAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCaseAggregation_NameOfTestSuite() {
		return (EAttribute)testCaseAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldofactivityannotationsFactory getFieldofactivityannotationsFactory() {
		return (FieldofactivityannotationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fieldOfActivityAnnotationRepositoryEClass = createEClass(FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__BUILD_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__RELEASE_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEPLOYMENT_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION);

		developmentArtefactSpecificationEClass = createEClass(DEVELOPMENT_ARTEFACT_SPECIFICATION);
		createEReference(developmentArtefactSpecificationEClass, DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT);
		createEReference(developmentArtefactSpecificationEClass, DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES);
		createEReference(developmentArtefactSpecificationEClass, DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS);
		createEReference(developmentArtefactSpecificationEClass, DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES);
		createEReference(developmentArtefactSpecificationEClass, DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS);

		sourceFileEClass = createEClass(SOURCE_FILE);
		createEReference(sourceFileEClass, SOURCE_FILE__PARENT);
		createEReference(sourceFileEClass, SOURCE_FILE__COMPONENT);

		sourceFileAggregationEClass = createEClass(SOURCE_FILE_AGGREGATION);
		createEReference(sourceFileAggregationEClass, SOURCE_FILE_AGGREGATION__PARENT);
		createEReference(sourceFileAggregationEClass, SOURCE_FILE_AGGREGATION__COMPONENT);

		metadataFileEClass = createEClass(METADATA_FILE);
		createEReference(metadataFileEClass, METADATA_FILE__PARENT);
		createEReference(metadataFileEClass, METADATA_FILE__COMPONENT);

		metadataFileAggregationEClass = createEClass(METADATA_FILE_AGGREGATION);
		createEReference(metadataFileAggregationEClass, METADATA_FILE_AGGREGATION__PARENT);
		createEReference(metadataFileAggregationEClass, METADATA_FILE_AGGREGATION__COMPONENT);

		buildSpecificationEClass = createEClass(BUILD_SPECIFICATION);
		createEReference(buildSpecificationEClass, BUILD_SPECIFICATION__PARENT);
		createEReference(buildSpecificationEClass, BUILD_SPECIFICATION__BUILD_CONFIGURATIONS);
		createEReference(buildSpecificationEClass, BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES);

		buildConfigurationEClass = createEClass(BUILD_CONFIGURATION);
		createEReference(buildConfigurationEClass, BUILD_CONFIGURATION__PARENT);
		createEReference(buildConfigurationEClass, BUILD_CONFIGURATION__COMPONENT);

		thirdPartyComponentOrLibraryEClass = createEClass(THIRD_PARTY_COMPONENT_OR_LIBRARY);
		createEReference(thirdPartyComponentOrLibraryEClass, THIRD_PARTY_COMPONENT_OR_LIBRARY__PARENT);
		createEReference(thirdPartyComponentOrLibraryEClass, THIRD_PARTY_COMPONENT_OR_LIBRARY__COMPONENT);

		testSpecificationEClass = createEClass(TEST_SPECIFICATION);
		createEReference(testSpecificationEClass, TEST_SPECIFICATION__PARENT);
		createEReference(testSpecificationEClass, TEST_SPECIFICATION__UNIT_TEST_CASES);
		createEReference(testSpecificationEClass, TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES);
		createEReference(testSpecificationEClass, TEST_SPECIFICATION__INTEGRATION_TEST_CASES);
		createEReference(testSpecificationEClass, TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS);
		createEReference(testSpecificationEClass, TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS);
		createEReference(testSpecificationEClass, TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS);

		releaseSpecificationEClass = createEClass(RELEASE_SPECIFICATION);
		createEReference(releaseSpecificationEClass, RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS);
		createEReference(releaseSpecificationEClass, RELEASE_SPECIFICATION__PARENT);

		releaseConfigurationEClass = createEClass(RELEASE_CONFIGURATION);
		createEReference(releaseConfigurationEClass, RELEASE_CONFIGURATION__PARENT);
		createEReference(releaseConfigurationEClass, RELEASE_CONFIGURATION__COMPONENTS);
		createEAttribute(releaseConfigurationEClass, RELEASE_CONFIGURATION__PATHNAME);
		createEAttribute(releaseConfigurationEClass, RELEASE_CONFIGURATION__DESCRIPTION);

		deploymentSpecificationEClass = createEClass(DEPLOYMENT_SPECIFICATION);
		createEReference(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES);
		createEReference(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS);
		createEReference(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__PARENT);

		runtimeInstanceEClass = createEClass(RUNTIME_INSTANCE);
		createEReference(runtimeInstanceEClass, RUNTIME_INSTANCE__PARENT);
		createEAttribute(runtimeInstanceEClass, RUNTIME_INSTANCE__NAME);
		createEAttribute(runtimeInstanceEClass, RUNTIME_INSTANCE__DESCRIPTION);
		createEReference(runtimeInstanceEClass, RUNTIME_INSTANCE__COMPONENTS);

		runtimeInstanceAggregationEClass = createEClass(RUNTIME_INSTANCE_AGGREGATION);
		createEReference(runtimeInstanceAggregationEClass, RUNTIME_INSTANCE_AGGREGATION__PARENT);
		createEAttribute(runtimeInstanceAggregationEClass, RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_INSTANCES);
		createEAttribute(runtimeInstanceAggregationEClass, RUNTIME_INSTANCE_AGGREGATION__DESCRIPTION);
		createEReference(runtimeInstanceAggregationEClass, RUNTIME_INSTANCE_AGGREGATION__COMPONENTS);

		unitTestCaseEClass = createEClass(UNIT_TEST_CASE);
		createEReference(unitTestCaseEClass, UNIT_TEST_CASE__PARENT);
		createEReference(unitTestCaseEClass, UNIT_TEST_CASE__PROVIDEDROLE);

		acceptanceTestCaseEClass = createEClass(ACCEPTANCE_TEST_CASE);
		createEReference(acceptanceTestCaseEClass, ACCEPTANCE_TEST_CASE__PARENT);
		createEReference(acceptanceTestCaseEClass, ACCEPTANCE_TEST_CASE__PROVIDEDROLE);

		integrationTestCaseEClass = createEClass(INTEGRATION_TEST_CASE);
		createEReference(integrationTestCaseEClass, INTEGRATION_TEST_CASE__PARENT);
		createEReference(integrationTestCaseEClass, INTEGRATION_TEST_CASE__PROVIDEDROLE);
		createEReference(integrationTestCaseEClass, INTEGRATION_TEST_CASE__ASSEMBLY_CONNECTOR);

		unitTestCaseAggregationEClass = createEClass(UNIT_TEST_CASE_AGGREGATION);
		createEReference(unitTestCaseAggregationEClass, UNIT_TEST_CASE_AGGREGATION__PARENT);
		createEReference(unitTestCaseAggregationEClass, UNIT_TEST_CASE_AGGREGATION__PROVIDEDROLE);

		acceptanceTestCaseAggregationEClass = createEClass(ACCEPTANCE_TEST_CASE_AGGREGATION);
		createEReference(acceptanceTestCaseAggregationEClass, ACCEPTANCE_TEST_CASE_AGGREGATION__PARENT);
		createEReference(acceptanceTestCaseAggregationEClass, ACCEPTANCE_TEST_CASE_AGGREGATION__PROVIDEDROLE);

		integrationTestCaseAggregationEClass = createEClass(INTEGRATION_TEST_CASE_AGGREGATION);
		createEReference(integrationTestCaseAggregationEClass, INTEGRATION_TEST_CASE_AGGREGATION__PARENT);
		createEReference(integrationTestCaseAggregationEClass, INTEGRATION_TEST_CASE_AGGREGATION__PROVIDEDROLE);
		createEReference(integrationTestCaseAggregationEClass, INTEGRATION_TEST_CASE_AGGREGATION__ASSEMBLY_CONNECTOR);

		staffSpecificationEClass = createEClass(STAFF_SPECIFICATION);
		createEReference(staffSpecificationEClass, STAFF_SPECIFICATION__PARENT);
		createEReference(staffSpecificationEClass, STAFF_SPECIFICATION__PERSON_LIST);
		createEReference(staffSpecificationEClass, STAFF_SPECIFICATION__ROLE_LIST);

		personListEClass = createEClass(PERSON_LIST);
		createEReference(personListEClass, PERSON_LIST__PARENT);
		createEReference(personListEClass, PERSON_LIST__PERSONS);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__PARENT);
		createEReference(personEClass, PERSON__ROLES);
		createEAttribute(personEClass, PERSON__NAME);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__PARENT);
		createEReference(roleEClass, ROLE__PERSON);
		createEAttribute(roleEClass, ROLE__DESCRIPTION);
		createEReference(roleEClass, ROLE__COMPONENTS);

		roleListEClass = createEClass(ROLE_LIST);
		createEReference(roleListEClass, ROLE_LIST__PARENT);
		createEReference(roleListEClass, ROLE_LIST__ROLES);

		developerEClass = createEClass(DEVELOPER);

		buildConfiguratorEClass = createEClass(BUILD_CONFIGURATOR);

		testDeveloperEClass = createEClass(TEST_DEVELOPER);

		testerEClass = createEClass(TESTER);

		releaseConfiguratorEClass = createEClass(RELEASE_CONFIGURATOR);

		deployerEClass = createEClass(DEPLOYER);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__FILENAME);
		createEAttribute(fileEClass, FILE__TECHNOLOGY);

		fileAggregationEClass = createEClass(FILE_AGGREGATION);
		createEAttribute(fileAggregationEClass, FILE_AGGREGATION__NUMBER_OF_FILES);
		createEAttribute(fileAggregationEClass, FILE_AGGREGATION__TECHNOLOGY);

		testCaseEClass = createEClass(TEST_CASE);
		createEAttribute(testCaseEClass, TEST_CASE__NAME_OF_TEST);

		testCaseAggregationEClass = createEClass(TEST_CASE_AGGREGATION);
		createEAttribute(testCaseAggregationEClass, TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES);
		createEAttribute(testCaseAggregationEClass, TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sourceFileEClass.getESuperTypes().add(this.getFile());
		sourceFileAggregationEClass.getESuperTypes().add(this.getFileAggregation());
		metadataFileEClass.getESuperTypes().add(this.getFile());
		metadataFileAggregationEClass.getESuperTypes().add(this.getFileAggregation());
		buildConfigurationEClass.getESuperTypes().add(this.getFile());
		thirdPartyComponentOrLibraryEClass.getESuperTypes().add(this.getFile());
		unitTestCaseEClass.getESuperTypes().add(this.getTestCase());
		acceptanceTestCaseEClass.getESuperTypes().add(this.getTestCase());
		integrationTestCaseEClass.getESuperTypes().add(this.getTestCase());
		unitTestCaseAggregationEClass.getESuperTypes().add(this.getTestCaseAggregation());
		acceptanceTestCaseAggregationEClass.getESuperTypes().add(this.getTestCaseAggregation());
		integrationTestCaseAggregationEClass.getESuperTypes().add(this.getTestCaseAggregation());
		developerEClass.getESuperTypes().add(this.getRole());
		buildConfiguratorEClass.getESuperTypes().add(this.getRole());
		testDeveloperEClass.getESuperTypes().add(this.getRole());
		testerEClass.getESuperTypes().add(this.getRole());
		releaseConfiguratorEClass.getESuperTypes().add(this.getRole());
		deployerEClass.getESuperTypes().add(this.getRole());

		// Initialize classes and features; add operations and parameters
		initEClass(fieldOfActivityAnnotationRepositoryEClass, FieldOfActivityAnnotationRepository.class, "FieldOfActivityAnnotationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldOfActivityAnnotationRepository_DevelopmentArtefactSpecification(), this.getDevelopmentArtefactSpecification(), this.getDevelopmentArtefactSpecification_Parent(), "developmentArtefactSpecification", null, 1, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_BuildSpecification(), this.getBuildSpecification(), this.getBuildSpecification_Parent(), "buildSpecification", null, 1, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_TestSpecification(), this.getTestSpecification(), this.getTestSpecification_Parent(), "testSpecification", null, 1, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_ReleaseSpecification(), this.getReleaseSpecification(), this.getReleaseSpecification_Parent(), "releaseSpecification", null, 1, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_DeploymentSpecification(), this.getDeploymentSpecification(), this.getDeploymentSpecification_Parent(), "deploymentSpecification", null, 1, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_StaffSpecification(), this.getStaffSpecification(), this.getStaffSpecification_Parent(), "staffSpecification", null, 1, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(developmentArtefactSpecificationEClass, DevelopmentArtefactSpecification.class, "DevelopmentArtefactSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevelopmentArtefactSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_DevelopmentArtefactSpecification(), "parent", null, 1, 1, DevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentArtefactSpecification_SourceFiles(), this.getSourceFile(), this.getSourceFile_Parent(), "sourceFiles", null, 0, -1, DevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentArtefactSpecification_SourceFileAggregations(), this.getSourceFileAggregation(), this.getSourceFileAggregation_Parent(), "sourceFileAggregations", null, 0, -1, DevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentArtefactSpecification_MetadataFiles(), this.getMetadataFile(), this.getMetadataFile_Parent(), "metadataFiles", null, 0, -1, DevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentArtefactSpecification_MetadataFileAggregations(), this.getMetadataFileAggregation(), this.getMetadataFileAggregation_Parent(), "metadataFileAggregations", null, 0, -1, DevelopmentArtefactSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceFileEClass, SourceFile.class, "SourceFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceFile_Parent(), this.getDevelopmentArtefactSpecification(), this.getDevelopmentArtefactSpecification_SourceFiles(), "parent", null, 1, 1, SourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceFile_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, SourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceFileAggregationEClass, SourceFileAggregation.class, "SourceFileAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceFileAggregation_Parent(), this.getDevelopmentArtefactSpecification(), this.getDevelopmentArtefactSpecification_SourceFileAggregations(), "parent", null, 1, 1, SourceFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceFileAggregation_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, SourceFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataFileEClass, MetadataFile.class, "MetadataFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadataFile_Parent(), this.getDevelopmentArtefactSpecification(), this.getDevelopmentArtefactSpecification_MetadataFiles(), "parent", null, 1, 1, MetadataFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataFile_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, MetadataFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataFileAggregationEClass, MetadataFileAggregation.class, "MetadataFileAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadataFileAggregation_Parent(), this.getDevelopmentArtefactSpecification(), this.getDevelopmentArtefactSpecification_MetadataFileAggregations(), "parent", null, 1, 1, MetadataFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataFileAggregation_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, MetadataFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildSpecificationEClass, BuildSpecification.class, "BuildSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_BuildSpecification(), "parent", null, 1, 1, BuildSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildSpecification_BuildConfigurations(), this.getBuildConfiguration(), this.getBuildConfiguration_Parent(), "buildConfigurations", null, 0, -1, BuildSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildSpecification_ThirdPartyComponentOrLibraries(), this.getThirdPartyComponentOrLibrary(), this.getThirdPartyComponentOrLibrary_Parent(), "thirdPartyComponentOrLibraries", null, 0, -1, BuildSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildConfigurationEClass, BuildConfiguration.class, "BuildConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildConfiguration_Parent(), this.getBuildSpecification(), this.getBuildSpecification_BuildConfigurations(), "parent", null, 1, 1, BuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildConfiguration_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, -1, BuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thirdPartyComponentOrLibraryEClass, ThirdPartyComponentOrLibrary.class, "ThirdPartyComponentOrLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThirdPartyComponentOrLibrary_Parent(), this.getBuildSpecification(), this.getBuildSpecification_ThirdPartyComponentOrLibraries(), "parent", null, 1, 1, ThirdPartyComponentOrLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThirdPartyComponentOrLibrary_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 0, 1, ThirdPartyComponentOrLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testSpecificationEClass, TestSpecification.class, "TestSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_TestSpecification(), "parent", null, 1, 1, TestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSpecification_UnitTestCases(), this.getUnitTestCase(), this.getUnitTestCase_Parent(), "unitTestCases", null, 0, -1, TestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSpecification_AcceptanceTestCases(), this.getAcceptanceTestCase(), this.getAcceptanceTestCase_Parent(), "acceptanceTestCases", null, 0, -1, TestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSpecification_IntegrationTestCases(), this.getIntegrationTestCase(), this.getIntegrationTestCase_Parent(), "integrationTestCases", null, 0, -1, TestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSpecification_UnitTestCaseAggregations(), this.getUnitTestCaseAggregation(), this.getUnitTestCaseAggregation_Parent(), "unitTestCaseAggregations", null, 0, -1, TestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSpecification_AcceptanceTestCaseAggregations(), this.getAcceptanceTestCaseAggregation(), this.getAcceptanceTestCaseAggregation_Parent(), "acceptanceTestCaseAggregations", null, 0, -1, TestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSpecification_IntegrationTestCaseAggregations(), this.getIntegrationTestCaseAggregation(), this.getIntegrationTestCaseAggregation_Parent(), "integrationTestCaseAggregations", null, 0, -1, TestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseSpecificationEClass, ReleaseSpecification.class, "ReleaseSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReleaseSpecification_ReleaseConfigurations(), this.getReleaseConfiguration(), this.getReleaseConfiguration_Parent(), "releaseConfigurations", null, 0, -1, ReleaseSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReleaseSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_ReleaseSpecification(), "parent", null, 1, 1, ReleaseSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseConfigurationEClass, ReleaseConfiguration.class, "ReleaseConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReleaseConfiguration_Parent(), this.getReleaseSpecification(), this.getReleaseSpecification_ReleaseConfigurations(), "parent", null, 1, 1, ReleaseConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReleaseConfiguration_Components(), theRepositoryPackage.getRepositoryComponent(), null, "components", null, 0, -1, ReleaseConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseConfiguration_Pathname(), ecorePackage.getEString(), "pathname", null, 0, 1, ReleaseConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseConfiguration_Description(), ecorePackage.getEString(), "description", null, 0, 1, ReleaseConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentSpecificationEClass, DeploymentSpecification.class, "DeploymentSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentSpecification_RuntimeInstances(), this.getRuntimeInstance(), this.getRuntimeInstance_Parent(), "runtimeInstances", null, 0, -1, DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentSpecification_RuntimeInstanceAggregations(), this.getRuntimeInstanceAggregation(), this.getRuntimeInstanceAggregation_Parent(), "runtimeInstanceAggregations", null, 0, -1, DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_DeploymentSpecification(), "parent", null, 1, 1, DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeInstanceEClass, RuntimeInstance.class, "RuntimeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeInstance_Parent(), this.getDeploymentSpecification(), this.getDeploymentSpecification_RuntimeInstances(), "parent", null, 1, 1, RuntimeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, RuntimeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeInstance_Description(), ecorePackage.getEString(), "description", null, 0, 1, RuntimeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeInstance_Components(), theRepositoryPackage.getRepositoryComponent(), null, "components", null, 0, -1, RuntimeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeInstanceAggregationEClass, RuntimeInstanceAggregation.class, "RuntimeInstanceAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeInstanceAggregation_Parent(), this.getDeploymentSpecification(), this.getDeploymentSpecification_RuntimeInstanceAggregations(), "parent", null, 1, 1, RuntimeInstanceAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeInstanceAggregation_NumberOfInstances(), ecorePackage.getEInt(), "numberOfInstances", null, 0, 1, RuntimeInstanceAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeInstanceAggregation_Description(), ecorePackage.getEString(), "description", null, 0, 1, RuntimeInstanceAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeInstanceAggregation_Components(), theRepositoryPackage.getRepositoryComponent(), null, "components", null, 0, -1, RuntimeInstanceAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitTestCaseEClass, UnitTestCase.class, "UnitTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitTestCase_Parent(), this.getTestSpecification(), this.getTestSpecification_UnitTestCases(), "parent", null, 1, 1, UnitTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitTestCase_Providedrole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedrole", null, 0, 1, UnitTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceptanceTestCaseEClass, AcceptanceTestCase.class, "AcceptanceTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcceptanceTestCase_Parent(), this.getTestSpecification(), this.getTestSpecification_AcceptanceTestCases(), "parent", null, 1, 1, AcceptanceTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcceptanceTestCase_Providedrole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedrole", null, 0, 1, AcceptanceTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrationTestCaseEClass, IntegrationTestCase.class, "IntegrationTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegrationTestCase_Parent(), this.getTestSpecification(), this.getTestSpecification_IntegrationTestCases(), "parent", null, 1, 1, IntegrationTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrationTestCase_Providedrole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedrole", null, 0, 1, IntegrationTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrationTestCase_AssemblyConnector(), theCompositionPackage.getAssemblyConnector(), null, "assemblyConnector", null, 0, 1, IntegrationTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitTestCaseAggregationEClass, UnitTestCaseAggregation.class, "UnitTestCaseAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitTestCaseAggregation_Parent(), this.getTestSpecification(), this.getTestSpecification_UnitTestCaseAggregations(), "parent", null, 1, 1, UnitTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitTestCaseAggregation_Providedrole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedrole", null, 0, 1, UnitTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceptanceTestCaseAggregationEClass, AcceptanceTestCaseAggregation.class, "AcceptanceTestCaseAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcceptanceTestCaseAggregation_Parent(), this.getTestSpecification(), this.getTestSpecification_AcceptanceTestCaseAggregations(), "parent", null, 1, 1, AcceptanceTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcceptanceTestCaseAggregation_Providedrole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedrole", null, 0, 1, AcceptanceTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrationTestCaseAggregationEClass, IntegrationTestCaseAggregation.class, "IntegrationTestCaseAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegrationTestCaseAggregation_Parent(), this.getTestSpecification(), this.getTestSpecification_IntegrationTestCaseAggregations(), "parent", null, 1, 1, IntegrationTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrationTestCaseAggregation_Providedrole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedrole", null, 0, 1, IntegrationTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrationTestCaseAggregation_AssemblyConnector(), theCompositionPackage.getAssemblyConnector(), null, "assemblyConnector", null, 0, 1, IntegrationTestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffSpecificationEClass, StaffSpecification.class, "StaffSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaffSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_StaffSpecification(), "parent", null, 1, 1, StaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaffSpecification_PersonList(), this.getPersonList(), this.getPersonList_Parent(), "personList", null, 1, 1, StaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaffSpecification_RoleList(), this.getRoleList(), this.getRoleList_Parent(), "roleList", null, 1, 1, StaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personListEClass, PersonList.class, "PersonList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonList_Parent(), this.getStaffSpecification(), this.getStaffSpecification_PersonList(), "parent", null, 1, 1, PersonList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonList_Persons(), this.getPerson(), this.getPerson_Parent(), "persons", null, 0, -1, PersonList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Parent(), this.getPersonList(), this.getPersonList_Persons(), "parent", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Roles(), this.getRole(), this.getRole_Person(), "roles", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Parent(), this.getRoleList(), this.getRoleList_Roles(), "parent", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Person(), this.getPerson(), this.getPerson_Roles(), "person", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Description(), ecorePackage.getEString(), "description", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Components(), theRepositoryPackage.getRepositoryComponent(), null, "components", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleListEClass, RoleList.class, "RoleList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleList_Parent(), this.getStaffSpecification(), this.getStaffSpecification_RoleList(), "parent", null, 1, 1, RoleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleList_Roles(), this.getRole(), this.getRole_Parent(), "roles", null, 0, -1, RoleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(developerEClass, Developer.class, "Developer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buildConfiguratorEClass, BuildConfigurator.class, "BuildConfigurator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testDeveloperEClass, TestDeveloper.class, "TestDeveloper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testerEClass, Tester.class, "Tester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(releaseConfiguratorEClass, ReleaseConfigurator.class, "ReleaseConfigurator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deployerEClass, Deployer.class, "Deployer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileEClass, File.class, "File", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Technology(), ecorePackage.getEString(), "technology", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileAggregationEClass, FileAggregation.class, "FileAggregation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileAggregation_NumberOfFiles(), ecorePackage.getEInt(), "numberOfFiles", null, 0, 1, FileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAggregation_Technology(), ecorePackage.getEString(), "technology", null, 0, 1, FileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCase_NameOfTest(), ecorePackage.getEString(), "nameOfTest", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCaseAggregationEClass, TestCaseAggregation.class, "TestCaseAggregation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCaseAggregation_NumberOfTestcases(), ecorePackage.getEInt(), "numberOfTestcases", null, 0, 1, TestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestCaseAggregation_NameOfTestSuite(), ecorePackage.getEString(), "nameOfTestSuite", null, 0, 1, TestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FieldofactivityannotationsPackageImpl
