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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für dcpIPv4Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dcpIPv4Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Control" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DAT_input_output" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;choice>
 *                     &lt;element name="AvailablePortRange">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                             &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="AvailablePort">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DAT_parameter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;choice>
 *                     &lt;element name="AvailablePortRange">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                             &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="AvailablePort">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
@XmlType(name = "dcpIPv4Type", propOrder = {
    "control",
    "datInputOutput",
    "datParameter"
})
@XmlSeeAlso({
    dcpDescription.DcpSlaveDescription.TransportProtocols.UDPIPv4 .class,
    dcpDescription.DcpSlaveDescription.TransportProtocols.TCPIPv4 .class
})
public class DcpIPv4Type {

    @XmlElement(name = "Control")
    protected DcpIPv4Type.Control control;
    @XmlElement(name = "DAT_input_output")
    protected DcpIPv4Type.DATInputOutput datInputOutput;
    @XmlElement(name = "DAT_parameter")
    protected DcpIPv4Type.DATParameter datParameter;

    /**
     * Ruft den Wert der control-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpIPv4Type.Control }
     *     
     */
    public DcpIPv4Type.Control getControl() {
        return control;
    }

    /**
     * Legt den Wert der control-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpIPv4Type.Control }
     *     
     */
    public void setControl(DcpIPv4Type.Control value) {
        this.control = value;
    }

    /**
     * Ruft den Wert der datInputOutput-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpIPv4Type.DATInputOutput }
     *     
     */
    public DcpIPv4Type.DATInputOutput getDATInputOutput() {
        return datInputOutput;
    }

    /**
     * Legt den Wert der datInputOutput-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpIPv4Type.DATInputOutput }
     *     
     */
    public void setDATInputOutput(DcpIPv4Type.DATInputOutput value) {
        this.datInputOutput = value;
    }

    /**
     * Ruft den Wert der datParameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpIPv4Type.DATParameter }
     *     
     */
    public DcpIPv4Type.DATParameter getDATParameter() {
        return datParameter;
    }

    /**
     * Legt den Wert der datParameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpIPv4Type.DATParameter }
     *     
     */
    public void setDATParameter(DcpIPv4Type.DATParameter value) {
        this.datParameter = value;
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
     *       &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Control {

        @XmlAttribute(name = "host")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String host;
        @XmlAttribute(name = "port")
        @XmlSchemaType(name = "unsignedShort")
        protected Integer port;

        /**
         * Ruft den Wert der host-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHost() {
            return host;
        }

        /**
         * Legt den Wert der host-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHost(String value) {
            this.host = value;
        }

        /**
         * Ruft den Wert der port-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPort() {
            return port;
        }

        /**
         * Legt den Wert der port-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPort(Integer value) {
            this.port = value;
        }

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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;choice>
     *           &lt;element name="AvailablePortRange">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                   &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="AvailablePort">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "availablePortRangeOrAvailablePort"
    })
    public static class DATInputOutput {

        @XmlElements({
            @XmlElement(name = "AvailablePortRange", type = DcpIPv4Type.DATInputOutput.AvailablePortRange.class),
            @XmlElement(name = "AvailablePort", type = DcpIPv4Type.DATInputOutput.AvailablePort.class)
        })
        protected List<Object> availablePortRangeOrAvailablePort;
        @XmlAttribute(name = "host")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String host;

        /**
         * Gets the value of the availablePortRangeOrAvailablePort property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availablePortRangeOrAvailablePort property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailablePortRangeOrAvailablePort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DcpIPv4Type.DATInputOutput.AvailablePortRange }
         * {@link DcpIPv4Type.DATInputOutput.AvailablePort }
         * 
         * 
         */
        public List<Object> getAvailablePortRangeOrAvailablePort() {
            if (availablePortRangeOrAvailablePort == null) {
                availablePortRangeOrAvailablePort = new ArrayList<Object>();
            }
            return this.availablePortRangeOrAvailablePort;
        }

        /**
         * Ruft den Wert der host-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHost() {
            return host;
        }

        /**
         * Legt den Wert der host-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHost(String value) {
            this.host = value;
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
         *       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AvailablePort {

            @XmlAttribute(name = "port", required = true)
            @XmlSchemaType(name = "unsignedShort")
            protected int port;

            /**
             * Ruft den Wert der port-Eigenschaft ab.
             * 
             */
            public int getPort() {
                return port;
            }

            /**
             * Legt den Wert der port-Eigenschaft fest.
             * 
             */
            public void setPort(int value) {
                this.port = value;
            }

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
         *       &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *       &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AvailablePortRange {

            @XmlAttribute(name = "from", required = true)
            @XmlSchemaType(name = "unsignedShort")
            protected int from;
            @XmlAttribute(name = "to", required = true)
            @XmlSchemaType(name = "unsignedShort")
            protected int to;

            /**
             * Ruft den Wert der from-Eigenschaft ab.
             * 
             */
            public int getFrom() {
                return from;
            }

            /**
             * Legt den Wert der from-Eigenschaft fest.
             * 
             */
            public void setFrom(int value) {
                this.from = value;
            }

            /**
             * Ruft den Wert der to-Eigenschaft ab.
             * 
             */
            public int getTo() {
                return to;
            }

            /**
             * Legt den Wert der to-Eigenschaft fest.
             * 
             */
            public void setTo(int value) {
                this.to = value;
            }

        }

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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;choice>
     *           &lt;element name="AvailablePortRange">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                   &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="AvailablePort">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "availablePortRangeOrAvailablePort"
    })
    public static class DATParameter {

