/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks;

import de.uka.ipd.sdq.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyDatatype#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModifyDatatype()
 * @model
 * @generated
 */
public interface ModifyDatatype extends Modification {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DataType)
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModifyDatatype_Datatype()
	 * @model
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyDatatype#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

} // ModifyDatatype
