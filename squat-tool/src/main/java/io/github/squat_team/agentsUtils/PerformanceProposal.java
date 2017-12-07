package io.github.squat_team.agentsUtils;

public class PerformanceProposal extends Proposal {
	//private float responseTime;
	
	public PerformanceProposal(float responseTime,String pcmArchitecture) {
		super(pcmArchitecture,responseTime);
		//this.responseTime=responseTime;
	}
	public float getResponseTime() {
		return getScenarioResponse();
	}
	@Override
	public String toString() {
		return super.toString()+" "+scenarioResponse;
	}
}
