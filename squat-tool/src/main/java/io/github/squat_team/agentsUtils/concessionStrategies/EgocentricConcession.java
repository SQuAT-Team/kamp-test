package io.github.squat_team.agentsUtils.concessionStrategies;

import java.util.List;

import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;

public class EgocentricConcession extends ConcessionStrategy {

	public EgocentricConcession(SillyBot bot) {
		super(bot);
	}

	public Proposal makeConcession(List<SillyBot> sillyBots) {
		currentConcessionIndex++;
		return bot.getCurrentProposal();
	}

}
