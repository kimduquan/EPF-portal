//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.07 at 09:57:45 PM ICT 
//


package org.apache.pluto.container.om.portlet10.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			The portlet-collectionType is used to identify a subset
 * 			of portlets within a portlet application to which a 
 * 			security constraint applies.
 * 			Used in: security-constraint
 * 			
 * 
 * <p>Java class for portlet-collectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="portlet-collectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="portlet-name" type="{http://java.sun.com/xml/ns/portlet/portlet-app_1_0.xsd}portlet-nameType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "portlet-collectionType", propOrder = {
    "portletName"
})
public class PortletCollectionType {

    @XmlElement(name = "portlet-name", required = true)
    protected List<PortletNameType> portletName;

    /**
     * Gets the value of the portletName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portletName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortletName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortletNameType }
     * 
     * 
     */
    public List<PortletNameType> getPortletName() {
        if (portletName == null) {
            portletName = new ArrayList<PortletNameType>();
        }
        return this.portletName;
    }

}
