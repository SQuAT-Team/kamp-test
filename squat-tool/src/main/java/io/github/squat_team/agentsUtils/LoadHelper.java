package io.github.squat_team.agentsUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.concessionStrategies.DesiredDistanceFactory;
import io.github.squat_team.agentsUtils.concessionStrategies.IConcessionStrategyFactory;
import io.github.squat_team.agentsUtils.transformations.PerformanceTransformationFactory;
import io.github.squat_team.experiments.CocomePerformanceScenarioHelper;
import io.github.squat_team.experiments.filters.IFilter;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.runner.SQuATConfiguration;
import io.github.squat_team.util.PCMHelper;

public class LoadHelper {
	private static int MAXIMUM_ALTERNATIVES = 50;
	private SQuATConfiguration configuration;

	public LoadHelper(SQuATConfiguration configuration) {
		super();
		this.configuration = configuration;
	}

	public List<SillyBot> loadBotsForArchitecturalAlternatives(List<ArchitecturalVersion> architecturalAlternatives,
			ArchitecturalVersion initialArchitecture) {
		return getCocomeAlternatives(architecturalAlternatives, initialArchitecture);
		// return getSTPlusAlternatives(architecturalAlternatives, initialArchitecture);
	}

	private List<SillyBot> getCocomeAlternatives(List<ArchitecturalVersion> architecturalAlternatives,
			ArchitecturalVersion initialArchitecture) {
		List<SillyBot> sillyBots = new ArrayList<>();
		try {
			Map<SillyBot, AbstractPCMBot> modifiabilityBots = new LinkedHashMap<>();
			Map<SillyBot, AbstractPCMBot> performanceBots = new LinkedHashMap<>();

			// CREATE SILLY BOTS
			IConcessionStrategyFactory concessionStrategyFactory = configuration.getConcessionStrategyFactory();
			Boolean filterSpecialCases = configuration.shouldFilterSpecialCases();
			List<AbstractPCMBot> bots = configuration.getExperiment().getBots();
			for (AbstractPCMBot bot : bots) {
				String name = bot.getName();
				String qualityAttribute = bot.getQualityAttribute();
				PCMScenario scenario = bot.getScenario();
				Float expectedResponseTime = (Float) scenario.getExpectedResult().getResponse();
				SillyBot sillyBot = new SillyBot(name, qualityAttribute, expectedResponseTime,
						concessionStrategyFactory, filterSpecialCases);
				sillyBots.add(sillyBot);

				if (sillyBot.getQualityAttribute().equals(AbstractPCMBot.QA_MODIFIABILITY)) {
					modifiabilityBots.put(sillyBot, bot);
				} else if (sillyBot.getQualityAttribute().equals(AbstractPCMBot.QA_PERFORMANCE)) {
					performanceBots.put(sillyBot, bot);
				}
			}

			// PRE EVALUATION CANDIDATE FILTERING
			applyPreEvaluationFilters(architecturalAlternatives);

			Map<ArchitecturalVersion, PCMArchitectureInstance> instances = new HashMap<>();
			PCMArchitectureInstance architecture;// = PCMHelper.createArchitecture(initialArchitecture);

			// EVALUATE MODiFIABILITY CANDIDATES
			int j = 1;
			for (ArchitecturalVersion architecturalVersion : architecturalAlternatives) {
				java.lang.System.out.println("********MODIFIABILITY: LOADING " + j + " OF "
						+ architecturalAlternatives.size() + " ARCHITECTURAL ALTERNATIVES INTO THE BOTS ***********");
				j++;

				architecture = PCMHelper.createArchitecture(architecturalVersion);
				instances.put(architecturalVersion, architecture);

				for (SillyBot sillyModifiabilityBot : modifiabilityBots.keySet()) {
					AbstractPCMBot bot = modifiabilityBots.get(sillyModifiabilityBot);
					sillyModifiabilityBot.insertInOrder(new Proposal(
							calculateModifiabilityComplexity(bot, architecture), architecturalVersion.getName()));
				}
			}

			// PRINT MODIFIABILITY CANDIDATES
			for (SillyBot sillyModifiabilityBot : modifiabilityBots.keySet()) {
				sillyModifiabilityBot.printUtilies();
			}

			// FILTER MODIFIABILITY CANDIDATES
			Set<ArchitecturalVersion> bestAlternatives = new HashSet<>();
			if (architecturalAlternatives.size() > MAXIMUM_ALTERNATIVES) {
				java.lang.System.out
						.println("*****ORIGINAL NUMBER OF ALTERNATIVES: " + architecturalAlternatives.size());

				for (SillyBot sillyModifiabilityBot : modifiabilityBots.keySet()) {
					bestAlternatives.addAll(filterBestAlternatives(architecturalAlternatives, sillyModifiabilityBot));
				}
				bestAlternatives.addAll(getPerformanceAlternatives(architecturalAlternatives));

				List<ArchitecturalVersion> alternativesToRemoveFromCache = new ArrayList<>(architecturalAlternatives);
				alternativesToRemoveFromCache.removeAll(bestAlternatives);
				for (ArchitecturalVersion toRemove : alternativesToRemoveFromCache) {
					instances.remove(toRemove);
				}

				filterList(architecturalAlternatives, bestAlternatives);
				for (SillyBot sillyModifiabilityBot : modifiabilityBots.keySet()) {
					updateProposals(sillyModifiabilityBot, architecturalAlternatives);
				}

				java.lang.System.out
						.println("*****FILTERED NUMBER OF ALTERNATIVES: " + architecturalAlternatives.size());
			}

			// EVALUATE PERFROMANCE CANDIDATES
			int i = 1;
			for (ArchitecturalVersion architecturalVersion : architecturalAlternatives) {
				java.lang.System.out.println("********PERFORMANCE: LOADING " + i + " OF "
						+ architecturalAlternatives.size() + " ARCHITECTURAL ALTERNATIVES INTO THE BOTS***********");
				i++;
				architecture = instances.get(architecturalVersion);
				String absolutePathArchitecture = architecturalVersion.getAbsolutePath() + "/"
						+ architecturalVersion.getRepositoryFilename();
				String architecturalVersionName = architecturalVersion.getName();

				for (SillyBot sillyPerformanceBot : performanceBots.keySet()) {
					AbstractPCMBot bot = performanceBots.get(sillyPerformanceBot);
					sillyPerformanceBot.insertInOrder(new Proposal(
							calculatePerformanceComplexityForScenario(bot, architecture, absolutePathArchitecture),
							architecturalVersionName));
				}

				instances.remove(architecture);
			}

			instances = null;

			// REMOVE CORRUPTED ALTERNATIVES
			Set<ArchitecturalVersion> alternativesCorrupted = new HashSet<>();
			for (ArchitecturalVersion architecturalVersion : architecturalAlternatives) {
				boolean corrupted = true;
				for (SillyBot sillyPerformanceBot : performanceBots.keySet()) {
					corrupted = corrupted && sillyPerformanceBot
							.getProposalForArchitecture(architecturalVersion.getName()).getScenarioResponse() == 9999f;
				}
				if (corrupted) {
					alternativesCorrupted.add(architecturalVersion);
					java.lang.System.out.println("Corrupted: " + architecturalVersion.getName());
				}
			}
			List<ArchitecturalVersion> alternativesToKeep = new ArrayList<>();
			alternativesToKeep.addAll(architecturalAlternatives);
			alternativesToKeep.removeAll(alternativesCorrupted);
			filterList(architecturalAlternatives, alternativesToKeep);
			for (SillyBot sillyBot : sillyBots) {
				updateProposals(sillyBot, architecturalAlternatives);
			}

			for (SillyBot sillyBot : sillyBots) {
				sillyBot.printUtilies();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return sillyBots;
	}

	/**
	 * Applies the filters before the full evaluation of all alternatives begins.
	 * 
	 * @param architecturalAlternatives
	 *            all alternatives. This list will be modified.
	 */
	private void applyPreEvaluationFilters(List<ArchitecturalVersion> architecturalAlternatives) {
		java.lang.System.out.println("INITIAL NUMBER OF ALTERNATIVES: " + architecturalAlternatives.size());
		for (IFilter filter : configuration.getExperiment().getPreEvaluationFilters()) {
			if (filter.checkPrecondition(architecturalAlternatives)) {
				architecturalAlternatives = filter.filter(architecturalAlternatives);
			}
		}
		java.lang.System.out.println("After pre evaluation filtering " + architecturalAlternatives.size());
	}

	private List<ArchitecturalVersion> getPerformanceAlternatives(
			List<ArchitecturalVersion> architecturalAlternatives) {
		List<ArchitecturalVersion> performanceAlternatives = new ArrayList<>();
		for (ArchitecturalVersion architecturalVersion : architecturalAlternatives) {
			if (!architecturalVersion.wasLastModifiedBy(AbstractPCMBot.QA_MODIFIABILITY))
				performanceAlternatives.add(architecturalVersion);
		}
		return performanceAlternatives;
	}

	private void updateProposals(SillyBot m1Bot, List<ArchitecturalVersion> architecturalAlternatives) {
		m1Bot.removeNotContainedProposals(architecturalAlternatives);
	}

	/**
	 * It removes from the list the alternatives that are not contained in the Set
	 * 
	 * @param architecturalAlternatives
	 * @param bestAlternatives
	 */
	private void filterList(List<ArchitecturalVersion> architecturalAlternatives,
			Collection<ArchitecturalVersion> bestAlternatives) {
		architecturalAlternatives.clear();
		architecturalAlternatives.addAll(bestAlternatives);
	}

	private Set<ArchitecturalVersion> filterBestAlternatives(List<ArchitecturalVersion> architecturalAlternatives,
			SillyBot bot) {

		List<Proposal> proposalsForBot = bot.getOrderedProposals();

		if (bot.getUtilityFor(proposalsForBot.get(proposalsForBot.size() - 1)) > 0) {
			return new HashSet<>(architecturalAlternatives.subList(0, MAXIMUM_ALTERNATIVES));
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

	private float calculateModifiabilityComplexity(AbstractPCMBot bot, PCMArchitectureInstance model) throws Exception {
		boolean debug = false;
		@SuppressWarnings("unchecked")
		Comparable<Float> expectedResponse = bot.getScenario().getExpectedResult().getResponse();
		if (debug)
			java.lang.System.out.println("The goal of scenario: " + expectedResponse.toString());
		//
		try {
			// PCMArchitectureInstance model = this.loadSpecificModel(architecturalVersion);
			PCMScenarioResult scenarioResult = bot.analyze(model);
			if (debug) {
				String satisfaction_alt1 = scenarioResult.isSatisfied() >= 0 ? "SATISFIED" : "NOT SATISFIED";
				java.lang.System.out
						.println("The scenario satisfaction with " + model.getName() + " is: " + satisfaction_alt1);
			}
			@SuppressWarnings("unchecked")
			Comparable<Float> response_alt1 = scenarioResult.getResult().getResponse();
			return ((Float) response_alt1).floatValue();
		} catch (Exception e) {
			e.printStackTrace();
			return Float.MAX_VALUE;
		}

	}

	public float calculatePerformanceComplexityForScenario(AbstractPCMBot bot, PCMArchitectureInstance architecture,
			String absolutePathArchitecture) {
		Double complexity = PerformanceTransformationFactory.getInstance(configuration)
				.getComplexityForArchitecture(bot, absolutePathArchitecture);
		if (complexity != null) {
			// java.lang.System.out.println("Funciono la cache");
			return new Float(complexity.toString());
		} else {
			// java.lang.System.out.println("NOOO funciono la cache");
			PCMScenarioResult result = bot.analyze(architecture);
			java.lang.System.out.println("PERFORMANCE: " + result + " " + bot + " " + architecture);
			java.lang.System.out.println(bot.getName());
			if (result == null)// is unsolvable
				return 9999f;
			else
				return new Float(result.getResult().getResponse().toString()).floatValue();
		}
	}

	public static void main(String[] args) {
		Float responseTimeP1 = 0.6f;// 30f;
		ArchitecturalVersion initialArchitecture = new ArchitecturalVersion("cocome-cloud",
				"models/cocomeWithResourceDemands", "");
		initialArchitecture.setFullPathToAlternativeRepository(
				"/Users/santiagovidal/Documents/Programacion/kamp-test/squat-tool/models/cocomeWithResourceDemands/alternativeRepository.repository");
		PCMArchitectureInstance architecture = PCMHelper.createArchitecture(initialArchitecture);
		PCMScenario scenarioP1 = (new CocomePerformanceScenarioHelper()).createScenario1Cocome(1f);
		SillyBot p1Bot = new SillyBot("p1", AbstractPCMBot.QA_PERFORMANCE, responseTimeP1, new DesiredDistanceFactory(),
				true);
	}
}
