package io.github.squat_team.algorithm.util;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.ArchitecturalCopyCreator;
import io.github.squat_team.agentsUtils.ModifiabilityScenarioHelper;
import io.github.squat_team.agentsUtils.PerformanceScenarioHelper;
import io.github.squat_team.model.OptimizationType;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.model.PCMTactic;
import io.github.squat_team.model.ResponseMeasureType;
import io.github.squat_team.util.PCMHelper;

/**
 * This class tests the creation and linking of mocked bots.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({PerformanceScenarioHelper.class, ModifiabilityScenarioHelper.class, PCMHelper.class, ArchitecturalCopyCreator.class})
public class MockBuilderTests {
	private static PCMArchitectureInstance initialArchitecture;
	private static AbstractPCMBot bot1;
	private static AbstractPCMBot bot2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		PowerMockito.mockStatic(PCMHelper.class);
		// mock initial architecture
		initialArchitecture = mock(PCMArchitectureInstance.class);
		when(initialArchitecture.getName()).thenReturn("initialArchitecture");

		// mock performance bot
		PCMBotMockProperties performanceProperties = PCMBotMockProperties.getDefaultPerformanceBot(20.0);
		PCMBotMockBuilder performanceBuilder = new PCMBotMockBuilder(performanceProperties);

		// mock other bot
		PCMBotMockProperties otherBotProperties = new PCMBotMockProperties();
		otherBotProperties.setName(PCMBotMockProperties.MODIFIABILITY_BOT_DEFAULT_NAME);
		otherBotProperties.setExpectedResponse(24.0);
		otherBotProperties.setOptimizationType(OptimizationType.MAXIMIZATION);
		;
		otherBotProperties.setResponseMeasureType(ResponseMeasureType.PERCENTAGE);
		otherBotProperties.setReturnArchitectures(true);
		PCMBotMockBuilder otherBotBuilder = new PCMBotMockBuilder(otherBotProperties);

		// bot 1 responses
		performanceBuilder.setAnalysisResponse(initialArchitecture, 126.5873);
		List<Comparable> bot1Responses = new ArrayList<Comparable>();
		bot1Responses.add(22.0);
		bot1Responses.add(15.5);
		bot1Responses.add(17.0);
		bot1Responses.add(20.0);
		performanceBuilder.addOptimizationResponses(initialArchitecture, bot1Responses);

		// bot 2 responses (with list)
		otherBotBuilder.setAnalysisResponse(initialArchitecture, 211.5873);
		List<Comparable> bot2Responses = new ArrayList<Comparable>();
		bot2Responses.add(13.0);
		bot2Responses.add(19.0);
		bot2Responses.add(23.4);
		bot2Responses.add(44.0);
		bot2Responses.add(11.0);
		bot2Responses.add(34.0);
		otherBotBuilder.addOptimizationResponses(initialArchitecture, bot2Responses);

		// build bots
		PCMBotMockBuilderResult performanceBuilderResult = performanceBuilder.build();
		PCMBotMockBuilderResult performanceBuilderResult2 = otherBotBuilder.build();

		// link results from bot 1 to bot 2
		PCMBotMockLinker linker = new PCMBotMockLinker(performanceBuilderResult, initialArchitecture);
		Map<PCMBotMockBuilderResult, List<Comparable>> linkResponses = new HashMap<PCMBotMockBuilderResult, List<Comparable>>();
		List<Comparable> responseList = new ArrayList<Comparable>();
		responseList.add(12.2);
		responseList.add(13.2);
		responseList.add(14.2);
		responseList.add(15.2);
		linkResponses.put(performanceBuilderResult2, responseList);
		linker.setResponses(linkResponses);
		linker.link();

		// link results and tactics from bot 2 to bot 1
		PCMBotMockLinker linker2 = new PCMBotMockLinker(performanceBuilderResult2, initialArchitecture);
		Map<PCMBotMockBuilderResult, List<Comparable>> linkResponses2 = new HashMap<PCMBotMockBuilderResult, List<Comparable>>();
		List<Comparable> responseList2 = new ArrayList<Comparable>();
		responseList2.add(12.7);
		responseList2.add(13.7);
		responseList2.add(14.7);
		responseList2.add(15.7);
		responseList2.add(16.7);
		responseList2.add(17.7);
		linkResponses2.put(performanceBuilderResult, responseList2);
		linker2.setResponses(linkResponses2);
		linker2.link();

		bot1 = performanceBuilderResult.getBot();
		bot2 = performanceBuilderResult2.getBot();
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
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_0", bot2
				.analyze(optimizationResults.get(0).getResultingArchitecture()).getResultingArchitecture().getName());
		assertEquals(13.2,
				bot2.analyze(optimizationResults.get(1).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_1", bot2
				.analyze(optimizationResults.get(1).getResultingArchitecture()).getResultingArchitecture().getName());
		assertEquals(14.2,
				bot2.analyze(optimizationResults.get(2).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_2", bot2
				.analyze(optimizationResults.get(2).getResultingArchitecture()).getResultingArchitecture().getName());
		assertEquals(15.2,
				bot2.analyze(optimizationResults.get(3).getResultingArchitecture()).getResult().getResponse());
		assertEquals(initialArchitecture.getName() + "_" + PCMBotMockProperties.PERFORMANCE_BOT_DEFAULT_NAME + "_3", bot2
				.analyze(optimizationResults.get(3).getResultingArchitecture()).getResultingArchitecture().getName());
	}

	@Test
	public void bot2LinkTest() {
		// TODO: Has to be written as soon as there is a way to transform
		// architectures through application of tactics
		fail("to be done");
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

}
