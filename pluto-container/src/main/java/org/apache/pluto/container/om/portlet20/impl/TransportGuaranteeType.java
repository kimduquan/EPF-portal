//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.07 at 09:58:18 PM ICT 
//


package org.apache.pluto.container.om.portlet20.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transport-guaranteeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transport-guaranteeType"&gt;
 *   &lt;restriction base="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="INTEGRAL"/&gt;
 *     &lt;enumeration value="CONFIDENTIAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "transport-guaranteeType")
@XmlEnum
public enum TransportGuaranteeType {

    NONE,
    INTEGRAL,
    CONFIDENTIAL;

    public String value() {
        return name();
    }

    public static TransportGuaranteeType fromValue(String v) {
        return valueOf(v);
    }

}
