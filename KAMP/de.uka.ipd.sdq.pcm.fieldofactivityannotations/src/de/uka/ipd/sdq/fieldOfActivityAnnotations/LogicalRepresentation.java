/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations;

import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.LogicalRepresentation#getLogicalRepresentationName <em>Logical Representation Name</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.LogicalRepresentation#getRepositoryComponent <em>Repository Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getLogicalRepresentation()
 * @model
 * @generated
 */
public interface LogicalRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Logical Representation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Representation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Representation Name</em>' attribute.
	 * @see #setLogicalRepresentationName(String)
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getLogicalRepresentation_LogicalRepresentationName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLogicalRepresentationName();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.LogicalRepresentation#getLogicalRepresentationName <em>Logical Representation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Representation Name</em>' attribute.
	 * @see #getLogicalRepresentationName()
	 * @generated
	 */
	void setLogicalRepresentationName(String value);

	/**
	 * Returns the value of the '<em><b>Repository Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Component</em>' reference.
	 * @see #setRepositoryComponent(RepositoryComponent)
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getLogicalRepresentation_RepositoryComponent()
	 * @model ordered="false"
	 * @generated
	 */
	RepositoryComponent getRepositoryComponent();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.LogicalRepresentation#getRepositoryComponent <em>Repository Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Component</em>' reference.
	 * @see #getRepositoryComponent()
	 * @generated
	 */
	void setRepositoryComponent(RepositoryComponent value);

} // LogicalRepresentation
