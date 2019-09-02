package io.github.squat_team.experiments.filters;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.model.PCMArchitectureInstance;

/**
 * Filters a list of architectures (see {@link #filter(List)}}) and checks a
 * precondition {@link #checkPrecondition(List)}. Filtering will only be applied
 * the method is called.
 */
public interface IFilter {

	/**
	 * Checks whether filtering should be applied. If false is returned,
	 * {@link #filter(List)} should not be called!
	 * 
	 * @param architecturalAlternatives
	 *            the architectures that should be filtered.
	 * @param bots
	 *            the bots to which this filter belongs to.
	 * @return true if filtering should be applied, false if not.
	 */
	public boolean checkPrecondition(List<ArchitecturalVersion> architecturalAlternatives, Collection<SillyBot> bots);

	/**
	 * Filters the list of architectures. The specified parameter list could be
	 * changed during the process depending on the implementation.
	 * 
	 * @param architecturalAlternatives
	 *            the alternatives that should be filtered.
	 * @param bots
	 *            the bots to which this filter belongs to.
	 * @param allBots
	 *            all the bots.
	 * @param candidateCache
	 *            the cash for candidates. Will be modified by the filter.
	 * @return the filtered list of alternatives. Can be a new list object or the
	 *         same as the parameter list.
	 */
	public List<ArchitecturalVersion> filter(List<ArchitecturalVersion> architecturalAlternatives,
			Collection<SillyBot> bots, Collection<SillyBot> allBots,
			Map<ArchitecturalVersion, PCMArchitectureInstance> candidateCache);
}
