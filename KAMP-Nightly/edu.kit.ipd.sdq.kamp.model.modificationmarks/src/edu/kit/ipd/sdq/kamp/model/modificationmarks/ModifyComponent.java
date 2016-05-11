/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyComponent#getComponent <em>Component</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyComponent#getProvidedroleModifications <em>Providedrole Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyComponent#getRequiredroleModifications <em>Requiredrole Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModifyComponent()
 * @model
 * @generated
 */
public interface ModifyComponent extends Modification {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(RepositoryComponent)
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModifyComponent_Component()
	 * @model
	 * @generated
	 */
	RepositoryComponent getComponent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyComponent#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(RepositoryComponent value);

	/**
	 * Returns the value of the '<em><b>Providedrole Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providedrole Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedrole Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModifyComponent_ProvidedroleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyProvidedRole> getProvidedroleModifications();

	/**
	 * Returns the value of the '<em><b>Requiredrole Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyRequiredRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiredrole Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredrole Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModifyComponent_RequiredroleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyRequiredRole> getRequiredroleModifications();

} // ModifyComponent
