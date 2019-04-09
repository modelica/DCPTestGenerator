//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.02 um 08:45:03 PM CET 
//


package dcpDescription;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für dcpBluetoothType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dcpBluetoothType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="bd_addr" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="port" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                       &lt;minInclusive value="1"/>
 *                       &lt;maxInclusive value="30"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
@XmlType(name = "dcpBluetoothType", propOrder = {
    "address"
})
@XmlSeeAlso({
    dcpDescription.DcpSlaveDescription.TransportProtocols.Bluetooth.class
})
public class DcpBluetoothType {

    @XmlElement(name = "Address", required = true)
    protected DcpBluetoothType.Address address;

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpBluetoothType.Address }
     *     
     */
    public DcpBluetoothType.Address getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpBluetoothType.Address }
     *     
     */
    public void setAddress(DcpBluetoothType.Address value) {
        this.address = value;
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
     *       &lt;attribute name="bd_addr" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="port" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
     *             &lt;minInclusive value="1"/>
     *             &lt;maxInclusive value="30"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address {

        @XmlAttribute(name = "bd_addr", required = true)
        protected String bdAddr;
        @XmlAttribute(name = "port", required = true)
        protected short port;
        @XmlAttribute(name = "alias")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String alias;

        /**
         * Ruft den Wert der bdAddr-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBdAddr() {
            return bdAddr;
        }

        /**
         * Legt den Wert der bdAddr-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBdAddr(String value) {
            this.bdAddr = value;
        }

        /**
         * Ruft den Wert der port-Eigenschaft ab.
         * 
         */
        public short getPort() {
            return port;
        }

        /**
         * Legt den Wert der port-Eigenschaft fest.
         * 
         */
        public void setPort(short value) {
            this.port = value;
        }

        /**
         * Ruft den Wert der alias-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlias() {
            return alias;
        }

        /**
         * Legt den Wert der alias-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlias(String value) {
            this.alias = value;
        }

    }

}
