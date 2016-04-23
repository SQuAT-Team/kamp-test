/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks;

import de.uka.ipd.sdq.pcm.core.composition.AssemblyConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyAssemblyConnector#getAssemblyconnector <em>Assemblyconnector</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModifyAssemblyConnector()
 * @model
 * @generated
 */
public interface ModifyAssemblyConnector extends Modification {
	/**
	 * Returns the value of the '<em><b>Assemblyconnector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assemblyconnector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblyconnector</em>' reference.
	 * @see #setAssemblyconnector(AssemblyConnector)
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage#getModifyAssemblyConnector_Assemblyconnector()
	 * @model
	 * @generated
	 */
	AssemblyConnector getAssemblyconnector();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyAssemblyConnector#getAssemblyconnector <em>Assemblyconnector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assemblyconnector</em>' reference.
	 * @see #getAssemblyconnector()
	 * @generated
	 */
	void setAssemblyconnector(AssemblyConnector value);

} // ModifyAssemblyConnector
