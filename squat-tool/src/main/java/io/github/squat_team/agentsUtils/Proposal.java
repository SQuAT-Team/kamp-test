package io.github.squat_team.agentsUtils;


public abstract class Proposal {
	protected String architectureName;

	public Proposal(String pcmArchitecture) {
		super();
		this.architectureName = pcmArchitecture;
	}
	public String getArchitectureName() {
		return architectureName;
	}
	
}
