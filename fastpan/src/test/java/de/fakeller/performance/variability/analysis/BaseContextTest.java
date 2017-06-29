package de.fakeller.performance.variability.analysis;

import de.fakeller.performance.analysis.AnalysisContext;
import de.fakeller.performance.analysis.PerformanceAnalyzer;
import de.fakeller.performance.analysis.result.PerformanceResult;
import de.fakeller.performance.variability.SystemProvider;
import de.fakeller.performance.variability.configuration.BaseConfiguration;
import de.fakeller.performance.variability.configuration.Configuration;
import de.fakeller.performance.variability.configuration.ConfigurationProvider;
import de.fakeller.performance.variability.feature.BaseFeatureModel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Fabian Keller
 */
public class BaseContextTest {

    private BaseContext<String, String> sut;

    // mocks //

    SystemProvider<String, String> systemProvider;
    ConfigurationProvider<String> configurationProvider;
    PerformanceAnalyzer<String, AnalysisContext<String>> analyzer;

    // feature model //

    BaseFeatureModel<String> fm = new BaseFeatureModel<String>(Arrays.asList("one", "two", "three"));

    @Before
    public void setUp() throws Exception {
        this.systemProvider = mock(SystemProvider.class);
        this.configurationProvider = mock(ConfigurationProvider.class);
        this.analyzer = mock(PerformanceAnalyzer.class);
        this.sut = new BaseContext<>(this.configurationProvider, this.systemProvider, this.analyzer);
    }

    @Test
    public void analyze_withNoConfigurations() throws Exception {
        when(this.configurationProvider.configurations()).thenReturn(new ArrayList<Configuration<String>>().iterator());
        this.sut.analyze();
        assertNotNull(this.sut.getResults());
    }

    @Test
    public void analyze_withSomeConfigurations() throws Exception {
        when(this.configurationProvider.configurations()).thenReturn(Stream.<Configuration<String>>of(
                new BaseConfiguration<>(this.fm),
                new BaseConfiguration<>(this.fm).enable(this.fm.get(0)).enable(this.fm.get(2))
        ).iterator());
        when(this.systemProvider.systemFor(any())).thenReturn("x");
        final AnalysisContext ac = mock(AnalysisContext.class);
        when(this.analyzer.setupAnalysis(any())).thenReturn(ac);
        when(ac.analyze()).thenReturn(mock(PerformanceResult.class));

        this.sut.analyze();
        assertNotNull(this.sut.getResults());
        assertEquals(2, this.sut.getResults().size());
    }
}