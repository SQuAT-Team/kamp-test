/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.tests;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Change Propagation Due To Data Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangePropagationDueToDataDependenciesTest extends ChangePropagationStepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChangePropagationDueToDataDependenciesTest.class);
	}

	/**
	 * Constructs a new Change Propagation Due To Data Dependencies test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePropagationDueToDataDependenciesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Change Propagation Due To Data Dependencies test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChangePropagationDueToDataDependencies getFixture() {
		return (ChangePropagationDueToDataDependencies)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(modificationmarksFactory.eINSTANCE.createChangePropagationDueToDataDependencies());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ChangePropagationDueToDataDependenciesTest
