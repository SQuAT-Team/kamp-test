package io.github.squat_team.agentsUtils;

public class ModifiabilityProposal extends Proposal {
	private int affectedComponents;
	private float complexity;
	public ModifiabilityProposal(int affectedComponents, float complexity, String architecture) {
		super(architecture);
		this.affectedComponents = affectedComponents;
		this.complexity = complexity;
	}
	
}
