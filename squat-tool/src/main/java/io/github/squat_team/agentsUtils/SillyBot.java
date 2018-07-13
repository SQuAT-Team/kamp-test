package io.github.squat_team.agentsUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.concessionStrategies.ConcessionStrategy;
import io.github.squat_team.agentsUtils.concessionStrategies.DesiresDistance;
import io.github.squat_team.agentsUtils.concessionStrategies.EgocentricConcession;
import io.github.squat_team.agentsUtils.concessionStrategies.NashConcession;

public abstract class SillyBot {
	private String name;
	protected List<Proposal> orderedProposals;
	private ConcessionStrategy concessionStrategy;
	private float acceptableLoss;
	public synchronized void insertInOrder(Proposal p){
		float utilityProposal=getUtilityFor(p);
		if (orderedProposals.size() == 0) {
			orderedProposals.add(p);
		} else if (getUtilityFor(orderedProposals.get(0)) < utilityProposal) {
			orderedProposals.add(0, p);
		} else if (getUtilityFor(orderedProposals.get(orderedProposals.size() - 1)) > utilityProposal) {
			orderedProposals.add(p);
		} else {
			int i = 0; 
			while (getUtilityFor(orderedProposals.get(i)) > utilityProposal) {
				i++;
			}
			orderedProposals.add(i, p);
		}
	}
	private float scenatioThreshold;
//	private Integer indexInWhichUtilityBecomeZero;
	public Proposal makeConcession(List<SillyBot> sillyBots){
		return concessionStrategy.makeConcession(sillyBots);
	}

	
	public SillyBot(String name,float scenatioThreshold) {
		orderedProposals=new ArrayList<Proposal>();
		concessionStrategy=new DesiresDistance(this);//new DesiresDistance(this);//NashConcession(this);//EgocentricConcession(this)
		
		this.name=name;
		this.scenatioThreshold=scenatioThreshold;
		acceptableLoss=20;
//		indexInWhichUtilityBecomeZero=null;
	}
	public Proposal getBestProposal() {
		//if(makeImprovementRegardingOriginal(orderedProposals.get(currentConcessionIndex)))
			return orderedProposals.get(concessionStrategy.getCurrentConcessionIndex());
	//	return null;
	}
	//protected abstract boolean makeImprovementRegardingOriginal(Proposal proposal);
	
	public boolean acceptableUtilityValue(Proposal proposal) {
		float currentUtilty=getUtilityFor(orderedProposals.get(concessionStrategy.getCurrentConcessionIndex()));
		if(proposal==null)
			System.out.println("Problema");
		float proposalUtility=getUtilityFor(this.getProposalForArchitecture(proposal.getArchitectureName()));
		
		float accetableLossValue=currentUtilty*acceptableLoss;
		return (proposalUtility>=(currentUtilty-accetableLossValue));
	}
	public int getIndexForArchitecture(String pcmArchitecture){
		Proposal p=getProposalForArchitecture(pcmArchitecture);
		return orderedProposals.indexOf(p);
	}
	public Proposal getProposalForArchitecture(String pcmArchitecture){
		for (Iterator<Proposal> iterator = orderedProposals.iterator(); iterator.hasNext();) {
			Proposal proposal = (Proposal) iterator.next();
			if(proposal.getArchitectureName().equals(pcmArchitecture))
				return proposal;
		}
		return null;
	}
	public boolean canConcede(){
		return concessionStrategy.canConcede();
	}
	//public abstract float getUtilityFor(Proposal proposal);
	public Proposal getCurrentProposal() {
		return orderedProposals.get(concessionStrategy.getCurrentConcessionIndex());
	}
	@Override
	public String toString() {
		return "Agent "+name;
	}
	public int getCurrentConcessionIndex() {
		return concessionStrategy.getCurrentConcessionIndex();
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
		
		//float n=1f;//indexInWhichUtilityBecomeZero();
		//float utility=(-1/(n*expectedResponse))*scenarioResponse+1;
		float utility=0;
		if(scenarioResponse<=expectedResponse)
			utility= 2- expectedResponse/scenarioResponse;
		else
			utility= 2- 1.10f*scenarioResponse/expectedResponse;
		
		//System.out.println(name+" "+expectedResponse+" "+scenarioResponse+" "+utility);
		if(utility >= 0 && utility<=1)
			return utility;
		else
			return 0;
		/*float p=1;
		float t=1.2f;
		float utility=(float) (1- Math.pow((scenarioResponse/(n*expectedResponse)), p/t));*/
	
		//return utility;
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
		int differentFromZero=0;
		System.out.print("Utilities for "+name+" [");
		for (Iterator<Proposal> iterator = orderedProposals.iterator(); iterator.hasNext();) {
			Proposal proposal = (Proposal) iterator.next();
			/*if(proposal.getArchitectureName().equals("stplus-ps2-476-mod-split(PaymentSystem)-wrapper(IExporter)")){
				System.out.println("Esta->");
				System.out.println(proposal);
			}*/
			float utility=getUtilityFor(proposal);
			System.out.print(utility+" ");
			if(utility>0)
				differentFromZero++;
				
		}
		System.out.println("]");
		System.out.println("Different from zero: "+differentFromZero);
	}
	/**it removes the proposals that are not contained in the list
	 * 
	 * @param architecturalAlternatives
	 */
	public void removeNotContainedProposals(List<ArchitecturalVersion> architecturalAlternatives) {
		List<Proposal> toBeKeeped=new ArrayList<>();
		for (ArchitecturalVersion architecturalVersion : architecturalAlternatives) {
			Proposal p=getProposalForArchitecture(architecturalVersion.getName());
			if(p!=null)
				toBeKeeped.add(p);
		}
		orderedProposals.clear();
		for (Proposal proposal : toBeKeeped) {
			this.insertInOrder(proposal);
		}
	}
}
