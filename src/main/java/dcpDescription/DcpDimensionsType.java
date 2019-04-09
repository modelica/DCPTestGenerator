//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.02 um 08:45:03 PM CET 
//


package dcpDescription;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dcpDimensionsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dcpDimensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="Dimension">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="constant">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                       &lt;minInclusive value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="linkedVR" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dcpDimensionsType", propOrder = {
    "dimension"
})
public class DcpDimensionsType {

    @XmlElement(name = "Dimension", required = true)
    protected List<DcpDimensionsType.Dimension> dimension;

    /**
     * Gets the value of the dimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DcpDimensionsType.Dimension }
     * 
     * 
     */
    public List<DcpDimensionsType.Dimension> getDimension() {
        if (dimension == null) {
            dimension = new ArrayList<DcpDimensionsType.Dimension>();
        }
        return this.dimension;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="constant">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *             &lt;minInclusive value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="linkedVR" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Dimension {

        @XmlAttribute(name = "constant")
        protected BigInteger constant;
        @XmlAttribute(name = "linkedVR")
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger linkedVR;

        /**
         * Ruft den Wert der constant-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getConstant() {
            return constant;
        }

        /**
         * Legt den Wert der constant-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setConstant(BigInteger value) {
            this.constant = value;
        }

        /**
         * Ruft den Wert der linkedVR-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLinkedVR() {
            return linkedVR;
        }

        /**
         * Legt den Wert der linkedVR-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLinkedVR(BigInteger value) {
            this.linkedVR = value;
        }

    }

}
