package io.github.squat_team.agentsUtils;

public class ModifiabilityBot extends SillyBot {
	private int originalAffectedComponents;
	private float originalComplexity;
	public ModifiabilityBot(int originalAffectedComponents, float originalComplexity) {
		super();
		this.originalAffectedComponents = originalAffectedComponents;
		this.originalComplexity = originalComplexity;
	}
	@Override
	public void insertInOrder(Proposal p) {
		ModifiabilityProposal currentProposal = (ModifiabilityProposal) p;
		if (orderedProposals.size() == 0) {
			orderedProposals.add(currentProposal);
		} else if ((((ModifiabilityProposal) orderedProposals.get(0)).getComplexity() > currentProposal.getComplexity())||
				((((ModifiabilityProposal) orderedProposals.get(0)).getComplexity() == currentProposal.getComplexity()) && ((((ModifiabilityProposal) orderedProposals.get(0)).getAffectedComponents()>currentProposal.getAffectedComponents())))) {
			orderedProposals.add(0, currentProposal);
		} else if ( (((ModifiabilityProposal) orderedProposals.get(orderedProposals.size() - 1)).getComplexity() < currentProposal.getComplexity())||((((ModifiabilityProposal) orderedProposals.get(orderedProposals.size() - 1)).getComplexity() == currentProposal.getComplexity())&&(((ModifiabilityProposal) orderedProposals.get(orderedProposals.size() - 1)).getAffectedComponents() < currentProposal.getAffectedComponents()))) {
			orderedProposals.add(currentProposal);
		} else {
			int i = 0;
			while ((((ModifiabilityProposal) orderedProposals.get(i)).getComplexity() < currentProposal.getComplexity())||
					((((ModifiabilityProposal) orderedProposals.get(i)).getComplexity() == currentProposal.getComplexity())&&(((ModifiabilityProposal) orderedProposals.get(i)).getAffectedComponents() < currentProposal.getAffectedComponents()))) {
				i++;
			}
			orderedProposals.add(i, currentProposal);
		}
		
	}
	@Override
	public Proposal makeConcession() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected boolean makeImprovementRegardingOriginal(Proposal proposal) {
		return ((ModifiabilityProposal)proposal).getComplexity()<=originalComplexity;
	}
	@Override
	public boolean acceptableUtilityValue(Proposal proposal) {
		float currentComplexity=((ModifiabilityProposal)orderedProposals.get(currentConcessionIndex)).getComplexity();
		float proposalComplexity=((ModifiabilityProposal)this.getProposalForArchitecture(proposal.getArchitectureName())).getComplexity();
		
		return (proposalComplexity<=currentComplexity);
	}
	@Override
	public boolean canConcede() {
		//can concede if the following option in the ranking is not worse than an arbitrary 5% decline
		if(orderedProposals.size()==(currentConcessionIndex+1))
			return false;//no more options
		float currentComplexity=((ModifiabilityProposal)orderedProposals.get(currentConcessionIndex)).getComplexity();
		float nextComplexity=((ModifiabilityProposal)orderedProposals.get(currentConcessionIndex+1)).getComplexity();
		return (((nextComplexity/currentComplexity)-1)*100)<=5;
	}
	
}
