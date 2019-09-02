package io.github.squat_team.experiments.filters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.model.PCMArchitectureInstance;

public class CorruptedCandidatesFilter extends AbstractFilter {
	private boolean upperLimit = true;
	private float corruptionThreshold = 9999f;

	public CorruptedCandidatesFilter(float corruptionThreshold) {
		this.corruptionThreshold = corruptionThreshold;
	}

	public CorruptedCandidatesFilter(float corruptionThreshold, boolean upperLimit) {
		this.corruptionThreshold = corruptionThreshold;
		this.upperLimit = upperLimit;
	}

	@Override
	public boolean checkPrecondition(List<ArchitecturalVersion> architecturalAlternatives, Collection<SillyBot> bots) {
		return true;
	}

	@Override
	public List<ArchitecturalVersion> filter(List<ArchitecturalVersion> architecturalAlternatives,
			Collection<SillyBot> bots, Collection<SillyBot> allBots, Map<ArchitecturalVersion, PCMArchitectureInstance> candidateCache) {
		// REMOVE CORRUPTED ALTERNATIVES
		Set<ArchitecturalVersion> alternativesCorrupted = findCorruptedAlternatives(architecturalAlternatives, bots);
		List<ArchitecturalVersion> alternativesToKeep = new ArrayList<>();
		alternativesToKeep.addAll(architecturalAlternatives);
		alternativesToKeep.removeAll(alternativesCorrupted);
		filterList(architecturalAlternatives, alternativesToKeep);
		updateProposals(architecturalAlternatives, allBots);
		return architecturalAlternatives;
	}

	private Set<ArchitecturalVersion> findCorruptedAlternatives(List<ArchitecturalVersion> architecturalAlternatives,
			Collection<SillyBot> bots) {
		Set<ArchitecturalVersion> alternativesCorrupted = new HashSet<>();
		for (ArchitecturalVersion architecturalVersion : architecturalAlternatives) {
			boolean corrupted = true;
			for (SillyBot sillyPerformanceBot : bots) {
				corrupted = corrupted && isCorrupted(sillyPerformanceBot, architecturalVersion);
			}
			if (corrupted) {
				alternativesCorrupted.add(architecturalVersion);
				java.lang.System.out.println("Corrupted: " + architecturalVersion.getName());
			}
		}
		return alternativesCorrupted;
	}

	private boolean isCorrupted(SillyBot bot, ArchitecturalVersion candidate) {
		if (upperLimit) {
			return bot.getProposalForArchitecture(candidate.getName()).getScenarioResponse() >= corruptionThreshold;
		} else {
			return bot.getProposalForArchitecture(candidate.getName()).getScenarioResponse() <= corruptionThreshold;
		}

	}

}
