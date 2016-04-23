/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.internalmodificationmark.util;

import de.uka.ipd.sdq.internalmodificationmark.InternalmodificationmarkPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalmodificationmarkXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalmodificationmarkXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		InternalmodificationmarkPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the InternalmodificationmarkResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new InternalmodificationmarkResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new InternalmodificationmarkResourceFactoryImpl());
		}
		return registrations;
	}

} //InternalmodificationmarkXMLProcessor
