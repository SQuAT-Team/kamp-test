/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import de.uka.ipd.sdq.probfunction.ProbfunctionFactory;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.probfunction.Sample;
import de.uka.ipd.sdq.probfunction.SamplePDF;
import de.uka.ipd.sdq.probfunction.StringSample;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ProbfunctionPackageImpl extends EPackageImpl implements ProbfunctionPackage {

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
    private EClass boxedPDFEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass probabilityDensityFunctionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass probabilityFunctionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass continuousSampleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass probabilityMassFunctionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass sampleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass samplePDFEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass complexEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass continuousPDFEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass exponentialDistributionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass normalDistributionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass lognormalDistributionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass gammaDistributionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass intSampleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass boolSampleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass doubleSampleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass stringSampleEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.uka.ipd.sdq.probfunction.ProbfunctionPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ProbfunctionPackageImpl() {
        super(eNS_URI, ProbfunctionFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link ProbfunctionPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ProbfunctionPackage init() {
        if (isInited) {
            return (ProbfunctionPackage) EPackage.Registry.INSTANCE.getEPackage(ProbfunctionPackage.eNS_URI);
        }

        // Obtain or create and register package
        final ProbfunctionPackageImpl theProbfunctionPackage = (ProbfunctionPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof ProbfunctionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new ProbfunctionPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        UnitsPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theProbfunctionPackage.createPackageContents();

        // Initialize created meta-data
        theProbfunctionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theProbfunctionPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ProbfunctionPackage.eNS_URI, theProbfunctionPackage);
        return theProbfunctionPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getBoxedPDF() {
        return this.boxedPDFEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getBoxedPDF_Samples() {
        return (EReference) this.boxedPDFEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getProbabilityDensityFunction() {
        return this.probabilityDensityFunctionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getProbabilityFunction() {
        return this.probabilityFunctionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getContinuousSample() {
        return this.continuousSampleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getContinuousSample_Value() {
        return (EAttribute) this.continuousSampleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getContinuousSample_Probability() {
        return (EAttribute) this.continuousSampleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getProbabilityMassFunction() {
        return this.probabilityMassFunctionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getProbabilityMassFunction_Samples() {
        return (EReference) this.probabilityMassFunctionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getProbabilityMassFunction_OrderedDomain() {
        return (EAttribute) this.probabilityMassFunctionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSample() {
        return this.sampleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getSample_Value() {
        return (EAttribute) this.sampleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getSample_Probability() {
        return (EAttribute) this.sampleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSamplePDF() {
        return this.samplePDFEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getSamplePDF_Distance() {
        return (EAttribute) this.samplePDFEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSamplePDF_Values() {
        return (EReference) this.samplePDFEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getComplex() {
        return this.complexEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getComplex_Real() {
        return (EAttribute) this.complexEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getComplex_Imaginary() {
        return (EAttribute) this.complexEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getContinuousPDF() {
        return this.continuousPDFEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getExponentialDistribution() {
        return this.exponentialDistributionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getExponentialDistribution_Rate() {
        return (EAttribute) this.exponentialDistributionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNormalDistribution() {
        return this.normalDistributionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNormalDistribution_Mu() {
        return (EAttribute) this.normalDistributionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNormalDistribution_Sigma() {
        return (EAttribute) this.normalDistributionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getLognormalDistribution() {
        return this.lognormalDistributionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getLognormalDistribution_Mu() {
        return (EAttribute) this.lognormalDistributionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getLognormalDistribution_Sigma() {
        return (EAttribute) this.lognormalDistributionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getGammaDistribution() {
        return this.gammaDistributionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getGammaDistribution_Alpha() {
        return (EAttribute) this.gammaDistributionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getGammaDistribution_Theta() {
        return (EAttribute) this.gammaDistributionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getIntSample() {
        return this.intSampleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getBoolSample() {
        return this.boolSampleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getDoubleSample() {
        return this.doubleSampleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getStringSample() {
        return this.stringSampleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProbfunctionFactory getProbfunctionFactory() {
        return (ProbfunctionFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.boxedPDFEClass = this.createEClass(BOXED_PDF);
        this.createEReference(this.boxedPDFEClass, BOXED_PDF__SAMPLES);

        this.probabilityDensityFunctionEClass = this.createEClass(PROBABILITY_DENSITY_FUNCTION);

        this.probabilityFunctionEClass = this.createEClass(PROBABILITY_FUNCTION);

        this.continuousSampleEClass = this.createEClass(CONTINUOUS_SAMPLE);
        this.createEAttribute(this.continuousSampleEClass, CONTINUOUS_SAMPLE__VALUE);
        this.createEAttribute(this.continuousSampleEClass, CONTINUOUS_SAMPLE__PROBABILITY);

        this.probabilityMassFunctionEClass = this.createEClass(PROBABILITY_MASS_FUNCTION);
        this.createEReference(this.probabilityMassFunctionEClass, PROBABILITY_MASS_FUNCTION__SAMPLES);
        this.createEAttribute(this.probabilityMassFunctionEClass, PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN);

        this.sampleEClass = this.createEClass(SAMPLE);
        this.createEAttribute(this.sampleEClass, SAMPLE__PROBABILITY);
        this.createEAttribute(this.sampleEClass, SAMPLE__VALUE);

        this.samplePDFEClass = this.createEClass(SAMPLE_PDF);
        this.createEAttribute(this.samplePDFEClass, SAMPLE_PDF__DISTANCE);
        this.createEReference(this.samplePDFEClass, SAMPLE_PDF__VALUES);

        this.complexEClass = this.createEClass(COMPLEX);
        this.createEAttribute(this.complexEClass, COMPLEX__REAL);
        this.createEAttribute(this.complexEClass, COMPLEX__IMAGINARY);

        this.continuousPDFEClass = this.createEClass(CONTINUOUS_PDF);

        this.exponentialDistributionEClass = this.createEClass(EXPONENTIAL_DISTRIBUTION);
        this.createEAttribute(this.exponentialDistributionEClass, EXPONENTIAL_DISTRIBUTION__RATE);

        this.normalDistributionEClass = this.createEClass(NORMAL_DISTRIBUTION);
        this.createEAttribute(this.normalDistributionEClass, NORMAL_DISTRIBUTION__MU);
        this.createEAttribute(this.normalDistributionEClass, NORMAL_DISTRIBUTION__SIGMA);

        this.lognormalDistributionEClass = this.createEClass(LOGNORMAL_DISTRIBUTION);
        this.createEAttribute(this.lognormalDistributionEClass, LOGNORMAL_DISTRIBUTION__MU);
        this.createEAttribute(this.lognormalDistributionEClass, LOGNORMAL_DISTRIBUTION__SIGMA);

        this.gammaDistributionEClass = this.createEClass(GAMMA_DISTRIBUTION);
        this.createEAttribute(this.gammaDistributionEClass, GAMMA_DISTRIBUTION__ALPHA);
        this.createEAttribute(this.gammaDistributionEClass, GAMMA_DISTRIBUTION__THETA);

        this.intSampleEClass = this.createEClass(INT_SAMPLE);

        this.boolSampleEClass = this.createEClass(BOOL_SAMPLE);

        this.doubleSampleEClass = this.createEClass(DOUBLE_SAMPLE);

        this.stringSampleEClass = this.createEClass(STRING_SAMPLE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final UnitsPackage theUnitsPackage = (UnitsPackage) EPackage.Registry.INSTANCE
                .getEPackage(UnitsPackage.eNS_URI);

        // Create type parameters
        final ETypeParameter sampleEClass_T = this.addETypeParameter(this.sampleEClass, "T");

        // Set bounds for type parameters

        // Add supertypes to classes
        this.boxedPDFEClass.getESuperTypes().add(this.getProbabilityDensityFunction());
        this.probabilityDensityFunctionEClass.getESuperTypes().add(this.getProbabilityFunction());
        this.probabilityFunctionEClass.getESuperTypes().add(theUnitsPackage.getUnitCarryingElement());
        this.probabilityMassFunctionEClass.getESuperTypes().add(this.getProbabilityFunction());
        this.samplePDFEClass.getESuperTypes().add(this.getProbabilityDensityFunction());
        this.continuousPDFEClass.getESuperTypes().add(this.getProbabilityDensityFunction());
        this.exponentialDistributionEClass.getESuperTypes().add(this.getContinuousPDF());
        this.normalDistributionEClass.getESuperTypes().add(this.getContinuousPDF());
        this.lognormalDistributionEClass.getESuperTypes().add(this.getContinuousPDF());
        this.gammaDistributionEClass.getESuperTypes().add(this.getContinuousPDF());
        EGenericType g1 = this.createEGenericType(this.getSample());
        EGenericType g2 = this.createEGenericType(this.ecorePackage.getEIntegerObject());
        g1.getETypeArguments().add(g2);
        this.intSampleEClass.getEGenericSuperTypes().add(g1);
        g1 = this.createEGenericType(this.getSample());
        g2 = this.createEGenericType(this.ecorePackage.getEBooleanObject());
        g1.getETypeArguments().add(g2);
        this.boolSampleEClass.getEGenericSuperTypes().add(g1);
        g1 = this.createEGenericType(this.getSample());
        g2 = this.createEGenericType(this.ecorePackage.getEDoubleObject());
        g1.getETypeArguments().add(g2);
        this.doubleSampleEClass.getEGenericSuperTypes().add(g1);
        g1 = this.createEGenericType(this.getSample());
        g2 = this.createEGenericType(this.ecorePackage.getEString());
        g1.getETypeArguments().add(g2);
        this.stringSampleEClass.getEGenericSuperTypes().add(g1);

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.boxedPDFEClass, BoxedPDF.class, "BoxedPDF", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getBoxedPDF_Samples(), this.getContinuousSample(), null, "samples", null, 0, -1,
                BoxedPDF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.probabilityDensityFunctionEClass, ProbabilityDensityFunction.class,
                "ProbabilityDensityFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.probabilityFunctionEClass, ProbabilityFunction.class, "ProbabilityFunction", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.continuousSampleEClass, ContinuousSample.class, "ContinuousSample", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getContinuousSample_Value(), this.ecorePackage.getEDouble(), "value", null, 0, 1,
                ContinuousSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getContinuousSample_Probability(), this.ecorePackage.getEDouble(), "probability",
                null, 0, 1, ContinuousSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.probabilityMassFunctionEClass, ProbabilityMassFunction.class, "ProbabilityMassFunction",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getProbabilityMassFunction_Samples(), this.getSample(), null, "samples", null, 1, -1,
                ProbabilityMassFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getProbabilityMassFunction_OrderedDomain(), this.ecorePackage.getEBoolean(),
                "orderedDomain", null, 1, 1, ProbabilityMassFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.sampleEClass, Sample.class, "Sample", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getSample_Probability(), this.ecorePackage.getEDouble(), "probability", null, 0, 1,
                Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        g1 = this.createEGenericType(sampleEClass_T);
        this.initEAttribute(this.getSample_Value(), g1, "value", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.samplePDFEClass, SamplePDF.class, "SamplePDF", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getSamplePDF_Distance(), this.ecorePackage.getEDouble(), "distance", null, 0, 1,
                SamplePDF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getSamplePDF_Values(), this.getComplex(), null, "values", null, 0, -1,
                SamplePDF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.complexEClass, Complex.class, "Complex", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getComplex_Real(), this.ecorePackage.getEDouble(), "real", null, 1, 1, Complex.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getComplex_Imaginary(), this.ecorePackage.getEDouble(), "imaginary", null, 1, 1,
                Complex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.continuousPDFEClass, ContinuousPDF.class, "ContinuousPDF", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.exponentialDistributionEClass, ExponentialDistribution.class, "ExponentialDistribution",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getExponentialDistribution_Rate(), this.ecorePackage.getEDouble(), "rate", null, 1, 1,
                ExponentialDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.normalDistributionEClass, NormalDistribution.class, "NormalDistribution", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getNormalDistribution_Mu(), this.ecorePackage.getEDouble(), "mu", null, 1, 1,
                NormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getNormalDistribution_Sigma(), this.ecorePackage.getEDouble(), "sigma", null, 1, 1,
                NormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.lognormalDistributionEClass, LognormalDistribution.class, "LognormalDistribution",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getLognormalDistribution_Mu(), this.ecorePackage.getEDouble(), "mu", null, 1, 1,
                LognormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getLognormalDistribution_Sigma(), this.ecorePackage.getEDouble(), "sigma", null, 1, 1,
                LognormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.gammaDistributionEClass, GammaDistribution.class, "GammaDistribution", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getGammaDistribution_Alpha(), this.ecorePackage.getEDouble(), "alpha", null, 1, 1,
                GammaDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getGammaDistribution_Theta(), this.ecorePackage.getEDouble(), "theta", null, 1, 1,
                GammaDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.intSampleEClass, IntSample.class, "IntSample", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.boolSampleEClass, BoolSample.class, "BoolSample", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.doubleSampleEClass, DoubleSample.class, "DoubleSample", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.stringSampleEClass, StringSample.class, "StringSample", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        this.createResource(eNS_URI);
    }

} // ProbfunctionPackageImpl
