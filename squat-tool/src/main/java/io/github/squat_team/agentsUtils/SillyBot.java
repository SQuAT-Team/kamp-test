package io.github.squat_team.agentsUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class SillyBot {
	protected List<Proposal> orderedProposals;
	public abstract void insertInOrder(Proposal p);
	public abstract Proposal makeConcession();
	protected int currentConcessionIndex;
	
	public SillyBot() {
		orderedProposals=new ArrayList<Proposal>();
		currentConcessionIndex=0;
	}
	public Proposal getBestProposal() {
		if(makeImprovementRegardingOriginal(orderedProposals.get(currentConcessionIndex)))
			return orderedProposals.get(currentConcessionIndex);
		return null;
	}
	protected abstract boolean makeImprovementRegardingOriginal(Proposal proposal);
	public abstract boolean acceptableUtilityValue(Proposal proposal);
	
	protected Proposal getProposalForArchitecture(String pcmArchitecture){
		for (Iterator<Proposal> iterator = orderedProposals.iterator(); iterator.hasNext();) {
			Proposal proposal = (Proposal) iterator.next();
			if(proposal.getArchitectureName().equals(pcmArchitecture))
				return proposal;
		}
		return null;
	}
	public abstract boolean canConcede();
}
