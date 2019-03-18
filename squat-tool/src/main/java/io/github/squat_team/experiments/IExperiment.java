package io.github.squat_team.experiments;

import java.util.List;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.experiments.filters.IFilter;

public interface IExperiment {
	public List<AbstractPCMBot> getBots();
	public List<IFilter> getPreEvaluationFilters();
}
