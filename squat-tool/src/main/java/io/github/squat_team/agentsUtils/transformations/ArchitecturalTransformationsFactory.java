package io.github.squat_team.agentsUtils.transformations;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.Proposal;

public class ArchitecturalTransformationsFactory {
	
	private Hashtable<Integer, List<ArchitecturalVersion>> architecturesByLevel;
	private ModifiabilityTransformationsFactory modifiabilityTrans;
	private PerformanceTransformationFactory performanceTrans;
	//private ArchitecturalVersion initialArchitecture1;
	private ArchitecturalVersion initialArchitecture;
	
	public ArchitecturalTransformationsFactory() {
		modifiabilityTrans=new ModifiabilityTransformationsFactory();
		initialArchitecture=new ArchitecturalVersion("default","models","");
		initialArchitecture.setFullPathToAlternativeRepository("/Users/santiagovidal/Documents/Programacion/kamp-test/squat-tool/models/alternativeRepository.repository");
		//initialArchitecture=new ArchitecturalVersion("cocome-cloud","models/cocomeWithoutPickUpStoreAndServiceAdapter","");
		//initialArchitecture.setFullPathToAlternativeRepository("/Users/santiagovidal/Documents/Programacion/kamp-test/squat-tool/models/cocomeWithoutPickUpStoreAndServiceAdapter/alternativescocome-cloud.repository");
		performanceTrans=new PerformanceTransformationFactory();
		architecturesByLevel=new Hashtable<>();
	}
	
	public List<ArchitecturalVersion> getArchitecturalTransformationsUntilLevel(int level){
		if(architecturesByLevel.get(level)==null)
			createArchitecturalTransformationsForLevel(level);
		
		//The results is the architectures created for this level plus the architectures created for previous levels
		List<ArchitecturalVersion> ret=new ArrayList<ArchitecturalVersion>();
		for (int i = 1; i <= level; i++) {
			ret.addAll(architecturesByLevel.get(i));
		}
		return ret;
	}
	private void createArchitecturalTransformationsForLevel(int level) {
		 List<ArchitecturalVersion> transformationForLevel=new ArrayList<ArchitecturalVersion>();
		 architecturesByLevel.put(level, transformationForLevel);
		 if(level==1){
			 //Applied transformations to initial architecture and save it on the hashtable
			 transformationForLevel.addAll(generateArchitecturalVersionsUsingModifiabilityTransformations(initialArchitecture));
			 transformationForLevel.addAll(generateArchitecturalVersionsUsingPerformanceTransformations(initialArchitecture));
		 }else{
			 List<ArchitecturalVersion> architecturesPreviousLevel=architecturesByLevel.get(level-1);
			 for (Iterator<ArchitecturalVersion> iterator = architecturesPreviousLevel.iterator(); iterator.hasNext();) {
				ArchitecturalVersion architecturalVersion = (ArchitecturalVersion) iterator.next();
				//if the architecture was modified last time by performance now is going to be modified for modifiability. 
				if(architecturalVersion.lastModifiedByModifiability()){
					transformationForLevel.addAll(generateArchitecturalVersionsUsingPerformanceTransformations(architecturalVersion));
				}else{
					 transformationForLevel.addAll(generateArchitecturalVersionsUsingModifiabilityTransformations(architecturalVersion));
				}
			}
		 }
	}
	public void replaceTransformationsForLevel(int level, Set<Proposal> proposalsForNextRound){
		List<ArchitecturalVersion> fullList=architecturesByLevel.get(level);
		Set<ArchitecturalVersion> newList= new HashSet<>();
		for(Proposal p : proposalsForNextRound){
			newList.add(findArchitecturalVersionByName(fullList, p.getArchitectureName()));
		}
		List<ArchitecturalVersion> reducedList=new ArrayList<ArchitecturalVersion>();
		reducedList.addAll(newList);
		
		architecturesByLevel.put(level, reducedList);
	}

	private ArchitecturalVersion findArchitecturalVersionByName(List<ArchitecturalVersion> fullList,String architectureName) {
		for (ArchitecturalVersion architecturalVersion : fullList) {
			if(architecturalVersion.getName().equals(architectureName)){
				return architecturalVersion;
			}
		}
		return null;
	}

	private List<ArchitecturalVersion> generateArchitecturalVersionsUsingModifiabilityTransformations(
			ArchitecturalVersion architecturalVersion) {
		return modifiabilityTrans.runModifiabilityTransformationsInAModel(architecturalVersion);
	}
	private List<ArchitecturalVersion> generateArchitecturalVersionsUsingPerformanceTransformations(
			ArchitecturalVersion architecturalVersion) {
		return performanceTrans.generateArchitecturalVersionsUsingPerformanceTransformations(architecturalVersion);
	}

	public List<ArchitecturalVersion> transformationsForLevel(int level) {
		return architecturesByLevel.get(level);
	}
	public ArchitecturalVersion getInitialArchitecture() {
		return initialArchitecture;
	}
}
