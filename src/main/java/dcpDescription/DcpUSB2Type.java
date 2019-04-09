//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.02 um 08:45:03 PM CET 
//


package dcpDescription;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dcpUSB2Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dcpUSB2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="DataPipe">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="direction">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="In"/>
 *                         &lt;enumeration value="Out"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="endpointAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                   &lt;attribute name="intervall" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="maxPower" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dcpUSB2Type", propOrder = {
    "dataPipe"
})
@XmlSeeAlso({
    dcpDescription.DcpSlaveDescription.TransportProtocols.USB2 .class
})
public class DcpUSB2Type {

    @XmlElement(name = "DataPipe")
    protected List<DcpUSB2Type.DataPipe> dataPipe;
    @XmlAttribute(name = "maxPower")
    @XmlSchemaType(name = "unsignedByte")
    protected Short maxPower;

    /**
     * Gets the value of the dataPipe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataPipe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPipe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DcpUSB2Type.DataPipe }
     * 
     * 
     */
    public List<DcpUSB2Type.DataPipe> getDataPipe() {
        if (dataPipe == null) {
            dataPipe = new ArrayList<DcpUSB2Type.DataPipe>();
        }
        return this.dataPipe;
    }

    /**
     * Ruft den Wert der maxPower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMaxPower() {
        return maxPower;
    }

    /**
     * Legt den Wert der maxPower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMaxPower(Short value) {
        this.maxPower = value;
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
     *       &lt;attribute name="direction">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="In"/>
     *             &lt;enumeration value="Out"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="endpointAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *       &lt;attribute name="intervall" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DataPipe {

        @XmlAttribute(name = "direction")
        protected String direction;
        @XmlAttribute(name = "endpointAddress", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short endpointAddress;
        @XmlAttribute(name = "intervall", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short intervall;

        /**
         * Ruft den Wert der direction-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirection() {
            return direction;
        }

        /**
         * Legt den Wert der direction-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirection(String value) {
            this.direction = value;
        }

        /**
         * Ruft den Wert der endpointAddress-Eigenschaft ab.
         * 
         */
        public short getEndpointAddress() {
            return endpointAddress;
        }

        /**
         * Legt den Wert der endpointAddress-Eigenschaft fest.
         * 
         */
        public void setEndpointAddress(short value) {
            this.endpointAddress = value;
        }

        /**
         * Ruft den Wert der intervall-Eigenschaft ab.
         * 
         */
        public short getIntervall() {
            return intervall;
        }

        /**
         * Legt den Wert der intervall-Eigenschaft fest.
         * 
         */
        public void setIntervall(short value) {
            this.intervall = value;
        }

    }

}
