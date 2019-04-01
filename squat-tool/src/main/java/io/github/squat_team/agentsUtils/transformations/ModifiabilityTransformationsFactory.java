package io.github.squat_team.agentsUtils.transformations;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import edu.squat.transformations.ArchitecturalVersion;
import edu.squat.transformations.modifiability.PCMTransformerRunner;
import edu.squat.transformations.modifiability.insinter.InsInterRunner;
import edu.squat.transformations.modifiability.splitrespn.SplitRespNRunner;
import edu.squat.transformations.modifiability.wrapper.WrapperRunner;
import io.github.squat_team.HenshinResourceSetManager;
import io.github.squat_team.agentsUtils.PerformanceScenarioHelper;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.util.AlternativesRegistry;
import io.github.squat_team.util.PCMRepositoryModifier;
import io.github.squat_team.util.TimeMeasurement;

public class ModifiabilityTransformationsFactory {
	private final static String wrapperHenshinFilename = "wrapper-modular.henshin";
	private final static String splitrespHenshinFilename = "splitrespn-modular.henshin";
	private final static String insinterHenshinFilename = "insinter-modular.henshin";
	private ArchitecturalVersion currentInitialArchitecture;
	private HenshinResourceSet resourceSet;
	private PCMRepositoryModifier repoModifier;
	
	public List<ArchitecturalVersion> runModifiabilityTransformationsInAModel(ArchitecturalVersion initialArchitecture){
		TimeMeasurement.getInstace().printStart("generation of modifiability architectural alternatives");
		List<ArchitecturalVersion> ret=new ArrayList<>();
		this.currentInitialArchitecture=initialArchitecture;
		resourceSet = HenshinResourceSetManager.getInstance().getHenshinResourceSet(currentInitialArchitecture.getAbsolutePath());
		
		
		mergeRepository();
		try{
			ret.addAll(runWrapper());
		} catch (Exception e) {
			System.err.println("Error in Wrapper");
		}
		
		removeSpecialCase(ret, "cocome-cloud-2-ProductBarcodeScannedEvent.repository");
		removeSpecialCase(ret,"cocome-cloud-3-CashBoxClosedEvent.repository");
		
		List<ArchitecturalVersion> splitAlternatives=runSplitResp();
		
		removeSpecialCase(splitAlternatives, "cocome-cloud-2-ProductBarcodeScannedEvent.repository");
		removeSpecialCase(splitAlternatives,"cocome-cloud-3-CashBoxClosedEvent.repository");
	
		ret.addAll(splitAlternatives);
		
		//ret=selectSubset(ret,20f);
		if(ret.size()<=1)//For some reason, when we have only one result, this alternative is null
			ret.clear();
		else
			splitRepository(ret);
		
		/*List<ArchitecturalVersion> splitAlternatives=runSplitResp();
		
		removeSpecialCase(splitAlternatives, "cocome-cloud-2-ProductBarcodeScannedEvent.repository");
		removeSpecialCase(splitAlternatives,"cocome-cloud-3-CashBoxClosedEvent.repository");
		
		ret.addAll(splitAlternatives);
		
		
		
		splitRepository(ret);
		
		for (Iterator<ArchitecturalVersion> iterator = splitAlternatives.iterator(); iterator.hasNext();) {
			ArchitecturalVersion architecturalVersion = (ArchitecturalVersion) iterator.next();
			resourceSet = HenshinResourceSetManager.getInstance().getHenshinResourceSet(currentInitialArchitecture.getAbsolutePath());
			currentInitialArchitecture=architecturalVersion;
			mergeRepository();
			List<ArchitecturalVersion> ret2;
			try{
				ret2=runWrapper();
			}catch (Exception e) {
				ret2=new ArrayList<ArchitecturalVersion>();
			}
			ret.addAll(ret2);
			splitRepository(ret2);
		}*/
		
	

		TimeMeasurement.getInstace().printFinish("generation of modifiability architectural alternatives");
		AlternativesRegistry.getInstace().saveChildrensOfArchitecture(initialArchitecture, ret);
	
		return ret;
	}
	/**Select the first N architectures according to @param percentage
	 * 
	 * @param splitAlternatives
	 * @param percentage
	 * @return
	 */
	private List<ArchitecturalVersion> selectSubset(List<ArchitecturalVersion> splitAlternatives,
			float percentage) {
		int n=(int) ((percentage*splitAlternatives.size())/100f);
		
		return splitAlternatives.subList(0, n);
	}

