package io.github.squat_team.export;

import java.util.Set;

/**
 * The export controller registers the configured exporters and redirects export
 * requests to the appropriate exporters.
 */
public interface IExportController extends IExporter {

	/**
	 * Registers the exporters of the given type. All previously registered
	 * exporters are disabled, if they are not mentioned again.
	 * 
	 * @param exporters
	 *            the exporters for the specified export formats are registered by
	 *            the controller.
	 */
	public void register(Set<ExporterType> exporters);
}
