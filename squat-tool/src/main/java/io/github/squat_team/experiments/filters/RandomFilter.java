package io.github.squat_team.experiments.filters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.util.RandomGenerator;

/**
 * This filter will randomly filter candidates while keeping the relative number
 * of originating quality attributes. For example: For an upper bound of 10
 * candidates, 80 modifiability candidates will be reduced to 8, while 20
 * performance candidates will be reduced to 2. <br>
 * <br>
 * Important: This filter applies down rounding, if one quality attribute
 * appears rarely, this filter can remove all of its candidates.
 */
public class RandomFilter implements IFilter {
	private int total_maximum;

	/**
	 * Initializes a new filter. This filter will keep a maximum of candidates.
	 * 
	 * @param total_maximum
	 *            the number of candidates that the filter should keep. It will
	 *            never keep more, but might keep some less (because of rounding).
	 */
	public RandomFilter(int total_maximum) {
		this.total_maximum = total_maximum;
	}

	@Override
	public boolean checkPrecondition(List<ArchitecturalVersion> architecturalAlternatives) {
		return architecturalAlternatives.size() > total_maximum;
	}

	@Override
	public List<ArchitecturalVersion> filter(List<ArchitecturalVersion> architecturalAlternatives) {
		Map<String, List<ArchitecturalVersion>> qualityAttributeAlternatives = sortByQualityAttribute(
				architecturalAlternatives);
		int alternativesSize = architecturalAlternatives.size();
		double percentageToKeep = computePercentageToKeep(alternativesSize);
		List<ArchitecturalVersion> randomlySelectedAlternatives = selectCandidatesToKeep(qualityAttributeAlternatives,
				percentageToKeep);
		filterList(architecturalAlternatives, randomlySelectedAlternatives);
		return architecturalAlternatives;
	}

	/**
	 * Sorts all architectures by their quality attributes.
	 * 
	 * @param architecturalAlternatives
	 *            all architectures to sort.
	 * @return Quality attributes are keys, that provide (unsorted) lists of
	 *         candidates that originate from this quality attribute.
	 */
	private Map<String, List<ArchitecturalVersion>> sortByQualityAttribute(
			List<ArchitecturalVersion> architecturalAlternatives) {
		Map<String, List<ArchitecturalVersion>> qualityAttributeAlternatives = new HashMap<>();
		for (ArchitecturalVersion architecture : architecturalAlternatives) {
			String qualityAttribute = architecture.getLastModifiedBy();
			List<ArchitecturalVersion> architectures = getList(qualityAttribute, qualityAttributeAlternatives);
			architectures.add(architecture);
		}
		return qualityAttributeAlternatives;
	}

	/**
	 * Selects candidates to keep (randomly).
	 * 
	 * @param qualityAttributeAlternatives
	 *            All candidates sorted by their quality attribute
	 * @param percentageToKeep
	 *            percentage of candidates for each quality attribute that should be
	 *            kept.
	 * @return A list of candidates to keep.
	 */
	private List<ArchitecturalVersion> selectCandidatesToKeep(
			Map<String, List<ArchitecturalVersion>> qualityAttributeAlternatives, double percentageToKeep) {
		List<ArchitecturalVersion> randomlySelectedAlternatives = new ArrayList<>();
		for (String qualityAttribute : qualityAttributeAlternatives.keySet()) {
			List<ArchitecturalVersion> architectures = getList(qualityAttribute, qualityAttributeAlternatives);
			List<ArchitecturalVersion> filteredArchitectures = selectCandidatesToKeep(architectures, percentageToKeep);
			randomlySelectedAlternatives.addAll(filteredArchitectures);
		}
		return randomlySelectedAlternatives;
	}

	/**
	 * Computes the percentage of each candidates that have to be kept to reach the
	 * specified number of candidates for this filter.
	 * 
	 * @param alternativesSize
	 *            Amount of all architectures.
	 * @return the percentage.
	 */
	private double computePercentageToKeep(int alternativesSize) {
		return (((total_maximum * 1.0d) / alternativesSize));
	}

	/**
	 * Gets the existing list of candidates for a quality attribute or creates and
	 * adds a new one.
	 * 
	 * @param qualityAttribute
	 *            the originating quality attribute of the searched candidates.
	 * @param qualityAttributeAlternatives
	 *            all candidates sorted by quality attribute.
	 * @return never null.
	 */
	private List<ArchitecturalVersion> getList(String qualityAttribute,
			Map<String, List<ArchitecturalVersion>> qualityAttributeAlternatives) {
		List<ArchitecturalVersion> alternatives = qualityAttributeAlternatives.get(qualityAttribute);
		if (alternatives == null) {
			alternatives = new ArrayList<>();
			qualityAttributeAlternatives.put(qualityAttribute, alternatives);
		}
		return alternatives;
	}

	/**
	 * 
	 * Selects candidates to keep (randomly).
	 * 
	 * @param allAlternatives
	 *            all candidates originating from a particular quality attribute.
	 * @param percentageToKeep
	 *            percentage of candidates that should be kept.
	 * @return A list of candidates to keep.
	 */
	private List<ArchitecturalVersion> selectCandidatesToKeep(List<ArchitecturalVersion> allAlternatives,
			double percentageToKeep) {
		int itemsToSelectPerformance = (int) (percentageToKeep * allAlternatives.size());
		RandomGenerator randoms = RandomGenerator.getInstance();
		Collections.shuffle(allAlternatives, randoms.generate());
		return allAlternatives.subList(0, itemsToSelectPerformance);
	}

	/**
	 * It removes from the list the alternatives that are not contained in the set
	 * 
	 * @param architecturalAlternatives
	 * @param bestAlternatives
	 */
	private void filterList(List<ArchitecturalVersion> architecturalAlternatives,
			Collection<ArchitecturalVersion> bestAlternatives) {
		architecturalAlternatives.clear();
		architecturalAlternatives.addAll(bestAlternatives);
	}

}
