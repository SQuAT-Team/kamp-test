package io.github.squat_team.agentsUtils;


public abstract class Proposal {
	protected String architectureName;
	protected float scenarioResponse;
	private int level;
	private String lastModifiedBy;

	public Proposal(String pcmArchitecture,float scenarioResponse, int level,String lastModifiedBy) {
		super();
		this.architectureName = pcmArchitecture;
		this.scenarioResponse=scenarioResponse;
		this.level=level;
		this.lastModifiedBy=lastModifiedBy;
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
	public int getLevel() {
		return level;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
}
