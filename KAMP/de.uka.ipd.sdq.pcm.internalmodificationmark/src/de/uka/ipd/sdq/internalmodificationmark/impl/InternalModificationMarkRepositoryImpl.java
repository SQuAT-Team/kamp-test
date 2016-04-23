/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.internalmodificationmark.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;
import de.uka.ipd.sdq.internalmodificationmark.InternalModificationMark;
import de.uka.ipd.sdq.internalmodificationmark.InternalModificationMarkRepository;
import de.uka.ipd.sdq.internalmodificationmark.InternalmodificationmarkPackage;

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
 * An implementation of the model object '<em><b>Internal Modification Mark Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.internalmodificationmark.impl.InternalModificationMarkRepositoryImpl#getInternalModificationMark <em>Internal Modification Mark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalModificationMarkRepositoryImpl extends IdentifierImpl implements InternalModificationMarkRepository {
	/**
	 * The cached value of the '{@link #getInternalModificationMark() <em>Internal Modification Mark</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalModificationMark()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalModificationMark> internalModificationMark;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalModificationMarkRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalmodificationmarkPackage.Literals.INTERNAL_MODIFICATION_MARK_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalModificationMark> getInternalModificationMark() {
		if (internalModificationMark == null) {
			internalModificationMark = new EObjectContainmentEList<InternalModificationMark>(InternalModificationMark.class, this, InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK_REPOSITORY__INTERNAL_MODIFICATION_MARK);
		}
		return internalModificationMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK_REPOSITORY__INTERNAL_MODIFICATION_MARK:
				return ((InternalEList<?>)getInternalModificationMark()).basicRemove(otherEnd, msgs);
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
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK_REPOSITORY__INTERNAL_MODIFICATION_MARK:
				return getInternalModificationMark();
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
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK_REPOSITORY__INTERNAL_MODIFICATION_MARK:
				getInternalModificationMark().clear();
				getInternalModificationMark().addAll((Collection<? extends InternalModificationMark>)newValue);
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
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK_REPOSITORY__INTERNAL_MODIFICATION_MARK:
				getInternalModificationMark().clear();
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
			case InternalmodificationmarkPackage.INTERNAL_MODIFICATION_MARK_REPOSITORY__INTERNAL_MODIFICATION_MARK:
				return internalModificationMark != null && !internalModificationMark.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InternalModificationMarkRepositoryImpl
