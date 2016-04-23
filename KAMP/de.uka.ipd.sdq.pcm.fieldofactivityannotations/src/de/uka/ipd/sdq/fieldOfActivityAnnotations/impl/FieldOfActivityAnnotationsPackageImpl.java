/**
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations.impl;

import de.uka.ipd.sdq.fieldOfActivityAnnotations.BuildConfiguration;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.DesignPatternRole;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsFactory;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstance;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstanceAggregation;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFile;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFileAggregation;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondenceTypes;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.TestType;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.pcm.PcmPackage;

import de.uka.ipd.sdq.pcm.repository.RepositoryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldOfActivityAnnotationsPackageImpl extends EPackageImpl implements FieldOfActivityAnnotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldOfActivityAnnotationsRepositoryEClass = null;

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
	private EClass buildConfigurationEClass = null;

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
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designPatternRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologicalCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum technologicalCorrespondenceTypesEEnum = null;

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
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FieldOfActivityAnnotationsPackageImpl() {
		super(eNS_URI, FieldOfActivityAnnotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FieldOfActivityAnnotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FieldOfActivityAnnotationsPackage init() {
		if (isInited) return (FieldOfActivityAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(FieldOfActivityAnnotationsPackage.eNS_URI);

		// Obtain or create and register package
		FieldOfActivityAnnotationsPackageImpl theFieldOfActivityAnnotationsPackage = (FieldOfActivityAnnotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FieldOfActivityAnnotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FieldOfActivityAnnotationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFieldOfActivityAnnotationsPackage.createPackageContents();

		// Initialize created meta-data
		theFieldOfActivityAnnotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFieldOfActivityAnnotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FieldOfActivityAnnotationsPackage.eNS_URI, theFieldOfActivityAnnotationsPackage);
		return theFieldOfActivityAnnotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldOfActivityAnnotationsRepository() {
		return fieldOfActivityAnnotationsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationsRepository_SourceFiles() {
		return (EReference)fieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationsRepository_SourceFileAggregations() {
		return (EReference)fieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationsRepository_BuildConfigurations() {
		return (EReference)fieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationsRepository_RuntimeInstances() {
		return (EReference)fieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationsRepository_RuntimeInstanceAggregations() {
		return (EReference)fieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationsRepository_TestCases() {
		return (EReference)fieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationsRepository_TestCaseAggregations() {
		return (EReference)fieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationsRepository_DesignPatternRoles() {
		return (EReference)fieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationsRepository_TechnologicalCorrespondences() {
		return (EReference)fieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationsRepository_StaffAssignment() {
		return (EReference)fieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getSourceFile_Name() {
		return (EAttribute)sourceFileEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getSourceFileAggregation_NumberOfSourceFiles() {
		return (EAttribute)sourceFileAggregationEClass.getEStructuralFeatures().get(0);
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
	public EClass getBuildConfiguration() {
		return buildConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildConfiguration_Name() {
		return (EAttribute)buildConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildConfiguration_Components() {
		return (EReference)buildConfigurationEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getRuntimeInstance_Name() {
		return (EAttribute)runtimeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeInstance_Component() {
		return (EReference)runtimeInstanceEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getRuntimeInstanceAggregation_NumberOfRuntimeInstances() {
		return (EAttribute)runtimeInstanceAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeInstanceAggregation_Component() {
		return (EReference)runtimeInstanceAggregationEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getTestCase_Name() {
		return (EAttribute)testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_ProvidedRoles() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_TestType() {
		return (EAttribute)testCaseEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getTestCaseAggregation_NumberOfTestCases() {
		return (EAttribute)testCaseAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCaseAggregation_ProvidedRoles() {
		return (EReference)testCaseAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCaseAggregation_TestType() {
		return (EAttribute)testCaseAggregationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignPatternRole() {
		return designPatternRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignPatternRole_ProvidedRole() {
		return (EReference)designPatternRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignPatternRole_Component() {
		return (EReference)designPatternRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnologicalCorrespondence() {
		return technologicalCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnologicalCorrespondence_TechnologicalCorrespondenceType() {
		return (EAttribute)technologicalCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologicalCorrespondence_Component() {
		return (EReference)technologicalCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffAssignment() {
		return staffAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffAssignment_Component() {
		return (EReference)staffAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffAssignment_TeamName() {
		return (EAttribute)staffAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffAssignment_StaffName() {
		return (EAttribute)staffAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestType() {
		return testTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTechnologicalCorrespondenceTypes() {
		return technologicalCorrespondenceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationsFactory getFieldOfActivityAnnotationsFactory() {
		return (FieldOfActivityAnnotationsFactory)getEFactoryInstance();
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
		fieldOfActivityAnnotationsRepositoryEClass = createEClass(FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY);
		createEReference(fieldOfActivityAnnotationsRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILES);
		createEReference(fieldOfActivityAnnotationsRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILE_AGGREGATIONS);
		createEReference(fieldOfActivityAnnotationsRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_CONFIGURATIONS);
		createEReference(fieldOfActivityAnnotationsRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCES);
		createEReference(fieldOfActivityAnnotationsRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCE_AGGREGATIONS);
		createEReference(fieldOfActivityAnnotationsRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASES);
		createEReference(fieldOfActivityAnnotationsRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASE_AGGREGATIONS);
		createEReference(fieldOfActivityAnnotationsRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_ROLES);
		createEReference(fieldOfActivityAnnotationsRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGICAL_CORRESPONDENCES);
		createEReference(fieldOfActivityAnnotationsRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_ASSIGNMENT);

		sourceFileEClass = createEClass(SOURCE_FILE);
		createEAttribute(sourceFileEClass, SOURCE_FILE__NAME);
		createEReference(sourceFileEClass, SOURCE_FILE__COMPONENT);

		sourceFileAggregationEClass = createEClass(SOURCE_FILE_AGGREGATION);
		createEAttribute(sourceFileAggregationEClass, SOURCE_FILE_AGGREGATION__NUMBER_OF_SOURCE_FILES);
		createEReference(sourceFileAggregationEClass, SOURCE_FILE_AGGREGATION__COMPONENT);

		buildConfigurationEClass = createEClass(BUILD_CONFIGURATION);
		createEAttribute(buildConfigurationEClass, BUILD_CONFIGURATION__NAME);
		createEReference(buildConfigurationEClass, BUILD_CONFIGURATION__COMPONENTS);

		runtimeInstanceEClass = createEClass(RUNTIME_INSTANCE);
		createEAttribute(runtimeInstanceEClass, RUNTIME_INSTANCE__NAME);
		createEReference(runtimeInstanceEClass, RUNTIME_INSTANCE__COMPONENT);

		runtimeInstanceAggregationEClass = createEClass(RUNTIME_INSTANCE_AGGREGATION);
		createEAttribute(runtimeInstanceAggregationEClass, RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_RUNTIME_INSTANCES);
		createEReference(runtimeInstanceAggregationEClass, RUNTIME_INSTANCE_AGGREGATION__COMPONENT);

		testCaseEClass = createEClass(TEST_CASE);
		createEAttribute(testCaseEClass, TEST_CASE__NAME);
		createEReference(testCaseEClass, TEST_CASE__PROVIDED_ROLES);
		createEAttribute(testCaseEClass, TEST_CASE__TEST_TYPE);

		testCaseAggregationEClass = createEClass(TEST_CASE_AGGREGATION);
		createEAttribute(testCaseAggregationEClass, TEST_CASE_AGGREGATION__NUMBER_OF_TEST_CASES);
		createEReference(testCaseAggregationEClass, TEST_CASE_AGGREGATION__PROVIDED_ROLES);
		createEAttribute(testCaseAggregationEClass, TEST_CASE_AGGREGATION__TEST_TYPE);

		designPatternRoleEClass = createEClass(DESIGN_PATTERN_ROLE);
		createEReference(designPatternRoleEClass, DESIGN_PATTERN_ROLE__PROVIDED_ROLE);
		createEReference(designPatternRoleEClass, DESIGN_PATTERN_ROLE__COMPONENT);

		technologicalCorrespondenceEClass = createEClass(TECHNOLOGICAL_CORRESPONDENCE);
		createEAttribute(technologicalCorrespondenceEClass, TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE);
		createEReference(technologicalCorrespondenceEClass, TECHNOLOGICAL_CORRESPONDENCE__COMPONENT);

		staffAssignmentEClass = createEClass(STAFF_ASSIGNMENT);
		createEReference(staffAssignmentEClass, STAFF_ASSIGNMENT__COMPONENT);
		createEAttribute(staffAssignmentEClass, STAFF_ASSIGNMENT__TEAM_NAME);
		createEAttribute(staffAssignmentEClass, STAFF_ASSIGNMENT__STAFF_NAME);

		// Create enums
		testTypeEEnum = createEEnum(TEST_TYPE);
		technologicalCorrespondenceTypesEEnum = createEEnum(TECHNOLOGICAL_CORRESPONDENCE_TYPES);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sourceFileEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		sourceFileAggregationEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		buildConfigurationEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		runtimeInstanceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		runtimeInstanceAggregationEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		testCaseEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		testCaseAggregationEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		designPatternRoleEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		technologicalCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		staffAssignmentEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(fieldOfActivityAnnotationsRepositoryEClass, FieldOfActivityAnnotationsRepository.class, "FieldOfActivityAnnotationsRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldOfActivityAnnotationsRepository_SourceFiles(), this.getSourceFile(), null, "sourceFiles", null, 0, -1, FieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationsRepository_SourceFileAggregations(), this.getSourceFileAggregation(), null, "sourceFileAggregations", null, 0, -1, FieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationsRepository_BuildConfigurations(), this.getBuildConfiguration(), null, "buildConfigurations", null, 0, -1, FieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationsRepository_RuntimeInstances(), this.getRuntimeInstance(), null, "runtimeInstances", null, 0, -1, FieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationsRepository_RuntimeInstanceAggregations(), this.getRuntimeInstanceAggregation(), null, "runtimeInstanceAggregations", null, 0, -1, FieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationsRepository_TestCases(), this.getTestCase(), null, "testCases", null, 0, -1, FieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationsRepository_TestCaseAggregations(), this.getTestCaseAggregation(), null, "testCaseAggregations", null, 0, -1, FieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationsRepository_DesignPatternRoles(), this.getDesignPatternRole(), null, "designPatternRoles", null, 0, -1, FieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationsRepository_TechnologicalCorrespondences(), this.getTechnologicalCorrespondence(), null, "technologicalCorrespondences", null, 0, -1, FieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationsRepository_StaffAssignment(), this.getStaffAssignment(), null, "staffAssignment", null, 0, -1, FieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sourceFileEClass, SourceFile.class, "SourceFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceFile_Name(), ecorePackage.getEString(), "name", null, 1, 1, SourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSourceFile_Component(), theRepositoryPackage.getImplementationComponentType(), null, "component", null, 0, 1, SourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sourceFileAggregationEClass, SourceFileAggregation.class, "SourceFileAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceFileAggregation_NumberOfSourceFiles(), ecorePackage.getEInt(), "numberOfSourceFiles", null, 1, 1, SourceFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSourceFileAggregation_Component(), theRepositoryPackage.getImplementationComponentType(), null, "component", null, 0, 1, SourceFileAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(buildConfigurationEClass, BuildConfiguration.class, "BuildConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildConfiguration_Name(), ecorePackage.getEString(), "name", null, 1, 1, BuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBuildConfiguration_Components(), theRepositoryPackage.getImplementationComponentType(), null, "components", null, 0, -1, BuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(runtimeInstanceEClass, RuntimeInstance.class, "RuntimeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntimeInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1, RuntimeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRuntimeInstance_Component(), theRepositoryPackage.getImplementationComponentType(), null, "component", null, 0, 1, RuntimeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(runtimeInstanceAggregationEClass, RuntimeInstanceAggregation.class, "RuntimeInstanceAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntimeInstanceAggregation_NumberOfRuntimeInstances(), ecorePackage.getEInt(), "numberOfRuntimeInstances", null, 1, 1, RuntimeInstanceAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRuntimeInstanceAggregation_Component(), theRepositoryPackage.getImplementationComponentType(), null, "component", null, 0, 1, RuntimeInstanceAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCase_Name(), ecorePackage.getEString(), "name", null, 1, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestCase_ProvidedRoles(), theRepositoryPackage.getProvidedRole(), null, "providedRoles", null, 0, -1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestCase_TestType(), this.getTestType(), "testType", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(testCaseAggregationEClass, TestCaseAggregation.class, "TestCaseAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCaseAggregation_NumberOfTestCases(), ecorePackage.getEInt(), "numberOfTestCases", null, 1, 1, TestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestCaseAggregation_ProvidedRoles(), theRepositoryPackage.getProvidedRole(), null, "providedRoles", null, 0, -1, TestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestCaseAggregation_TestType(), this.getTestType(), "testType", null, 0, 1, TestCaseAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(designPatternRoleEClass, DesignPatternRole.class, "DesignPatternRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignPatternRole_ProvidedRole(), theRepositoryPackage.getProvidedRole(), null, "providedRole", null, 0, 1, DesignPatternRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDesignPatternRole_Component(), theRepositoryPackage.getImplementationComponentType(), null, "component", null, 0, 1, DesignPatternRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(technologicalCorrespondenceEClass, TechnologicalCorrespondence.class, "TechnologicalCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnologicalCorrespondence_TechnologicalCorrespondenceType(), this.getTechnologicalCorrespondenceTypes(), "technologicalCorrespondenceType", null, 0, 1, TechnologicalCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTechnologicalCorrespondence_Component(), theRepositoryPackage.getImplementationComponentType(), null, "component", null, 0, 1, TechnologicalCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(staffAssignmentEClass, StaffAssignment.class, "StaffAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaffAssignment_Component(), theRepositoryPackage.getImplementationComponentType(), null, "component", null, 0, 1, StaffAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffAssignment_TeamName(), ecorePackage.getEString(), "teamName", null, 1, 1, StaffAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffAssignment_StaffName(), ecorePackage.getEString(), "staffName", null, 1, -1, StaffAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(testTypeEEnum, TestType.class, "TestType");
		addEEnumLiteral(testTypeEEnum, TestType.UNIT_TEST);
		addEEnumLiteral(testTypeEEnum, TestType.FUNCTIONAL_TEST);
		addEEnumLiteral(testTypeEEnum, TestType.INTEGRATION_TEST);
		addEEnumLiteral(testTypeEEnum, TestType.ACCEPTANCE_TEST);

		initEEnum(technologicalCorrespondenceTypesEEnum, TechnologicalCorrespondenceTypes.class, "TechnologicalCorrespondenceTypes");
		addEEnumLiteral(technologicalCorrespondenceTypesEEnum, TechnologicalCorrespondenceTypes.SET_OF_CLASSES);
		addEEnumLiteral(technologicalCorrespondenceTypesEEnum, TechnologicalCorrespondenceTypes.JAVA_PACKAGES);
		addEEnumLiteral(technologicalCorrespondenceTypesEEnum, TechnologicalCorrespondenceTypes.PLUGINS);
		addEEnumLiteral(technologicalCorrespondenceTypesEEnum, TechnologicalCorrespondenceTypes.ECLIPSE_PLUGINS);
		addEEnumLiteral(technologicalCorrespondenceTypesEEnum, TechnologicalCorrespondenceTypes.EJB);
		addEEnumLiteral(technologicalCorrespondenceTypesEEnum, TechnologicalCorrespondenceTypes.PACKAGES);
		addEEnumLiteral(technologicalCorrespondenceTypesEEnum, TechnologicalCorrespondenceTypes.NAMESPACES);
		addEEnumLiteral(technologicalCorrespondenceTypesEEnum, TechnologicalCorrespondenceTypes.DIRECTORIES);

		// Create resource
		createResource(eNS_URI);
	}

} //FieldOfActivityAnnotationsPackageImpl
