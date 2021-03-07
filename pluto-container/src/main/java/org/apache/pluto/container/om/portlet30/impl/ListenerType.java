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
 * 			The listenerType is used to declare listeners for this portlet application.
 *          The optional listener-name element allows an annotated listener to be addressed
 *          and replaced through a corresponding portlet deployment descriptor configuration.
 *          If a listener name is provided and the listener class is null, the annotated listener will
 *          be removed from the configuration. The ordinal element determines the order of execution
 *          should there be multiple listeners configured. The default ordinal number is 0.
 * 			Used in: portlet-app
 * 			
 * 
 * <p>Java class for listenerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listenerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listener-name" type="{http://xmlns.jcp.org/xml/ns/portlet}string" minOccurs="0"/&gt;
 *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://xmlns.jcp.org/xml/ns/portlet}descriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="display-name" type="{http://xmlns.jcp.org/xml/ns/portlet}display-nameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listener-class" type="{http://xmlns.jcp.org/xml/ns/portlet}fully-qualified-classType" minOccurs="0"/&gt;
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
@XmlType(name = "listenerType", propOrder = {
    "listenerName",
    "ordinal",
    "description",
    "displayName",
    "listenerClass"
})
public class ListenerType {

    @XmlElement(name = "listener-name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String listenerName;
    protected Integer ordinal;
    protected List<DescriptionType> description;
    @XmlElement(name = "display-name")
    protected List<DisplayNameType> displayName;
    @XmlElement(name = "listener-class")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String listenerClass;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the value of the listenerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListenerName() {
        return listenerName;
    }

    /**
     * Sets the value of the listenerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListenerName(String value) {
        this.listenerName = value;
    }

    /**
     * Gets the value of the ordinal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdinal(Integer value) {
        this.ordinal = value;
    }

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
     * Gets the value of the displayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayNameType }
     * 
     * 
     */
    public List<DisplayNameType> getDisplayName() {
        if (displayName == null) {
            displayName = new ArrayList<DisplayNameType>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the listenerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListenerClass() {
        return listenerClass;
    }

    /**
     * Sets the value of the listenerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListenerClass(String value) {
        this.listenerClass = value;
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