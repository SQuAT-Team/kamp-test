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
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMTactic;

import static org.mockito.Mockito.mock;

/**
 * Tests if the SQuAT algorithm is able to identify a candidate, which is
 * obviously the best candidate (no negotiation necessary).
 */
public class SimpleTest extends AbstractAlgorithmTest {

	@Override
	protected List<PCMBotMockBuilder> mockBots() {
		PCMBotMockBuilder performanceBot = new PCMBotMockBuilder(PCMBotMockProperties.getDefaultPerformanceBot(20));
		PCMBotMockBuilder modifiabilityBot = new PCMBotMockBuilder(PCMBotMockProperties.getDefaultModifiabilityBot(50));
		return Arrays.asList(performanceBot, modifiabilityBot);
	}

	@Override
	protected void mockAnalysisResponses(List<PCMBotMockBuilder> botBuilders) {
		PCMBotMockBuilder performanceBot = botBuilders.get(0);
		PCMBotMockBuilder modifiabilityBot = botBuilders.get(1);
		
		performanceBot.setAnalysisResponse(100);
		modifiabilityBot.setAnalysisResponse(120);
	}

	@Override
	protected void mockOptimizationResponses(List<PCMBotMockBuilder> botBuilders) {
		PCMBotMockBuilder performanceBot = botBuilders.get(0);
		PCMBotMockBuilder modifiabilityBot = botBuilders.get(1);
		
		performanceBot.addOptimizationResponse(25);
		performanceBot.addOptimizationResponse(24);
		performanceBot.addOptimizationResponse(23);
		performanceBot.addOptimizationResponse(22);
		performanceBot.addOptimizationResponse(21);
		performanceBot.addOptimizationResponse(20);
		performanceBot.addOptimizationResponse(18);
		performanceBot.addOptimizationResponse(19);
		performanceBot.addOptimizationResponse(26);
		performanceBot.addOptimizationResponse(22);

		modifiabilityBot.addOptimizationResponse(40, mock(PCMTactic.class));
		modifiabilityBot.addOptimizationResponse(44, mock(PCMTactic.class));
		modifiabilityBot.addOptimizationResponse(43, mock(PCMTactic.class));
		modifiabilityBot.addOptimizationResponse(47, mock(PCMTactic.class));
		modifiabilityBot.addOptimizationResponse(49, mock(PCMTactic.class));
		modifiabilityBot.addOptimizationResponse(55, mock(PCMTactic.class));
		modifiabilityBot.addOptimizationResponse(53, mock(PCMTactic.class));
		modifiabilityBot.addOptimizationResponse(38, mock(PCMTactic.class));
		modifiabilityBot.addOptimizationResponse(47, mock(PCMTactic.class));
		modifiabilityBot.addOptimizationResponse(55, mock(PCMTactic.class));
	}

	@Override
	protected void mockLinks(List<PCMBotMockBuilderResult> botResults) {
		PCMBotMockLinker linker1 = new PCMBotMockLinker(botResults.get(0), initialArchitecture);
		
		// for results of performance bot
		List<Comparable> modResponses = new ArrayList<Comparable>();
		modResponses.add(48);
		modResponses.add(70);
		modResponses.add(53);
		modResponses.add(47);
		modResponses.add(50);
		modResponses.add(37);
		modResponses.add(31);
		modResponses.add(45);
		modResponses.add(44);
		modResponses.add(49);
		
		HashMap<PCMBotMockBuilderResult, List<Comparable>> modResponsesMap = new HashMap<PCMBotMockBuilderResult, List<Comparable>>();
		modResponsesMap.put(botResults.get(1), modResponses);
		linker1.setResponses(modResponsesMap);
		
		List<PCMTactic> modTactics = new ArrayList<PCMTactic>();
		modTactics.add(mock(PCMTactic.class));
		modTactics.add(mock(PCMTactic.class));
		modTactics.add(mock(PCMTactic.class));
		modTactics.add(mock(PCMTactic.class));
		modTactics.add(mock(PCMTactic.class));
		modTactics.add(mock(PCMTactic.class));
		modTactics.add(mock(PCMTactic.class));
		modTactics.add(mock(PCMTactic.class));
		modTactics.add(mock(PCMTactic.class));
		modTactics.add(mock(PCMTactic.class));
		
		HashMap<PCMBotMockBuilderResult, List<PCMTactic>> modTacticsMap = new HashMap<PCMBotMockBuilderResult, List<PCMTactic>>();
		modTacticsMap.put(botResults.get(1), modTactics);
		linker1.setTactics(modTacticsMap);
		
		// for results of modifiability bot
		PCMBotMockLinker linker2 = new PCMBotMockLinker(botResults.get(1), initialArchitecture);
		
		List<Comparable> perfResponses = new ArrayList<Comparable>();
		perfResponses.add(28);
		perfResponses.add(30);
		perfResponses.add(34);
		perfResponses.add(47);
		perfResponses.add(24);
		perfResponses.add(26);
		perfResponses.add(31);
		perfResponses.add(24);
		perfResponses.add(22);
		perfResponses.add(27);
		
		HashMap<PCMBotMockBuilderResult, List<Comparable>> perfResponsesMap = new HashMap<PCMBotMockBuilderResult, List<Comparable>>();
		perfResponsesMap.put(botResults.get(0), perfResponses);
		linker2.setResponses(perfResponsesMap);
	}

	@Override
	protected void validateResults(List<AbstractPCMBot> bots, PCMArchitectureInstance bestCandidate) {
		// best result is result of the performance bot (index: 6; performance: 18; modifiability: 31)
		assertEquals(18, bots.get(0).analyze(bestCandidate));
		assertEquals(31, bots.get(1).analyze(bestCandidate));
	}

}
