package io.github.squat_team.experiments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.experiments.filters.BestCandidatesFilter;
import io.github.squat_team.experiments.filters.CorruptedCandidatesFilter;
import io.github.squat_team.experiments.filters.IFilter;
import io.github.squat_team.experiments.filters.RandomFilter;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.ResponseMeasureType;
import io.github.squat_team.modifiability.kamp.EvaluationType;
import io.github.squat_team.modifiability.kamp.KAMPPCMBot;
import io.github.squat_team.performance.peropteryx.ConcurrentPerOpteryxPCMBot;
import io.github.squat_team.performance.peropteryx.configuration.ConfigurationImprovedImproved;
import io.github.squat_team.performance.peropteryx.configuration.DesigndecisionConfigImproved;
import test.TestConstants;

/**
 * These are the default settings for the CoCoME project.
 */
public class CocomeExperiment extends AbstractExperiment {
	private static final CocomePerformanceScenarioHelper performanceScenarios = new CocomePerformanceScenarioHelper();
	private static final CocomeModifiabilityScenarioHelper modifiabilityScenarios = new CocomeModifiabilityScenarioHelper();

	private static final Float responseTimeM1 = 2270f;
	private static final Float responseTimeM2 = 750f;
	private static final Float responseTimeM3 = 170f;
	private static final Float responseTimeM4 = 2180f;
	private static final Float responseTimeP1 = 1.4f;
	private static final Float responseTimeP2 = 1.6f;
	private static final Float responseTimeP3 = 1.3f;
	private static final Float responseTimeP4 = 2.8f;

	private static final String botNameM1 = "modifiabilityBot1";
	private static final String botNameM2 = "modifiabilityBot2";
	private static final String botNameM3 = "modifiabilityBot3";
	private static final String botNameM4 = "modifiabilityBot4";
	private static final String botNameP1 = "perfomanceBot1";
	private static final String botNameP2 = "perfomanceBot2";
	private static final String botNameP3 = "perfomanceBot3";
	private static final String botNameP4 = "perfomanceBot4";

	private static final int randomFilterTotalMaximum = 400;
	private static final int maximum_alternatives = 50;

	private List<AbstractPCMBot> bots;
	private List<String> orderedQualityAttributes;
	private List<IFilter> preEvaluationFilters;
	private Map<String, List<IFilter>> qaSpecificFilters;

	@Override
	public List<AbstractPCMBot> getBots() {
		if (bots == null) {
			bots = new ArrayList<>();
			bots.addAll(getModifiabilityBots());
			bots.addAll(getPerformanceBots());
		}
		return bots;
	}

	private List<AbstractPCMBot> getModifiabilityBots() {
		List<AbstractPCMBot> modifiabilityBots = new ArrayList<>();
		PCMScenario scenarioM1 = modifiabilityScenarios.createModifiabilityNFC(ResponseMeasureType.DECIMAL,
				responseTimeM1);
		PCMScenario scenarioM2 = modifiabilityScenarios.createModifiabilityVIP(ResponseMeasureType.DECIMAL,
				responseTimeM2);
		PCMScenario scenarioM3 = modifiabilityScenarios.createModifiabilityWithdrawMoney(ResponseMeasureType.DECIMAL,
				responseTimeM3);
		PCMScenario scenarioM4 = modifiabilityScenarios.createModifiabilityServiceLog(ResponseMeasureType.DECIMAL,
				responseTimeM4);
		modifiabilityBots.add(createModifiabilityBot(botNameM1, scenarioM1));
		modifiabilityBots.add(createModifiabilityBot(botNameM2, scenarioM2));
		modifiabilityBots.add(createModifiabilityBot(botNameM3, scenarioM3));
		modifiabilityBots.add(createModifiabilityBot(botNameM4, scenarioM4));
		return modifiabilityBots;
	}

	private List<AbstractPCMBot> getPerformanceBots() {
		List<AbstractPCMBot> performanceBots = new ArrayList<>();
		PCMScenario scenarioP1 = performanceScenarios.createScenario1Cocome(responseTimeP1);
		PCMScenario scenarioP2 = performanceScenarios.createScenario2Cocome(responseTimeP2);
		PCMScenario scenarioP3 = performanceScenarios.createScenario3Cocome(responseTimeP3);
		PCMScenario scenarioP4 = performanceScenarios.createScenario4Cocome(responseTimeP4);
		performanceBots.add(createPerformanceBot(botNameP1, scenarioP1));
		performanceBots.add(createPerformanceBot(botNameP2, scenarioP2));
		performanceBots.add(createPerformanceBot(botNameP3, scenarioP3));
		performanceBots.add(createPerformanceBot(botNameP4, scenarioP4));
		return performanceBots;
	}

