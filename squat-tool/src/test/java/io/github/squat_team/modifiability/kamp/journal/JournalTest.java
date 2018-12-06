package io.github.squat_team.modifiability.kamp.journal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.UsageModel;

import io.github.squat_team.model.*;
import io.github.squat_team.modifiability.*;
import io.github.squat_team.modifiability.kamp.KAMPPCMBot;
import io.github.squat_team.util.SQuATHelper;

public class JournalTest {
	private String machinePath;
	private String dirPath;
	private String[] modelNames;
	private String[] repositoryFile;
	private String[] resourceEnvironmentFile;
	private String[] baseSystemFile;
	private String[] baseAllocationFile;
	private String[] baseUsageFile;
	//
	private List<AnalysisResult> results;
	private Map<AnalysisResult, AnalysisResult> resultsMap;
	//
	public JournalTest() {
		this.results = new ArrayList<AnalysisResult>();
		this.resultsMap = new HashMap<AnalysisResult, AnalysisResult>();
	}
	
	public static void main(String[] args) throws Exception {
		JournalTest test = new JournalTest();
		test.runAllTests();
	}
	
	private PCMArchitectureInstance loadSpecificModel(String name, String repositoryFile, String enviromentFile,
			String systemFile, String sllocationFile, String usageFile) {
		Repository repository = SQuATHelper.loadRepositoryModel(repositoryFile);
		ResourceEnvironment resourceEnvironment = SQuATHelper.loadResourceEnvironmentModel(enviromentFile);
		System system = SQuATHelper.loadSystemModel(systemFile);
		Allocation allocation = SQuATHelper.loadAllocationModel(sllocationFile);
		UsageModel usageModel = SQuATHelper.loadUsageModel(usageFile);
		PCMArchitectureInstance instance = new PCMArchitectureInstance(name, repository, system, allocation,
				resourceEnvironment, usageModel);
		return instance;
	}
	
	private void setModifiabilityPCMModel() {
		machinePath = "/Users/alejandrorago/Documents/Implementacion/Repositorios/kamp-test/";
		dirPath = machinePath + "squat-tool/src/test/resources/io/github/squat_team/journal/cocomeWithResourceDemands/";
		String[] localPath = new String[] {
				// initial architecture
				"cocome-cloud",
				// split responsibility
//				"cocome-cloud-17-org.cocome.tradingsystem.cashdeskline.cashdesk.ExpressLightEventHandler",
				"cocome-cloud-5-org.cocome.cloud.web.data.cashdeskdata",
				// wrapper
				"cocome-cloud-26-IUserDisplayModel",
				"cocome-cloud-28-IPrinterModel",
				"cocome-cloud-30-IExpressLightModel",
				"cocome-cloud-31-IExpressLight",
				"cocome-cloud-57-ICashDeskQuery",
				"cocome-cloud-60-org.cocome.cloud.web.data.cashdeskdata.ICashDesk",
				"cocome-cloud-88-ICashDeskDAO"
		};
		modelNames = new String[] {
				// initial architecture
				"cocome-cloud",
				// split responsibility
//				"cocome-cloud-split-ExpressLightEventHandler",
				"cocome-cloud-split-cashdeskdata",
				// wrapper
				"cocome-cloud-wrapper-IUserDisplayModel",
				"cocome-cloud-wrapper-IPrinterModel",
				"cocome-cloud-wrapper-IExpressLightModel",
				"cocome-cloud-wrapper-IExpressLight",
				"cocome-cloud-wrapper-ICashDeskQuery",
				"cocome-cloud-wrapper-ICashDesk",
				"cocome-cloud-wrapper-ICashDeskDAO"
		};
		repositoryFile = new String[modelNames.length];
		resourceEnvironmentFile = new String[modelNames.length];
		baseSystemFile = new String[modelNames.length];
		baseAllocationFile = new String[modelNames.length];
		baseUsageFile = new String[modelNames.length];
		for (int i = 0; i < modelNames.length; i++) {
			repositoryFile[i] = dirPath + localPath[i] + ".repository";
			resourceEnvironmentFile[i] = dirPath + localPath[i] + ".resourceenvironment";
			baseSystemFile[i] = dirPath + localPath[i] + ".system";
			baseAllocationFile[i] = dirPath + localPath[i] + ".allocation";
			baseUsageFile[i] = dirPath + localPath[i] + ".usagemodel";
		}
	}

