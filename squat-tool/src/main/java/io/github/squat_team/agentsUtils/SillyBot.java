package io.github.squat_team.agentsUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class SillyBot {
	private String name;
	protected List<Proposal> orderedProposals;
	public abstract void insertInOrder(Proposal p);
	public Proposal makeConcession(){
		currentConcessionIndex++;
		return getCurrentProposal();
	}
	protected int currentConcessionIndex;
	
	public SillyBot(String name) {
		orderedProposals=new ArrayList<Proposal>();
		currentConcessionIndex=0;
		this.name=name;
	}
	public Proposal getBestProposal() {
		if(makeImprovementRegardingOriginal(orderedProposals.get(currentConcessionIndex)))
			return orderedProposals.get(currentConcessionIndex);
		return null;
	}
	protected abstract boolean makeImprovementRegardingOriginal(Proposal proposal);
	public boolean acceptableUtilityValue(Proposal proposal) {
		float currentUtilty=getUtilityFor(orderedProposals.get(currentConcessionIndex));
		float proposalUtility=getUtilityFor(this.getProposalForArchitecture(proposal.getArchitectureName()));
		
		return (proposalUtility>=currentUtilty);
	}
	
	protected Proposal getProposalForArchitecture(String pcmArchitecture){
		for (Iterator<Proposal> iterator = orderedProposals.iterator(); iterator.hasNext();) {
			Proposal proposal = (Proposal) iterator.next();
			if(proposal.getArchitectureName().equals(pcmArchitecture))
				return proposal;
		}
		return null;
	}
	public boolean canConcede(){
		if(orderedProposals.size()==(currentConcessionIndex+1))
			return false;
		else 
			return true;
	}
	public abstract float getUtilityFor(Proposal proposal);
	public Proposal getCurrentProposal() {
		return orderedProposals.get(currentConcessionIndex);
	}
	@Override
	public String toString() {
		return "Agent "+name;
	}
	public int getCurrentConcessionIndex() {
		return currentConcessionIndex;
	}
	public List<Proposal> getOrderedProposals() {
		return orderedProposals;
	}
	public abstract float getResponse(Proposal p);
}
