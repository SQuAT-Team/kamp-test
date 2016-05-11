/**
 */
package de.uka.ipd.sdq.internalmodificationmark.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import de.uka.ipd.sdq.internalmodificationmark.InternalModificationMark;
import de.uka.ipd.sdq.internalmodificationmark.InternalmodificationmarkPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Modification Mark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.internalmodificationmark.impl.InternalModificationMarkImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.internalmodificationmark.impl.InternalModificationMarkImpl#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.internalmodificationmark.impl.InternalModificationMarkImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalModificationMarkImpl extends IdentifierImpl implements InternalModificationMark {
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
	 * The cached value of the '{@link #getProvidedRole() <em>Provided Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedRole> providedRole;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> signature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalModificationMarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalmodificationmarkPackage.Literals.INTERNAL_MODIFICATION_MARK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__COMPONENT, oldComponent, component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedRole> getProvidedRole() {
		if (providedRole == null) {
			providedRole = new EObjectResolvingEList<ProvidedRole>(ProvidedRole.class, this, InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__PROVIDED_ROLE);
		}
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signature> getSignature() {
		if (signature == null) {
			signature = new EObjectResolvingEList<Signature>(Signature.class, this, InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__SIGNATURE);
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__PROVIDED_ROLE:
				return getProvidedRole();
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__SIGNATURE:
				return getSignature();
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
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__COMPONENT:
				setComponent((RepositoryComponent)newValue);
				return;
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__PROVIDED_ROLE:
				getProvidedRole().clear();
				getProvidedRole().addAll((Collection<? extends ProvidedRole>)newValue);
				return;
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__SIGNATURE:
				getSignature().clear();
				getSignature().addAll((Collection<? extends Signature>)newValue);
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
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__COMPONENT:
				setComponent((RepositoryComponent)null);
				return;
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__PROVIDED_ROLE:
				getProvidedRole().clear();
				return;
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__SIGNATURE:
				getSignature().clear();
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
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__COMPONENT:
				return component != null;
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__PROVIDED_ROLE:
				return providedRole != null && !providedRole.isEmpty();
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK__SIGNATURE:
				return signature != null && !signature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InternalModificationMarkImpl
