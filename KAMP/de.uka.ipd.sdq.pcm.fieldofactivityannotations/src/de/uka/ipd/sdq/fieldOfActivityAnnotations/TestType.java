/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.fieldOfActivityAnnotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;
import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Type</b></em>'.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.fieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestType()
 * @model
 * @generated
 */
public enum TestType implements Enumerator
{
	/**
	 * The '<em><b>Unit Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_TEST(0, "UnitTest", "UnitTest"),
	/**
	 * The '<em><b>Functional Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONAL_TEST(1, "FunctionalTest", "FunctionalTest"),
	/**
	 * The '<em><b>Integration Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATION_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATION_TEST(2, "IntegrationTest", "IntegrationTest"),
	/**
	 * The '<em><b>Acceptance Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTANCE_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTANCE_TEST(3, "AcceptanceTest", "AcceptanceTest");
	/**
	 * The '<em><b>Unit Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_TEST
	 * @model name="UnitTest"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_TEST_VALUE = 0;

	/**
	 * The '<em><b>Functional Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Functional Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_TEST
	 * @model name="FunctionalTest"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONAL_TEST_VALUE = 1;

	/**
	 * The '<em><b>Integration Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integration Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGRATION_TEST
	 * @model name="IntegrationTest"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATION_TEST_VALUE = 2;

	/**
	 * The '<em><b>Acceptance Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acceptance Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCEPTANCE_TEST
	 * @model name="AcceptanceTest"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTANCE_TEST_VALUE = 3;

	/**
	 * An array of all the '<em><b>Test Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TestType[] VALUES_ARRAY =
		new TestType[] {
			UNIT_TEST,
			FUNCTIONAL_TEST,
			INTEGRATION_TEST,
			ACCEPTANCE_TEST,
		};

	/**
	 * A public read-only list of all the '<em><b>Test Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TestType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Test Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestType get(int value) {
		switch (value) {
			case UNIT_TEST_VALUE: return UNIT_TEST;
			case FUNCTIONAL_TEST_VALUE: return FUNCTIONAL_TEST;
			case INTEGRATION_TEST_VALUE: return INTEGRATION_TEST;
			case ACCEPTANCE_TEST_VALUE: return ACCEPTANCE_TEST;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TestType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
