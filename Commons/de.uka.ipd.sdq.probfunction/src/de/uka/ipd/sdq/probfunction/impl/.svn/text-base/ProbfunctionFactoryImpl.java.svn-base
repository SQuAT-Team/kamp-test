/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.probfunction.BoolSample;
import de.uka.ipd.sdq.probfunction.BoxedPDF;
import de.uka.ipd.sdq.probfunction.Complex;
import de.uka.ipd.sdq.probfunction.ContinuousSample;
import de.uka.ipd.sdq.probfunction.DoubleSample;
import de.uka.ipd.sdq.probfunction.ExponentialDistribution;
import de.uka.ipd.sdq.probfunction.GammaDistribution;
import de.uka.ipd.sdq.probfunction.IntSample;
import de.uka.ipd.sdq.probfunction.LognormalDistribution;
import de.uka.ipd.sdq.probfunction.NormalDistribution;
import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.ProbfunctionFactory;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.probfunction.Sample;
import de.uka.ipd.sdq.probfunction.SamplePDF;
import de.uka.ipd.sdq.probfunction.StringSample;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ProbfunctionFactoryImpl extends EFactoryImpl implements ProbfunctionFactory {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static ProbfunctionFactory init() {
        try {
            final ProbfunctionFactory theProbfunctionFactory = (ProbfunctionFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ProbfunctionPackage.eNS_URI);
            if (theProbfunctionFactory != null) {
                return theProbfunctionFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ProbfunctionFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProbfunctionFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case ProbfunctionPackage.BOXED_PDF:
            return this.createBoxedPDF();
        case ProbfunctionPackage.CONTINUOUS_SAMPLE:
            return this.createContinuousSample();
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION:
            return this.createProbabilityMassFunction();
        case ProbfunctionPackage.SAMPLE:
            return this.createSample();
        case ProbfunctionPackage.SAMPLE_PDF:
            return this.createSamplePDF();
        case ProbfunctionPackage.COMPLEX:
            return this.createComplex();
        case ProbfunctionPackage.EXPONENTIAL_DISTRIBUTION:
            return this.createExponentialDistribution();
        case ProbfunctionPackage.NORMAL_DISTRIBUTION:
            return this.createNormalDistribution();
        case ProbfunctionPackage.LOGNORMAL_DISTRIBUTION:
            return this.createLognormalDistribution();
        case ProbfunctionPackage.GAMMA_DISTRIBUTION:
            return this.createGammaDistribution();
        case ProbfunctionPackage.INT_SAMPLE:
            return this.createIntSample();
        case ProbfunctionPackage.BOOL_SAMPLE:
            return this.createBoolSample();
        case ProbfunctionPackage.DOUBLE_SAMPLE:
            return this.createDoubleSample();
        case ProbfunctionPackage.STRING_SAMPLE:
            return this.createStringSample();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BoxedPDF createBoxedPDF() {
        final BoxedPDFImpl boxedPDF = new BoxedPDFImpl();
        return boxedPDF;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ContinuousSample createContinuousSample() {
        final ContinuousSampleImpl continuousSample = new ContinuousSampleImpl();
        return continuousSample;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProbabilityMassFunction createProbabilityMassFunction() {
        final ProbabilityMassFunctionImpl probabilityMassFunction = new ProbabilityMassFunctionImpl();
        return probabilityMassFunction;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public <T> Sample<T> createSample() {
        final SampleImpl<T> sample = new SampleImpl<T>();
        return sample;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SamplePDF createSamplePDF() {
        final SamplePDFImpl samplePDF = new SamplePDFImpl();
        return samplePDF;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Complex createComplex() {
        final ComplexImpl complex = new ComplexImpl();
        return complex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ExponentialDistribution createExponentialDistribution() {
        final ExponentialDistributionImpl exponentialDistribution = new ExponentialDistributionImpl();
        return exponentialDistribution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NormalDistribution createNormalDistribution() {
        final NormalDistributionImpl normalDistribution = new NormalDistributionImpl();
        return normalDistribution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public LognormalDistribution createLognormalDistribution() {
        final LognormalDistributionImpl lognormalDistribution = new LognormalDistributionImpl();
        return lognormalDistribution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public GammaDistribution createGammaDistribution() {
        final GammaDistributionImpl gammaDistribution = new GammaDistributionImpl();
        return gammaDistribution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public IntSample createIntSample() {
        final IntSampleImpl intSample = new IntSampleImpl();
        return intSample;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BoolSample createBoolSample() {
        final BoolSampleImpl boolSample = new BoolSampleImpl();
        return boolSample;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public DoubleSample createDoubleSample() {
        final DoubleSampleImpl doubleSample = new DoubleSampleImpl();
        return doubleSample;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public StringSample createStringSample() {
        final StringSampleImpl stringSample = new StringSampleImpl();
        return stringSample;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProbfunctionPackage getProbfunctionPackage() {
        return (ProbfunctionPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ProbfunctionPackage getPackage() {
        return ProbfunctionPackage.eINSTANCE;
    }

} // ProbfunctionFactoryImpl
