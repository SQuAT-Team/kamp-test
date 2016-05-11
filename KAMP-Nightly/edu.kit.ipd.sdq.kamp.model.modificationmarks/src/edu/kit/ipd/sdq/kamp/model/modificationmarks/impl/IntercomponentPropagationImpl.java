/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.IntercomponentPropagation;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyAssemblyConnector;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intercomponent Propagation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.IntercomponentPropagationImpl#getAssemblyConnectorModifications <em>Assembly Connector Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntercomponentPropagationImpl extends ChangePropagationStepImpl implements IntercomponentPropagation {
	/**
	 * The cached value of the '{@link #getAssemblyConnectorModifications() <em>Assembly Connector Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyConnectorModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyAssemblyConnector> assemblyConnectorModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntercomponentPropagationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.INTERCOMPONENT_PROPAGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyAssemblyConnector> getAssemblyConnectorModifications() {
		if (assemblyConnectorModifications == null) {
			assemblyConnectorModifications = new EObjectContainmentEList<ModifyAssemblyConnector>(ModifyAssemblyConnector.class, this, modificationmarksPackage.INTERCOMPONENT_PROPAGATION__ASSEMBLY_CONNECTOR_MODIFICATIONS);
		}
		return assemblyConnectorModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modificationmarksPackage.INTERCOMPONENT_PROPAGATION__ASSEMBLY_CONNECTOR_MODIFICATIONS:
				return ((InternalEList<?>)getAssemblyConnectorModifications()).basicRemove(otherEnd, msgs);
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
			case modificationmarksPackage.INTERCOMPONENT_PROPAGATION__ASSEMBLY_CONNECTOR_MODIFICATIONS:
				return getAssemblyConnectorModifications();
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
			case modificationmarksPackage.INTERCOMPONENT_PROPAGATION__ASSEMBLY_CONNECTOR_MODIFICATIONS:
				getAssemblyConnectorModifications().clear();
				getAssemblyConnectorModifications().addAll((Collection<? extends ModifyAssemblyConnector>)newValue);
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
			case modificationmarksPackage.INTERCOMPONENT_PROPAGATION__ASSEMBLY_CONNECTOR_MODIFICATIONS:
				getAssemblyConnectorModifications().clear();
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
			case modificationmarksPackage.INTERCOMPONENT_PROPAGATION__ASSEMBLY_CONNECTOR_MODIFICATIONS:
				return assemblyConnectorModifications != null && !assemblyConnectorModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntercomponentPropagationImpl
