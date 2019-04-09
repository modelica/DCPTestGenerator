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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OpMode">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HardRealTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="SoftRealTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="NonRealTime" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="defaultSteps" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *                           &lt;attribute name="fixedSteps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                           &lt;attribute name="minSteps" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                           &lt;attribute name="maxSteps" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnitDefinitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="Unit" type="{}dcpUnit"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TypeDefinitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="SimpleType" type="{}dcpSimpleType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VendorAnnotations" type="{}dcpAnnotation" minOccurs="0"/>
 *         &lt;element name="TimeRes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;choice>
 *                     &lt;element name="Resolution">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="numerator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *                             &lt;attribute name="denominator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1000" />
 *                             &lt;attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                             &lt;attribute name="recommended" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="ResolutionRange">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="numeratorFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                             &lt;attribute name="numeratorTo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                             &lt;attribute name="denominator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Heartbeat" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MaximumPeriodicInterval">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="numerator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *                           &lt;attribute name="denominator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransportProtocols">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UDP_IPv4" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{}dcpIPv4Type">
 *                           &lt;attribute name="maxPduSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="65507" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CAN" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="USB2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{}dcpUSB2Type">
 *                           &lt;attribute name="maxPduSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1024" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Bluetooth" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{}dcpBluetoothType">
 *                           &lt;attribute name="maxPduSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1011" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TCP_IPv4" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{}dcpIPv4Type">
 *                           &lt;attribute name="maxPduSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="4294967267" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CapabilityFlags">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="canAcceptConfigPdus" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="canHandleReset" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="canHandleVariableSteps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="canMonitorHeartbeat" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="canProvideLogOnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="canProvideLogOnNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Variables">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="Variable" type="{}dcpVariable"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Log" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Categories">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="Category">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Templates">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="Template">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="level" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="msg" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="dcpMajorVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="dcpMinorVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="dcpSlaveName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uuid" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="36"/>
 *             &lt;pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="copyright" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="license" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="generationTool" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="generationDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="variableNamingConvention" default="flat">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *             &lt;enumeration value="flat"/>
 *             &lt;enumeration value="structured"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "opMode",
    "unitDefinitions",
    "typeDefinitions",
    "vendorAnnotations",
    "timeRes",
    "heartbeat",
    "transportProtocols",
    "capabilityFlags",
    "variables",
    "log"
})
@XmlRootElement(name = "dcpSlaveDescription")
public class DcpSlaveDescription {

    @XmlElement(name = "OpMode", required = true)
    protected DcpSlaveDescription.OpMode opMode;
    @XmlElement(name = "UnitDefinitions")
    protected DcpSlaveDescription.UnitDefinitions unitDefinitions;
    @XmlElement(name = "TypeDefinitions")
    protected DcpSlaveDescription.TypeDefinitions typeDefinitions;
    @XmlElement(name = "VendorAnnotations")
    protected DcpAnnotation vendorAnnotations;
    @XmlElement(name = "TimeRes", required = true)
    protected DcpSlaveDescription.TimeRes timeRes;
    @XmlElement(name = "Heartbeat")
    protected DcpSlaveDescription.Heartbeat heartbeat;
    @XmlElement(name = "TransportProtocols", required = true)
    protected DcpSlaveDescription.TransportProtocols transportProtocols;
    @XmlElement(name = "CapabilityFlags", required = true)
    protected DcpSlaveDescription.CapabilityFlags capabilityFlags;
    @XmlElement(name = "Variables", required = true)
    protected DcpSlaveDescription.Variables variables;
    @XmlElement(name = "Log")
    protected DcpSlaveDescription.Log log;
    @XmlAttribute(name = "dcpMajorVersion", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short dcpMajorVersion;
    @XmlAttribute(name = "dcpMinorVersion", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short dcpMinorVersion;
    @XmlAttribute(name = "dcpSlaveName", required = true)
    protected String dcpSlaveName;
    @XmlAttribute(name = "uuid", required = true)
    protected String uuid;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "author")
    protected String author;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String version;
    @XmlAttribute(name = "copyright")
    protected String copyright;
    @XmlAttribute(name = "license")
    protected String license;
    @XmlAttribute(name = "generationTool")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String generationTool;
    @XmlAttribute(name = "generationDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generationDateAndTime;
    @XmlAttribute(name = "variableNamingConvention")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String variableNamingConvention;

    /**
     * Ruft den Wert der opMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpSlaveDescription.OpMode }
     *     
     */
    public DcpSlaveDescription.OpMode getOpMode() {
        return opMode;
    }

    /**
     * Legt den Wert der opMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpSlaveDescription.OpMode }
     *     
     */
    public void setOpMode(DcpSlaveDescription.OpMode value) {
        this.opMode = value;
    }

    /**
     * Ruft den Wert der unitDefinitions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpSlaveDescription.UnitDefinitions }
     *     
     */
    public DcpSlaveDescription.UnitDefinitions getUnitDefinitions() {
        return unitDefinitions;
    }

    /**
     * Legt den Wert der unitDefinitions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpSlaveDescription.UnitDefinitions }
     *     
     */
    public void setUnitDefinitions(DcpSlaveDescription.UnitDefinitions value) {
        this.unitDefinitions = value;
    }

    /**
     * Ruft den Wert der typeDefinitions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpSlaveDescription.TypeDefinitions }
     *     
     */
    public DcpSlaveDescription.TypeDefinitions getTypeDefinitions() {
        return typeDefinitions;
    }

    /**
     * Legt den Wert der typeDefinitions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpSlaveDescription.TypeDefinitions }
     *     
     */
    public void setTypeDefinitions(DcpSlaveDescription.TypeDefinitions value) {
        this.typeDefinitions = value;
    }

    /**
     * Ruft den Wert der vendorAnnotations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpAnnotation }
     *     
     */
    public DcpAnnotation getVendorAnnotations() {
        return vendorAnnotations;
    }

    /**
     * Legt den Wert der vendorAnnotations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpAnnotation }
     *     
     */
    public void setVendorAnnotations(DcpAnnotation value) {
        this.vendorAnnotations = value;
    }

    /**
     * Ruft den Wert der timeRes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpSlaveDescription.TimeRes }
     *     
     */
    public DcpSlaveDescription.TimeRes getTimeRes() {
        return timeRes;
    }

    /**
     * Legt den Wert der timeRes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpSlaveDescription.TimeRes }
     *     
     */
    public void setTimeRes(DcpSlaveDescription.TimeRes value) {
        this.timeRes = value;
    }

    /**
     * Ruft den Wert der heartbeat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpSlaveDescription.Heartbeat }
     *     
     */
    public DcpSlaveDescription.Heartbeat getHeartbeat() {
        return heartbeat;
    }

    /**
     * Legt den Wert der heartbeat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpSlaveDescription.Heartbeat }
     *     
     */
    public void setHeartbeat(DcpSlaveDescription.Heartbeat value) {
        this.heartbeat = value;
    }

    /**
     * Ruft den Wert der transportProtocols-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpSlaveDescription.TransportProtocols }
     *     
     */
    public DcpSlaveDescription.TransportProtocols getTransportProtocols() {
        return transportProtocols;
    }

    /**
     * Legt den Wert der transportProtocols-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpSlaveDescription.TransportProtocols }
     *     
     */
    public void setTransportProtocols(DcpSlaveDescription.TransportProtocols value) {
        this.transportProtocols = value;
    }

    /**
     * Ruft den Wert der capabilityFlags-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpSlaveDescription.CapabilityFlags }
     *     
     */
    public DcpSlaveDescription.CapabilityFlags getCapabilityFlags() {
        return capabilityFlags;
    }

    /**
     * Legt den Wert der capabilityFlags-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpSlaveDescription.CapabilityFlags }
     *     
     */
    public void setCapabilityFlags(DcpSlaveDescription.CapabilityFlags value) {
        this.capabilityFlags = value;
    }

    /**
     * Ruft den Wert der variables-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpSlaveDescription.Variables }
     *     
     */
    public DcpSlaveDescription.Variables getVariables() {
        return variables;
    }

    /**
     * Legt den Wert der variables-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpSlaveDescription.Variables }
     *     
     */
    public void setVariables(DcpSlaveDescription.Variables value) {
        this.variables = value;
    }

    /**
     * Ruft den Wert der log-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpSlaveDescription.Log }
     *     
     */
    public DcpSlaveDescription.Log getLog() {
        return log;
    }

    /**
     * Legt den Wert der log-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpSlaveDescription.Log }
     *     
     */
    public void setLog(DcpSlaveDescription.Log value) {
        this.log = value;
    }

    /**
     * Ruft den Wert der dcpMajorVersion-Eigenschaft ab.
     * 
     */
    public short getDcpMajorVersion() {
        return dcpMajorVersion;
    }

    /**
     * Legt den Wert der dcpMajorVersion-Eigenschaft fest.
     * 
     */
    public void setDcpMajorVersion(short value) {
        this.dcpMajorVersion = value;
    }

    /**
     * Ruft den Wert der dcpMinorVersion-Eigenschaft ab.
     * 
     */
    public short getDcpMinorVersion() {
        return dcpMinorVersion;
    }

    /**
     * Legt den Wert der dcpMinorVersion-Eigenschaft fest.
     * 
     */
    public void setDcpMinorVersion(short value) {
        this.dcpMinorVersion = value;
    }

    /**
     * Ruft den Wert der dcpSlaveName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcpSlaveName() {
        return dcpSlaveName;
    }

    /**
     * Legt den Wert der dcpSlaveName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcpSlaveName(String value) {
        this.dcpSlaveName = value;
    }

    /**
     * Ruft den Wert der uuid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Legt den Wert der uuid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der author-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Legt den Wert der author-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
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
     * Legt den Wert der version-Eigenschaft fest.
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
     * Ruft den Wert der copyright-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Legt den Wert der copyright-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Ruft den Wert der license-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicense() {
        return license;
    }

    /**
     * Legt den Wert der license-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicense(String value) {
        this.license = value;
    }

    /**
     * Ruft den Wert der generationTool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerationTool() {
        return generationTool;
    }

    /**
     * Legt den Wert der generationTool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerationTool(String value) {
        this.generationTool = value;
    }

    /**
     * Ruft den Wert der generationDateAndTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGenerationDateAndTime() {
        return generationDateAndTime;
    }

    /**
     * Legt den Wert der generationDateAndTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGenerationDateAndTime(XMLGregorianCalendar value) {
        this.generationDateAndTime = value;
    }

    /**
     * Ruft den Wert der variableNamingConvention-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableNamingConvention() {
        if (variableNamingConvention == null) {
            return "flat";
        } else {
            return variableNamingConvention;
        }
    }

    /**
     * Legt den Wert der variableNamingConvention-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableNamingConvention(String value) {
        this.variableNamingConvention = value;
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
     *       &lt;attribute name="canAcceptConfigPdus" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="canHandleReset" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="canHandleVariableSteps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="canMonitorHeartbeat" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="canProvideLogOnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="canProvideLogOnNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CapabilityFlags {

        @XmlAttribute(name = "canAcceptConfigPdus")
        protected Boolean canAcceptConfigPdus;
        @XmlAttribute(name = "canHandleReset")
        protected Boolean canHandleReset;
        @XmlAttribute(name = "canHandleVariableSteps")
        protected Boolean canHandleVariableSteps;
        @XmlAttribute(name = "canMonitorHeartbeat")
        protected Boolean canMonitorHeartbeat;
        @XmlAttribute(name = "canProvideLogOnRequest")
        protected Boolean canProvideLogOnRequest;
        @XmlAttribute(name = "canProvideLogOnNotification")
        protected Boolean canProvideLogOnNotification;

        /**
         * Ruft den Wert der canAcceptConfigPdus-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isCanAcceptConfigPdus() {
            if (canAcceptConfigPdus == null) {
                return false;
            } else {
                return canAcceptConfigPdus;
            }
        }

        /**
         * Legt den Wert der canAcceptConfigPdus-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCanAcceptConfigPdus(Boolean value) {
            this.canAcceptConfigPdus = value;
        }

        /**
         * Ruft den Wert der canHandleReset-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isCanHandleReset() {
            if (canHandleReset == null) {
                return false;
            } else {
                return canHandleReset;
            }
        }

        /**
         * Legt den Wert der canHandleReset-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCanHandleReset(Boolean value) {
            this.canHandleReset = value;
        }

        /**
         * Ruft den Wert der canHandleVariableSteps-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isCanHandleVariableSteps() {
            if (canHandleVariableSteps == null) {
                return false;
            } else {
                return canHandleVariableSteps;
            }
        }

        /**
         * Legt den Wert der canHandleVariableSteps-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCanHandleVariableSteps(Boolean value) {
            this.canHandleVariableSteps = value;
        }

        /**
         * Ruft den Wert der canMonitorHeartbeat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isCanMonitorHeartbeat() {
            if (canMonitorHeartbeat == null) {
                return false;
            } else {
                return canMonitorHeartbeat;
            }
        }

        /**
         * Legt den Wert der canMonitorHeartbeat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCanMonitorHeartbeat(Boolean value) {
            this.canMonitorHeartbeat = value;
        }

        /**
         * Ruft den Wert der canProvideLogOnRequest-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isCanProvideLogOnRequest() {
            if (canProvideLogOnRequest == null) {
                return false;
            } else {
                return canProvideLogOnRequest;
            }
        }

        /**
         * Legt den Wert der canProvideLogOnRequest-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCanProvideLogOnRequest(Boolean value) {
            this.canProvideLogOnRequest = value;
        }

        /**
         * Ruft den Wert der canProvideLogOnNotification-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isCanProvideLogOnNotification() {
            if (canProvideLogOnNotification == null) {
                return false;
            } else {
                return canProvideLogOnNotification;
            }
        }

        /**
         * Legt den Wert der canProvideLogOnNotification-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCanProvideLogOnNotification(Boolean value) {
            this.canProvideLogOnNotification = value;
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
     *       &lt;sequence>
     *         &lt;element name="MaximumPeriodicInterval">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="numerator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
     *                 &lt;attribute name="denominator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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
    @XmlType(name = "", propOrder = {
        "maximumPeriodicInterval"
    })
    public static class Heartbeat {

        @XmlElement(name = "MaximumPeriodicInterval", required = true)
        protected DcpSlaveDescription.Heartbeat.MaximumPeriodicInterval maximumPeriodicInterval;

        /**
         * Ruft den Wert der maximumPeriodicInterval-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpSlaveDescription.Heartbeat.MaximumPeriodicInterval }
         *     
         */
        public DcpSlaveDescription.Heartbeat.MaximumPeriodicInterval getMaximumPeriodicInterval() {
            return maximumPeriodicInterval;
        }

        /**
         * Legt den Wert der maximumPeriodicInterval-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpSlaveDescription.Heartbeat.MaximumPeriodicInterval }
         *     
         */
        public void setMaximumPeriodicInterval(DcpSlaveDescription.Heartbeat.MaximumPeriodicInterval value) {
            this.maximumPeriodicInterval = value;
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
         *       &lt;attribute name="numerator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
         *       &lt;attribute name="denominator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MaximumPeriodicInterval {

            @XmlAttribute(name = "numerator")
            @XmlSchemaType(name = "unsignedInt")
            protected Long numerator;
            @XmlAttribute(name = "denominator")
            @XmlSchemaType(name = "unsignedInt")
            protected Long denominator;

            /**
             * Ruft den Wert der numerator-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getNumerator() {
                if (numerator == null) {
                    return  1L;
                } else {
                    return numerator;
                }
            }

            /**
             * Legt den Wert der numerator-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setNumerator(Long value) {
                this.numerator = value;
            }

            /**
             * Ruft den Wert der denominator-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getDenominator() {
                if (denominator == null) {
                    return  1L;
                } else {
                    return denominator;
                }
            }

            /**
             * Legt den Wert der denominator-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setDenominator(Long value) {
                this.denominator = value;
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
     *       &lt;sequence>
     *         &lt;element name="Categories">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="Category">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Templates">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="Template">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="level" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="msg" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "categories",
        "templates"
    })
    public static class Log {

        @XmlElement(name = "Categories", required = true)
        protected DcpSlaveDescription.Log.Categories categories;
        @XmlElement(name = "Templates", required = true)
        protected DcpSlaveDescription.Log.Templates templates;

        /**
         * Ruft den Wert der categories-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpSlaveDescription.Log.Categories }
         *     
         */
        public DcpSlaveDescription.Log.Categories getCategories() {
            return categories;
        }

        /**
         * Legt den Wert der categories-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpSlaveDescription.Log.Categories }
         *     
         */
        public void setCategories(DcpSlaveDescription.Log.Categories value) {
            this.categories = value;
        }

        /**
         * Ruft den Wert der templates-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpSlaveDescription.Log.Templates }
         *     
         */
        public DcpSlaveDescription.Log.Templates getTemplates() {
            return templates;
        }

        /**
         * Legt den Wert der templates-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpSlaveDescription.Log.Templates }
         *     
         */
        public void setTemplates(DcpSlaveDescription.Log.Templates value) {
            this.templates = value;
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
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;element name="Category">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        @XmlType(name = "", propOrder = {
            "category"
        })
        public static class Categories {

            @XmlElement(name = "Category", required = true)
            protected List<DcpSlaveDescription.Log.Categories.Category> category;

            /**
             * Gets the value of the category property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the category property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCategory().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DcpSlaveDescription.Log.Categories.Category }
             * 
             * 
             */
            public List<DcpSlaveDescription.Log.Categories.Category> getCategory() {
                if (category == null) {
                    category = new ArrayList<DcpSlaveDescription.Log.Categories.Category>();
                }
                return this.category;
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
             *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Category {

                @XmlAttribute(name = "id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short id;
                @XmlAttribute(name = "name", required = true)
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String name;

                /**
                 * Ruft den Wert der id-Eigenschaft ab.
                 * 
                 */
                public short getId() {
                    return id;
                }

                /**
                 * Legt den Wert der id-Eigenschaft fest.
                 * 
                 */
                public void setId(short value) {
                    this.id = value;
                }

                /**
                 * Ruft den Wert der name-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Legt den Wert der name-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
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
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;element name="Template">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="level" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="msg" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        @XmlType(name = "", propOrder = {
            "template"
        })
        public static class Templates {

            @XmlElement(name = "Template", required = true)
            protected List<DcpSlaveDescription.Log.Templates.Template> template;

            /**
             * Gets the value of the template property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the template property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTemplate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DcpSlaveDescription.Log.Templates.Template }
             * 
             * 
             */
            public List<DcpSlaveDescription.Log.Templates.Template> getTemplate() {
                if (template == null) {
                    template = new ArrayList<DcpSlaveDescription.Log.Templates.Template>();
                }
                return this.template;
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
             *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="level" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="msg" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Template {

                @XmlAttribute(name = "id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short id;
                @XmlAttribute(name = "category", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short category;
                @XmlAttribute(name = "level", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short level;
                @XmlAttribute(name = "msg", required = true)
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String msg;

                /**
                 * Ruft den Wert der id-Eigenschaft ab.
                 * 
                 */
                public short getId() {
                    return id;
                }

                /**
                 * Legt den Wert der id-Eigenschaft fest.
                 * 
                 */
                public void setId(short value) {
                    this.id = value;
                }

                /**
                 * Ruft den Wert der category-Eigenschaft ab.
                 * 
                 */
                public short getCategory() {
                    return category;
                }

                /**
                 * Legt den Wert der category-Eigenschaft fest.
                 * 
                 */
                public void setCategory(short value) {
                    this.category = value;
                }

                /**
                 * Ruft den Wert der level-Eigenschaft ab.
                 * 
                 */
                public short getLevel() {
                    return level;
                }

                /**
                 * Legt den Wert der level-Eigenschaft fest.
                 * 
                 */
                public void setLevel(short value) {
                    this.level = value;
                }

                /**
                 * Ruft den Wert der msg-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMsg() {
                    return msg;
                }

                /**
                 * Legt den Wert der msg-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMsg(String value) {
                    this.msg = value;
                }

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
     *       &lt;sequence>
     *         &lt;element name="HardRealTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="SoftRealTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="NonRealTime" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="defaultSteps" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
     *                 &lt;attribute name="fixedSteps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *                 &lt;attribute name="minSteps" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                 &lt;attribute name="maxSteps" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
    @XmlType(name = "", propOrder = {
        "hardRealTime",
        "softRealTime",
        "nonRealTime"
    })
    public static class OpMode {

        @XmlElement(name = "HardRealTime")
        protected String hardRealTime;
        @XmlElement(name = "SoftRealTime")
        protected String softRealTime;
        @XmlElement(name = "NonRealTime")
        protected DcpSlaveDescription.OpMode.NonRealTime nonRealTime;

        /**
         * Ruft den Wert der hardRealTime-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public String getHardRealTime() {
            return hardRealTime;
        }

        /**
         * Legt den Wert der hardRealTime-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setHardRealTime(String value) {
            this.hardRealTime = value;
        }

        /**
         * Ruft den Wert der softRealTime-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public String getSoftRealTime() {
            return softRealTime;
        }

        /**
         * Legt den Wert der softRealTime-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSoftRealTime(String value) {
            this.softRealTime = value;
        }

        /**
         * Ruft den Wert der nonRealTime-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpSlaveDescription.OpMode.NonRealTime }
         *     
         */
        public DcpSlaveDescription.OpMode.NonRealTime getNonRealTime() {
            return nonRealTime;
        }

        /**
         * Legt den Wert der nonRealTime-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpSlaveDescription.OpMode.NonRealTime }
         *     
         */
        public void setNonRealTime(DcpSlaveDescription.OpMode.NonRealTime value) {
            this.nonRealTime = value;
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
         *       &lt;attribute name="defaultSteps" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
         *       &lt;attribute name="fixedSteps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
         *       &lt;attribute name="minSteps" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *       &lt;attribute name="maxSteps" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NonRealTime {

            @XmlAttribute(name = "defaultSteps")
            @XmlSchemaType(name = "unsignedInt")
            protected Long defaultSteps;
            @XmlAttribute(name = "fixedSteps")
            protected Boolean fixedSteps;
            @XmlAttribute(name = "minSteps")
            @XmlSchemaType(name = "unsignedInt")
            protected Long minSteps;
            @XmlAttribute(name = "maxSteps")
            @XmlSchemaType(name = "unsignedInt")
            protected Long maxSteps;

            /**
             * Ruft den Wert der defaultSteps-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getDefaultSteps() {
                if (defaultSteps == null) {
                    return  1L;
                } else {
                    return defaultSteps;
                }
            }

            /**
             * Legt den Wert der defaultSteps-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setDefaultSteps(Long value) {
                this.defaultSteps = value;
            }

            /**
             * Ruft den Wert der fixedSteps-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isFixedSteps() {
                if (fixedSteps == null) {
                    return true;
                } else {
                    return fixedSteps;
                }
            }

            /**
             * Legt den Wert der fixedSteps-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFixedSteps(Boolean value) {
                this.fixedSteps = value;
            }

            /**
             * Ruft den Wert der minSteps-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getMinSteps() {
                return minSteps;
            }

            /**
             * Legt den Wert der minSteps-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setMinSteps(Long value) {
                this.minSteps = value;
            }

            /**
             * Ruft den Wert der maxSteps-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getMaxSteps() {
                return maxSteps;
            }

            /**
             * Legt den Wert der maxSteps-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setMaxSteps(Long value) {
                this.maxSteps = value;
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
     *           &lt;element name="Resolution">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="numerator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
     *                   &lt;attribute name="denominator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1000" />
     *                   &lt;attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *                   &lt;attribute name="recommended" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="ResolutionRange">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="numeratorFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                   &lt;attribute name="numeratorTo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                   &lt;attribute name="denominator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resolutionOrResolutionRange"
    })
    public static class TimeRes {

        @XmlElements({
            @XmlElement(name = "Resolution", type = DcpSlaveDescription.TimeRes.Resolution.class),
            @XmlElement(name = "ResolutionRange", type = DcpSlaveDescription.TimeRes.ResolutionRange.class)
        })
        protected List<Object> resolutionOrResolutionRange;

        /**
         * Gets the value of the resolutionOrResolutionRange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resolutionOrResolutionRange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResolutionOrResolutionRange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DcpSlaveDescription.TimeRes.Resolution }
         * {@link DcpSlaveDescription.TimeRes.ResolutionRange }
         * 
         * 
         */
        public List<Object> getResolutionOrResolutionRange() {
            if (resolutionOrResolutionRange == null) {
                resolutionOrResolutionRange = new ArrayList<Object>();
            }
            return this.resolutionOrResolutionRange;
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
         *       &lt;attribute name="numerator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
         *       &lt;attribute name="denominator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1000" />
         *       &lt;attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
         *       &lt;attribute name="recommended" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Resolution {

            @XmlAttribute(name = "numerator")
            @XmlSchemaType(name = "unsignedInt")
            protected Long numerator;
            @XmlAttribute(name = "denominator")
            @XmlSchemaType(name = "unsignedInt")
            protected Long denominator;
            @XmlAttribute(name = "fixed")
            protected Boolean fixed;
            @XmlAttribute(name = "recommended")
            protected Boolean recommended;

            /**
             * Ruft den Wert der numerator-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getNumerator() {
                if (numerator == null) {
                    return  1L;
                } else {
                    return numerator;
                }
            }

            /**
             * Legt den Wert der numerator-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setNumerator(Long value) {
                this.numerator = value;
            }

            /**
             * Ruft den Wert der denominator-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getDenominator() {
                if (denominator == null) {
                    return  1000L;
                } else {
                    return denominator;
                }
            }

            /**
             * Legt den Wert der denominator-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setDenominator(Long value) {
                this.denominator = value;
            }

            /**
             * Ruft den Wert der fixed-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isFixed() {
                if (fixed == null) {
                    return true;
                } else {
                    return fixed;
                }
            }

            /**
             * Legt den Wert der fixed-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFixed(Boolean value) {
                this.fixed = value;
            }

            /**
             * Ruft den Wert der recommended-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRecommended() {
                return recommended;
            }

            /**
             * Legt den Wert der recommended-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRecommended(Boolean value) {
                this.recommended = value;
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
         *       &lt;attribute name="numeratorFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *       &lt;attribute name="numeratorTo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *       &lt;attribute name="denominator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ResolutionRange {

            @XmlAttribute(name = "numeratorFrom", required = true)
            @XmlSchemaType(name = "unsignedInt")
            protected long numeratorFrom;
            @XmlAttribute(name = "numeratorTo", required = true)
            @XmlSchemaType(name = "unsignedInt")
            protected long numeratorTo;
            @XmlAttribute(name = "denominator", required = true)
            @XmlSchemaType(name = "unsignedInt")
            protected long denominator;

            /**
             * Ruft den Wert der numeratorFrom-Eigenschaft ab.
             * 
             */
            public long getNumeratorFrom() {
                return numeratorFrom;
            }

            /**
             * Legt den Wert der numeratorFrom-Eigenschaft fest.
             * 
             */
            public void setNumeratorFrom(long value) {
                this.numeratorFrom = value;
            }

            /**
             * Ruft den Wert der numeratorTo-Eigenschaft ab.
             * 
             */
            public long getNumeratorTo() {
                return numeratorTo;
            }

            /**
             * Legt den Wert der numeratorTo-Eigenschaft fest.
             * 
             */
            public void setNumeratorTo(long value) {
                this.numeratorTo = value;
            }

            /**
             * Ruft den Wert der denominator-Eigenschaft ab.
             * 
             */
            public long getDenominator() {
                return denominator;
            }

            /**
             * Legt den Wert der denominator-Eigenschaft fest.
             * 
             */
            public void setDenominator(long value) {
                this.denominator = value;
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
     *       &lt;sequence>
     *         &lt;element name="UDP_IPv4" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{}dcpIPv4Type">
     *                 &lt;attribute name="maxPduSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="65507" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CAN" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="USB2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{}dcpUSB2Type">
     *                 &lt;attribute name="maxPduSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1024" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Bluetooth" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{}dcpBluetoothType">
     *                 &lt;attribute name="maxPduSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1011" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TCP_IPv4" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{}dcpIPv4Type">
     *                 &lt;attribute name="maxPduSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="4294967267" />
     *               &lt;/extension>
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
    @XmlType(name = "", propOrder = {
        "udpiPv4",
        "can",
        "usb2",
        "bluetooth",
        "tcpiPv4"
    })
    public static class TransportProtocols {

        @XmlElement(name = "UDP_IPv4")
        protected DcpSlaveDescription.TransportProtocols.UDPIPv4 udpiPv4;
        @XmlElement(name = "CAN")
        protected DcpSlaveDescription.TransportProtocols.CAN can;
        @XmlElement(name = "USB2")
        protected DcpSlaveDescription.TransportProtocols.USB2 usb2;
        @XmlElement(name = "Bluetooth")
        protected DcpSlaveDescription.TransportProtocols.Bluetooth bluetooth;
        @XmlElement(name = "TCP_IPv4")
        protected DcpSlaveDescription.TransportProtocols.TCPIPv4 tcpiPv4;

        /**
         * Ruft den Wert der udpiPv4-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpSlaveDescription.TransportProtocols.UDPIPv4 }
         *     
         */
        public DcpSlaveDescription.TransportProtocols.UDPIPv4 getUDPIPv4() {
            return udpiPv4;
        }

        /**
         * Legt den Wert der udpiPv4-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpSlaveDescription.TransportProtocols.UDPIPv4 }
         *     
         */
        public void setUDPIPv4(DcpSlaveDescription.TransportProtocols.UDPIPv4 value) {
            this.udpiPv4 = value;
        }

        /**
         * Ruft den Wert der can-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpSlaveDescription.TransportProtocols.CAN }
         *     
         */
        public DcpSlaveDescription.TransportProtocols.CAN getCAN() {
            return can;
        }

        /**
         * Legt den Wert der can-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpSlaveDescription.TransportProtocols.CAN }
         *     
         */
        public void setCAN(DcpSlaveDescription.TransportProtocols.CAN value) {
            this.can = value;
        }

        /**
         * Ruft den Wert der usb2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpSlaveDescription.TransportProtocols.USB2 }
         *     
         */
        public DcpSlaveDescription.TransportProtocols.USB2 getUSB2() {
            return usb2;
        }

        /**
         * Legt den Wert der usb2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpSlaveDescription.TransportProtocols.USB2 }
         *     
         */
        public void setUSB2(DcpSlaveDescription.TransportProtocols.USB2 value) {
            this.usb2 = value;
        }

        /**
         * Ruft den Wert der bluetooth-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpSlaveDescription.TransportProtocols.Bluetooth }
         *     
         */
        public DcpSlaveDescription.TransportProtocols.Bluetooth getBluetooth() {
            return bluetooth;
        }

        /**
         * Legt den Wert der bluetooth-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpSlaveDescription.TransportProtocols.Bluetooth }
         *     
         */
        public void setBluetooth(DcpSlaveDescription.TransportProtocols.Bluetooth value) {
            this.bluetooth = value;
        }

        /**
         * Ruft den Wert der tcpiPv4-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpSlaveDescription.TransportProtocols.TCPIPv4 }
         *     
         */
        public DcpSlaveDescription.TransportProtocols.TCPIPv4 getTCPIPv4() {
            return tcpiPv4;
        }

        /**
         * Legt den Wert der tcpiPv4-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpSlaveDescription.TransportProtocols.TCPIPv4 }
         *     
         */
        public void setTCPIPv4(DcpSlaveDescription.TransportProtocols.TCPIPv4 value) {
            this.tcpiPv4 = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{}dcpBluetoothType">
         *       &lt;attribute name="maxPduSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1011" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Bluetooth
            extends DcpBluetoothType
        {

            @XmlAttribute(name = "maxPduSize")
            @XmlSchemaType(name = "unsignedInt")
            protected Long maxPduSize;

            /**
             * Ruft den Wert der maxPduSize-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getMaxPduSize() {
                if (maxPduSize == null) {
                    return  1011L;
                } else {
                    return maxPduSize;
                }
            }

            /**
             * Legt den Wert der maxPduSize-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setMaxPduSize(Long value) {
                this.maxPduSize = value;
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CAN {


        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{}dcpIPv4Type">
         *       &lt;attribute name="maxPduSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="4294967267" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TCPIPv4
            extends DcpIPv4Type
        {

            @XmlAttribute(name = "maxPduSize")
            @XmlSchemaType(name = "unsignedInt")
            protected Long maxPduSize;

            /**
             * Ruft den Wert der maxPduSize-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getMaxPduSize() {
                if (maxPduSize == null) {
                    return  4294967267L;
                } else {
                    return maxPduSize;
                }
            }

            /**
             * Legt den Wert der maxPduSize-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setMaxPduSize(Long value) {
                this.maxPduSize = value;
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
         *     &lt;extension base="{}dcpIPv4Type">
         *       &lt;attribute name="maxPduSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="65507" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UDPIPv4
            extends DcpIPv4Type
        {

            @XmlAttribute(name = "maxPduSize")
            @XmlSchemaType(name = "unsignedInt")
            protected Long maxPduSize;

            /**
             * Ruft den Wert der maxPduSize-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getMaxPduSize() {
                if (maxPduSize == null) {
                    return  65507L;
                } else {
                    return maxPduSize;
                }
            }

            /**
             * Legt den Wert der maxPduSize-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setMaxPduSize(Long value) {
                this.maxPduSize = value;
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
         *     &lt;extension base="{}dcpUSB2Type">
         *       &lt;attribute name="maxPduSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1024" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class USB2
            extends DcpUSB2Type
        {

            @XmlAttribute(name = "maxPduSize")
            @XmlSchemaType(name = "unsignedInt")
            protected Long maxPduSize;

            /**
             * Ruft den Wert der maxPduSize-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public long getMaxPduSize() {
                if (maxPduSize == null) {
                    return  1024L;
                } else {
                    return maxPduSize;
                }
            }

            /**
             * Legt den Wert der maxPduSize-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setMaxPduSize(Long value) {
                this.maxPduSize = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="SimpleType" type="{}dcpSimpleType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "simpleType"
    })
    public static class TypeDefinitions {

        @XmlElement(name = "SimpleType", required = true)
        protected List<DcpSimpleType> simpleType;

        /**
         * Gets the value of the simpleType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the simpleType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSimpleType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DcpSimpleType }
         * 
         * 
         */
        public List<DcpSimpleType> getSimpleType() {
            if (simpleType == null) {
                simpleType = new ArrayList<DcpSimpleType>();
            }
            return this.simpleType;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="Unit" type="{}dcpUnit"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unit"
    })
    public static class UnitDefinitions {

        @XmlElement(name = "Unit", required = true)
        protected List<DcpUnit> unit;

        /**
         * Gets the value of the unit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DcpUnit }
         * 
         * 
         */
        public List<DcpUnit> getUnit() {
            if (unit == null) {
                unit = new ArrayList<DcpUnit>();
            }
            return this.unit;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="Variable" type="{}dcpVariable"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "variable"
    })
    public static class Variables {

        @XmlElement(name = "Variable", required = true)
        protected List<DcpVariable> variable;

        /**
         * Gets the value of the variable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVariable().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DcpVariable }
         * 
         * 
         */
        public List<DcpVariable> getVariable() {
            if (variable == null) {
                variable = new ArrayList<DcpVariable>();
            }
            return this.variable;
        }

    }

}
