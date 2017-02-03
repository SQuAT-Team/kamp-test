package io.github.squat_team.algorithm.util;

import java.util.ArrayList;
import java.util.List;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.model.PCMTactic;
import io.github.squat_team.utility.PCMScenarioSatisfaction;

import static org.mockito.Mockito.*;

/**
 * Builds a mocked bot with defined responses for a specific initial
 * architecture.
 */
public class PCMBotMockBuilder {
	private PCMBotMockProperties properties;
	private PCMScenarioResult analysisResponse = mock(PCMScenarioResult.class);
	private List<PCMScenarioResult> optimizationRespones = new ArrayList<PCMScenarioResult>();

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
	public PCMBotMockBuilderResult build(PCMArchitectureInstance initialArchitecture) throws Exception {
		AbstractPCMBot bot = mockBot();
		mockAnalysisFinal(bot, initialArchitecture);
		mockOptimizationFinal(bot, initialArchitecture);
		return new PCMBotMockBuilderResult(properties, bot);
	}

	private AbstractPCMBot mockBot() {
		AbstractPCMBot bot = mock(AbstractPCMBot.class);
		when(bot.getScenario()).thenReturn(properties.getScenario());
		return bot;
	}

	private AbstractPCMBot mockAnalysisFinal(AbstractPCMBot bot, PCMArchitectureInstance initialArchitecture) throws Exception {
		when(analysisResponse.getOriginatingBot()).thenReturn(bot);
		when(analysisResponse.getResultingArchitecture()).thenReturn(initialArchitecture);
		when(analysisResponse.getAppliedTactic()).thenReturn(null);
		int satisfaction = PCMScenarioSatisfaction.compute(analysisResponse);
		when(analysisResponse.isSatisfied()).thenReturn(satisfaction);
		when(bot.analyze(initialArchitecture)).thenReturn(analysisResponse);
		return bot;
	}

	private AbstractPCMBot mockOptimizationFinal(AbstractPCMBot bot, PCMArchitectureInstance initialArchitecture) throws Exception {
		for (PCMScenarioResult optimizationResponse : optimizationRespones) {
			when(optimizationResponse.getOriginatingBot()).thenReturn(bot);
			int satisfaction = PCMScenarioSatisfaction.compute(optimizationResponse);
			when(optimizationResponse.isSatisfied()).thenReturn(satisfaction);
			allowReanalysis(bot, optimizationResponse);
		}
		when(bot.searchForAlternatives(initialArchitecture)).thenReturn(optimizationRespones);
		return bot;
	}

	/**
	 * The bot should be able to analyze the architecture found by itself again.
	 * @throws Exception 
	 */
	private AbstractPCMBot allowReanalysis(AbstractPCMBot bot, PCMScenarioResult optimizationResponse) throws Exception {
		if (optimizationResponse.getResultingArchitecture() != null) {
			PCMScenarioResultMockCloner cloner = new PCMScenarioResultMockCloner();
			// reanalysis will not return the same object, so create a new one
			PCMScenarioResult clonedOptimizationResponse = cloner.clone(optimizationResponse);
			when(bot.analyze(optimizationResponse.getResultingArchitecture()))
					.thenReturn(clonedOptimizationResponse);
		}
		return bot;
	}

	public void setAnalysisResponse(Comparable response) {
		PCMResult initialResult = mock(PCMResult.class);
		when(initialResult.getResponse()).thenReturn(response);
		when(initialResult.getResponseMeasureType()).thenReturn(properties.getResponseMeasureType());
		when(analysisResponse.getResult()).thenReturn(initialResult);
	}

	public void addOptimizationResponse(Comparable response, PCMTactic appliedTactic) {
		PCMScenarioResult scenarioResult = mockScenarioResult(mockResult(response), appliedTactic);
		mockResultingArchitecture(scenarioResult);
		optimizationRespones.add(scenarioResult);
	}

	private PCMResult mockResult(Comparable response) {
		PCMResult result = mock(PCMResult.class);
		when(result.getResponse()).thenReturn(response);
		when(result.getResponseMeasureType()).thenReturn(properties.getResponseMeasureType());
		return result;
	}

	private PCMScenarioResult mockScenarioResult(PCMResult result, PCMTactic appliedTactic) {
		PCMScenarioResult scenarioResult = mock(PCMScenarioResult.class);
		when(scenarioResult.getResult()).thenReturn(result);
		when(scenarioResult.getAppliedTactic()).thenReturn(appliedTactic);
		return scenarioResult;
	}

	private PCMArchitectureInstance mockResultingArchitecture(PCMScenarioResult scenarioResult) {
		PCMArchitectureInstance architecture = null;
		if (properties.isReturnArchitectures()) {
			architecture = mock(PCMArchitectureInstance.class);
			when(architecture.getName()).thenReturn(properties.getName() + "_" + optimizationRespones.size());
		} // TODO: Else case: Tactic must build this architecture
		when(scenarioResult.getResultingArchitecture()).thenReturn(architecture);
		return architecture;
	}

	public void addOptimizationResponse(Comparable response) {
		addOptimizationResponse(response, null);
	}

	public void addOptimizationResponses(List<Comparable> responses, List<PCMTactic> appliedTactics) {
		checkEqualListSize(responses, appliedTactics);

		for (int i = 0; i < responses.size(); i++) {
			addOptimizationResponse(responses.get(i), appliedTactics.get(i));
		}
	}

	public void addOptimizationResponses(List<Comparable> responses) {
		for (int i = 0; i < responses.size(); i++) {
			addOptimizationResponse(responses.get(i));
		}
	}

	private void checkEqualListSize(List<Comparable> responses, List<PCMTactic> appliedTactics) {
		if (responses.size() != appliedTactics.size()) {
			throw new IllegalArgumentException("Both lists must have the same length, but length was "
					+ responses.size() + " and " + appliedTactics.size());
		}
	}

}
