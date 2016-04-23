/**
 * 
 */
package de.uka.ipd.sdq.probfunction.math.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import de.uka.ipd.sdq.probfunction.math.IProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.math.IRandomGenerator;
import de.uka.ipd.sdq.probfunction.math.ISample;
import de.uka.ipd.sdq.probfunction.math.IUnit;
import de.uka.ipd.sdq.probfunction.math.exception.DifferentDomainsException;
import de.uka.ipd.sdq.probfunction.math.exception.DomainNotNumbersException;
import de.uka.ipd.sdq.probfunction.math.exception.InvalidSampleValueException;
import de.uka.ipd.sdq.probfunction.math.exception.ProbabilitySumNotOneException;
import de.uka.ipd.sdq.probfunction.math.exception.UnitNameNotSetException;
import de.uka.ipd.sdq.probfunction.math.exception.UnitNotSetException;
import de.uka.ipd.sdq.probfunction.math.exception.UnorderedDomainException;
import de.uka.ipd.sdq.probfunction.math.util.MathTools;

/**
 * @author Ihssane
 * 
 */
public class ProbabilityMassFunctionImpl extends ProbabilityFunctionImpl implements IProbabilityMassFunction {

    private List<ISample> samples;

    private enum Operation {
        ADD, SUB, MULT, DIV, SHIFT, STRETCH
    }

    protected ProbabilityMassFunctionImpl(List<ISample> samples, IUnit unit, boolean hasOrderedDomain,
            boolean isInFrequencyDomain, IRandomGenerator generator) {
        super(unit, hasOrderedDomain, isInFrequencyDomain);
        Collections.sort(samples, MathTools.getSampleComparator());
        this.samples = samples;

        randomGenerator = generator;
    }

    private IProbabilityMassFunction performOperation(Operation op, IProbabilityMassFunction pmf1,
            IProbabilityMassFunction pmf2) {
        List<ISample> resultList = new ArrayList<ISample>();

        Iterator<ISample> iterator = pmf2.getSamples().iterator();
        for (ISample s1 : pmf1.getSamples()) {
            ISample s2 = iterator.next();
            double result;
            switch (op) {
            case ADD:
                result = s1.getProbability() + s2.getProbability();
                break;
            case SUB:
                result = s1.getProbability() - s2.getProbability();
                break;
            case MULT:
                result = s1.getProbability() * s2.getProbability();
                break;
            case DIV:
                result = s1.getProbability() / s2.getProbability();
                break;
            default:
                result = 0.0;
                break;
            }
            resultList.add(pfFactory.createSample(s1.getValue(), result));
        }
        return pfFactory.createProbabilityMassFunction(resultList, this.getUnit(), hasOrderedDomain());
    }

    public IProbabilityMassFunction add(IProbabilityMassFunction pmf) throws DifferentDomainsException {
        if (!this.haveSameDomain(pmf))
            throw new DifferentDomainsException();

        return performOperation(Operation.ADD, this, pmf);
    }

    public IProbabilityMassFunction mult(IProbabilityMassFunction pmf) throws DifferentDomainsException {
        if (!this.haveSameDomain(pmf))
            throw new DifferentDomainsException();

        return performOperation(Operation.MULT, this, pmf);
    }

    public IProbabilityMassFunction scale(double scalar) {

        List<ISample> newList = new ArrayList<ISample>();
        for (ISample sample : samples)
            newList.add(pfFactory.createSample(sample.getValue(), sample.getProbability() * scalar));

        return pfFactory.createProbabilityMassFunction(newList, this.getUnit(), this.hasOrderedDomain());
    }

    public IProbabilityMassFunction div(IProbabilityMassFunction pmf) throws DifferentDomainsException {
        if (!this.haveSameDomain(pmf))
            throw new DifferentDomainsException();

        return performOperation(Operation.DIV, this, pmf);
    }

    public IProbabilityMassFunction sub(IProbabilityMassFunction pmf) throws DifferentDomainsException {
        if (!this.haveSameDomain(pmf))
            throw new DifferentDomainsException();

        return performOperation(Operation.SUB, this, pmf);
    }

