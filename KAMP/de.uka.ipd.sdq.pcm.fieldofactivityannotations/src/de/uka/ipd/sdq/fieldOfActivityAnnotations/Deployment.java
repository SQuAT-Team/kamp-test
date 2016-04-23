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
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.Deployment#getNumberOfDeploymentNodes <em>Number Of Deployment Nodes</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.Deployment#getRepositoryComponent <em>Repository Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Deployment Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Deployment Nodes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Deployment Nodes</em>' attribute.
	 * @see #setNumberOfDeploymentNodes(int)
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getDeployment_NumberOfDeploymentNodes()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfDeploymentNodes();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.Deployment#getNumberOfDeploymentNodes <em>Number Of Deployment Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Deployment Nodes</em>' attribute.
	 * @see #getNumberOfDeploymentNodes()
	 * @generated
	 */
	void setNumberOfDeploymentNodes(int value);

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
	 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getDeployment_RepositoryComponent()
	 * @model ordered="false"
	 * @generated
	 */
	RepositoryComponent getRepositoryComponent();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.Deployment#getRepositoryComponent <em>Repository Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Component</em>' reference.
	 * @see #getRepositoryComponent()
	 * @generated
	 */
	void setRepositoryComponent(RepositoryComponent value);

} // Deployment
