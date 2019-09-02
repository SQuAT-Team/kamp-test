package io.github.squat_team.experiments;

import java.util.List;
import java.util.Map;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.experiments.filters.IFilter;

public interface IExperiment {
	public List<AbstractPCMBot> getBots();
	public List<IFilter> getPreEvaluationFilters();
	public Map<String, List<IFilter>> getQAspecificPostEvaluationFilters();
	public List<String> getOrderedQualityAttributes(); // ordered SET !
}
