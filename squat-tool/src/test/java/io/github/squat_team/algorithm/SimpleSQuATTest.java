package io.github.squat_team.algorithm;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.algorithm.util.PCMBotMockBuilder;
import io.github.squat_team.algorithm.util.PCMBotMockBuilderResult;
import io.github.squat_team.algorithm.util.PCMBotMockLinker;
import io.github.squat_team.algorithm.util.PCMBotMockProperties;
import io.github.squat_team.algorithm.util.ScenarioHelperMockBuilder;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.negotiation.NegotiatorResult;
import io.github.squat_team.performance.AbstractPerformancePCMScenario;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests if the SQuAT algorithm is able to identify a candidate, which is
 * obviously the best candidate (no negotiation necessary).
 */
public class SimpleSQuATTest extends AbstractSQuATTest {

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
	protected void mockAnalysisResponses(List<PCMBotMockBuilder> botBuilders) {
		PCMBotMockBuilder performanceBot1 = botBuilders.get(0);
		PCMBotMockBuilder performanceBot2 = botBuilders.get(1);
		PCMBotMockBuilder performanceBot3 = botBuilders.get(2);
		PCMBotMockBuilder performanceBot4 = botBuilders.get(3);

		PCMBotMockBuilder modifiabilityBot1 = botBuilders.get(4);
		PCMBotMockBuilder modifiabilityBot2 = botBuilders.get(5);
		PCMBotMockBuilder modifiabilityBot3 = botBuilders.get(6);
		PCMBotMockBuilder modifiabilityBot4 = botBuilders.get(7);

		performanceBot1.setAnalysisResponse(initialArchitecture, 100f);
		performanceBot2.setAnalysisResponse(initialArchitecture, 101f);
		performanceBot3.setAnalysisResponse(initialArchitecture, 102f);
		performanceBot4.setAnalysisResponse(initialArchitecture, 103f);

		modifiabilityBot1.setAnalysisResponse(initialArchitecture, 120f);
		modifiabilityBot2.setAnalysisResponse(initialArchitecture, 121f);
		modifiabilityBot3.setAnalysisResponse(initialArchitecture, 122f);
		modifiabilityBot4.setAnalysisResponse(initialArchitecture, 123f);
	}

	@Override
	protected void mockOptimizationResponses(List<PCMBotMockBuilder> botBuilders) {
		PCMBotMockBuilder performanceBot1 = botBuilders.get(0);
		PCMBotMockBuilder performanceBot2 = botBuilders.get(1);
		PCMBotMockBuilder performanceBot3 = botBuilders.get(2);
		PCMBotMockBuilder performanceBot4 = botBuilders.get(3);

		PCMBotMockBuilder modifiabilityBot1 = botBuilders.get(4);
		PCMBotMockBuilder modifiabilityBot2 = botBuilders.get(5);
		PCMBotMockBuilder modifiabilityBot3 = botBuilders.get(6);
		PCMBotMockBuilder modifiabilityBot4 = botBuilders.get(7);

		performanceBot1.addOptimizationResponse(initialArchitecture, 25f);
		performanceBot1.addOptimizationResponse(initialArchitecture, 24f);

		performanceBot2.addOptimizationResponse(initialArchitecture, 26f);
		performanceBot2.addOptimizationResponse(initialArchitecture, 27f);

		performanceBot3.addOptimizationResponse(initialArchitecture, 28f);
		performanceBot3.addOptimizationResponse(initialArchitecture, 29f);

		performanceBot4.addOptimizationResponse(initialArchitecture, 31f);
		performanceBot4.addOptimizationResponse(initialArchitecture, 30f);

		modifiabilityBot1.addOptimizationResponse(initialArchitecture, 42f);
		modifiabilityBot1.addOptimizationResponse(initialArchitecture, 41f);

		modifiabilityBot2.addOptimizationResponse(initialArchitecture, 40f);
		modifiabilityBot2.addOptimizationResponse(initialArchitecture, 44f);

		modifiabilityBot3.addOptimizationResponse(initialArchitecture, 43f);
		modifiabilityBot3.addOptimizationResponse(initialArchitecture, 45f);

		modifiabilityBot4.addOptimizationResponse(initialArchitecture, 47f);
		modifiabilityBot4.addOptimizationResponse(initialArchitecture, 46f);
	}

	@Override
	protected void mockLinks(List<PCMBotMockBuilderResult> botResults) {
		// Simplified but general responses
		for (PCMBotMockBuilderResult botResult : botResults) {
			PCMBotMockLinker linkerBot1 = new PCMBotMockLinker(botResults.get(0), initialArchitecture);

			HashMap<PCMBotMockBuilderResult, List<Comparable>> modResponsesMap = new HashMap<PCMBotMockBuilderResult, List<Comparable>>();
			for (PCMBotMockBuilderResult otherBotResult : botResults) {
				if (!otherBotResult.equals(botResult)) {
					List<Comparable> responsesFromOtherBot = new ArrayList<Comparable>();
					responsesFromOtherBot.add(11f);
					responsesFromOtherBot.add(12f);
					modResponsesMap.put(otherBotResult, responsesFromOtherBot);
				}
			}

			linkerBot1.setResponses(modResponsesMap);
			linkerBot1.link();
		}
	}

	@Override
	protected void mockScenarios(List<AbstractPCMBot> bots) {
		ScenarioHelperMockBuilder builder = new ScenarioHelperMockBuilder();

		builder.setPerformanceBots(bots.subList(0, 4));
		builder.setPerformanceScenarios(createMockedPerformanceScenarios());
		builder.mockPerformanceScenarioHelper();

		builder.setModifiabiliyBots(bots.subList(4, 8));
		builder.setModifiabiliyScenarios(createMockedModifiabilityScenarios());
		builder.mockModifiabilityScenarioHelper();
	}

	private List<AbstractPerformancePCMScenario> createMockedPerformanceScenarios() {
		Float[] expectedResponses = {1.2f, 1.4f, 1.0f, 2.4f};
		
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

	private List<PCMScenario> createMockedModifiabilityScenarios() {
		Float[] expectedResponses = {2270f,750f, 170f, 2180f};
		
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

	@Override
	protected void validateResults(List<AbstractPCMBot> bots, List<NegotiatorResult> results) {
		// TODO: REMOVE
		// best result is result of the performance bot (index: 6; performance: 18;
		// modifiability: 31)

		// assertEquals(18, bots.get(0).analyze(bestCandidate));
		// assertEquals(31, bots.get(1).analyze(bestCandidate));

		// TODO: NEW VALIDATION

	}

}
