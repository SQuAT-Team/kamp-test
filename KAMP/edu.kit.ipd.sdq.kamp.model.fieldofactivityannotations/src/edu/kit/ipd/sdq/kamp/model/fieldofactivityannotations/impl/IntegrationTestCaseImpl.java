/**
 */
package edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl;

import de.uka.ipd.sdq.pcm.core.composition.AssemblyConnector;

import de.uka.ipd.sdq.pcm.repository.OperationProvidedRole;

import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.IntegrationTestCase;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.TestSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.IntegrationTestCaseImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.IntegrationTestCaseImpl#getProvidedrole <em>Providedrole</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.impl.IntegrationTestCaseImpl#getAssemblyConnector <em>Assembly Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegrationTestCaseImpl extends TestCaseImpl implements IntegrationTestCase {
	/**
	 * The cached value of the '{@link #getProvidedrole() <em>Providedrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedrole()
	 * @generated
	 * @ordered
	 */
	protected OperationProvidedRole providedrole;

	/**
	 * The cached value of the '{@link #getAssemblyConnector() <em>Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyConnector()
	 * @generated
	 * @ordered
	 */
	protected AssemblyConnector assemblyConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationTestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.INTEGRATION_TEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSpecification getParent() {
		if (eContainerFeatureID() != FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PARENT) return null;
		return (TestSpecification)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TestSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TestSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FieldofactivityannotationsPackage.TEST_SPECIFICATION__INTEGRATION_TEST_CASES, TestSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole getProvidedrole() {
		if (providedrole != null && providedrole.eIsProxy()) {
			InternalEObject oldProvidedrole = (InternalEObject)providedrole;
			providedrole = (OperationProvidedRole)eResolveProxy(oldProvidedrole);
			if (providedrole != oldProvidedrole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PROVIDEDROLE, oldProvidedrole, providedrole));
			}
		}
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole basicGetProvidedrole() {
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedrole(OperationProvidedRole newProvidedrole) {
		OperationProvidedRole oldProvidedrole = providedrole;
		providedrole = newProvidedrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PROVIDEDROLE, oldProvidedrole, providedrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector getAssemblyConnector() {
		if (assemblyConnector != null && assemblyConnector.eIsProxy()) {
			InternalEObject oldAssemblyConnector = (InternalEObject)assemblyConnector;
			assemblyConnector = (AssemblyConnector)eResolveProxy(oldAssemblyConnector);
			if (assemblyConnector != oldAssemblyConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__ASSEMBLY_CONNECTOR, oldAssemblyConnector, assemblyConnector));
			}
		}
		return assemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector basicGetAssemblyConnector() {
		return assemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyConnector(AssemblyConnector newAssemblyConnector) {
		AssemblyConnector oldAssemblyConnector = assemblyConnector;
		assemblyConnector = newAssemblyConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__ASSEMBLY_CONNECTOR, oldAssemblyConnector, assemblyConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TestSpecification)otherEnd, msgs);
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
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PARENT:
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
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PARENT:
				return eInternalContainer().eInverseRemove(this, FieldofactivityannotationsPackage.TEST_SPECIFICATION__INTEGRATION_TEST_CASES, TestSpecification.class, msgs);
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
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PARENT:
				return getParent();
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PROVIDEDROLE:
				if (resolve) return getProvidedrole();
				return basicGetProvidedrole();
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__ASSEMBLY_CONNECTOR:
				if (resolve) return getAssemblyConnector();
				return basicGetAssemblyConnector();
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
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PARENT:
				setParent((TestSpecification)newValue);
				return;
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PROVIDEDROLE:
				setProvidedrole((OperationProvidedRole)newValue);
				return;
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__ASSEMBLY_CONNECTOR:
				setAssemblyConnector((AssemblyConnector)newValue);
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
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PARENT:
				setParent((TestSpecification)null);
				return;
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PROVIDEDROLE:
				setProvidedrole((OperationProvidedRole)null);
				return;
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__ASSEMBLY_CONNECTOR:
				setAssemblyConnector((AssemblyConnector)null);
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
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PARENT:
				return getParent() != null;
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__PROVIDEDROLE:
				return providedrole != null;
			case FieldofactivityannotationsPackage.INTEGRATION_TEST_CASE__ASSEMBLY_CONNECTOR:
				return assemblyConnector != null;
		}
		return super.eIsSet(featureID);
	}

} //IntegrationTestCaseImpl
