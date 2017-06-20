package io.github.squat_team.agentsUtils.transformations;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import edu.squat.transformations.ArchitecturalVersion;

public class ArchitecturalTransformationsFactory {
	
	private Hashtable<Integer, List<ArchitecturalVersion>> architecturesByLevel;
	private ModifiabilityTransformationsFactory modifiabilityTrans;
	private ArchitecturalVersion initialArchitecture;
	
	
	public ArchitecturalTransformationsFactory() {
		modifiabilityTrans=new ModifiabilityTransformationsFactory();
		initialArchitecture=new ArchitecturalVersion("stplus","models");
		architecturesByLevel=new Hashtable<>();
	}
	
	public List<ArchitecturalVersion> getArchitecturalTransformationsForLevel(int level){
		if(architecturesByLevel.get(level)==null)//TODO check that level is working. Not sure if it is the same number/object
			createArchitecturalTransformationsForLevel(level);
		
		//The results is the architectures created for this level plus the architectures created for previous levels
		List<ArchitecturalVersion> ret=new ArrayList<ArchitecturalVersion>();
		for (int i = 1; i <= level; i++) {
			ret.addAll(architecturesByLevel.get(i));
		}
		return ret;
	}
	private void createArchitecturalTransformationsForLevel(int level) {
		 if(level==1){
			 //Applied transformations to initial architecture and save it on the hashtable
			 List<ArchitecturalVersion> transformationForLevel=new ArrayList<ArchitecturalVersion>();
			 architecturesByLevel.put(level, transformationForLevel);
			 transformationForLevel.addAll(modifiabilityTrans.runModifiabilityTransformationsInAModel(initialArchitecture));
			 
			 //TODO I also have to do it for PERFORMANCE
		 }else{
			// TODO Auto-generated method stub
		 }
	}
	
	/*private List<PCMArchitectureInstance> runPerformanceTransformations(){
		//TODO 
		return null;
	}*/
}
