/**
 */
package edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.BuildSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.DeploymentSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.DevelopmentArtefactSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.ReleaseSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.StaffSpecification;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.TestSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Of Activity Annotation Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl#getBuildSpecification <em>Build Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl#getTestSpecification <em>Test Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl#getReleaseSpecification <em>Release Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl#getDeploymentSpecification <em>Deployment Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl#getStaffSpecification <em>Staff Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldOfActivityAnnotationRepositoryImpl extends EObjectImpl implements FieldOfActivityAnnotationRepository {
	/**
	 * The cached value of the '{@link #getDevelopmentArtefactSpecification() <em>Development Artefact Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentArtefactSpecification()
	 * @generated
	 * @ordered
	 */
	protected DevelopmentArtefactSpecification developmentArtefactSpecification;

	/**
	 * The cached value of the '{@link #getBuildSpecification() <em>Build Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildSpecification()
	 * @generated
	 * @ordered
	 */
	protected BuildSpecification buildSpecification;

	/**
	 * The cached value of the '{@link #getTestSpecification() <em>Test Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestSpecification()
	 * @generated
	 * @ordered
	 */
	protected TestSpecification testSpecification;

	/**
	 * The cached value of the '{@link #getReleaseSpecification() <em>Release Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseSpecification()
	 * @generated
	 * @ordered
	 */
	protected ReleaseSpecification releaseSpecification;

	/**
	 * The cached value of the '{@link #getDeploymentSpecification() <em>Deployment Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentSpecification()
	 * @generated
	 * @ordered
	 */
	protected DeploymentSpecification deploymentSpecification;

	/**
	 * The cached value of the '{@link #getStaffSpecification() <em>Staff Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffSpecification()
	 * @generated
	 * @ordered
	 */
	protected StaffSpecification staffSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldOfActivityAnnotationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentArtefactSpecification getDevelopmentArtefactSpecification() {
		return developmentArtefactSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevelopmentArtefactSpecification(DevelopmentArtefactSpecification newDevelopmentArtefactSpecification, NotificationChain msgs) {
		DevelopmentArtefactSpecification oldDevelopmentArtefactSpecification = developmentArtefactSpecification;
		developmentArtefactSpecification = newDevelopmentArtefactSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, oldDevelopmentArtefactSpecification, newDevelopmentArtefactSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopmentArtefactSpecification(DevelopmentArtefactSpecification newDevelopmentArtefactSpecification) {
		if (newDevelopmentArtefactSpecification != developmentArtefactSpecification) {
			NotificationChain msgs = null;
			if (developmentArtefactSpecification != null)
				msgs = ((InternalEObject)developmentArtefactSpecification).eInverseRemove(this, FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT, DevelopmentArtefactSpecification.class, msgs);
			if (newDevelopmentArtefactSpecification != null)
				msgs = ((InternalEObject)newDevelopmentArtefactSpecification).eInverseAdd(this, FieldofactivityannotationsPackage.DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT, DevelopmentArtefactSpecification.class, msgs);
			msgs = basicSetDevelopmentArtefactSpecification(newDevelopmentArtefactSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, newDevelopmentArtefactSpecification, newDevelopmentArtefactSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildSpecification getBuildSpecification() {
		return buildSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildSpecification(BuildSpecification newBuildSpecification, NotificationChain msgs) {
		BuildSpecification oldBuildSpecification = buildSpecification;
		buildSpecification = newBuildSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__BUILD_SPECIFICATION, oldBuildSpecification, newBuildSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildSpecification(BuildSpecification newBuildSpecification) {
		if (newBuildSpecification != buildSpecification) {
			NotificationChain msgs = null;
			if (buildSpecification != null)
				msgs = ((InternalEObject)buildSpecification).eInverseRemove(this, FieldofactivityannotationsPackage.BUILD_SPECIFICATION__PARENT, BuildSpecification.class, msgs);
			if (newBuildSpecification != null)
				msgs = ((InternalEObject)newBuildSpecification).eInverseAdd(this, FieldofactivityannotationsPackage.BUILD_SPECIFICATION__PARENT, BuildSpecification.class, msgs);
			msgs = basicSetBuildSpecification(newBuildSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__BUILD_SPECIFICATION, newBuildSpecification, newBuildSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSpecification getTestSpecification() {
		return testSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestSpecification(TestSpecification newTestSpecification, NotificationChain msgs) {
		TestSpecification oldTestSpecification = testSpecification;
		testSpecification = newTestSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION, oldTestSpecification, newTestSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestSpecification(TestSpecification newTestSpecification) {
		if (newTestSpecification != testSpecification) {
			NotificationChain msgs = null;
			if (testSpecification != null)
				msgs = ((InternalEObject)testSpecification).eInverseRemove(this, FieldofactivityannotationsPackage.TEST_SPECIFICATION__PARENT, TestSpecification.class, msgs);
			if (newTestSpecification != null)
				msgs = ((InternalEObject)newTestSpecification).eInverseAdd(this, FieldofactivityannotationsPackage.TEST_SPECIFICATION__PARENT, TestSpecification.class, msgs);
			msgs = basicSetTestSpecification(newTestSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION, newTestSpecification, newTestSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseSpecification getReleaseSpecification() {
		return releaseSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseSpecification(ReleaseSpecification newReleaseSpecification, NotificationChain msgs) {
		ReleaseSpecification oldReleaseSpecification = releaseSpecification;
		releaseSpecification = newReleaseSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__RELEASE_SPECIFICATION, oldReleaseSpecification, newReleaseSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseSpecification(ReleaseSpecification newReleaseSpecification) {
		if (newReleaseSpecification != releaseSpecification) {
			NotificationChain msgs = null;
			if (releaseSpecification != null)
				msgs = ((InternalEObject)releaseSpecification).eInverseRemove(this, FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT, ReleaseSpecification.class, msgs);
			if (newReleaseSpecification != null)
				msgs = ((InternalEObject)newReleaseSpecification).eInverseAdd(this, FieldofactivityannotationsPackage.RELEASE_SPECIFICATION__PARENT, ReleaseSpecification.class, msgs);
			msgs = basicSetReleaseSpecification(newReleaseSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__RELEASE_SPECIFICATION, newReleaseSpecification, newReleaseSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification getDeploymentSpecification() {
		return deploymentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentSpecification(DeploymentSpecification newDeploymentSpecification, NotificationChain msgs) {
		DeploymentSpecification oldDeploymentSpecification = deploymentSpecification;
		deploymentSpecification = newDeploymentSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEPLOYMENT_SPECIFICATION, oldDeploymentSpecification, newDeploymentSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentSpecification(DeploymentSpecification newDeploymentSpecification) {
		if (newDeploymentSpecification != deploymentSpecification) {
			NotificationChain msgs = null;
			if (deploymentSpecification != null)
				msgs = ((InternalEObject)deploymentSpecification).eInverseRemove(this, FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT, DeploymentSpecification.class, msgs);
			if (newDeploymentSpecification != null)
				msgs = ((InternalEObject)newDeploymentSpecification).eInverseAdd(this, FieldofactivityannotationsPackage.DEPLOYMENT_SPECIFICATION__PARENT, DeploymentSpecification.class, msgs);
			msgs = basicSetDeploymentSpecification(newDeploymentSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEPLOYMENT_SPECIFICATION, newDeploymentSpecification, newDeploymentSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffSpecification getStaffSpecification() {
		return staffSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaffSpecification(StaffSpecification newStaffSpecification, NotificationChain msgs) {
		StaffSpecification oldStaffSpecification = staffSpecification;
		staffSpecification = newStaffSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION, oldStaffSpecification, newStaffSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffSpecification(StaffSpecification newStaffSpecification) {
		if (newStaffSpecification != staffSpecification) {
			NotificationChain msgs = null;
			if (staffSpecification != null)
				msgs = ((InternalEObject)staffSpecification).eInverseRemove(this, FieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT, StaffSpecification.class, msgs);
			if (newStaffSpecification != null)
				msgs = ((InternalEObject)newStaffSpecification).eInverseAdd(this, FieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT, StaffSpecification.class, msgs);
			msgs = basicSetStaffSpecification(newStaffSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION, newStaffSpecification, newStaffSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				if (developmentArtefactSpecification != null)
					msgs = ((InternalEObject)developmentArtefactSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, null, msgs);
				return basicSetDevelopmentArtefactSpecification((DevelopmentArtefactSpecification)otherEnd, msgs);
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__BUILD_SPECIFICATION:
				if (buildSpecification != null)
					msgs = ((InternalEObject)buildSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__BUILD_SPECIFICATION, null, msgs);
				return basicSetBuildSpecification((BuildSpecification)otherEnd, msgs);
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
				if (testSpecification != null)
					msgs = ((InternalEObject)testSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION, null, msgs);
				return basicSetTestSpecification((TestSpecification)otherEnd, msgs);
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__RELEASE_SPECIFICATION:
				if (releaseSpecification != null)
					msgs = ((InternalEObject)releaseSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__RELEASE_SPECIFICATION, null, msgs);
				return basicSetReleaseSpecification((ReleaseSpecification)otherEnd, msgs);
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEPLOYMENT_SPECIFICATION:
				if (deploymentSpecification != null)
					msgs = ((InternalEObject)deploymentSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEPLOYMENT_SPECIFICATION, null, msgs);
				return basicSetDeploymentSpecification((DeploymentSpecification)otherEnd, msgs);
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				if (staffSpecification != null)
					msgs = ((InternalEObject)staffSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION, null, msgs);
				return basicSetStaffSpecification((StaffSpecification)otherEnd, msgs);
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
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				return basicSetDevelopmentArtefactSpecification(null, msgs);
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__BUILD_SPECIFICATION:
				return basicSetBuildSpecification(null, msgs);
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
				return basicSetTestSpecification(null, msgs);
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__RELEASE_SPECIFICATION:
				return basicSetReleaseSpecification(null, msgs);
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEPLOYMENT_SPECIFICATION:
				return basicSetDeploymentSpecification(null, msgs);
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				return basicSetStaffSpecification(null, msgs);
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
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				return getDevelopmentArtefactSpecification();
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__BUILD_SPECIFICATION:
				return getBuildSpecification();
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
				return getTestSpecification();
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__RELEASE_SPECIFICATION:
				return getReleaseSpecification();
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEPLOYMENT_SPECIFICATION:
				return getDeploymentSpecification();
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				return getStaffSpecification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				setDevelopmentArtefactSpecification((DevelopmentArtefactSpecification)newValue);
				return;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__BUILD_SPECIFICATION:
				setBuildSpecification((BuildSpecification)newValue);
				return;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
				setTestSpecification((TestSpecification)newValue);
				return;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__RELEASE_SPECIFICATION:
				setReleaseSpecification((ReleaseSpecification)newValue);
				return;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEPLOYMENT_SPECIFICATION:
				setDeploymentSpecification((DeploymentSpecification)newValue);
				return;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				setStaffSpecification((StaffSpecification)newValue);
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
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				setDevelopmentArtefactSpecification((DevelopmentArtefactSpecification)null);
				return;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__BUILD_SPECIFICATION:
				setBuildSpecification((BuildSpecification)null);
				return;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
				setTestSpecification((TestSpecification)null);
				return;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__RELEASE_SPECIFICATION:
				setReleaseSpecification((ReleaseSpecification)null);
				return;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEPLOYMENT_SPECIFICATION:
				setDeploymentSpecification((DeploymentSpecification)null);
				return;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				setStaffSpecification((StaffSpecification)null);
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
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				return developmentArtefactSpecification != null;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__BUILD_SPECIFICATION:
				return buildSpecification != null;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
				return testSpecification != null;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__RELEASE_SPECIFICATION:
				return releaseSpecification != null;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEPLOYMENT_SPECIFICATION:
				return deploymentSpecification != null;
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				return staffSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldOfActivityAnnotationRepositoryImpl
