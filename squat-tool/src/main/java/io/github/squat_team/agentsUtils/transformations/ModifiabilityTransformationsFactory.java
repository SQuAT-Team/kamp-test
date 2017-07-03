package io.github.squat_team.agentsUtils.transformations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<ArchitecturalVersion> runModifiabilityTransformationsInAModel(ArchitecturalVersion initialArchitecture){
		List<ArchitecturalVersion> ret=new ArrayList<>();
		this.currentInitialArchitecture=initialArchitecture;
		
		ret.addAll(runWrapper());
		ret.addAll(runSplitResp());
		ret.addAll(runInsInter());
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
	
		ArchitecturalVersion resultantArchitecture=new ArchitecturalVersion(currentInitialArchitecture.getFileName() + "-" + "#REPLACEMENT#",currentInitialArchitecture.getPath(),"");
		return runner.run(currentInitialArchitecture.getPath(),
				currentInitialArchitecture.getRepositoryFilename(), currentInitialArchitecture.getSystemFilename(), currentInitialArchitecture.getResourceEnvironmentFilename(), currentInitialArchitecture.getAllocationFilename(), currentInitialArchitecture.getUsageFilename(),
			henshinFilename, 
			resultantArchitecture.getRepositoryFilename(), resultantArchitecture.getSystemFilename(), resultantArchitecture.getResourceEnvironmentFilename(), resultantArchitecture.getAllocationFilename(), resultantArchitecture.getUsageFilename(),
			true);
		
		
	}
}
