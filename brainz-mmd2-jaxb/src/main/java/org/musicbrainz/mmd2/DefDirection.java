//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.13 at 02:41:53 PM BST 
//


package org.musicbrainz.mmd2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for def_direction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="def_direction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="forward"/>
 *     &lt;enumeration value="backward"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "def_direction")
@XmlEnum
public enum DefDirection {

    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("forward")
    FORWARD("forward"),
    @XmlEnumValue("backward")
    BACKWARD("backward");
    private final String value;

    DefDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefDirection fromValue(String v) {
        for (DefDirection c: DefDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
