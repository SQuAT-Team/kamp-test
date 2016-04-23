/**
 */
package edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.BuildSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.BuildSpecification#getBuildConfigurations <em>Build Configurations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.BuildSpecification#getThirdPartyComponentOrLibraries <em>Third Party Component Or Libraries</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getBuildSpecification()
 * @model
 * @generated
 */
public interface BuildSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getBuildSpecification <em>Build Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getBuildSpecification_Parent()
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getBuildSpecification
	 * @model opposite="buildSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.BuildSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationRepository value);

	/**
	 * Returns the value of the '<em><b>Build Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.BuildConfiguration}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.BuildConfiguration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Configurations</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getBuildSpecification_BuildConfigurations()
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.BuildConfiguration#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BuildConfiguration> getBuildConfigurations();

	/**
	 * Returns the value of the '<em><b>Third Party Component Or Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.ThirdPartyComponentOrLibrary}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.ThirdPartyComponentOrLibrary#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third Party Component Or Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Party Component Or Libraries</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getBuildSpecification_ThirdPartyComponentOrLibraries()
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.ThirdPartyComponentOrLibrary#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ThirdPartyComponentOrLibrary> getThirdPartyComponentOrLibraries();

} // BuildSpecification
