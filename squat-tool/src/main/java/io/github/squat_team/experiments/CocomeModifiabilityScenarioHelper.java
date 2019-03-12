package io.github.squat_team.experiments;

import io.github.squat_team.model.OptimizationType;
import io.github.squat_team.model.PCMResult;
import io.github.squat_team.model.PCMScenario;
import io.github.squat_team.model.ResponseMeasureType;
import io.github.squat_team.modifiability.ModifiabilityElement;
import io.github.squat_team.modifiability.ModifiabilityInstruction;
import io.github.squat_team.modifiability.ModifiabilityOperation;
import io.github.squat_team.modifiability.ModifiabilityPCMScenario;

@SuppressWarnings("rawtypes")
public class CocomeModifiabilityScenarioHelper {

	public PCMScenario createModifiabilityNFC(ResponseMeasureType type, Comparable response) {
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
		ModifiabilityInstruction applePayComp = new ModifiabilityInstruction();
		applePayComp.operation = ModifiabilityOperation.CREATE;
		applePayComp.element = ModifiabilityElement.COMPONENT;
		applePayComp.parameters.put("name", "org.cocome.tradingsystem.cashdeskline.cashdesk.ApplePayPayment");
		scenario.addChange(applePayComp);
		//
		ModifiabilityInstruction googleComp = new ModifiabilityInstruction();
		googleComp.operation = ModifiabilityOperation.CREATE;
		googleComp.element = ModifiabilityElement.COMPONENT;
		googleComp.parameters.put("name", "org.cocome.tradingsystem.cashdeskline.cashdesk.GoogleWalletPayment");
		scenario.addChange(googleComp);
		//
		ModifiabilityInstruction applePayProvRole = new ModifiabilityInstruction();
		applePayProvRole.operation = ModifiabilityOperation.CREATE;
		applePayProvRole.element = ModifiabilityElement.PROVIDEDROLE;
		applePayProvRole.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.ApplePayPayment");
		applePayProvRole.parameters.put("iname", "INFCPayment");
		scenario.addChange(applePayProvRole);
		//
		ModifiabilityInstruction googleProvRole = new ModifiabilityInstruction();
		googleProvRole.operation = ModifiabilityOperation.CREATE;
		googleProvRole.element = ModifiabilityElement.PROVIDEDROLE;
		googleProvRole.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.GoogleWalletPayment");
		googleProvRole.parameters.put("iname", "INFCPayment");
		scenario.addChange(googleProvRole);
		//
		/*
		 * ModifiabilityInstruction connectorLink = new ModifiabilityInstruction();
		 * connectorLink.operation = ModifiabilityOperation.CREATE;
		 * connectorLink.element = ModifiabilityElement.REQUIREDROLE;
		 * connectorLink.parameters.put("cname",
		 * "org.cocome.cloud.web.connector.cashdeskconnector");
		 * connectorLink.parameters.put("iname", "INFCPayment");
		 * scenario.addChange(connectorLink);
		 */
		//
		/*
		 * ModifiabilityInstruction cashDeskNewOps = new ModifiabilityInstruction();
		 * cashDeskNewOps.operation = ModifiabilityOperation.MODIFY;
		 * cashDeskNewOps.element = ModifiabilityElement.INTERFACE;
		 * cashDeskNewOps.parameters.put("name", "ICashDeskQuery");
		 * scenario.addChange(cashDeskNewOps);
		 */

		//

		// Additionals
		ModifiabilityInstruction connectorLink = new ModifiabilityInstruction();
		connectorLink.operation = ModifiabilityOperation.CREATE;
		connectorLink.element = ModifiabilityElement.REQUIREDROLE;
		connectorLink.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.CashDeskEventHandler");
		connectorLink.parameters.put("iname", "INFCPayment");
		scenario.addChange(connectorLink);

		ModifiabilityInstruction connectorLink2 = new ModifiabilityInstruction();
		connectorLink2.operation = ModifiabilityOperation.CREATE;
		connectorLink2.element = ModifiabilityElement.REQUIREDROLE;
		connectorLink2.parameters.put("cname", "org.cocome.tradingsystem.cashdeskline.cashdesk.CashBoxEventHandler");
		connectorLink2.parameters.put("iname", "INFCPayment");
		scenario.addChange(connectorLink2);

		ModifiabilityInstruction cashDeskNewOps = new ModifiabilityInstruction();
		cashDeskNewOps.operation = ModifiabilityOperation.MODIFY;
		cashDeskNewOps.element = ModifiabilityElement.INTERFACE;
		cashDeskNewOps.parameters.put("name", "IBankLocal");
		scenario.addChange(cashDeskNewOps);

		ModifiabilityInstruction modifyInterface2 = new ModifiabilityInstruction();
		modifyInterface2.operation = ModifiabilityOperation.MODIFY;
		modifyInterface2.element = ModifiabilityElement.INTERFACE;
		modifyInterface2.parameters.put("name", "CreditCardScannedEvent");
		scenario.addChange(modifyInterface2);

		ModifiabilityInstruction modifyInterface3 = new ModifiabilityInstruction();
		modifyInterface3.operation = ModifiabilityOperation.MODIFY;
		modifyInterface3.element = ModifiabilityElement.INTERFACE;
		modifyInterface3.parameters.put("name", "CashBoxClosedEvent");
		scenario.addChange(modifyInterface3);

		return scenario;
	}

