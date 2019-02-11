package io.github.squat_team.algorithm;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.ArchitecturalCopyCreator;
import io.github.squat_team.agentsUtils.ModifiabilityScenarioHelper;
import io.github.squat_team.agentsUtils.PerformanceScenarioHelper;
import io.github.squat_team.algorithm.util.PCMBotMockBuilder;
import io.github.squat_team.algorithm.util.PCMBotMockBuilderResult;
import io.github.squat_team.algorithm.util.PCMBotMockLinker;
import io.github.squat_team.algorithm.util.ScenarioHelperMockBuilder;
import io.github.squat_team.export.ExporterType;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.negotiation.NegotiatorResult;
import io.github.squat_team.negotiation.SQuATSillyBotsNegotiatorFactory;
import io.github.squat_team.performance.AbstractPerformancePCMScenario;
import io.github.squat_team.runner.SQuATConfiguration;
import io.github.squat_team.runner.SQuATController;
import io.github.squat_team.util.PCMHelper;

/**
 * This class simplifies the setup of tests for the SQuAT algorithm. Methods can
 * be overridden if necessary.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ PerformanceScenarioHelper.class, ModifiabilityScenarioHelper.class, PCMHelper.class, ArchitecturalCopyCreator.class})
public abstract class AbstractSQuATTest {
	protected ArchitecturalVersion initialArchitectureAsVersion;
	protected PCMArchitectureInstance initialArchitecture;
	protected List<AbstractPCMBot> bots = new ArrayList<AbstractPCMBot>();

	@Before
	public void setUp() throws Exception {
		PowerMockito.mockStatic(PCMHelper.class);
		generateInitialArchitecture();
		List<PCMBotMockBuilder> botBuilder = mockBots();
		mockAnalysisResponses(botBuilder);
		mockOptimizationResponses(botBuilder);
		List<PCMBotMockBuilderResult> botBuilderResults = buildBots(botBuilder);
		mockLinks(botBuilderResults);
		bots = extractBots(botBuilderResults);
		mockScenarios(bots);
	}

	@Test
	public void test() throws Exception {
		NegotiatorResult result = executeNegotiation(bots);
		validateResults(bots, result);
	}

	/**
	 * Initializes all bots necessary for this test.
	 * 
	 * @return The bots which should be built.
	 */
	protected abstract List<PCMBotMockBuilder> mockBots();

	/**
	 * Sets the results for the analysis of the initial architecture.
	 * 
	 * @param botBuilders
	 *            the initialized bot builders.
	 */
	protected abstract void mockAnalysisResponses(List<PCMBotMockBuilder> botBuilders);

	/**
	 * Sets the results for the optimization of the initial candidate.
	 * 
	 * @param botBuilders
	 *            the initialized bot builders.
	 */
	protected abstract void mockOptimizationResponses(List<PCMBotMockBuilder> botBuilders);

	/**
	 * Sets the analysis results of the other bots for the optimization results of
	 * another bot. The {@link PCMBotMockLinker} can do most of the work.
	 * 
	 * @param botResults
	 *            the results of the bot builders.
	 */
	protected abstract void mockLinks(List<PCMBotMockBuilderResult> botResults);

	/**
	 * In the end of the test the results have to be compared to the desired values.
	 * 
	 * @param bots
	 *            all the bots used in this test.
	 * @param result
	 *            contains all results found by the negotiation.
	 */
	protected abstract void validateResults(List<AbstractPCMBot> bots, NegotiatorResult result);

	//TODO
	protected abstract void mockScenarios(List<AbstractPCMBot> bots);

	protected void generateInitialArchitecture() {
		String name = "initialArchitecture";
		initialArchitecture = mock(PCMArchitectureInstance.class);
		when(initialArchitecture.getName()).thenReturn(name);
		initialArchitectureAsVersion = PCMBotMockLinker.generateArchitecturalVersion(initialArchitecture, "");
	}

	protected List<PCMBotMockBuilderResult> buildBots(List<PCMBotMockBuilder> botBuilder) throws Exception {
		List<PCMBotMockBuilderResult> botResults = new ArrayList<PCMBotMockBuilderResult>();
		for (PCMBotMockBuilder builder : botBuilder) {
			botResults.add(builder.build(initialArchitecture));
		}
		return botResults;
	}

	protected List<AbstractPCMBot> extractBots(List<PCMBotMockBuilderResult> botBuilders) {
		List<AbstractPCMBot> bots = new ArrayList<AbstractPCMBot>();
		for (PCMBotMockBuilderResult botResult : botBuilders) {
			bots.add(botResult.getBot());
		}
		return bots;
	}

	protected NegotiatorResult executeNegotiation(List<AbstractPCMBot> bots) throws Exception {
		SQuATConfiguration configuration = mock(SQuATConfiguration.class);
		when(configuration.createInitialArchitecture()).thenReturn(initialArchitectureAsVersion);

		// TODO: Move to test
		when(configuration.shouldFilterBestAlternatives()).thenReturn(true);
		when(configuration.getSeedSelectionSize()).thenReturn(2);
		when(configuration.getMaxNumberOfLevels()).thenReturn(1);
		when(configuration.getNegotiatorFactory()).thenReturn(new SQuATSillyBotsNegotiatorFactory());

		SQuATController controller = new SQuATController(configuration);
		return controller.negotiatiateUntilAnAgreementIsReached();
	}

}
