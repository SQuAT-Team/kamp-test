package de.fakeller.performance.analysis.result.trace;

import de.fakeller.performance.analysis.result.AbstractPerformanceResult;
import de.fakeller.performance.analysis.result.Attach;
import de.fakeller.performance.analysis.result.AttachedResult;
import de.fakeller.performance.analysis.result.PerformanceResult;
import de.fakeller.performance.analysis.result.metric.DirectMetric;
import de.fakeller.performance.analysis.result.quantity.Utilization;
import de.fakeller.performance.analysis.result.valueobject.Percentage;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @author Fabian Keller
 */
public class DefaultTraceMapperTest {

    private DefaultTraceMapper<String, Double> sut;
    private AbstractPerformanceResult<String> results;

    @Before
    public void setUp() throws Exception {
        this.results = new AbstractPerformanceResult<String>() {
        };

        this.sut = new DefaultTraceMapper<String, Double>(() -> new AbstractPerformanceResult<Double>() {
        }, stringTrace -> {
            try {
                return Optional.of(Double.valueOf(stringTrace));
            } catch (final NumberFormatException e) {
                return Optional.empty();
            }
        });
    }

    @Test
    public void map_emptyResult_createEmptyResult() throws Exception {
        assertFalse(this.sut.map(this.results).hasResults());
    }

    @Test
    public void map_regularResult_toMappedResult() throws Exception {
        this.results.attach(Attach.to("1.0").utilization(Percentage.of(0.44)).direct());
        this.results.attach(Attach.to("1.0").utilization(Percentage.of(0.88)).direct());
        this.results.attach(Attach.to("2.0").utilization(Percentage.of(0.22)).direct());
        final PerformanceResult<Double> mapped = this.sut.map(this.results);
        assertTrue(mapped.hasResults());
        assertTrue(mapped.hasResults(1.0));
        assertTrue(mapped.hasResults(2.0));
        assertFalse(mapped.hasResults(3.0));
        assertEquals(Arrays.asList(
                new AttachedResult<Double>(1.0, new DirectMetric<>(new Utilization(Percentage.of(0.44)))),
                new AttachedResult<Double>(1.0, new DirectMetric<>(new Utilization(Percentage.of(0.88))))
        ), mapped.getResults(1.0));
    }

    @Test
    public void map_untracableResult_toNoResult() throws Exception {
        this.results.attach(Attach.to("thisIsNotTraceable").utilization(Percentage.of(0.44)).direct());
        assertTrue(this.results.hasResults());
        assertFalse(this.sut.map(this.results).hasResults());
    }
}