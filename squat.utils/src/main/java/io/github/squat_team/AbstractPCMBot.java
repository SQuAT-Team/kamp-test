package io.github.squat_team;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.util.PCMHelper;

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
	protected boolean uniqueTactics;

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
	 * @param uniqueTactics
	 *            specifies whether this bot has unique tactics or uses the same as
	 *            all other bots with the same quality atribute. If false, it is
	 *            sufficient to ask one bot for all new candidates.
	 */
	public AbstractPCMBot(String name, PCMScenario scenario, String qualityAttribute, boolean uniqueTactics) {
		super();
		this.name = name;
		this.scenario = scenario;
		this.qualityAttribute = qualityAttribute;
		this.uniqueTactics = uniqueTactics;
		allQualityAttributes.add(qualityAttribute);
	}

	public String getName() {
		return name;
	}

	public static Set<String> getAllQualityAttributes() {
		return allQualityAttributes;
	}

	/**
	 * Analyzes a {@link PCMArchitectureInstance} and computes a scenario response,
	 * which describes the degree to which the architecture satisfies the bot's
	 * {@link PCMScenario}.
	 * 
	 * @param currentArchitecture
	 *            the architecture to analyze.
	 * @return a response that contains a scenario response value.
	 */
	public abstract PCMScenarioResult analyze(PCMArchitectureInstance currentArchitecture);

	/**
	 * Applies (architectural) tactics and transforms the provided architecture in
	 * order to create alternatives. A bot that {@link #hasUniqueTactics()}, does
	 * usually create other alternatives than another bot with the same
	 * {@link #getQualityAttribute()}.
	 * 
	 * @param currentArchitecture
	 *            the architecture to transform.
	 * @return A result that contains the (analyzed!) alternatives.
	 */
	public abstract List<PCMScenarioResult> searchForAlternatives(PCMArchitectureInstance currentArchitecture);

	/**
	 * Uses the bot specific method to transform a {@link PCMArchitectureInstance}
	 * into an {@link ArchitecturalVersion}. The bot knows the exact format of its
	 * created architectures, so it should also know the way to transform them.
	 * 
	 * @param candidate the candidate to transform
	 * @return the transformed candidate
	 */
	public ArchitecturalVersion transformCandidate(PCMArchitectureInstance candidate) {
		return PCMHelper.createArchitecture(candidate);
	}

	public PCMScenario getScenario() {
		return scenario;
	}

	public void setScenario(PCMScenario scenario) {
		this.scenario = scenario;
	}

	public String getQualityAttribute() {
		return qualityAttribute;
	}

	public boolean hasUniqueTactics() {
		return uniqueTactics;
	}

}