    /**
     * Adjust this PMF and the passed PMF so that both have the same domain (probabilities for the
     * same values).
     * 
     * Assumes that the samples are sorted.
     * 
     * FIXME: The implementation is yet incomplete and needs to be revised.
     * 
     * @param otherPMF
     * @return the adjusted other PMF otherPMF
     */
    /*
     * private IProbabilityMassFunction makeSameDomain (IProbabilityMassFunction otherPMF){
     * 
     * List<ISample> valuesThis = this.samples; List<ISample> valuesOther = otherPMF.getSamples();
     * 
     * if (valuesThis.size() == 0 && valuesOther.size() == 0) return otherPMF;
     * 
     * if (valuesThis.size() == 0 && valuesOther.size() ==0){ throw new
     * RuntimeException("Cannot adjust the domains of an empty PMF."); }
     * 
     * // test for integer and double? // can also be Strings.. need to be the same type. // If
     * different, we need to be able to cast one number into another. boolean isIntegerThis = true;
     * boolean isIntegerOther = true;
     * 
     * //store values to add, the add after iterating, then sort. List<ISample> valuesToAddToThis =
     * new ArrayList<ISample>(valuesOther.size()); List<ISample> valuesToAddToOther = new
     * ArrayList<ISample>(valuesThis.size());
     * 
     * Comparator<ISample> comparator = new ValueBasedComparator();
     * 
     * //the following assumes a sorted list, I am not sure whether that is already guaranteed
     * Collections.sort(valuesThis, comparator); Collections.sort(valuesOther, comparator);
     * 
     * valuesToAddToThis = getAllMissingSamples(valuesThis, valuesOther); valuesToAddToOther =
     * getAllMissingSamples(valuesOther, valuesThis);
     * 
     * 
     * valuesThis.addAll(valuesToAddToThis); valuesOther.addAll(valuesToAddToOther);
     * Collections.sort(valuesThis, comparator); Collections.sort(valuesOther, comparator);
     * 
     * //TODO: align sample types if possible.
     * 
     * otherPMF.setSamples(valuesOther); return otherPMF;
     * 
     * }
     */

    /**
     * Add all values from valuesOther to valuesThis that have not been there before. Afterwards,
     * valuesThis should contain all values of valuesOther (and possibly more)
     * 
     * @param valuesThis
     * @param valuesOther
     * @return
     */
    /*
     * private List<ISample> getAllMissingSamples(List<ISample> valuesThis, List<ISample>
     * valuesOther) {
     * 
     * List<ISample> result = new ArrayList<ISample>();
     * 
     * Comparator<ISample> comparator = new ValueBasedComparator(); int indexOther = 0; ISample
     * sampleOther = valuesOther.get(0);
     * 
     * for (int indexThis = 0; indexThis < valuesThis.size(); indexThis++) {
     * 
     * ISample sampleThis = valuesThis.get(indexThis);
     * 
     * int compareResult = comparator.compare(sampleThis, sampleOther); if (compareResult < 0){
     * //sampleThis is smaller -> continue } else if (compareResult > 0){ //sampleThis is larger ->
     * add the other sample to results result.add(new SampleImpl(sampleOther.getValue(), 0));
     * sampleOther = valuesOther.get(indexOther); indexOther++; //sampleThis needs to be compared
     * again in the next iteration of the for loop. indexThis--; } else { //Both have a sample for
     * the same values, nothing to be done sampleOther = valuesOther.get(indexOther); indexOther++;
     * }
     * 
     * if (indexOther < valuesOther.size()){ sampleOther = valuesOther.get(indexOther); } else {
     * break; }
     * 
     * }
     * 
     * //maybe there are still values not addressed in list valuesOther for (int i = indexOther; i <
     * valuesOther.size(); i++) { result.add(new SampleImpl(valuesOther.get(i).getValue(),0)); }
     * 
     * return result; }
     */

