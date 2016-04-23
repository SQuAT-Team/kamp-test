/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Sample</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.probfunction.Sample#getProbability <em>Probability</em>}</li>
 * <li>{@link de.uka.ipd.sdq.probfunction.Sample#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.probfunction.ProbfunctionPackage#getSample()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Sample<T> extends CDOObject {

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
     * @see #setValue(Object)
     * @see de.uka.ipd.sdq.probfunction.ProbfunctionPackage#getSample_Value()
     * @model
     * @generated
     */
    T getValue();

    /**
     * Sets the value of the '{@link de.uka.ipd.sdq.probfunction.Sample#getValue <em>Value</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(T value);

    /**
     * Returns the value of the '<em><b>Probability</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Probability</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Probability</em>' attribute.
     * @see #setProbability(double)
     * @see de.uka.ipd.sdq.probfunction.ProbfunctionPackage#getSample_Probability()
     * @model unique="false" ordered="false"
     * @generated
     */
    double getProbability();

    /**
     * Sets the value of the '{@link de.uka.ipd.sdq.probfunction.Sample#getProbability
     * <em>Probability</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Probability</em>' attribute.
     * @see #getProbability()
     * @generated
     */
    void setProbability(double value);

} // Sample