	public void runAllTests() throws Exception {
		//Modifiability
		this.setModifiabilityPCMModel();
		this.runTests();
	}
	
	private void runTests() throws Exception {
		this.results.clear(); 
		this.resultsMap.clear();
		String evaluationType; ResponseMeasureType type; Comparable response;
		//Affected components
		evaluationType = KAMPPCMBot.TYPE_ELEMENTS;
		type = ResponseMeasureType.NUMERIC;
		response = new Integer(4);
		this.testModifiabilityScenario(this.createModifiabilityNFC(type, response), "NFCPayment", evaluationType);
		response = new Integer(5);
		this.testModifiabilityScenario(this.createModifiabilityVIP(type, response), "VIPCashDesks", evaluationType);
		response = new Integer(11);
		this.testModifiabilityScenario(this.createModifiabilityWithdrawMoney(type, response), "CashWithdraw", evaluationType);
		response = new Integer(3);
		this.testModifiabilityScenario(this.createModifiabilityServiceLog(type, response), "ServiceLog", evaluationType);
		//Complexity 
		evaluationType = KAMPPCMBot.TYPE_COMPLEXITY;
		type = ResponseMeasureType.DECIMAL;
		response = new Float(1200);
		this.testModifiabilityScenario(this.createModifiabilityNFC(type, response), "NFCPayment", evaluationType);
		response = new Float(5000);
		this.testModifiabilityScenario(this.createModifiabilityVIP(type, response), "VIPCashDesks", evaluationType);
		response = new Float(200);
		this.testModifiabilityScenario(this.createModifiabilityWithdrawMoney(type, response), "CashWithdraw", evaluationType);
		response = new Float(2000);
		this.testModifiabilityScenario(this.createModifiabilityServiceLog(type, response), "ServiceLog", evaluationType);
		//Print code
		this.printCode();
	}

	@SuppressWarnings("rawtypes")
	public void testModifiabilityScenario(PCMScenario scenario, String scenarioName, String evaluationType) throws Exception {
		boolean debug = true;
		Comparable expectedResponse = scenario.getExpectedResult().getResponse();
		if(debug) java.lang.System.out.println("The goal of scenario " + scenarioName + ": " + expectedResponse.toString());
		KAMPPCMBot bot = new KAMPPCMBot(scenario);
		bot.setEvaluationType(evaluationType);
		if(debug) java.lang.System.out.println("The evaluation type is: " + evaluationType);
		//
		for (int i = 0; i < modelNames.length; i++) {
			PCMArchitectureInstance model = this.loadSpecificModel(modelNames[i], repositoryFile[i], resourceEnvironmentFile[i], baseSystemFile[i], baseAllocationFile[i], baseUsageFile[i]);
			PCMScenarioResult scenarioResult = bot.analyze(model,"");
			String satisfaction_alt1 = scenarioResult.isSatisfied() >= 0 ? "SATISFIED" : "NOT SATISFIED";
			if(debug) java.lang.System.out.println("The scenario satisfaction with " + model.getName() + " is: " + satisfaction_alt1);
			Comparable response_alt1 = scenarioResult.getResult().getResponse();
			if(response_alt1 instanceof Integer)
				if(debug) java.lang.System.out.println("The response measure of the scenario is: " + ((Integer) response_alt1).intValue());
			if(response_alt1 instanceof Float)
				if(debug) java.lang.System.out.println("The response measure of the scenario is: " + ((Float) response_alt1).floatValue());
			//
			AnalysisResult analysisResult = new AnalysisResult();
			analysisResult.qa = "Modifiability";
			analysisResult.scenario = scenarioName.toLowerCase();
			analysisResult.model = model.getName();
			if(resultsMap.keySet().contains(analysisResult)) {
				analysisResult = resultsMap.get(analysisResult);
			}
			else {
				results.add(analysisResult);
				resultsMap.put(analysisResult, analysisResult);
			}
			analysisResult.measureValues.put(evaluationType, response_alt1);
		}
	}
	
	private PCMScenario createModifiabilityNFC(ResponseMeasureType type, Comparable response) {
		ModifiabilityPCMScenario scenario = new ModifiabilityPCMScenario(OptimizationType.MINIMIZATION);
		PCMResult expectedResult = new PCMResult(type);
		expectedResult.setResponse(response);
		scenario.setExpectedResponse(expectedResult);
		//
		ModifiabilityInstruction nfcInterface = new ModifiabilityInstruction();
		nfcInterface.operation = ModifiabilityOperation.CREATE;
		nfcInterface.element = ModifiabilityElement.INTERFACE;
		nfcInterface.parameters.put("name", "INFCPayment");
		scenario.addChange(nfcInterface);
		//
		ModifiabilityInstruction nfcScanOp = new ModifiabilityInstruction();
		nfcScanOp.operation = ModifiabilityOperation.CREATE;
		nfcScanOp.element = ModifiabilityElement.OPERATION;
		nfcScanOp.parameters.put("iname", "INFCPayment");
		nfcScanOp.parameters.put("oname", "NFCDeviceScannedEvent");
		scenario.addChange(nfcScanOp);
		//
		ModifiabilityInstruction nfcAproveOp = new ModifiabilityInstruction();
		nfcAproveOp.operation = ModifiabilityOperation.CREATE;
		nfcAproveOp.element = ModifiabilityElement.OPERATION;
		nfcAproveOp.parameters.put("iname", "INFCPayment");
		nfcAproveOp.parameters.put("oname", "NFCAproveTransaction");
		scenario.addChange(nfcAproveOp);
		//
		ModifiabilityInstruction connectorLink = new ModifiabilityInstruction();
		connectorLink.operation = ModifiabilityOperation.CREATE;
		connectorLink.element = ModifiabilityElement.REQUIREDROLE;
		connectorLink.parameters.put("cname", "org.cocome.cloud.web.connector.cashdeskconnector");
		connectorLink.parameters.put("iname", "INFCPayment");
		scenario.addChange(connectorLink);
		//
		ModifiabilityInstruction cashDeskNewOps = new ModifiabilityInstruction();
		cashDeskNewOps.operation = ModifiabilityOperation.MODIFY;
		cashDeskNewOps.element = ModifiabilityElement.INTERFACE;
		cashDeskNewOps.parameters.put("name", "ICashDeskQuery");
		scenario.addChange(cashDeskNewOps);
		//
		ModifiabilityInstruction applePayComp = new ModifiabilityInstruction();
		applePayComp.operation = ModifiabilityOperation.CREATE;
		applePayComp.element = ModifiabilityElement.COMPONENT;
		applePayComp.parameters.put("name", "org.cocome.tradingsystem.cashdeskline.cashdesk.ApplePayPayment");
		scenario.addChange(applePayComp);
		//
		ModifiabilityInstruction applePayProvRole = new ModifiabilityInstruction();
		applePayProvRole.operation = ModifiabilityOperation.CREATE;
		applePayProvRole.element = ModifiabilityElement.PROVIDEDROLE;
		applePayProvRole.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.ApplePayPayment");
		applePayProvRole.parameters.put("iname", "INFCPayment");
		scenario.addChange(applePayProvRole);
		//
		ModifiabilityInstruction googleComp = new ModifiabilityInstruction();
		googleComp.operation = ModifiabilityOperation.CREATE;
		googleComp.element = ModifiabilityElement.COMPONENT;
		googleComp.parameters.put("name", "org.cocome.tradingsystem.cashdeskline.cashdesk.GoogleWalletPayment");
		scenario.addChange(googleComp);
		//
		ModifiabilityInstruction googleProvRole = new ModifiabilityInstruction();
		googleProvRole.operation = ModifiabilityOperation.CREATE;
		googleProvRole.element = ModifiabilityElement.PROVIDEDROLE;
		googleProvRole.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.GoogleWalletPayment");
		googleProvRole.parameters.put("iname", "INFCPayment");
		scenario.addChange(applePayProvRole);
		//
		return scenario;
	}
	
	private PCMScenario createModifiabilityVIP(ResponseMeasureType type, Comparable response) {
		ModifiabilityPCMScenario scenario = new ModifiabilityPCMScenario(OptimizationType.MINIMIZATION);
		PCMResult expectedResult = new PCMResult(type);
		expectedResult.setResponse(response);
		scenario.setExpectedResponse(expectedResult);
		//
		ModifiabilityInstruction barLightInt = new ModifiabilityInstruction();
		barLightInt.operation = ModifiabilityOperation.MODIFY;
		barLightInt.element = ModifiabilityElement.INTERFACE;
		barLightInt.parameters.put("name", "IExpressLight");
		scenario.addChange(barLightInt);
		ModifiabilityInstruction vipOnOp = new ModifiabilityInstruction();
		vipOnOp.operation = ModifiabilityOperation.CREATE;
		vipOnOp.element = ModifiabilityElement.OPERATION;
		vipOnOp.parameters.put("iname", "IExpressLight");
		vipOnOp.parameters.put("oname", "turnVIPModeOn");
		scenario.addChange(vipOnOp);
		ModifiabilityInstruction vipOffOp = new ModifiabilityInstruction();
		vipOffOp.operation = ModifiabilityOperation.CREATE;
		vipOffOp.element = ModifiabilityElement.OPERATION;
		vipOffOp.parameters.put("iname", "IExpressLight");
		vipOffOp.parameters.put("oname", "turnVIPModeOff");
		scenario.addChange(vipOffOp);
		ModifiabilityInstruction setColorOp = new ModifiabilityInstruction();
		setColorOp.operation = ModifiabilityOperation.CREATE;
		setColorOp.element = ModifiabilityElement.OPERATION;
		setColorOp.parameters.put("iname", "IExpressLight");
		setColorOp.parameters.put("oname", "setColor");
		scenario.addChange(setColorOp);
//		ModifiabilityInstruction barLightComp = new ModifiabilityInstruction();
//		barLightComp.operation = ModifiabilityOperation.MODIFY;
//		barLightComp.element = ModifiabilityElement.COMPONENT;
//		barLightComp.parameters.put("name", "org.cocome.cloud.logic.webservice.cashdeskline.cashdeskservice.expresslight");
//		scenario.addChange(barLightComp);
		//
		ModifiabilityInstruction VIPIdentifierInt = new ModifiabilityInstruction();
		VIPIdentifierInt.operation = ModifiabilityOperation.CREATE;
		VIPIdentifierInt.element = ModifiabilityElement.INTERFACE;
		VIPIdentifierInt.parameters.put("name", "IVIPIdentifier");
		scenario.addChange(VIPIdentifierInt);
		ModifiabilityInstruction isVIPOp = new ModifiabilityInstruction();
		isVIPOp.operation = ModifiabilityOperation.CREATE;
		isVIPOp.element = ModifiabilityElement.OPERATION;
		isVIPOp.parameters.put("iname", "IVIPIdentifier");
		isVIPOp.parameters.put("oname", "isVIP");
		scenario.addChange(isVIPOp);
		ModifiabilityInstruction VIPIdentifierComp = new ModifiabilityInstruction();
		VIPIdentifierComp.operation = ModifiabilityOperation.CREATE;
		VIPIdentifierComp.element = ModifiabilityElement.COMPONENT;
		VIPIdentifierComp.parameters.put("name", "org.cocome.tradingsystem.cashdeskline.cashdesk.VIPIdentifier");
		scenario.addChange(VIPIdentifierComp);
		ModifiabilityInstruction vipIdentifierProvRole = new ModifiabilityInstruction();
		vipIdentifierProvRole.operation = ModifiabilityOperation.CREATE;
		vipIdentifierProvRole.element = ModifiabilityElement.PROVIDEDROLE;
		vipIdentifierProvRole.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.VIPIdentifier");
		vipIdentifierProvRole.parameters.put("iname", "IVIPIdentifier");
		scenario.addChange(vipIdentifierProvRole);
		//
//		ModifiabilityInstruction connectorLink = new ModifiabilityInstruction();
//		connectorLink.operation = ModifiabilityOperation.CREATE;
//		connectorLink.element = ModifiabilityElement.REQUIREDROLE;
//		connectorLink.parameters.put("cname", "org.cocome.cloud.web.data.cashdeskdata");
//		connectorLink.parameters.put("iname", "IVIPIdentifier");
//		scenario.addChange(connectorLink);
		//
		ModifiabilityInstruction cashDeskInterface = new ModifiabilityInstruction();
		cashDeskInterface.operation = ModifiabilityOperation.MODIFY;
		cashDeskInterface.element = ModifiabilityElement.INTERFACE;
		cashDeskInterface.parameters.put("name", "org.cocome.cloud.web.data.cashdeskdata.ICashDesk");
		scenario.addChange(cashDeskInterface);
		//
		return scenario;
	}
	
	private PCMScenario createModifiabilityWithdrawMoney(ResponseMeasureType type, Comparable response) {
		ModifiabilityPCMScenario scenario = new ModifiabilityPCMScenario(OptimizationType.MINIMIZATION);
		PCMResult expectedResult = new PCMResult(type);
		expectedResult.setResponse(response);
		scenario.setExpectedResponse(expectedResult);
		//
		ModifiabilityInstruction withdrawInt = new ModifiabilityInstruction();
		withdrawInt.operation = ModifiabilityOperation.CREATE;
		withdrawInt.element = ModifiabilityElement.INTERFACE;
		withdrawInt.parameters.put("name", "IWithdrawMoney");
		scenario.addChange(withdrawInt);
		ModifiabilityInstruction withdrawOp = new ModifiabilityInstruction();
		withdrawOp.operation = ModifiabilityOperation.CREATE;
		withdrawOp.element = ModifiabilityElement.OPERATION;
		withdrawOp.parameters.put("iname", "IWithdrawMoney");
		withdrawOp.parameters.put("oname", "authorizeExtraction");
		scenario.addChange(withdrawOp);
		//
		ModifiabilityInstruction signatureInt = new ModifiabilityInstruction();
		signatureInt.operation = ModifiabilityOperation.CREATE;
		signatureInt.element = ModifiabilityElement.INTERFACE;
		signatureInt.parameters.put("name", "IDigitalSignature");
		scenario.addChange(signatureInt);
		ModifiabilityInstruction validateSignatureOp = new ModifiabilityInstruction();
		validateSignatureOp.operation = ModifiabilityOperation.CREATE;
		validateSignatureOp.element = ModifiabilityElement.OPERATION;
		validateSignatureOp.parameters.put("iname", "IDigitalSignature");
		validateSignatureOp.parameters.put("oname", "validateSignature");
		scenario.addChange(validateSignatureOp);
		ModifiabilityInstruction saveSignatureOp = new ModifiabilityInstruction();
		saveSignatureOp.operation = ModifiabilityOperation.CREATE;
		saveSignatureOp.element = ModifiabilityElement.OPERATION;
		saveSignatureOp.parameters.put("iname", "IDigitalSignature");
		saveSignatureOp.parameters.put("oname", "saveSignature");
		scenario.addChange(saveSignatureOp);
		ModifiabilityInstruction getSignatureOp = new ModifiabilityInstruction();
		getSignatureOp.operation = ModifiabilityOperation.CREATE;
		getSignatureOp.element = ModifiabilityElement.OPERATION;
		getSignatureOp.parameters.put("iname", "IDigitalSignature");
		getSignatureOp.parameters.put("oname", "getSignature");
		scenario.addChange(getSignatureOp);
		//
		ModifiabilityInstruction banelcoWithdrawComp = new ModifiabilityInstruction();
		banelcoWithdrawComp.operation = ModifiabilityOperation.CREATE;
		banelcoWithdrawComp.element = ModifiabilityElement.COMPONENT;
		banelcoWithdrawComp.parameters.put("name", "org.cocome.tradingsystem.cashdeskline.cashdesk.BanelcoWithdrawal");
		scenario.addChange(banelcoWithdrawComp);
		ModifiabilityInstruction linkWithdrawComp = new ModifiabilityInstruction();
		linkWithdrawComp.operation = ModifiabilityOperation.CREATE;
		linkWithdrawComp.element = ModifiabilityElement.COMPONENT;
		linkWithdrawComp.parameters.put("name", "org.cocome.tradingsystem.cashdeskline.cashdesk.LinkWithdrawal");
		scenario.addChange(linkWithdrawComp);
		ModifiabilityInstruction visaWithdrawComp = new ModifiabilityInstruction();
		visaWithdrawComp.operation = ModifiabilityOperation.CREATE;
		visaWithdrawComp.element = ModifiabilityElement.COMPONENT;
		visaWithdrawComp.parameters.put("name", "org.cocome.tradingsystem.cashdeskline.cashdesk.VisaWithdrawal");
		scenario.addChange(visaWithdrawComp);
		//
		ModifiabilityInstruction banelcoProvRole = new ModifiabilityInstruction();
		banelcoProvRole.operation = ModifiabilityOperation.CREATE;
		banelcoProvRole.element = ModifiabilityElement.PROVIDEDROLE;
		banelcoProvRole.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.BanelcoWithdrawal");
		banelcoProvRole.parameters.put("iname", "IWithdrawMoney");
		scenario.addChange(banelcoProvRole);
		ModifiabilityInstruction linkProvRole = new ModifiabilityInstruction();
		linkProvRole.operation = ModifiabilityOperation.CREATE;
		linkProvRole.element = ModifiabilityElement.PROVIDEDROLE;
		linkProvRole.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.LinkWithdrawal");
		linkProvRole.parameters.put("iname", "IWithdrawMoney");
		scenario.addChange(linkProvRole);
		ModifiabilityInstruction visaProvRole = new ModifiabilityInstruction();
		visaProvRole.operation = ModifiabilityOperation.CREATE;
		visaProvRole.element = ModifiabilityElement.PROVIDEDROLE;
		visaProvRole.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.VisaWithdrawal");
		visaProvRole.parameters.put("iname", "IWithdrawMoney");
		scenario.addChange(visaProvRole);
		//
		ModifiabilityInstruction signatureComp = new ModifiabilityInstruction();
		signatureComp.operation = ModifiabilityOperation.CREATE;
		signatureComp.element = ModifiabilityElement.COMPONENT;
		signatureComp.parameters.put("name", "org.cocome.tradingsystem.cashdeskline.cashdesk.DigitalSignature");
		scenario.addChange(signatureComp);
		ModifiabilityInstruction signatureProvRole = new ModifiabilityInstruction();
		signatureProvRole.operation = ModifiabilityOperation.CREATE;
		signatureProvRole.element = ModifiabilityElement.PROVIDEDROLE;
		signatureProvRole.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.DigitalSignature");
		signatureProvRole.parameters.put("iname", "IDigitalSignature");
		scenario.addChange(signatureProvRole);
		//
		ModifiabilityInstruction cardReaderWithdrawReqRole = new ModifiabilityInstruction();
		cardReaderWithdrawReqRole.operation = ModifiabilityOperation.CREATE;
		cardReaderWithdrawReqRole.element = ModifiabilityElement.REQUIREDROLE;
		cardReaderWithdrawReqRole.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.CardReader");
		cardReaderWithdrawReqRole.parameters.put("iname", "IWithdrawMoney");
		scenario.addChange(cardReaderWithdrawReqRole);
		ModifiabilityInstruction cardReaderSignatureReqRole = new ModifiabilityInstruction();
		cardReaderSignatureReqRole.operation = ModifiabilityOperation.CREATE;
		cardReaderSignatureReqRole.element = ModifiabilityElement.REQUIREDROLE;
		cardReaderSignatureReqRole.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.CardReader");
		cardReaderSignatureReqRole.parameters.put("iname", "IDigitalSignature");
		scenario.addChange(cardReaderSignatureReqRole);
		ModifiabilityInstruction cardReaderInt = new ModifiabilityInstruction();
		cardReaderInt.operation = ModifiabilityOperation.MODIFY;
		cardReaderInt.element = ModifiabilityElement.INTERFACE;
		cardReaderInt.parameters.put("name", "ICardReaderModel");
		scenario.addChange(cardReaderInt);
		//
		ModifiabilityInstruction printerInt = new ModifiabilityInstruction();
		printerInt.operation = ModifiabilityOperation.MODIFY;
		printerInt.element = ModifiabilityElement.INTERFACE;
		printerInt.parameters.put("name", "IPrinterModel");
		scenario.addChange(printerInt);
		ModifiabilityInstruction displayInt = new ModifiabilityInstruction();
		displayInt.operation = ModifiabilityOperation.MODIFY;
		displayInt.element = ModifiabilityElement.INTERFACE;
		displayInt.parameters.put("name", "IUserDisplayModel");
		scenario.addChange(displayInt);
		//
		return scenario;
	}
	
