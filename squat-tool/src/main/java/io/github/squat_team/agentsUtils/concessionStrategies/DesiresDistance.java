package io.github.squat_team.agentsUtils.concessionStrategies;

import java.util.List;

import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;

public class DesiresDistance extends ConcessionStrategy {

	public DesiresDistance(SillyBot bot) {
		super(bot);
	}

	@Override
	public Proposal makeConcession(List<SillyBot> sillyBots) {
		Proposal currentProposalOfThisBot=bot.getCurrentProposal();
		float currentDD=calculateDesireDistance(currentProposalOfThisBot, sillyBots);
		for(int i=currentConcessionIndex+1; i<bot.getOrderedProposals().size();i++){
			float newDD=calculateDesireDistance(bot.getOrderedProposals().get(i),sillyBots);
			if(newDD<=currentDD){
				//Cambiar el indice al proposal actual
				currentConcessionIndex=i;
				return bot.getOrderedProposals().get(i);
			}
		}
		return null;
	}

	private float calculateDesireDistance(Proposal p, List<SillyBot> sillyBots){
		float ret=0;
		for (SillyBot sillyBot : sillyBots) {
			if(!sillyBot.equals(bot)){
				ret=ret+Math.abs(sillyBot.getUtilityFor(p.getArchitectureName())-sillyBot.getUtilityFor(sillyBot.getCurrentProposal()));
			}
		}
		return ret;
	}
}
