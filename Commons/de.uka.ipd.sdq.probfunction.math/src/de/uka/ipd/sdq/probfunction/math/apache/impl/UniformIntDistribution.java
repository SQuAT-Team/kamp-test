/**
 * 
 */
package de.uka.ipd.sdq.probfunction.math.apache.impl;

import org.apache.commons.math.MathException;

import de.uka.ipd.sdq.probfunction.math.IUniformIntDistribution;
import de.uka.ipd.sdq.probfunction.math.apache.distribution.UniformIntDistributionImpl;
import de.uka.ipd.sdq.probfunction.math.exception.DomainNotNumbersException;
import de.uka.ipd.sdq.probfunction.math.exception.FunctionNotInTimeDomainException;
import de.uka.ipd.sdq.probfunction.math.exception.ProbabilityFunctionException;
import de.uka.ipd.sdq.probfunction.math.exception.UnorderedDomainException;

/**
 * @author joerg
 * 
 */
public class UniformIntDistribution extends AbstractDiscretePDF implements IUniformIntDistribution {

    @Override
    public int inverseF(double u) {
        int value = super.inverseF(u);

        // Fix for bug in Apache commons math 2.1
        ++value;
        int ub = ((UniformIntDistributionImpl) this.internalFunction).getB();
        if (value > ub)
            value = ub;
        // end fix

        return value;
    }

    public UniformIntDistribution(int a, int b) {
        try {
            this.internalFunction = new UniformIntDistributionImpl(a, b);
        } catch (MathException e) {
            throw new ProbabilityFunctionException(e.getLocalizedMessage());
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.probfunction.math.IContinousPDF#getStandardDeviation()
     */
    @Override
    public double getStandardDeviation() {
        return Math.sqrt(((UniformIntDistributionImpl) internalFunction).getVariance());
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.probfunction.math.IContinousPDF#getXinf()
     */
    @Override
    public double getXinf() {
        return ((UniformIntDistributionImpl) internalFunction).getB();
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.probfunction.math.IContinousPDF#getXsup()
     */
    @Override
    public double getXsup() {

        return ((UniformIntDistributionImpl) internalFunction).getA();
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.probfunction.math.IProbabilityFunction#getArithmeticMeanValue()
     */
    @Override
    public double getArithmeticMeanValue() throws DomainNotNumbersException, FunctionNotInTimeDomainException {
        return ((UniformIntDistributionImpl) internalFunction).getMean();
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.probfunction.math.IProbabilityFunction#getMedian()
     */
    @Override
    public Object getMedian() throws UnorderedDomainException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.probfunction.math.IProbabilityFunction#getPercentile(int)
     */
    @Override
    public Object getPercentile(int p) throws IndexOutOfBoundsException, UnorderedDomainException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.probfunction.math.IProbabilityFunction#hasOrderedDomain()
     */
    @Override
    public boolean hasOrderedDomain() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getLowerDomainBorder() {
        return ((UniformIntDistributionImpl) internalFunction).getA();
    }

    @Override
    public double getMean() {
        return ((UniformIntDistributionImpl) internalFunction).getMean();
    }

    @Override
    public int getA() {

        return ((UniformIntDistributionImpl) internalFunction).getA();
    }

    @Override
    public int getB() {

        return ((UniformIntDistributionImpl) internalFunction).getB();
    }

}
