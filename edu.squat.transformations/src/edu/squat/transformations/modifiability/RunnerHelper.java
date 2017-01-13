package edu.squat.transformations.modifiability;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.trace.Trace;
import org.palladiosimulator.pcm.repository.Repository;

public class RunnerHelper {

	public static Trace getTraceRoot(EGraph graph) {
		Trace root = null;
		Iterator<EObject> i = graph.getRoots().iterator();
		while(i.hasNext() && root == null) {
			EObject e = i.next();
			if(e instanceof Trace && ((Trace)e).getName().equals("root"))
				root = (Trace) e;
		}
		return root;
	}
	
	public static Repository getRepositoryRoot(EGraph graph) {
		Repository repository = null;
		Iterator<EObject> i = graph.getRoots().iterator();
		while(i.hasNext() && repository == null) {
			EObject e = i.next();
			if(e instanceof Repository )
				repository = (Repository) e;
		}
		return repository;
	}
	
	public static void saveResult(HenshinResourceSet resourceSet, EGraph graph, String fileName) {
		try {
			Resource resource = resourceSet.createResource(fileName);
			Repository repoRoot = RunnerHelper.getRepositoryRoot(graph);
			Trace traceRoot = RunnerHelper.getTraceRoot(graph);
			resource.getContents().add((EObject) repoRoot);
			resource.getContents().add((EObject) traceRoot);
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
