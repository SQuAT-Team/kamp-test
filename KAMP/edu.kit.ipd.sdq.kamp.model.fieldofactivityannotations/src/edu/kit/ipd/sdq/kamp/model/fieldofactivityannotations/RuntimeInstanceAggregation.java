/**
 */
package edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations;

import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Instance Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RuntimeInstanceAggregation#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RuntimeInstanceAggregation#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RuntimeInstanceAggregation#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RuntimeInstanceAggregation#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getRuntimeInstanceAggregation()
 * @model
 * @generated
 */
public interface RuntimeInstanceAggregation extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.DeploymentSpecification#getRuntimeInstanceAggregations <em>Runtime Instance Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DeploymentSpecification)
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getRuntimeInstanceAggregation_Parent()
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.DeploymentSpecification#getRuntimeInstanceAggregations
	 * @model opposite="runtimeInstanceAggregations" required="true" transient="false"
	 * @generated
	 */
	DeploymentSpecification getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RuntimeInstanceAggregation#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DeploymentSpecification value);

	/**
	 * Returns the value of the '<em><b>Number Of Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Instances</em>' attribute.
	 * @see #setNumberOfInstances(int)
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getRuntimeInstanceAggregation_NumberOfInstances()
	 * @model
	 * @generated
	 */
	int getNumberOfInstances();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RuntimeInstanceAggregation#getNumberOfInstances <em>Number Of Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Instances</em>' attribute.
	 * @see #getNumberOfInstances()
	 * @generated
	 */
	void setNumberOfInstances(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getRuntimeInstanceAggregation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RuntimeInstanceAggregation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.repository.RepositoryComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getRuntimeInstanceAggregation_Components()
	 * @model
	 * @generated
	 */
	EList<RepositoryComponent> getComponents();

} // RuntimeInstanceAggregation
