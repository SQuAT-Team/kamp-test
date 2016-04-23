/**
 */
package edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.ReleaseConfiguration;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.ReleaseSpecification;

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
 * An implementation of the model object '<em><b>Release Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.ReleaseSpecificationImpl#getReleaseConfigurations <em>Release Configurations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.ReleaseSpecificationImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReleaseSpecificationImpl extends EObjectImpl implements ReleaseSpecification {
	/**
	 * The cached value of the '{@link #getReleaseConfigurations() <em>Release Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ReleaseConfiguration> releaseConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.RELEASE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReleaseConfiguration> getReleaseConfigurations() {
		if (releaseConfigurations == null) {
			releaseConfigurations = new EObjectContainmentWithInverseEList<ReleaseConfiguration>(ReleaseConfiguration.class, this, FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS, FieldofactivityannotationsPackage.RELEASE_CONFIGURATION__PARENT);
		}
		return releaseConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepository getParent() {
		if (eContainerFeatureID() != FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT) return null;
		return (FieldOfActivityAnnotationRepository)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FieldOfActivityAnnotationRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FieldOfActivityAnnotationRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__RELEASE_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT, newParent, newParent));
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
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReleaseConfigurations()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT:
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
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS:
				return ((InternalEList<?>)getReleaseConfigurations()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT:
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
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__RELEASE_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
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
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS:
				return getReleaseConfigurations();
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT:
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
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS:
				getReleaseConfigurations().clear();
				getReleaseConfigurations().addAll((Collection<? extends ReleaseConfiguration>)newValue);
				return;
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT:
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
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS:
				getReleaseConfigurations().clear();
				return;
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT:
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
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS:
				return releaseConfigurations != null && !releaseConfigurations.isEmpty();
			case FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReleaseSpecificationImpl
