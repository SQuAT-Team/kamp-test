package io.github.squat_team.algorithm.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenarioResult;

import static org.mockito.Mockito.*;

/**
 * Builds a mocked bot with defined responses for a specific initial
 * architecture and optimization responses.
 */
@SuppressWarnings("rawtypes")
public class PCMBotMockBuilder {
	private PCMBotMockProperties properties;
	private AbstractPCMBot mockedBot;
	private ArchitectureBuilder architectureBuilder;

	/**
	 * Initializes the builder.
	 * 
	 * @param properties
	 *            Defines the properties of the bot.
	 */
	public PCMBotMockBuilder(PCMBotMockProperties properties) {
		this.properties = properties;
		this.mockedBot = mockBot();
		this.architectureBuilder = new ArchitectureBuilder(properties);
	}

	private static List<PCMBotMockBuilder> allBots;

	public static List<PCMBotMockBuilder> getAllBots() {
		return allBots;
	}

	public static void setAllBots(PCMBotMockBuilder[] allBots) {
		PCMBotMockBuilder.allBots = Arrays.asList(allBots);
	}

	public static List<PCMArchitectureInstance> mockOtherOptimizationResponses(PCMArchitectureInstance architecture,
			PCMBotMockBuilder originatingBot, Comparable[][] botResponses) throws Exception {
		if (allBots == null || !allBots.contains(originatingBot)) {
			throw new RuntimeException("The builder needs to know all bots first.");
		}
		int numberOfCandidates = botResponses.length;
		int originatingBotIndex = allBots.indexOf(originatingBot);

		Comparable[] optimizationResponsesForOriginatingBot = new Comparable[numberOfCandidates];
		for (int i = 0; i < numberOfCandidates; i++) {
			optimizationResponsesForOriginatingBot[i] = botResponses[i][originatingBotIndex];
		}

		List<PCMArchitectureInstance> optimizationArchitectures = originatingBot.addOptimizationResponses(architecture,
				optimizationResponsesForOriginatingBot);

		for (int candidateIndex = 0; candidateIndex < numberOfCandidates; candidateIndex++) {
			if (allBots.size() != botResponses[candidateIndex].length) {
				throw new RuntimeException("There must be exactly one set of responses for each bot.");
			}
			PCMArchitectureInstance candidateArchitecture = optimizationArchitectures.get(candidateIndex);
			Comparable[] candidateResponses = botResponses[candidateIndex];
			for (int botIndex = 0; botIndex < allBots.size(); botIndex++) {
				if (botIndex != originatingBotIndex) {
					PCMBotMockBuilder bot = allBots.get(botIndex);
					Comparable botResponse = candidateResponses[botIndex];
					bot.setAnalysisResponse(candidateArchitecture, botResponse);
				}
			}
		}

		return optimizationArchitectures;
	}

	/**
	 * Builds and returns the bot. Analysis response and optimization response
	 * should be set first. Should only be called once.
	 * 
	 * @param initialArchitecture
	 * @return the bot and the used properties to create it.
	 */
	public PCMBotMockBuilderResult build() {
		return new PCMBotMockBuilderResult(properties, mockedBot);
	}

	private AbstractPCMBot mockBot() {
		AbstractPCMBot bot = mock(AbstractPCMBot.class);
		when(bot.getScenario()).thenReturn(properties.getScenario());
		when(bot.getName()).thenReturn(properties.getName());
		when(bot.getQualityAttribute()).thenReturn(properties.getQualityAttribute());
		return bot;
	}

	private AbstractPCMBot mockAnalysisFinal(PCMArchitectureInstance architecture, PCMScenarioResult scenarioResult)
			throws Exception {
		when(mockedBot.analyze(architecture)).thenReturn(scenarioResult);
		return mockedBot;
	}

	private AbstractPCMBot mockOptimizationFinal(PCMArchitectureInstance architecture,
			List<PCMScenarioResult> responses) throws Exception {
		when(mockedBot.searchForAlternatives(architecture)).thenReturn(responses);
		return mockedBot;
	}

	/**
	 * The bot should be able to analyze the architecture found by itself again.
	 * 
	 * @throws Exception
	 */
	private AbstractPCMBot allowReanalysis(PCMScenarioResult optimizationResponse) throws Exception {
		PCMArchitectureInstance architecture = optimizationResponse.getResultingArchitecture();
		if (architecture != null) {
			PCMScenarioResultMockCloner cloner = new PCMScenarioResultMockCloner();
			// reanalysis will not return the same object, so create a new one
			PCMScenarioResult clonedOptimizationResponse = cloner.clone(optimizationResponse);
			mockAnalysisFinal(architecture, clonedOptimizationResponse);
		}
		return mockedBot;
	}

	public void setAnalysisResponse(PCMArchitectureInstance architecture, Comparable response) throws Exception {
		mockAnalysisFinal(architecture, mockScenarioResult(response, architecture));
	}

	private PCMScenarioResult mockScenarioResult(Comparable response, PCMArchitectureInstance architecture) {
		PCMScenarioResult scenarioResult = mock(PCMScenarioResult.class);
		PCMResult result = mockResult(response);
		when(scenarioResult.getResult()).thenReturn(result);
		when(scenarioResult.isSatisfied()).thenCallRealMethod();
		when(scenarioResult.getOriginatingBot()).thenReturn(mockedBot);
		when(scenarioResult.getResultingArchitecture()).thenReturn(architecture);
		return scenarioResult;
	}

	private PCMResult mockResult(Comparable response) {
		PCMResult result = new PCMResult(properties.getResponseMeasureType());
		result.setResponse(response);
		return result;
	}

	public List<PCMArchitectureInstance> addOptimizationResponses(PCMArchitectureInstance originatingArchitecture,
			List<Comparable> responses) throws Exception {
		List<PCMScenarioResult> results = new ArrayList<>();
		List<PCMArchitectureInstance> architectures = new ArrayList<>();
		for (Comparable response : responses) {
			PCMArchitectureInstance resultingArchitecture = architectureBuilder.buildFrom(originatingArchitecture);
			PCMScenarioResult scenarioResult = mockScenarioResult(response, resultingArchitecture);
			allowReanalysis(scenarioResult);
			architectures.add(resultingArchitecture);
			results.add(scenarioResult);
		}
		mockOptimizationFinal(originatingArchitecture, results);
		return architectures;
	}

	public List<PCMArchitectureInstance> addOptimizationResponses(PCMArchitectureInstance originatingArchitecture,
			Comparable[] responses) throws Exception {
		return addOptimizationResponses(originatingArchitecture, Arrays.asList(responses));
	}

	public void setAnalysisResponses(List<PCMArchitectureInstance> results, List<Comparable> responses)
			throws Exception {
		if (results.size() != responses.size()) {
			throw new IllegalArgumentException("There must be exactly one response for every result.");
		}
		for (int i = 0; i < results.size(); i++) {
			setAnalysisResponse(results.get(i), responses.get(i));
		}
	}

	public void setAnalysisResponses(List<PCMArchitectureInstance> results, Comparable[] responses) throws Exception {
		setAnalysisResponses(results, Arrays.asList(responses));
	}

}
