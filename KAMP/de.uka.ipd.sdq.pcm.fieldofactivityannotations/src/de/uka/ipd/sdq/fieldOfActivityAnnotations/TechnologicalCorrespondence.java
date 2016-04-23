/**
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations;

import de.uka.ipd.sdq.identifier.Identifier;

import de.uka.ipd.sdq.pcm.repository.ImplementationComponentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technological Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence#getTechnologicalCorrespondenceType <em>Technological Correspondence Type</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTechnologicalCorrespondence()
 * @model
 * @generated
 */
public interface TechnologicalCorrespondence extends Identifier {
	/**
	 * Returns the value of the '<em><b>Technological Correspondence Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondenceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technological Correspondence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technological Correspondence Type</em>' attribute.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondenceTypes
	 * @see #setTechnologicalCorrespondenceType(TechnologicalCorrespondenceTypes)
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTechnologicalCorrespondence_TechnologicalCorrespondenceType()
	 * @model ordered="false"
	 * @generated
	 */
	TechnologicalCorrespondenceTypes getTechnologicalCorrespondenceType();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence#getTechnologicalCorrespondenceType <em>Technological Correspondence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technological Correspondence Type</em>' attribute.
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondenceTypes
	 * @see #getTechnologicalCorrespondenceType()
	 * @generated
	 */
	void setTechnologicalCorrespondenceType(TechnologicalCorrespondenceTypes value);

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
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTechnologicalCorrespondence_Component()
	 * @model ordered="false"
	 * @generated
	 */
	ImplementationComponentType getComponent();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.TechnologicalCorrespondence#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ImplementationComponentType value);

} // TechnologicalCorrespondence
