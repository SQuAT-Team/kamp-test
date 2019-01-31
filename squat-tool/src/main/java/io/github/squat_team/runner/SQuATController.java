package io.github.squat_team.runner;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.LoadHelper;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.agentsUtils.transformations.ArchitecturalTransformationsFactory;
import io.github.squat_team.export.ExportController;
import io.github.squat_team.negotiation.ISQuATNegotiator;
import io.github.squat_team.negotiation.NegotiatorResult;
import io.github.squat_team.negotiation.SQuATSillyBotsNegotiator;

public class SQuATController {

	private SQuATConfiguration configuration;
	private ExportController exporter = new ExportController();
	private List<SillyBot> sillyBots;
	private int currentLevelOfTransformations;
	private ArchitecturalTransformationsFactory archTransFactory;
	private boolean noMoreAlternatives;

	public SQuATController(SQuATConfiguration configuration) {
		this.configuration = configuration;
		this.exporter.register(configuration.getExporters());
		this.archTransFactory = new ArchitecturalTransformationsFactory(configuration);
		this.currentLevelOfTransformations = 1;
		this.noMoreAlternatives = false;
	}

	public ArchitecturalTransformationsFactory getArchTransFactory() {
		return archTransFactory;
	}

	public void negotiatiateUntilAnAgreementIsReached() {
		ISQuATNegotiator negotiator = configuration.getNegotiatorFactory().getNegotiator(exporter);

		boolean agreement = false;
		while (!agreement && (currentLevelOfTransformations <= configuration.getMaxNumberOfLevels())
				&& !noMoreAlternatives) {
			sillyBots = collectInitialProposals();
			negotiator.initialize(sillyBots);
			NegotiatorResult negotiatorResult = negotiator.negotiate();

			boolean redoRequest = true;
			while (redoRequest && negotiatorResult.isSuccessful()) {
				redoRequest = askUserForRedo(negotiatorResult);
				negotiatorResult = negotiator.negotiate();
			}

			exporter.handleLevelTerminated(negotiatorResult);
			if (configuration.shouldFilterBestAlternatives()) {
				filterBestKAlternatives(configuration.getSeedSelectionSize());
			}
			currentLevelOfTransformations++;
		}
		System.out.println("Finish");
	}

	private boolean askUserForRedo(NegotiatorResult result) {
		System.out.println("Agreement: " + result.getAgreementProposal());
		exporter.handleIntermediateResult(result);
		System.out.println("REDO? (Y/N): ");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next();
		scan.close();
		return answer.trim().toUpperCase().equals("Y");
		// scan.close();
	}

	private void filterBestKAlternatives(int k) {
		Set<Proposal> proposalsForNextRound = new HashSet<>();

		// Each agent has to make a ranking with the alternatives and select the best K
		// for its scenario
		for (SillyBot sillyBot : sillyBots) {
			List<Proposal> filteredProposals = sillyBot.getOrderedProposals().subList(0, k);
			System.out.println(sillyBot);
			for (Proposal proposal : filteredProposals) {
				System.out.println(proposal);
			}
			proposalsForNextRound.addAll(filteredProposals);
		}
		// I replace all the alternatives generated in
		// ArchitecturalTransformationsFactory by this subset
		archTransFactory.replaceTransformationsForLevel(currentLevelOfTransformations, proposalsForNextRound);
	}

	private List<SillyBot> collectInitialProposals() {
		// REMOVE THIS FIRST LINE. IT ONLY PURPOSES IS TO AVOID THE MODIFIABILITY
		// TACTICS THAT ARE NOT WORKING WITH THE COMPOSITE COMPONETS
		// new LoadHelper().loadBotsForArchitecturalAlternatives(new
		// ArrayList<ArchitecturalVersion>(),archTransFactory.getInitialArchitecture());
		List<SillyBot> sillyBots = null;
		System.out.println("Level of transformations: " + currentLevelOfTransformations);
		List<ArchitecturalVersion> versionsUntilLevel = archTransFactory
				.getArchitecturalTransformationsUntilLevel(currentLevelOfTransformations);
		List<ArchitecturalVersion> versionsForLevel = archTransFactory
				.transformationsForLevel(currentLevelOfTransformations);

		if (versionsForLevel.size() == 0) {
			noMoreAlternatives = true;
		} else {
			System.out.println("Intial Proposals");

			// Each agent has to make a ranking with the alternatives and select the best
			// for its scenario
			sillyBots = new LoadHelper(configuration).loadBotsForArchitecturalAlternatives(versionsUntilLevel,
					archTransFactory.getInitialArchitecture());
			System.out.println("Total proposals: " + sillyBots.get(0).getOrderedProposals().size());
		}
		printTopAlternativesForBot(10, sillyBots);
		return sillyBots;
	}

	private void printTopAlternativesForBot(int topX, List<SillyBot> sillyBots) {
		for (SillyBot sillyBot : sillyBots) {
			List<Proposal> proposals = sillyBot.getOrderedProposals();
			for (int i = 0; i < topX; i++) {
				Proposal p = proposals.get(i);
				System.out.print(p.getArchitectureName() + "\t" + p.getScenarioResponse() + "\t"
						+ sillyBot.getUtilityFor(p) + "\t" + (i + 1) + "\t");
				for (SillyBot sillyBot2 : sillyBots) {
					if (sillyBot != sillyBot2) {
						Proposal pForBot2 = sillyBot2.getProposalForArchitecture(p.getArchitectureName());
						System.out.print(pForBot2.getScenarioResponse() + "\t" + sillyBot2.getUtilityFor(pForBot2)
								+ "\t" + (sillyBot2.getOrderedProposals().indexOf(pForBot2) + 1) + "\t");
					}
				}
				System.out.println();
			}

		}

	}

}
