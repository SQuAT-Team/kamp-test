package io.github.squat_team.agentsUtils.concessionStrategies;

import java.util.List;

import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;

public class NashConcession extends ConcessionStrategy {

	public NashConcession(SillyBot bot) {
		super(bot);
	}

	@Override
	public Proposal makeConcession(List<SillyBot> sillyBots) {
		while (canConcede()) {
			currentConcessionIndex++;
			Proposal p = bot.getCurrentProposal();
			if (increaseUtilitiesOfOtherBots(sillyBots, p))
				return p;
		}
		return null;
	}

	private boolean increaseUtilitiesOfOtherBots(List<SillyBot> sillyBots, Proposal newProposal) {
		for (SillyBot sillyBot : sillyBots) {
			if (!sillyBot.equals(bot)) {
				float currentUtility = sillyBot.getUtilityFor(sillyBot.getCurrentProposal());
				float newUtility = sillyBot.getUtilityFor(newProposal);
				if (currentUtility > newUtility)
					return false;
			}
		}
		return true;
	}

}
