package io.github.squat_team.agentsUtils.transformations;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.PerformanceScenarioHelper;
import io.github.squat_team.agentsUtils.Proposal;
import io.github.squat_team.runner.SQuATConfiguration;

public class ArchitecturalTransformationsFactory {
	
	private Hashtable<Integer, List<ArchitecturalVersion>> architecturesByLevel;
	private ModifiabilityTransformationsFactory modifiabilityTrans;
	private PerformanceTransformationFactory performanceTrans;
	//private ArchitecturalVersion initialArchitecture1;
	private ArchitecturalVersion initialArchitecture;
	
	public ArchitecturalTransformationsFactory(SQuATConfiguration configuration) {
		modifiabilityTrans=new ModifiabilityTransformationsFactory();
		initialArchitecture=new ArchitecturalVersion(configuration.getModelFileName(),configuration.getModelPath(),"");
		initialArchitecture.setFullPathToAlternativeRepository(configuration.getAlternativeRepositoryFullPath());
		//initialArchitecture=new ArchitecturalVersion("cocome-cloud","models/cocomeWithoutPickUpStoreAndServiceAdapter","");
		//initialArchitecture.setFullPathToAlternativeRepository("/Users/santiagovidal/Documents/Programacion/kamp-test/squat-tool/models/cocomeWithoutPickUpStoreAndServiceAdapter/alternativescocome-cloud.repository");
		performanceTrans=PerformanceTransformationFactory.getInstance();
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
			 PerformanceScenarioHelper.getInstance().resetBots();
			 int i=0;
			 for (Iterator<ArchitecturalVersion> iterator = architecturesPreviousLevel.iterator(); iterator.hasNext();) {
				System.out.println("*********PREVIOUS LEVEL ARCHITECTURES "+i+"/"+architecturesPreviousLevel.size()+"*********************************************");i++;
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
			ArchitecturalVersion av=findArchitecturalVersionByName(fullList, p.getArchitectureName());
			if(av!=null)
				newList.add(av);
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
		//System.out.println("The architectural version is: "+architecturalVersion);
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
	public ModifiabilityTransformationsFactory getModifiabilityTrans() {
		return modifiabilityTrans;
	}

	public void preLoadModelsFrom(String path, int level) {
		List<ArchitecturalVersion> ret=new ArrayList<ArchitecturalVersion>();
		List<String> fileNames=getFilesNames(path);
		for (String fileName : fileNames) {
			String lastModifiedBy;
			if(fileName.startsWith("c"))
				lastModifiedBy=ArchitecturalVersion.MODIFIABILITY;
			else
				lastModifiedBy=ArchitecturalVersion.PERFORMANCE;
				
			ArchitecturalVersion av=new ArchitecturalVersion(fileName, path , lastModifiedBy);
			String alternativePath=path+"/";
			if(lastModifiedBy==ArchitecturalVersion.MODIFIABILITY)
				alternativePath=alternativePath+"alternative"+fileName+".repository";
			else
				alternativePath=alternativePath+fileName+"alternative.repository";
			av.setFullPathToAlternativeRepository(alternativePath);
			if(lastModifiedBy==ArchitecturalVersion.MODIFIABILITY)
				ret.add(av);
		}
		architecturesByLevel.put(level, ret);
	}

	private List<String> getFilesNames(String path) {
		File dir = new File(path);
		File [] files = dir.listFiles(new FilenameFilter() {
		    @Override
		    public boolean accept(File dir, String name) {
		        return name.endsWith(".allocation");
		    }
		});
		List<String> names=new ArrayList<>();
		for (File allocationFile : files) {
		    names.add(allocationFile.getName().substring(0, allocationFile.getName().lastIndexOf(".")));
		}
		names.remove(initialArchitecture.getFileName());
		
		return names;
	}
}
