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
import io.github.squat_team.util.AlternativesRegistry;
import io.github.squat_team.util.PCMHelper;
import io.github.squat_team.util.TimeMeasurement;

public class QualityAttributeTransformationFactory {
	private volatile Map<AbstractPCMBot, Map<String, Double>> architecturalResponse;
	private String qualityAttribute;
	private boolean allBotsHaveSameTactics;

	public QualityAttributeTransformationFactory(SQuATConfiguration configuration, String qualityAttribute) {
		this.qualityAttribute = qualityAttribute;
		this.architecturalResponse = new LinkedHashMap<>();
		for (AbstractPCMBot bot : configuration.getExperiment().getBots()) {
			if (bot.getQualityAttribute().equals(qualityAttribute)) {
				architecturalResponse.put(bot, new HashMap<String, Double>());
			}
		}
		this.allBotsHaveSameTactics = !architecturalResponse.keySet().iterator().next().hasUniqueTactics();
	}

	public synchronized Double getComplexityForArchitecture(AbstractPCMBot bot, String architectureAbsolutePath) {
		return architecturalResponse.get(bot).get(architectureAbsolutePath);
	}

	public List<ArchitecturalVersion> generateArchitecturalVersionsUsingTransformations(
			ArchitecturalVersion parentArchitecturalVersion) {
		TimeMeasurement.getInstace().printStart("generation of " + qualityAttribute + " architectural alternatives");
		System.out.println("Analyzing: " + parentArchitecturalVersion.getFileName());
		PCMArchitectureInstance architecture = PCMHelper.createArchitecture(parentArchitecturalVersion);

		List<ArchitecturalVersion> architecturalVersions;
		if (allBotsHaveSameTactics) {
			architecturalVersions = createArchitecturalVersionsByOneBot(architecture);
		} else {
			architecturalVersions = createArchitecturalVersionsByAllBots(architecture);
		}

		TimeMeasurement.getInstace().printFinish("generation of " + qualityAttribute + " architectural alternatives");
		AlternativesRegistry.getInstace().saveChildrensOfArchitecture(parentArchitecturalVersion, architecturalVersions);
		
		return architecturalVersions;
	}

	private List<ArchitecturalVersion> createArchitecturalVersionsByAllBots(PCMArchitectureInstance architecture) {
		List<ArchitecturalVersion> createdArchitectures = new ArrayList<ArchitecturalVersion>();
		for (AbstractPCMBot bot : architecturalResponse.keySet()) {
			System.out.println("Loading " + qualityAttribute + " scenario for bot " + bot.getName());
			createdArchitectures.addAll(createAlternativesForScenario(architecture, bot));
		}
		return createdArchitectures;
	}

	private List<ArchitecturalVersion> createArchitecturalVersionsByOneBot(PCMArchitectureInstance architecture) {
		List<ArchitecturalVersion> createdArchitectures = new ArrayList<ArchitecturalVersion>();
		AbstractPCMBot bot = architecturalResponse.keySet().iterator().next();
		System.out.println("Loading " + qualityAttribute + " scenario for bot " + bot.getName());
		createdArchitectures.addAll(createAlternativesForScenario(architecture, bot));
		return createdArchitectures;
	}

	@SuppressWarnings("rawtypes")
	private List<ArchitecturalVersion> createAlternativesForScenario(PCMArchitectureInstance architecture,
			AbstractPCMBot bot) {
		List<ArchitecturalVersion> ret = new ArrayList<ArchitecturalVersion>();
		List<PCMScenarioResult> results = bot.searchForAlternatives(architecture);

		for (PCMScenarioResult result : results) {
			PCMArchitectureInstance archInstance = result.getResultingArchitecture();
			ArchitecturalVersion newAlternative = bot.transformCandidate(archInstance);

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

}
