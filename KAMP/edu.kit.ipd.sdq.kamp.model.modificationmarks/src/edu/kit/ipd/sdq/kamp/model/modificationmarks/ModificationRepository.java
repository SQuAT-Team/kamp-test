/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository#getSeedModifications <em>Seed Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository#getChangePropagationSteps <em>Change Propagation Steps</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModificationRepository()
 * @model
 * @generated
 */
public interface ModificationRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seed Modifications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Modifications</em>' containment reference.
	 * @see #setSeedModifications(SeedModifications)
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModificationRepository_SeedModifications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SeedModifications getSeedModifications();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository#getSeedModifications <em>Seed Modifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed Modifications</em>' containment reference.
	 * @see #getSeedModifications()
	 * @generated
	 */
	void setSeedModifications(SeedModifications value);

	/**
	 * Returns the value of the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Propagation Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Propagation Steps</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModificationRepository_ChangePropagationSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChangePropagationStep> getChangePropagationSteps();

} // ModificationRepository
