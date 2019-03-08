package io.github.squat_team;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.PCMScenarioResult;

public abstract class AbstractPCMBot {
	public static final String QA_PERFORMANCE = "performance";
	public static final String QA_MODIFIABILITY = "modifiability";
	public static final String QA_RELIABILITY = "reliability";
	public static final String QA_COST = "cost";
	public static final String QA_SECURITY = "security";
	private static Set<String> allQualityAttributes = new HashSet<>();

	protected String name;
	protected PCMScenario scenario;
	protected String qualityAttribute;

	/**
	 * Initializes a new bot.
	 * 
	 * @param name
	 * @param scenario
	 *            the scenario is usually strongly related to the quality attribute.
	 * @param qualityAttribute
	 *            an unique identifier for the quality attribute. Some are
	 *            predefined, e.g., {@link #QA_PERFORMANCE}, but any other String
	 *            can be used as long as the bots use them consistently.
	 */
	public AbstractPCMBot(String name, PCMScenario scenario, String qualityAttribute) {
		super();
		this.name = name;
		this.scenario = scenario;
		this.qualityAttribute = qualityAttribute;
		allQualityAttributes.add(qualityAttribute);
	}

	public String getName() {
		return name;
	}

	public static Set<String> getAllQualityAttributes() {
		return allQualityAttributes;
	}

	public abstract PCMScenarioResult analyze(PCMArchitectureInstance currentArchitecture);

	public abstract List<PCMScenarioResult> searchForAlternatives(PCMArchitectureInstance currentArchitecture);

	public PCMScenario getScenario() {
		return scenario;
	}

	public void setScenario(PCMScenario scenario) {
		this.scenario = scenario;
	}

	public String getQualityAttribute() {
		return qualityAttribute;
	}

}
