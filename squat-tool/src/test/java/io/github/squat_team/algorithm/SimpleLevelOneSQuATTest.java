package io.github.squat_team.algorithm;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.agentsUtils.concessionStrategies.DesiredDistanceFactory;
import io.github.squat_team.algorithm.util.PCMBotMockBuilder;
import io.github.squat_team.algorithm.util.MockValidator;
import io.github.squat_team.algorithm.util.PCMBotMockProperties;
import io.github.squat_team.algorithm.util.ScenarioHelperMockBuilder;
import io.github.squat_team.negotiation.NegotiatorResult;
import io.github.squat_team.negotiation.SQuATSillyBotsNegotiatorFactory;
import io.github.squat_team.runner.SQuATConfiguration;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests whether the SQuAT algorithm is able to identify a candidate, which is
 * obviously the best candidate. Only one level of search is performed. There
 * are 8 bots (4 performance, 4 modifiability) which return 2 candidates each as
 * alternatives.
 */
@SuppressWarnings("rawtypes")
public class SimpleLevelOneSQuATTest extends AbstractSQuATTest {
	/**
	 * The modifiability bots accept responses below these values
	 */
	private static final Float[] EXPECTED_MODIFIABILITY_RESPONSES = { 2270f, 750f, 170f, 2180f };
	/**
	 * The performance bots accept responses below these values
	 */
	private static final Float[] EXPECTED_PERFORMANCE_RESPONSES = { 1.2f, 1.4f, 1.0f, 2.4f };

	// overview of the used result types. See method mockOptimizationResponse for
	// assignment to bots
	private static final Float[] INITIAL_RESULT = { 11f, 13f, 10f, 20f, 2900f, 1200f, 280f, 3200f };
	private static final Float[] BEST_RESULT = { 1.1f, 1.3f, 0.99f, 2.0f, 2260f, 740f, 160f, 1900f };
	private static final Float[][] NON_DOMINATED_RESULTS = { { 1.05f, 1.6f, 0.9f, 2.2f, 2810f, 970f, 270f, 2900f },
			{ 1.0f, 1.9f, 1.1f, 2.8f, 2460f, 840f, 210f, 2710f }, { 1.4f, 1.0f, 1.05f, 2.9f, 2430f, 735f, 165f, 2250f },
			{ 1.3f, 1.5f, 1.1f, 1.85f, 2290f, 750f, 180f, 2220f } };

	private static final Float[][] DOMINATED_RESULTS = { { 1.3f, 2.0f, 1.5f, 4.1f, 2290f, 800f, 210f, 2400f },
			{ 1.8f, 2.7f, 1.3f, 3.1f, 2350f, 790f, 220f, 2450f }, { 1.9f, 2.6f, 1.2f, 2.9f, 2500f, 820f, 190f, 2400f },
			{ 2.9f, 3.1f, 5.7f, 9.1f, 3790f, 780f, 460f, 2700f },
			{ 1.3f, 2.0f, 1.5f, 4.1f, 2290f, 800f, 230f, 2310f } };

