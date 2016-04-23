package de.uka.ipd.sdq.probfunction.math.test;

import junit.framework.Assert;

import org.junit.Test;

import de.uka.ipd.sdq.probfunction.math.util.MathTools;

public class MathToolsTest {

    @Test
    public void testNextPowerOfTwo() {
        Assert.assertEquals(8, MathTools.nextPowerOfTwo(7));
        Assert.assertEquals(8, MathTools.nextPowerOfTwo(8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNextPowerOfTwoForIllegalArguments() {
        MathTools.nextPowerOfTwo(0);
    }

}
