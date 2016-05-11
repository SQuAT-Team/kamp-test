package edu.kit.ipd.sdq.kamp.model.modificationmarks.provider;

import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.IntercomponentPropagation;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.IntracomponentPropagation;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.Modification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyAssemblyConnector;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyDatatype;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyProvidedRole;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifyRequiredRole;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModifySignature;

public class LabelCustomizing {
	public static String customize(Modification modification) {
		String name = "";
		switch(modification.getUserDecision()) {
		case CONFIRMED:
			name = "(best�tigt)";
			break;
		case EXCLUDED:
			name = "(abgelehnt)";
			break;
		case NODECISION:
			if (modification.isToolderived())
				name = "";
			break;
		default:
			break;
		}
		return name;
	}
	
	public static String customize(ModifyComponent modification) {
		if (modification.getComponent()==null) {
			return "(Bitte Komponente ausw�hlen!)";
		} else {
			return "\""+ modification.getComponent().getEntityName() + "\"";
		}
	}

	public static String customize(ModifyProvidedRole modification) {
		if (modification.getProvidedrole()==null) {
			return "(Bitte Schnittstellenangebot (Provided Role) ausw�hlen!)";
		} else {
			ProvidedRole providedRole = modification.getProvidedrole();
			String name = providedRole.getProvidingEntity_ProvidedRole().getEntityName();
			if (providedRole instanceof OperationProvidedRole) {
				name = name + "." + ((OperationProvidedRole)providedRole).getProvidedInterface__OperationProvidedRole().getEntityName();
			}
			return "\""+ name + "\"";
		}
	}
	
	public static String customize(ModifyRequiredRole modification) {
		if (modification.getRequiredrole()==null) {
			return "(Bitte Schnittstellenangebot (Provided Role) ausw�hlen!)";
		} else {
			RequiredRole role = modification.getRequiredrole();
			String name = role.getRequiringEntity_RequiredRole().getEntityName();
			if (role instanceof OperationRequiredRole) {
				name = name + "." + ((OperationRequiredRole)role).getRequiredInterface__OperationRequiredRole().getEntityName();
			}
			return "\""+ name + "\"";
		}
	}
	
	public static String customize(ModifyDatatype modification) {
		if (modification.getDatatype()==null) {
			return "(Bitte Datentyp ausw�hlen!)";
		} else {
			DataType dataType = modification.getDatatype();
			if (dataType instanceof NamedElement) {
				return "\""+ ((NamedElement)dataType).getEntityName() + "\"";
			} else {
				return "(Datentyp hat keinen Namen, frage das PCM!)";
			}
		}
	}
	
	public static String customize(ModifyInterface modification) {
		if (modification.getOperationInterface()==null) {
			return "(Bitte Schnittstelle ausw�hlen!)";
		} else {
			return "\""+ modification.getOperationInterface().getEntityName() + "\"";
		}
	}
	
	public static String customize(ModifySignature modification) {
		if (modification.getSignature()==null) {
			return "(Bitte Signatur ausw�hlen!)";
		} else {
			return "\""+ modification.getSignature().getEntityName() + "\"";
		}
	}
	
	public static String customize(ModifyAssemblyConnector modification) {
		if (modification.getAssemblyconnector()==null) {
			return "(Bitte Assemblierungskonnektor ausw�hlen!)";
		} else {
			return "\""+ modification.getAssemblyconnector().getEntityName() + "\"";
		}
	}
	
	public static String customize(IntercomponentPropagation modification) {
		if (modification.getAssemblyConnectorModifications().size()==1) {
			ModifyAssemblyConnector mod = modification.getAssemblyConnectorModifications().get(0);

			if (mod.getAssemblyconnector()!=null) {
				ProvidedRole providedRole = mod.getAssemblyconnector().getProvidedRole_AssemblyConnector();
				String provComponentName = providedRole.getProvidingEntity_ProvidedRole().getEntityName();
				RequiredRole requiredRole = mod.getAssemblyconnector().getRequiredRole_AssemblyConnector();
				String reqComponentName = requiredRole.getRequiringEntity_RequiredRole().getEntityName();
				
				return "\""+ provComponentName + "." + providedRole.getEntityName() + " -> " + reqComponentName + "." + requiredRole.getEntityName()+ "\"";
			}
		}
		
		return ""+ customize((Modification)modification);
	}
	
	public static String customize(IntracomponentPropagation modification) {
		if (!modification.getComponentModifications().isEmpty()) {
			ModifyComponent modifyComponent = modification.getComponentModifications().get(0);
			if (modifyComponent.getComponent()!=null) {
				return "\""+ modifyComponent.getComponent().getEntityName() + "\"";
			}
		}
		
		return ""+ customize((Modification)modification);
	}
}
