package io.github.squat_team.algorithm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.algorithm.util.PCMBotMockBuilder;
import io.github.squat_team.algorithm.util.PCMBotMockBuilderResult;
import io.github.squat_team.experiments.AbstractExperiment;
import io.github.squat_team.experiments.IExperiment;
import io.github.squat_team.experiments.filters.BestCandidatesFilter;
import io.github.squat_team.experiments.filters.CorruptedCandidatesFilter;
import io.github.squat_team.experiments.filters.IFilter;
import io.github.squat_team.experiments.filters.RandomFilter;
import io.github.squat_team.algorithm.util.ArchitectureBuilder;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.negotiation.NegotiatorResult;
import io.github.squat_team.performance.AbstractPerformancePCMScenario;
import io.github.squat_team.performance.ArchitecturalCopyCreator;
import io.github.squat_team.runner.SQuATConfiguration;
import io.github.squat_team.runner.SQuATController;
import io.github.squat_team.util.PCMHelper;
import io.github.squat_team.util.RandomGenerator;

/**
 * This class simplifies the setup of tests for the SQuAT algorithm. Runs a
 * single test for the provided setup. It also runs the negotiation in a
 * deterministic way in order to make it testable. Methods can be overridden if
 * necessary.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ PCMHelper.class, ArchitecturalCopyCreator.class })
public abstract class AbstractSQuATTest {
	private static final Float ACCEPTED_DEVIATION = 0.0001f;

	private SQuATConfiguration configuration;
	protected ArchitecturalVersion initialArchitectureAsVersion;
	protected PCMArchitectureInstance initialArchitecture;
	protected List<AbstractPCMBot> bots = new ArrayList<AbstractPCMBot>();

	@Before
	public void setUp() throws Exception {
		disableRandomness();
		generateInitialArchitecture();
		List<PCMBotMockBuilder> botBuilder = mockBots();
		mockInitialAnalysisResponses(botBuilder);
		mockOptimizationResponses(botBuilder);
		List<PCMBotMockBuilderResult> botBuilderResults = buildBots(botBuilder);
		bots = extractBots(botBuilderResults);
		configuration = getConfiguration();
		bots = reorder(bots);
		mockExperiment();
	}

	@Test
	public void test() throws Exception {
		List<NegotiatorResult> result = executeNegotiation(bots);
		validateResults(bots, result);
	}

	/**
	 * Specify the configuration that should be used to run SQuAT.
	 * 
	 * @return the configuration
	 */
	protected abstract SQuATConfiguration getConfiguration();

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
	 * @throws Exception
	 */
	protected abstract void mockInitialAnalysisResponses(List<PCMBotMockBuilder> botBuilders) throws Exception;

	/**
	 * Sets the results for the optimization of the initial candidate and next level
	 * candidates.
	 * 
	 * @param botBuilders
	 *            the initialized bot builders.
	 * @throws Exception
	 */
	protected abstract void mockOptimizationResponses(List<PCMBotMockBuilder> botBuilders) throws Exception;

	/**
	 * In the end of the test the results have to be compared to the desired values.
	 * 
	 * @param bots
	 *            all the bots used in this test.
	 * @param result
	 *            contains all results found by the negotiation. The results are
	 *            ordered (ascending) by the level of search.
	 */
	protected abstract void validateResults(List<AbstractPCMBot> bots, List<NegotiatorResult> result);

	/**
	 * Set a test-specific seed for the randomness in SQuAT.
	 * 
	 * @return the seed.
	 */
	protected abstract long getSeed();

	/**
	 * This method should order the bots in the way they should be handed to the
	 * SQuAT algorithm.
	 * 
	 * @param bots
	 *            previous ordering
	 * @return the desired ordering
	 */
	protected abstract List<AbstractPCMBot> reorder(List<AbstractPCMBot> bots);

	/**
	 * Makes the SQuAT algorithm behave in a deterministic way.
	 */
	private void disableRandomness() {
		RandomGenerator.getInstance().setSeed(getSeed());
	}

	protected void generateInitialArchitecture() {
		ArchitectureBuilder architectureBuilder = new ArchitectureBuilder();
		initialArchitecture = architectureBuilder.buildNewArchitecture();
		initialArchitectureAsVersion = PCMHelper.createArchitecture(initialArchitecture);
	}

	/**
	 * Builds the bots. The bot builders should be finished at this time.
	 * 
	 * @param botBuilder
	 *            the builders
	 * @return the results in the same order as the builders
	 */
	protected List<PCMBotMockBuilderResult> buildBots(List<PCMBotMockBuilder> botBuilder) {
		List<PCMBotMockBuilderResult> botResults = new ArrayList<PCMBotMockBuilderResult>();
		for (PCMBotMockBuilder builder : botBuilder) {
			botResults.add(builder.build());
		}
		return botResults;
	}

	/**
	 * Extracts the bots out of the bot builder results.
	 * 
	 * @param botBuildersResults
	 *            results contain the already mocked bots
	 * @return the bots in the same order as the results.
	 */
	protected List<AbstractPCMBot> extractBots(List<PCMBotMockBuilderResult> botBuildersResults) {
		List<AbstractPCMBot> bots = new ArrayList<AbstractPCMBot>();
		for (PCMBotMockBuilderResult botResult : botBuildersResults) {
			bots.add(botResult.getBot());
		}
		return bots;
	}

	/**
	 * Executes SQuAT and returns its results.
	 * 
	 * @param bots
	 *            the bots that are used in the SQuAT run.
	 * @return the results of the execution.
	 */
	protected List<NegotiatorResult> executeNegotiation(List<AbstractPCMBot> bots) {
		SQuATController controller = new SQuATController(configuration);
		return controller.negotiatiateUntilAnAgreementIsReached();
	}

	/**
	 * Searches for the (first) proposal with the suffix in the architectures name.
	 * The test will fail if none is found.
	 * 
	 * @param proposals
	 *            all proposals that should be considered in the search.
	 * @param expectedSuffix
	 *            the name suffix of the architecture.
	 * @return the proposal that has the expected suffix in the name of the
	 *         architecture
	 */
	protected Proposal searchProposal(List<Proposal> proposals, String expectedSuffix) {
		Proposal foundProposal = null;
		for (Proposal proposal : proposals) {
			if (proposal.getArchitectureName().endsWith(expectedSuffix)) {
				foundProposal = proposal;
				break;
			}
		}
		assertNotNull(foundProposal);
		return foundProposal;
	}

	/**
	 * Assures that all bots deliver the expected response for the proposal. The
	 * test will fail if this is not the case.
	 * 
	 * @param proposal
	 *            the proposal to check
	 * @param expectedResults
	 *            the expected results in same order as the bots
	 * @param orderedBots
	 *            the bots in same order as the expected results
	 */
	protected void validateProposal(Proposal proposal, Float[] expectedResults, List<SillyBot> orderedBots) {
		for (int i = 0; i < orderedBots.size(); i++) {
			SillyBot bot = orderedBots.get(i);
			Float botResponse = bot.getResponse(proposal);
			Float expectedResponse = expectedResults[i];
			assertEquals(expectedResponse, botResponse, ACCEPTED_DEVIATION);
		}

	}

	/**
	 * Creates 4 performance scenarios with the specified responses.
	 * 
	 * @param expectedResponses
	 *            4 responses
	 * @return the scenarios in the same order as the responses
	 */
	protected List<AbstractPerformancePCMScenario> createMockedPerformanceScenarios(Float[] expectedResponses) {
		List<AbstractPerformancePCMScenario> performanceScenarios = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			AbstractPerformancePCMScenario scenario = mock(AbstractPerformancePCMScenario.class);
			PCMResult scenarioResult = mock(PCMResult.class);
			when(scenarioResult.getResponse()).thenReturn(expectedResponses[i]);
			when(scenario.getExpectedResult()).thenReturn(scenarioResult);
			performanceScenarios.add(scenario);
		}
		return performanceScenarios;
	}

	/**
	 * Creates 4 modifiability scenarios with the specified responses.
	 * 
	 * @param expectedResponses
	 *            4 responses
	 * @return the scenarios in the same order as the responses
	 */
	protected List<PCMScenario> createMockedModifiabilityScenarios(Float[] expectedResponses) {
		List<PCMScenario> modifiabilityScenarios = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			PCMScenario scenario = mock(PCMScenario.class);
			PCMResult scenarioResult = mock(PCMResult.class);
			when(scenarioResult.getResponse()).thenReturn(expectedResponses[i]);
			when(scenario.getExpectedResult()).thenReturn(scenarioResult);
			modifiabilityScenarios.add(scenario);
		}
		return modifiabilityScenarios;
	}

	protected void mockExperiment() {
		IExperiment experiment = mock(AbstractExperiment.class);
		mockQualityAttributes(experiment);
		when(experiment.getPreEvaluationFilters()).thenReturn(getPreEvaluationFilters());
		when(experiment.getQAspecificPostEvaluationFilters()).thenReturn(getQAspecificPostEvaluationFilters());
		when(experiment.getBots()).thenReturn(bots);
		when(experiment.getPreEvaluationFilters()).thenReturn(new ArrayList<>());
		when(experiment.getQAspecificPostEvaluationFilters()).thenReturn(new HashMap<>());
		when(configuration.getExperiment()).thenReturn(experiment);
	}

	private List<IFilter> getPreEvaluationFilters() {
		List<IFilter> filters = new ArrayList<>();
		filters.add(new RandomFilter(400));
		return filters;
	}
	
	private void mockQualityAttributes(IExperiment experiment) {
		List<String> qualityAttributes = new ArrayList<>();
		qualityAttributes.add(AbstractPCMBot.QA_MODIFIABILITY);
		qualityAttributes.add(AbstractPCMBot.QA_PERFORMANCE);
		when(experiment.getOrderedQualityAttributes()).thenReturn(qualityAttributes);
	}
	
	private Map<String, List<IFilter>> getQAspecificPostEvaluationFilters() {
		Map<String, List<IFilter>> filters = new LinkedHashMap<>();
		List<IFilter> modifiabilityFilters = new ArrayList<>();
		modifiabilityFilters.add(new BestCandidatesFilter(50));
		filters.put(AbstractPCMBot.QA_MODIFIABILITY, modifiabilityFilters);

		List<IFilter> performanceFilters = new ArrayList<>();
		performanceFilters.add(new CorruptedCandidatesFilter(Float.MAX_VALUE));
		filters.put(AbstractPCMBot.QA_PERFORMANCE, performanceFilters);

		return filters;
	}
	
}
