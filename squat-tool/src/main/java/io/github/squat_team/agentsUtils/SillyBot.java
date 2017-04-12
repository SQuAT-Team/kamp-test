package io.github.squat_team.agentsUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class SillyBot {
	private String name;
	protected List<Proposal> orderedProposals;
	public abstract void insertInOrder(Proposal p);
	private float scenatioThreshold;
	private Integer indexInWhichUtilityBecomeZero;
	public Proposal makeConcession(){
		currentConcessionIndex++;
		return getCurrentProposal();
	}
	protected int currentConcessionIndex;
	
	public SillyBot(String name,float scenatioThreshold) {
		orderedProposals=new ArrayList<Proposal>();
		currentConcessionIndex=0;
		this.name=name;
		this.scenatioThreshold=scenatioThreshold;
		indexInWhichUtilityBecomeZero=null;
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
	public int getIndexForArchitecture(String pcmArchitecture){
		Proposal p=getProposalForArchitecture(pcmArchitecture);
		return orderedProposals.indexOf(p);
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
	//public abstract float getUtilityFor(Proposal proposal);
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
	
	
	public float getUtilityFor(String pcmArchitecture){
		Proposal proposal=getProposalForArchitecture(pcmArchitecture);
		return getUtilityFor(proposal);
	}
	public float getUtilityFor(Proposal proposal){
		float scenarioResponse=getScenarioMeasureFor(proposal);
		float expectedResponse=scenatioThreshold;
		float n=1f;//indexInWhichUtilityBecomeZero();
		float utility=(-1/(n*expectedResponse))*scenarioResponse+1;
		if(utility<0)
			return 0;
		return utility;
	}
	/*private int indexInWhichUtilityBecomeZero() {
		if(indexInWhichUtilityBecomeZero==null){
			if(getScenarioMeasureFor(orderedProposals.get(0))==getScenarioMeasureFor(orderedProposals.get(orderedProposals.size()-1))){
				indexInWhichUtilityBecomeZero=orderedProposals.size()-1;//if all the proposals have the same response, then n is the last index
			}else{
				//I return the third quartile
				indexInWhichUtilityBecomeZero=(int) Math.round(orderedProposals.size() * 75 / 100);
			}
		}
		return indexInWhichUtilityBecomeZero;
	}*/
	protected abstract float getScenarioMeasureFor(Proposal proposal);
	public void printUtilies(){
		System.out.print("Utilities for "+name+" [");
		for (Iterator<Proposal> iterator = orderedProposals.iterator(); iterator.hasNext();) {
			Proposal proposal = (Proposal) iterator.next();
			System.out.print(getUtilityFor(proposal)+" ");
		}
		System.out.println("]");
	}
}
