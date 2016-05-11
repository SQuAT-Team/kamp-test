/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.tests;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifySignature;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.modificationmarksFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modify Signature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModifySignatureTest extends ModificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModifySignatureTest.class);
	}

	/**
	 * Constructs a new Modify Signature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySignatureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Modify Signature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModifySignature getFixture() {
		return (ModifySignature)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(modificationmarksFactory.eINSTANCE.createModifySignature());
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

} //ModifySignatureTest
