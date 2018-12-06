package io.github.squat_team.agentsUtils;


public abstract class Proposal {
	protected String architectureName;
	protected float scenarioResponse;

	public Proposal(String pcmArchitecture,float scenarioResponse) {
		super();
		this.architectureName = pcmArchitecture;
		this.scenarioResponse=scenarioResponse;
	}
	public String getArchitectureName() {
		return architectureName;
	}
	public float getScenarioResponse() {
		return scenarioResponse;
	}
	@Override
	public String toString() {
		return architectureName;
	}
}
