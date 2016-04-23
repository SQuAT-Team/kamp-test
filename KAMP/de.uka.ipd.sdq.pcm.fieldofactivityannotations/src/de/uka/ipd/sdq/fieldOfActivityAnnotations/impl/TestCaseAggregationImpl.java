/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations.impl;

import de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.TestCaseAggregation;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.TestType;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import de.uka.ipd.sdq.pcm.repository.ProvidedRole;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TestCaseAggregationImpl#getNumberOfTestCases <em>Number Of Test Cases</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TestCaseAggregationImpl#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.fieldOfActivityAnnotations.impl.TestCaseAggregationImpl#getTestType <em>Test Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestCaseAggregationImpl extends IdentifierImpl implements TestCaseAggregation {
	/**
	 * The default value of the '{@link #getNumberOfTestCases() <em>Number Of Test Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTestCases()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_TEST_CASES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfTestCases() <em>Number Of Test Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTestCases()
	 * @generated
	 * @ordered
	 */
	protected int numberOfTestCases = NUMBER_OF_TEST_CASES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProvidedRoles() <em>Provided Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedRole> providedRoles;

	/**
	 * The default value of the '{@link #getTestType() <em>Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestType()
	 * @generated
	 * @ordered
	 */
	protected static final TestType TEST_TYPE_EDEFAULT = TestType.UNIT_TEST;

	/**
	 * The cached value of the '{@link #getTestType() <em>Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestType()
	 * @generated
	 * @ordered
	 */
	protected TestType testType = TEST_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseAggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldOfActivityAnnotationsPackage.Literals.TEST_CASE_AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfTestCases() {
		return numberOfTestCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfTestCases(int newNumberOfTestCases) {
		int oldNumberOfTestCases = numberOfTestCases;
		numberOfTestCases = newNumberOfTestCases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__NUMBER_OF_TEST_CASES, oldNumberOfTestCases, numberOfTestCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestType getTestType() {
		return testType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestType(TestType newTestType) {
		TestType oldTestType = testType;
		testType = newTestType == null ? TEST_TYPE_EDEFAULT : newTestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__TEST_TYPE, oldTestType, testType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedRole> getProvidedRoles() {
		if (providedRoles == null) {
			providedRoles = new EObjectResolvingEList<ProvidedRole>(ProvidedRole.class, this, FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__PROVIDED_ROLES);
		}
		return providedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__NUMBER_OF_TEST_CASES:
				return getNumberOfTestCases();
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__PROVIDED_ROLES:
				return getProvidedRoles();
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__TEST_TYPE:
				return getTestType();
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
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__NUMBER_OF_TEST_CASES:
				setNumberOfTestCases((Integer)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__PROVIDED_ROLES:
				getProvidedRoles().clear();
				getProvidedRoles().addAll((Collection<? extends ProvidedRole>)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__TEST_TYPE:
				setTestType((TestType)newValue);
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
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__NUMBER_OF_TEST_CASES:
				setNumberOfTestCases(NUMBER_OF_TEST_CASES_EDEFAULT);
				return;
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__PROVIDED_ROLES:
				getProvidedRoles().clear();
				return;
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__TEST_TYPE:
				setTestType(TEST_TYPE_EDEFAULT);
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
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__NUMBER_OF_TEST_CASES:
				return numberOfTestCases != NUMBER_OF_TEST_CASES_EDEFAULT;
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__PROVIDED_ROLES:
				return providedRoles != null && !providedRoles.isEmpty();
			case FieldOfActivityAnnotationsPackage.TEST_CASE_AGGREGATION__TEST_TYPE:
				return testType != TEST_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numberOfTestCases: ");
		result.append(numberOfTestCases);
		result.append(", testType: ");
		result.append(testType);
		result.append(')');
		return result.toString();
	}

} //TestCaseAggregationImpl