	private PCMScenario createModifiabilityServiceLog(ResponseMeasureType type, Comparable response) {
		ModifiabilityPCMScenario scenario = new ModifiabilityPCMScenario(OptimizationType.MINIMIZATION);
		PCMResult expectedResult = new PCMResult(type);
		expectedResult.setResponse(response);
		scenario.setExpectedResponse(expectedResult);
		//
		ModifiabilityInstruction logStorageInt = new ModifiabilityInstruction();
		logStorageInt.operation = ModifiabilityOperation.CREATE;
		logStorageInt.element = ModifiabilityElement.INTERFACE;
		logStorageInt.parameters.put("name", "ILogStorage");
		scenario.addChange(logStorageInt);
		ModifiabilityInstruction storeEventOp = new ModifiabilityInstruction();
		storeEventOp.operation = ModifiabilityOperation.CREATE;
		storeEventOp.element = ModifiabilityElement.OPERATION;
		storeEventOp.parameters.put("iname", "ILogStorage");
		storeEventOp.parameters.put("oname", "storeEvent");
		scenario.addChange(storeEventOp);
		ModifiabilityInstruction logStorageComp = new ModifiabilityInstruction();
		logStorageComp.operation = ModifiabilityOperation.CREATE;
		logStorageComp.element = ModifiabilityElement.COMPONENT;
		logStorageComp.parameters.put("name", "org.cocome.tradingsystem.LogStorage");
		scenario.addChange(logStorageComp);
		ModifiabilityInstruction logProvRole = new ModifiabilityInstruction();
		logProvRole.operation = ModifiabilityOperation.CREATE;
		logProvRole.element = ModifiabilityElement.PROVIDEDROLE;
		logProvRole.parameters.put("cname", "org.cocome.tradingsystem.LogStorage");
		logProvRole.parameters.put("iname", "ILogStorage");
		scenario.addChange(logProvRole);
		//
		ModifiabilityInstruction cashDeskDAOInterface = new ModifiabilityInstruction();
		cashDeskDAOInterface.operation = ModifiabilityOperation.MODIFY;
		cashDeskDAOInterface.element = ModifiabilityElement.INTERFACE;
		cashDeskDAOInterface.parameters.put("name", "ICashDeskDAO");
		scenario.addChange(cashDeskDAOInterface);
		//
		return scenario;
	}
	
