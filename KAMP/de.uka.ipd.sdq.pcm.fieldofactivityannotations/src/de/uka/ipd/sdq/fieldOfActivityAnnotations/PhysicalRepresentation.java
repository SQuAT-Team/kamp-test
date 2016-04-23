/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.PhysicalRepresentation#getNumberOfSourceFiles <em>Number Of Source Files</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.PhysicalRepresentation#getNumberOfConfigurationFiles <em>Number Of Configuration Files</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.PhysicalRepresentation#isHasSourceFiles <em>Has Source Files</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.PhysicalRepresentation#getRepositoryComponent <em>Repository Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getPhysicalRepresentation()
 * @model
 * @generated
 */
public interface PhysicalRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Source Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Source Files</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Source Files</em>' attribute.
	 * @see #setNumberOfSourceFiles(int)
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getPhysicalRepresentation_NumberOfSourceFiles()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfSourceFiles();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.PhysicalRepresentation#getNumberOfSourceFiles <em>Number Of Source Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Source Files</em>' attribute.
	 * @see #getNumberOfSourceFiles()
	 * @generated
	 */
	void setNumberOfSourceFiles(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Configuration Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Configuration Files</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Configuration Files</em>' attribute.
	 * @see #setNumberOfConfigurationFiles(int)
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getPhysicalRepresentation_NumberOfConfigurationFiles()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfConfigurationFiles();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.PhysicalRepresentation#getNumberOfConfigurationFiles <em>Number Of Configuration Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Configuration Files</em>' attribute.
	 * @see #getNumberOfConfigurationFiles()
	 * @generated
	 */
	void setNumberOfConfigurationFiles(int value);

	/**
	 * Returns the value of the '<em><b>Has Source Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Source Files</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Source Files</em>' attribute.
	 * @see #setHasSourceFiles(boolean)
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getPhysicalRepresentation_HasSourceFiles()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isHasSourceFiles();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.PhysicalRepresentation#isHasSourceFiles <em>Has Source Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Source Files</em>' attribute.
	 * @see #isHasSourceFiles()
	 * @generated
	 */
	void setHasSourceFiles(boolean value);

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
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getPhysicalRepresentation_RepositoryComponent()
	 * @model ordered="false"
	 * @generated
	 */
	RepositoryComponent getRepositoryComponent();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.PhysicalRepresentation#getRepositoryComponent <em>Repository Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Component</em>' reference.
	 * @see #getRepositoryComponent()
	 * @generated
	 */
	void setRepositoryComponent(RepositoryComponent value);

} // PhysicalRepresentation
