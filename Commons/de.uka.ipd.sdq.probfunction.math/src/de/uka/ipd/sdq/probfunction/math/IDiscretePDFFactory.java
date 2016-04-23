package de.uka.ipd.sdq.probfunction.math;

public interface IDiscretePDFFactory {

    /**
     * Creates a new BinomialDistribution for doing math.
     * 
     * @param trials
     *            The trials
     * @param probability
     *            The probability of success
     * @return The distribution
     */
    public IBinomialDistribution createBinomialDistribution(int trials, double probability);

    /**
     * Creates a new PoissonDistribution for doing math.
     * 
     * @param mean
     *            The mean
     * @return The distribution
     */
    public IPoissonDistribution createPoissonDistribution(double mean);

    /**
     * Creates a new UniformIntDistribution for doing math.
     * 
     * @param a
     *            The a value
     * @param b
     *            The b value
     * @return The distribution
     */
    public IUniformIntDistribution createUniformIntDistribution(int a, int b);
}
