/**
 */
package edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.DeploymentSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RuntimeInstance;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.RuntimeInstanceAggregation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.DeploymentSpecificationImpl#getRuntimeInstances <em>Runtime Instances</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.DeploymentSpecificationImpl#getRuntimeInstanceAggregations <em>Runtime Instance Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.DeploymentSpecificationImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentSpecificationImpl extends EObjectImpl implements DeploymentSpecification {
	/**
	 * The cached value of the '{@link #getRuntimeInstances() <em>Runtime Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeInstance> runtimeInstances;

	/**
	 * The cached value of the '{@link #getRuntimeInstanceAggregations() <em>Runtime Instance Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInstanceAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeInstanceAggregation> runtimeInstanceAggregations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.DEPLOYMENT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeInstance> getRuntimeInstances() {
		if (runtimeInstances == null) {
			runtimeInstances = new EObjectContainmentWithInverseEList<RuntimeInstance>(RuntimeInstance.class, this, FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES, FieldofactivityannotationsPackage.RUNTIME_INSTANCE__PARENT);
		}
		return runtimeInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeInstanceAggregation> getRuntimeInstanceAggregations() {
		if (runtimeInstanceAggregations == null) {
			runtimeInstanceAggregations = new EObjectContainmentWithInverseEList<RuntimeInstanceAggregation>(RuntimeInstanceAggregation.class, this, FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS, FieldofactivityannotationsPackage.RUNTIME_INSTANCE_AGGREGATION__PARENT);
		}
		return runtimeInstanceAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepository getParent() {
		if (eContainerFeatureID() != FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT) return null;
		return (FieldOfActivityAnnotationRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FieldOfActivityAnnotationRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FieldOfActivityAnnotationRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEPLOYMENT_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRuntimeInstances()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRuntimeInstanceAggregations()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((FieldOfActivityAnnotationRepository)otherEnd, msgs);
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
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES:
				return ((InternalEList<?>)getRuntimeInstances()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS:
				return ((InternalEList<?>)getRuntimeInstanceAggregations()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT:
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
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEPLOYMENT_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
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
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES:
				return getRuntimeInstances();
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS:
				return getRuntimeInstanceAggregations();
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT:
				return getParent();
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
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES:
				getRuntimeInstances().clear();
				getRuntimeInstances().addAll((Collection<? extends RuntimeInstance>)newValue);
				return;
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS:
				getRuntimeInstanceAggregations().clear();
				getRuntimeInstanceAggregations().addAll((Collection<? extends RuntimeInstanceAggregation>)newValue);
				return;
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)newValue);
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
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES:
				getRuntimeInstances().clear();
				return;
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS:
				getRuntimeInstanceAggregations().clear();
				return;
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)null);
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
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES:
				return runtimeInstances != null && !runtimeInstances.isEmpty();
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS:
				return runtimeInstanceAggregations != null && !runtimeInstanceAggregations.isEmpty();
			case FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //DeploymentSpecificationImpl
