package io.github.squat_team;

import java.util.*;

import io.github.squat_team.agentsUtils.LoadHelper;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.model.PCMTactic;
import io.github.squat_team.utility.NaiveUtilityFunction;
import io.github.squat_team.utility.UtilityComparator;

public class SQuATNegotiator {
	private PCMArchitectureInstance initialArchitecture;
	private List<AbstractPCMBot> bots;
	private List<PCMScenario> scenarios;
	
	//private Map<AbstractPCMBot, PCMScenario> bot2scenarioLinkage;
	
	private List<PCMArchitectureInstance> architectureAlternatives;
	private List<SillyBot> sillyBots;
	
	public SQuATNegotiator(){
		
	}
	public SQuATNegotiator(PCMArchitectureInstance initialArchitecture) {
		this.initialArchitecture = initialArchitecture;
		this.bots = new ArrayList<AbstractPCMBot>();
		this.scenarios = new ArrayList<PCMScenario>();
		//this.bot2scenarioLinkage = new HashMap<AbstractPCMBot, PCMScenario>();
	}
	
	public void addBot(AbstractPCMBot bot) {
		bots.add(bot);
		PCMScenario scenario = bot.getScenario();
		scenarios.add(scenario);
		
		//If the bot contains the scenario, it makes no sense to have the map
		//bot2scenarioLinkage.put(bot, scenario);
	}
	
	public PCMArchitectureInstance negotiate() throws Exception {
		//Create a copy just in case
		PCMArchitectureInstance currentArchitecture = (PCMArchitectureInstance) initialArchitecture.clone();
		
		//Evaluate each scenario with their respective scenario
		List<PCMScenarioResult> currentResults = new ArrayList<PCMScenarioResult>();
		for(AbstractPCMBot bot : bots) {
			PCMScenarioResult result = bot.analyze(currentArchitecture);
			currentResults.add(result);
		}
		
		//Optional: show or output satisfaction of scenarios with current/initial architecture
		//Red (bad) is for results under the threshold for maximization and over the threshold for minimization
		//Yellow is for results near the threshold (useful for negotiation)
		//Green (good) is for results over the threshold for maximization and under the threshold for minimization
		this.displayAnalysis(currentArchitecture, currentResults);
	
		Map<AbstractPCMBot, List<PCMScenarioResult>> alternativesPerBot = new HashMap<AbstractPCMBot, List<PCMScenarioResult>>();
		for(PCMScenarioResult result : currentResults) {
			//Begin analyzing unsatisfied scenarios
			if(result.isSatisfied() < 0) {
				//A bot searches for modifications which will (possible) lead to a better satisfaction of its quality scenario
				AbstractPCMBot bot = result.getOriginatingBot();
				List<PCMScenarioResult> alternatives = bot.searchForAlternatives(currentArchitecture); // ADD A LIMIT
				//In this point, we need to sort the alternatives of each bot either by their response or by using a utility function
				Collections.sort(alternatives, new UtilityComparator(new NaiveUtilityFunction()));
				alternativesPerBot.put(bot, alternatives);
			}
		}
		
		for(AbstractPCMBot bot : alternativesPerBot.keySet()) {
			List<PCMScenarioResult> alternatives = alternativesPerBot.get(bot);
			//Select the best alternative
			PCMScenarioResult bestAlternative = null;
			//Check if there is at least one
			if(alternatives.size() > 0)
				bestAlternative = alternatives.get(0);
			else
				continue;
			//Try to apply the tactic first, else use a diff between the architectures to make the modifications
			PCMArchitectureInstance nextAchitecture;
			PCMTactic tactic = bestAlternative.getAppliedTactic();
			PCMArchitectureInstance initialArchitecture = bestAlternative.getResultingArchitecture();
			PCMArchitectureInstance changedArchitecture = bestAlternative.getResultingArchitecture();
			if(tactic != null)
				nextAchitecture = ArchitectureTransformer.transform(currentArchitecture, tactic);
			else
				nextAchitecture = ArchitectureTransformer.transform(currentArchitecture, initialArchitecture, changedArchitecture);
			//Explore the impact on other bots
			List<PCMScenarioResult> nextResults = new ArrayList<PCMScenarioResult>();
			for(AbstractPCMBot otherBot : alternativesPerBot.keySet()) {
				if(bot != otherBot) {
					PCMScenarioResult nextResult = otherBot.analyze(nextAchitecture);
					nextResults.add(nextResult);
				}
			}
			//Show the effects of applying a tactic of a bot
			this.displayAnalysis(nextAchitecture, nextResults);
			
			//NEGOTIATION
			//I don't understand very well how it works...
			
			//TRADEOFFS?			
		}
		
		return null;
		
	}

	private void displayAnalysis(PCMArchitectureInstance currentArchitecture, List<PCMScenarioResult> results) {
		// TODO Auto-generated method stub
	}
	
	public void negotiateBaseOnMultipleArchitectures(){
		//architectureAlternatives=loadArchitecturalAlternatives(); This should be done for real. Now I'm hardcoding the results
		//Step 1: Collect initial proposals
		HashMap<SillyBot,Proposal> proposals = collectInitialProposals();
		
		//Step 2: Loop until you reach an Agreement or a Conflict
		while(!checkAgreement(proposals)){

			//Select Agent who has to concede
			List<SillyBot> shouldConcede = selectWhoHasToConcede();

			if (shouldConcede.isEmpty()){
				//Step 4: CONFLICT REACHED
				createNegotiationResult(); //conflict 
				return; 
			}				
			else{				
				System.out.println("Step 3.b: Agent/s who has to concede [#= "+ shouldConcede.size()+"]=> "+ shouldConcede.toString());
				
				for (SillyBot concedingAg : shouldConcede){
					//Make "concedingAg" to concede
					Proposal newProposal;
			
					newProposal = concedingAg.makeConcession();//I have to implement this method
						
					System.out.println("Step 3.c: New Proposal made by the agent => "+newProposal.toString());
					//Update proposals map
					proposals.put(concedingAg, newProposal);			
					
				}
			}
		}
		//At this point an agreement should have been found => return it
		printAgreement(proposals);
		
	}

/*	private List<PCMArchitectureInstance> loadArchitecturalAlternatives() {
		// TODO Auto-generated method stub
		return null;
	}*/

	private void printAgreement(HashMap<SillyBot, Proposal> proposals) {
		// TODO Auto-generated method stub
		
	}

	private void createNegotiationResult() {
		// TODO Auto-generated method stub
		
	}

	private List<SillyBot> selectWhoHasToConcede() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean checkAgreement(HashMap<SillyBot, Proposal> proposals) {
		// TODO Auto-generated method stub
		return false;
	}

	private HashMap<SillyBot, Proposal> collectInitialProposals() {
		HashMap<SillyBot, Proposal> ret= new HashMap<>();
		//Each agent has to make a ranking with the alternatives and select the best for its scenario 
		sillyBots=new LoadHelper().loadBotsWithInformation();
		for (Iterator<SillyBot> iterator = sillyBots.iterator(); iterator.hasNext();) {
			SillyBot bot = (SillyBot) iterator.next();
			ret.put(bot, bot.getBestProposal());
		}
		return ret;
	}
	public static void main(String[] args) {
		new SQuATNegotiator().negotiateBaseOnMultipleArchitectures();
	}
}
