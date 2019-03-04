package io.github.squat_team.util;

import java.util.Random;

/**
 * A central class that generates {@link Random}s for SQuAT. This class should
 * be used if it should be possible to disable randomness (for testing
 * purposes).
 * 
 */
public class RandomGenerator {
	public static final RandomGenerator INSTANCE = new RandomGenerator();
	private boolean useSeed = false;
	private long seed;

	public static RandomGenerator getInstance() {
		return INSTANCE;
	}

	private RandomGenerator() {
		// Singleton
	}

	/**
	 * All the (future) generated {@link Random}s will use this seed from now on.
	 * 
	 * @param seed
	 *            the seed used by the {@link Random}s
	 */
	public void setSeed(long seed) {
		this.seed = seed;
		this.useSeed = true;
	}

	/**
	 * Creates a new {@link Random} for every invocation. They are usually all
	 * different under normal operations, but deterministic for test cases that
	 * called {@link #setSeed(long)} before.
	 * 
	 * @return
	 */
	public Random generate() {
		if (useSeed) {
			return new Random(seed);
		} else {
			return new Random();
		}
	}

}
