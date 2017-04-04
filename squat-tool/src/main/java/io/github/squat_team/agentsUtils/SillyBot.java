package io.github.squat_team.agentsUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class SillyBot {
	protected List<Proposal> orderedProposals;
	public abstract void insertInOrder(Proposal p);
	public abstract Proposal makeConcession();
	private int currentConcessionIndex;
	
	public SillyBot() {
		orderedProposals=new ArrayList<Proposal>();
		currentConcessionIndex=0;
	}
	public Proposal getBestProposal() {
		if(makeImprovement(orderedProposals.get(currentConcessionIndex)))
			return orderedProposals.get(currentConcessionIndex);
		return null;
	}
	protected abstract boolean makeImprovement(Proposal proposal);
	
}
