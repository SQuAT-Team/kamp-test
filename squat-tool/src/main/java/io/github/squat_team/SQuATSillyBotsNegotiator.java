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

public class SQuATSillyBotsNegotiator {

	//private List<PCMArchitectureInstance> architectureAlternatives;
	private List<SillyBot> sillyBots;
	private Proposal agreementProposal;
	
	public SQuATSillyBotsNegotiator(){
		agreementProposal=null;
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
		System.out.println("Agreement achieved!!!!!");
		System.out.println("Agreement: "+agreementProposal);
		printCurrentState();
	}

	private void createNegotiationResult() {
		System.out.println("Conflict.");
		printCurrentState();
	}

	private void printCurrentState() {
		for (Iterator<SillyBot> iterator = sillyBots.iterator(); iterator.hasNext();) {
			SillyBot bot = (SillyBot) iterator.next();
			System.out.print(bot.toString());
			System.out.print(" Current proposal "+ bot.getCurrentProposal());
			String acceptedProposals=" AcceptedProposals: ";
			List<SillyBot> otherAgents = new ArrayList<>(sillyBots); 
			otherAgents.remove(bot);
			for (Iterator<SillyBot> iterator2 = otherAgents.iterator(); iterator2.hasNext();) {
				SillyBot bot2 = (SillyBot) iterator2.next();
				if(bot.acceptableUtilityValue(bot2.getCurrentProposal()))
					acceptedProposals=acceptedProposals+bot2.toString()+" ";
			}
			System.out.println(acceptedProposals);
		}
	}


	private List<SillyBot> selectWhoHasToConcede() {
		List<SillyBot> shouldConcede=new ArrayList<>();
		List<SillyBot> concedingAgents=getAgentsThatCanConcede();
		if (concedingAgents.size() > 1){
			SillyBot agMin = null;
			double minZi = Double.POSITIVE_INFINITY;

			//String zis = "";
			for (SillyBot ag : concedingAgents){
				double agZi = this.getZiFor(ag, sillyBots);
			//	zis+= ag.getID()+"= "+agZi+", ";
				if (agZi <= minZi && agZi != Double.POSITIVE_INFINITY){ //agZi != Double.POSITIVE_INFINITY just in case, we should never need this check if the agents in "agents" list can concede. 
					if (agZi == minZi && agMin != null) //if A and B have the same Zi => store A in the list of agents who should concede, and now B is the agMin.
						shouldConcede.add(agMin);
					else //agZi < minZi
						shouldConcede.clear(); //clear the list because there is a new minimum
					minZi = agZi;
					agMin = ag;
				}
			}
			shouldConcede.add(agMin); //the "last" minimum should be added to the list. If there were other agents with the same Zi as the agMin then they were added to the shouldConcede list. 
			//logger.info(">> Zi's: "+zis);
		}
		else if (concedingAgents.size() == 1)
			shouldConcede.add(concedingAgents.get(0));
		
		return shouldConcede;

	}
	/**WillingnessToRiskConflictStrategy (WRC)
	 * @param ag
	 * @param sillyBots2
	 * @return
	 */
	private double getZiFor(SillyBot myAgent, List<SillyBot> allAgents) {
		List<SillyBot> otherAgents = new ArrayList<>(allAgents); 
		otherAgents.remove(myAgent);
		
		double myUtility;
		
		myUtility = myAgent.getUtilityFor(myAgent.getCurrentProposal());
		
		if (myUtility == 0)
			return 1;
		else			
			return ((myUtility - selectMinUtilityProposal(myAgent, otherAgents))/myUtility); //zi
	}
	
	private double selectMinUtilityProposal (SillyBot myAgent, List<SillyBot> otherAgents){
		double minUtility = Double.POSITIVE_INFINITY;
		
		for (SillyBot ag : otherAgents){
			Proposal otherAgProp = ag.getCurrentProposal();
			if (myAgent.getUtilityFor(otherAgProp) < minUtility){
				minUtility = myAgent.getUtilityFor(otherAgProp);
			}
		}

		return minUtility;

	}

	private List<SillyBot> getAgentsThatCanConcede() {
		List<SillyBot> ret=new ArrayList<>();
		for (Iterator<SillyBot> iterator = sillyBots.iterator(); iterator.hasNext();) {
			SillyBot bot = (SillyBot) iterator.next();
			if(bot.canConcede())
				ret.add(bot);
		}
		return ret;
	}
	/**
	 * Checks if there is an agreement (between the agents) for one of the proposals 
	 * @param proposals
	 * @return
	 */
	private boolean checkAgreement(HashMap<SillyBot, Proposal> proposals) {
		for (Iterator<Proposal> iterator = proposals.values().iterator(); iterator.hasNext();) {
			Proposal proposal = (Proposal) iterator.next();
			if(checkAgreementForAgents(proposal)){
				agreementProposal=proposal;
				return true;
			}
		}
		return false;
	}

	private boolean checkAgreementForAgents(Proposal proposal) {
		for (Iterator<SillyBot> iterator = sillyBots.iterator(); iterator.hasNext();) {
			SillyBot sillyBot = (SillyBot) iterator.next();
			if(!sillyBot.acceptableUtilityValue(proposal))
				return false;
		}
		return true;
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
		new SQuATSillyBotsNegotiator().negotiateBaseOnMultipleArchitectures();
	}
}