package io.github.squat_team.export;

import java.util.HashSet;
import java.util.Set;

import io.github.squat_team.negotiation.NegotiatorResult;

/**
 * Default implementation of the {@link IExportController}. Knows the
 * appropriate exporters for all {@link ExporterType}s.
 */
public class ExportController implements IExportController {
	Set<IExporter> exporters = new HashSet<>();

	@Override
	public void register(Set<ExporterType> exporters) {
		for (ExporterType exporter : exporters) {
			register(exporter);
		}
	}

	/**
	 * Registers the appropriate exporter for the specified exporter type.
	 * 
	 * @param exporter
	 */
	private void register(ExporterType exporter) {
		switch (exporter) {
		case CONSOLE:
			exporters.add(new ConsoleExporter());
			break;
		case EXCEL:
			exporters.add(new ExcelExporter());
			break;
		default:
			break;
		}
	}

	@Override
	public void handleLevelTerminated(NegotiatorResult result) {
		for (IExporter exporter : exporters) {
			exporter.handleLevelTerminated(result);
		}
	}

	@Override
	public void handleIntermediateResult(NegotiatorResult result) {
		for (IExporter exporter : exporters) {
			exporter.handleIntermediateResult(result);
		}
	}

	@Override
	public void handleIntermediateState(NegotiatorResult state) {
		for (IExporter exporter : exporters) {
			exporter.handleIntermediateState(state);
		}
	}

}
