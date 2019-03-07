package io.github.squat_team.agentsUtils.transformations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.ArchitecturalCopyCreator;
import io.github.squat_team.agentsUtils.PerformanceScenarioHelper;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.util.PCMHelper;

@SuppressWarnings("rawtypes")
public class PerformanceTransformationFactory {
	private static volatile PerformanceTransformationFactory instance;
	private volatile Map<PCMScenario, Map<String, Double>> architecturalResponse;

	public static PerformanceTransformationFactory getInstance() {
		if (instance == null) {
			instance = new PerformanceTransformationFactory();
		}
		return instance;
	}

	private PerformanceTransformationFactory() {
		architecturalResponse = new HashMap<>();
		architecturalResponse.put(PerformanceScenarioHelper.getInstance().createScenario1Cocome(),
				new HashMap<String, Double>());
		architecturalResponse.put(PerformanceScenarioHelper.getInstance().createScenario2Cocome(),
				new HashMap<String, Double>());
		architecturalResponse.put(PerformanceScenarioHelper.getInstance().createScenario3Cocome(),
				new HashMap<String, Double>());
		architecturalResponse.put(PerformanceScenarioHelper.getInstance().createScenario4Cocome(),
				new HashMap<String, Double>());
	}

	public synchronized Double getComplexityForArchitecture(PCMScenario scenario, String architectureAbsolutePath) {
		return architecturalResponse.get(scenario).get(architectureAbsolutePath);
	}

	public List<ArchitecturalVersion> generateArchitecturalVersionsUsingPerformanceTransformations(
			ArchitecturalVersion architecturalVersion) {
		List<ArchitecturalVersion> ret = new ArrayList<ArchitecturalVersion>();
		/*
		 * AbstractPerformancePCMScenario workloadScenario =
		 * PerformanceScenarioHelper.createScenarioOfWorkload();
		 * ret.addAll(createAlternativesForScenario(architecturalVersion,
		 * workloadScenario)); AbstractPerformancePCMScenario cpuScenario =
		 * PerformanceScenarioHelper.createScenarioOfCPU();
		 * ret.addAll(createAlternativesForScenario(architecturalVersion, cpuScenario))
		 */
		System.out.println("Analyzing: " + architecturalVersion.getFileName());
		PCMArchitectureInstance architecture = PCMHelper.createArchitecture(architecturalVersion);

		System.out.println("Loading performance scenario P1");
		PCMScenario cocomeScenario1 = PerformanceScenarioHelper.getInstance().createScenario1Cocome();
		ret.addAll(createAlternativesForScenario(architecture, cocomeScenario1));
		System.out.println("Loading performance scenario P2");
		PCMScenario cocomeScenario2 = PerformanceScenarioHelper.getInstance().createScenario2Cocome();
		ret.addAll(createAlternativesForScenario(architecture, cocomeScenario2));
		System.out.println("Loading performance scenario P3");
		PCMScenario cocomeScenario3 = PerformanceScenarioHelper.getInstance().createScenario3Cocome();
		ret.addAll(createAlternativesForScenario(architecture, cocomeScenario3));
		System.out.println("Loading performance scenario P4");
		PCMScenario cocomeScenario4 = PerformanceScenarioHelper.getInstance().createScenario4Cocome();
		ret.addAll(createAlternativesForScenario(architecture, cocomeScenario4));
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
			PCMScenario scenario) {

		List<ArchitecturalVersion> ret = new ArrayList<ArchitecturalVersion>();

		AbstractPCMBot bot = PerformanceScenarioHelper.getInstance().createPCMBot(scenario);
		// PCMArchitectureInstance
		// architecture=PerformanceScenarioHelper.createArchitecture(architecturalVersion);

		List<PCMScenarioResult> results = bot.searchForAlternatives(architecture);

		ArchitecturalCopyCreator copyCreator = ArchitecturalCopyCreator.getInstance();
		for (PCMScenarioResult result : results) {
			PCMArchitectureInstance archInstance = result.getResultingArchitecture();
			ArchitecturalVersion newAlternative = copyCreator.copy(archInstance, scenario);

			Comparable response = result.getResult().getResponse();
			Double doubleResponse;
			if (response instanceof Double) {
				doubleResponse = (Double) response;
			} else if (response instanceof Float) {
				doubleResponse = ((Float) response).doubleValue();
			} else {
				throw new RuntimeException("");
			}

			architecturalResponse.get(scenario).put(
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
		PerformanceTransformationFactory.getInstance().generateArchitecturalVersionsUsingPerformanceTransformations(av);
	}

}
