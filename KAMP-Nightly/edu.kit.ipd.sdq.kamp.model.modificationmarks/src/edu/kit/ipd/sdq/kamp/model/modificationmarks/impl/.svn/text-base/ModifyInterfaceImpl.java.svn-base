/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifySignature;
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

import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModifyInterfaceImpl#getOperationInterface <em>Operation Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModifyInterfaceImpl#getSignatureModifications <em>Signature Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifyInterfaceImpl extends ModificationImpl implements ModifyInterface {
	/**
	 * The cached value of the '{@link #getOperationInterface() <em>Operation Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationInterface()
	 * @generated
	 * @ordered
	 */
	protected OperationInterface operationInterface;

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
	protected ModifyInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.MODIFY_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface getOperationInterface() {
		if (operationInterface != null && ((EObject)operationInterface).eIsProxy()) {
			InternalEObject oldOperationInterface = (InternalEObject)operationInterface;
			operationInterface = (OperationInterface)eResolveProxy(oldOperationInterface);
			if (operationInterface != oldOperationInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, modificationmarksPackage.MODIFY_INTERFACE__OPERATION_INTERFACE, oldOperationInterface, operationInterface));
			}
		}
		return operationInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface basicGetOperationInterface() {
		return operationInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationInterface(OperationInterface newOperationInterface) {
		OperationInterface oldOperationInterface = operationInterface;
		operationInterface = newOperationInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modificationmarksPackage.MODIFY_INTERFACE__OPERATION_INTERFACE, oldOperationInterface, operationInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifySignature> getSignatureModifications() {
		if (signatureModifications == null) {
			signatureModifications = new EObjectContainmentEList<ModifySignature>(ModifySignature.class, this, modificationmarksPackage.MODIFY_INTERFACE__SIGNATURE_MODIFICATIONS);
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
			case modificationmarksPackage.MODIFY_INTERFACE__SIGNATURE_MODIFICATIONS:
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
			case modificationmarksPackage.MODIFY_INTERFACE__OPERATION_INTERFACE:
				if (resolve) return getOperationInterface();
				return basicGetOperationInterface();
			case modificationmarksPackage.MODIFY_INTERFACE__SIGNATURE_MODIFICATIONS:
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
			case modificationmarksPackage.MODIFY_INTERFACE__OPERATION_INTERFACE:
				setOperationInterface((OperationInterface)newValue);
				return;
			case modificationmarksPackage.MODIFY_INTERFACE__SIGNATURE_MODIFICATIONS:
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
			case modificationmarksPackage.MODIFY_INTERFACE__OPERATION_INTERFACE:
				setOperationInterface((OperationInterface)null);
				return;
			case modificationmarksPackage.MODIFY_INTERFACE__SIGNATURE_MODIFICATIONS:
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
			case modificationmarksPackage.MODIFY_INTERFACE__OPERATION_INTERFACE:
				return operationInterface != null;
			case modificationmarksPackage.MODIFY_INTERFACE__SIGNATURE_MODIFICATIONS:
				return signatureModifications != null && !signatureModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModifyInterfaceImpl
