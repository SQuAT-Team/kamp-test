/**
 */
package edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.tests;

import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.FieldofactivityannotationsFactory;
import edu.kit.ipd.sdq.kamp.model.fieldofactivityannotations.MetadataFile;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Metadata File</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetadataFileTest extends FileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MetadataFileTest.class);
	}

	/**
	 * Constructs a new Metadata File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataFileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Metadata File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MetadataFile getFixture() {
		return (MetadataFile)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FieldofactivityannotationsFactory.eINSTANCE.createMetadataFile());
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

} //MetadataFileTest