	private void removeSpecialCase(List<ArchitecturalVersion> ret, String repositoryName) {
		for (Iterator<ArchitecturalVersion> iterator = ret.iterator(); iterator.hasNext();) {
			ArchitecturalVersion architecturalVersion = (ArchitecturalVersion) iterator.next();
			if(architecturalVersion.getRepositoryFilename().equals(repositoryName)){
				ret.remove(architecturalVersion);
				return;
			}
		}
	}

	private void splitRepository(List<ArchitecturalVersion> ret) {
		// remove alternative components
		int i=0;
		for (Iterator<ArchitecturalVersion> iterator = ret.iterator(); iterator.hasNext();) {
			System.out.println("******************************************"+i+"/"+ret.size()+"*********************************************");i++;
			ArchitecturalVersion architecturalVersion = (ArchitecturalVersion) iterator.next();
			PCMArchitectureInstance loadedArchitecture = PerformanceScenarioHelper.createArchitecture(architecturalVersion,null);
			
			repoModifier.separateRepository(loadedArchitecture);
			architecturalVersion.setFullPathToAlternativeRepository(loadedArchitecture.getRepositoryWithAlternatives().eResource().getURI().toFileString());
			
		}
		PCMArchitectureInstance loadedInitialArchitecture = PerformanceScenarioHelper.createArchitecture(currentInitialArchitecture,null);
		repoModifier.separateRepository(PerformanceScenarioHelper.createArchitecture(currentInitialArchitecture,null));
		currentInitialArchitecture.setFullPathToAlternativeRepository(loadedInitialArchitecture.getRepositoryWithAlternatives().eResource().getURI().toFileString());
		repoModifier=null;
	}
	

	private void mergeRepository() {
		repoModifier=new PCMRepositoryModifier(PerformanceScenarioHelper.createArchitecture(currentInitialArchitecture,null));
		repoModifier.mergeRepositories();
	}

	public List<ArchitecturalVersion> runWrapper() {
		WrapperRunner runner = new WrapperRunner();
		return this.runTransformation(runner, wrapperHenshinFilename);
	}
	
	public List<ArchitecturalVersion> runSplitResp() {
		SplitRespNRunner runner = new SplitRespNRunner();
		return this.runTransformation(runner, splitrespHenshinFilename);
	}
	
	public List<ArchitecturalVersion> runInsInter() {
		InsInterRunner runner = new InsInterRunner();
		return this.runTransformation(runner, insinterHenshinFilename);
	}
	
	private List<ArchitecturalVersion> runTransformation( PCMTransformerRunner runner, String henshinFilename) {
		List<ArchitecturalVersion> ret;
		ArchitecturalVersion resultantArchitecture=new ArchitecturalVersion(currentInitialArchitecture.getFileName() + "-" + "#REPLACEMENT#",currentInitialArchitecture.getPath(),"");
		
		runner.setResourceSet(resourceSet);
		ret= runner.run(currentInitialArchitecture.getAbsolutePath(),
				currentInitialArchitecture.getRepositoryFilename(), currentInitialArchitecture.getSystemFilename(), currentInitialArchitecture.getResourceEnvironmentFilename(), currentInitialArchitecture.getAllocationFilename(), currentInitialArchitecture.getUsageFilename(),
			henshinFilename, 
			resultantArchitecture.getRepositoryFilename(), resultantArchitecture.getSystemFilename(), resultantArchitecture.getResourceEnvironmentFilename(), resultantArchitecture.getAllocationFilename(), resultantArchitecture.getUsageFilename(),
			true);
		
		return ret;
	}
}
