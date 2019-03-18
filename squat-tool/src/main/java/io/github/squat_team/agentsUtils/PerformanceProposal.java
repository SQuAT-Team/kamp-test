package io.github.squat_team.agentsUtils;

public class PerformanceProposal extends Proposal {
	//private float responseTime;
	
	public PerformanceProposal(float responseTime,String pcmArchitecture, int level,String lastModifiedBy) {
		super(pcmArchitecture,responseTime, level,lastModifiedBy);
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
