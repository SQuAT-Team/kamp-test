package io.github.squat_team.agentsUtils;

public class ModifiabilityProposal extends Proposal {
	public ModifiabilityProposal(float complexity, String architecture) {
		super(architecture, complexity);
	}

	@Override
	public String toString() {
		return super.toString() + " " + scenarioResponse;
	}

}