	@Override
	protected List<PCMBotMockBuilder> mockBots() {
		// 4 Performance and 4 Modifiability Bots are needed.

		// PERFORMANCE
		PCMBotMockProperties properties1 = PCMBotMockProperties.getDefaultPerformanceBot(20);
		properties1.setName(PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_0");
		PCMBotMockBuilder performanceBot1 = new PCMBotMockBuilder(properties1);

		PCMBotMockProperties properties2 = PCMBotMockProperties.getDefaultPerformanceBot(20);
		properties2.setName(PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_1");
		PCMBotMockBuilder performanceBot2 = new PCMBotMockBuilder(properties2);

		PCMBotMockProperties properties3 = PCMBotMockProperties.getDefaultPerformanceBot(20);
		properties3.setName(PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_2");
		PCMBotMockBuilder performanceBot3 = new PCMBotMockBuilder(properties3);

		PCMBotMockProperties properties4 = PCMBotMockProperties.getDefaultPerformanceBot(20);
		properties4.setName(PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_3");
		PCMBotMockBuilder performanceBot4 = new PCMBotMockBuilder(properties4);

		// MODIFIABILITY
		PCMBotMockProperties properties5 = PCMBotMockProperties.getDefaultModifiabilityBot(50);
		properties5.setName(PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_0");
		PCMBotMockBuilder modifiabilityBot1 = new PCMBotMockBuilder(properties5);

		PCMBotMockProperties properties6 = PCMBotMockProperties.getDefaultModifiabilityBot(50);
		properties6.setName(PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_1");
		PCMBotMockBuilder modifiabilityBot2 = new PCMBotMockBuilder(properties6);

		PCMBotMockProperties properties7 = PCMBotMockProperties.getDefaultModifiabilityBot(50);
		properties7.setName(PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_2");
		PCMBotMockBuilder modifiabilityBot3 = new PCMBotMockBuilder(properties7);

		PCMBotMockProperties properties8 = PCMBotMockProperties.getDefaultModifiabilityBot(50);
		properties8.setName(PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_3");
		PCMBotMockBuilder modifiabilityBot4 = new PCMBotMockBuilder(properties8);

		return Arrays.asList(performanceBot1, performanceBot2, performanceBot3, performanceBot4, modifiabilityBot1,
				modifiabilityBot2, modifiabilityBot3, modifiabilityBot4);
	}

	@Override
	protected void mockInitialAnalysisResponses(List<PCMBotMockBuilder> botBuilders) throws Exception {
		// Set the values of the initial result
		for (int i = 0; i < botBuilders.size(); i++) {
			PCMBotMockBuilder bot = botBuilders.get(i);
			Float analysisResponse = INITIAL_RESULT[i];
			bot.setAnalysisResponse(initialArchitecture, analysisResponse);
		}
	}

	@Override
	protected void mockOptimizationResponses(List<PCMBotMockBuilder> botBuilders) throws Exception {
		PCMBotMockBuilder performanceBot1 = botBuilders.get(0);
		PCMBotMockBuilder performanceBot2 = botBuilders.get(1);
		PCMBotMockBuilder performanceBot3 = botBuilders.get(2);
		PCMBotMockBuilder performanceBot4 = botBuilders.get(3);

		PCMBotMockBuilder modifiabilityBot1 = botBuilders.get(4);
		PCMBotMockBuilder modifiabilityBot2 = botBuilders.get(5);
		PCMBotMockBuilder modifiabilityBot3 = botBuilders.get(6);
		PCMBotMockBuilder modifiabilityBot4 = botBuilders.get(7);

		// mock alternatives and their responses
		PCMBotMockBuilder.setAllBots(botBuilders.toArray(new PCMBotMockBuilder[0]));

		Comparable[][] botResponses1 = { NON_DOMINATED_RESULTS[0], NON_DOMINATED_RESULTS[1] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, performanceBot1, botResponses1);

		Comparable[][] botResponses2 = { DOMINATED_RESULTS[0], NON_DOMINATED_RESULTS[2] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, performanceBot2, botResponses2);

		Comparable[][] botResponses3 = { DOMINATED_RESULTS[1], DOMINATED_RESULTS[2] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, performanceBot3, botResponses3);

		Comparable[][] botResponses4 = { NON_DOMINATED_RESULTS[3], DOMINATED_RESULTS[3] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, performanceBot4, botResponses4);

		// only one modifiability bot will be asked by the algorithm to return responses
		Comparable[][] modBotResponses = { BEST_RESULT, DOMINATED_RESULTS[4] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, modifiabilityBot1, modBotResponses);
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, modifiabilityBot2, modBotResponses);
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, modifiabilityBot3, modBotResponses);
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, modifiabilityBot4, modBotResponses);
	}

	@Override
	protected void mockScenarios(List<AbstractPCMBot> bots) {
		ScenarioHelperMockBuilder builder = new ScenarioHelperMockBuilder();

		builder.setPerformanceBots(bots.subList(0, 4));
		builder.setPerformanceScenarios(createMockedPerformanceScenarios(EXPECTED_PERFORMANCE_RESPONSES));
		builder.mockPerformanceScenarioHelper();

		builder.setModifiabiliyBots(bots.subList(4, 8));
		builder.setModifiabiliyScenarios(createMockedModifiabilityScenarios(EXPECTED_MODIFIABILITY_RESPONSES));
		builder.mockModifiabilityScenarioHelper();
	}

	@Override
	protected void validateResults(List<AbstractPCMBot> bots, List<NegotiatorResult> results) {
		assertEquals(1, results.size());
		NegotiatorResult result = results.get(0);

		// Assure that the mocked bots behave as expected
		MockValidator validator = new MockValidator(bots, initialArchitecture);
		validator.validate(1, 2, 2);

		validateMetadata(result);
		List<SillyBot> orderedBots = orderBots(result);
		validateAgreementProposal(result, orderedBots);
		validate(result.getNonDominatedAlternatives(), orderedBots);
	}

	private List<SillyBot> orderBots(NegotiatorResult result) {
		List<SillyBot> orderedBots = new ArrayList<>();
		List<SillyBot> unorderedBots = result.getSillyBots();
		orderedBots.addAll(unorderedBots.subList(4, 8));
		orderedBots.addAll(unorderedBots.subList(0, 4));
		return orderedBots;
	}

	private void validateMetadata(NegotiatorResult result) {
		assertTrue(result.isSuccessful());
		assertEquals(8, result.getSillyBots().size());
	}

	private void validateAgreementProposal(NegotiatorResult result, List<SillyBot> orderedBots) {
		Proposal agreementProposal = result.getAgreementProposal();
		validateProposal(agreementProposal, BEST_RESULT, orderedBots);
	}

	private void validate(List<Proposal> nonDominatedProposals, List<SillyBot> orderedBots) {
		assertEquals(5, nonDominatedProposals.size());
		Proposal proposalM0_0 = searchProposal(nonDominatedProposals, "modifiability_0_0");
		validateProposal(proposalM0_0, BEST_RESULT, orderedBots);
		Proposal proposalP0_0 = searchProposal(nonDominatedProposals, "performance_0_0");
		validateProposal(proposalP0_0, NON_DOMINATED_RESULTS[0], orderedBots);
		Proposal proposalP0_1 = searchProposal(nonDominatedProposals, "performance_0_1");
		validateProposal(proposalP0_1, NON_DOMINATED_RESULTS[1], orderedBots);
		Proposal proposalP1_1 = searchProposal(nonDominatedProposals, "performance_1_1");
		validateProposal(proposalP1_1, NON_DOMINATED_RESULTS[2], orderedBots);
		Proposal proposalP3_0 = searchProposal(nonDominatedProposals, "performance_3_0");
		validateProposal(proposalP3_0, NON_DOMINATED_RESULTS[3], orderedBots);
	}

	@Override
	protected SQuATConfiguration getConfiguration() {
		SQuATConfiguration configuration = mock(SQuATConfiguration.class);
		when(configuration.createInitialArchitecture()).thenReturn(initialArchitectureAsVersion);
		when(configuration.shouldFilterBestAlternatives()).thenReturn(true);
		when(configuration.getSeedSelectionSize()).thenReturn(2);
		when(configuration.getMaxNumberOfLevels()).thenReturn(1);
		when(configuration.getNegotiatorFactory()).thenReturn(new SQuATSillyBotsNegotiatorFactory());
		when(configuration.getConcessionStrategyFactory()).thenReturn(new DesiredDistanceFactory());
		when(configuration.shouldAskUserForRedo()).thenReturn(false);
		when(configuration.shouldSearchAllLevels()).thenReturn(true);
		return configuration;
	}

}
