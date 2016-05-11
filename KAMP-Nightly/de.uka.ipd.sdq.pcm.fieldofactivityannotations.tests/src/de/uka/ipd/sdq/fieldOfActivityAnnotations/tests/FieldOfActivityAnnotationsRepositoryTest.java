/**
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations.tests;

import de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsFactory;
import de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldOfActivityAnnotationsRepositoryTest extends TestCase {

	/**
	 * The fixture for this Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldOfActivityAnnotationsRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FieldOfActivityAnnotationsRepositoryTest.class);
	}

	/**
	 * Constructs a new Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationsRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FieldOfActivityAnnotationsRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldOfActivityAnnotationsRepository getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FieldOfActivityAnnotationsFactory.eINSTANCE.createFieldOfActivityAnnotationsRepository());
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

} //FieldOfActivityAnnotationsRepositoryTest
