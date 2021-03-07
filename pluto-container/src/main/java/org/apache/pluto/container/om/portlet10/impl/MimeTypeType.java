//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.07 at 09:57:45 PM ICT 
//


package org.apache.pluto.container.om.portlet10.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			MIME type name, e.g. "text/html".
 * 			The MIME type may also contain the wildcard
 * 			character '*', like "text/*" or "*<!---->/*".
 * 			Used in: supports
 * 			
 * 
 * <p>Java class for mime-typeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mime-typeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://java.sun.com/xml/ns/portlet/portlet-app_1_0.xsd&gt;string"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mime-typeType", propOrder = {
    "value"
})
public class MimeTypeType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;

    /**
     * 
     * 			This is a special string datatype that is defined by J2EE 
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

}
