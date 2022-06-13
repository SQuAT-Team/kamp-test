package io.github.squat_team.agentsUtils;

import java.util.ArrayList;
import java.util.List;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.runner.SQuATConfiguration;
import io.github.squat_team.util.PCMHelper;

public class InitialArchitectureAnalyzer {
	private final SQuATConfiguration configuration;

	public InitialArchitectureAnalyzer(SQuATConfiguration configuration) {
		this.configuration = configuration;
	}

	public void analyzeInitial(ArchitecturalVersion initialArchitecture, List<AbstractPCMBot> bots) {
		PCMArchitectureInstance architecture = PCMHelper.createArchitecture(initialArchitecture);

		List<SillyBot> sillyBots = new ArrayList<>();
		List<Proposal> agreementProposals = new ArrayList<>();
		
		for (AbstractPCMBot bot : bots) {			
			Float response = getResponseValue(bot, architecture);			
			SillyBot sillyBot = new SillyBot(bot, configuration);
			Proposal proposal = new Proposal(initialArchitecture, response , initialArchitecture.getName(), 0, "");
			sillyBot.insertInOrder(proposal);
			sillyBots.add(sillyBot);
			agreementProposals.add(proposal);
		}
	}

	private float getResponseValue(AbstractPCMBot bot, PCMArchitectureInstance architecture) {
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
