package io.github.squat_team.runner;

import java.util.HashSet;
import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.concessionStrategies.DesiredDistanceFactory;
import io.github.squat_team.agentsUtils.concessionStrategies.IConcessionStrategyFactory;
import io.github.squat_team.export.ExporterType;
import io.github.squat_team.negotiation.SQuATSillyBotsNegotiatorFactory;

public class SQuATConfiguration {
	private static final String DEFAULT_MODEL_FILE_NAME = "cocome-cloud";
	private static final String DEFAULT_MODEL_PATH = "models/cocomeWithResourceDemands";
	// private static final String DEFAULT_ALTERNATIVE_REPOSITORY_FULL_PATH =
	// "/Users/santiagovidal/Documents/Programacion/kamp-test/squat-tool/models/cocomeWithResourceDemands/alternativeRepository.repository";
	private static final String DEFAULT_ALTERNATIVE_REPOSITORY_FULL_PATH = "/home/rss/git/kamp-test/squat-tool/models/cocomeWithResourceDemands/alternativeRepository.repository";

	private int maxNumberOfLevels;

	private Set<ExporterType> exporters = new HashSet<>();

	private SQuATSillyBotsNegotiatorFactory negotiatorFactory;

	private boolean searchAllLevels;
	private boolean shouldAskUserForRedo;
	private boolean filterBestAlternatives;
	private int seedSelectionSize;

	private String modelFileName;
	private String modelPath;
	private String alternativeRepositoryFullPath;
	
	private IConcessionStrategyFactory concessionStrategyFactory;

	public static SQuATConfiguration generateDefault() {
		SQuATConfiguration configuration = new SQuATConfiguration();
		
		configuration.setAskUserForRedo(true);
		configuration.setSearchAllLevels(false);

		configuration.setModelFileName(DEFAULT_MODEL_FILE_NAME);
		configuration.setModelPath(DEFAULT_MODEL_PATH);
		configuration.setAlternativeRepositoryFullPath(DEFAULT_ALTERNATIVE_REPOSITORY_FULL_PATH);

		configuration.setFilterBestAlternatives(true);
		configuration.setSeedSelectionSize(2);
		configuration.setMaxNumberOfLevels(3);
		configuration.getExporters().add(ExporterType.CONSOLE);
		configuration.getExporters().add(ExporterType.EXCEL);

		configuration.setNegotiatorFactory(new SQuATSillyBotsNegotiatorFactory());
		configuration.setConcessionStrategyFactory(new DesiredDistanceFactory());

		return configuration;
	}

	public int getSeedSelectionSize() {
		return seedSelectionSize;
	}

	/**
	 * Specifies the amount of candidates that each bot should take to the next
	 * level. The bot will select the best candidates for this task and discard all
	 * others. This parameter is only used if
	 * {@link #setFilterBestAlternatives(boolean)} is set to true.
	 * 
	 * @param seedSelectionSize
	 */
	public void setSeedSelectionSize(int seedSelectionSize) {
		this.seedSelectionSize = seedSelectionSize;
	}

	public SQuATSillyBotsNegotiatorFactory getNegotiatorFactory() {
		return negotiatorFactory;
	}

	public void setNegotiatorFactory(SQuATSillyBotsNegotiatorFactory negotiatorFactory) {
		this.negotiatorFactory = negotiatorFactory;
	}

	public int getMaxNumberOfLevels() {
		return maxNumberOfLevels;
	}

	public void setMaxNumberOfLevels(int maxNumberOfLevels) {
		this.maxNumberOfLevels = maxNumberOfLevels;
	}

	public Set<ExporterType> getExporters() {
		return exporters;
	}

	public String getAlternativeRepositoryFullPath() {
		return alternativeRepositoryFullPath;
	}

	public void setAlternativeRepositoryFullPath(String alternativeRepositoryFullPath) {
		this.alternativeRepositoryFullPath = alternativeRepositoryFullPath;
	}

	public String getModelPath() {
		return modelPath;
	}

	public void setModelPath(String modelPath) {
		this.modelPath = modelPath;
	}

	public String getModelFileName() {
		return modelFileName;
	}

	public void setModelFileName(String modelFileName) {
		this.modelFileName = modelFileName;
	}

	public boolean shouldFilterBestAlternatives() {
		return filterBestAlternatives;
	}

	public void setFilterBestAlternatives(boolean filterBestAlternatives) {
		this.filterBestAlternatives = filterBestAlternatives;
	};
	

	public ArchitecturalVersion createInitialArchitecture() {
		ArchitecturalVersion initialArchitecture = new ArchitecturalVersion(this.getModelFileName(),
				this.getModelPath(), "");
		initialArchitecture.setFullPathToAlternativeRepository(this.getAlternativeRepositoryFullPath());
		return initialArchitecture;
	}

	public boolean shouldAskUserForRedo() {
		return shouldAskUserForRedo;
	}

	public void setAskUserForRedo(boolean shouldAskUserForRedo) {
		this.shouldAskUserForRedo = shouldAskUserForRedo;
	}

	public boolean shouldSearchAllLevels() {
		return searchAllLevels;
	}

	public void setSearchAllLevels(boolean searchAllLevels) {
		this.searchAllLevels = searchAllLevels;
	}

	public IConcessionStrategyFactory getConcessionStrategyFactory() {
		return concessionStrategyFactory;
	}

	public void setConcessionStrategyFactory(IConcessionStrategyFactory concessionStrategyFactory) {
		this.concessionStrategyFactory = concessionStrategyFactory;
	}
}
