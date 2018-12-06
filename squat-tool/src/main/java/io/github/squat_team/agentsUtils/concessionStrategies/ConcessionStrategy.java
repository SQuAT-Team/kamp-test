package io.github.squat_team.agentsUtils.concessionStrategies;

import java.util.List;

import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;

public abstract class ConcessionStrategy {
	protected SillyBot bot;
	protected int currentConcessionIndex;
	
	
	public ConcessionStrategy(SillyBot bot) {
		this.bot=bot;
		currentConcessionIndex=0;
	}
	
	public int getCurrentConcessionIndex() {
		return currentConcessionIndex;
	}
	
	public abstract Proposal makeConcession(List<SillyBot> sillyBots);
	public boolean canConcede(){
		if(bot.getOrderedProposals().size()==(currentConcessionIndex+1))
			return false;
		else 
			return true;
	}
}
