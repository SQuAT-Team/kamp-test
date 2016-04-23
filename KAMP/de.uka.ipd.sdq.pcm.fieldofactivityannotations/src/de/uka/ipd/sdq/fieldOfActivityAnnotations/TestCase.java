/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations;

import de.uka.ipd.sdq.identifier.Identifier;

import de.uka.ipd.sdq.pcm.repository.ProvidedRole;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase#getName <em>Name</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase#getTestType <em>Test Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends Identifier {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestCase_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Test Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Type</em>' attribute.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestType
	 * @see #setTestType(TestType)
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestCase_TestType()
	 * @model ordered="false"
	 * @generated
	 */
	TestType getTestType();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCase#getTestType <em>Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Type</em>' attribute.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TestType
	 * @see #getTestType()
	 * @generated
	 */
	void setTestType(TestType value);

	/**
	 * Returns the value of the '<em><b>Provided Roles</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.repository.ProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Roles</em>' reference list.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestCase_ProvidedRoles()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ProvidedRole> getProvidedRoles();

} // TestCase
