package io.github.squat_team.agentsUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.concessionStrategies.IConcessionStrategyFactory;
import io.github.squat_team.agentsUtils.transformations.ArchitecturalTransformationsFactory;
import io.github.squat_team.experiments.filters.IFilter;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.runner.SQuATConfiguration;
import io.github.squat_team.util.PCMHelper;

public class LoadHelper {
	private SQuATConfiguration configuration;
	private ArchitecturalTransformationsFactory architecturalTransformationsFactory;

	public LoadHelper(SQuATConfiguration configuration,
			ArchitecturalTransformationsFactory architecturalTransformationFactory) {
		super();
		this.configuration = configuration;
		this.architecturalTransformationsFactory = architecturalTransformationFactory;
	}

	public List<SillyBot> loadBotsForArchitecturalAlternatives(List<ArchitecturalVersion> architecturalAlternatives,
			ArchitecturalVersion initialArchitecture) {
		return getCocomeAlternatives(architecturalAlternatives, initialArchitecture);
		// return getSTPlusAlternatives(architecturalAlternatives, initialArchitecture);
	}

	private Map<String, Map<SillyBot, AbstractPCMBot>> createSillyBots() {
		Map<String, Map<SillyBot, AbstractPCMBot>> botsSortedByQualityAttribute = new LinkedHashMap<>();
		List<AbstractPCMBot> bots = configuration.getExperiment().getBots();
		for (AbstractPCMBot bot : bots) {
			createSillyBot(bot, botsSortedByQualityAttribute);
		}
		return botsSortedByQualityAttribute;
	}

	private Map<String, Map<SillyBot, AbstractPCMBot>> createSillyBot(AbstractPCMBot bot,
			Map<String, Map<SillyBot, AbstractPCMBot>> botsSortedByQualityAttribute) {
		IConcessionStrategyFactory concessionStrategyFactory = configuration.getConcessionStrategyFactory();
		Boolean filterSpecialCases = configuration.shouldFilterSpecialCases();
		String name = bot.getName();
		String qualityAttribute = bot.getQualityAttribute();
		PCMScenario scenario = bot.getScenario();
		Float expectedResponseTime = (Float) scenario.getExpectedResult().getResponse();
		SillyBot sillyBot = new SillyBot(name, qualityAttribute, expectedResponseTime, concessionStrategyFactory,
				filterSpecialCases);
		addBotEntry(botsSortedByQualityAttribute, sillyBot, bot);
		return botsSortedByQualityAttribute;
	}

	private void addBotEntry(Map<String, Map<SillyBot, AbstractPCMBot>> botsSortedByQualityAttribute, SillyBot sillyBot,
			AbstractPCMBot bot) {
		String qualityAttribute = sillyBot.getQualityAttribute();
		Map<SillyBot, AbstractPCMBot> botsForQualityAttribute = botsSortedByQualityAttribute.get(qualityAttribute);
		if (botsForQualityAttribute == null) {
			botsForQualityAttribute = new LinkedHashMap<>();
			botsSortedByQualityAttribute.put(qualityAttribute, botsForQualityAttribute);
		}
		botsForQualityAttribute.put(sillyBot, bot);
	}

	private List<SillyBot> getAllBots(Map<String, Map<SillyBot, AbstractPCMBot>> botsByQualityAttribute) {
		List<SillyBot> sillyBots = new ArrayList<>();
		for (Map<SillyBot, AbstractPCMBot> botsForQualityAttribute : botsByQualityAttribute.values()) {
			sillyBots.addAll(botsForQualityAttribute.keySet());
		}
		return sillyBots;
	}

