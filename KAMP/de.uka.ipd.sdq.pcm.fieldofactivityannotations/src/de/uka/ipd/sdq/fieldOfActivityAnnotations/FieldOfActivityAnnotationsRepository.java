/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getSourceFiles <em>Source Files</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getSourceFileAggregations <em>Source File Aggregations</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getBuildConfigurations <em>Build Configurations</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getRuntimeInstances <em>Runtime Instances</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getRuntimeInstanceAggregations <em>Runtime Instance Aggregations</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTestCaseAggregations <em>Test Case Aggregations</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDesignPatternRoles <em>Design Pattern Roles</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTechnologicalCorrespondences <em>Technological Correspondences</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getStaffAssignment <em>Staff Assignment</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository()
 * @model
 * @generated
 */
public interface FieldOfActivityAnnotationsRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Files</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Files</em>' containment reference list.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_SourceFiles()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceFile> getSourceFiles();

	/**
	 * Returns the value of the '<em><b>Source File Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.fieldOfActivityAnnotations.SourceFileAggregation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source File Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source File Aggregations</em>' containment reference list.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_SourceFileAggregations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceFileAggregation> getSourceFileAggregations();

	/**
	 * Returns the value of the '<em><b>Build Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.fieldOfActivityAnnotations.BuildConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Configurations</em>' containment reference list.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_BuildConfigurations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BuildConfiguration> getBuildConfigurations();

	/**
	 * Returns the value of the '<em><b>Runtime Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Instances</em>' containment reference list.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_RuntimeInstances()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RuntimeInstance> getRuntimeInstances();

	/**
	 * Returns the value of the '<em><b>Runtime Instance Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.fieldOfActivityAnnotations.RuntimeInstanceAggregation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Instance Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Instance Aggregations</em>' containment reference list.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_RuntimeInstanceAggregations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RuntimeInstanceAggregation> getRuntimeInstanceAggregations();

	/**
	 * Returns the value of the '<em><b>Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Cases</em>' containment reference list.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_TestCases()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TestCase> getTestCases();

	/**
	 * Returns the value of the '<em><b>Test Case Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Case Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Case Aggregations</em>' containment reference list.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_TestCaseAggregations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TestCaseAggregation> getTestCaseAggregations();

	/**
	 * Returns the value of the '<em><b>Design Pattern Roles</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.fieldOfActivityAnnotations.DesignPatternRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Pattern Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Pattern Roles</em>' containment reference list.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_DesignPatternRoles()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DesignPatternRole> getDesignPatternRoles();

	/**
	 * Returns the value of the '<em><b>Technological Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technological Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technological Correspondences</em>' containment reference list.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_TechnologicalCorrespondences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TechnologicalCorrespondence> getTechnologicalCorrespondences();

	/**
	 * Returns the value of the '<em><b>Staff Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Assignment</em>' containment reference list.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_StaffAssignment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<StaffAssignment> getStaffAssignment();

} // FieldOfActivityAnnotationsRepository
