package io.github.squat_team.agentsUtils.concessionStrategies;

import io.github.squat_team.agentsUtils.SillyBot;

public interface IConcessionStrategyFactory {
	public abstract ConcessionStrategy getConcessionStrategy(SillyBot bot);
}