	private AbstractPCMBot createModifiabilityBot(String name, PCMScenario scenario) {
		KAMPPCMBot bot = new KAMPPCMBot(name, scenario);
		bot.setEvaluationType(EvaluationType.COMPLEXITY);
		return bot;
	}

	private AbstractPCMBot createPerformanceBot(String name, PCMScenario scenario) {
		ConfigurationImprovedImproved configuration = createPerformanceConfiguration();
		ConcurrentPerOpteryxPCMBot bot = new ConcurrentPerOpteryxPCMBot(name, scenario, configuration);
		bot.setDebugMode(false);
		// This is another analysis run that outputs detailed CPU utilization, we
		// usually use it for debugging. This can be done later if
		// necessary, so we do not need it.
		bot.setDetailedAnalysis(false);
		return bot;
	}

	private ConfigurationImprovedImproved createPerformanceConfiguration() {
		ConfigurationImprovedImproved configuration = new ConfigurationImprovedImproved();
		// The number is rather small, but still the improvement is at around 80%. In
		// addition, one run does only need to do small steps if several iterations are
		// applied.
		configuration.getPerOpteryxConfig().setGenerationSize(25);
		configuration.getPerOpteryxConfig().setMaxIterations(7);

		configureCpuClockRate(configuration);

		configuration.getLqnsConfig().setLqnsOutputDir(TestConstants.LQN_OUTPUT);
		configuration.getExporterConfig().setPcmOutputFolder(TestConstants.PCM_STORAGE_PATH);
		configuration.getPcmModelsConfig().setPathmapFolder(TestConstants.PCM_MODEL_FILES);
		return configuration;
	}

	private void configureCpuClockRate(ConfigurationImprovedImproved configuration) {
		DesigndecisionConfigImproved designdecisionConfig = configuration.getDesignDecisionConfig();

		// Set the boundary values for the IDs of the servers
		designdecisionConfig.setLimits("_78qo4K2UEeaxN4gXuIkS2A", 200, 600);
		designdecisionConfig.setLimits("_-5Q84K2UEeaxN4gXuIkS2A", 600, 1600);
		designdecisionConfig.setLimits("_BgmykK2VEeaxN4gXuIkS2A", 350, 1000);
		designdecisionConfig.setLimits("_FM6FMK2VEeaxN4gXuIkS2A", 250, 800);
	}

	@Override
	public List<IFilter> getPreEvaluationFilters() {
		if (preEvaluationFilters == null) {
			preEvaluationFilters = new ArrayList<>();
			preEvaluationFilters.add(new RandomFilter(randomFilterTotalMaximum));
		}
		return preEvaluationFilters;
	}

	@Override
	public Map<String, List<IFilter>> getQAspecificPostEvaluationFilters() {
		if (qaSpecificFilters == null) {
			qaSpecificFilters = new LinkedHashMap<>();
			List<IFilter> modifiabilityFilters = new ArrayList<>();
			modifiabilityFilters.add(new BestCandidatesFilter(maximum_alternatives));
			qaSpecificFilters.put(AbstractPCMBot.QA_MODIFIABILITY, modifiabilityFilters);

			List<IFilter> performanceFilters = new ArrayList<>();
			performanceFilters.add(new CorruptedCandidatesFilter(Float.MAX_VALUE));
			qaSpecificFilters.put(AbstractPCMBot.QA_PERFORMANCE, performanceFilters);
		}
		return qaSpecificFilters;
	}

	@Override
	public List<String> getOrderedQualityAttributes() {
		if (orderedQualityAttributes == null) {
			orderedQualityAttributes = new ArrayList<>();
			orderedQualityAttributes.add(AbstractPCMBot.QA_MODIFIABILITY);
			orderedQualityAttributes.add(AbstractPCMBot.QA_PERFORMANCE);
		}
		return orderedQualityAttributes;
	}

}
