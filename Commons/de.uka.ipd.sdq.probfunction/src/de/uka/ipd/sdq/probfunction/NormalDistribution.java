/**
 * Copyright 2007-2009, SDQ, IPD, U Karlsruhe
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Normal Distribution</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.probfunction.NormalDistribution#getMu <em>Mu</em>}</li>
 * <li>{@link de.uka.ipd.sdq.probfunction.NormalDistribution#getSigma <em>Sigma</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.probfunction.ProbfunctionPackage#getNormalDistribution()
 * @model
 * @generated
 */
public interface NormalDistribution extends ContinuousPDF {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * Returns the value of the '<em><b>Mu</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mu</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Mu</em>' attribute.
     * @see #setMu(double)
     * @see de.uka.ipd.sdq.probfunction.ProbfunctionPackage#getNormalDistribution_Mu()
     * @model required="true" ordered="false"
     * @generated
     */
    double getMu();

    /**
     * Sets the value of the '{@link de.uka.ipd.sdq.probfunction.NormalDistribution#getMu
     * <em>Mu</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Mu</em>' attribute.
     * @see #getMu()
     * @generated
     */
    void setMu(double value);

    /**
     * Returns the value of the '<em><b>Sigma</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sigma</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Sigma</em>' attribute.
     * @see #setSigma(double)
     * @see de.uka.ipd.sdq.probfunction.ProbfunctionPackage#getNormalDistribution_Sigma()
     * @model required="true" ordered="false"
     * @generated
     */
    double getSigma();

    /**
     * Sets the value of the '{@link de.uka.ipd.sdq.probfunction.NormalDistribution#getSigma
     * <em>Sigma</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Sigma</em>' attribute.
     * @see #getSigma()
     * @generated
     */
    void setSigma(double value);

} // NormalDistribution