	public void printCode() {
		for(AnalysisResult r : results) {
			if(r.qa.equals("Modifiability")) {
				String variableName = r.scenario + "Bot";
				String methodName = ".insertInOrder";
				String classType = r.qa + "Proposal";
				String components = r.measureValues.get(KAMPPCMBot.TYPE_ELEMENTS).toString();
				String complexity = r.measureValues.get(KAMPPCMBot.TYPE_COMPLEXITY).toString() + "f";
				String parameters = "(" + components + ", " + complexity + ", \"" + r.model + "\")";
				String codeLine = variableName + methodName + "(" + "new " + classType + parameters + ")" + ";";
				java.lang.System.out.println(codeLine);
			}
		}
	}

	class AnalysisResult {
		public String qa;
		public String scenario;
		public String model;
		public Map<String, Comparable> measureValues;
		
		public AnalysisResult() {
			measureValues = new HashMap<String, Comparable>();
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((model == null) ? 0 : model.hashCode());
			result = prime * result + ((qa == null) ? 0 : qa.hashCode());
			result = prime * result + ((scenario == null) ? 0 : scenario.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AnalysisResult other = (AnalysisResult) obj;
			if (model == null) {
				if (other.model != null)
					return false;
			} else if (!model.equals(other.model))
				return false;
			if (qa == null) {
				if (other.qa != null)
					return false;
			} else if (!qa.equals(other.qa))
				return false;
			if (scenario == null) {
				if (other.scenario != null)
					return false;
			} else if (!scenario.equals(other.scenario))
				return false;
			return true;
		}
	}
}
