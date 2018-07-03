package io.github.squat_team.agentsUtils;

import java.util.ArrayList;
import java.util.List;

import edu.squat.transformations.ArchitecturalVersion;

public class ModifiabilityBot extends SillyBot {
	//private int originalAffectedComponents;
	private float originalComplexity;
	public ModifiabilityBot(/*int originalAffectedComponents,*/ float originalComplexity, String name,float scenatioThreshold) {
		super(name,scenatioThreshold);
		//this.originalAffectedComponents = originalAffectedComponents;
		this.originalComplexity = originalComplexity;
	}
	

	/*@Override
	protected boolean makeImprovementRegardingOriginal(Proposal proposal) {
		return ((ModifiabilityProposal)proposal).getComplexity()<=originalComplexity;
	}*/

	/*@Override
	public boolean canConcede() {
		//can concede if the following option in the ranking is not worse than an arbitrary 5% decline
		if(orderedProposals.size()==(currentConcessionIndex+1))
			return false;//no more options
		//float currentComplexity=((ModifiabilityProposal)orderedProposals.get(currentConcessionIndex)).getComplexity();
		float nextComplexity=((ModifiabilityProposal)orderedProposals.get(currentConcessionIndex+1)).getComplexity();
		return (((nextComplexity/originalComplexity)-1)*100)<=5;
	}*/
	/*@Override
	public float getUtilityFor(Proposal proposal) {
		float bestResponseTime=((ModifiabilityProposal)orderedProposals.get(0)).getComplexity();
		float proposalResponseTime=((ModifiabilityProposal)this.getProposalForArchitecture(proposal.getArchitectureName())).getComplexity();
		
		return bestResponseTime/proposalResponseTime;
	}*/
	
	@Override
	public float getResponse(Proposal p) {
		Proposal proposal=getProposalForArchitecture(p.getArchitectureName());
		return ((ModifiabilityProposal)proposal).getComplexity();
	}
	@Override
	protected float getScenarioMeasureFor(Proposal proposal) {
		return ((ModifiabilityProposal)proposal).getComplexity();
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
