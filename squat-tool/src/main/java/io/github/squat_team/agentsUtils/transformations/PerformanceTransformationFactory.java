package io.github.squat_team.agentsUtils.transformations;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.PerformanceScenarioHelper;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.model.PCMScenarioResult;
import io.github.squat_team.performance.AbstractPerformancePCMScenario;
import io.github.squat_team.performance.peropteryx.ConcurrentPerOpteryxPCMBot;
import io.github.squat_team.performance.peropteryx.PerOpteryxPCMBot;
import io.github.squat_team.util.AlternativesRegistry;
import io.github.squat_team.util.PCMWorkingCopyCreator;
import io.github.squat_team.util.TimeMeasurement;
import test.TestConstants;

public class PerformanceTransformationFactory {

	private static volatile PerformanceTransformationFactory instance;
	private volatile Map<AbstractPerformancePCMScenario, Map<String,Double>> architecturalResponse;
	
	public static PerformanceTransformationFactory getInstance(){
		if(instance==null)
			instance=new PerformanceTransformationFactory();
		return instance;
	}
	private PerformanceTransformationFactory(){
		architecturalResponse=new HashMap<>();
		architecturalResponse.put(PerformanceScenarioHelper.getInstance().createScenario1Cocome(), new HashMap<String,Double>());
		architecturalResponse.put(PerformanceScenarioHelper.getInstance().createScenario2Cocome(), new HashMap<String,Double>());
		architecturalResponse.put(PerformanceScenarioHelper.getInstance().createScenario3Cocome(), new HashMap<String,Double>());
		architecturalResponse.put(PerformanceScenarioHelper.getInstance().createScenario4Cocome(), new HashMap<String,Double>());
	}
	
	public synchronized Double getComplexityForArchitecture(AbstractPerformancePCMScenario scenario, String architectureAbsolutePath){
		return architecturalResponse.get(scenario).get(architectureAbsolutePath);
	}
	
	public List<ArchitecturalVersion> generateArchitecturalVersionsUsingPerformanceTransformations(
			ArchitecturalVersion architecturalVersion) {
		TimeMeasurement.getInstace().printStart("generation of perfoamnce architectural alternatives");
		List<ArchitecturalVersion> ret=new ArrayList<ArchitecturalVersion>();
		/*AbstractPerformancePCMScenario workloadScenario = PerformanceScenarioHelper.createScenarioOfWorkload();
		ret.addAll(createAlternativesForScenario(architecturalVersion, workloadScenario));
		AbstractPerformancePCMScenario cpuScenario = PerformanceScenarioHelper.createScenarioOfCPU();
		ret.addAll(createAlternativesForScenario(architecturalVersion, cpuScenario))*/
		System.out.println("Analyzing: "+architecturalVersion.getFileName());
		PCMArchitectureInstance architecture=PerformanceScenarioHelper.createArchitecture(architecturalVersion,null);
		
		System.out.println("Loading performance scenario P1");
		AbstractPerformancePCMScenario cocomeScenario1 = PerformanceScenarioHelper.getInstance().createScenario1Cocome();
		ret.addAll(createAlternativesForScenario(architecture, cocomeScenario1));
		System.out.println("Loading performance scenario P2");
		AbstractPerformancePCMScenario cocomeScenario2 = PerformanceScenarioHelper.getInstance().createScenario2Cocome();
		ret.addAll(createAlternativesForScenario(architecture, cocomeScenario2));
		System.out.println("Loading performance scenario P3");
		AbstractPerformancePCMScenario cocomeScenario3 = PerformanceScenarioHelper.getInstance().createScenario3Cocome();
		ret.addAll(createAlternativesForScenario(architecture, cocomeScenario3));
		System.out.println("Loading performance scenario P4");
		AbstractPerformancePCMScenario cocomeScenario4 = PerformanceScenarioHelper.getInstance().createScenario4Cocome();
		ret.addAll(createAlternativesForScenario(architecture, cocomeScenario4));
		TimeMeasurement.getInstace().printFinish("generation of perfoamnce architectural alternatives");
		AlternativesRegistry.getInstace().saveChildrensOfArchitecture(architecturalVersion, ret);
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

	private List<ArchitecturalVersion> createAlternativesForScenario(PCMArchitectureInstance architecture,
			AbstractPerformancePCMScenario scenario) {
		
		List<ArchitecturalVersion> ret=new ArrayList<ArchitecturalVersion>();
		

		ConcurrentPerOpteryxPCMBot bot=PerformanceScenarioHelper.getInstance().createPCMBot(scenario);
		//PCMArchitectureInstance architecture=PerformanceScenarioHelper.createArchitecture(architecturalVersion);
		
		
		List<PCMScenarioResult> results = bot.searchForAlternatives(architecture);
		
		for (Iterator<PCMScenarioResult> iterator = results.iterator(); iterator.hasNext();) {
			PCMScenarioResult pcmScenarioResult = (PCMScenarioResult) iterator.next();
			
			PCMArchitectureInstance archInstance=pcmScenarioResult.getResultingArchitecture();
			URI uri=archInstance.getUsageModel().eResource().getURI();
			File modelFile=new File(uri.toFileString());
			String newModelName=modelFile.getParentFile().getParentFile().getName()+"-"+modelFile.getParentFile().getName();
			PCMWorkingCopyCreator copyCreator=new PCMWorkingCopyCreator(newModelName, new File(TestConstants.MAIN_STORAGE_PATH),PerformanceScenarioHelper.getInstance().obtainName(scenario));
			PCMArchitectureInstance archInstanceInRightLocation=copyCreator.createWorkingCopy(archInstance);
			File modelFileRightLocation=new File(archInstanceInRightLocation.getUsageModel().eResource().getURI().toFileString());
			
			
			
			ArchitecturalVersion newAlternative=new ArchitecturalVersion(modelFileRightLocation.getName().substring(0, modelFileRightLocation.getName().lastIndexOf('.')), modelFileRightLocation.getParentFile().getAbsolutePath/*getName*/(), ArchitecturalVersion.PERFORMANCE);
		
			newAlternative.setFullPathToAlternativeRepository(archInstanceInRightLocation.getRepositoryWithAlternatives().eResource().getURI().toFileString());
			
			architecturalResponse.get(scenario).put(newAlternative.getAbsolutePath()+"/"+newAlternative.getRepositoryFilename(), (Double)pcmScenarioResult.getResult().getResponse());
			ret.add(newAlternative);
		}
		
		return ret;
	}

	public static void main(String[] args) {
		ArchitecturalVersion av=new ArchitecturalVersion("cocome-cloud-88-ICashDeskDAO", "/Users/santiagovidal/Documents/Programacion/kamp-test/squat-tool/models/cocomeWithResourceDemands" , "modifiability");
		av.setFullPathToAlternativeRepository("/Users/santiagovidal/Documents/Programacion/kamp-test/squat-tool/models/cocomeWithResourceDemands/alternativecocome-cloud-88-ICashDeskDAO.repository");
		PerformanceTransformationFactory.getInstance().generateArchitecturalVersionsUsingPerformanceTransformations(av);
	}
	
}
