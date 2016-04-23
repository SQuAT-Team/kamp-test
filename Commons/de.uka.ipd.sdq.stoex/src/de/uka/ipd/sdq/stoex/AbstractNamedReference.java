/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Abstract Named Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.AbstractNamedReference#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.stoex.StoexPackage#getAbstractNamedReference()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface AbstractNamedReference extends CDOObject {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * Returns the value of the '<em><b>Reference Name</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Name</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Reference Name</em>' attribute.
     * @see #setReferenceName(String)
     * @see de.uka.ipd.sdq.stoex.StoexPackage#getAbstractNamedReference_ReferenceName()
     * @model required="true" ordered="false"
     * @generated
     */
    String getReferenceName();

    /**
     * Sets the value of the '{@link de.uka.ipd.sdq.stoex.AbstractNamedReference#getReferenceName
     * <em>Reference Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Reference Name</em>' attribute.
     * @see #getReferenceName()
     * @generated
     */
    void setReferenceName(String value);

} // AbstractNamedReference
