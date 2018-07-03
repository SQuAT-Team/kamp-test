package io.github.squat_team;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.LoadHelper;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.agentsUtils.SillyBot;
import io.github.squat_team.agentsUtils.transformations.ArchitecturalTransformationsFactory;

public class PureSearch {
	private List<SillyBot> sillyBots;
	private int currentLevelOfTransformations;
	private ArchitecturalTransformationsFactory archTransFactory;
	private int maxNumberOfLevels;
	private boolean noMoreAlternatives;
	
	public PureSearch() {
		archTransFactory=new ArchitecturalTransformationsFactory();
		currentLevelOfTransformations=1;
		noMoreAlternatives=false;
	}
	
	
	
	private void searchUntilLevel(int i) {
		maxNumberOfLevels=i;
		while((currentLevelOfTransformations<=maxNumberOfLevels)&&(!noMoreAlternatives)){
			createAlternativesForLevel();
			if(!noMoreAlternatives){
				filerBestKAlternatives(10);
				currentLevelOfTransformations++;
			}
		}
		printResults();//tal vez falte un map con los elegidos en cada nivel
	}

	private void printResults() {
		System.out.println("Termine");
	}



	private void createAlternativesForLevel() {
		System.out.println("Level of transformations: "+ currentLevelOfTransformations);
		List<ArchitecturalVersion> versionsUntilLevel=archTransFactory.getArchitecturalTransformationsUntilLevel(currentLevelOfTransformations);
		List<ArchitecturalVersion> versionsForLevel=archTransFactory.transformationsForLevel(currentLevelOfTransformations);
		if(versionsForLevel.size()==0){
			noMoreAlternatives=true;
		}else{
			System.out.println("Proposals for level");
			
			sillyBots=new LoadHelper().loadBotsForArchitecturalAlternatives(versionsUntilLevel,archTransFactory.getInitialArchitecture(),null);
			System.out.println("Total proposals: "+sillyBots.get(0).getOrderedProposals().size());
		}
	}

	private void filerBestKAlternatives(int k) {
		Set<Proposal> proposalsForNextRound=new HashSet<>(); 
		
		//Each agent has to make a ranking with the alternatives and select the best K for its scenario 
		for (SillyBot sillyBot : sillyBots) {
			Collections.sort(sillyBot.getOrderedProposals(), new Comparator<Proposal>(){
				@Override
			    public int compare(Proposal o1, Proposal o2) {
					//Compares its two arguments for order. Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
					if(o1.getScenarioResponse()<o2.getScenarioResponse()){
						return -1;
					}else if(o1.getScenarioResponse()==o2.getScenarioResponse()){
						return 0;
					}
					return 1;
				}
			});
			List<Proposal> filteredProposals=sillyBot.getOrderedProposals().subList(0, k);
			System.out.println(sillyBot);
			for (Proposal proposal : filteredProposals) {
				System.out.print(proposal.getArchitectureName()+"\t"+proposal.getScenarioResponse()+"\t");
				for (SillyBot sillyBot2 : sillyBots) {
					if(sillyBot2!=sillyBot){
						System.out.print(sillyBot2.getProposalForArchitecture(proposal.getArchitectureName()).getScenarioResponse()+"\t");
					}
				}
				System.out.println();
			}
			proposalsForNextRound.addAll(filteredProposals);
		}
		//I replace all the alternatives generated in ArchitecturalTransformationsFactory by this subset
		archTransFactory.replaceTransformationsForLevel(currentLevelOfTransformations, proposalsForNextRound);
	}
	
	public static void main(String[] args) {
		new PureSearch().searchUntilLevel(5);
	}
}
