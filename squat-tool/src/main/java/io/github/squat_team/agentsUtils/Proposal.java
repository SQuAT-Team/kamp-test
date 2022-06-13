package io.github.squat_team.agentsUtils;

import edu.squat.transformations.ArchitecturalVersion;

public class Proposal {
	protected String architectureName;
	protected float scenarioResponse;
	private int level;
	private String lastModifiedBy;
	private ArchitecturalVersion architecture;

	public Proposal(ArchitecturalVersion architecture, String pcmArchitecture, float scenarioResponse, int level, String lastModifiedBy) {
		super();
		this.architectureName = pcmArchitecture;
		this.scenarioResponse = scenarioResponse;
		this.level = level;
		this.lastModifiedBy = lastModifiedBy;
		this.architecture = architecture;
	}

	public Proposal(ArchitecturalVersion architecture, float scenarioResponse, String pcmArchitecture, int level, String lastModifiedBy) {
		this(architecture, pcmArchitecture, scenarioResponse, level, lastModifiedBy);
	}

	public String getArchitectureName() {
		return architectureName;
	}

	public float getScenarioResponse() {
		return scenarioResponse;
	}

	@Override
	public String toString() {
		return architectureName + " " + scenarioResponse;
	}

	public int getLevel() {
		return level;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	
	public ArchitecturalVersion getArchitecture() {
		return architecture;
	}

	public void setArchitecture(ArchitecturalVersion architecture) {
		this.architecture = architecture;
	}
}
