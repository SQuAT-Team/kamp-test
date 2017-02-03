package io.github.squat_team.algorithm.util;

import io.github.squat_team.model.OptimizationType;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.ResponseMeasureType;

import static org.mockito.Mockito.*;

/**
 * Contains all required values for the construction of a mocked Bot. Also
 * provides default settings for different bots.
 */
public class PCMBotMockProperties {
	protected final static String PERFORMANCE_BOT_DEFAULT_NAME = "PerformanceBot";
	protected final static String MODIFIABILITY_BOT_DEFAULT_NAME = "ModifiabilityBot";
	
	private String name;
	private ResponseMeasureType responseMeasureType;
	private Comparable expectedResponse;
	private OptimizationType optimizationType;

	private boolean returnArchitectures;

	private PCMScenario scenario = mock(PCMScenario.class);
	private PCMResult result = mock(PCMResult.class);

	public static PCMBotMockProperties getDefaultPerformanceBot(Comparable expectedResponse) {
		PCMBotMockProperties performanceBotProperties = new PCMBotMockProperties();
		performanceBotProperties.setName(PERFORMANCE_BOT_DEFAULT_NAME);
		performanceBotProperties.setExpectedResponse(expectedResponse);
		performanceBotProperties.setOptimizationType(OptimizationType.MINIMIZATION);
		performanceBotProperties.setResponseMeasureType(ResponseMeasureType.DECIMAL);
		performanceBotProperties.setReturnArchitectures(true);
		return performanceBotProperties;
	}

	public static PCMBotMockProperties getDefaultModifiabilityBot(Comparable expectedResponse) {
		PCMBotMockProperties modifiabilityBotProperties = new PCMBotMockProperties();
		modifiabilityBotProperties.setName(MODIFIABILITY_BOT_DEFAULT_NAME);
		modifiabilityBotProperties.setExpectedResponse(expectedResponse);

		// TODO: set values
		modifiabilityBotProperties.setOptimizationType(OptimizationType.MINIMIZATION);
		modifiabilityBotProperties.setResponseMeasureType(ResponseMeasureType.DECIMAL);
		modifiabilityBotProperties.setReturnArchitectures(false);
		return modifiabilityBotProperties;
	}

	public PCMBotMockProperties() {
		when(scenario.getType()).thenReturn(optimizationType);
		when(scenario.getExpectedResult()).thenReturn(result);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ResponseMeasureType getResponseMeasureType() {
		return responseMeasureType;
	}

	public void setResponseMeasureType(ResponseMeasureType responseMeasureType) {
		this.responseMeasureType = responseMeasureType;
		when(result.getResponseMeasureType()).thenReturn(this.responseMeasureType);
	}

	public Comparable getExpectedResponse() {
		return expectedResponse;
	}

	public void setExpectedResponse(Comparable expectedResponse) {
		this.expectedResponse = expectedResponse;
		when(result.getResponse()).thenReturn(this.expectedResponse);
	}

	public OptimizationType getOptimizationType() {
		return optimizationType;
	}

	public void setOptimizationType(OptimizationType optimizationType) {
		this.optimizationType = optimizationType;
		when(scenario.getType()).thenReturn(this.optimizationType);
	}

	public PCMScenario getScenario() {
		return scenario;
	}

	public boolean isReturnArchitectures() {
		return returnArchitectures;
	}

	public void setReturnArchitectures(boolean returnArchitectures) {
		this.returnArchitectures = returnArchitectures;
	}
}