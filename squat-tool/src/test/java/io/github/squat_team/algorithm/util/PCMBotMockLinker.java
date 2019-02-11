package io.github.squat_team.algorithm.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.powermock.api.mockito.PowerMockito;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.agentsUtils.ArchitecturalCopyCreator;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.model.PCMTactic;
import io.github.squat_team.util.PCMHelper;

import static org.mockito.Mockito.*;

/**
 * Links the optimization results returned by
 * {@link AbstractPCMBot#searchForAlternatives(PCMArchitectureInstance)} to
 * other (mocked) bots. As a result, these bots are able to analyze the
 * candidates found by the originating bot.
 */
public class PCMBotMockLinker {
	private PCMBotMockBuilderResult originatingBot;
	private List<PCMScenarioResult> originatingBotResponses;
	private Map<PCMBotMockBuilderResult, List<Comparable>> responses;
	private Map<PCMBotMockBuilderResult, List<PCMTactic>> tactics = new HashMap<PCMBotMockBuilderResult, List<PCMTactic>>();

	public PCMBotMockLinker(PCMBotMockBuilderResult originalBot, PCMArchitectureInstance initialArchitecture) {
		this.originatingBot = originalBot;
		this.originatingBotResponses = originalBot.getBot().searchForAlternatives(initialArchitecture);
	}

	private static ArchitecturalCopyCreator COPY_CREATOR_INSTANCE = null;
	private static ArchitecturalCopyCreator getCopyCrator() {
		if(COPY_CREATOR_INSTANCE == null) {
			PowerMockito.mockStatic(ArchitecturalCopyCreator.class);
			COPY_CREATOR_INSTANCE = mock(ArchitecturalCopyCreator.class);
			when(ArchitecturalCopyCreator.getInstance()).thenReturn(COPY_CREATOR_INSTANCE);
		}
		return COPY_CREATOR_INSTANCE;
	}
	
	public static ArchitecturalVersion generateArchitecturalVersion(PCMArchitectureInstance architecture,
			String lastModifiedBy) {
		ArchitecturalVersion architecturalVersion = new ArchitecturalVersion(architecture.getName(), "aPath", "");
		link(architecture, architecturalVersion);
		return architecturalVersion;
	}

	private static void link(PCMArchitectureInstance pcmArchitecture, ArchitecturalVersion architectureAsVersion) {
		when(PCMHelper.createArchitecture(architectureAsVersion)).thenReturn(pcmArchitecture);
		when(PCMHelper.createArchitecture(pcmArchitecture)).thenReturn(architectureAsVersion);
		ArchitecturalCopyCreator copyCreator = getCopyCrator();
		when(copyCreator.copy(eq(pcmArchitecture), any())).thenReturn(architectureAsVersion);
	}

	public void setResponses(Map<PCMBotMockBuilderResult, List<Comparable>> responses) {
		this.responses = responses;
	}

	public void setTactics(Map<PCMBotMockBuilderResult, List<PCMTactic>> tactics) {
		this.tactics = tactics;
	}

	public void link() {
		checkValid();
		linkBots();
	}

	private void linkBots() {
		for (PCMBotMockBuilderResult bot : responses.keySet()) {
			if (tactics.containsKey(bot)) {
				linkBotWithTactics(bot);
			} else {
				linkBotWithoutTactics(bot);
			}
		}
	}

	private PCMResult mockResult(PCMBotMockBuilderResult bot, Comparable response) {
		PCMResult result = mock(PCMResult.class);
		when(result.getResponse()).thenReturn(response);
		when(result.getResponseMeasureType()).thenReturn(bot.getProperties().getResponseMeasureType());
		return result;
	}

	private PCMScenarioResult mockScenarioResult(PCMResult result, PCMTactic tactic) {
		PCMScenarioResult scenarioResult = mock(PCMScenarioResult.class);
		when(scenarioResult.getResult()).thenReturn(result);
		when(scenarioResult.getAppliedTactic()).thenReturn(tactic);
		return scenarioResult;
	}

	private PCMArchitectureInstance mockArchitecture(PCMBotMockBuilderResult bot,
			PCMArchitectureInstance originalBotArchitecture) {
		PCMArchitectureInstance architecture = null;
		if (bot.getProperties().isReturnArchitectures()) {
			if (originalBotArchitecture == null) {
				throw new RuntimeException("No original bot response available");
			}
			architecture = originalBotArchitecture;
		}
		return architecture;
	}

	private void mockBotResults(PCMBotMockBuilderResult bot, PCMScenarioResult scenarioResult,
			PCMArchitectureInstance architecture, PCMArchitectureInstance originalBotArchitecture) {
		when(scenarioResult.getResultingArchitecture()).thenReturn(architecture);
		when(scenarioResult.getOriginatingBot()).thenReturn(bot.getBot());
		when(bot.getBot().analyze(originalBotArchitecture)).thenReturn(scenarioResult);
		when(bot.getBot().analyze(originalBotArchitecture, null)).thenReturn(scenarioResult);
		when(bot.getBot().analyze(eq(originalBotArchitecture), anyString())).thenReturn(scenarioResult);
	}

	private void linkBotWithTactics(PCMBotMockBuilderResult bot) {
		for (int i = 0; i < originatingBotResponses.size(); i++) {
			PCMResult result = mockResult(bot, responses.get(bot).get(i));
			PCMTactic tactic = tactics.get(bot).get(i);
			PCMScenarioResult scenarioResult = mockScenarioResult(result, tactic);

			PCMArchitectureInstance originalBotArchitecture = originatingBotResponses.get(i).getResultingArchitecture();
			PCMArchitectureInstance architecture = mockArchitecture(bot, originalBotArchitecture);

			mockBotResults(bot, scenarioResult, architecture, originalBotArchitecture);
		}
	}

	private void linkBotWithoutTactics(PCMBotMockBuilderResult bot) {
		for (int i = 0; i < originatingBotResponses.size(); i++) {
			PCMResult result = mockResult(bot, responses.get(bot).get(i));
			PCMScenarioResult scenarioResult = mockScenarioResult(result, null);

			PCMArchitectureInstance originalBotArchitecture = originatingBotResponses.get(i).getResultingArchitecture();
			PCMArchitectureInstance architecture = mockArchitecture(bot, originalBotArchitecture);

			mockBotResults(bot, scenarioResult, architecture, originalBotArchitecture);
		}
	}

	// origBot, other bots, other results
	private void checkValid() {
		if (!responsesValid()) {
			throw new IllegalArgumentException("Failed: wrong responses size or not set");
		}
		if (!tacticsValid()) {
			throw new IllegalArgumentException("Failed: wrong tactics size or not set");
		}
	}

	private boolean responsesValid() {
		if (responses == null) {
			return false;
		}
		for (PCMBotMockBuilderResult bot : responses.keySet()) {
			if (responses.get(bot).size() != originatingBotResponses.size()) {
				return false;
			}
		}
		return true;
	}

	private boolean tacticsValid() {
		if (tactics == null) {
			return false;
		}
		for (PCMBotMockBuilderResult bot : responses.keySet()) {
			if (responses.get(bot).size() != originatingBotResponses.size()) {
				return false;
			}
		}
		return true;
	}
}