    public boolean haveSameDomain(IProbabilityMassFunction pmf) {
        List<ISample> values1 = this.samples;
        List<ISample> values2 = pmf.getSamples();

        if (values1.size() != values2.size())
            return false;
        if (values1.size() == 0 && values2.size() == 0)
            return true;
        if (!(values1.get(0).getValue().getClass().isInstance(values2.get(0).getValue())))
            // if (new ValueBasedComparator().compare(values1.get(0),values2.get(0))!=0)
            return false;

        boolean result = true;
        Iterator<ISample> iterator = values2.iterator();
        for (ISample o : values1) {
            // use comparator here to really compare the value, not just the object.
            if (!o.getValue().equals((iterator.next().getValue())))
                result = false;
        }

        return result;
    }

    public IProbabilityMassFunction getFourierTramsform() {
        // TODO Auto-generated method stub
        return null;
    }

    public IProbabilityMassFunction getInverseFourierTransform() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @return the samples
     */
    public List<ISample> getSamples() {
        return new ArrayList<ISample>(samples);
    }

    /**
     * @param samples
     *            the samples to set
     * @throws ProbabilitySumNotOneException
     */
    public void setSamples(List<ISample> samples) {
        // if (!MathTools.equalsDouble(MathTools.sumOfSamples(samples), 1.0))
        // throw new ProbabilitySumNotOneException();
        if (samples.size() > 1 && samples.get(0).getValue() instanceof Comparable)
            Collections.sort(samples, MathTools.getSampleComparator());
        this.samples = samples;
    }

    public double getArithmeticMeanValue() throws DomainNotNumbersException {
        double mean = 0;
        for (ISample sample : this.samples) {
            Object value = sample.getValue();
            if (value instanceof Double) {
                Double d = (Double) value;
                mean += d * sample.getProbability();
            } else if (value instanceof Integer) {
                Integer i = (Integer) value;
                mean += i * sample.getProbability();
            } else if (value instanceof Long) {
                Long i = (Long) value;
                mean += i * sample.getProbability();
            } else if (value instanceof Float) {
                Float i = (Float) value;
                mean += i * sample.getProbability();
            } else {
                throw new DomainNotNumbersException();
            }
        }
        return mean;
    }

    public Object getMedian() throws UnorderedDomainException {
        return getPercentile(50);
    }

    public Object getPercentile(int p) throws IndexOutOfBoundsException, UnorderedDomainException {
        if (!hasOrderedDomain())
            throw new UnorderedDomainException();
        if (p < 0 || p > 100)
            throw new IndexOutOfBoundsException();

        int rank = (int) Math.floor((p * (samples.size() + 1.0)) / 100.0);
        return samples.get(rank).getValue();
    }

    public Object drawSample() {
        Object result = 0.0;
        List<Double> intervals = MathTools.computeCumulativeProbabilities(getProbabilities());

        double random = randomGenerator.random();
        for (int j = 0; j < intervals.size(); j++)
            if (random < intervals.get(j)) {
                result = samples.get(j).getValue();
                break;
            }
        return result;
    }

    private List<Double> getProbabilities() {
        List<Double> prob = new ArrayList<Double>();
        for (ISample s : samples)
            prob.add(s.getProbability());
        return prob;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (((IProbabilityMassFunction) obj).getSamples().size() != this.samples.size())
            return false;

        boolean result = true;
        Iterator<ISample> iterator = ((IProbabilityMassFunction) obj).getSamples().iterator();
        for (ISample o : this.getSamples()) {
            if (!o.equals(iterator.next()))
                result = false;
        }

        return result;
    }

    public double getProbabilitySum() {
        double sum = 0;
        for (ISample sample : samples) {
            sum += sample.getProbability();
        }
        return sum;
    }

    public void checkConstrains() throws ProbabilitySumNotOneException, InvalidSampleValueException,
            UnitNotSetException, UnitNameNotSetException {
        if (!MathTools.equalsDouble(getProbabilitySum(), 1.0))
            throw new ProbabilitySumNotOneException();

        // TODO: Fix this when units work again
        // if (getUnit() == null)
        // throw new UnitNotSetException();
        // if (getUnit().getUnitName() == null)
        // throw new UnitNameNotSetException();

        for (ISample sample : this.samples) {
            Object value = sample.getValue();
            if (value == null)
                throw new InvalidSampleValueException();
            if (sample.getProbability() < 0.0 || sample.getProbability() > 1.0)
                throw new InvalidSampleValueException();
        }
    }

