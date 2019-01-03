package io.github.squat_team.export;

import java.util.List;

import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.negotiation.NegotiatorResult;

/**
 * Prints the results in an excel compatible format with tab separated values to
 * the command line.
 */
public class ExcelExporter implements IExporter {

	@Override
	public void handleLevelTerminated(NegotiatorResult result) {
		if (result.isSuccessful()) {
			printForExcel(result);
		}
	}

	private void printForExcel(NegotiatorResult result) {
		List<SillyBot> bots = result.getSillyBots();
		Proposal agreementProposal = result.getAgreementProposal();

		System.out.print(
				agreementProposal.getArchitectureName() + "\t" + bots.get(0).getOrderedProposals().size() + "\t");
		for (SillyBot bot : bots) {
			printForOneBot(bot, agreementProposal);
		}
		System.out.println();
	}

	private void printForOneBot(SillyBot bot, Proposal agreementProposal) {
		Proposal p = bot.getProposalForArchitecture(agreementProposal.getArchitectureName());
		System.out.print((bot.getOrderedProposals().indexOf(p) + 1) + "\t" + p.getScenarioResponse() + "\t"
				+ bot.getUtilityFor(p) + "\t");
	}

	@Override
	public void handleIntermediateResult(NegotiatorResult result) {
		// do nothing
	}

	@Override
	public void handleIntermediateState(NegotiatorResult state) {
		printForExcel(state);
	}
}
