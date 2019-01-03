package io.github.squat_team.export;

import java.util.ArrayList;
import java.util.List;

import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.negotiation.NegotiatorResult;

/**
 * Prints the results in an human-readable format to the command line.
 */
public class ConsoleExporter implements IExporter {

	@Override
	public void handleLevelTerminated(NegotiatorResult result) {
		if (result.isSuccessful()) {
			handleLevelTerminatedSuccessfully(result);
		} else {
			handleLevelTerminatedWithConflict(result);
		}
	}

	@Override
	public void handleIntermediateResult(NegotiatorResult result) {
		printCurrentState(result.getAgreementProposal(), result.getSillyBots());
	}

	private void handleLevelTerminatedSuccessfully(NegotiatorResult result) {
		System.out.println("Agreement achieved!!!!!");
		System.out.println("Agreement: " + result.getAgreementProposal());
		printCurrentState(result.getAgreementProposal(), result.getSillyBots());
		printNonDominatedAlternatives(result.getNonDominatedAlternatives());
	}

	private void handleLevelTerminatedWithConflict(NegotiatorResult result) {
		System.out.println("Conflict.");
		printCurrentState(result.getAgreementProposal(), result.getSillyBots()); // proposal is null
	}

	private void printNonDominatedAlternatives(List<Proposal> nonDominatedAlternatives) {
		System.out.println("Non dominated alternatives");
		for (Proposal proposal : nonDominatedAlternatives) {
			System.out.println(proposal);
		}
	}

	public void printCurrentState(Proposal agreementProposal, List<SillyBot> bots) {
		for (SillyBot bot : bots) {
			System.out.print(bot.toString());
			System.out.print(" Current proposal " + bot.getCurrentProposal() + " ("
					+ (bot.getCurrentConcessionIndex() + 1) + ") ");
			String acceptedProposals = " AcceptedProposals: ";
			List<SillyBot> otherAgents = new ArrayList<>(bots);
			otherAgents.remove(bot);
			for (SillyBot otherBot : otherAgents) {
				if (bot.acceptableUtilityValue(otherBot.getCurrentProposal()))
					acceptedProposals = acceptedProposals + otherBot.toString() + " ";
			}
			System.out.println(acceptedProposals);
			if (agreementProposal != null) {
				System.out.println("Index of agreement proposal: "
						+ bot.getIndexForArchitecture(agreementProposal.getArchitectureName()));
				System.out.println(
						"Utility function for bot: " + bot.getUtilityFor(agreementProposal.getArchitectureName()));
			}
		}
	}

	@Override
	public void handleIntermediateState(NegotiatorResult state) {
		// do nothing
	}

}
