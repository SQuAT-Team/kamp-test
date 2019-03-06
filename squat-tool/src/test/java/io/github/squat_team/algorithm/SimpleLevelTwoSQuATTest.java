package io.github.squat_team.algorithm;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.agentsUtils.concessionStrategies.DesiredDistanceFactory;
import io.github.squat_team.algorithm.util.MockValidator;
import io.github.squat_team.algorithm.util.PCMBotMockBuilder;
import io.github.squat_team.algorithm.util.PCMBotMockProperties;
import io.github.squat_team.algorithm.util.ScenarioHelperMockBuilder;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.negotiation.NegotiatorResult;
import io.github.squat_team.negotiation.SQuATSillyBotsNegotiatorFactory;
import io.github.squat_team.runner.SQuATConfiguration;

/**
 * Tests whether the SQuAT algorithm is able to identify a candidate, which is
 * obviously the best candidate. Two levels of search are performed. There are 8
 * bots (4 performance, 4 modifiability) which return 3 candidates in the first
 * level, and 2 candidates in the seconds level for each input candidate.
 */
@SuppressWarnings("rawtypes")
public class SimpleLevelTwoSQuATTest extends AbstractSQuATTest {
	private static final float EXPECTED = 10;
	private static final float VERY_GOOD = 8;
	private static final float GOOD = 9;
	private static final float CLOSE = 11;
	private static final float BAD = 20;

	private static final Float[] EXPECTED_MODIFIABILITY_RESPONSES = { EXPECTED, EXPECTED, EXPECTED, EXPECTED };
	private static final Float[] EXPECTED_PERFORMANCE_RESPONSES = { EXPECTED, EXPECTED, EXPECTED, EXPECTED };

	private static final Float[] INITIAL_RESULT = { BAD, BAD, BAD, CLOSE, BAD, GOOD, BAD, BAD };
	private static final Float[] BEST_RESULT_LVL1 = { GOOD, GOOD, GOOD, GOOD, GOOD, GOOD, GOOD, CLOSE };
	// Will be lost because of seed selection
	private static final Float[] LOST_BEST_RESULT_LVL2 = { VERY_GOOD, VERY_GOOD, VERY_GOOD, VERY_GOOD, VERY_GOOD,
			VERY_GOOD, VERY_GOOD, VERY_GOOD };
	private static final Float[] BEST_RESULT_LVL2 = { VERY_GOOD, GOOD, GOOD, VERY_GOOD, GOOD, VERY_GOOD, EXPECTED,
			EXPECTED };
	private static final Float[][] NON_DOMINATED_RESULTS_LVL1 = { { VERY_GOOD, BAD, BAD, BAD, BAD, BAD, BAD, BAD },
			{ EXPECTED, BAD, VERY_GOOD, BAD, GOOD, BAD, BAD, BAD },
			{ CLOSE, EXPECTED, CLOSE, VERY_GOOD, BAD, CLOSE, BAD, GOOD },
			{ CLOSE, BAD, CLOSE, BAD, VERY_GOOD, CLOSE, CLOSE, EXPECTED },
			{ CLOSE, BAD, CLOSE, CLOSE, CLOSE, VERY_GOOD, CLOSE, CLOSE },
			{ BAD, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, VERY_GOOD, CLOSE },
			{ CLOSE, CLOSE, CLOSE, BAD, CLOSE, CLOSE, CLOSE, VERY_GOOD } };
	private static final Float[][] NON_DOMINATED_RESULTS_LVL2 = {
			{ CLOSE, VERY_GOOD, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE },
			{ CLOSE, CLOSE, VERY_GOOD, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE },
			{ CLOSE, CLOSE, CLOSE, CLOSE, VERY_GOOD, CLOSE, CLOSE, CLOSE },
			{ CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, VERY_GOOD, CLOSE },
			{ CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, VERY_GOOD } };

