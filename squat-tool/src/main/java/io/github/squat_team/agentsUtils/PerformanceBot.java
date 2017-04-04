package io.github.squat_team.agentsUtils;

public class PerformanceBot extends SillyBot {
	private float originalResponseTime;

	public PerformanceBot(float originalResponseTime) {
		super();
		this.originalResponseTime = originalResponseTime;
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
