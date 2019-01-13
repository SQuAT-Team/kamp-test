package io.github.squat_team.runner;

import java.util.HashSet;
import java.util.Set;

import io.github.squat_team.export.ExporterType;

public class SQuATConfiguration {
	private static final String DEFAULT_MODEL_FILE_NAME = "cocome-cloud";
	private static final String DEFAULT_MODEL_PATH = "models/cocomeWithResourceDemands";
	//private static final String DEFAULT_ALTERNATIVE_REPOSITORY_FULL_PATH = "/Users/santiagovidal/Documents/Programacion/kamp-test/squat-tool/models/cocomeWithResourceDemands/alternativeRepository.repository";
	private static final String DEFAULT_ALTERNATIVE_REPOSITORY_FULL_PATH = "/home/rss/git/kamp-test/squat-tool/models/cocomeWithResourceDemands/alternativeRepository.repository";

	private int maxNumberOfLevels;
	private Set<ExporterType> exporters = new HashSet<>();

	private String modelFileName;
	private String modelPath;
	private String alternativeRepositoryFullPath;

	public static SQuATConfiguration generateDefault() {
		SQuATConfiguration configuration = new SQuATConfiguration();

		configuration.setModelFileName(DEFAULT_MODEL_FILE_NAME);
		configuration.setModelPath(DEFAULT_MODEL_PATH);
		configuration.setAlternativeRepositoryFullPath(DEFAULT_ALTERNATIVE_REPOSITORY_FULL_PATH);

		configuration.setMaxNumberOfLevels(2); // TODO: 3!
		configuration.getExporters().add(ExporterType.CONSOLE);
		configuration.getExporters().add(ExporterType.EXCEL);
		return configuration;
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
	};

}
