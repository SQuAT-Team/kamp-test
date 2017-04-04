package io.github.squat_team.agentsUtils;

public class ModifiabilityBot extends SillyBot {
	private int originalAffectedComponents;
	private float originalComplexity;
	public ModifiabilityBot(int originalAffectedComponents, float originalComplexity) {
		super();
		this.originalAffectedComponents = originalAffectedComponents;
		this.originalComplexity = originalComplexity;
	}
	@Override
	public void insertInOrder(Proposal p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Proposal makeConcession() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
