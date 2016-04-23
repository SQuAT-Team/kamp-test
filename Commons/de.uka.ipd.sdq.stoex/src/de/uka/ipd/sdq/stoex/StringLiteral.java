/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.StringLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.stoex.StoexPackage#getStringLiteral()
 * @model
 * @generated
 */
public interface StringLiteral extends Atom {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see de.uka.ipd.sdq.stoex.StoexPackage#getStringLiteral_Value()
     * @model required="true" ordered="false"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link de.uka.ipd.sdq.stoex.StringLiteral#getValue <em>Value</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // StringLiteral
