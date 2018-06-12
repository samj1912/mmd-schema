//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.12 at 08:24:58 PM IST 
//


package org.musicbrainz.mmd2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}artist"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}release"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}release-group"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}recording"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}label"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}work"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}area"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}place"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}instrument"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}series"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}event"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://musicbrainz.org/ns/mmd-2.0#}def_list-attributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "artistAndReleaseAndReleaseGroup"
})
@XmlRootElement(name = "entity-list")
public class EntityList {

    @XmlElements({
        @XmlElement(name = "artist", type = Artist.class),
        @XmlElement(name = "release", type = Release.class),
        @XmlElement(name = "release-group", type = ReleaseGroup.class),
        @XmlElement(name = "recording", type = Recording.class),
        @XmlElement(name = "label", type = Label.class),
        @XmlElement(name = "work", type = Work.class),
        @XmlElement(name = "area", type = DefAreaElementInner.class),
        @XmlElement(name = "place", type = Place.class),
        @XmlElement(name = "instrument", type = Instrument.class),
        @XmlElement(name = "series", type = Series.class),
        @XmlElement(name = "event", type = Event.class)
    })
    protected List<Object> artistAndReleaseAndReleaseGroup;
    @XmlAttribute(name = "count")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;
    @XmlAttribute(name = "offset")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger offset;

    /**
     * Gets the value of the artistAndReleaseAndReleaseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artistAndReleaseAndReleaseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtistAndReleaseAndReleaseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Artist }
     * {@link Release }
     * {@link ReleaseGroup }
     * {@link Recording }
     * {@link Label }
     * {@link Work }
     * {@link DefAreaElementInner }
     * {@link Place }
     * {@link Instrument }
     * {@link Series }
     * {@link Event }
     * 
     * 
     */
    public List<Object> getArtistAndReleaseAndReleaseGroup() {
        if (artistAndReleaseAndReleaseGroup == null) {
            artistAndReleaseAndReleaseGroup = new ArrayList<Object>();
        }
        return this.artistAndReleaseAndReleaseGroup;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffset(BigInteger value) {
        this.offset = value;
    }

}
