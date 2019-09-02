package io.github.squat_team.experiments.filters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.model.PCMArchitectureInstance;

public abstract class AbstractFilter implements IFilter {

	/**
	 * It removes from the list the alternatives that are not contained in the set
	 * 
	 * @param architecturalAlternatives
	 * @param bestAlternatives
	 */
	protected void filterList(List<ArchitecturalVersion> architecturalAlternatives,
			Collection<ArchitecturalVersion> bestAlternatives) {
		architecturalAlternatives.clear();
		architecturalAlternatives.addAll(bestAlternatives);
	}

	protected void keepInCache(List<ArchitecturalVersion> allCandidates,
			Collection<ArchitecturalVersion> candidatesToKeep,
			Map<ArchitecturalVersion, PCMArchitectureInstance> candidateCache) {
		List<ArchitecturalVersion> alternativesToRemoveFromCache = new ArrayList<>(allCandidates);
		alternativesToRemoveFromCache.removeAll(candidatesToKeep);
		for (ArchitecturalVersion toRemove : alternativesToRemoveFromCache) {
			candidateCache.remove(toRemove);
		}
	}

	protected void updateProposals(List<ArchitecturalVersion> architecturalAlternatives, Collection<SillyBot> bots) {
		for (SillyBot sillyBot : bots) {
			sillyBot.removeNotContainedProposals(architecturalAlternatives);
		}
	}
}
