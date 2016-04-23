/**
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations;

import de.uka.ipd.sdq.identifier.Identifier;

import de.uka.ipd.sdq.pcm.repository.ImplementationComponentType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment#getComponent <em>Component</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment#getTeamName <em>Team Name</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment#getStaffName <em>Staff Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getStaffAssignment()
 * @model
 * @generated
 */
public interface StaffAssignment extends Identifier {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ImplementationComponentType)
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getStaffAssignment_Component()
	 * @model ordered="false"
	 * @generated
	 */
	ImplementationComponentType getComponent();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ImplementationComponentType value);

	/**
	 * Returns the value of the '<em><b>Team Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Name</em>' attribute.
	 * @see #setTeamName(String)
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getStaffAssignment_TeamName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTeamName();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.StaffAssignment#getTeamName <em>Team Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Name</em>' attribute.
	 * @see #getTeamName()
	 * @generated
	 */
	void setTeamName(String value);

	/**
	 * Returns the value of the '<em><b>Staff Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Name</em>' attribute list.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getStaffAssignment_StaffName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<String> getStaffName();

} // StaffAssignment