	private static final Float[] LOST_NON_DOMINATED_RESULT_LVL2 = { VERY_GOOD, BAD, GOOD, BAD, VERY_GOOD, VERY_GOOD,
			EXPECTED, EXPECTED };
	private static final Float[][] DOMINATED_RESULTS_LVL1 = { { BAD, BAD, BAD, BAD, BAD, BAD, BAD, BAD } };
	private static final Float[][] DOMINATED_RESULTS_LVL2 = { { CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, BAD },
			{ VERY_GOOD, GOOD, GOOD, VERY_GOOD, GOOD, VERY_GOOD, EXPECTED, BAD } };

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
	protected List<PCMBotMockBuilder> mockBots() {
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

		PCMBotMockBuilder.setAllBots(botBuilders.toArray(new PCMBotMockBuilder[0]));

		Comparable[][] botResponses1 = { DOMINATED_RESULTS_LVL1[0], NON_DOMINATED_RESULTS_LVL1[0], BEST_RESULT_LVL1 };
		List<PCMArchitectureInstance> bot1Candidates = PCMBotMockBuilder
				.mockOtherOptimizationResponses(initialArchitecture, performanceBot1, botResponses1);

		PCMArchitectureInstance bot1cand1 = bot1Candidates.get(0);
		Comparable[][] botResponses1cand1_1 = { DOMINATED_RESULTS_LVL2[1], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses1cand1_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses1cand1_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses1cand1_4 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses1cand1_5 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand1, performanceBot1, botResponses1cand1_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand1, performanceBot2, botResponses1cand1_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand1, performanceBot3, botResponses1cand1_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand1, performanceBot4, botResponses1cand1_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand1, modifiabilityBot1, modResponses1cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand1, modifiabilityBot2, modResponses1cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand1, modifiabilityBot3, modResponses1cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand1, modifiabilityBot4, modResponses1cand1_5);

		// next level propagation
		PCMArchitectureInstance bot1cand2 = bot1Candidates.get(1);
		Comparable[][] botResponses1cand2_1 = { DOMINATED_RESULTS_LVL2[1], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses1cand2_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses1cand2_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses1cand2_4 = { LOST_BEST_RESULT_LVL2, DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses1cand2_5 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand2, performanceBot1, botResponses1cand2_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand2, performanceBot2, botResponses1cand2_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand2, performanceBot3, botResponses1cand2_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand2, performanceBot4, botResponses1cand2_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand2, modifiabilityBot1, modResponses1cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand2, modifiabilityBot2, modResponses1cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand2, modifiabilityBot3, modResponses1cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand2, modifiabilityBot4, modResponses1cand2_5);

		// next level propagation
		PCMArchitectureInstance bot1cand3 = bot1Candidates.get(2);
		Comparable[][] botResponses1cand3_1 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses1cand3_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses1cand3_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses1cand3_4 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses1cand3_5 = { DOMINATED_RESULTS_LVL2[1], NON_DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand3, performanceBot1, botResponses1cand3_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand3, performanceBot2, botResponses1cand3_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand3, performanceBot3, botResponses1cand3_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand3, performanceBot4, botResponses1cand3_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand3, modifiabilityBot1, modResponses1cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand3, modifiabilityBot2, modResponses1cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand3, modifiabilityBot3, modResponses1cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot1cand3, modifiabilityBot4, modResponses1cand3_5);

		Comparable[][] botResponses2 = { DOMINATED_RESULTS_LVL1[0], DOMINATED_RESULTS_LVL1[0],
				DOMINATED_RESULTS_LVL1[0] };
		List<PCMArchitectureInstance> bot2Candidates = PCMBotMockBuilder
				.mockOtherOptimizationResponses(initialArchitecture, performanceBot2, botResponses2);

		PCMArchitectureInstance bot2cand1 = bot2Candidates.get(0);
		Comparable[][] botResponses2cand1_1 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses2cand1_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses2cand1_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses2cand1_4 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses2cand1_5 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand1, performanceBot1, botResponses2cand1_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand1, performanceBot2, botResponses2cand1_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand1, performanceBot3, botResponses2cand1_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand1, performanceBot4, botResponses2cand1_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand1, modifiabilityBot1, modResponses2cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand1, modifiabilityBot2, modResponses2cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand1, modifiabilityBot3, modResponses2cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand1, modifiabilityBot4, modResponses2cand1_5);

		PCMArchitectureInstance bot2cand2 = bot2Candidates.get(1);
		Comparable[][] botResponses2cand2_1 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses2cand2_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses2cand2_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[1] };
		Comparable[][] botResponses2cand2_4 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses2cand2_5 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand2, performanceBot1, botResponses2cand2_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand2, performanceBot2, botResponses2cand2_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand2, performanceBot3, botResponses2cand2_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand2, performanceBot4, botResponses2cand2_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand2, modifiabilityBot1, modResponses2cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand2, modifiabilityBot2, modResponses2cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand2, modifiabilityBot3, modResponses2cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand2, modifiabilityBot4, modResponses2cand2_5);

		PCMArchitectureInstance bot2cand3 = bot2Candidates.get(2);
		Comparable[][] botResponses2cand3_1 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses2cand3_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses2cand3_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses2cand3_4 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses2cand3_5 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand3, performanceBot1, botResponses2cand3_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand3, performanceBot2, botResponses2cand3_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand3, performanceBot3, botResponses2cand3_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand3, performanceBot4, botResponses2cand3_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand3, modifiabilityBot1, modResponses2cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand3, modifiabilityBot2, modResponses2cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand3, modifiabilityBot3, modResponses2cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot2cand3, modifiabilityBot4, modResponses2cand3_5);

		Comparable[][] botResponses3 = { DOMINATED_RESULTS_LVL1[0], NON_DOMINATED_RESULTS_LVL1[1],
				DOMINATED_RESULTS_LVL1[0] };
		List<PCMArchitectureInstance> bot3Candidates = PCMBotMockBuilder
				.mockOtherOptimizationResponses(initialArchitecture, performanceBot3, botResponses3);

		PCMArchitectureInstance bot3cand1 = bot3Candidates.get(0);
		Comparable[][] botResponses3cand1_1 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses3cand1_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses3cand1_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses3cand1_4 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses3cand1_5 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand1, performanceBot1, botResponses3cand1_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand1, performanceBot2, botResponses3cand1_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand1, performanceBot3, botResponses3cand1_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand1, performanceBot4, botResponses3cand1_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand1, modifiabilityBot1, modResponses3cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand1, modifiabilityBot2, modResponses3cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand1, modifiabilityBot3, modResponses3cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand1, modifiabilityBot4, modResponses3cand1_5);

		// next level propagation
		PCMArchitectureInstance bot3cand2 = bot3Candidates.get(1);
		Comparable[][] botResponses3cand2_1 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses3cand2_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses3cand2_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses3cand2_4 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses3cand2_5 = { BEST_RESULT_LVL2, DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand2, performanceBot1, botResponses3cand2_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand2, performanceBot2, botResponses3cand2_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand2, performanceBot3, botResponses3cand2_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand2, performanceBot4, botResponses3cand2_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand2, modifiabilityBot1, modResponses3cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand2, modifiabilityBot2, modResponses3cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand2, modifiabilityBot3, modResponses3cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand2, modifiabilityBot4, modResponses3cand2_5);

		PCMArchitectureInstance bot3cand3 = bot3Candidates.get(2);
		Comparable[][] botResponses3cand3_1 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses3cand3_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses3cand3_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses3cand3_4 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses3cand3_5 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand3, performanceBot1, botResponses3cand3_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand3, performanceBot2, botResponses3cand3_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand3, performanceBot3, botResponses3cand3_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand3, performanceBot4, botResponses3cand3_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand3, modifiabilityBot1, modResponses3cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand3, modifiabilityBot2, modResponses3cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand3, modifiabilityBot3, modResponses3cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot3cand3, modifiabilityBot4, modResponses3cand3_5);

		Comparable[][] botResponses4 = { NON_DOMINATED_RESULTS_LVL1[2], NON_DOMINATED_RESULTS_LVL1[3],
				DOMINATED_RESULTS_LVL1[0] };
		List<PCMArchitectureInstance> bot4Candidates = PCMBotMockBuilder
				.mockOtherOptimizationResponses(initialArchitecture, performanceBot4, botResponses4);

		// next level propagation
		PCMArchitectureInstance bot4cand1 = bot4Candidates.get(0);
		Comparable[][] botResponses4cand1_1 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses4cand1_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses4cand1_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses4cand1_4 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses4cand1_5 = { NON_DOMINATED_RESULTS_LVL2[1], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand1, performanceBot1, botResponses4cand1_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand1, performanceBot2, botResponses4cand1_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand1, performanceBot3, botResponses4cand1_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand1, performanceBot4, botResponses4cand1_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand1, modifiabilityBot1, modResponses4cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand1, modifiabilityBot2, modResponses4cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand1, modifiabilityBot3, modResponses4cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand1, modifiabilityBot4, modResponses4cand1_5);

		// next level propagation
		PCMArchitectureInstance bot4cand2 = bot4Candidates.get(1);
		Comparable[][] botResponses4cand2_1 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses4cand2_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses4cand2_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses4cand2_4 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses4cand2_5 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand2, performanceBot1, botResponses4cand2_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand2, performanceBot2, botResponses4cand2_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand2, performanceBot3, botResponses4cand2_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand2, performanceBot4, botResponses4cand2_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand2, modifiabilityBot1, modResponses4cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand2, modifiabilityBot2, modResponses4cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand2, modifiabilityBot3, modResponses4cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand2, modifiabilityBot4, modResponses4cand2_5);

		PCMArchitectureInstance bot4cand3 = bot4Candidates.get(2);
		Comparable[][] botResponses4cand3_1 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses4cand3_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses4cand3_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses4cand3_4 = { DOMINATED_RESULTS_LVL2[0], LOST_NON_DOMINATED_RESULT_LVL2 };
		Comparable[][] modResponses4cand3_5 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand3, performanceBot1, botResponses4cand3_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand3, performanceBot2, botResponses4cand3_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand3, performanceBot3, botResponses4cand3_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand3, performanceBot4, botResponses4cand3_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand3, modifiabilityBot1, modResponses4cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand3, modifiabilityBot2, modResponses4cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand3, modifiabilityBot3, modResponses4cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot4cand3, modifiabilityBot4, modResponses4cand3_5);

		Comparable[][] modBotResponses = { NON_DOMINATED_RESULTS_LVL1[4], NON_DOMINATED_RESULTS_LVL1[5],
				NON_DOMINATED_RESULTS_LVL1[6] };
		List<PCMArchitectureInstance> bot5Candidates = PCMBotMockBuilder
				.mockOtherOptimizationResponses(initialArchitecture, modifiabilityBot1, modBotResponses);
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, modifiabilityBot2, modBotResponses);
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, modifiabilityBot3, modBotResponses);
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, modifiabilityBot4, modBotResponses);

		// next level propagation
		PCMArchitectureInstance bot5cand1 = bot5Candidates.get(0);
		Comparable[][] botResponses5cand1_1 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses5cand1_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses5cand1_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses5cand1_4 = { DOMINATED_RESULTS_LVL2[0], NON_DOMINATED_RESULTS_LVL2[2] };
		Comparable[][] modResponses5cand1_5 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand1, performanceBot1, botResponses5cand1_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand1, performanceBot2, botResponses5cand1_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand1, performanceBot3, botResponses5cand1_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand1, performanceBot4, botResponses5cand1_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand1, modifiabilityBot1, modResponses5cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand1, modifiabilityBot2, modResponses5cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand1, modifiabilityBot3, modResponses5cand1_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand1, modifiabilityBot4, modResponses5cand1_5);

		// next level propagation
		PCMArchitectureInstance bot5cand2 = bot5Candidates.get(1);
		Comparable[][] botResponses5cand2_1 = { NON_DOMINATED_RESULTS_LVL2[3], NON_DOMINATED_RESULTS_LVL2[4] };
		Comparable[][] botResponses5cand2_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses5cand2_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses5cand2_4 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses5cand2_5 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand2, performanceBot1, botResponses5cand2_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand2, performanceBot2, botResponses5cand2_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand2, performanceBot3, botResponses5cand2_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand2, performanceBot4, botResponses5cand2_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand2, modifiabilityBot1, modResponses5cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand2, modifiabilityBot2, modResponses5cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand2, modifiabilityBot3, modResponses5cand2_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand2, modifiabilityBot4, modResponses5cand2_5);

		// next level propagation
		PCMArchitectureInstance bot5cand3 = bot5Candidates.get(2);
		Comparable[][] botResponses5cand3_1 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses5cand3_2 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses5cand3_3 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] botResponses5cand3_4 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		Comparable[][] modResponses5cand3_5 = { DOMINATED_RESULTS_LVL2[0], DOMINATED_RESULTS_LVL2[0] };
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand3, performanceBot1, botResponses5cand3_1);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand3, performanceBot2, botResponses5cand3_2);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand3, performanceBot3, botResponses5cand3_3);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand3, performanceBot4, botResponses5cand3_4);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand3, modifiabilityBot1, modResponses5cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand3, modifiabilityBot2, modResponses5cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand3, modifiabilityBot3, modResponses5cand3_5);
		PCMBotMockBuilder.mockOtherOptimizationResponses(bot5cand3, modifiabilityBot4, modResponses5cand3_5);
	}

	@Override
	protected void validateResults(List<AbstractPCMBot> bots, List<NegotiatorResult> results) {
		MockValidator validator = new MockValidator(bots.subList(0, 5), initialArchitecture);
		validator.validate(2, 2, 3);

		assertEquals(2, results.size());
		NegotiatorResult resultLevel1 = results.get(0);
		NegotiatorResult resultLevel2 = results.get(1);

		validateMetadata(resultLevel1);
		validateMetadata(resultLevel2);
		List<SillyBot> orderedBotsLevel1 = orderBots(resultLevel1);
		validateLevelOne(resultLevel1, orderedBotsLevel1);
		List<SillyBot> orderedBotsLevel2 = orderBots(resultLevel2);
		validateLevelTwo(resultLevel2, orderedBotsLevel2);
	}

	private void validateLevelOne(NegotiatorResult resultLevel1, List<SillyBot> orderedBots) {
		validateAgreementProposalLevelOne(resultLevel1, orderedBots);
		validateLevelOne(resultLevel1.getNonDominatedAlternatives(), orderedBots);
	}

	private void validateLevelTwo(NegotiatorResult resultLevel2, List<SillyBot> orderedBots) {
		validateAgreementProposalLevelTwo(resultLevel2, orderedBots);
		validateLevelTwo(resultLevel2.getNonDominatedAlternatives(), orderedBots);
	}

	private void validateAgreementProposalLevelOne(NegotiatorResult result, List<SillyBot> orderedBots) {
		Proposal agreementProposal = result.getAgreementProposal();
		validateProposal(agreementProposal, BEST_RESULT_LVL1, orderedBots);
	}

	private void validateLevelOne(List<Proposal> nonDominatedProposals, List<SillyBot> orderedBots) {
		assertEquals(8, nonDominatedProposals.size());
		Proposal proposalP0_2 = searchProposal(nonDominatedProposals, "performance_0_2");
		validateProposal(proposalP0_2, BEST_RESULT_LVL1, orderedBots);
		Proposal proposalP0_1 = searchProposal(nonDominatedProposals, "performance_0_1");
		validateProposal(proposalP0_1, NON_DOMINATED_RESULTS_LVL1[0], orderedBots);
		Proposal proposalP2_1 = searchProposal(nonDominatedProposals, "performance_2_1");
		validateProposal(proposalP2_1, NON_DOMINATED_RESULTS_LVL1[1], orderedBots);
		Proposal proposalP3_0 = searchProposal(nonDominatedProposals, "performance_3_0");
		validateProposal(proposalP3_0, NON_DOMINATED_RESULTS_LVL1[2], orderedBots);
		Proposal proposalP3_1 = searchProposal(nonDominatedProposals, "performance_3_1");
		validateProposal(proposalP3_1, NON_DOMINATED_RESULTS_LVL1[3], orderedBots);
		Proposal proposalM0_0 = searchProposal(nonDominatedProposals, "modifiability_0_0");
		validateProposal(proposalM0_0, NON_DOMINATED_RESULTS_LVL1[4], orderedBots);
		Proposal proposalM0_1 = searchProposal(nonDominatedProposals, "modifiability_0_1");
		validateProposal(proposalM0_1, NON_DOMINATED_RESULTS_LVL1[5], orderedBots);
		Proposal proposalM0_2 = searchProposal(nonDominatedProposals, "modifiability_0_2");
		validateProposal(proposalM0_2, NON_DOMINATED_RESULTS_LVL1[6], orderedBots);
	}

	private void validateAgreementProposalLevelTwo(NegotiatorResult result, List<SillyBot> orderedBots) {
		Proposal agreementProposal = result.getAgreementProposal();
		validateProposal(agreementProposal, BEST_RESULT_LVL2, orderedBots);
	}

	private void validateLevelTwo(List<Proposal> nonDominatedProposals, List<SillyBot> orderedBots) {
		assertEquals(10, nonDominatedProposals.size());

		Proposal proposalP0_2_M0_1 = searchProposal(nonDominatedProposals, "performance_0_2_modifiability_0_1");
		validateProposal(proposalP0_2_M0_1, NON_DOMINATED_RESULTS_LVL2[0], orderedBots);

		Proposal proposalP2_1_M0_0 = searchProposal(nonDominatedProposals, "performance_2_1_modifiability_0_0");
		validateProposal(proposalP2_1_M0_0, BEST_RESULT_LVL2, orderedBots);

		Proposal proposalP3_0_M0_0 = searchProposal(nonDominatedProposals, "performance_3_0_modifiability_0_0");
		validateProposal(proposalP3_0_M0_0, NON_DOMINATED_RESULTS_LVL2[1], orderedBots);

		Proposal proposalM0_0_P3_1 = searchProposal(nonDominatedProposals, "modifiability_0_0_performance_3_1");
		validateProposal(proposalM0_0_P3_1, NON_DOMINATED_RESULTS_LVL2[2], orderedBots);

		Proposal proposalM0_1_P0_0 = searchProposal(nonDominatedProposals, "modifiability_0_1_performance_0_0");
		validateProposal(proposalM0_1_P0_0, NON_DOMINATED_RESULTS_LVL2[3], orderedBots);

		Proposal proposalM0_1_P0_1 = searchProposal(nonDominatedProposals, "modifiability_0_1_performance_0_1");
		validateProposal(proposalM0_1_P0_1, NON_DOMINATED_RESULTS_LVL2[4], orderedBots);

		// propagated results from level 1
		Proposal proposalP0_2 = searchProposal(nonDominatedProposals, "initialArchitecture_performance_0_2");
		validateProposal(proposalP0_2, BEST_RESULT_LVL1, orderedBots);
		Proposal proposalP3_0 = searchProposal(nonDominatedProposals, "initialArchitecture_performance_3_0");
		validateProposal(proposalP3_0, NON_DOMINATED_RESULTS_LVL1[2], orderedBots);
		Proposal proposalP2_1 = searchProposal(nonDominatedProposals, "initialArchitecture_performance_2_1");
		validateProposal(proposalP2_1, NON_DOMINATED_RESULTS_LVL1[1], orderedBots);
		Proposal proposalP3_1 = searchProposal(nonDominatedProposals, "initialArchitecture_performance_3_1");
		validateProposal(proposalP3_1, NON_DOMINATED_RESULTS_LVL1[3], orderedBots);
	}

	private void validateMetadata(NegotiatorResult result) {
		assertTrue(result.isSuccessful());
		assertEquals(8, result.getSillyBots().size());
	}

	private List<SillyBot> orderBots(NegotiatorResult result) {
		List<SillyBot> orderedBots = new ArrayList<>();
		List<SillyBot> unorderedBots = result.getSillyBots();
		orderedBots.addAll(unorderedBots.subList(4, 8));
		orderedBots.addAll(unorderedBots.subList(0, 4));
		return orderedBots;
	}

	@Override
	protected SQuATConfiguration getConfiguration() {
		SQuATConfiguration configuration = mock(SQuATConfiguration.class);
		when(configuration.createInitialArchitecture()).thenReturn(initialArchitectureAsVersion);
		when(configuration.shouldFilterBestAlternatives()).thenReturn(true);
		when(configuration.getSeedSelectionSize()).thenReturn(2);
		when(configuration.getMaxNumberOfLevels()).thenReturn(2);
		when(configuration.getNegotiatorFactory()).thenReturn(new SQuATSillyBotsNegotiatorFactory());
		when(configuration.getConcessionStrategyFactory()).thenReturn(new DesiredDistanceFactory());
		when(configuration.shouldAskUserForRedo()).thenReturn(false);
		when(configuration.shouldSearchAllLevels()).thenReturn(true);
		return configuration;
	}

	@Override
	protected long getSeed() {
		return 123456;
	}
}
