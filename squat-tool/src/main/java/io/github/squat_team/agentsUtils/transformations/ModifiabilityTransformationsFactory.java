package io.github.squat_team.agentsUtils.transformations;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.ModifiabilityScenarioHelper;
import io.github.squat_team.agentsUtils.PerformanceScenarioHelper;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.modifiability.kamp.KAMPPCMBot;
import io.github.squat_team.performance.AbstractPerformancePCMScenario;
import io.github.squat_team.util.PCMHelper;

public class ModifiabilityTransformationsFactory {
	private static volatile ModifiabilityTransformationsFactory instance;
	private volatile Map<PCMScenario, Map<String, Double>> architecturalResponse;

	public static ModifiabilityTransformationsFactory getInstance() {
		if (instance == null)
			instance = new ModifiabilityTransformationsFactory();
		return instance;
	}

	private ModifiabilityTransformationsFactory() {
		architecturalResponse = new HashMap<>();
		architecturalResponse.put(ModifiabilityScenarioHelper.getInstance().createScenario1Cocome(),
				new HashMap<String, Double>());
		architecturalResponse.put(ModifiabilityScenarioHelper.getInstance().createScenario2Cocome(),
				new HashMap<String, Double>());
		architecturalResponse.put(ModifiabilityScenarioHelper.getInstance().createScenario3Cocome(),
				new HashMap<String, Double>());
		architecturalResponse.put(ModifiabilityScenarioHelper.getInstance().createScenario4Cocome(),
				new HashMap<String, Double>());
	}

	public synchronized Double getComplexityForArchitecture(AbstractPerformancePCMScenario scenario,
			String architectureAbsolutePath) {
		return architecturalResponse.get(scenario).get(architectureAbsolutePath);
	}

	public List<ArchitecturalVersion> runModifiabilityTransformationsInAModel(
			ArchitecturalVersion initialArchitecture) {
		List<ArchitecturalVersion> ret = new ArrayList<ArchitecturalVersion>();
		System.out.println("Analyzing: " + initialArchitecture.getFileName());
		PCMArchitectureInstance architecture = PCMHelper.createArchitecture(initialArchitecture);

		System.out.println("Loading modifiability scenario M1");
		PCMScenario cocomeScenario1 = ModifiabilityScenarioHelper.getInstance().createScenario1Cocome();
		ret.addAll(createAlternativesForScenario(architecture, cocomeScenario1));
		return ret;
	}

	private List<ArchitecturalVersion> createAlternativesForScenario(PCMArchitectureInstance architecture,
			PCMScenario scenario) {

		List<ArchitecturalVersion> ret = new ArrayList<ArchitecturalVersion>();

		AbstractPCMBot bot = ModifiabilityScenarioHelper.getInstance().createPCMBot(scenario);

		List<PCMScenarioResult> results = bot.searchForAlternatives(architecture);

		for (PCMScenarioResult result : results) {

			// TODO model transformation should be done in separate method
			PCMArchitectureInstance archInstance = result.getResultingArchitecture();
			ArchitecturalVersion newAlternative = PCMHelper.createArchitecture(archInstance);
			
			//URI uri = archInstance.getUsageModel().eResource().getURI();
			//File modelFile = new File(uri.toFileString());
			//ArchitecturalVersion newAlternative = new ArchitecturalVersion(
			//		modelFile.getName().substring(0, modelFile.getName().lastIndexOf('.')),
			//		modelFile.getParentFile().getAbsolutePath/* getName */(), ArchitecturalVersion.MODIFIABILITY);

			//newAlternative.setFullPathToAlternativeRepository(
			//		archInstance.getRepositoryWithAlternatives().eResource().getURI().toFileString());

			Float response = (Float) result.getResult().getResponse();
			architecturalResponse.get(scenario).put(
					newAlternative.getAbsolutePath() + "/" + newAlternative.getRepositoryFilename(), response.doubleValue()
					);
			ret.add(newAlternative);
		}

		return ret;
	}

}
