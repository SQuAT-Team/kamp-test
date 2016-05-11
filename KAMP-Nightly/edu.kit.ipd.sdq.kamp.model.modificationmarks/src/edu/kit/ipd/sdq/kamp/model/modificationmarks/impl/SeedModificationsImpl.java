/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyDatatype;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.SeedModificationsImpl#getDatatypeModifications <em>Datatype Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.SeedModificationsImpl#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.SeedModificationsImpl#getInterfaceModifications <em>Interface Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeedModificationsImpl extends EObjectImpl implements SeedModifications {
	/**
	 * The cached value of the '{@link #getDatatypeModifications() <em>Datatype Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyDatatype> datatypeModifications;

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
	 * The cached value of the '{@link #getInterfaceModifications() <em>Interface Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyInterface> interfaceModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeedModificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyDatatype> getDatatypeModifications() {
		if (datatypeModifications == null) {
			datatypeModifications = new EObjectContainmentEList<ModifyDatatype>(ModifyDatatype.class, this, modificationmarksPackage.SEED_MODIFICATIONS__DATATYPE_MODIFICATIONS);
		}
		return datatypeModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyComponent> getComponentModifications() {
		if (componentModifications == null) {
			componentModifications = new EObjectContainmentEList<ModifyComponent>(ModifyComponent.class, this, modificationmarksPackage.SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS);
		}
		return componentModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyInterface> getInterfaceModifications() {
		if (interfaceModifications == null) {
			interfaceModifications = new EObjectContainmentEList<ModifyInterface>(ModifyInterface.class, this, modificationmarksPackage.SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);
		}
		return interfaceModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modificationmarksPackage.SEED_MODIFICATIONS__DATATYPE_MODIFICATIONS:
				return ((InternalEList<?>)getDatatypeModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				return ((InternalEList<?>)getComponentModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return ((InternalEList<?>)getInterfaceModifications()).basicRemove(otherEnd, msgs);
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
			case modificationmarksPackage.SEED_MODIFICATIONS__DATATYPE_MODIFICATIONS:
				return getDatatypeModifications();
			case modificationmarksPackage.SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				return getComponentModifications();
			case modificationmarksPackage.SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return getInterfaceModifications();
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
			case modificationmarksPackage.SEED_MODIFICATIONS__DATATYPE_MODIFICATIONS:
				getDatatypeModifications().clear();
				getDatatypeModifications().addAll((Collection<? extends ModifyDatatype>)newValue);
				return;
			case modificationmarksPackage.SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				getComponentModifications().addAll((Collection<? extends ModifyComponent>)newValue);
				return;
			case modificationmarksPackage.SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				getInterfaceModifications().addAll((Collection<? extends ModifyInterface>)newValue);
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
			case modificationmarksPackage.SEED_MODIFICATIONS__DATATYPE_MODIFICATIONS:
				getDatatypeModifications().clear();
				return;
			case modificationmarksPackage.SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				return;
			case modificationmarksPackage.SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
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
			case modificationmarksPackage.SEED_MODIFICATIONS__DATATYPE_MODIFICATIONS:
				return datatypeModifications != null && !datatypeModifications.isEmpty();
			case modificationmarksPackage.SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				return componentModifications != null && !componentModifications.isEmpty();
			case modificationmarksPackage.SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return interfaceModifications != null && !interfaceModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SeedModificationsImpl
