/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationDueToInterfaceDependencies;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Propagation Due To Interface Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationDueToInterfaceDependenciesImpl#getComponentModifications <em>Component Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangePropagationDueToInterfaceDependenciesImpl extends ChangePropagationStepImpl implements ChangePropagationDueToInterfaceDependencies {
	/**
	 * The cached value of the '{@link #getComponentModifications() <em>Component Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyComponent> componentModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangePropagationDueToInterfaceDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyComponent> getComponentModifications() {
		if (componentModifications == null) {
			componentModifications = new EObjectContainmentEList<ModifyComponent>(ModifyComponent.class, this, modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS);
		}
		return componentModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				return ((InternalEList<?>)getComponentModifications()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				return getComponentModifications();
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
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				getComponentModifications().addAll((Collection<? extends ModifyComponent>)newValue);
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
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
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
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				return componentModifications != null && !componentModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChangePropagationDueToInterfaceDependenciesImpl
