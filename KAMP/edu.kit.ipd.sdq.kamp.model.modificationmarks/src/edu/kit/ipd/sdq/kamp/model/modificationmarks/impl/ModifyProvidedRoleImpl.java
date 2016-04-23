/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyProvidedRole;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifySignature;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModifyProvidedRoleImpl#getProvidedrole <em>Providedrole</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModifyProvidedRoleImpl#getSignatureModifications <em>Signature Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifyProvidedRoleImpl extends ModificationImpl implements ModifyProvidedRole {
	/**
	 * The cached value of the '{@link #getProvidedrole() <em>Providedrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedrole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole providedrole;

	/**
	 * The cached value of the '{@link #getSignatureModifications() <em>Signature Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifySignature> signatureModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyProvidedRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.MODIFY_PROVIDED_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getProvidedrole() {
		if (providedrole != null && ((EObject)providedrole).eIsProxy()) {
			InternalEObject oldProvidedrole = (InternalEObject)providedrole;
			providedrole = (ProvidedRole)eResolveProxy(oldProvidedrole);
			if (providedrole != oldProvidedrole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, modificationmarksPackage.MODIFY_PROVIDED_ROLE__PROVIDEDROLE, oldProvidedrole, providedrole));
			}
		}
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetProvidedrole() {
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedrole(ProvidedRole newProvidedrole) {
		ProvidedRole oldProvidedrole = providedrole;
		providedrole = newProvidedrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modificationmarksPackage.MODIFY_PROVIDED_ROLE__PROVIDEDROLE, oldProvidedrole, providedrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifySignature> getSignatureModifications() {
		if (signatureModifications == null) {
			signatureModifications = new EObjectContainmentEList<ModifySignature>(ModifySignature.class, this, modificationmarksPackage.MODIFY_PROVIDED_ROLE__SIGNATURE_MODIFICATIONS);
		}
		return signatureModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modificationmarksPackage.MODIFY_PROVIDED_ROLE__SIGNATURE_MODIFICATIONS:
				return ((InternalEList<?>)getSignatureModifications()).basicRemove(otherEnd, msgs);
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
			case modificationmarksPackage.MODIFY_PROVIDED_ROLE__PROVIDEDROLE:
				if (resolve) return getProvidedrole();
				return basicGetProvidedrole();
			case modificationmarksPackage.MODIFY_PROVIDED_ROLE__SIGNATURE_MODIFICATIONS:
				return getSignatureModifications();
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
			case modificationmarksPackage.MODIFY_PROVIDED_ROLE__PROVIDEDROLE:
				setProvidedrole((ProvidedRole)newValue);
				return;
			case modificationmarksPackage.MODIFY_PROVIDED_ROLE__SIGNATURE_MODIFICATIONS:
				getSignatureModifications().clear();
				getSignatureModifications().addAll((Collection<? extends ModifySignature>)newValue);
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
			case modificationmarksPackage.MODIFY_PROVIDED_ROLE__PROVIDEDROLE:
				setProvidedrole((ProvidedRole)null);
				return;
			case modificationmarksPackage.MODIFY_PROVIDED_ROLE__SIGNATURE_MODIFICATIONS:
				getSignatureModifications().clear();
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
			case modificationmarksPackage.MODIFY_PROVIDED_ROLE__PROVIDEDROLE:
				return providedrole != null;
			case modificationmarksPackage.MODIFY_PROVIDED_ROLE__SIGNATURE_MODIFICATIONS:
				return signatureModifications != null && !signatureModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModifyProvidedRoleImpl
