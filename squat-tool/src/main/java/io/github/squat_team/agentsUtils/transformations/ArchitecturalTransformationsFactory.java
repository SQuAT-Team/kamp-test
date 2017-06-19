package io.github.squat_team.agentsUtils.transformations;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import io.github.squat_team.model.PCMArchitectureInstance;

public class ArchitecturalTransformationsFactory {
	private String filename = "stplus"; //Initial architecture 
	private Hashtable<Integer, List<PCMArchitectureInstance>> architecturesByLevel;
	private ModifiabilityTransformationsFactory modifiabilityTrans;
	
	
	public ArchitecturalTransformationsFactory() {
		modifiabilityTrans=new ModifiabilityTransformationsFactory();
	}
	
	public List<PCMArchitectureInstance> getArchitecturalTransformationsForLevel(int level){
		if(architecturesByLevel.get(level)==null)//check that level is working. Not sure if it is the same number/object
			createArchitecturalTransformationsForLevel(level);
		
		//The results is the architectures created for this level plus the architectures created for previous levels
		List<PCMArchitectureInstance> ret=new ArrayList<PCMArchitectureInstance>();
		for (int i = 1; i <= level; i++) {
			ret.addAll(architecturesByLevel.get(i));
		}
		return ret;
	}
	private void createArchitecturalTransformationsForLevel(int level) {
		// TODO Auto-generated method stub
		 if(level==1){
			 //Applied transformations to initial architecture and save it on the hashtable
			 
		 }else{
			 
		 }
	}
	
	/*private List<PCMArchitectureInstance> runPerformanceTransformations(){
		//TODO 
		return null;
	}*/
}
