//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.07 at 09:58:50 PM ICT 
//


package org.apache.pluto.container.om.portlet30.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			A custom portlet mode that one or more portlets in 
 * 			this portlet application supports.
 * 			If the portal does not need to provide some management functionality
 * 			for this portlet mode, the portal-managed element needs to be set
 * 			to "false", otherwise to "true". Default is "true".
 * 			Used in: portlet-app
 * 			
 * 
 * <p>Java class for custom-portlet-modeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="custom-portlet-modeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://xmlns.jcp.org/xml/ns/portlet}descriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="portlet-mode" type="{http://xmlns.jcp.org/xml/ns/portlet}portlet-modeType"/&gt;
 *         &lt;element name="portal-managed" type="{http://xmlns.jcp.org/xml/ns/portlet}portal-managedType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://xmlns.jcp.org/xml/ns/portlet}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custom-portlet-modeType", propOrder = {
    "description",
    "portletMode",
    "portalManaged"
})
public class CustomPortletModeType {

    protected List<DescriptionType> description;
    @XmlElement(name = "portlet-mode", required = true)
    protected PortletModeType portletMode;
    @XmlElement(name = "portal-managed")
    @XmlSchemaType(name = "token")
    protected PortalManagedType portalManaged;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the portletMode property.
     * 
     * @return
     *     possible object is
     *     {@link PortletModeType }
     *     
     */
    public PortletModeType getPortletMode() {
        return portletMode;
    }

    /**
     * Sets the value of the portletMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortletModeType }
     *     
     */
    public void setPortletMode(PortletModeType value) {
        this.portletMode = value;
    }

    /**
     * Gets the value of the portalManaged property.
     * 
     * @return
     *     possible object is
     *     {@link PortalManagedType }
     *     
     */
    public PortalManagedType getPortalManaged() {
        return portalManaged;
    }

    /**
     * Sets the value of the portalManaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalManagedType }
     *     
     */
    public void setPortalManaged(PortalManagedType value) {
        this.portalManaged = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
