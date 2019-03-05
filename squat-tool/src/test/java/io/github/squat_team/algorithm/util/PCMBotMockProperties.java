package io.github.squat_team.algorithm.util;

import io.github.squat_team.model.OptimizationType;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.ResponseMeasureType;

import static org.mockito.Mockito.*;

import edu.squat.transformations.ArchitecturalVersion;

/**
 * Contains all required values for the construction of a mocked Bot. Also
 * provides default settings for different bots.
 */
@SuppressWarnings("rawtypes")
public class PCMBotMockProperties {
	public final static String PERFORMANCE_BOT_DEFAULT_NAME = ArchitecturalVersion.PERFORMANCE;
	public final static String MODIFIABILITY_BOT_DEFAULT_NAME = ArchitecturalVersion.MODIFIABILITY;
	
	private String name;
	private String botType;

	private OptimizationType optimizationType;

	private boolean returnArchitectures;

	private PCMScenario scenario = mock(PCMScenario.class);
	private PCMResult result = new PCMResult(ResponseMeasureType.DECIMAL);

	public static PCMBotMockProperties getDefaultPerformanceBot(Comparable expectedResponse) {
		PCMBotMockProperties performanceBotProperties = new PCMBotMockProperties(ArchitecturalVersion.PERFORMANCE);
		performanceBotProperties.setName(PERFORMANCE_BOT_DEFAULT_NAME);
		performanceBotProperties.setExpectedResponse(expectedResponse);
		performanceBotProperties.setOptimizationType(OptimizationType.MINIMIZATION);
		performanceBotProperties.setResponseMeasureType(ResponseMeasureType.DECIMAL);
		performanceBotProperties.setReturnArchitectures(true);
		return performanceBotProperties;
	}

	public static PCMBotMockProperties getDefaultModifiabilityBot(Comparable expectedResponse) {
		PCMBotMockProperties modifiabilityBotProperties = new PCMBotMockProperties(ArchitecturalVersion.MODIFIABILITY);
		modifiabilityBotProperties.setName(MODIFIABILITY_BOT_DEFAULT_NAME);
		modifiabilityBotProperties.setExpectedResponse(expectedResponse);
		modifiabilityBotProperties.setExpectedResponse(expectedResponse);
		modifiabilityBotProperties.setOptimizationType(OptimizationType.MINIMIZATION);
		modifiabilityBotProperties.setResponseMeasureType(ResponseMeasureType.DECIMAL);
		modifiabilityBotProperties.setReturnArchitectures(true);
		return modifiabilityBotProperties;
	}

	public PCMBotMockProperties(String botType) {
		this.botType = botType;
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
		return result.getResponseMeasureType();
	}

	public void setResponseMeasureType(ResponseMeasureType responseMeasureType) {
		result.setResponseMeasureType(responseMeasureType);
	}

	public Comparable getExpectedResponse() {
		return result.getResponse();
	}

	public void setExpectedResponse(Comparable expectedResponse) {
		result.setResponse(expectedResponse);
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
	
	public String getBotType() {
		return botType;
	}
}
