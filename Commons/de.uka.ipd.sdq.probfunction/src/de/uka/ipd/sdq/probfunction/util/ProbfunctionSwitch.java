/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see de.uka.ipd.sdq.probfunction.ProbfunctionPackage
 * @generated
 */
public class ProbfunctionSwitch<T1> extends Switch<T1> {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static ProbfunctionPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProbfunctionSwitch() {
        if (modelPackage == null) {
            modelPackage = ProbfunctionPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T1 doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case ProbfunctionPackage.BOXED_PDF: {
            final BoxedPDF boxedPDF = (BoxedPDF) theEObject;
            T1 result = this.caseBoxedPDF(boxedPDF);
            if (result == null) {
                result = this.caseProbabilityDensityFunction(boxedPDF);
            }
            if (result == null) {
                result = this.caseProbabilityFunction(boxedPDF);
            }
            if (result == null) {
                result = this.caseUnitCarryingElement(boxedPDF);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.PROBABILITY_DENSITY_FUNCTION: {
            final ProbabilityDensityFunction probabilityDensityFunction = (ProbabilityDensityFunction) theEObject;
            T1 result = this.caseProbabilityDensityFunction(probabilityDensityFunction);
            if (result == null) {
                result = this.caseProbabilityFunction(probabilityDensityFunction);
            }
            if (result == null) {
                result = this.caseUnitCarryingElement(probabilityDensityFunction);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.PROBABILITY_FUNCTION: {
            final ProbabilityFunction probabilityFunction = (ProbabilityFunction) theEObject;
            T1 result = this.caseProbabilityFunction(probabilityFunction);
            if (result == null) {
                result = this.caseUnitCarryingElement(probabilityFunction);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.CONTINUOUS_SAMPLE: {
            final ContinuousSample continuousSample = (ContinuousSample) theEObject;
            T1 result = this.caseContinuousSample(continuousSample);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION: {
            final ProbabilityMassFunction probabilityMassFunction = (ProbabilityMassFunction) theEObject;
            T1 result = this.caseProbabilityMassFunction(probabilityMassFunction);
            if (result == null) {
                result = this.caseProbabilityFunction(probabilityMassFunction);
            }
            if (result == null) {
                result = this.caseUnitCarryingElement(probabilityMassFunction);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.SAMPLE: {
            final Sample<?> sample = (Sample<?>) theEObject;
            T1 result = this.caseSample(sample);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.SAMPLE_PDF: {
            final SamplePDF samplePDF = (SamplePDF) theEObject;
            T1 result = this.caseSamplePDF(samplePDF);
            if (result == null) {
                result = this.caseProbabilityDensityFunction(samplePDF);
            }
            if (result == null) {
                result = this.caseProbabilityFunction(samplePDF);
            }
            if (result == null) {
                result = this.caseUnitCarryingElement(samplePDF);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.COMPLEX: {
            final Complex complex = (Complex) theEObject;
            T1 result = this.caseComplex(complex);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.CONTINUOUS_PDF: {
            final ContinuousPDF continuousPDF = (ContinuousPDF) theEObject;
            T1 result = this.caseContinuousPDF(continuousPDF);
            if (result == null) {
                result = this.caseProbabilityDensityFunction(continuousPDF);
            }
            if (result == null) {
                result = this.caseProbabilityFunction(continuousPDF);
            }
            if (result == null) {
                result = this.caseUnitCarryingElement(continuousPDF);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.EXPONENTIAL_DISTRIBUTION: {
            final ExponentialDistribution exponentialDistribution = (ExponentialDistribution) theEObject;
            T1 result = this.caseExponentialDistribution(exponentialDistribution);
            if (result == null) {
                result = this.caseContinuousPDF(exponentialDistribution);
            }
            if (result == null) {
                result = this.caseProbabilityDensityFunction(exponentialDistribution);
            }
            if (result == null) {
                result = this.caseProbabilityFunction(exponentialDistribution);
            }
            if (result == null) {
                result = this.caseUnitCarryingElement(exponentialDistribution);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.NORMAL_DISTRIBUTION: {
            final NormalDistribution normalDistribution = (NormalDistribution) theEObject;
            T1 result = this.caseNormalDistribution(normalDistribution);
            if (result == null) {
                result = this.caseContinuousPDF(normalDistribution);
            }
            if (result == null) {
                result = this.caseProbabilityDensityFunction(normalDistribution);
            }
            if (result == null) {
                result = this.caseProbabilityFunction(normalDistribution);
            }
            if (result == null) {
                result = this.caseUnitCarryingElement(normalDistribution);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.LOGNORMAL_DISTRIBUTION: {
            final LognormalDistribution lognormalDistribution = (LognormalDistribution) theEObject;
            T1 result = this.caseLognormalDistribution(lognormalDistribution);
            if (result == null) {
                result = this.caseContinuousPDF(lognormalDistribution);
            }
            if (result == null) {
                result = this.caseProbabilityDensityFunction(lognormalDistribution);
            }
            if (result == null) {
                result = this.caseProbabilityFunction(lognormalDistribution);
            }
            if (result == null) {
                result = this.caseUnitCarryingElement(lognormalDistribution);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.GAMMA_DISTRIBUTION: {
            final GammaDistribution gammaDistribution = (GammaDistribution) theEObject;
            T1 result = this.caseGammaDistribution(gammaDistribution);
            if (result == null) {
                result = this.caseContinuousPDF(gammaDistribution);
            }
            if (result == null) {
                result = this.caseProbabilityDensityFunction(gammaDistribution);
            }
            if (result == null) {
                result = this.caseProbabilityFunction(gammaDistribution);
            }
            if (result == null) {
                result = this.caseUnitCarryingElement(gammaDistribution);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.INT_SAMPLE: {
            final IntSample intSample = (IntSample) theEObject;
            T1 result = this.caseIntSample(intSample);
            if (result == null) {
                result = this.caseSample(intSample);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.BOOL_SAMPLE: {
            final BoolSample boolSample = (BoolSample) theEObject;
            T1 result = this.caseBoolSample(boolSample);
            if (result == null) {
                result = this.caseSample(boolSample);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.DOUBLE_SAMPLE: {
            final DoubleSample doubleSample = (DoubleSample) theEObject;
            T1 result = this.caseDoubleSample(doubleSample);
            if (result == null) {
                result = this.caseSample(doubleSample);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ProbfunctionPackage.STRING_SAMPLE: {
            final StringSample stringSample = (StringSample) theEObject;
            T1 result = this.caseStringSample(stringSample);
            if (result == null) {
                result = this.caseSample(stringSample);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Boxed PDF</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boxed PDF</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseBoxedPDF(final BoxedPDF object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Probability Density Function</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Probability Density Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseProbabilityDensityFunction(final ProbabilityDensityFunction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Probability Function</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Probability Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseProbabilityFunction(final ProbabilityFunction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Continuous Sample</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Continuous Sample</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseContinuousSample(final ContinuousSample object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Probability Mass Function</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Probability Mass Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseProbabilityMassFunction(final ProbabilityMassFunction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sample</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sample</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <T> T1 caseSample(final Sample<T> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sample PDF</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sample PDF</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseSamplePDF(final SamplePDF object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Complex</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Complex</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseComplex(final Complex object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Continuous PDF</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Continuous PDF</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseContinuousPDF(final ContinuousPDF object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Exponential Distribution</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Exponential Distribution</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseExponentialDistribution(final ExponentialDistribution object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Normal Distribution</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Normal Distribution</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseNormalDistribution(final NormalDistribution object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Lognormal Distribution</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Lognormal Distribution</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseLognormalDistribution(final LognormalDistribution object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gamma Distribution</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gamma Distribution</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseGammaDistribution(final GammaDistribution object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Int Sample</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Int Sample</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseIntSample(final IntSample object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bool Sample</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bool Sample</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseBoolSample(final BoolSample object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Double Sample</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Double Sample</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseDoubleSample(final DoubleSample object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Sample</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Sample</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseStringSample(final StringSample object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Unit Carrying Element</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Unit Carrying Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseUnitCarryingElement(final UnitCarryingElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T1 defaultCase(final EObject object) {
        return null;
    }

} // ProbfunctionSwitch