        @XmlElements({
            @XmlElement(name = "AvailablePortRange", type = DcpIPv4Type.DATParameter.AvailablePortRange.class),
            @XmlElement(name = "AvailablePort", type = DcpIPv4Type.DATParameter.AvailablePort.class)
        })
        protected List<Object> availablePortRangeOrAvailablePort;
        @XmlAttribute(name = "host")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String host;

        /**
         * Gets the value of the availablePortRangeOrAvailablePort property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availablePortRangeOrAvailablePort property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailablePortRangeOrAvailablePort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DcpIPv4Type.DATParameter.AvailablePortRange }
         * {@link DcpIPv4Type.DATParameter.AvailablePort }
         * 
         * 
         */
        public List<Object> getAvailablePortRangeOrAvailablePort() {
            if (availablePortRangeOrAvailablePort == null) {
                availablePortRangeOrAvailablePort = new ArrayList<Object>();
            }
            return this.availablePortRangeOrAvailablePort;
        }

        /**
         * Ruft den Wert der host-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHost() {
            return host;
        }

        /**
         * Legt den Wert der host-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHost(String value) {
            this.host = value;
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
         *       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AvailablePort {

            @XmlAttribute(name = "port", required = true)
            @XmlSchemaType(name = "unsignedShort")
            protected int port;

            /**
             * Ruft den Wert der port-Eigenschaft ab.
             * 
             */
            public int getPort() {
                return port;
            }

            /**
             * Legt den Wert der port-Eigenschaft fest.
             * 
             */
            public void setPort(int value) {
                this.port = value;
            }

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
         *       &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *       &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AvailablePortRange {

            @XmlAttribute(name = "from", required = true)
            @XmlSchemaType(name = "unsignedShort")
            protected int from;
            @XmlAttribute(name = "to", required = true)
            @XmlSchemaType(name = "unsignedShort")
            protected int to;

            /**
             * Ruft den Wert der from-Eigenschaft ab.
             * 
             */
            public int getFrom() {
                return from;
            }

            /**
             * Legt den Wert der from-Eigenschaft fest.
             * 
             */
            public void setFrom(int value) {
                this.from = value;
            }

            /**
             * Ruft den Wert der to-Eigenschaft ab.
             * 
             */
            public int getTo() {
                return to;
            }

            /**
             * Legt den Wert der to-Eigenschaft fest.
             * 
             */
            public void setTo(int value) {
                this.to = value;
            }

        }

    }

}
