package io.github.squat_team.agentsUtils.transformations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.ArchitecturalCopyCreator;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.runner.SQuATConfiguration;
import io.github.squat_team.util.PCMHelper;

@SuppressWarnings("rawtypes")
public class PerformanceTransformationFactory {
	private static volatile PerformanceTransformationFactory instance;
	private volatile Map<AbstractPCMBot, Map<String, Double>> architecturalResponse;
	private SQuATConfiguration configuration;

	public static PerformanceTransformationFactory getInstance(SQuATConfiguration configuration) {
		if (instance == null) {
			instance = new PerformanceTransformationFactory(configuration);
		}
		return instance;
	}

	private PerformanceTransformationFactory(SQuATConfiguration configuration) {
		this.configuration = configuration;

		architecturalResponse = new HashMap<>();
		for (AbstractPCMBot bot : configuration.getExperiment().getBots()) {
			if (bot.getQualityAttribute().equals(AbstractPCMBot.QA_PERFORMANCE)) {
				architecturalResponse.put(bot, new HashMap<String, Double>());
			}
		}
	}

	public synchronized Double getComplexityForArchitecture(AbstractPCMBot bot, String architectureAbsolutePath) {
		return architecturalResponse.get(bot).get(architectureAbsolutePath);
	}

	public List<ArchitecturalVersion> generateArchitecturalVersionsUsingPerformanceTransformations(
			ArchitecturalVersion architecturalVersion) {
		List<ArchitecturalVersion> ret = new ArrayList<ArchitecturalVersion>();
		System.out.println("Analyzing: " + architecturalVersion.getFileName());
		PCMArchitectureInstance architecture = PCMHelper.createArchitecture(architecturalVersion);

		for(AbstractPCMBot bot : configuration.getExperiment().getBots()) {
			if(bot.getQualityAttribute().equals(AbstractPCMBot.QA_PERFORMANCE)) {
				System.out.println("Loading performance scenario for bot " + bot.getName());
				ret.addAll(createAlternativesForScenario(architecture, bot));
			}
		}
		return ret;
	}

	/**
	 * Select the first N architectures according to @param percentage
	 * 
	 * @param splitAlternatives
	 * @param percentage
	 * @return
	 */
	private List<ArchitecturalVersion> selectSubset(List<ArchitecturalVersion> splitAlternatives, float percentage) {
		int n = (int) ((percentage * splitAlternatives.size()) / 100f);

		return splitAlternatives.subList(0, n);
	}

	private List<ArchitecturalVersion> createAlternativesForScenario(PCMArchitectureInstance architecture,
			AbstractPCMBot bot) {
		List<ArchitecturalVersion> ret = new ArrayList<ArchitecturalVersion>();

		List<PCMScenarioResult> results = bot.searchForAlternatives(architecture);

		ArchitecturalCopyCreator copyCreator = ArchitecturalCopyCreator.getInstance();
		for (PCMScenarioResult result : results) {
			PCMArchitectureInstance archInstance = result.getResultingArchitecture();
			ArchitecturalVersion newAlternative = copyCreator.copy(archInstance, bot);

			Comparable response = result.getResult().getResponse();
			Double doubleResponse;
			if (response instanceof Double) {
				doubleResponse = (Double) response;
			} else if (response instanceof Float) {
				doubleResponse = ((Float) response).doubleValue();
			} else {
				throw new RuntimeException("");
			}

			architecturalResponse.get(bot).put(
					newAlternative.getAbsolutePath() + "/" + newAlternative.getRepositoryFilename(), doubleResponse);
			ret.add(newAlternative);
		}

		return ret;
	}

	public static void main(String[] args) {
		ArchitecturalVersion av = new ArchitecturalVersion("cocome-cloud-88-ICashDeskDAO",
				"/Users/santiagovidal/Documents/Programacion/kamp-test/squat-tool/models/cocomeWithResourceDemands",
				"modifiability");
		av.setFullPathToAlternativeRepository(
				"/Users/santiagovidal/Documents/Programacion/kamp-test/squat-tool/models/cocomeWithResourceDemands/alternativecocome-cloud-88-ICashDeskDAO.repository");
		PerformanceTransformationFactory.getInstance(SQuATConfiguration.generateDefault()).generateArchitecturalVersionsUsingPerformanceTransformations(av);
	}

}