	public PCMScenario createModifiabilityVIP(ResponseMeasureType type, Comparable response) {
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
		/*
		 * ModifiabilityInstruction cashDeskInterface = new ModifiabilityInstruction();
		 * cashDeskInterface.operation = ModifiabilityOperation.MODIFY;
		 * cashDeskInterface.element = ModifiabilityElement.INTERFACE;
		 * cashDeskInterface.parameters.put("name",
		 * "org.cocome.cloud.web.data.cashdeskdata.ICashDesk");
		 * scenario.addChange(cashDeskInterface);
		 */
		//
		/** Additionals */

		ModifiabilityInstruction connectorLink3 = new ModifiabilityInstruction();
		connectorLink3.operation = ModifiabilityOperation.CREATE;
		connectorLink3.element = ModifiabilityElement.REQUIREDROLE;
		connectorLink3.parameters.put("cname", "org.cocome.tradingsystem.inventory.data.UserManager");
		connectorLink3.parameters.put("iname", "IVIPIdentifier");
		scenario.addChange(connectorLink3);

		ModifiabilityInstruction authenticatorInterface = new ModifiabilityInstruction();
		authenticatorInterface.operation = ModifiabilityOperation.MODIFY;
		authenticatorInterface.element = ModifiabilityElement.INTERFACE;
		authenticatorInterface.parameters.put("name", "IAuthenticator");
		scenario.addChange(authenticatorInterface);

		ModifiabilityInstruction otherInterface = new ModifiabilityInstruction();
		otherInterface.operation = ModifiabilityOperation.MODIFY;
		otherInterface.element = ModifiabilityElement.INTERFACE;
		otherInterface.parameters.put("name", "ICashBoxModel");
		scenario.addChange(otherInterface);

		ModifiabilityInstruction authenticatorInterface2 = new ModifiabilityInstruction();
		authenticatorInterface2.operation = ModifiabilityOperation.MODIFY;
		authenticatorInterface2.element = ModifiabilityElement.INTERFACE;
		authenticatorInterface2.parameters.put("name", "LoginEvent");
		scenario.addChange(authenticatorInterface2);

		ModifiabilityInstruction displayInt = new ModifiabilityInstruction();
		displayInt.operation = ModifiabilityOperation.MODIFY;
		displayInt.element = ModifiabilityElement.INTERFACE;
		displayInt.parameters.put("name", "IUserDisplayModel");
		scenario.addChange(displayInt);
		return scenario;
	}

	public PCMScenario createModifiabilityWithdrawMoney(ResponseMeasureType type, Comparable response) {
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

	public PCMScenario createModifiabilityServiceLog(ResponseMeasureType type, Comparable response) {
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
		/*
		 * ModifiabilityInstruction cashDeskDAOInterface = new
		 * ModifiabilityInstruction(); cashDeskDAOInterface.operation =
		 * ModifiabilityOperation.MODIFY; cashDeskDAOInterface.element =
		 * ModifiabilityElement.INTERFACE; cashDeskDAOInterface.parameters.put("name",
		 * "ICashDeskDAO"); scenario.addChange(cashDeskDAOInterface);
		 */
		//

		/** Additionals */

		ModifiabilityInstruction cardReaderWithdrawReqRole = new ModifiabilityInstruction();
		cardReaderWithdrawReqRole.operation = ModifiabilityOperation.CREATE;
		cardReaderWithdrawReqRole.element = ModifiabilityElement.REQUIREDROLE;
		cardReaderWithdrawReqRole.parameters.put("cname", "org.cocome.tradingsystem.inventory.data.Persistence");
		cardReaderWithdrawReqRole.parameters.put("iname", "ILogStorage");
		scenario.addChange(cardReaderWithdrawReqRole);

		ModifiabilityInstruction loginDataReqRole = new ModifiabilityInstruction();
		loginDataReqRole.operation = ModifiabilityOperation.CREATE;
		loginDataReqRole.element = ModifiabilityElement.REQUIREDROLE;
		loginDataReqRole.parameters.put("cname", "org.cocome.cloud.web.data.logindata");
		loginDataReqRole.parameters.put("iname", "ILogStorage");
		scenario.addChange(loginDataReqRole);

		ModifiabilityInstruction accountInterface = new ModifiabilityInstruction();
		accountInterface.operation = ModifiabilityOperation.MODIFY;
		accountInterface.element = ModifiabilityElement.INTERFACE;
		accountInterface.parameters.put("name", "AccountSaleEvent");
		scenario.addChange(accountInterface);

		ModifiabilityInstruction modifyInterface3 = new ModifiabilityInstruction();
		modifyInterface3.operation = ModifiabilityOperation.MODIFY;
		modifyInterface3.element = ModifiabilityElement.INTERFACE;
		modifyInterface3.parameters.put("name", "CashBoxClosedEvent");
		scenario.addChange(modifyInterface3);

		return scenario;
	}
}
