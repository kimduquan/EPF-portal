//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.07 at 09:58:50 PM ICT 
//


package org.apache.pluto.container.om.portlet30.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			The display-name type contains a short name that is intended
 * 			to be displayed by tools. It is used by display-name
 * 			elements.  The display name need not be unique.
 * 			Example:
 * 				...
 *   			
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;display-name xmlns="http://www.w3.org/2001/XMLSchema" xmlns:portlet="http://xmlns.jcp.org/xml/ns/portlet" xmlns:xs="http://www.w3.org/2001/XMLSchema" xml:lang="en"&gt;Employee Self Service&lt;/display-name&gt;
 * </pre>
 * 
 * 
 * 			It has an optional attribute xml:lang to indicate 
 * 			which language is used in the description according to 
 * 			RFC 1766 (http://www.ietf.org/rfc/rfc1766.txt). The default
 * 			value of this attribute is English(“en”).
 * 			
 * 
 * <p>Java class for display-nameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="display-nameType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://xmlns.jcp.org/xml/ns/portlet&gt;string"&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "display-nameType", propOrder = {
    "value"
})
public class DisplayNameType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * 
     * 			This is a special string datatype that is defined by JavaEE 
     * 			as a base type for defining collapsed strings. When 
     * 			schemas require trailing/leading space elimination as 
     * 			well as collapsing the existing whitespace, this base 
     * 			type may be used.
     * 			
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
