package io.github.squat_team.algorithm.util;

import static org.mockito.Mockito.mock;

import java.util.List;

import org.powermock.api.mockito.PowerMockito;
import static org.mockito.Mockito.*;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.ModifiabilityScenarioHelper;
import io.github.squat_team.agentsUtils.PerformanceScenarioHelper;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.performance.AbstractPerformancePCMScenario;

// TODO make general, not only fixed number of scenarios and bots
public class ScenarioHelperMockBuilder {
	private List<PCMScenario> modifiabilityScenarios;
	private List<AbstractPerformancePCMScenario> performanceScenarios;
	private List<AbstractPCMBot> modifiabilityBots;
	private List<AbstractPCMBot> performanceBots;

	public void mockPerformanceScenarioHelper() {
		PowerMockito.mockStatic(PerformanceScenarioHelper.class);
		PerformanceScenarioHelper performanceScenarioHelper = mock(PerformanceScenarioHelper.class);

		when(performanceScenarioHelper.createScenario1Cocome()).thenReturn(performanceScenarios.get(0));
		when(performanceScenarioHelper.createScenario2Cocome()).thenReturn(performanceScenarios.get(1));
		when(performanceScenarioHelper.createScenario3Cocome()).thenReturn(performanceScenarios.get(2));
		when(performanceScenarioHelper.createScenario4Cocome()).thenReturn(performanceScenarios.get(3));

		for (int i = 0; i < performanceScenarios.size(); i++) {
			when(performanceScenarioHelper.createPCMBot(performanceScenarios.get(i)))
					.thenReturn(performanceBots.get(i));
		}

		when(PerformanceScenarioHelper.getInstance()).thenReturn(performanceScenarioHelper);
	}

	public void mockModifiabilityScenarioHelper() {
		PowerMockito.mockStatic(ModifiabilityScenarioHelper.class);
		ModifiabilityScenarioHelper modifiabilityScenarioHelper = mock(ModifiabilityScenarioHelper.class);

		when(modifiabilityScenarioHelper.createScenario1Cocome()).thenReturn(modifiabilityScenarios.get(0));
		when(modifiabilityScenarioHelper.createScenario2Cocome()).thenReturn(modifiabilityScenarios.get(1));
		when(modifiabilityScenarioHelper.createScenario3Cocome()).thenReturn(modifiabilityScenarios.get(2));
		when(modifiabilityScenarioHelper.createScenario4Cocome()).thenReturn(modifiabilityScenarios.get(3));

		for (int i = 0; i < modifiabilityScenarios.size(); i++) {
			when(modifiabilityScenarioHelper.createPCMBot(modifiabilityScenarios.get(i)))
					.thenReturn(modifiabilityBots.get(i));
		}

		when(ModifiabilityScenarioHelper.getInstance()).thenReturn(modifiabilityScenarioHelper);
	}

	public void setModifiabiliyScenarios(List<PCMScenario> scenarios) {
		if (scenarios.size() != 4) {
			// TODO: static for the moment, as the squat implementation
			throw new IllegalArgumentException(
					"Currently exactly 4 scenarios are required, but given size is: " + scenarios.size());
		}
		this.modifiabilityScenarios = scenarios;
	}

	public void setPerformanceScenarios(List<AbstractPerformancePCMScenario> scenarios) {
		if (scenarios.size() != 4) {
			// TODO: static for the moment, as the squat implementation
			throw new IllegalArgumentException(
					"Currently exactly 4 scenarios are required, but given size is: " + scenarios.size());
		}
		this.performanceScenarios = scenarios;
	}

	public void setModifiabiliyBots(List<AbstractPCMBot> bots) {
		if (bots.size() != 4) {
			// TODO: static for the moment, as the squat implementation
			throw new IllegalArgumentException(
					"Currently exactly 4 bots are required, but given size is: " + bots.size());
		}
		this.modifiabilityBots = bots;
	}

	public void setPerformanceBots(List<AbstractPCMBot> bots) {
		if (bots.size() != 4) {
			// TODO: static for the moment, as the squat implementation
			throw new IllegalArgumentException(
					"Currently exactly 4 bots are required, but given size is: " + bots.size());
		}
		this.performanceBots = bots;
	}

}
