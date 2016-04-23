/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.probfunction.BoolSample;
import de.uka.ipd.sdq.probfunction.BoxedPDF;
import de.uka.ipd.sdq.probfunction.Complex;
import de.uka.ipd.sdq.probfunction.ContinuousPDF;
import de.uka.ipd.sdq.probfunction.ContinuousSample;
import de.uka.ipd.sdq.probfunction.DoubleSample;
import de.uka.ipd.sdq.probfunction.ExponentialDistribution;
import de.uka.ipd.sdq.probfunction.GammaDistribution;
import de.uka.ipd.sdq.probfunction.IntSample;
import de.uka.ipd.sdq.probfunction.LognormalDistribution;
import de.uka.ipd.sdq.probfunction.NormalDistribution;
import de.uka.ipd.sdq.probfunction.ProbabilityDensityFunction;
import de.uka.ipd.sdq.probfunction.ProbabilityFunction;
import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.probfunction.Sample;
import de.uka.ipd.sdq.probfunction.SamplePDF;
import de.uka.ipd.sdq.probfunction.StringSample;
import de.uka.ipd.sdq.units.UnitCarryingElement;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see de.uka.ipd.sdq.probfunction.ProbfunctionPackage
 * @generated
 */
public class ProbfunctionAdapterFactory extends AdapterFactoryImpl {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static ProbfunctionPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProbfunctionAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ProbfunctionPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected ProbfunctionSwitch<Adapter> modelSwitch = new ProbfunctionSwitch<Adapter>() {

        @Override
        public Adapter caseBoxedPDF(final BoxedPDF object) {
            return ProbfunctionAdapterFactory.this.createBoxedPDFAdapter();
        }

        @Override
        public Adapter caseProbabilityDensityFunction(final ProbabilityDensityFunction object) {
            return ProbfunctionAdapterFactory.this.createProbabilityDensityFunctionAdapter();
        }

        @Override
        public Adapter caseProbabilityFunction(final ProbabilityFunction object) {
            return ProbfunctionAdapterFactory.this.createProbabilityFunctionAdapter();
        }

        @Override
        public Adapter caseContinuousSample(final ContinuousSample object) {
            return ProbfunctionAdapterFactory.this.createContinuousSampleAdapter();
        }

        @Override
        public Adapter caseProbabilityMassFunction(final ProbabilityMassFunction object) {
            return ProbfunctionAdapterFactory.this.createProbabilityMassFunctionAdapter();
        }

        @Override
        public <T> Adapter caseSample(final Sample<T> object) {
            return ProbfunctionAdapterFactory.this.createSampleAdapter();
        }

        @Override
        public Adapter caseSamplePDF(final SamplePDF object) {
            return ProbfunctionAdapterFactory.this.createSamplePDFAdapter();
        }

        @Override
        public Adapter caseComplex(final Complex object) {
            return ProbfunctionAdapterFactory.this.createComplexAdapter();
        }

        @Override
        public Adapter caseContinuousPDF(final ContinuousPDF object) {
            return ProbfunctionAdapterFactory.this.createContinuousPDFAdapter();
        }

        @Override
        public Adapter caseExponentialDistribution(final ExponentialDistribution object) {
            return ProbfunctionAdapterFactory.this.createExponentialDistributionAdapter();
        }

        @Override
        public Adapter caseNormalDistribution(final NormalDistribution object) {
            return ProbfunctionAdapterFactory.this.createNormalDistributionAdapter();
        }

        @Override
        public Adapter caseLognormalDistribution(final LognormalDistribution object) {
            return ProbfunctionAdapterFactory.this.createLognormalDistributionAdapter();
        }

        @Override
        public Adapter caseGammaDistribution(final GammaDistribution object) {
            return ProbfunctionAdapterFactory.this.createGammaDistributionAdapter();
        }

        @Override
        public Adapter caseIntSample(final IntSample object) {
            return ProbfunctionAdapterFactory.this.createIntSampleAdapter();
        }

        @Override
        public Adapter caseBoolSample(final BoolSample object) {
            return ProbfunctionAdapterFactory.this.createBoolSampleAdapter();
        }

        @Override
        public Adapter caseDoubleSample(final DoubleSample object) {
            return ProbfunctionAdapterFactory.this.createDoubleSampleAdapter();
        }

        @Override
        public Adapter caseStringSample(final StringSample object) {
            return ProbfunctionAdapterFactory.this.createStringSampleAdapter();
        }

        @Override
        public Adapter caseUnitCarryingElement(final UnitCarryingElement object) {
            return ProbfunctionAdapterFactory.this.createUnitCarryingElementAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return ProbfunctionAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.probfunction.BoxedPDF
     * <em>Boxed PDF</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.BoxedPDF
     * @generated
     */
    public Adapter createBoxedPDFAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.probfunction.ProbabilityDensityFunction
     * <em>Probability Density Function</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.ProbabilityDensityFunction
     * @generated
     */
    public Adapter createProbabilityDensityFunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.probfunction.ProbabilityFunction <em>Probability Function</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.ProbabilityFunction
     * @generated
     */
    public Adapter createProbabilityFunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.probfunction.ContinuousSample <em>Continuous Sample</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.ContinuousSample
     * @generated
     */
    public Adapter createContinuousSampleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.probfunction.ProbabilityMassFunction
     * <em>Probability Mass Function</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.ProbabilityMassFunction
     * @generated
     */
    public Adapter createProbabilityMassFunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.probfunction.Sample
     * <em>Sample</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.Sample
     * @generated
     */
    public Adapter createSampleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.probfunction.SamplePDF
     * <em>Sample PDF</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.SamplePDF
     * @generated
     */
    public Adapter createSamplePDFAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.probfunction.Complex
     * <em>Complex</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.Complex
     * @generated
     */
    public Adapter createComplexAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.probfunction.ContinuousPDF <em>Continuous PDF</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.ContinuousPDF
     * @generated
     */
    public Adapter createContinuousPDFAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.probfunction.ExponentialDistribution <em>Exponential Distribution</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.ExponentialDistribution
     * @generated
     */
    public Adapter createExponentialDistributionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.probfunction.NormalDistribution <em>Normal Distribution</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.NormalDistribution
     * @generated
     */
    public Adapter createNormalDistributionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.probfunction.LognormalDistribution <em>Lognormal Distribution</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.LognormalDistribution
     * @generated
     */
    public Adapter createLognormalDistributionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.probfunction.GammaDistribution <em>Gamma Distribution</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.GammaDistribution
     * @generated
     */
    public Adapter createGammaDistributionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.probfunction.IntSample
     * <em>Int Sample</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.IntSample
     * @generated
     */
    public Adapter createIntSampleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.probfunction.BoolSample
     * <em>Bool Sample</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.BoolSample
     * @generated
     */
    public Adapter createBoolSampleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.probfunction.DoubleSample <em>Double Sample</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.DoubleSample
     * @generated
     */
    public Adapter createDoubleSampleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.probfunction.StringSample <em>String Sample</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.probfunction.StringSample
     * @generated
     */
    public Adapter createStringSampleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.units.UnitCarryingElement <em>Unit Carrying Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.units.UnitCarryingElement
     * @generated
     */
    public Adapter createUnitCarryingElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // ProbfunctionAdapterFactory
