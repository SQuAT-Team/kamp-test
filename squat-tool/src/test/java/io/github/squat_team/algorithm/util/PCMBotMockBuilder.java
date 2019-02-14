package io.github.squat_team.algorithm.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.utility.PCMScenarioSatisfaction;

import static org.mockito.Mockito.*;

/**
 * Builds a mocked bot with defined responses for a specific initial
 * architecture.
 */
public class PCMBotMockBuilder {
	private PCMBotMockProperties properties;
	private Map<PCMArchitectureInstance, PCMScenarioResult> analysisResponse = new HashMap<>();
	private Map<PCMArchitectureInstance, List<PCMScenarioResult>> optimizationResponses = new HashMap<>();

	/**
	 * Initializes the builder.
	 * 
	 * @param properties
	 *            Defines the properties of the bot.
	 */
	public PCMBotMockBuilder(PCMBotMockProperties properties) {
		this.properties = properties;
	}

	/**
	 * Builds and returns the bot. Analysis response and optimization response
	 * should be set first. Should only be called once.
	 * 
	 * @param initialArchitecture
	 * @return the bot and the used properties to create it.
	 * @throws Exception
	 */
	public PCMBotMockBuilderResult build() throws Exception {
		AbstractPCMBot bot = mockBot();
		for (PCMArchitectureInstance architecture : analysisResponse.keySet()) {
			mockAnalysisFinal(bot, architecture);
		}
		for (PCMArchitectureInstance architecture : optimizationResponses.keySet()) {
			mockOptimizationFinal(bot, architecture);
		}
		return new PCMBotMockBuilderResult(properties, bot);
	}

	private AbstractPCMBot mockBot() {
		AbstractPCMBot bot = mock(AbstractPCMBot.class);
		when(bot.getScenario()).thenReturn(properties.getScenario());
		return bot;
	}

	private AbstractPCMBot mockAnalysisFinal(AbstractPCMBot bot, PCMArchitectureInstance architecture)
			throws Exception {
		PCMScenarioResult scenarioResult = analysisResponse.get(architecture);

		when(scenarioResult.getOriginatingBot()).thenReturn(bot);
		when(scenarioResult.getResultingArchitecture()).thenReturn(architecture);
		when(scenarioResult.getAppliedTactic()).thenReturn(null);

		// Currently this response is not used!
		// int satisfaction = PCMScenarioSatisfaction.compute(analysisResponse);
		// when(analysisResponse.isSatisfied()).thenReturn(satisfaction);
		when(bot.analyze(architecture)).thenReturn(scenarioResult);
		when(bot.analyze(architecture, null)).thenReturn(scenarioResult);
		when(bot.analyze(eq(architecture), anyString())).thenReturn(scenarioResult);
		return bot;
	}

	private AbstractPCMBot mockOptimizationFinal(AbstractPCMBot bot, PCMArchitectureInstance architecture)
			throws Exception {
		for (PCMScenarioResult optimizationResponse : optimizationResponses.get(architecture)) {
			when(optimizationResponse.getOriginatingBot()).thenReturn(bot);

			// TODO: move to method
			PCMArchitectureInstance resultingArchitecture = mock(PCMArchitectureInstance.class);
			String architectureName = architecture.getName() + "_" + properties.getName() + "_"
					+ optimizationResponses.get(architecture).indexOf(optimizationResponse);
			when(resultingArchitecture.getName()).thenReturn(architectureName);
			when(optimizationResponse.getResultingArchitecture()).thenReturn(resultingArchitecture);

			PCMBotMockLinker.generateArchitecturalVersion(resultingArchitecture, properties.getName());
			allowReanalysis(bot, optimizationResponse);
		}
		when(bot.searchForAlternatives(architecture)).thenReturn(optimizationResponses.get(architecture));
		return bot;
	}

	/**
	 * The bot should be able to analyze the architecture found by itself again.
	 * 
	 * @throws Exception
	 */
	private AbstractPCMBot allowReanalysis(AbstractPCMBot bot, PCMScenarioResult optimizationResponse)
			throws Exception {
		if (optimizationResponse.getResultingArchitecture() != null) {
			PCMScenarioResultMockCloner cloner = new PCMScenarioResultMockCloner();
			// reanalysis will not return the same object, so create a new one
			PCMScenarioResult clonedOptimizationResponse = cloner.clone(optimizationResponse);
			when(bot.analyze(optimizationResponse.getResultingArchitecture())).thenReturn(clonedOptimizationResponse);
		}
		return bot;
	}

	public void setAnalysisResponse(PCMArchitectureInstance architecture, Comparable response) {
		analysisResponse.put(architecture, mockScenarioResult(response));
	}

	private PCMScenarioResult mockScenarioResult(Comparable response) {
		PCMScenarioResult scenarioResult = mock(PCMScenarioResult.class);
		PCMResult result = mockResult(response);
		when(scenarioResult.getResult()).thenReturn(result);
		when(scenarioResult.isSatisfied()).thenCallRealMethod();
		return scenarioResult;
	}

	private PCMResult mockResult(Comparable response) {
		PCMResult result = new PCMResult(properties.getResponseMeasureType());
		result.setResponse(response);
		return result;
	}

	public void addOptimizationResponse(PCMArchitectureInstance architecture, Comparable response) {
		PCMScenarioResult scenarioResult = mockScenarioResult(response);
		List<PCMScenarioResult> results = getResponsesFor(architecture);
		results.add(scenarioResult);
	}

	public void addOptimizationResponses(PCMArchitectureInstance architecture, List<Comparable> responses) {
		List<PCMScenarioResult> results = getResponsesFor(architecture);
		List<PCMScenarioResult> resultsToAppend = new ArrayList<>();
		for(Comparable response : responses) {
			resultsToAppend.add(mockScenarioResult(response));
		}
		results.addAll(resultsToAppend);
	}
	
	private List<PCMScenarioResult> getResponsesFor(PCMArchitectureInstance architecture) {
		List<PCMScenarioResult> results = optimizationResponses.get(architecture);
		if (results == null) {
			results = new ArrayList<>();
			optimizationResponses.put(architecture, results);
		}
		return results;
	}

}
