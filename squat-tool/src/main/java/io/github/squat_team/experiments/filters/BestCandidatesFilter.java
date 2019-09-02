package io.github.squat_team.experiments.filters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.model.PCMArchitectureInstance;

public class BestCandidatesFilter extends AbstractFilter {
	private int maximum_alternatives;
	private String qualityAttribute;

	public BestCandidatesFilter(int maximum_alternatives) {
		this.maximum_alternatives = maximum_alternatives;
	}

	@Override
	public boolean checkPrecondition(List<ArchitecturalVersion> architecturalAlternatives, Collection<SillyBot> bots) {
		return architecturalAlternatives.size() > maximum_alternatives;
	}

	private String identifyQualityAttribute(Collection<SillyBot> bots) {
		return bots.iterator().next().getQualityAttribute();
	}

	@Override
	public List<ArchitecturalVersion> filter(List<ArchitecturalVersion> architecturalAlternatives,
			Collection<SillyBot> bots, Collection<SillyBot> allBots, Map<ArchitecturalVersion, PCMArchitectureInstance> candidateCache) {
		qualityAttribute = identifyQualityAttribute(bots);

		// FILTER MODIFIABILITY CANDIDATES
		Set<ArchitecturalVersion> bestAlternatives = new HashSet<>();
		System.out.println("*****ORIGINAL NUMBER OF ALTERNATIVES: " + architecturalAlternatives.size());
		
		for (SillyBot sillyBot : bots) {
			bestAlternatives.addAll(filterBestAlternatives(architecturalAlternatives, sillyBot));
		}		
		bestAlternatives.addAll(getAlternativesLastModifiedByOtherBots(architecturalAlternatives));
		
		keepInCache(architecturalAlternatives, bestAlternatives, candidateCache);
		filterList(architecturalAlternatives, bestAlternatives);
		updateProposals(architecturalAlternatives, allBots);

		System.out.println("*****FILTERED NUMBER OF ALTERNATIVES: " + architecturalAlternatives.size());

		return architecturalAlternatives;
	}

	private Set<ArchitecturalVersion> filterBestAlternatives(List<ArchitecturalVersion> architecturalAlternatives,
			SillyBot bot) {

		List<Proposal> proposalsForBot = bot.getOrderedProposals();

		if (bot.getUtilityFor(proposalsForBot.get(proposalsForBot.size() - 1)) > 0) {
			return new HashSet<>(architecturalAlternatives.subList(0, maximum_alternatives));
		}
		Set<ArchitecturalVersion> ret = new HashSet<>();
		for (int i = 0; i < proposalsForBot.size(); i++) {
			if (bot.getUtilityFor(proposalsForBot.get(i)) > 0) {
				ret.add(getArchitecturalVersionByName(proposalsForBot.get(i).getArchitectureName(),
						architecturalAlternatives));
			} else {
				return ret;
			}

		}		
		return ret;
	}

	private ArchitecturalVersion getArchitecturalVersionByName(String architectureName,
			List<ArchitecturalVersion> architecturalAlternatives) {
		for (ArchitecturalVersion architecturalVersion : architecturalAlternatives) {
			if (architecturalVersion.getName().equals(architectureName))
				return architecturalVersion;
		}
		return null;
	}

	private List<ArchitecturalVersion> getAlternativesLastModifiedByOtherBots(
			List<ArchitecturalVersion> architecturalAlternatives) {
		List<ArchitecturalVersion> performanceAlternatives = new ArrayList<>();
		for (ArchitecturalVersion architecturalVersion : architecturalAlternatives) {
			if (!architecturalVersion.wasLastModifiedBy(qualityAttribute))
				performanceAlternatives.add(architecturalVersion);
		}
		return performanceAlternatives;
	}

}
