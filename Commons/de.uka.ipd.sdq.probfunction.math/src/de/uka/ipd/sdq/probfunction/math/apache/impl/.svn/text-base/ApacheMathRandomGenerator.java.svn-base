package de.uka.ipd.sdq.probfunction.math.apache.impl;

import org.apache.commons.math.random.RandomGenerator;
import org.apache.log4j.Logger;

import de.uka.ipd.sdq.probfunction.math.random.IRandomStream;

/**
 * Adapter for apache.math random generators.
 *
 * @author joerg
 *
 */
public class ApacheMathRandomGenerator implements IRandomStream {

    private static final Logger LOGGER = Logger.getLogger(ApacheMathRandomGenerator.class);

    protected RandomGenerator rng;

    public ApacheMathRandomGenerator(final RandomGenerator rng) {
        super();
        this.rng = rng;
    }

    @Override
    public void setSeed(final int[] seed) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Random number generator about to get initialized");
            final StringBuffer sb = new StringBuffer();
            for (final int s : seed) {
                sb.append(s + " ");
            }
            LOGGER.debug("Seed is "+sb.toString());
        }
        rng.setSeed(seed);
    }

    @Override
    public double nextDouble() {
        return rng.nextDouble();
    }

    @Override
    public void setSeed(final long[] seed) {
        final int[] intSeed = new int[seed.length];

        for (int i = 0; i < seed.length; i++) {
            final long s = seed[i];
            if (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE) {
                throw new IllegalArgumentException(s + " cannot be cast to int without changing its value.");
            }
            intSeed[i] = (int) s;
        }
        setSeed(intSeed);
    }

}
