/**
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations.impl;

import de.uka.ipd.sdq.fieldOfActivityAnnotations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class FieldOfActivityAnnotationsFactoryImpl extends EFactoryImpl implements FieldOfActivityAnnotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FieldOfActivityAnnotationsFactory init() {
		try {
			FieldOfActivityAnnotationsFactory theFieldOfActivityAnnotationsFactory = (FieldOfActivityAnnotationsFactory)EPackage.Registry.INSTANCE.getEFactory(FieldOfActivityAnnotationsPackage.eNS_URI);
			if (theFieldOfActivityAnnotationsFactory != null) {
				return theFieldOfActivityAnnotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FieldOfActivityAnnotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationsFactoryImpl() {
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
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY: return createFieldOfActivityAnnotationsRepository();
			case FieldOfActivityAnnotationsPackage.SOURCE_FILE: return createSourceFile();
			case FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION: return createSourceFileAggregation();
			case FieldOfActivityAnnotationsPackage.BUILD_CONFIGURATION: return createBuildConfiguration();
			case FieldOfActivityAnnotationsPackage.RUNTIME_INSTANCE: return createRuntimeInstance();
			case FieldOfActivityAnnotationsPackage.RUNTIME_INSTANCE_AGGREGATION: return createRuntimeInstanceAggregation();
			case FieldOfActivityAnnotationsPackage.TEST_CASE: return createTestCase();
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION: return createTestCaseAggregation();
			case FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE: return createDesignPatternRole();
			case FieldOfActivityAnnotationsPackage.TECHNOLOGICAL_CORRESPONDENCE: return createTechnologicalCorrespondence();
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT: return createStaffAssignment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FieldOfActivityAnnotationsPackage.TEST_TYPE:
				return createTestTypeFromString(eDataType, initialValue);
			case FieldOfActivityAnnotationsPackage.TECHNOLOGICAL_CORRESPONDENCE_TYPES:
				return createTechnologicalCorrespondenceTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FieldOfActivityAnnotationsPackage.TEST_TYPE:
				return convertTestTypeToString(eDataType, instanceValue);
			case FieldOfActivityAnnotationsPackage.TECHNOLOGICAL_CORRESPONDENCE_TYPES:
				return convertTechnologicalCorrespondenceTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationsRepository createFieldOfActivityAnnotationsRepository() {
		FieldOfActivityAnnotationsRepositoryImpl fieldOfActivityAnnotationsRepository = new FieldOfActivityAnnotationsRepositoryImpl();
		return fieldOfActivityAnnotationsRepository;
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
	public BuildConfiguration createBuildConfiguration() {
		BuildConfigurationImpl buildConfiguration = new BuildConfigurationImpl();
		return buildConfiguration;
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
	public TestCase createTestCase() {
		TestCaseImpl testCase = new TestCaseImpl();
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCaseAggregation createTestCaseAggregation() {
		TestCaseAggregationImpl testCaseAggregation = new TestCaseAggregationImpl();
		return testCaseAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPatternRole createDesignPatternRole() {
		DesignPatternRoleImpl designPatternRole = new DesignPatternRoleImpl();
		return designPatternRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologicalCorrespondence createTechnologicalCorrespondence() {
		TechnologicalCorrespondenceImpl technologicalCorrespondence = new TechnologicalCorrespondenceImpl();
		return technologicalCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffAssignment createStaffAssignment() {
		StaffAssignmentImpl staffAssignment = new StaffAssignmentImpl();
		return staffAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestType createTestTypeFromString(EDataType eDataType, String initialValue) {
		TestType result = TestType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologicalCorrespondenceTypes createTechnologicalCorrespondenceTypesFromString(EDataType eDataType, String initialValue) {
		TechnologicalCorrespondenceTypes result = TechnologicalCorrespondenceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTechnologicalCorrespondenceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationsPackage getFieldOfActivityAnnotationsPackage() {
		return (FieldOfActivityAnnotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FieldOfActivityAnnotationsPackage getPackage() {
		return FieldOfActivityAnnotationsPackage.eINSTANCE;
	}

} //FieldOfActivityAnnotationsFactoryImpl
