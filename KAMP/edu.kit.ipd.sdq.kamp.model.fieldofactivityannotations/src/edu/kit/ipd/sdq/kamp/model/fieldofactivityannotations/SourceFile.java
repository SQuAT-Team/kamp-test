/**
 */
package edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations;

import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.SourceFile#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.SourceFile#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getSourceFile()
 * @model
 * @generated
 */
public interface SourceFile extends File {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.DevelopmentArtefactSpecification#getSourceFiles <em>Source Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DevelopmentArtefactSpecification)
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getSourceFile_Parent()
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.DevelopmentArtefactSpecification#getSourceFiles
	 * @model opposite="sourceFiles" required="true" transient="false"
	 * @generated
	 */
	DevelopmentArtefactSpecification getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.SourceFile#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DevelopmentArtefactSpecification value);

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
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getSourceFile_Component()
	 * @model
	 * @generated
	 */
	RepositoryComponent getComponent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.SourceFile#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(RepositoryComponent value);

} // SourceFile
