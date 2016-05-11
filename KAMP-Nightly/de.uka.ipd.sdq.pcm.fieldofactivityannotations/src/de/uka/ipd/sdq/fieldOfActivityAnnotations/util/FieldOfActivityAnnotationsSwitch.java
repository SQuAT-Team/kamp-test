/**
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations.util;

import de.uka.ipd.sdq.fieldOfActivityAnnotations.*;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage
 * @generated
 */
public class FieldOfActivityAnnotationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FieldOfActivityAnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationsSwitch() {
		if (modelPackage == null) {
			modelPackage = FieldOfActivityAnnotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY: {
				FieldOfActivityAnnotationsRepository fieldOfActivityAnnotationsRepository = (FieldOfActivityAnnotationsRepository)theEObject;
				T result = caseFieldOfActivityAnnotationsRepository(fieldOfActivityAnnotationsRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FieldOfActivityAnnotationsPackage.SOURCE_FILE: {
				SourceFile sourceFile = (SourceFile)theEObject;
				T result = caseSourceFile(sourceFile);
				if (result == null) result = caseIdentifier(sourceFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FieldOfActivityAnnotationsPackage.SOURCE_FILE_AGGREGATION: {
				SourceFileAggregation sourceFileAggregation = (SourceFileAggregation)theEObject;
				T result = caseSourceFileAggregation(sourceFileAggregation);
				if (result == null) result = caseIdentifier(sourceFileAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FieldOfActivityAnnotationsPackage.BUILD_CONFIGURATION: {
				BuildConfiguration buildConfiguration = (BuildConfiguration)theEObject;
				T result = caseBuildConfiguration(buildConfiguration);
				if (result == null) result = caseIdentifier(buildConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FieldOfActivityAnnotationsPackage.RUNTIME_INSTANCE: {
				RuntimeInstance runtimeInstance = (RuntimeInstance)theEObject;
				T result = caseRuntimeInstance(runtimeInstance);
				if (result == null) result = caseIdentifier(runtimeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FieldOfActivityAnnotationsPackage.RUNTIME_INSTANCE_AGGREGATION: {
				RuntimeInstanceAggregation runtimeInstanceAggregation = (RuntimeInstanceAggregation)theEObject;
				T result = caseRuntimeInstanceAggregation(runtimeInstanceAggregation);
				if (result == null) result = caseIdentifier(runtimeInstanceAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FieldOfActivityAnnotationsPackage.TEST_CASE: {
				TestCase testCase = (TestCase)theEObject;
				T result = caseTestCase(testCase);
				if (result == null) result = caseIdentifier(testCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION: {
				TestCaseAggregation testCaseAggregation = (TestCaseAggregation)theEObject;
				T result = caseTestCaseAggregation(testCaseAggregation);
				if (result == null) result = caseIdentifier(testCaseAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FieldOfActivityAnnotationsPackage.DESIGN_PATTERN_ROLE: {
				DesignPatternRole designPatternRole = (DesignPatternRole)theEObject;
				T result = caseDesignPatternRole(designPatternRole);
				if (result == null) result = caseIdentifier(designPatternRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FieldOfActivityAnnotationsPackage.TECHNOLOGICAL_CORRESPONDENCE: {
				TechnologicalCorrespondence technologicalCorrespondence = (TechnologicalCorrespondence)theEObject;
				T result = caseTechnologicalCorrespondence(technologicalCorrespondence);
				if (result == null) result = caseIdentifier(technologicalCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FieldOfActivityAnnotationsPackage.STAFF_ASSIGNMENT: {
				StaffAssignment staffAssignment = (StaffAssignment)theEObject;
				T result = caseStaffAssignment(staffAssignment);
				if (result == null) result = caseIdentifier(staffAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldOfActivityAnnotationsRepository(FieldOfActivityAnnotationsRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceFile(SourceFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source File Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceFileAggregation(SourceFileAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildConfiguration(BuildConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeInstance(RuntimeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Instance Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Instance Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeInstanceAggregation(RuntimeInstanceAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestCase(TestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Case Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Case Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestCaseAggregation(TestCaseAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Pattern Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Pattern Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignPatternRole(DesignPatternRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technological Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technological Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologicalCorrespondence(TechnologicalCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffAssignment(StaffAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FieldOfActivityAnnotationsSwitch
