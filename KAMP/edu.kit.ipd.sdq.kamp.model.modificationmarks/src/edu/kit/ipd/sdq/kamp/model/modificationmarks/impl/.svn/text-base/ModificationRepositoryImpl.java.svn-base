/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationRepositoryImpl#getSeedModifications <em>Seed Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationRepositoryImpl#getChangePropagationSteps <em>Change Propagation Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModificationRepositoryImpl extends EObjectImpl implements ModificationRepository {
	/**
	 * The cached value of the '{@link #getSeedModifications() <em>Seed Modifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedModifications()
	 * @generated
	 * @ordered
	 */
	protected SeedModifications seedModifications;

	/**
	 * The cached value of the '{@link #getChangePropagationSteps() <em>Change Propagation Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangePropagationSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangePropagationStep> changePropagationSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModificationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.MODIFICATION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeedModifications getSeedModifications() {
		return seedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeedModifications(SeedModifications newSeedModifications, NotificationChain msgs) {
		SeedModifications oldSeedModifications = seedModifications;
		seedModifications = newSeedModifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, modificationmarksPackage.MODIFICATION_REPOSITORY__SEED_MODIFICATIONS, oldSeedModifications, newSeedModifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeedModifications(SeedModifications newSeedModifications) {
		if (newSeedModifications != seedModifications) {
			NotificationChain msgs = null;
			if (seedModifications != null)
				msgs = ((InternalEObject)seedModifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - modificationmarksPackage.MODIFICATION_REPOSITORY__SEED_MODIFICATIONS, null, msgs);
			if (newSeedModifications != null)
				msgs = ((InternalEObject)newSeedModifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - modificationmarksPackage.MODIFICATION_REPOSITORY__SEED_MODIFICATIONS, null, msgs);
			msgs = basicSetSeedModifications(newSeedModifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modificationmarksPackage.MODIFICATION_REPOSITORY__SEED_MODIFICATIONS, newSeedModifications, newSeedModifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangePropagationStep> getChangePropagationSteps() {
		if (changePropagationSteps == null) {
			changePropagationSteps = new EObjectContainmentEList<ChangePropagationStep>(ChangePropagationStep.class, this, modificationmarksPackage.MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS);
		}
		return changePropagationSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modificationmarksPackage.MODIFICATION_REPOSITORY__SEED_MODIFICATIONS:
				return basicSetSeedModifications(null, msgs);
			case modificationmarksPackage.MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS:
				return ((InternalEList<?>)getChangePropagationSteps()).basicRemove(otherEnd, msgs);
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
			case modificationmarksPackage.MODIFICATION_REPOSITORY__SEED_MODIFICATIONS:
				return getSeedModifications();
			case modificationmarksPackage.MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS:
				return getChangePropagationSteps();
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
			case modificationmarksPackage.MODIFICATION_REPOSITORY__SEED_MODIFICATIONS:
				setSeedModifications((SeedModifications)newValue);
				return;
			case modificationmarksPackage.MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS:
				getChangePropagationSteps().clear();
				getChangePropagationSteps().addAll((Collection<? extends ChangePropagationStep>)newValue);
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
			case modificationmarksPackage.MODIFICATION_REPOSITORY__SEED_MODIFICATIONS:
				setSeedModifications((SeedModifications)null);
				return;
			case modificationmarksPackage.MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS:
				getChangePropagationSteps().clear();
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
			case modificationmarksPackage.MODIFICATION_REPOSITORY__SEED_MODIFICATIONS:
				return seedModifications != null;
			case modificationmarksPackage.MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS:
				return changePropagationSteps != null && !changePropagationSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModificationRepositoryImpl
