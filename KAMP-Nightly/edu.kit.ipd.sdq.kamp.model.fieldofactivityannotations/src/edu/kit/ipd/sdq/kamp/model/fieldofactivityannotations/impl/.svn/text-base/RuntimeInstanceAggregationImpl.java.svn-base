/**
 */
package edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.DeploymentSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RuntimeInstanceAggregation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Instance Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.RuntimeInstanceAggregationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.RuntimeInstanceAggregationImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.RuntimeInstanceAggregationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.RuntimeInstanceAggregationImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeInstanceAggregationImpl extends EObjectImpl implements RuntimeInstanceAggregation {
	/**
	 * The default value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_INSTANCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected int numberOfInstances = NUMBER_OF_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryComponent> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeInstanceAggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.RUNTIME_INSTANCE_AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification getParent() {
		if (eContainerFeatureID() != FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__PARENT) return null;
		return (DeploymentSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(DeploymentSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(DeploymentSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS, DeploymentSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfInstances() {
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfInstances(int newNumberOfInstances) {
		int oldNumberOfInstances = numberOfInstances;
		numberOfInstances = newNumberOfInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_INSTANCES, oldNumberOfInstances, numberOfInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepositoryComponent> getComponents() {
		if (components == null) {
			components = new EObjectResolvingEList<RepositoryComponent>(RepositoryComponent.class, this, FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((DeploymentSpecification)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__PARENT:
				return eInternalContainer().eInverseRemove(this, FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS, DeploymentSpecification.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__PARENT:
				return getParent();
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_INSTANCES:
				return getNumberOfInstances();
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__DESCRIPTION:
				return getDescription();
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__COMPONENTS:
				return getComponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__PARENT:
				setParent((DeploymentSpecification)newValue);
				return;
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_INSTANCES:
				setNumberOfInstances((Integer)newValue);
				return;
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends RepositoryComponent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__PARENT:
				setParent((DeploymentSpecification)null);
				return;
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_INSTANCES:
				setNumberOfInstances(NUMBER_OF_INSTANCES_EDEFAULT);
				return;
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__COMPONENTS:
				getComponents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__PARENT:
				return getParent() != null;
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_INSTANCES:
				return numberOfInstances != NUMBER_OF_INSTANCES_EDEFAULT;
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__COMPONENTS:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numberOfInstances: ");
		result.append(numberOfInstances);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RuntimeInstanceAggregationImpl
