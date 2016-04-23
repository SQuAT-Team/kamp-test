/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see de.uka.ipd.sdq.probfunction.ProbfunctionFactory
 * @model kind="package"
 * @generated
 */
public interface ProbfunctionPackage extends EPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNAME = "probfunction";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_URI = "http://sdq.ipd.uka.de/ProbFunction/2.1";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_PREFIX = "probfunction";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    ProbfunctionPackage eINSTANCE = de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl.init();

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.ProbabilityFunctionImpl
     * <em>Probability Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.ProbabilityFunctionImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getProbabilityFunction()
     * @generated
     */
    int PROBABILITY_FUNCTION = 2;

    /**
     * The feature id for the '<em><b>Unit</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROBABILITY_FUNCTION__UNIT = UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT;

    /**
     * The number of structural features of the '<em>Probability Function</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PROBABILITY_FUNCTION_FEATURE_COUNT = UnitsPackage.UNIT_CARRYING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link de.uka.ipd.sdq.probfunction.impl.ProbabilityDensityFunctionImpl
     * <em>Probability Density Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.ProbabilityDensityFunctionImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getProbabilityDensityFunction()
     * @generated
     */
    int PROBABILITY_DENSITY_FUNCTION = 1;

    /**
     * The feature id for the '<em><b>Unit</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROBABILITY_DENSITY_FUNCTION__UNIT = PROBABILITY_FUNCTION__UNIT;

    /**
     * The number of structural features of the '<em>Probability Density Function</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT = PROBABILITY_FUNCTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.BoxedPDFImpl
     * <em>Boxed PDF</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.BoxedPDFImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getBoxedPDF()
     * @generated
     */
    int BOXED_PDF = 0;

    /**
     * The feature id for the '<em><b>Unit</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BOXED_PDF__UNIT = PROBABILITY_DENSITY_FUNCTION__UNIT;

    /**
     * The feature id for the '<em><b>Samples</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOXED_PDF__SAMPLES = PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Boxed PDF</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BOXED_PDF_FEATURE_COUNT = PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.ContinuousSampleImpl
     * <em>Continuous Sample</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.ContinuousSampleImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getContinuousSample()
     * @generated
     */
    int CONTINUOUS_SAMPLE = 3;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONTINUOUS_SAMPLE__VALUE = 0;

    /**
     * The feature id for the '<em><b>Probability</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONTINUOUS_SAMPLE__PROBABILITY = 1;

    /**
     * The number of structural features of the '<em>Continuous Sample</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CONTINUOUS_SAMPLE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '
     * {@link de.uka.ipd.sdq.probfunction.impl.ProbabilityMassFunctionImpl
     * <em>Probability Mass Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.ProbabilityMassFunctionImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getProbabilityMassFunction()
     * @generated
     */
    int PROBABILITY_MASS_FUNCTION = 4;

    /**
     * The feature id for the '<em><b>Unit</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROBABILITY_MASS_FUNCTION__UNIT = PROBABILITY_FUNCTION__UNIT;

    /**
     * The feature id for the '<em><b>Samples</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PROBABILITY_MASS_FUNCTION__SAMPLES = PROBABILITY_FUNCTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ordered Domain</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN = PROBABILITY_FUNCTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Probability Mass Function</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PROBABILITY_MASS_FUNCTION_FEATURE_COUNT = PROBABILITY_FUNCTION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.SampleImpl
     * <em>Sample</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.SampleImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getSample()
     * @generated
     */
    int SAMPLE = 5;

    /**
     * The feature id for the '<em><b>Probability</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SAMPLE__PROBABILITY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SAMPLE__VALUE = 1;

    /**
     * The number of structural features of the '<em>Sample</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SAMPLE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.SamplePDFImpl
     * <em>Sample PDF</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.SamplePDFImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getSamplePDF()
     * @generated
     */
    int SAMPLE_PDF = 6;

    /**
     * The feature id for the '<em><b>Unit</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SAMPLE_PDF__UNIT = PROBABILITY_DENSITY_FUNCTION__UNIT;

    /**
     * The feature id for the '<em><b>Distance</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SAMPLE_PDF__DISTANCE = PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Values</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SAMPLE_PDF__VALUES = PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Sample PDF</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SAMPLE_PDF_FEATURE_COUNT = PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.ComplexImpl
     * <em>Complex</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.ComplexImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getComplex()
     * @generated
     */
    int COMPLEX = 7;

    /**
     * The feature id for the '<em><b>Real</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPLEX__REAL = 0;

    /**
     * The feature id for the '<em><b>Imaginary</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPLEX__IMAGINARY = 1;

    /**
     * The number of structural features of the '<em>Complex</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPLEX_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.ContinuousPDFImpl
     * <em>Continuous PDF</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.ContinuousPDFImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getContinuousPDF()
     * @generated
     */
    int CONTINUOUS_PDF = 8;

    /**
     * The feature id for the '<em><b>Unit</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONTINUOUS_PDF__UNIT = PROBABILITY_DENSITY_FUNCTION__UNIT;

    /**
     * The number of structural features of the '<em>Continuous PDF</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONTINUOUS_PDF_FEATURE_COUNT = PROBABILITY_DENSITY_FUNCTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link de.uka.ipd.sdq.probfunction.impl.ExponentialDistributionImpl
     * <em>Exponential Distribution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.ExponentialDistributionImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getExponentialDistribution()
     * @generated
     */
    int EXPONENTIAL_DISTRIBUTION = 9;

    /**
     * The feature id for the '<em><b>Unit</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXPONENTIAL_DISTRIBUTION__UNIT = CONTINUOUS_PDF__UNIT;

    /**
     * The feature id for the '<em><b>Rate</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXPONENTIAL_DISTRIBUTION__RATE = CONTINUOUS_PDF_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Exponential Distribution</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPONENTIAL_DISTRIBUTION_FEATURE_COUNT = CONTINUOUS_PDF_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.NormalDistributionImpl
     * <em>Normal Distribution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.NormalDistributionImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getNormalDistribution()
     * @generated
     */
    int NORMAL_DISTRIBUTION = 10;

    /**
     * The feature id for the '<em><b>Unit</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NORMAL_DISTRIBUTION__UNIT = CONTINUOUS_PDF__UNIT;

    /**
     * The feature id for the '<em><b>Mu</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NORMAL_DISTRIBUTION__MU = CONTINUOUS_PDF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sigma</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NORMAL_DISTRIBUTION__SIGMA = CONTINUOUS_PDF_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Normal Distribution</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NORMAL_DISTRIBUTION_FEATURE_COUNT = CONTINUOUS_PDF_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '
     * {@link de.uka.ipd.sdq.probfunction.impl.LognormalDistributionImpl
     * <em>Lognormal Distribution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.LognormalDistributionImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getLognormalDistribution()
     * @generated
     */
    int LOGNORMAL_DISTRIBUTION = 11;

    /**
     * The feature id for the '<em><b>Unit</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LOGNORMAL_DISTRIBUTION__UNIT = CONTINUOUS_PDF__UNIT;

    /**
     * The feature id for the '<em><b>Mu</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LOGNORMAL_DISTRIBUTION__MU = CONTINUOUS_PDF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sigma</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LOGNORMAL_DISTRIBUTION__SIGMA = CONTINUOUS_PDF_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Lognormal Distribution</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LOGNORMAL_DISTRIBUTION_FEATURE_COUNT = CONTINUOUS_PDF_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.GammaDistributionImpl
     * <em>Gamma Distribution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.GammaDistributionImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getGammaDistribution()
     * @generated
     */
    int GAMMA_DISTRIBUTION = 12;

    /**
     * The feature id for the '<em><b>Unit</b></em>' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GAMMA_DISTRIBUTION__UNIT = CONTINUOUS_PDF__UNIT;

    /**
     * The feature id for the '<em><b>Alpha</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GAMMA_DISTRIBUTION__ALPHA = CONTINUOUS_PDF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Theta</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GAMMA_DISTRIBUTION__THETA = CONTINUOUS_PDF_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Gamma Distribution</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GAMMA_DISTRIBUTION_FEATURE_COUNT = CONTINUOUS_PDF_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.IntSampleImpl
     * <em>Int Sample</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.IntSampleImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getIntSample()
     * @generated
     */
    int INT_SAMPLE = 13;

    /**
     * The feature id for the '<em><b>Probability</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INT_SAMPLE__PROBABILITY = SAMPLE__PROBABILITY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INT_SAMPLE__VALUE = SAMPLE__VALUE;

    /**
     * The number of structural features of the '<em>Int Sample</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INT_SAMPLE_FEATURE_COUNT = SAMPLE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.BoolSampleImpl
     * <em>Bool Sample</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.BoolSampleImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getBoolSample()
     * @generated
     */
    int BOOL_SAMPLE = 14;

    /**
     * The feature id for the '<em><b>Probability</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BOOL_SAMPLE__PROBABILITY = SAMPLE__PROBABILITY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BOOL_SAMPLE__VALUE = SAMPLE__VALUE;

    /**
     * The number of structural features of the '<em>Bool Sample</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BOOL_SAMPLE_FEATURE_COUNT = SAMPLE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.DoubleSampleImpl
     * <em>Double Sample</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.DoubleSampleImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getDoubleSample()
     * @generated
     */
    int DOUBLE_SAMPLE = 15;

    /**
     * The feature id for the '<em><b>Probability</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOUBLE_SAMPLE__PROBABILITY = SAMPLE__PROBABILITY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOUBLE_SAMPLE__VALUE = SAMPLE__VALUE;

    /**
     * The number of structural features of the '<em>Double Sample</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOUBLE_SAMPLE_FEATURE_COUNT = SAMPLE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.uka.ipd.sdq.probfunction.impl.StringSampleImpl
     * <em>String Sample</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.uka.ipd.sdq.probfunction.impl.StringSampleImpl
     * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getStringSample()
     * @generated
     */
    int STRING_SAMPLE = 16;

    /**
     * The feature id for the '<em><b>Probability</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int STRING_SAMPLE__PROBABILITY = SAMPLE__PROBABILITY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int STRING_SAMPLE__VALUE = SAMPLE__VALUE;

    /**
     * The number of structural features of the '<em>String Sample</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int STRING_SAMPLE_FEATURE_COUNT = SAMPLE_FEATURE_COUNT + 0;

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.BoxedPDF
     * <em>Boxed PDF</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Boxed PDF</em>'.
     * @see de.uka.ipd.sdq.probfunction.BoxedPDF
     * @generated
     */
    EClass getBoxedPDF();

    /**
     * Returns the meta object for the containment reference list '
     * {@link de.uka.ipd.sdq.probfunction.BoxedPDF#getSamples <em>Samples</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Samples</em>'.
     * @see de.uka.ipd.sdq.probfunction.BoxedPDF#getSamples()
     * @see #getBoxedPDF()
     * @generated
     */
    EReference getBoxedPDF_Samples();

    /**
     * Returns the meta object for class '
     * {@link de.uka.ipd.sdq.probfunction.ProbabilityDensityFunction
     * <em>Probability Density Function</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Probability Density Function</em>'.
     * @see de.uka.ipd.sdq.probfunction.ProbabilityDensityFunction
     * @generated
     */
    EClass getProbabilityDensityFunction();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.ProbabilityFunction
     * <em>Probability Function</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Probability Function</em>'.
     * @see de.uka.ipd.sdq.probfunction.ProbabilityFunction
     * @generated
     */
    EClass getProbabilityFunction();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.ContinuousSample
     * <em>Continuous Sample</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Continuous Sample</em>'.
     * @see de.uka.ipd.sdq.probfunction.ContinuousSample
     * @generated
     */
    EClass getContinuousSample();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.ContinuousSample#getValue <em>Value</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.uka.ipd.sdq.probfunction.ContinuousSample#getValue()
     * @see #getContinuousSample()
     * @generated
     */
    EAttribute getContinuousSample_Value();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.ContinuousSample#getProbability <em>Probability</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Probability</em>'.
     * @see de.uka.ipd.sdq.probfunction.ContinuousSample#getProbability()
     * @see #getContinuousSample()
     * @generated
     */
    EAttribute getContinuousSample_Probability();

    /**
     * Returns the meta object for class '
     * {@link de.uka.ipd.sdq.probfunction.ProbabilityMassFunction
     * <em>Probability Mass Function</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Probability Mass Function</em>'.
     * @see de.uka.ipd.sdq.probfunction.ProbabilityMassFunction
     * @generated
     */
    EClass getProbabilityMassFunction();

    /**
     * Returns the meta object for the containment reference list '
     * {@link de.uka.ipd.sdq.probfunction.ProbabilityMassFunction#getSamples <em>Samples</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Samples</em>'.
     * @see de.uka.ipd.sdq.probfunction.ProbabilityMassFunction#getSamples()
     * @see #getProbabilityMassFunction()
     * @generated
     */
    EReference getProbabilityMassFunction_Samples();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.ProbabilityMassFunction#isOrderedDomain
     * <em>Ordered Domain</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Ordered Domain</em>'.
     * @see de.uka.ipd.sdq.probfunction.ProbabilityMassFunction#isOrderedDomain()
     * @see #getProbabilityMassFunction()
     * @generated
     */
    EAttribute getProbabilityMassFunction_OrderedDomain();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.Sample <em>Sample</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Sample</em>'.
     * @see de.uka.ipd.sdq.probfunction.Sample
     * @generated
     */
    EClass getSample();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.Sample#getValue <em>Value</em>}'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.uka.ipd.sdq.probfunction.Sample#getValue()
     * @see #getSample()
     * @generated
     */
    EAttribute getSample_Value();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.Sample#getProbability <em>Probability</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Probability</em>'.
     * @see de.uka.ipd.sdq.probfunction.Sample#getProbability()
     * @see #getSample()
     * @generated
     */
    EAttribute getSample_Probability();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.SamplePDF
     * <em>Sample PDF</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Sample PDF</em>'.
     * @see de.uka.ipd.sdq.probfunction.SamplePDF
     * @generated
     */
    EClass getSamplePDF();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.SamplePDF#getDistance <em>Distance</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Distance</em>'.
     * @see de.uka.ipd.sdq.probfunction.SamplePDF#getDistance()
     * @see #getSamplePDF()
     * @generated
     */
    EAttribute getSamplePDF_Distance();

    /**
     * Returns the meta object for the containment reference list '
     * {@link de.uka.ipd.sdq.probfunction.SamplePDF#getValues <em>Values</em>}'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Values</em>'.
     * @see de.uka.ipd.sdq.probfunction.SamplePDF#getValues()
     * @see #getSamplePDF()
     * @generated
     */
    EReference getSamplePDF_Values();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.Complex
     * <em>Complex</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Complex</em>'.
     * @see de.uka.ipd.sdq.probfunction.Complex
     * @generated
     */
    EClass getComplex();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.Complex#getReal <em>Real</em>}'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Real</em>'.
     * @see de.uka.ipd.sdq.probfunction.Complex#getReal()
     * @see #getComplex()
     * @generated
     */
    EAttribute getComplex_Real();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.Complex#getImaginary <em>Imaginary</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Imaginary</em>'.
     * @see de.uka.ipd.sdq.probfunction.Complex#getImaginary()
     * @see #getComplex()
     * @generated
     */
    EAttribute getComplex_Imaginary();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.ContinuousPDF
     * <em>Continuous PDF</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Continuous PDF</em>'.
     * @see de.uka.ipd.sdq.probfunction.ContinuousPDF
     * @generated
     */
    EClass getContinuousPDF();

    /**
     * Returns the meta object for class '
     * {@link de.uka.ipd.sdq.probfunction.ExponentialDistribution <em>Exponential Distribution</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Exponential Distribution</em>'.
     * @see de.uka.ipd.sdq.probfunction.ExponentialDistribution
     * @generated
     */
    EClass getExponentialDistribution();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.ExponentialDistribution#getRate <em>Rate</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Rate</em>'.
     * @see de.uka.ipd.sdq.probfunction.ExponentialDistribution#getRate()
     * @see #getExponentialDistribution()
     * @generated
     */
    EAttribute getExponentialDistribution_Rate();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.NormalDistribution
     * <em>Normal Distribution</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Normal Distribution</em>'.
     * @see de.uka.ipd.sdq.probfunction.NormalDistribution
     * @generated
     */
    EClass getNormalDistribution();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.NormalDistribution#getMu <em>Mu</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Mu</em>'.
     * @see de.uka.ipd.sdq.probfunction.NormalDistribution#getMu()
     * @see #getNormalDistribution()
     * @generated
     */
    EAttribute getNormalDistribution_Mu();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.NormalDistribution#getSigma <em>Sigma</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Sigma</em>'.
     * @see de.uka.ipd.sdq.probfunction.NormalDistribution#getSigma()
     * @see #getNormalDistribution()
     * @generated
     */
    EAttribute getNormalDistribution_Sigma();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.LognormalDistribution
     * <em>Lognormal Distribution</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Lognormal Distribution</em>'.
     * @see de.uka.ipd.sdq.probfunction.LognormalDistribution
     * @generated
     */
    EClass getLognormalDistribution();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.LognormalDistribution#getMu <em>Mu</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Mu</em>'.
     * @see de.uka.ipd.sdq.probfunction.LognormalDistribution#getMu()
     * @see #getLognormalDistribution()
     * @generated
     */
    EAttribute getLognormalDistribution_Mu();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.LognormalDistribution#getSigma <em>Sigma</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Sigma</em>'.
     * @see de.uka.ipd.sdq.probfunction.LognormalDistribution#getSigma()
     * @see #getLognormalDistribution()
     * @generated
     */
    EAttribute getLognormalDistribution_Sigma();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.GammaDistribution
     * <em>Gamma Distribution</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Gamma Distribution</em>'.
     * @see de.uka.ipd.sdq.probfunction.GammaDistribution
     * @generated
     */
    EClass getGammaDistribution();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.GammaDistribution#getAlpha <em>Alpha</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Alpha</em>'.
     * @see de.uka.ipd.sdq.probfunction.GammaDistribution#getAlpha()
     * @see #getGammaDistribution()
     * @generated
     */
    EAttribute getGammaDistribution_Alpha();

    /**
     * Returns the meta object for the attribute '
     * {@link de.uka.ipd.sdq.probfunction.GammaDistribution#getTheta <em>Theta</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Theta</em>'.
     * @see de.uka.ipd.sdq.probfunction.GammaDistribution#getTheta()
     * @see #getGammaDistribution()
     * @generated
     */
    EAttribute getGammaDistribution_Theta();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.IntSample
     * <em>Int Sample</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Int Sample</em>'.
     * @see de.uka.ipd.sdq.probfunction.IntSample
     * @generated
     */
    EClass getIntSample();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.BoolSample
     * <em>Bool Sample</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Bool Sample</em>'.
     * @see de.uka.ipd.sdq.probfunction.BoolSample
     * @generated
     */
    EClass getBoolSample();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.DoubleSample
     * <em>Double Sample</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Double Sample</em>'.
     * @see de.uka.ipd.sdq.probfunction.DoubleSample
     * @generated
     */
    EClass getDoubleSample();

    /**
     * Returns the meta object for class '{@link de.uka.ipd.sdq.probfunction.StringSample
     * <em>String Sample</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>String Sample</em>'.
     * @see de.uka.ipd.sdq.probfunction.StringSample
     * @generated
     */
    EClass getStringSample();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ProbfunctionFactory getProbfunctionFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    interface Literals {

        /**
         * The meta object literal for the '{@link de.uka.ipd.sdq.probfunction.impl.BoxedPDFImpl
         * <em>Boxed PDF</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.BoxedPDFImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getBoxedPDF()
         * @generated
         */
        EClass BOXED_PDF = eINSTANCE.getBoxedPDF();

        /**
         * The meta object literal for the '<em><b>Samples</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference BOXED_PDF__SAMPLES = eINSTANCE.getBoxedPDF_Samples();

        /**
         * The meta object literal for the '
         * {@link de.uka.ipd.sdq.probfunction.impl.ProbabilityDensityFunctionImpl
         * <em>Probability Density Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         *
         * @see de.uka.ipd.sdq.probfunction.impl.ProbabilityDensityFunctionImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getProbabilityDensityFunction()
         * @generated
         */
        EClass PROBABILITY_DENSITY_FUNCTION = eINSTANCE.getProbabilityDensityFunction();

        /**
         * The meta object literal for the '
         * {@link de.uka.ipd.sdq.probfunction.impl.ProbabilityFunctionImpl
         * <em>Probability Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.ProbabilityFunctionImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getProbabilityFunction()
         * @generated
         */
        EClass PROBABILITY_FUNCTION = eINSTANCE.getProbabilityFunction();

        /**
         * The meta object literal for the '
         * {@link de.uka.ipd.sdq.probfunction.impl.ContinuousSampleImpl <em>Continuous Sample</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.ContinuousSampleImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getContinuousSample()
         * @generated
         */
        EClass CONTINUOUS_SAMPLE = eINSTANCE.getContinuousSample();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute CONTINUOUS_SAMPLE__VALUE = eINSTANCE.getContinuousSample_Value();

        /**
         * The meta object literal for the '<em><b>Probability</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute CONTINUOUS_SAMPLE__PROBABILITY = eINSTANCE.getContinuousSample_Probability();

        /**
         * The meta object literal for the '
         * {@link de.uka.ipd.sdq.probfunction.impl.ProbabilityMassFunctionImpl
         * <em>Probability Mass Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.ProbabilityMassFunctionImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getProbabilityMassFunction()
         * @generated
         */
        EClass PROBABILITY_MASS_FUNCTION = eINSTANCE.getProbabilityMassFunction();

        /**
         * The meta object literal for the '<em><b>Samples</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference PROBABILITY_MASS_FUNCTION__SAMPLES = eINSTANCE.getProbabilityMassFunction_Samples();

        /**
         * The meta object literal for the '<em><b>Ordered Domain</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN = eINSTANCE.getProbabilityMassFunction_OrderedDomain();

        /**
         * The meta object literal for the '{@link de.uka.ipd.sdq.probfunction.impl.SampleImpl
         * <em>Sample</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.SampleImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getSample()
         * @generated
         */
        EClass SAMPLE = eINSTANCE.getSample();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute SAMPLE__VALUE = eINSTANCE.getSample_Value();

        /**
         * The meta object literal for the '<em><b>Probability</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute SAMPLE__PROBABILITY = eINSTANCE.getSample_Probability();

        /**
         * The meta object literal for the '{@link de.uka.ipd.sdq.probfunction.impl.SamplePDFImpl
         * <em>Sample PDF</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.SamplePDFImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getSamplePDF()
         * @generated
         */
        EClass SAMPLE_PDF = eINSTANCE.getSamplePDF();

        /**
         * The meta object literal for the '<em><b>Distance</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute SAMPLE_PDF__DISTANCE = eINSTANCE.getSamplePDF_Distance();

        /**
         * The meta object literal for the '<em><b>Values</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SAMPLE_PDF__VALUES = eINSTANCE.getSamplePDF_Values();

        /**
         * The meta object literal for the '{@link de.uka.ipd.sdq.probfunction.impl.ComplexImpl
         * <em>Complex</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.ComplexImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getComplex()
         * @generated
         */
        EClass COMPLEX = eINSTANCE.getComplex();

        /**
         * The meta object literal for the '<em><b>Real</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute COMPLEX__REAL = eINSTANCE.getComplex_Real();

        /**
         * The meta object literal for the '<em><b>Imaginary</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute COMPLEX__IMAGINARY = eINSTANCE.getComplex_Imaginary();

        /**
         * The meta object literal for the '
         * {@link de.uka.ipd.sdq.probfunction.impl.ContinuousPDFImpl <em>Continuous PDF</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.ContinuousPDFImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getContinuousPDF()
         * @generated
         */
        EClass CONTINUOUS_PDF = eINSTANCE.getContinuousPDF();

        /**
         * The meta object literal for the '
         * {@link de.uka.ipd.sdq.probfunction.impl.ExponentialDistributionImpl
         * <em>Exponential Distribution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.ExponentialDistributionImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getExponentialDistribution()
         * @generated
         */
        EClass EXPONENTIAL_DISTRIBUTION = eINSTANCE.getExponentialDistribution();

        /**
         * The meta object literal for the '<em><b>Rate</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EXPONENTIAL_DISTRIBUTION__RATE = eINSTANCE.getExponentialDistribution_Rate();

        /**
         * The meta object literal for the '
         * {@link de.uka.ipd.sdq.probfunction.impl.NormalDistributionImpl
         * <em>Normal Distribution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.NormalDistributionImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getNormalDistribution()
         * @generated
         */
        EClass NORMAL_DISTRIBUTION = eINSTANCE.getNormalDistribution();

        /**
         * The meta object literal for the '<em><b>Mu</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute NORMAL_DISTRIBUTION__MU = eINSTANCE.getNormalDistribution_Mu();

        /**
         * The meta object literal for the '<em><b>Sigma</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute NORMAL_DISTRIBUTION__SIGMA = eINSTANCE.getNormalDistribution_Sigma();

        /**
         * The meta object literal for the '
         * {@link de.uka.ipd.sdq.probfunction.impl.LognormalDistributionImpl
         * <em>Lognormal Distribution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.LognormalDistributionImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getLognormalDistribution()
         * @generated
         */
        EClass LOGNORMAL_DISTRIBUTION = eINSTANCE.getLognormalDistribution();

        /**
         * The meta object literal for the '<em><b>Mu</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LOGNORMAL_DISTRIBUTION__MU = eINSTANCE.getLognormalDistribution_Mu();

        /**
         * The meta object literal for the '<em><b>Sigma</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LOGNORMAL_DISTRIBUTION__SIGMA = eINSTANCE.getLognormalDistribution_Sigma();

        /**
         * The meta object literal for the '
         * {@link de.uka.ipd.sdq.probfunction.impl.GammaDistributionImpl
         * <em>Gamma Distribution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.GammaDistributionImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getGammaDistribution()
         * @generated
         */
        EClass GAMMA_DISTRIBUTION = eINSTANCE.getGammaDistribution();

        /**
         * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute GAMMA_DISTRIBUTION__ALPHA = eINSTANCE.getGammaDistribution_Alpha();

        /**
         * The meta object literal for the '<em><b>Theta</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute GAMMA_DISTRIBUTION__THETA = eINSTANCE.getGammaDistribution_Theta();

        /**
         * The meta object literal for the '{@link de.uka.ipd.sdq.probfunction.impl.IntSampleImpl
         * <em>Int Sample</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.IntSampleImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getIntSample()
         * @generated
         */
        EClass INT_SAMPLE = eINSTANCE.getIntSample();

        /**
         * The meta object literal for the '{@link de.uka.ipd.sdq.probfunction.impl.BoolSampleImpl
         * <em>Bool Sample</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.BoolSampleImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getBoolSample()
         * @generated
         */
        EClass BOOL_SAMPLE = eINSTANCE.getBoolSample();

        /**
         * The meta object literal for the '
         * {@link de.uka.ipd.sdq.probfunction.impl.DoubleSampleImpl <em>Double Sample</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.DoubleSampleImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getDoubleSample()
         * @generated
         */
        EClass DOUBLE_SAMPLE = eINSTANCE.getDoubleSample();

        /**
         * The meta object literal for the '
         * {@link de.uka.ipd.sdq.probfunction.impl.StringSampleImpl <em>String Sample</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see de.uka.ipd.sdq.probfunction.impl.StringSampleImpl
         * @see de.uka.ipd.sdq.probfunction.impl.ProbfunctionPackageImpl#getStringSample()
         * @generated
         */
        EClass STRING_SAMPLE = eINSTANCE.getStringSample();

    }

} // ProbfunctionPackage
