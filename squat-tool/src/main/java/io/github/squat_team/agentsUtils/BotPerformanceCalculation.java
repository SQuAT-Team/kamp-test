package io.github.squat_team.agentsUtils;

import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.modifiability.kamp.KAMPPCMBot;
import io.github.squat_team.performance.AbstractPerformancePCMScenario;

public class BotPerformanceCalculation implements Runnable{
	private final PerformanceBot bot;
	private final AbstractPerformancePCMScenario scenario;
	private final PCMArchitectureInstance model;
	private final String architecturalVersionName;
	private final String absolutePathArchitecture;
	
	
	public BotPerformanceCalculation(PerformanceBot bot, AbstractPerformancePCMScenario scenario, PCMArchitectureInstance model, String absolutePathArchitecture,String architecturalVersionName) {
		this.bot=bot;
		this.scenario=scenario;
		this.model=model;
		this.architecturalVersionName=architecturalVersionName;
		this.absolutePathArchitecture=absolutePathArchitecture;
	}
	
	@Override
	public void run() {
		
		bot.insertInOrder(
				new PerformanceProposal(
						LoadHelper.calculatePerformanceComplexityForScenario(
								scenario, model, absolutePathArchitecture),
						architecturalVersionName));
	}

}
