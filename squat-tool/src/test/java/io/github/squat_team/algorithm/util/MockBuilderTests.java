package io.github.squat_team.algorithm.util;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import edu.squat.transformations.ArchitecturalVersion;

import java.util.Arrays;
import java.util.List;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.ArchitecturalCopyCreator;
import io.github.squat_team.model.OptimizationType;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.model.ResponseMeasureType;
import io.github.squat_team.util.PCMHelper;

/**
 * This class tests the creation and linking of mocked bots.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ PCMHelper.class, ArchitecturalCopyCreator.class })
@SuppressWarnings("rawtypes")
public class MockBuilderTests {
	private static PCMArchitectureInstance initialArchitecture;
	private static AbstractPCMBot[] bots;
	private static AbstractPCMBot bot1;
	private static AbstractPCMBot bot2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		initialArchitecture = initializeInitialArchitecture();
		PCMBotMockBuilder bot1Builder = initializeBot1();
		PCMBotMockBuilder bot2Builder = initializeBot2();
		PCMBotMockBuilder[] allBots = { bot1Builder, bot2Builder };
		PCMBotMockBuilder.setAllBots(allBots);

		setBot1Responses(bot1Builder);
		setBot2Responses(bot2Builder);

		bots = buildBots(allBots);
		bot1 = bots[0];
		bot2 = bots[1];
	}

	private static AbstractPCMBot[] buildBots(PCMBotMockBuilder[] botBuilders) throws Exception {
		AbstractPCMBot[] bots = new AbstractPCMBot[botBuilders.length];
		for (int i = 0; i < botBuilders.length; i++) {
			PCMBotMockBuilder botBuilder = botBuilders[i];
			PCMBotMockBuilderResult result = botBuilder.build();
			bots[i] = result.getBot();
		}
		return bots;
	}

	private static PCMArchitectureInstance initializeInitialArchitecture() {
		ArchitectureBuilder architectureBuilder = new ArchitectureBuilder();
		return architectureBuilder.buildNewArchitecture();
	}

	private static PCMBotMockBuilder initializeBot1() {
		// mock performance bot
		PCMBotMockProperties performanceProperties = PCMBotMockProperties.getDefaultPerformanceBot(20.0);
		return new PCMBotMockBuilder(performanceProperties);
	}

	private static PCMBotMockBuilder initializeBot2() {
		// mock custom modifiability bot
		PCMBotMockProperties bot2Properties = new PCMBotMockProperties(ArchitecturalVersion.MODIFIABILITY);
		bot2Properties.setName(PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME);
		bot2Properties.setExpectedResponse(24.0);
		bot2Properties.setOptimizationType(OptimizationType.MAXIMIZATION);
		bot2Properties.setResponseMeasureType(ResponseMeasureType.PERCENTAGE);
		bot2Properties.setReturnArchitectures(true);
		return new PCMBotMockBuilder(bot2Properties);
	}

	private static void setBot1Responses(PCMBotMockBuilder bot1Builder) throws Exception {
		// analysis
		bot1Builder.setAnalysisResponse(initialArchitecture, 126.5873);
		// optimization
		Comparable[][] botResponsesForBot1Optimization = { { 22.0, 12.2 }, { 15.5, 13.2 }, { 17.0, 14.2 },
				{ 20.0, 15.2 } };
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, bot1Builder,
				botResponsesForBot1Optimization);
	}

	private static void setBot2Responses(PCMBotMockBuilder bot2Builder) throws Exception {
		// analysis
		bot2Builder.setAnalysisResponse(initialArchitecture, 211.5873);
		// optimization
		Comparable[][] botResponsesForBot2Optimization = { { 12.7, 13.0 }, { 13.7, 19.0 }, { 14.7, 23.4 },
				{ 15.7, 44.0 }, { 16.7, 11.0 }, { 17.7, 34.0 } };
		PCMBotMockBuilder.mockOtherOptimizationResponses(initialArchitecture, bot2Builder,
				botResponsesForBot2Optimization);
	}

	@Test
	public void bot1ScenarioTest() {
		PCMScenario scenario1 = bot1.getScenario();
		assertEquals(OptimizationType.MINIMIZATION, scenario1.getType());
		assertEquals(20.0, scenario1.getExpectedResult().getResponse());
		assertEquals(ResponseMeasureType.DECIMAL, scenario1.getExpectedResult().getResponseMeasureType());
	}

	@Test
	public void bot2ScenarioTest() {
		PCMScenario scenario = bot2.getScenario();
		assertEquals(OptimizationType.MAXIMIZATION, scenario.getType());
		assertEquals(24.0, scenario.getExpectedResult().getResponse());
		assertEquals(ResponseMeasureType.PERCENTAGE, scenario.getExpectedResult().getResponseMeasureType());
	}

	@Test
	public void bot1AnalysisTest() {
		PCMScenarioResult analysisResult = bot1.analyze(initialArchitecture);
		assertEquals(null, analysisResult.getAppliedTactic());
		assertEquals(bot1, analysisResult.getOriginatingBot());
		assertEquals(ResponseMeasureType.DECIMAL, analysisResult.getResult().getResponseMeasureType());
		assertEquals("initialArchitecture", analysisResult.getResultingArchitecture().getName());
		assertEquals(126.5873, analysisResult.getResult().getResponse());
	}

	@Test
	public void bot2AnalysisTest() {
		PCMScenarioResult analysisResult = bot2.analyze(initialArchitecture);
		assertEquals(null, analysisResult.getAppliedTactic());
		assertEquals(bot2, analysisResult.getOriginatingBot());
		assertEquals(ResponseMeasureType.PERCENTAGE, analysisResult.getResult().getResponseMeasureType());
		assertEquals("initialArchitecture", analysisResult.getResultingArchitecture().getName());
		assertEquals(211.5873, analysisResult.getResult().getResponse());
	}

	@Test
	public void bot1OptimizationTest() {
		List<PCMScenarioResult> optimizationResults = bot1.searchForAlternatives(initialArchitecture);

		assertEquals(4, optimizationResults.size());

		assertEquals(22.0, optimizationResults.get(0).getResult().getResponse());
		assertEquals(null, optimizationResults.get(0).getAppliedTactic());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_0",
				optimizationResults.get(0).getResultingArchitecture().getName());
		assertEquals(15.5, optimizationResults.get(1).getResult().getResponse());
		assertEquals(null, optimizationResults.get(1).getAppliedTactic());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_1",
				optimizationResults.get(1).getResultingArchitecture().getName());
		assertEquals(17.0, optimizationResults.get(2).getResult().getResponse());
		assertEquals(null, optimizationResults.get(2).getAppliedTactic());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_2",
				optimizationResults.get(2).getResultingArchitecture().getName());
		assertEquals(20.0, optimizationResults.get(3).getResult().getResponse());
		assertEquals(null, optimizationResults.get(3).getAppliedTactic());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_3",
				optimizationResults.get(3).getResultingArchitecture().getName());

		PCMScenarioResult optimizationResult = optimizationResults.get(3);
		assertEquals(bot1, optimizationResult.getOriginatingBot());
		assertEquals(ResponseMeasureType.DECIMAL, optimizationResult.getResult().getResponseMeasureType());
	}

	@Test
	public void bot2OptimizationTest() {
		List<PCMScenarioResult> optimizationResults = bot2.searchForAlternatives(initialArchitecture);

		assertEquals(6, optimizationResults.size());

		assertEquals(13.0, optimizationResults.get(0).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_0",
				optimizationResults.get(0).getResultingArchitecture().getName());
		assertEquals(19.0, optimizationResults.get(1).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_1",
				optimizationResults.get(1).getResultingArchitecture().getName());
		assertEquals(23.4, optimizationResults.get(2).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_2",
				optimizationResults.get(2).getResultingArchitecture().getName());
		assertEquals(44.0, optimizationResults.get(3).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_3",
				optimizationResults.get(3).getResultingArchitecture().getName());
		assertEquals(11.0, optimizationResults.get(4).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_4",
				optimizationResults.get(4).getResultingArchitecture().getName());
		assertEquals(34.0, optimizationResults.get(5).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_5",
				optimizationResults.get(5).getResultingArchitecture().getName());

		PCMScenarioResult optimizationResult = optimizationResults.get(5);
		assertEquals(bot2, optimizationResult.getOriginatingBot());
		assertEquals(ResponseMeasureType.PERCENTAGE, optimizationResult.getResult().getResponseMeasureType());
	}

	@Test
	public void bot1LinkTest() {
		// results from bot 1 on bot 2

		List<PCMScenarioResult> optimizationResults = bot1.searchForAlternatives(initialArchitecture);

		assertEquals(12.2,
				bot2.analyze(optimizationResults.get(0).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_0",
				bot2.analyze(optimizationResults.get(0).getResultingArchitecture()).getResultingArchitecture()
						.getName());
		assertEquals(13.2,
				bot2.analyze(optimizationResults.get(1).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_1",
				bot2.analyze(optimizationResults.get(1).getResultingArchitecture()).getResultingArchitecture()
						.getName());
		assertEquals(14.2,
				bot2.analyze(optimizationResults.get(2).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_2",
				bot2.analyze(optimizationResults.get(2).getResultingArchitecture()).getResultingArchitecture()
						.getName());
		assertEquals(15.2,
				bot2.analyze(optimizationResults.get(3).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_3",
				bot2.analyze(optimizationResults.get(3).getResultingArchitecture()).getResultingArchitecture()
						.getName());
	}

	@Test
	public void bot2LinkTest() {
		List<PCMScenarioResult> optimizationResults = bot2.searchForAlternatives(initialArchitecture);

		assertEquals(12.7,
				bot1.analyze(optimizationResults.get(0).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_0",
				bot1.analyze(optimizationResults.get(0).getResultingArchitecture()).getResultingArchitecture()
						.getName());
		assertEquals(13.7,
				bot1.analyze(optimizationResults.get(1).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_1",
				bot1.analyze(optimizationResults.get(1).getResultingArchitecture()).getResultingArchitecture()
						.getName());
		assertEquals(14.7,
				bot1.analyze(optimizationResults.get(2).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_2",
				bot1.analyze(optimizationResults.get(2).getResultingArchitecture()).getResultingArchitecture()
						.getName());
		assertEquals(15.7,
				bot1.analyze(optimizationResults.get(3).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_3",
				bot1.analyze(optimizationResults.get(3).getResultingArchitecture()).getResultingArchitecture()
						.getName());
		assertEquals(16.7,
				bot1.analyze(optimizationResults.get(4).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_4",
				bot1.analyze(optimizationResults.get(4).getResultingArchitecture()).getResultingArchitecture()
						.getName());
		assertEquals(17.7,
				bot1.analyze(optimizationResults.get(5).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME + "_5",
				bot1.analyze(optimizationResults.get(5).getResultingArchitecture()).getResultingArchitecture()
						.getName());
	}

	@Test
	public void reanalysisTest() {
		List<PCMScenarioResult> optimizationResults = bot1.searchForAlternatives(initialArchitecture);
		PCMScenarioResult scenarioResult = bot1.analyze(optimizationResults.get(0).getResultingArchitecture());
		assertEquals(optimizationResults.get(0).getResult().getResponse(), scenarioResult.getResult().getResponse());
	}

	@Test
	public void isSatisfied() throws Exception {
		assertTrue(bot1.analyze(initialArchitecture).isSatisfied() < 0); // unsatisfied

		List<PCMScenarioResult> optimizationResults = bot1.searchForAlternatives(initialArchitecture);
		assertTrue(bot1.analyze(optimizationResults.get(0).getResultingArchitecture()).isSatisfied() < 0);
		assertTrue(bot1.analyze(optimizationResults.get(1).getResultingArchitecture()).isSatisfied() > 0);
		assertTrue(bot1.analyze(optimizationResults.get(2).getResultingArchitecture()).isSatisfied() > 0);
		assertEquals(0, bot1.analyze(optimizationResults.get(3).getResultingArchitecture()).isSatisfied());
	}

	@Test
	public void ValidatorTest() {
		MockValidator validator = new MockValidator(Arrays.asList(bots), initialArchitecture);
		validator.validate(1, 4, 6);
	}

}
