package io.github.squat_team.experiments.filters;

import java.util.List;

import edu.squat.transformations.ArchitecturalVersion;

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
	 * @return true if filtering should be applied, false if not.
	 */
	public boolean checkPrecondition(List<ArchitecturalVersion> architecturalAlternatives);

	/**
	 * Filters the list of architectures. The specified parameter list could be
	 * changed during the process depending on the implementation.
	 * 
	 * @param architecturalAlternatives
	 *            the alternatives that should be filtered.
	 * @return the filtered list of alternatives. Can be a new list object or the
	 *         same as the parameter list.
	 */
	public List<ArchitecturalVersion> filter(List<ArchitecturalVersion> architecturalAlternatives);
}