    public IProbabilityMassFunction getCumulativeFunction() {
        List<Double> newProb = MathTools.computeCumulativeProbabilities(getProbabilities());
        List<ISample> newSamples = new ArrayList<ISample>();
        int index = 0;
        for (Double d : newProb) {
            newSamples.add(pfFactory.createSample(samples.get(index).getValue(), d));
            index++;
        }

        IProbabilityMassFunction pmf = null;
        pmf = pfFactory.createProbabilityMassFunction(newSamples, this.getUnit(), this.hasOrderedDomain());

        return pmf;
    }

    public IProbabilityMassFunction shiftDomain(double scalar) throws DomainNotNumbersException {
        return transformDomainValues(scalar, Operation.SHIFT);
    }

    public IProbabilityMassFunction stretchDomain(double scalar) throws DomainNotNumbersException {
        return transformDomainValues(scalar, Operation.STRETCH);
    }

    /**
     * Shifts or stretches the domain of the PMF according to the scalar factor given as a
     * parameter. Only works if the sample values are numbers.
     * 
     * Tries to preserve the value types. For example, if the factor scalar is an Integer and all
     * sample values are Integer, then the resulting PMF will also contain Integer-samples.
     * 
     * Scalar must not be equal to 0 if Operation is stretch.
     * 
     * @author Koziolek (kill me)
     * @param scalar
     *            the factor to shift or stretch the domain
     * @return
     */
    private IProbabilityMassFunction transformDomainValues(double scalar, Operation op)
            throws DomainNotNumbersException {
        List<ISample> resultList = new ArrayList<ISample>();

        // determine whether scalar is an int
        // (i.e., zero behind the point; example: 2.0)
        Double factorDouble = scalar;
        Integer factorInteger = factorDouble.intValue();
        boolean factorIsInteger = (factorDouble == factorInteger.doubleValue());

        for (ISample sample : samples) {
            Object value = sample.getValue();
            Number resultValue = null;
            // Ok, there are several cases, as we would like to
            // preserve the type of the value. Please beautify
            // this if possible. :)
            switch (op) {
            case SHIFT:
                if (value instanceof Integer && factorIsInteger) {
                    resultValue = new Integer((Integer) value + factorInteger);
                } else if (value instanceof Long && factorIsInteger) {
                    resultValue = new Long((Long) value + factorInteger);
                } else if (value instanceof Number) {
                    Number valueNumber = (Number) value;
                    resultValue = new Double(valueNumber.doubleValue() + factorDouble);
                } else
                    throw new DomainNotNumbersException();
                break;
            case STRETCH:
                if (value instanceof Integer && factorIsInteger) {
                    resultValue = new Integer((Integer) value * factorInteger);
                } else if (value instanceof Long && factorIsInteger) {
                    resultValue = new Long((Long) value * factorInteger);
                } else if (value instanceof Number) {
                    Number valueNumber = (Number) value;
                    resultValue = new Double(valueNumber.doubleValue() * factorDouble);
                } else
                    throw new DomainNotNumbersException();
                break;
            default:
                resultValue = 0.0;
            }

            resultList.add(pfFactory.createSample(resultValue, sample.getProbability()));
        }

        return pfFactory.createProbabilityMassFunction(resultList, this.getUnit(), hasOrderedDomain());
    }
}

// class ValueBasedComparator implements Comparator<ISample>{
//
//
// @Override
// public int compare(ISample arg0, ISample arg1) {
// Object value0 = arg0.getValue();
// Object value1 = arg1.getValue();
//
// if (value0.getClass().isInstance(value1)){
// return ((Comparable) value0).compareTo(value1);
// } else if (value1.getClass().isInstance(value0)){
// int result = ((Comparable) value1).compareTo(value0);
// return result * -1;
// } else if (value1 instanceof Number && value0 instanceof Number){
// Number number0 = (Number)value0;
// Number number1 = (Number)value1;
//
// return new Double(number0.doubleValue()).compareTo(new Double(number1.doubleValue()));
// } else {
// throw new DifferentDomainsException();
// }
// }
//
// }

