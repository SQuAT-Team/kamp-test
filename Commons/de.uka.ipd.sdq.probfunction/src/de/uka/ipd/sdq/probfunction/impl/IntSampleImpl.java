/**
 * Copyright 2007-2009, SDQ, IPD, U Karlsruhe
 */
package de.uka.ipd.sdq.probfunction.impl;

import org.eclipse.emf.ecore.EClass;

import de.uka.ipd.sdq.probfunction.IntSample;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Int Sample</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IntSampleImpl extends SampleImpl<Integer> implements IntSample {

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
    protected IntSampleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProbfunctionPackage.Literals.INT_SAMPLE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> This is specialized for the more specific type
     * known in this context.
     *
     * @generated
     */
    @Override
    public void setValue(final Integer newValue) {
        super.setValue(newValue);
    }

} // IntSampleImpl
