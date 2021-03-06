package edu.squat.headlesskamp;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import edu.kit.ipd.sdq.kamp.core.ArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp.core.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.core.ArchitectureVersion;

public class SimpleKAMPTest extends AbstractKAMPTest {
	
	@Override
	public String getInitialModelName() {
		return "ClientServerDatabase";
	}
	
	@Override
	public String getChangeScenarioName() {
		return "InsertDatabaseCache";
	}
	
	@Override
	public ArchitectureVersion setupInitialModel(String initialArchitectureName) {
		/** Base model creation **/
		// 0. Create empty architecture model (container of all pcm models)
		ArchitectureVersion baseAV = ArchitectureModelFactoryFacade.createEmptyModel(initialArchitectureName);
		// 1. Create: base model (repository) - Modules View
		// 1.1. Create components
		BasicComponent client = ArchitectureModelFactoryFacade.createBasicComponent(baseAV, "Client");
		BasicComponent server = ArchitectureModelFactoryFacade.createBasicComponent(baseAV, "Server");
		BasicComponent database = ArchitectureModelFactoryFacade.createBasicComponent(baseAV, "Database");
		// 1.2. Create interfaces
		OperationInterface clientInterface = ArchitectureModelFactoryFacade.createInterface(baseAV, "ClientInterface");
		OperationInterface serverInterface = ArchitectureModelFactoryFacade.createInterface(baseAV, "ServerInterface");
		OperationInterface databaseInterface = ArchitectureModelFactoryFacade.createInterface(baseAV, "DatabaseInterface");
		// 1.3. Create connections between components and interfaces
		// 1.3.1. Client's perspective
		ArchitectureModelFactoryFacade.createProvidedRole(client, clientInterface);
		ArchitectureModelFactoryFacade.createRequiredRole(client, serverInterface);
		// 1.3.2. Server's perspective
		ArchitectureModelFactoryFacade.createProvidedRole(server, serverInterface);
		ArchitectureModelFactoryFacade.createRequiredRole(server, databaseInterface);
		// 1.3.3. Database's perspective
		ArchitectureModelFactoryFacade.createProvidedRole(database, databaseInterface);
		// 2. Create: base model (system) - Components & Connectors View?
		// 2.1. Create assembly context for the components
		ArchitectureModelFactoryFacade.createAssemblyContext(client, baseAV);
		ArchitectureModelFactoryFacade.createAssemblyContext(server, baseAV);
		ArchitectureModelFactoryFacade.createAssemblyContext(database, baseAV);
		// 2.2. Associate components with assembly connectors
		ArchitectureModelFactoryFacade.createAssemblyConnector(client, server, baseAV);
		ArchitectureModelFactoryFacade.createAssemblyConnector(server, database, baseAV);
		// 2.3. Create interface operations
		CompositeDataType dataType = ArchitectureModelFactoryFacade.createCompositeDatatype(baseAV, "mydatatype");
		OperationSignature signature = ArchitectureModelFactoryFacade.createSignatureForInterface(clientInterface, "myOperation");
		ArchitectureModelFactoryFacade.createParameterForSignature(signature, "myParameter", dataType);
		/** Component internal dependencies **/
		// 3. Create: component internal dependencies - don't know if it is important or not (probably it is for change impact analyses)
		// TBD
		// 4. Setup internal dependencies mode of operation - pessimistic modeling
		// This call creates an internal dependency for each pair of provided role and required role inside a component
		ArchitectureModelFactoryFacade.setupComponentInternalDependenciesPessimistic(baseAV);
		/** Annotation model creation **/
		// TBD
		return baseAV;
	}
	
	@Override
	public ArchitectureVersion setupChangedModel(String changeScenarioName) {
		/** Change request 1 **/
		// 1. Clone initial model 
		ArchitectureVersion changedAV = KAMPHelper.createArchitectureVersionClone(baseAV, changeScenarioName);
		
		// 2. Model change request
		// 2.1. Alter repository view (modules view) by adding a new cache interface and component with its respective roles
		BasicComponent cacheComponent = ArchitectureModelFactoryFacade.createBasicComponent(changedAV, "DatabaseCache");
		OperationInterface dbInterface = (OperationInterface) ArchitectureModelLookup.lookUpInterfaceByName(changedAV, "DatabaseInterface");
		OperationProvidedRole cacheProvidedRole = ArchitectureModelFactoryFacade.createProvidedRole(cacheComponent, dbInterface);
		OperationRequiredRole cacheRequiredRole = ArchitectureModelFactoryFacade.createRequiredRole(cacheComponent, dbInterface);
		// 2.1.1. Add internal dependency among the roles
		ArchitectureModelFactoryFacade.createComponentInternalDependency(changedAV, cacheProvidedRole, cacheRequiredRole);
		
		// 2.2. Alter system view (components & connectors view)
		// 2.2.0. Lookup affected components (server & database)
		RepositoryComponent server = ArchitectureModelLookup.lookUpComponentByName(changedAV, "Server");
		RepositoryComponent database = ArchitectureModelLookup.lookUpComponentByName(changedAV, "Database");
		// 2.2.1. Lookup affected assembly contexts and connectors
		AssemblyContext databaseContext = ArchitectureModelLookup.lookUpAssemblyContextsForRepositoryComponent(changedAV, database).get(0);
		AssemblyContext serverContext = ArchitectureModelLookup.lookUpAssemblyContextsForRepositoryComponent(changedAV, server).get(0);
		AssemblyConnector databaseServerConnector = ArchitectureModelLookup.lookUpAssemblyConnectorsBetweenAssemblyContexts(databaseContext, serverContext).get(0);
		// 2.2.2. Delete old assembly connector
		ArchitectureModelFactoryFacade.deleteAssemblyConnector(databaseServerConnector);
		// 2.2.3. Create new assembly contexts and connectors for the cache
		ArchitectureModelFactoryFacade.createAssemblyContext(cacheComponent, changedAV);
		@SuppressWarnings("unused")
		AssemblyContext cacheAssemblyContext = ArchitectureModelLookup.lookUpAssemblyContextsForRepositoryComponent(changedAV, cacheComponent).get(0);
		ArchitectureModelFactoryFacade.createAssemblyConnector(server, cacheComponent, changedAV);
		ArchitectureModelFactoryFacade.createAssemblyConnector(cacheComponent, database, changedAV);
		// 2.3. Mark internal modification of the database component
		ArchitectureModelFactoryFacade.assignInternalModificationMarkToComponent(changedAV, database);
		//List<ModifyComponent> internalModificationMarks = ArchitectureModelLookup.lookUpModificationMarksForComponent(subVersion, database);
		return changedAV;
	}
	
	@Override
	public void runTest() {
		try {
			baseAV = this.setupInitialModel(this.getInitialModelName());
			changedAV = this.setupChangedModel(this.getChangeScenarioName());
			this.deriveWorkplan();
			this.runChangeAnalysis();
			this.tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		SimpleKAMPTest testNew = new SimpleKAMPTest();
		testNew.runTest();
	}
}
