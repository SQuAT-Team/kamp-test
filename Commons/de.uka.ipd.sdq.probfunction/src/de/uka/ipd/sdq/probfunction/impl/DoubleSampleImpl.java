/**
 * Copyright 2007-2009, SDQ, IPD, U Karlsruhe
 */
package de.uka.ipd.sdq.probfunction.impl;

import org.eclipse.emf.ecore.EClass;

import de.uka.ipd.sdq.probfunction.DoubleSample;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Double Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DoubleSampleImpl extends SampleImpl<Double> implements DoubleSample {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DoubleSampleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProbfunctionPackage.Literals.DOUBLE_SAMPLE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> This is specialized for the more specific type
     * known in this context.
     *
     * @generated
     */
    @Override
    public void setValue(final Double newValue) {
        super.setValue(newValue);
    }

} // DoubleSampleImpl
