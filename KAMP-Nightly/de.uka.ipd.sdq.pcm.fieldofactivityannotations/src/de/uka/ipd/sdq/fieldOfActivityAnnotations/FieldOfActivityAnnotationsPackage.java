/**
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface FieldOfActivityAnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fieldOfActivityAnnotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/FieldOfActivityAnnotations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fieldOfActivityAnnotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FieldOfActivityAnnotationsPackage eINSTANCE = de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Source Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILES = 0;

	/**
	 * The feature id for the '<em><b>Source File Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILE_AGGREGATIONS = 1;

	/**
	 * The feature id for the '<em><b>Build Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_CONFIGURATIONS = 2;

	/**
	 * The feature id for the '<em><b>Runtime Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCES = 3;

	/**
	 * The feature id for the '<em><b>Runtime Instance Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCE_AGGREGATIONS = 4;

	/**
	 * The feature id for the '<em><b>Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASES = 5;

	/**
	 * The feature id for the '<em><b>Test Case Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASE_AGGREGATIONS = 6;

	/**
	 * The feature id for the '<em><b>Design Pattern Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_ROLES = 7;

	/**
	 * The feature id for the '<em><b>Technological Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGICAL_CORRESPONDENCES = 8;

	/**
	 * The feature id for the '<em><b>Staff Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_ASSIGNMENT = 9;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.SourceFileImpl <em>Source File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.SourceFileImpl
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getSourceFile()
	 * @generated
	 */
	int SOURCE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.SourceFileAggregationImpl <em>Source File Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.SourceFileAggregationImpl
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getSourceFileAggregation()
	 * @generated
	 */
	int SOURCE_FILE_AGGREGATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_AGGREGATION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Number Of Source Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_AGGREGATION__NUMBER_OF_SOURCE_FILES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_AGGREGATION__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_AGGREGATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.BuildConfigurationImpl <em>Build Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.BuildConfigurationImpl
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getBuildConfiguration()
	 * @generated
	 */
	int BUILD_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION__COMPONENTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Build Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.RuntimeInstanceImpl <em>Runtime Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.RuntimeInstanceImpl
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getRuntimeInstance()
	 * @generated
	 */
	int RUNTIME_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Runtime Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.RuntimeInstanceAggregationImpl <em>Runtime Instance Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.RuntimeInstanceAggregationImpl
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getRuntimeInstanceAggregation()
	 * @generated
	 */
	int RUNTIME_INSTANCE_AGGREGATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_AGGREGATION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Number Of Runtime Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_RUNTIME_INSTANCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_AGGREGATION__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Runtime Instance Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_AGGREGATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TestCaseImpl
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__PROVIDED_ROLES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TEST_TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TestCaseAggregationImpl <em>Test Case Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TestCaseAggregationImpl
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestCaseAggregation()
	 * @generated
	 */
	int TEST_CASE_AGGREGATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_AGGREGATION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Number Of Test Cases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_AGGREGATION__NUMBER_OF_TEST_CASES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_AGGREGATION__PROVIDED_ROLES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_AGGREGATION__TEST_TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_AGGREGATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.DesignPatternRoleImpl <em>Design Pattern Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.DesignPatternRoleImpl
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDesignPatternRole()
	 * @generated
	 */
	int DESIGN_PATTERN_ROLE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_ROLE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_ROLE__PROVIDED_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_ROLE__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Design Pattern Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_ROLE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TechnologicalCorrespondenceImpl <em>Technological Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TechnologicalCorrespondenceImpl
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTechnologicalCorrespondence()
	 * @generated
	 */
	int TECHNOLOGICAL_CORRESPONDENCE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGICAL_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Technological Correspondence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGICAL_CORRESPONDENCE__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Technological Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGICAL_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.StaffAssignmentImpl <em>Staff Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.StaffAssignmentImpl
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getStaffAssignment()
	 * @generated
	 */
	int STAFF_ASSIGNMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ASSIGNMENT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ASSIGNMENT__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Team Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ASSIGNMENT__TEAM_NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Staff Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ASSIGNMENT__STAFF_NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Staff Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ASSIGNMENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestType <em>Test Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestType
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestType()
	 * @generated
	 */
	int TEST_TYPE = 11;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondenceTypes <em>Technological Correspondence Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondenceTypes
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTechnologicalCorrespondenceTypes()
	 * @generated
	 */
	int TECHNOLOGICAL_CORRESPONDENCE_TYPES = 12;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository
	 * @generated
	 */
	EClass getFieldOfActivityAnnotationsRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getSourceFiles <em>Source Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Files</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getSourceFiles()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_SourceFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getSourceFileAggregations <em>Source File Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source File Aggregations</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getSourceFileAggregations()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_SourceFileAggregations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getBuildConfigurations <em>Build Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Build Configurations</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getBuildConfigurations()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_BuildConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getRuntimeInstances <em>Runtime Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtime Instances</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getRuntimeInstances()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_RuntimeInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getRuntimeInstanceAggregations <em>Runtime Instance Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtime Instance Aggregations</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getRuntimeInstanceAggregations()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_RuntimeInstanceAggregations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Cases</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTestCases()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_TestCases();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTestCaseAggregations <em>Test Case Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Case Aggregations</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTestCaseAggregations()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_TestCaseAggregations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDesignPatternRoles <em>Design Pattern Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Design Pattern Roles</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDesignPatternRoles()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_DesignPatternRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTechnologicalCorrespondences <em>Technological Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technological Correspondences</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTechnologicalCorrespondences()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_TechnologicalCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getStaffAssignment <em>Staff Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff Assignment</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getStaffAssignment()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_StaffAssignment();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFile
	 * @generated
	 */
	EClass getSourceFile();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFile#getName()
	 * @see #getSourceFile()
	 * @generated
	 */
	EAttribute getSourceFile_Name();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFile#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFile#getComponent()
	 * @see #getSourceFile()
	 * @generated
	 */
	EReference getSourceFile_Component();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFileAggregation <em>Source File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File Aggregation</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFileAggregation
	 * @generated
	 */
	EClass getSourceFileAggregation();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFileAggregation#getNumberOfSourceFiles <em>Number Of Source Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Source Files</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFileAggregation#getNumberOfSourceFiles()
	 * @see #getSourceFileAggregation()
	 * @generated
	 */
	EAttribute getSourceFileAggregation_NumberOfSourceFiles();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFileAggregation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFileAggregation#getComponent()
	 * @see #getSourceFileAggregation()
	 * @generated
	 */
	EReference getSourceFileAggregation_Component();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.BuildConfiguration <em>Build Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Configuration</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.BuildConfiguration
	 * @generated
	 */
	EClass getBuildConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.BuildConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.BuildConfiguration#getName()
	 * @see #getBuildConfiguration()
	 * @generated
	 */
	EAttribute getBuildConfiguration_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.BuildConfiguration#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.BuildConfiguration#getComponents()
	 * @see #getBuildConfiguration()
	 * @generated
	 */
	EReference getBuildConfiguration_Components();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstance <em>Runtime Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Instance</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstance
	 * @generated
	 */
	EClass getRuntimeInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstance#getName()
	 * @see #getRuntimeInstance()
	 * @generated
	 */
	EAttribute getRuntimeInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstance#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstance#getComponent()
	 * @see #getRuntimeInstance()
	 * @generated
	 */
	EReference getRuntimeInstance_Component();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstanceAggregation <em>Runtime Instance Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Instance Aggregation</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstanceAggregation
	 * @generated
	 */
	EClass getRuntimeInstanceAggregation();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstanceAggregation#getNumberOfRuntimeInstances <em>Number Of Runtime Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Runtime Instances</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstanceAggregation#getNumberOfRuntimeInstances()
	 * @see #getRuntimeInstanceAggregation()
	 * @generated
	 */
	EAttribute getRuntimeInstanceAggregation_NumberOfRuntimeInstances();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstanceAggregation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstanceAggregation#getComponent()
	 * @see #getRuntimeInstanceAggregation()
	 * @generated
	 */
	EReference getRuntimeInstanceAggregation_Component();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase#getName()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase#getProvidedRoles <em>Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Roles</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase#getProvidedRoles()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_ProvidedRoles();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase#getTestType <em>Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Type</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase#getTestType()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_TestType();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation <em>Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case Aggregation</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation
	 * @generated
	 */
	EClass getTestCaseAggregation();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation#getNumberOfTestCases <em>Number Of Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Test Cases</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation#getNumberOfTestCases()
	 * @see #getTestCaseAggregation()
	 * @generated
	 */
	EAttribute getTestCaseAggregation_NumberOfTestCases();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation#getProvidedRoles <em>Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Roles</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation#getProvidedRoles()
	 * @see #getTestCaseAggregation()
	 * @generated
	 */
	EReference getTestCaseAggregation_ProvidedRoles();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation#getTestType <em>Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Type</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation#getTestType()
	 * @see #getTestCaseAggregation()
	 * @generated
	 */
	EAttribute getTestCaseAggregation_TestType();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.DesignPatternRole <em>Design Pattern Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Pattern Role</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.DesignPatternRole
	 * @generated
	 */
	EClass getDesignPatternRole();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.DesignPatternRole#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.DesignPatternRole#getProvidedRole()
	 * @see #getDesignPatternRole()
	 * @generated
	 */
	EReference getDesignPatternRole_ProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.DesignPatternRole#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.DesignPatternRole#getComponent()
	 * @see #getDesignPatternRole()
	 * @generated
	 */
	EReference getDesignPatternRole_Component();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence <em>Technological Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technological Correspondence</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence
	 * @generated
	 */
	EClass getTechnologicalCorrespondence();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence#getTechnologicalCorrespondenceType <em>Technological Correspondence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technological Correspondence Type</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence#getTechnologicalCorrespondenceType()
	 * @see #getTechnologicalCorrespondence()
	 * @generated
	 */
	EAttribute getTechnologicalCorrespondence_TechnologicalCorrespondenceType();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence#getComponent()
	 * @see #getTechnologicalCorrespondence()
	 * @generated
	 */
	EReference getTechnologicalCorrespondence_Component();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment <em>Staff Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Assignment</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment
	 * @generated
	 */
	EClass getStaffAssignment();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment#getComponent()
	 * @see #getStaffAssignment()
	 * @generated
	 */
	EReference getStaffAssignment_Component();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment#getTeamName <em>Team Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team Name</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment#getTeamName()
	 * @see #getStaffAssignment()
	 * @generated
	 */
	EAttribute getStaffAssignment_TeamName();

	/**
	 * Returns the meta object for the attribute list '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment#getStaffName <em>Staff Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Staff Name</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment#getStaffName()
	 * @see #getStaffAssignment()
	 * @generated
	 */
	EAttribute getStaffAssignment_StaffName();

	/**
	 * Returns the meta object for enum '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestType <em>Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Type</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestType
	 * @generated
	 */
	EEnum getTestType();

	/**
	 * Returns the meta object for enum '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondenceTypes <em>Technological Correspondence Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Technological Correspondence Types</em>'.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondenceTypes
	 * @generated
	 */
	EEnum getTechnologicalCorrespondenceTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FieldOfActivityAnnotationsFactory getFieldOfActivityAnnotationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getFieldOfActivityAnnotationsRepository()
		 * @generated
		 */
		EClass FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY = eINSTANCE.getFieldOfActivityAnnotationsRepository();

		/**
		 * The meta object literal for the '<em><b>Source Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILES = eINSTANCE.getFieldOfActivityAnnotationsRepository_SourceFiles();

		/**
		 * The meta object literal for the '<em><b>Source File Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__SOURCE_FILE_AGGREGATIONS = eINSTANCE.getFieldOfActivityAnnotationsRepository_SourceFileAggregations();

		/**
		 * The meta object literal for the '<em><b>Build Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_CONFIGURATIONS = eINSTANCE.getFieldOfActivityAnnotationsRepository_BuildConfigurations();

		/**
		 * The meta object literal for the '<em><b>Runtime Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCES = eINSTANCE.getFieldOfActivityAnnotationsRepository_RuntimeInstances();

		/**
		 * The meta object literal for the '<em><b>Runtime Instance Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RUNTIME_INSTANCE_AGGREGATIONS = eINSTANCE.getFieldOfActivityAnnotationsRepository_RuntimeInstanceAggregations();

		/**
		 * The meta object literal for the '<em><b>Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASES = eINSTANCE.getFieldOfActivityAnnotationsRepository_TestCases();

		/**
		 * The meta object literal for the '<em><b>Test Case Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_CASE_AGGREGATIONS = eINSTANCE.getFieldOfActivityAnnotationsRepository_TestCaseAggregations();

		/**
		 * The meta object literal for the '<em><b>Design Pattern Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_ROLES = eINSTANCE.getFieldOfActivityAnnotationsRepository_DesignPatternRoles();

		/**
		 * The meta object literal for the '<em><b>Technological Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGICAL_CORRESPONDENCES = eINSTANCE.getFieldOfActivityAnnotationsRepository_TechnologicalCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Staff Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_ASSIGNMENT = eINSTANCE.getFieldOfActivityAnnotationsRepository_StaffAssignment();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.SourceFileImpl <em>Source File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.SourceFileImpl
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getSourceFile()
		 * @generated
		 */
		EClass SOURCE_FILE = eINSTANCE.getSourceFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE__NAME = eINSTANCE.getSourceFile_Name();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_FILE__COMPONENT = eINSTANCE.getSourceFile_Component();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.SourceFileAggregationImpl <em>Source File Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.SourceFileAggregationImpl
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getSourceFileAggregation()
		 * @generated
		 */
		EClass SOURCE_FILE_AGGREGATION = eINSTANCE.getSourceFileAggregation();

		/**
		 * The meta object literal for the '<em><b>Number Of Source Files</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE_AGGREGATION__NUMBER_OF_SOURCE_FILES = eINSTANCE.getSourceFileAggregation_NumberOfSourceFiles();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_FILE_AGGREGATION__COMPONENT = eINSTANCE.getSourceFileAggregation_Component();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.BuildConfigurationImpl <em>Build Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.BuildConfigurationImpl
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getBuildConfiguration()
		 * @generated
		 */
		EClass BUILD_CONFIGURATION = eINSTANCE.getBuildConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_CONFIGURATION__NAME = eINSTANCE.getBuildConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_CONFIGURATION__COMPONENTS = eINSTANCE.getBuildConfiguration_Components();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.RuntimeInstanceImpl <em>Runtime Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.RuntimeInstanceImpl
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getRuntimeInstance()
		 * @generated
		 */
		EClass RUNTIME_INSTANCE = eINSTANCE.getRuntimeInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INSTANCE__NAME = eINSTANCE.getRuntimeInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_INSTANCE__COMPONENT = eINSTANCE.getRuntimeInstance_Component();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.RuntimeInstanceAggregationImpl <em>Runtime Instance Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.RuntimeInstanceAggregationImpl
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getRuntimeInstanceAggregation()
		 * @generated
		 */
		EClass RUNTIME_INSTANCE_AGGREGATION = eINSTANCE.getRuntimeInstanceAggregation();

		/**
		 * The meta object literal for the '<em><b>Number Of Runtime Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_RUNTIME_INSTANCES = eINSTANCE.getRuntimeInstanceAggregation_NumberOfRuntimeInstances();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_INSTANCE_AGGREGATION__COMPONENT = eINSTANCE.getRuntimeInstanceAggregation_Component();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TestCaseImpl
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__NAME = eINSTANCE.getTestCase_Name();

		/**
		 * The meta object literal for the '<em><b>Provided Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__PROVIDED_ROLES = eINSTANCE.getTestCase_ProvidedRoles();

		/**
		 * The meta object literal for the '<em><b>Test Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__TEST_TYPE = eINSTANCE.getTestCase_TestType();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TestCaseAggregationImpl <em>Test Case Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TestCaseAggregationImpl
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestCaseAggregation()
		 * @generated
		 */
		EClass TEST_CASE_AGGREGATION = eINSTANCE.getTestCaseAggregation();

		/**
		 * The meta object literal for the '<em><b>Number Of Test Cases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE_AGGREGATION__NUMBER_OF_TEST_CASES = eINSTANCE.getTestCaseAggregation_NumberOfTestCases();

		/**
		 * The meta object literal for the '<em><b>Provided Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE_AGGREGATION__PROVIDED_ROLES = eINSTANCE.getTestCaseAggregation_ProvidedRoles();

		/**
		 * The meta object literal for the '<em><b>Test Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE_AGGREGATION__TEST_TYPE = eINSTANCE.getTestCaseAggregation_TestType();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.DesignPatternRoleImpl <em>Design Pattern Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.DesignPatternRoleImpl
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDesignPatternRole()
		 * @generated
		 */
		EClass DESIGN_PATTERN_ROLE = eINSTANCE.getDesignPatternRole();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PATTERN_ROLE__PROVIDED_ROLE = eINSTANCE.getDesignPatternRole_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PATTERN_ROLE__COMPONENT = eINSTANCE.getDesignPatternRole_Component();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TechnologicalCorrespondenceImpl <em>Technological Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TechnologicalCorrespondenceImpl
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTechnologicalCorrespondence()
		 * @generated
		 */
		EClass TECHNOLOGICAL_CORRESPONDENCE = eINSTANCE.getTechnologicalCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Technological Correspondence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE = eINSTANCE.getTechnologicalCorrespondence_TechnologicalCorrespondenceType();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGICAL_CORRESPONDENCE__COMPONENT = eINSTANCE.getTechnologicalCorrespondence_Component();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.StaffAssignmentImpl <em>Staff Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.StaffAssignmentImpl
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getStaffAssignment()
		 * @generated
		 */
		EClass STAFF_ASSIGNMENT = eINSTANCE.getStaffAssignment();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_ASSIGNMENT__COMPONENT = eINSTANCE.getStaffAssignment_Component();

		/**
		 * The meta object literal for the '<em><b>Team Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_ASSIGNMENT__TEAM_NAME = eINSTANCE.getStaffAssignment_TeamName();

		/**
		 * The meta object literal for the '<em><b>Staff Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_ASSIGNMENT__STAFF_NAME = eINSTANCE.getStaffAssignment_StaffName();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestType <em>Test Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestType
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestType()
		 * @generated
		 */
		EEnum TEST_TYPE = eINSTANCE.getTestType();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondenceTypes <em>Technological Correspondence Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondenceTypes
		 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTechnologicalCorrespondenceTypes()
		 * @generated
		 */
		EEnum TECHNOLOGICAL_CORRESPONDENCE_TYPES = eINSTANCE.getTechnologicalCorrespondenceTypes();

	}

} //FieldOfActivityAnnotationsPackage
