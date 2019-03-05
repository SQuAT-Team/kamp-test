package io.github.squat_team.algorithm.util;

import java.util.HashMap;
import java.util.Map;

import org.powermock.api.mockito.PowerMockito;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.agentsUtils.ArchitecturalCopyCreator;
import io.github.squat_team.model.PCMArchitectureInstance;
import io.github.squat_team.util.PCMHelper;

import static org.mockito.Mockito.*;

/**
 * Should be used to create architectures for tests with mocked bots. Each
 * architecture builder is usually related to single {@link PCMBotMockBuilder}.
 * The builder will assure that also the transformations from/to other types
 * will work correctly.
 */
public class ArchitectureBuilder {
	private static ArchitecturalCopyCreator COPY_CREATOR_INSTANCE = null;
	private static boolean mockedPCMHelper = false;
	private PCMBotMockProperties botProperties;
	private Map<PCMArchitectureInstance, Integer> architectureCounters = new HashMap<>();

	/**
	 * 
	 * 
	 * @param botProperties
	 */
	public ArchitectureBuilder(PCMBotMockProperties botProperties) {
		this();
		this.botProperties = botProperties;
	}

	/**
	 * This constructor should only be used for the creation of the initial
	 * architecture. Otherwise use
	 * {@link #ArchitectureBuilder(PCMBotMockProperties)}.
	 */
	public ArchitectureBuilder() {
		if (!mockedPCMHelper) {
			PowerMockito.mockStatic(PCMHelper.class);
			mockedPCMHelper = true;
		}
	}

	private static synchronized ArchitecturalCopyCreator getCopyCreator() {
		if (COPY_CREATOR_INSTANCE == null) {
			PowerMockito.mockStatic(ArchitecturalCopyCreator.class);
			COPY_CREATOR_INSTANCE = mock(ArchitecturalCopyCreator.class);
			when(ArchitecturalCopyCreator.getInstance()).thenReturn(COPY_CREATOR_INSTANCE);
		}
		return COPY_CREATOR_INSTANCE;
	}

	public ArchitecturalVersion generateArchitecturalVersion(PCMArchitectureInstance architecture,
			String lastModifiedBy) {
		ArchitecturalVersion architecturalVersion = new ArchitecturalVersion(architecture.getName(), "aPath",
				lastModifiedBy);
		link(architecture, architecturalVersion);
		return architecturalVersion;
	}

	private void link(PCMArchitectureInstance pcmArchitecture, ArchitecturalVersion architectureAsVersion) {
		when(PCMHelper.createArchitecture(architectureAsVersion)).thenReturn(pcmArchitecture);
		when(PCMHelper.createArchitecture(pcmArchitecture)).thenReturn(architectureAsVersion);
		ArchitecturalCopyCreator copyCreator = getCopyCreator();
		when(copyCreator.copy(eq(pcmArchitecture), any())).thenReturn(architectureAsVersion);
	}

	/**
	 * Creates a new initial architecture.
	 * 
	 * @return
	 */
	public PCMArchitectureInstance buildNewArchitecture() {
		String architectureName = "initialArchitecture";
		PCMArchitectureInstance architecture = mockArchitecture(architectureName);
		generateArchitecturalVersion(architecture, "");
		return architecture;
	}

	/**
	 * Creates a new child architecture based on a parent architecture. For the
	 * initial architecture, {@link #buildNewArchitecture()}} should be used.
	 * 
	 * @param originatingArchitecture
	 *            the parent architecture.
	 * @return
	 */
	public PCMArchitectureInstance buildFrom(PCMArchitectureInstance originatingArchitecture) {
		if (botProperties == null) {
			throw new RuntimeException("Architecture Builder must be connected to a bot");
		}
		String architectureName = generateArchitectureName(originatingArchitecture);
		PCMArchitectureInstance architecture = mockArchitecture(architectureName);
		generateArchitecturalVersion(architecture, botProperties.getBotType());
		return architecture;
	}

	private String generateArchitectureName(PCMArchitectureInstance originatingArchitecture) {
		Integer counter = architectureCounters.get(originatingArchitecture);
		if (counter == null) {
			counter = 0;
		} else {
			counter++;
		}
		architectureCounters.put(originatingArchitecture, counter);
		return originatingArchitecture.getName() + "_" + botProperties.getName() + "_" + counter;
	}

	private PCMArchitectureInstance mockArchitecture(String name) {
		PCMArchitectureInstance architecture = mock(PCMArchitectureInstance.class);
		when(architecture.getName()).thenReturn(name);
		return architecture;
	}
}
