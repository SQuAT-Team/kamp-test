package io.github.squat_team.agentsUtils;

public class PerformanceProposal extends Proposal {

	public PerformanceProposal(float responseTime, String pcmArchitecture) {
		super(pcmArchitecture, responseTime);
	}

	@Override
	public String toString() {
		return super.toString() + " " + scenarioResponse;
	}
}
