//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.07 at 09:58:18 PM ICT 
//


package org.apache.pluto.container.om.portlet20.impl;

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
 * <p>Java class for portlet-appType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="portlet-appType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="portlet" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}portletType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="custom-portlet-mode" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}custom-portlet-modeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="custom-window-state" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}custom-window-stateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="user-attribute" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}user-attributeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="security-constraint" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}security-constraintType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resource-bundle" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}resource-bundleType" minOccurs="0"/&gt;
 *         &lt;element name="filter" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}filterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="filter-mapping" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}filter-mappingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="default-namespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="event-definition" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}event-definitionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="public-render-parameter" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}public-render-parameterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listener" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}listenerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="container-runtime-option" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}container-runtime-optionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}string" /&gt;
 *       &lt;attribute name="id" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "portlet-appType", propOrder = {
    "portlet",
    "customPortletMode",
    "customWindowState",
    "userAttribute",
    "securityConstraint",
    "resourceBundle",
    "filter",
    "filterMapping",
    "defaultNamespace",
    "eventDefinition",
    "publicRenderParameter",
    "listener",
    "containerRuntimeOption"
})
public class PortletAppType {

    protected List<PortletType> portlet;
    @XmlElement(name = "custom-portlet-mode")
    protected List<CustomPortletModeType> customPortletMode;
    @XmlElement(name = "custom-window-state")
    protected List<CustomWindowStateType> customWindowState;
    @XmlElement(name = "user-attribute")
    protected List<UserAttributeType> userAttribute;
    @XmlElement(name = "security-constraint")
    protected List<SecurityConstraintType> securityConstraint;
    @XmlElement(name = "resource-bundle")
    protected ResourceBundleType resourceBundle;
    protected List<FilterType> filter;
    @XmlElement(name = "filter-mapping")
    protected List<FilterMappingType> filterMapping;
    @XmlElement(name = "default-namespace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultNamespace;
    @XmlElement(name = "event-definition")
    protected List<EventDefinitionType> eventDefinition;
    @XmlElement(name = "public-render-parameter")
    protected List<PublicRenderParameterType> publicRenderParameter;
    protected List<ListenerType> listener;
    @XmlElement(name = "container-runtime-option")
    protected List<ContainerRuntimeOptionType> containerRuntimeOption;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the value of the portlet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portlet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortlet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortletType }
     * 
     * 
     */
    public List<PortletType> getPortlet() {
        if (portlet == null) {
            portlet = new ArrayList<PortletType>();
        }
        return this.portlet;
    }

    /**
     * Gets the value of the customPortletMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customPortletMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomPortletMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomPortletModeType }
     * 
     * 
     */
    public List<CustomPortletModeType> getCustomPortletMode() {
        if (customPortletMode == null) {
            customPortletMode = new ArrayList<CustomPortletModeType>();
        }
        return this.customPortletMode;
    }

    /**
     * Gets the value of the customWindowState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customWindowState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomWindowState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomWindowStateType }
     * 
     * 
     */
    public List<CustomWindowStateType> getCustomWindowState() {
        if (customWindowState == null) {
            customWindowState = new ArrayList<CustomWindowStateType>();
        }
        return this.customWindowState;
    }

    /**
     * Gets the value of the userAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAttributeType }
     * 
     * 
     */
    public List<UserAttributeType> getUserAttribute() {
        if (userAttribute == null) {
            userAttribute = new ArrayList<UserAttributeType>();
        }
        return this.userAttribute;
    }

    /**
     * Gets the value of the securityConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityConstraintType }
     * 
     * 
     */
    public List<SecurityConstraintType> getSecurityConstraint() {
        if (securityConstraint == null) {
            securityConstraint = new ArrayList<SecurityConstraintType>();
        }
        return this.securityConstraint;
    }

    /**
     * Gets the value of the resourceBundle property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceBundleType }
     *     
     */
    public ResourceBundleType getResourceBundle() {
        return resourceBundle;
    }

    /**
     * Sets the value of the resourceBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceBundleType }
     *     
     */
    public void setResourceBundle(ResourceBundleType value) {
        this.resourceBundle = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getFilter() {
        if (filter == null) {
            filter = new ArrayList<FilterType>();
        }
        return this.filter;
    }

    /**
     * Gets the value of the filterMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterMappingType }
     * 
     * 
     */
    public List<FilterMappingType> getFilterMapping() {
        if (filterMapping == null) {
            filterMapping = new ArrayList<FilterMappingType>();
        }
        return this.filterMapping;
    }

    /**
     * Gets the value of the defaultNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultNamespace() {
        return defaultNamespace;
    }

    /**
     * Sets the value of the defaultNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultNamespace(String value) {
        this.defaultNamespace = value;
    }

    /**
     * Gets the value of the eventDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventDefinitionType }
     * 
     * 
     */
    public List<EventDefinitionType> getEventDefinition() {
        if (eventDefinition == null) {
            eventDefinition = new ArrayList<EventDefinitionType>();
        }
        return this.eventDefinition;
    }

    /**
     * Gets the value of the publicRenderParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicRenderParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicRenderParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicRenderParameterType }
     * 
     * 
     */
    public List<PublicRenderParameterType> getPublicRenderParameter() {
        if (publicRenderParameter == null) {
            publicRenderParameter = new ArrayList<PublicRenderParameterType>();
        }
        return this.publicRenderParameter;
    }

    /**
     * Gets the value of the listener property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listener property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListener().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListenerType }
     * 
     * 
     */
    public List<ListenerType> getListener() {
        if (listener == null) {
            listener = new ArrayList<ListenerType>();
        }
        return this.listener;
    }

    /**
     * Gets the value of the containerRuntimeOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerRuntimeOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerRuntimeOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerRuntimeOptionType }
     * 
     * 
     */
    public List<ContainerRuntimeOptionType> getContainerRuntimeOption() {
        if (containerRuntimeOption == null) {
            containerRuntimeOption = new ArrayList<ContainerRuntimeOptionType>();
        }
        return this.containerRuntimeOption;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
