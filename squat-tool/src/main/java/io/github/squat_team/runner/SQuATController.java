package io.github.squat_team.runner;

import java.util.ArrayList;
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
import io.github.squat_team.util.AlternativesRegistry;
import io.github.squat_team.util.TimeMeasurement;

public class SQuATController {

	private SQuATConfiguration configuration;
	private ExportController exporter = new ExportController();
	private List<SillyBot> sillyBots;
	private int currentLevelOfTransformations;
	private ArchitecturalTransformationsFactory archTransFactory;
	private boolean noMoreAlternatives;

	private List<Proposal> agreementsOfLevel;
	private Set<Proposal> proposalsForNextRound;
	
	public SQuATController(SQuATConfiguration configuration) {
		this.configuration = configuration;
		this.exporter.register(configuration.getExporters());
		this.archTransFactory = new ArchitecturalTransformationsFactory(configuration,
				configuration.createInitialArchitecture());
		this.currentLevelOfTransformations = 1;
		this.noMoreAlternatives = false;
	}

	public ArchitecturalTransformationsFactory getArchTransFactory() {
		return archTransFactory;
	}

	public List<NegotiatorResult> negotiatiateUntilAnAgreementIsReached() {
		ISQuATNegotiator negotiator = configuration.getNegotiatorFactory().getNegotiator(exporter);
		List<NegotiatorResult> negotiatorResultsForLevels = new ArrayList<>();
		NegotiatorResult negotiatorResult = null;

		boolean agreement = false;
		while (shouldRepeat(agreement)) {
			agreementsOfLevel = new ArrayList<>();
			sillyBots = collectInitialProposals();
			negotiator.initialize(sillyBots);
			negotiatorResult = negotiator.negotiate(false);
			agreement = negotiatorResult.isSuccessful();

			boolean redoRequest = askUserForRedo(negotiatorResult);
			TimeMeasurement.getInstace().printFinish("negotiation (with agreement)");
			agreementsOfLevel.add(negotiatorResult.getAgreementProposal());
			while (redoRequest && agreement) {
				negotiatorResult = negotiator.negotiate(true);
				agreement = negotiatorResult.isSuccessful();
				redoRequest = askUserForRedo(negotiatorResult);
				TimeMeasurement.getInstace().printFinish("negotiation (with agreement)");
				agreementsOfLevel.add(negotiatorResult.getAgreementProposal());
			}

			negotiatorResultsForLevels.add(negotiatorResult);

			exporter.handleLevelTerminated(negotiatorResult);
			
 			AlternativesRegistry.getInstace().saveAlternatives(sillyBots,agreementsOfLevel,currentLevelOfTransformations, proposalsForNextRound);
			if (configuration.shouldFilterBestAlternatives()) {
				filterBestKAlternatives(configuration.getSeedSelectionSize());
			}

			currentLevelOfTransformations++;
		}
		System.out.println("Finish");
		return negotiatorResultsForLevels;
	}

	private boolean shouldRepeat(boolean agreement) {
		boolean agreementCheck = !agreement || configuration.shouldSearchAllLevels();
		boolean levelCheck = currentLevelOfTransformations <= configuration.getMaxNumberOfLevels();
		boolean newResultsCheck = !noMoreAlternatives;

		return agreementCheck && levelCheck && newResultsCheck;
	}

	private boolean askUserForRedo(NegotiatorResult result) {
		if (!configuration.shouldAskUserForRedo()) {
			return false;
		}
		System.out.println("Agreement: " + result.getAgreementProposal());
		exporter.handleIntermediateResult(result);
		System.out.println("REDO? (Y/N): ");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next();
		return answer.trim().toUpperCase().equals("Y");
		// scan.close();
	}

	private void filterBestKAlternatives(int k) {
		proposalsForNextRound = new HashSet<>();

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
			sillyBots = new LoadHelper(configuration, archTransFactory).loadBotsForArchitecturalAlternatives(versionsUntilLevel,
					archTransFactory.getInitialArchitecture(), currentLevelOfTransformations);
			System.out.println("Total proposals: " + sillyBots.get(0).getOrderedProposals().size());
		}
		printTopAlternativesForBot(10, sillyBots);
		return sillyBots;
	}

	private void printTopAlternativesForBot(int topX, List<SillyBot> sillyBots) {
		for (SillyBot sillyBot : sillyBots) {
			List<Proposal> proposals = sillyBot.getOrderedProposals();
			for (int i = 0; i < Math.min(topX, proposals.size()); i++) {
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
