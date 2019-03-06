package io.github.squat_team.agentsUtils.concessionStrategies;

import io.github.squat_team.agentsUtils.SillyBot;

public class NashFactory implements IConcessionStrategyFactory {

	@Override
	public ConcessionStrategy getConcessionStrategy(SillyBot bot) {
		return new NashConcession(bot);
	}

}
