package io.github.squat_team.agentsUtils.transformations;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import edu.squat.transformations.ArchitecturalVersion;
import edu.squat.transformations.modifiability.PCMTransformerRunner;
import edu.squat.transformations.modifiability.insinter.InsInterRunner;
import edu.squat.transformations.modifiability.splitrespn.SplitRespNRunner;
import edu.squat.transformations.modifiability.wrapper.WrapperRunner;

public class ModifiabilityTransformationsFactory {
	private final static String wrapperHenshinFilename = "wrapper-modular.henshin";
	private final static String splitrespHenshinFilename = "splitrespn-modular.henshin";
	private final static String insinterHenshinFilename = "insinter-modular.henshin";
	private ArchitecturalVersion currentInitialArchitecture;
	private HenshinResourceSet resourceSet;
	
	public List<ArchitecturalVersion> runModifiabilityTransformationsInAModel(ArchitecturalVersion initialArchitecture){
		List<ArchitecturalVersion> ret=new ArrayList<>();
		this.currentInitialArchitecture=initialArchitecture;
		resourceSet = new HenshinResourceSet(currentInitialArchitecture.getAbsolutePath());
		
		ret.addAll(runWrapper());
		List<ArchitecturalVersion> splitAlternatives=runSplitResp();
		
		ret.addAll(splitAlternatives);
		
		for (Iterator<ArchitecturalVersion> iterator = splitAlternatives.iterator(); iterator.hasNext();) {
			ArchitecturalVersion architecturalVersion = (ArchitecturalVersion) iterator.next();
			if(!currentInitialArchitecture.getAbsolutePath().equals(architecturalVersion.getAbsolutePath()))
				resourceSet = new HenshinResourceSet(architecturalVersion.getAbsolutePath());
			currentInitialArchitecture=architecturalVersion;
			
			ret.addAll(runWrapper());
		}
		
		//ret.addAll(runInsInter());
		return ret;
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
