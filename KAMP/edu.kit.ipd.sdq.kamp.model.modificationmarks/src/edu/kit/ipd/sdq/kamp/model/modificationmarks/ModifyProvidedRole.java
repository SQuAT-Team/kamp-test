/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks;

import de.uka.ipd.sdq.pcm.repository.ProvidedRole;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Provided Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyProvidedRole#getProvidedrole <em>Providedrole</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyProvidedRole#getSignatureModifications <em>Signature Modifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModifyProvidedRole()
 * @model
 * @generated
 */
public interface ModifyProvidedRole extends Modification {
	/**
	 * Returns the value of the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providedrole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedrole</em>' reference.
	 * @see #setProvidedrole(ProvidedRole)
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModifyProvidedRole_Providedrole()
	 * @model required="true"
	 * @generated
	 */
	ProvidedRole getProvidedrole();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyProvidedRole#getProvidedrole <em>Providedrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providedrole</em>' reference.
	 * @see #getProvidedrole()
	 * @generated
	 */
	void setProvidedrole(ProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Signature Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifySignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModifyProvidedRole_SignatureModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifySignature> getSignatureModifications();

} // ModifyProvidedRole
