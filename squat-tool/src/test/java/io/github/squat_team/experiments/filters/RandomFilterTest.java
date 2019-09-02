package io.github.squat_team.experiments.filters;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.squat.transformations.ArchitecturalVersion;
import io.github.squat_team.AbstractPCMBot;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Tests the {@link RandomFilter}.
 */
public class RandomFilterTest {
	
	/**
	 * Tests the filter for three different quality attributes.
	 */
	@Test
	public void testThreeQualityAttributes() {
		int filterSize = 50;
		List<ArchitecturalVersion> allArchitectures = createAllArchitectures();
		List<ArchitecturalVersion> filteredArchitectures = executeFilter(allArchitectures, filterSize);
		validate(filteredArchitectures, filterSize);
	}
	

	private List<ArchitecturalVersion> createAllArchitectures(){
		List<ArchitecturalVersion> performanceArchitectures = mockMultipleArchitecturalVersions(80,
				AbstractPCMBot.QA_PERFORMANCE);
		List<ArchitecturalVersion> modifiabilityArchitectures = mockMultipleArchitecturalVersions(320,
				AbstractPCMBot.QA_MODIFIABILITY);
		List<ArchitecturalVersion> reliabilityArchitectures = mockMultipleArchitecturalVersions(100,
				AbstractPCMBot.QA_RELIABILITY);

		List<ArchitecturalVersion> allArchitectures = new ArrayList<>();
		allArchitectures.addAll(performanceArchitectures);
		allArchitectures.addAll(modifiabilityArchitectures);
		allArchitectures.addAll(reliabilityArchitectures);
		
		return allArchitectures;
	}
	
	private List<ArchitecturalVersion> executeFilter(List<ArchitecturalVersion> architectures, int filterSize){
		RandomFilter filter = new RandomFilter(filterSize);
		assertTrue(filter.checkPrecondition(architectures, null));
		return filter.filter(architectures, null, null, null);	
	}
	
	private void validate(List<ArchitecturalVersion> filteredArchitectures, int filterSize) {
		int modifiabilityCount = 0;
		int performanceCount = 0;
		int reliabilityCount = 0;
		for (ArchitecturalVersion alternative : filteredArchitectures) {
			switch (alternative.getLastModifiedBy()) {
			case AbstractPCMBot.QA_MODIFIABILITY:
				modifiabilityCount++;
				break;
			case AbstractPCMBot.QA_PERFORMANCE:
				performanceCount++;
				break;
			case AbstractPCMBot.QA_RELIABILITY:
				reliabilityCount++;
				break;
			}
		}
		assertEquals(filterSize, filteredArchitectures.size());
		assertEquals(32, modifiabilityCount);
		assertEquals(8, performanceCount);
		assertEquals(10, reliabilityCount);
	}

	private List<ArchitecturalVersion> mockMultipleArchitecturalVersions(int amount, String lastModifiedBy) {
		List<ArchitecturalVersion> architecturalVersions = new ArrayList<>();
		for (int i = 0; i < amount; i++) {
			architecturalVersions.add(mockArchitecturalVersion(lastModifiedBy));
		}
		return architecturalVersions;
	}

	private ArchitecturalVersion mockArchitecturalVersion(String lastModifiedBy) {
		ArchitecturalVersion architecturalVersion = mock(ArchitecturalVersion.class);
		when(architecturalVersion.getLastModifiedBy()).thenReturn(lastModifiedBy);
		when(architecturalVersion.wasLastModifiedBy(anyString())).thenReturn(false);
		when(architecturalVersion.wasLastModifiedBy(eq(lastModifiedBy))).thenReturn(true);
		return architecturalVersion;
	}

}
