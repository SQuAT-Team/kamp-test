package io.github.squat_team.agentsUtils.transformations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.runner.SQuATConfiguration;
import io.github.squat_team.util.PCMHelper;

public class ModifiabilityTransformationsFactory {
	private static volatile ModifiabilityTransformationsFactory instance;
	private volatile Map<AbstractPCMBot, Map<String, Double>> architecturalResponse;

	public static ModifiabilityTransformationsFactory getInstance(SQuATConfiguration configuration) {
		if (instance == null) {
			instance = new ModifiabilityTransformationsFactory(configuration);
		}
		return instance;
	}

	private ModifiabilityTransformationsFactory(SQuATConfiguration configuration) {
		architecturalResponse = new LinkedHashMap<>();
		for (AbstractPCMBot bot : configuration.getExperiment().getBots()) {
			if (bot.getQualityAttribute().equals(AbstractPCMBot.QA_MODIFIABILITY)) {
				architecturalResponse.put(bot, new HashMap<String, Double>());
			}
		}
	}

	public synchronized Double getComplexityForArchitecture(AbstractPCMBot bot, String architectureAbsolutePath) {
		return architecturalResponse.get(bot).get(architectureAbsolutePath);
	}

	public List<ArchitecturalVersion> runModifiabilityTransformationsInAModel(
			ArchitecturalVersion initialArchitecture) {
		List<ArchitecturalVersion> ret = new ArrayList<ArchitecturalVersion>();
		System.out.println("Analyzing: " + initialArchitecture.getFileName());
		PCMArchitectureInstance architecture = PCMHelper.createArchitecture(initialArchitecture);
		System.out.println("Loading modifiability scenario M1");
		AbstractPCMBot bot = architecturalResponse.keySet().iterator().next();
		System.out.println(bot.getName());
		for(AbstractPCMBot bot2 : architecturalResponse.keySet()) {
			System.out.println(bot2.getName());
		}
		ret.addAll(createAlternativesForScenario(architecture, bot));
		return ret;
	}

	private List<ArchitecturalVersion> createAlternativesForScenario(PCMArchitectureInstance architecture,
			AbstractPCMBot bot) {
		List<ArchitecturalVersion> ret = new ArrayList<ArchitecturalVersion>();
		List<PCMScenarioResult> results = bot.searchForAlternatives(architecture);

		for (PCMScenarioResult result : results) {
			PCMArchitectureInstance archInstance = result.getResultingArchitecture();
			ArchitecturalVersion newAlternative = PCMHelper.createArchitecture(archInstance);

			Float response = (Float) result.getResult().getResponse();
			architecturalResponse.get(bot).put(
					newAlternative.getAbsolutePath() + "/" + newAlternative.getRepositoryFilename(),
					response.doubleValue());
			ret.add(newAlternative);
		}

		return ret;
	}

}