	private List<SillyBot> getCocomeAlternatives(List<ArchitecturalVersion> architecturalAlternatives,
			ArchitecturalVersion initialArchitecture) {
		Map<String, Map<SillyBot, AbstractPCMBot>> botsSortedByQualityAttribute = createSillyBots();
		List<SillyBot> sillyBots = getAllBots(botsSortedByQualityAttribute);
		try {
			// PRE EVALUATION CANDIDATE FILTERING
			applyPreEvaluationFilters(architecturalAlternatives);

			Map<ArchitecturalVersion, PCMArchitectureInstance> architectureCache = new HashMap<>();
			PCMArchitectureInstance currentArchitecture;

			List<String> qualityAttributes = configuration.getExperiment().getOrderedQualityAttributes();
			for (String currentQualityAttribute : qualityAttributes) {
				Map<SillyBot, AbstractPCMBot> botsForCurrentQualityAttribute = botsSortedByQualityAttribute
						.get(currentQualityAttribute);

				// EVALUATE CANDIDATES
				for (ArchitecturalVersion currentArchitecturalVersion : architecturalAlternatives) {
					// cache
					currentArchitecture = architectureCache.get(currentArchitecturalVersion);
					if (currentArchitecture == null) {
						// no cache
						currentArchitecture = PCMHelper.createArchitecture(currentArchitecturalVersion);
						architectureCache.put(currentArchitecturalVersion, currentArchitecture);
					}

					for (Map.Entry<SillyBot, AbstractPCMBot> currentBot : botsForCurrentQualityAttribute.entrySet()) {
						SillyBot currentSillyBot = currentBot.getKey();
						AbstractPCMBot currentRealBot = currentBot.getValue();

						String absolutePathArchitecture = currentArchitecturalVersion.getAbsolutePath() + "/"
								+ currentArchitecturalVersion.getRepositoryFilename();
						String architecturalVersionName = currentArchitecturalVersion.getName();

						currentSillyBot.insertInOrder(new Proposal(calculateQualityAttributeComplexity(currentRealBot,
								currentArchitecture, absolutePathArchitecture), architecturalVersionName));
					}
				}

				// FILTER
				List<IFilter> filtersForCurrentQualityAttribute = configuration.getExperiment()
						.getQAspecificPostEvaluationFilters().get(currentQualityAttribute);
				Set<SillyBot> sillyBotsForCurrentQualityAttribute = botsForCurrentQualityAttribute.keySet();
				if (filtersForCurrentQualityAttribute != null) {
					for (IFilter filter : filtersForCurrentQualityAttribute) {
						if (filter.checkPrecondition(architecturalAlternatives, sillyBotsForCurrentQualityAttribute)) {
							architecturalAlternatives = filter.filter(architecturalAlternatives,
									sillyBotsForCurrentQualityAttribute, sillyBots, architectureCache);
						}
					}
				}

				// PRINT QUALITY ATTRIBUTE CANDIDATES
				for (SillyBot sillyBot : sillyBotsForCurrentQualityAttribute) {
					sillyBot.printUtilies();
				}
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
			if (filter.checkPrecondition(architecturalAlternatives, null)) {
				architecturalAlternatives = filter.filter(architecturalAlternatives, null, null, null);
			}
		}
		java.lang.System.out.println("After pre evaluation filtering " + architecturalAlternatives.size());
	}

	private float calculateQualityAttributeComplexity(AbstractPCMBot bot, PCMArchitectureInstance architecture,
			String absolutePathArchitecture) {
		Double complexity = architecturalTransformationsFactory.findTransformationFactory(bot)
				.getComplexityForArchitecture(bot, absolutePathArchitecture);
		if (complexity != null) {
			// Use cached value
			return new Float(complexity.toString());
		} else {
			try {
				// Compute value
				PCMScenarioResult result = bot.analyze(architecture);
				java.lang.System.out.println(
						"Quality Attribute of bot " + bot.getName() + ": " + result + " " + bot + " " + architecture);
				if (result == null)// is unsolvable
					return Float.MAX_VALUE;
				else
					return new Float(result.getResult().getResponse().toString()).floatValue();
			} catch (Exception e) {
				return Float.MAX_VALUE;
			}
		}
	}

}
