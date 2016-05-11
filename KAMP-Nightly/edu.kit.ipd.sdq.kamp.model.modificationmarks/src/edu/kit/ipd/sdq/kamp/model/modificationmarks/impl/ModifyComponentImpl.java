/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyProvidedRole;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyRequiredRole;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModifyComponentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModifyComponentImpl#getProvidedroleModifications <em>Providedrole Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModifyComponentImpl#getRequiredroleModifications <em>Requiredrole Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifyComponentImpl extends ModificationImpl implements ModifyComponent {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected RepositoryComponent component;

	/**
	 * The cached value of the '{@link #getProvidedroleModifications() <em>Providedrole Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedroleModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyProvidedRole> providedroleModifications;

	/**
	 * The cached value of the '{@link #getRequiredroleModifications() <em>Requiredrole Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredroleModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyRequiredRole> requiredroleModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.MODIFY_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent getComponent() {
		if (component != null && ((EObject)component).eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (RepositoryComponent)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, modificationmarksPackage.MODIFY_COMPONENT__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(RepositoryComponent newComponent) {
		RepositoryComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modificationmarksPackage.MODIFY_COMPONENT__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyProvidedRole> getProvidedroleModifications() {
		if (providedroleModifications == null) {
			providedroleModifications = new EObjectContainmentEList<ModifyProvidedRole>(ModifyProvidedRole.class, this, modificationmarksPackage.MODIFY_COMPONENT__PROVIDEDROLE_MODIFICATIONS);
		}
		return providedroleModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyRequiredRole> getRequiredroleModifications() {
		if (requiredroleModifications == null) {
			requiredroleModifications = new EObjectContainmentEList<ModifyRequiredRole>(ModifyRequiredRole.class, this, modificationmarksPackage.MODIFY_COMPONENT__REQUIREDROLE_MODIFICATIONS);
		}
		return requiredroleModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modificationmarksPackage.MODIFY_COMPONENT__PROVIDEDROLE_MODIFICATIONS:
				return ((InternalEList<?>)getProvidedroleModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.MODIFY_COMPONENT__REQUIREDROLE_MODIFICATIONS:
				return ((InternalEList<?>)getRequiredroleModifications()).basicRemove(otherEnd, msgs);
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
			case modificationmarksPackage.MODIFY_COMPONENT__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case modificationmarksPackage.MODIFY_COMPONENT__PROVIDEDROLE_MODIFICATIONS:
				return getProvidedroleModifications();
			case modificationmarksPackage.MODIFY_COMPONENT__REQUIREDROLE_MODIFICATIONS:
				return getRequiredroleModifications();
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
			case modificationmarksPackage.MODIFY_COMPONENT__COMPONENT:
				setComponent((RepositoryComponent)newValue);
				return;
			case modificationmarksPackage.MODIFY_COMPONENT__PROVIDEDROLE_MODIFICATIONS:
				getProvidedroleModifications().clear();
				getProvidedroleModifications().addAll((Collection<? extends ModifyProvidedRole>)newValue);
				return;
			case modificationmarksPackage.MODIFY_COMPONENT__REQUIREDROLE_MODIFICATIONS:
				getRequiredroleModifications().clear();
				getRequiredroleModifications().addAll((Collection<? extends ModifyRequiredRole>)newValue);
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
			case modificationmarksPackage.MODIFY_COMPONENT__COMPONENT:
				setComponent((RepositoryComponent)null);
				return;
			case modificationmarksPackage.MODIFY_COMPONENT__PROVIDEDROLE_MODIFICATIONS:
				getProvidedroleModifications().clear();
				return;
			case modificationmarksPackage.MODIFY_COMPONENT__REQUIREDROLE_MODIFICATIONS:
				getRequiredroleModifications().clear();
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
			case modificationmarksPackage.MODIFY_COMPONENT__COMPONENT:
				return component != null;
			case modificationmarksPackage.MODIFY_COMPONENT__PROVIDEDROLE_MODIFICATIONS:
				return providedroleModifications != null && !providedroleModifications.isEmpty();
			case modificationmarksPackage.MODIFY_COMPONENT__REQUIREDROLE_MODIFICATIONS:
				return requiredroleModifications != null && !requiredroleModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModifyComponentImpl
