package io.github.squat_team.agentsUtils;

import io.github.squat_team.agentsUtils.concessionStrategies.IConcessionStrategyFactory;

public class PerformanceBot extends SillyBot {

	public PerformanceBot(float originalResponseTime, String name, float scenatioThreshold,
			IConcessionStrategyFactory concessionStrategyFactory, boolean filterSpecialCases) {
		super(name, scenatioThreshold, concessionStrategyFactory, filterSpecialCases);
	}

	@Override
	public float getResponse(Proposal p) {
		Proposal proposal = getProposalForArchitecture(p.getArchitectureName());
		return proposal.getScenarioResponse();
	}

	@Override
	protected float getScenarioMeasureFor(Proposal proposal) {
		return proposal.getScenarioResponse();
	}
}
