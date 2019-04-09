//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.04 um 04:38:57 PM CET 
//


package dcpTestProcedure;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="TransportProtocols">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="UDP_IPv4" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Control">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                                     &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DAT_input_output" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="AvailablePortRange">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                                 &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="AvailablePort">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DAT_parameter" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="AvailablePortRange">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                                 &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="AvailablePort">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CAN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="USB" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="DataPipe">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="direction">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="In"/>
 *                                           &lt;enumeration value="Out"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="endpointAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="intervall" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Bluetooth" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Address">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="bd_addr" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="port" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                                           &lt;minInclusive value="1"/>
 *                                           &lt;maxInclusive value="30"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TCP_IPv4" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Control">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                                     &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DAT_input_output" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="AvailablePortRange">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                                 &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="AvailablePort">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DAT_parameter" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="AvailablePortRange">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                                 &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="AvailablePort">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;choice>
 *             &lt;element name="Transition">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;choice>
 *                       &lt;element name="Sending">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="ClockTime" minOccurs="0">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;attribute name="numerator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                         &lt;attribute name="denominator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;choice>
 *                                   &lt;element name="CFG_time_res">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="numerator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                           &lt;attribute name="denominator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_steps">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="steps" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_input">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="target_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                                           &lt;attribute name="source_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_output">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="source_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_source_network_information">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_source_network_information_UDP_IPv4">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_source_network_information_USB">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="endpoint_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_source_network_information_Bluetooth">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="bd_addr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_source_network_information_TCP_IPv4">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_target_network_information">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_target_network_information_UDP_IPv4">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_target_network_information_USB">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="endpoint_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="slave_uuid" use="required">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;length value="36"/>
 *                                                 &lt;pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/attribute>
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_target_network_information_Bluetooth">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="bd_addr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_target_network_information_TCP_IPv4">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_clear">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_parameter">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;sequence>
 *                                             &lt;element name="Payload">
 *                                               &lt;complexType>
 *                                                 &lt;complexContent>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                     &lt;choice>
 *                                                       &lt;element name="Int8">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;attribute name="value" use="required">
 *                                                                 &lt;simpleType>
 *                                                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                                                 &lt;/simpleType>
 *                                                               &lt;/attribute>
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                       &lt;element name="Int16">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;attribute name="value" use="required">
 *                                                                 &lt;simpleType>
 *                                                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
 *                                                                 &lt;/simpleType>
 *                                                               &lt;/attribute>
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                       &lt;element name="Int32">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;attribute name="value" use="required">
 *                                                                 &lt;simpleType>
 *                                                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" />
 *                                                                 &lt;/simpleType>
 *                                                               &lt;/attribute>
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                       &lt;element name="Int64">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;attribute name="value" use="required">
 *                                                                 &lt;simpleType>
 *                                                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
 *                                                                 &lt;/simpleType>
 *                                                               &lt;/attribute>
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                       &lt;element name="Uint8">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;attribute name="value" use="required">
 *                                                                 &lt;simpleType>
 *                                                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                                                 &lt;/simpleType>
 *                                                               &lt;/attribute>
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                       &lt;element name="Uint16">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;attribute name="value" use="required">
 *                                                                 &lt;simpleType>
 *                                                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                                                 &lt;/simpleType>
 *                                                               &lt;/attribute>
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                       &lt;element name="Uint32">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;attribute name="value" use="required">
 *                                                                 &lt;simpleType>
 *                                                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                                                 &lt;/simpleType>
 *                                                               &lt;/attribute>
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                       &lt;element name="Uint64">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;attribute name="value" use="required">
 *                                                                 &lt;simpleType>
 *                                                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                                                                 &lt;/simpleType>
 *                                                               &lt;/attribute>
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                       &lt;element name="Float32">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;attribute name="value" use="required">
 *                                                                 &lt;simpleType>
 *                                                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                 &lt;/simpleType>
 *                                                               &lt;/attribute>
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                       &lt;element name="Float64">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;attribute name="value" use="required">
 *                                                                 &lt;simpleType>
 *                                                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                                 &lt;/simpleType>
 *                                                               &lt;/attribute>
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                       &lt;element name="String">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                       &lt;element name="Binary">
 *                                                         &lt;complexType>
 *                                                           &lt;complexContent>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                               &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *                                                             &lt;/restriction>
 *                                                           &lt;/complexContent>
 *                                                         &lt;/complexType>
 *                                                       &lt;/element>
 *                                                     &lt;/choice>
 *                                                   &lt;/restriction>
 *                                                 &lt;/complexContent>
 *                                               &lt;/complexType>
 *                                             &lt;/element>
 *                                           &lt;/sequence>
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="target_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="source_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_tunable_parameter">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="target_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="source_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_param_network_information">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_param_network_information_UDP_IPv4">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_param_network_information_USB">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="endpoint_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_param_network_information_Bluetooth">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="bd_addr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_param_network_information_TCP_IPv4">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_logging">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="log_category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="log_level" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="log_mode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="CFG_scope">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                           &lt;attribute name="scope" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="STC_register">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="slave_uuid">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;length value="36"/>
 *                                                 &lt;pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/attribute>
 *                                           &lt;attribute name="op_mode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="major_version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="minor_version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="STC_deregister">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="STC_prepare">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="STC_configure">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="STC_initialize">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="STC_run">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="start_time" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="STC_do_step">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="steps" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="STC_send_outputs">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="STC_stop">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="STC_reset">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="INF_state">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="INF_error">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="INF_log">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="log_category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                           &lt;attribute name="log_max_num" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="DAT_input_output">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;sequence maxOccurs="unbounded">
 *                                             &lt;element ref="{}SendingPayloadField"/>
 *                                           &lt;/sequence>
 *                                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                   &lt;element name="DAT_parameter">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;sequence maxOccurs="unbounded">
 *                                             &lt;element ref="{}SendingPayloadField"/>
 *                                           &lt;/sequence>
 *                                           &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                 &lt;/choice>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Receiving">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;choice>
 *                                 &lt;element name="RSP_ack">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="RSP_error_ack">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;attribute name="error_code" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="RSP_nack">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;attribute name="error_code" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                         &lt;attribute name="exp_pdu_seq_id" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="RSP_state_ack">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="NTF_state_changed">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="RSP_log_ack">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="NTF_log">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                         &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="DAT_input_output">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence maxOccurs="unbounded">
 *                                           &lt;element ref="{}ReceivingPayloadField"/>
 *                                         &lt;/sequence>
 *                                         &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="DAT_parameter">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence maxOccurs="unbounded">
 *                                           &lt;element ref="{}ReceivingPayloadField"/>
 *                                         &lt;/sequence>
 *                                         &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                               &lt;/choice>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                     &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                     &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                     &lt;attribute name="log" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="acceptingSteps">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
    "transportProtocols",
    "transition"
})
@XmlRootElement(name = "DcpTestProcedure")
public class DcpTestProcedure {

    @XmlElement(name = "TransportProtocols", required = true)
    protected DcpTestProcedure.TransportProtocols transportProtocols;
    @XmlElement(name = "Transition")
    protected List<DcpTestProcedure.Transition> transition;
    @XmlAttribute(name = "version", required = true)
    protected double version;
    @XmlAttribute(name = "name")
    protected java.lang.String name;
    @XmlAttribute(name = "acceptingSteps")
    protected List<Long> acceptingSteps;

    /**
     * Ruft den Wert der transportProtocols-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpTestProcedure.TransportProtocols }
     *     
     */
    public DcpTestProcedure.TransportProtocols getTransportProtocols() {
        return transportProtocols;
    }

    /**
     * Legt den Wert der transportProtocols-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpTestProcedure.TransportProtocols }
     *     
     */
    public void setTransportProtocols(DcpTestProcedure.TransportProtocols value) {
        this.transportProtocols = value;
    }

    /**
     * Gets the value of the transition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DcpTestProcedure.Transition }
     * 
     * 
     */
    public List<DcpTestProcedure.Transition> getTransition() {
        if (transition == null) {
            transition = new ArrayList<DcpTestProcedure.Transition>();
        }
        return this.transition;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     */
    public double getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     */
    public void setVersion(double value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setName(java.lang.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the acceptingSteps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptingSteps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptingSteps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAcceptingSteps() {
        if (acceptingSteps == null) {
            acceptingSteps = new ArrayList<Long>();
        }
        return this.acceptingSteps;
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
     *       &lt;choice>
     *         &lt;element name="Sending">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ClockTime" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="numerator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                           &lt;attribute name="denominator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;choice>
     *                     &lt;element name="CFG_time_res">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="numerator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                             &lt;attribute name="denominator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_steps">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="steps" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_input">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="target_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                             &lt;attribute name="source_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_output">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="source_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_source_network_information">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_source_network_information_UDP_IPv4">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                             &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_source_network_information_USB">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="endpoint_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_source_network_information_Bluetooth">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="bd_addr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_source_network_information_TCP_IPv4">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                             &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_target_network_information">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_target_network_information_UDP_IPv4">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                             &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_target_network_information_USB">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="endpoint_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="slave_uuid" use="required">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="36"/>
     *                                   &lt;pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/attribute>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_target_network_information_Bluetooth">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="bd_addr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_target_network_information_TCP_IPv4">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                             &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_clear">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_parameter">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="Payload">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;choice>
     *                                         &lt;element name="Int8">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="value" use="required">
     *                                                   &lt;simpleType>
     *                                                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                                   &lt;/simpleType>
     *                                                 &lt;/attribute>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="Int16">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="value" use="required">
     *                                                   &lt;simpleType>
     *                                                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
     *                                                   &lt;/simpleType>
     *                                                 &lt;/attribute>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="Int32">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="value" use="required">
     *                                                   &lt;simpleType>
     *                                                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" />
     *                                                   &lt;/simpleType>
     *                                                 &lt;/attribute>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="Int64">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="value" use="required">
     *                                                   &lt;simpleType>
     *                                                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
     *                                                   &lt;/simpleType>
     *                                                 &lt;/attribute>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="Uint8">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="value" use="required">
     *                                                   &lt;simpleType>
     *                                                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                                   &lt;/simpleType>
     *                                                 &lt;/attribute>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="Uint16">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="value" use="required">
     *                                                   &lt;simpleType>
     *                                                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                                   &lt;/simpleType>
     *                                                 &lt;/attribute>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="Uint32">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="value" use="required">
     *                                                   &lt;simpleType>
     *                                                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                                                   &lt;/simpleType>
     *                                                 &lt;/attribute>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="Uint64">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="value" use="required">
     *                                                   &lt;simpleType>
     *                                                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                                                   &lt;/simpleType>
     *                                                 &lt;/attribute>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="Float32">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="value" use="required">
     *                                                   &lt;simpleType>
     *                                                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                   &lt;/simpleType>
     *                                                 &lt;/attribute>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="Float64">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="value" use="required">
     *                                                   &lt;simpleType>
     *                                                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
     *                                                   &lt;/simpleType>
     *                                                 &lt;/attribute>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="String">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="Binary">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                       &lt;/choice>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="target_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="source_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_tunable_parameter">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="target_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="source_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_param_network_information">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_param_network_information_UDP_IPv4">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                             &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_param_network_information_USB">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="endpoint_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_param_network_information_Bluetooth">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="bd_addr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_param_network_information_TCP_IPv4">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                             &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_logging">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="log_category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="log_level" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="log_mode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CFG_scope">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                             &lt;attribute name="scope" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="STC_register">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="slave_uuid">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="36"/>
     *                                   &lt;pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/attribute>
     *                             &lt;attribute name="op_mode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="major_version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="minor_version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="STC_deregister">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="STC_prepare">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="STC_configure">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="STC_initialize">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="STC_run">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="start_time" type="{http://www.w3.org/2001/XMLSchema}long" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="STC_do_step">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="steps" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="STC_send_outputs">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="STC_stop">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="STC_reset">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="INF_state">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="INF_error">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="INF_log">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="log_category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                             &lt;attribute name="log_max_num" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="DAT_input_output">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence maxOccurs="unbounded">
     *                               &lt;element ref="{}SendingPayloadField"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="DAT_parameter">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence maxOccurs="unbounded">
     *                               &lt;element ref="{}SendingPayloadField"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
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
     *         &lt;element name="Receiving">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="RSP_ack">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RSP_error_ack">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="error_code" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RSP_nack">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="error_code" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                           &lt;attribute name="exp_pdu_seq_id" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RSP_state_ack">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="NTF_state_changed">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RSP_log_ack">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="NTF_log">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DAT_input_output">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="unbounded">
     *                             &lt;element ref="{}ReceivingPayloadField"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DAT_parameter">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="unbounded">
     *                             &lt;element ref="{}ReceivingPayloadField"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *       &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="log" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sending",
        "receiving"
    })
    public static class Transition {

        @XmlElement(name = "Sending")
        protected DcpTestProcedure.Transition.Sending sending;
        @XmlElement(name = "Receiving")
        protected DcpTestProcedure.Transition.Receiving receiving;
        @XmlAttribute(name = "from", required = true)
        @XmlSchemaType(name = "unsignedInt")
        protected long from;
        @XmlAttribute(name = "to", required = true)
        @XmlSchemaType(name = "unsignedInt")
        protected long to;
        @XmlAttribute(name = "log")
        protected Boolean log;

        /**
         * Ruft den Wert der sending-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpTestProcedure.Transition.Sending }
         *     
         */
        public DcpTestProcedure.Transition.Sending getSending() {
            return sending;
        }

        /**
         * Legt den Wert der sending-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpTestProcedure.Transition.Sending }
         *     
         */
        public void setSending(DcpTestProcedure.Transition.Sending value) {
            this.sending = value;
        }

        /**
         * Ruft den Wert der receiving-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpTestProcedure.Transition.Receiving }
         *     
         */
        public DcpTestProcedure.Transition.Receiving getReceiving() {
            return receiving;
        }

        /**
         * Legt den Wert der receiving-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpTestProcedure.Transition.Receiving }
         *     
         */
        public void setReceiving(DcpTestProcedure.Transition.Receiving value) {
            this.receiving = value;
        }

        /**
         * Ruft den Wert der from-Eigenschaft ab.
         * 
         */
        public long getFrom() {
            return from;
        }

        /**
         * Legt den Wert der from-Eigenschaft fest.
         * 
         */
        public void setFrom(long value) {
            this.from = value;
        }

        /**
         * Ruft den Wert der to-Eigenschaft ab.
         * 
         */
        public long getTo() {
            return to;
        }

        /**
         * Legt den Wert der to-Eigenschaft fest.
         * 
         */
        public void setTo(long value) {
            this.to = value;
        }

        /**
         * Ruft den Wert der log-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isLog() {
            if (log == null) {
                return false;
            } else {
                return log;
            }
        }

        /**
         * Legt den Wert der log-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLog(Boolean value) {
            this.log = value;
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
         *       &lt;choice>
         *         &lt;element name="RSP_ack">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RSP_error_ack">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="error_code" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RSP_nack">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="error_code" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                 &lt;attribute name="exp_pdu_seq_id" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RSP_state_ack">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="NTF_state_changed">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RSP_log_ack">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="NTF_log">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DAT_input_output">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="unbounded">
         *                   &lt;element ref="{}ReceivingPayloadField"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DAT_parameter">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="unbounded">
         *                   &lt;element ref="{}ReceivingPayloadField"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "rspAck",
            "rspErrorAck",
            "rspNack",
            "rspStateAck",
            "ntfStateChanged",
            "rspLogAck",
            "ntfLog",
            "datInputOutput",
            "datParameter"
        })
        public static class Receiving {

            @XmlElement(name = "RSP_ack")
            protected DcpTestProcedure.Transition.Receiving.RSPAck rspAck;
            @XmlElement(name = "RSP_error_ack")
            protected DcpTestProcedure.Transition.Receiving.RSPErrorAck rspErrorAck;
            @XmlElement(name = "RSP_nack")
            protected DcpTestProcedure.Transition.Receiving.RSPNack rspNack;
            @XmlElement(name = "RSP_state_ack")
            protected DcpTestProcedure.Transition.Receiving.RSPStateAck rspStateAck;
            @XmlElement(name = "NTF_state_changed")
            protected DcpTestProcedure.Transition.Receiving.NTFStateChanged ntfStateChanged;
            @XmlElement(name = "RSP_log_ack")
            protected DcpTestProcedure.Transition.Receiving.RSPLogAck rspLogAck;
            @XmlElement(name = "NTF_log")
            protected DcpTestProcedure.Transition.Receiving.NTFLog ntfLog;
            @XmlElement(name = "DAT_input_output")
            protected DcpTestProcedure.Transition.Receiving.DATInputOutput datInputOutput;
            @XmlElement(name = "DAT_parameter")
            protected DcpTestProcedure.Transition.Receiving.DATParameter datParameter;

            /**
             * Ruft den Wert der rspAck-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Receiving.RSPAck }
             *     
             */
            public DcpTestProcedure.Transition.Receiving.RSPAck getRSPAck() {
                return rspAck;
            }

            /**
             * Legt den Wert der rspAck-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Receiving.RSPAck }
             *     
             */
            public void setRSPAck(DcpTestProcedure.Transition.Receiving.RSPAck value) {
                this.rspAck = value;
            }

            /**
             * Ruft den Wert der rspErrorAck-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Receiving.RSPErrorAck }
             *     
             */
            public DcpTestProcedure.Transition.Receiving.RSPErrorAck getRSPErrorAck() {
                return rspErrorAck;
            }

            /**
             * Legt den Wert der rspErrorAck-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Receiving.RSPErrorAck }
             *     
             */
            public void setRSPErrorAck(DcpTestProcedure.Transition.Receiving.RSPErrorAck value) {
                this.rspErrorAck = value;
            }

            /**
             * Ruft den Wert der rspNack-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Receiving.RSPNack }
             *     
             */
            public DcpTestProcedure.Transition.Receiving.RSPNack getRSPNack() {
                return rspNack;
            }

            /**
             * Legt den Wert der rspNack-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Receiving.RSPNack }
             *     
             */
            public void setRSPNack(DcpTestProcedure.Transition.Receiving.RSPNack value) {
                this.rspNack = value;
            }

            /**
             * Ruft den Wert der rspStateAck-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Receiving.RSPStateAck }
             *     
             */
            public DcpTestProcedure.Transition.Receiving.RSPStateAck getRSPStateAck() {
                return rspStateAck;
            }

            /**
             * Legt den Wert der rspStateAck-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Receiving.RSPStateAck }
             *     
             */
            public void setRSPStateAck(DcpTestProcedure.Transition.Receiving.RSPStateAck value) {
                this.rspStateAck = value;
            }

            /**
             * Ruft den Wert der ntfStateChanged-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Receiving.NTFStateChanged }
             *     
             */
            public DcpTestProcedure.Transition.Receiving.NTFStateChanged getNTFStateChanged() {
                return ntfStateChanged;
            }

            /**
             * Legt den Wert der ntfStateChanged-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Receiving.NTFStateChanged }
             *     
             */
            public void setNTFStateChanged(DcpTestProcedure.Transition.Receiving.NTFStateChanged value) {
                this.ntfStateChanged = value;
            }

            /**
             * Ruft den Wert der rspLogAck-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Receiving.RSPLogAck }
             *     
             */
            public DcpTestProcedure.Transition.Receiving.RSPLogAck getRSPLogAck() {
                return rspLogAck;
            }

            /**
             * Legt den Wert der rspLogAck-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Receiving.RSPLogAck }
             *     
             */
            public void setRSPLogAck(DcpTestProcedure.Transition.Receiving.RSPLogAck value) {
                this.rspLogAck = value;
            }

            /**
             * Ruft den Wert der ntfLog-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Receiving.NTFLog }
             *     
             */
            public DcpTestProcedure.Transition.Receiving.NTFLog getNTFLog() {
                return ntfLog;
            }

            /**
             * Legt den Wert der ntfLog-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Receiving.NTFLog }
             *     
             */
            public void setNTFLog(DcpTestProcedure.Transition.Receiving.NTFLog value) {
                this.ntfLog = value;
            }

            /**
             * Ruft den Wert der datInputOutput-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Receiving.DATInputOutput }
             *     
             */
            public DcpTestProcedure.Transition.Receiving.DATInputOutput getDATInputOutput() {
                return datInputOutput;
            }

            /**
             * Legt den Wert der datInputOutput-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Receiving.DATInputOutput }
             *     
             */
            public void setDATInputOutput(DcpTestProcedure.Transition.Receiving.DATInputOutput value) {
                this.datInputOutput = value;
            }

            /**
             * Ruft den Wert der datParameter-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Receiving.DATParameter }
             *     
             */
            public DcpTestProcedure.Transition.Receiving.DATParameter getDATParameter() {
                return datParameter;
            }

            /**
             * Legt den Wert der datParameter-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Receiving.DATParameter }
             *     
             */
            public void setDATParameter(DcpTestProcedure.Transition.Receiving.DATParameter value) {
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
             *       &lt;sequence maxOccurs="unbounded">
             *         &lt;element ref="{}ReceivingPayloadField"/>
             *       &lt;/sequence>
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "receivingPayloadField"
            })
            public static class DATInputOutput {

                @XmlElement(name = "ReceivingPayloadField", required = true)
                protected List<ReceivingPayloadField> receivingPayloadField;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;

                /**
                 * Gets the value of the receivingPayloadField property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the receivingPayloadField property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getReceivingPayloadField().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReceivingPayloadField }
                 * 
                 * 
                 */
                public List<ReceivingPayloadField> getReceivingPayloadField() {
                    if (receivingPayloadField == null) {
                        receivingPayloadField = new ArrayList<ReceivingPayloadField>();
                    }
                    return this.receivingPayloadField;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
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
             *         &lt;element ref="{}ReceivingPayloadField"/>
             *       &lt;/sequence>
             *       &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "receivingPayloadField"
            })
            public static class DATParameter {

                @XmlElement(name = "ReceivingPayloadField", required = true)
                protected List<ReceivingPayloadField> receivingPayloadField;
                @XmlAttribute(name = "param_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int paramId;

                /**
                 * Gets the value of the receivingPayloadField property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the receivingPayloadField property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getReceivingPayloadField().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReceivingPayloadField }
                 * 
                 * 
                 */
                public List<ReceivingPayloadField> getReceivingPayloadField() {
                    if (receivingPayloadField == null) {
                        receivingPayloadField = new ArrayList<ReceivingPayloadField>();
                    }
                    return this.receivingPayloadField;
                }

                /**
                 * Ruft den Wert der paramId-Eigenschaft ab.
                 * 
                 */
                public int getParamId() {
                    return paramId;
                }

                /**
                 * Legt den Wert der paramId-Eigenschaft fest.
                 * 
                 */
                public void setParamId(int value) {
                    this.paramId = value;
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
             *       &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class NTFLog {

                @XmlAttribute(name = "sender", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short sender;
                @XmlAttribute(name = "length", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long length;

                /**
                 * Ruft den Wert der sender-Eigenschaft ab.
                 * 
                 */
                public short getSender() {
                    return sender;
                }

                /**
                 * Legt den Wert der sender-Eigenschaft fest.
                 * 
                 */
                public void setSender(short value) {
                    this.sender = value;
                }

                /**
                 * Ruft den Wert der length-Eigenschaft ab.
                 * 
                 */
                public long getLength() {
                    return length;
                }

                /**
                 * Legt den Wert der length-Eigenschaft fest.
                 * 
                 */
                public void setLength(long value) {
                    this.length = value;
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
             *       &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class NTFStateChanged {

                @XmlAttribute(name = "sender", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short sender;
                @XmlAttribute(name = "state_id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short stateId;

                /**
                 * Ruft den Wert der sender-Eigenschaft ab.
                 * 
                 */
                public short getSender() {
                    return sender;
                }

                /**
                 * Legt den Wert der sender-Eigenschaft fest.
                 * 
                 */
                public void setSender(short value) {
                    this.sender = value;
                }

                /**
                 * Ruft den Wert der stateId-Eigenschaft ab.
                 * 
                 */
                public short getStateId() {
                    return stateId;
                }

                /**
                 * Legt den Wert der stateId-Eigenschaft fest.
                 * 
                 */
                public void setStateId(short value) {
                    this.stateId = value;
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
             *       &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RSPAck {

                @XmlAttribute(name = "sender", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short sender;

                /**
                 * Ruft den Wert der sender-Eigenschaft ab.
                 * 
                 */
                public short getSender() {
                    return sender;
                }

                /**
                 * Legt den Wert der sender-Eigenschaft fest.
                 * 
                 */
                public void setSender(short value) {
                    this.sender = value;
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
             *       &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="error_code" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RSPErrorAck {

                @XmlAttribute(name = "sender", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short sender;
                @XmlAttribute(name = "error_code", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int errorCode;

                /**
                 * Ruft den Wert der sender-Eigenschaft ab.
                 * 
                 */
                public short getSender() {
                    return sender;
                }

                /**
                 * Legt den Wert der sender-Eigenschaft fest.
                 * 
                 */
                public void setSender(short value) {
                    this.sender = value;
                }

                /**
                 * Ruft den Wert der errorCode-Eigenschaft ab.
                 * 
                 */
                public int getErrorCode() {
                    return errorCode;
                }

                /**
                 * Legt den Wert der errorCode-Eigenschaft fest.
                 * 
                 */
                public void setErrorCode(int value) {
                    this.errorCode = value;
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
             *       &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RSPLogAck {

                @XmlAttribute(name = "sender", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short sender;
                @XmlAttribute(name = "length", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long length;

                /**
                 * Ruft den Wert der sender-Eigenschaft ab.
                 * 
                 */
                public short getSender() {
                    return sender;
                }

                /**
                 * Legt den Wert der sender-Eigenschaft fest.
                 * 
                 */
                public void setSender(short value) {
                    this.sender = value;
                }

                /**
                 * Ruft den Wert der length-Eigenschaft ab.
                 * 
                 */
                public long getLength() {
                    return length;
                }

                /**
                 * Legt den Wert der length-Eigenschaft fest.
                 * 
                 */
                public void setLength(long value) {
                    this.length = value;
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
             *       &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="error_code" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="exp_pdu_seq_id" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RSPNack {

                @XmlAttribute(name = "sender", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short sender;
                @XmlAttribute(name = "error_code", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int errorCode;
                @XmlAttribute(name = "exp_pdu_seq_id")
                @XmlSchemaType(name = "unsignedShort")
                protected Integer expPduSeqId;

                /**
                 * Ruft den Wert der sender-Eigenschaft ab.
                 * 
                 */
                public short getSender() {
                    return sender;
                }

                /**
                 * Legt den Wert der sender-Eigenschaft fest.
                 * 
                 */
                public void setSender(short value) {
                    this.sender = value;
                }

                /**
                 * Ruft den Wert der errorCode-Eigenschaft ab.
                 * 
                 */
                public int getErrorCode() {
                    return errorCode;
                }

                /**
                 * Legt den Wert der errorCode-Eigenschaft fest.
                 * 
                 */
                public void setErrorCode(int value) {
                    this.errorCode = value;
                }

                /**
                 * Ruft den Wert der expPduSeqId-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getExpPduSeqId() {
                    return expPduSeqId;
                }

                /**
                 * Legt den Wert der expPduSeqId-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setExpPduSeqId(Integer value) {
                    this.expPduSeqId = value;
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
             *       &lt;attribute name="sender" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RSPStateAck {

                @XmlAttribute(name = "sender", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short sender;
                @XmlAttribute(name = "state_id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short stateId;

                /**
                 * Ruft den Wert der sender-Eigenschaft ab.
                 * 
                 */
                public short getSender() {
                    return sender;
                }

                /**
                 * Legt den Wert der sender-Eigenschaft fest.
                 * 
                 */
                public void setSender(short value) {
                    this.sender = value;
                }

                /**
                 * Ruft den Wert der stateId-Eigenschaft ab.
                 * 
                 */
                public short getStateId() {
                    return stateId;
                }

                /**
                 * Legt den Wert der stateId-Eigenschaft fest.
                 * 
                 */
                public void setStateId(short value) {
                    this.stateId = value;
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
         *         &lt;element name="ClockTime" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="numerator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                 &lt;attribute name="denominator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;choice>
         *           &lt;element name="CFG_time_res">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="numerator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                   &lt;attribute name="denominator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_steps">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="steps" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_input">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="target_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *                   &lt;attribute name="source_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_output">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="source_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_source_network_information">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_source_network_information_UDP_IPv4">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                   &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_source_network_information_USB">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="endpoint_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_source_network_information_Bluetooth">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="bd_addr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_source_network_information_TCP_IPv4">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                   &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_target_network_information">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_target_network_information_UDP_IPv4">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                   &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_target_network_information_USB">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="endpoint_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="slave_uuid" use="required">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="36"/>
         *                         &lt;pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/attribute>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_target_network_information_Bluetooth">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="bd_addr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_target_network_information_TCP_IPv4">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                   &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_clear">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_parameter">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="Payload">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;choice>
         *                               &lt;element name="Int8">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="value" use="required">
         *                                         &lt;simpleType>
         *                                           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                         &lt;/simpleType>
         *                                       &lt;/attribute>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="Int16">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="value" use="required">
         *                                         &lt;simpleType>
         *                                           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
         *                                         &lt;/simpleType>
         *                                       &lt;/attribute>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="Int32">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="value" use="required">
         *                                         &lt;simpleType>
         *                                           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" />
         *                                         &lt;/simpleType>
         *                                       &lt;/attribute>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="Int64">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="value" use="required">
         *                                         &lt;simpleType>
         *                                           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
         *                                         &lt;/simpleType>
         *                                       &lt;/attribute>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="Uint8">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="value" use="required">
         *                                         &lt;simpleType>
         *                                           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                                         &lt;/simpleType>
         *                                       &lt;/attribute>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="Uint16">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="value" use="required">
         *                                         &lt;simpleType>
         *                                           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                                         &lt;/simpleType>
         *                                       &lt;/attribute>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="Uint32">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="value" use="required">
         *                                         &lt;simpleType>
         *                                           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                                         &lt;/simpleType>
         *                                       &lt;/attribute>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="Uint64">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="value" use="required">
         *                                         &lt;simpleType>
         *                                           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *                                         &lt;/simpleType>
         *                                       &lt;/attribute>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="Float32">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="value" use="required">
         *                                         &lt;simpleType>
         *                                           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
         *                                         &lt;/simpleType>
         *                                       &lt;/attribute>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="Float64">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="value" use="required">
         *                                         &lt;simpleType>
         *                                           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
         *                                         &lt;/simpleType>
         *                                       &lt;/attribute>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="String">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="Binary">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                             &lt;/choice>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="target_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="source_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_tunable_parameter">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="target_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="source_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_param_network_information">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_param_network_information_UDP_IPv4">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                   &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_param_network_information_USB">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="endpoint_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_param_network_information_Bluetooth">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="bd_addr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_param_network_information_TCP_IPv4">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                   &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_logging">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="log_category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="log_level" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="log_mode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CFG_scope">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                   &lt;attribute name="scope" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="STC_register">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="slave_uuid">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="36"/>
         *                         &lt;pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/attribute>
         *                   &lt;attribute name="op_mode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="major_version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="minor_version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="STC_deregister">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="STC_prepare">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="STC_configure">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="STC_initialize">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="STC_run">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="start_time" type="{http://www.w3.org/2001/XMLSchema}long" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="STC_do_step">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="steps" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="STC_send_outputs">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="STC_stop">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="STC_reset">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="INF_state">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="INF_error">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="INF_log">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="log_category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                   &lt;attribute name="log_max_num" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="DAT_input_output">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence maxOccurs="unbounded">
         *                     &lt;element ref="{}SendingPayloadField"/>
         *                   &lt;/sequence>
         *                   &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="DAT_parameter">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence maxOccurs="unbounded">
         *                     &lt;element ref="{}SendingPayloadField"/>
         *                   &lt;/sequence>
         *                   &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
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
            "clockTime",
            "cfgTimeRes",
            "cfgSteps",
            "cfgInput",
            "cfgOutput",
            "cfgSourceNetworkInformation",
            "cfgSourceNetworkInformationUDPIPv4",
            "cfgSourceNetworkInformationUSB",
            "cfgSourceNetworkInformationBluetooth",
            "cfgSourceNetworkInformationTCPIPv4",
            "cfgTargetNetworkInformation",
            "cfgTargetNetworkInformationUDPIPv4",
            "cfgTargetNetworkInformationUSB",
            "cfgTargetNetworkInformationBluetooth",
            "cfgTargetNetworkInformationTCPIPv4",
            "cfgClear",
            "cfgParameter",
            "cfgTunableParameter",
            "cfgParamNetworkInformation",
            "cfgParamNetworkInformationUDPIPv4",
            "cfgParamNetworkInformationUSB",
            "cfgParamNetworkInformationBluetooth",
            "cfgParamNetworkInformationTCPIPv4",
            "cfgLogging",
            "cfgScope",
            "stcRegister",
            "stcDeregister",
            "stcPrepare",
            "stcConfigure",
            "stcInitialize",
            "stcRun",
            "stcDoStep",
            "stcSendOutputs",
            "stcStop",
            "stcReset",
            "infState",
            "infError",
            "infLog",
            "datInputOutput",
            "datParameter"
        })
        public static class Sending {

            @XmlElement(name = "ClockTime")
            protected DcpTestProcedure.Transition.Sending.ClockTime clockTime;
            @XmlElement(name = "CFG_time_res")
            protected DcpTestProcedure.Transition.Sending.CFGTimeRes cfgTimeRes;
            @XmlElement(name = "CFG_steps")
            protected DcpTestProcedure.Transition.Sending.CFGSteps cfgSteps;
            @XmlElement(name = "CFG_input")
            protected DcpTestProcedure.Transition.Sending.CFGInput cfgInput;
            @XmlElement(name = "CFG_output")
            protected DcpTestProcedure.Transition.Sending.CFGOutput cfgOutput;
            @XmlElement(name = "CFG_source_network_information")
            protected DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformation cfgSourceNetworkInformation;
            @XmlElement(name = "CFG_source_network_information_UDP_IPv4")
            protected DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUDPIPv4 cfgSourceNetworkInformationUDPIPv4;
            @XmlElement(name = "CFG_source_network_information_USB")
            protected DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUSB cfgSourceNetworkInformationUSB;
            @XmlElement(name = "CFG_source_network_information_Bluetooth")
            protected DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationBluetooth cfgSourceNetworkInformationBluetooth;
            @XmlElement(name = "CFG_source_network_information_TCP_IPv4")
            protected DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationTCPIPv4 cfgSourceNetworkInformationTCPIPv4;
            @XmlElement(name = "CFG_target_network_information")
            protected DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformation cfgTargetNetworkInformation;
            @XmlElement(name = "CFG_target_network_information_UDP_IPv4")
            protected DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUDPIPv4 cfgTargetNetworkInformationUDPIPv4;
            @XmlElement(name = "CFG_target_network_information_USB")
            protected DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUSB cfgTargetNetworkInformationUSB;
            @XmlElement(name = "CFG_target_network_information_Bluetooth")
            protected DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationBluetooth cfgTargetNetworkInformationBluetooth;
            @XmlElement(name = "CFG_target_network_information_TCP_IPv4")
            protected DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationTCPIPv4 cfgTargetNetworkInformationTCPIPv4;
            @XmlElement(name = "CFG_clear")
            protected DcpTestProcedure.Transition.Sending.CFGClear cfgClear;
            @XmlElement(name = "CFG_parameter")
            protected DcpTestProcedure.Transition.Sending.CFGParameter cfgParameter;
            @XmlElement(name = "CFG_tunable_parameter")
            protected DcpTestProcedure.Transition.Sending.CFGTunableParameter cfgTunableParameter;
            @XmlElement(name = "CFG_param_network_information")
            protected DcpTestProcedure.Transition.Sending.CFGParamNetworkInformation cfgParamNetworkInformation;
            @XmlElement(name = "CFG_param_network_information_UDP_IPv4")
            protected DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUDPIPv4 cfgParamNetworkInformationUDPIPv4;
            @XmlElement(name = "CFG_param_network_information_USB")
            protected DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUSB cfgParamNetworkInformationUSB;
            @XmlElement(name = "CFG_param_network_information_Bluetooth")
            protected DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationBluetooth cfgParamNetworkInformationBluetooth;
            @XmlElement(name = "CFG_param_network_information_TCP_IPv4")
            protected DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationTCPIPv4 cfgParamNetworkInformationTCPIPv4;
            @XmlElement(name = "CFG_logging")
            protected DcpTestProcedure.Transition.Sending.CFGLogging cfgLogging;
            @XmlElement(name = "CFG_scope")
            protected DcpTestProcedure.Transition.Sending.CFGScope cfgScope;
            @XmlElement(name = "STC_register")
            protected DcpTestProcedure.Transition.Sending.STCRegister stcRegister;
            @XmlElement(name = "STC_deregister")
            protected DcpTestProcedure.Transition.Sending.STCDeregister stcDeregister;
            @XmlElement(name = "STC_prepare")
            protected DcpTestProcedure.Transition.Sending.STCPrepare stcPrepare;
            @XmlElement(name = "STC_configure")
            protected DcpTestProcedure.Transition.Sending.STCConfigure stcConfigure;
            @XmlElement(name = "STC_initialize")
            protected DcpTestProcedure.Transition.Sending.STCInitialize stcInitialize;
            @XmlElement(name = "STC_run")
            protected DcpTestProcedure.Transition.Sending.STCRun stcRun;
            @XmlElement(name = "STC_do_step")
            protected DcpTestProcedure.Transition.Sending.STCDoStep stcDoStep;
            @XmlElement(name = "STC_send_outputs")
            protected DcpTestProcedure.Transition.Sending.STCSendOutputs stcSendOutputs;
            @XmlElement(name = "STC_stop")
            protected DcpTestProcedure.Transition.Sending.STCStop stcStop;
            @XmlElement(name = "STC_reset")
            protected DcpTestProcedure.Transition.Sending.STCReset stcReset;
            @XmlElement(name = "INF_state")
            protected DcpTestProcedure.Transition.Sending.INFState infState;
            @XmlElement(name = "INF_error")
            protected DcpTestProcedure.Transition.Sending.INFError infError;
            @XmlElement(name = "INF_log")
            protected DcpTestProcedure.Transition.Sending.INFLog infLog;
            @XmlElement(name = "DAT_input_output")
            protected DcpTestProcedure.Transition.Sending.DATInputOutput datInputOutput;
            @XmlElement(name = "DAT_parameter")
            protected DcpTestProcedure.Transition.Sending.DATParameter datParameter;

            /**
             * Ruft den Wert der clockTime-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.ClockTime }
             *     
             */
            public DcpTestProcedure.Transition.Sending.ClockTime getClockTime() {
                return clockTime;
            }

            /**
             * Legt den Wert der clockTime-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.ClockTime }
             *     
             */
            public void setClockTime(DcpTestProcedure.Transition.Sending.ClockTime value) {
                this.clockTime = value;
            }

            /**
             * Ruft den Wert der cfgTimeRes-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTimeRes }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGTimeRes getCFGTimeRes() {
                return cfgTimeRes;
            }

            /**
             * Legt den Wert der cfgTimeRes-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTimeRes }
             *     
             */
            public void setCFGTimeRes(DcpTestProcedure.Transition.Sending.CFGTimeRes value) {
                this.cfgTimeRes = value;
            }

            /**
             * Ruft den Wert der cfgSteps-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGSteps }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGSteps getCFGSteps() {
                return cfgSteps;
            }

            /**
             * Legt den Wert der cfgSteps-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGSteps }
             *     
             */
            public void setCFGSteps(DcpTestProcedure.Transition.Sending.CFGSteps value) {
                this.cfgSteps = value;
            }

            /**
             * Ruft den Wert der cfgInput-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGInput }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGInput getCFGInput() {
                return cfgInput;
            }

            /**
             * Legt den Wert der cfgInput-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGInput }
             *     
             */
            public void setCFGInput(DcpTestProcedure.Transition.Sending.CFGInput value) {
                this.cfgInput = value;
            }

            /**
             * Ruft den Wert der cfgOutput-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGOutput }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGOutput getCFGOutput() {
                return cfgOutput;
            }

            /**
             * Legt den Wert der cfgOutput-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGOutput }
             *     
             */
            public void setCFGOutput(DcpTestProcedure.Transition.Sending.CFGOutput value) {
                this.cfgOutput = value;
            }

            /**
             * Ruft den Wert der cfgSourceNetworkInformation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformation }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformation getCFGSourceNetworkInformation() {
                return cfgSourceNetworkInformation;
            }

            /**
             * Legt den Wert der cfgSourceNetworkInformation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformation }
             *     
             */
            public void setCFGSourceNetworkInformation(DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformation value) {
                this.cfgSourceNetworkInformation = value;
            }

            /**
             * Ruft den Wert der cfgSourceNetworkInformationUDPIPv4-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUDPIPv4 }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUDPIPv4 getCFGSourceNetworkInformationUDPIPv4() {
                return cfgSourceNetworkInformationUDPIPv4;
            }

            /**
             * Legt den Wert der cfgSourceNetworkInformationUDPIPv4-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUDPIPv4 }
             *     
             */
            public void setCFGSourceNetworkInformationUDPIPv4(DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUDPIPv4 value) {
                this.cfgSourceNetworkInformationUDPIPv4 = value;
            }

            /**
             * Ruft den Wert der cfgSourceNetworkInformationUSB-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUSB }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUSB getCFGSourceNetworkInformationUSB() {
                return cfgSourceNetworkInformationUSB;
            }

            /**
             * Legt den Wert der cfgSourceNetworkInformationUSB-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUSB }
             *     
             */
            public void setCFGSourceNetworkInformationUSB(DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUSB value) {
                this.cfgSourceNetworkInformationUSB = value;
            }

            /**
             * Ruft den Wert der cfgSourceNetworkInformationBluetooth-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationBluetooth }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationBluetooth getCFGSourceNetworkInformationBluetooth() {
                return cfgSourceNetworkInformationBluetooth;
            }

            /**
             * Legt den Wert der cfgSourceNetworkInformationBluetooth-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationBluetooth }
             *     
             */
            public void setCFGSourceNetworkInformationBluetooth(DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationBluetooth value) {
                this.cfgSourceNetworkInformationBluetooth = value;
            }

            /**
             * Ruft den Wert der cfgSourceNetworkInformationTCPIPv4-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationTCPIPv4 }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationTCPIPv4 getCFGSourceNetworkInformationTCPIPv4() {
                return cfgSourceNetworkInformationTCPIPv4;
            }

            /**
             * Legt den Wert der cfgSourceNetworkInformationTCPIPv4-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationTCPIPv4 }
             *     
             */
            public void setCFGSourceNetworkInformationTCPIPv4(DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationTCPIPv4 value) {
                this.cfgSourceNetworkInformationTCPIPv4 = value;
            }

            /**
             * Ruft den Wert der cfgTargetNetworkInformation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformation }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformation getCFGTargetNetworkInformation() {
                return cfgTargetNetworkInformation;
            }

            /**
             * Legt den Wert der cfgTargetNetworkInformation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformation }
             *     
             */
            public void setCFGTargetNetworkInformation(DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformation value) {
                this.cfgTargetNetworkInformation = value;
            }

            /**
             * Ruft den Wert der cfgTargetNetworkInformationUDPIPv4-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUDPIPv4 }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUDPIPv4 getCFGTargetNetworkInformationUDPIPv4() {
                return cfgTargetNetworkInformationUDPIPv4;
            }

            /**
             * Legt den Wert der cfgTargetNetworkInformationUDPIPv4-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUDPIPv4 }
             *     
             */
            public void setCFGTargetNetworkInformationUDPIPv4(DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUDPIPv4 value) {
                this.cfgTargetNetworkInformationUDPIPv4 = value;
            }

            /**
             * Ruft den Wert der cfgTargetNetworkInformationUSB-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUSB }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUSB getCFGTargetNetworkInformationUSB() {
                return cfgTargetNetworkInformationUSB;
            }

            /**
             * Legt den Wert der cfgTargetNetworkInformationUSB-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUSB }
             *     
             */
            public void setCFGTargetNetworkInformationUSB(DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUSB value) {
                this.cfgTargetNetworkInformationUSB = value;
            }

            /**
             * Ruft den Wert der cfgTargetNetworkInformationBluetooth-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationBluetooth }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationBluetooth getCFGTargetNetworkInformationBluetooth() {
                return cfgTargetNetworkInformationBluetooth;
            }

            /**
             * Legt den Wert der cfgTargetNetworkInformationBluetooth-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationBluetooth }
             *     
             */
            public void setCFGTargetNetworkInformationBluetooth(DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationBluetooth value) {
                this.cfgTargetNetworkInformationBluetooth = value;
            }

            /**
             * Ruft den Wert der cfgTargetNetworkInformationTCPIPv4-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationTCPIPv4 }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationTCPIPv4 getCFGTargetNetworkInformationTCPIPv4() {
                return cfgTargetNetworkInformationTCPIPv4;
            }

            /**
             * Legt den Wert der cfgTargetNetworkInformationTCPIPv4-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationTCPIPv4 }
             *     
             */
            public void setCFGTargetNetworkInformationTCPIPv4(DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationTCPIPv4 value) {
                this.cfgTargetNetworkInformationTCPIPv4 = value;
            }

            /**
             * Ruft den Wert der cfgClear-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGClear }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGClear getCFGClear() {
                return cfgClear;
            }

            /**
             * Legt den Wert der cfgClear-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGClear }
             *     
             */
            public void setCFGClear(DcpTestProcedure.Transition.Sending.CFGClear value) {
                this.cfgClear = value;
            }

            /**
             * Ruft den Wert der cfgParameter-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGParameter }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGParameter getCFGParameter() {
                return cfgParameter;
            }

            /**
             * Legt den Wert der cfgParameter-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGParameter }
             *     
             */
            public void setCFGParameter(DcpTestProcedure.Transition.Sending.CFGParameter value) {
                this.cfgParameter = value;
            }

            /**
             * Ruft den Wert der cfgTunableParameter-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTunableParameter }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGTunableParameter getCFGTunableParameter() {
                return cfgTunableParameter;
            }

            /**
             * Legt den Wert der cfgTunableParameter-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGTunableParameter }
             *     
             */
            public void setCFGTunableParameter(DcpTestProcedure.Transition.Sending.CFGTunableParameter value) {
                this.cfgTunableParameter = value;
            }

            /**
             * Ruft den Wert der cfgParamNetworkInformation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformation }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGParamNetworkInformation getCFGParamNetworkInformation() {
                return cfgParamNetworkInformation;
            }

            /**
             * Legt den Wert der cfgParamNetworkInformation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformation }
             *     
             */
            public void setCFGParamNetworkInformation(DcpTestProcedure.Transition.Sending.CFGParamNetworkInformation value) {
                this.cfgParamNetworkInformation = value;
            }

            /**
             * Ruft den Wert der cfgParamNetworkInformationUDPIPv4-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUDPIPv4 }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUDPIPv4 getCFGParamNetworkInformationUDPIPv4() {
                return cfgParamNetworkInformationUDPIPv4;
            }

            /**
             * Legt den Wert der cfgParamNetworkInformationUDPIPv4-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUDPIPv4 }
             *     
             */
            public void setCFGParamNetworkInformationUDPIPv4(DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUDPIPv4 value) {
                this.cfgParamNetworkInformationUDPIPv4 = value;
            }

            /**
             * Ruft den Wert der cfgParamNetworkInformationUSB-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUSB }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUSB getCFGParamNetworkInformationUSB() {
                return cfgParamNetworkInformationUSB;
            }

            /**
             * Legt den Wert der cfgParamNetworkInformationUSB-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUSB }
             *     
             */
            public void setCFGParamNetworkInformationUSB(DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUSB value) {
                this.cfgParamNetworkInformationUSB = value;
            }

            /**
             * Ruft den Wert der cfgParamNetworkInformationBluetooth-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationBluetooth }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationBluetooth getCFGParamNetworkInformationBluetooth() {
                return cfgParamNetworkInformationBluetooth;
            }

            /**
             * Legt den Wert der cfgParamNetworkInformationBluetooth-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationBluetooth }
             *     
             */
            public void setCFGParamNetworkInformationBluetooth(DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationBluetooth value) {
                this.cfgParamNetworkInformationBluetooth = value;
            }

            /**
             * Ruft den Wert der cfgParamNetworkInformationTCPIPv4-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationTCPIPv4 }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationTCPIPv4 getCFGParamNetworkInformationTCPIPv4() {
                return cfgParamNetworkInformationTCPIPv4;
            }

            /**
             * Legt den Wert der cfgParamNetworkInformationTCPIPv4-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationTCPIPv4 }
             *     
             */
            public void setCFGParamNetworkInformationTCPIPv4(DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationTCPIPv4 value) {
                this.cfgParamNetworkInformationTCPIPv4 = value;
            }

            /**
             * Ruft den Wert der cfgLogging-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGLogging }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGLogging getCFGLogging() {
                return cfgLogging;
            }

            /**
             * Legt den Wert der cfgLogging-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGLogging }
             *     
             */
            public void setCFGLogging(DcpTestProcedure.Transition.Sending.CFGLogging value) {
                this.cfgLogging = value;
            }

            /**
             * Ruft den Wert der cfgScope-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGScope }
             *     
             */
            public DcpTestProcedure.Transition.Sending.CFGScope getCFGScope() {
                return cfgScope;
            }

            /**
             * Legt den Wert der cfgScope-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.CFGScope }
             *     
             */
            public void setCFGScope(DcpTestProcedure.Transition.Sending.CFGScope value) {
                this.cfgScope = value;
            }

            /**
             * Ruft den Wert der stcRegister-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.STCRegister }
             *     
             */
            public DcpTestProcedure.Transition.Sending.STCRegister getSTCRegister() {
                return stcRegister;
            }

            /**
             * Legt den Wert der stcRegister-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.STCRegister }
             *     
             */
            public void setSTCRegister(DcpTestProcedure.Transition.Sending.STCRegister value) {
                this.stcRegister = value;
            }

            /**
             * Ruft den Wert der stcDeregister-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.STCDeregister }
             *     
             */
            public DcpTestProcedure.Transition.Sending.STCDeregister getSTCDeregister() {
                return stcDeregister;
            }

            /**
             * Legt den Wert der stcDeregister-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.STCDeregister }
             *     
             */
            public void setSTCDeregister(DcpTestProcedure.Transition.Sending.STCDeregister value) {
                this.stcDeregister = value;
            }

            /**
             * Ruft den Wert der stcPrepare-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.STCPrepare }
             *     
             */
            public DcpTestProcedure.Transition.Sending.STCPrepare getSTCPrepare() {
                return stcPrepare;
            }

            /**
             * Legt den Wert der stcPrepare-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.STCPrepare }
             *     
             */
            public void setSTCPrepare(DcpTestProcedure.Transition.Sending.STCPrepare value) {
                this.stcPrepare = value;
            }

            /**
             * Ruft den Wert der stcConfigure-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.STCConfigure }
             *     
             */
            public DcpTestProcedure.Transition.Sending.STCConfigure getSTCConfigure() {
                return stcConfigure;
            }

            /**
             * Legt den Wert der stcConfigure-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.STCConfigure }
             *     
             */
            public void setSTCConfigure(DcpTestProcedure.Transition.Sending.STCConfigure value) {
                this.stcConfigure = value;
            }

            /**
             * Ruft den Wert der stcInitialize-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.STCInitialize }
             *     
             */
            public DcpTestProcedure.Transition.Sending.STCInitialize getSTCInitialize() {
                return stcInitialize;
            }

            /**
             * Legt den Wert der stcInitialize-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.STCInitialize }
             *     
             */
            public void setSTCInitialize(DcpTestProcedure.Transition.Sending.STCInitialize value) {
                this.stcInitialize = value;
            }

            /**
             * Ruft den Wert der stcRun-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.STCRun }
             *     
             */
            public DcpTestProcedure.Transition.Sending.STCRun getSTCRun() {
                return stcRun;
            }

            /**
             * Legt den Wert der stcRun-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.STCRun }
             *     
             */
            public void setSTCRun(DcpTestProcedure.Transition.Sending.STCRun value) {
                this.stcRun = value;
            }

            /**
             * Ruft den Wert der stcDoStep-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.STCDoStep }
             *     
             */
            public DcpTestProcedure.Transition.Sending.STCDoStep getSTCDoStep() {
                return stcDoStep;
            }

            /**
             * Legt den Wert der stcDoStep-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.STCDoStep }
             *     
             */
            public void setSTCDoStep(DcpTestProcedure.Transition.Sending.STCDoStep value) {
                this.stcDoStep = value;
            }

            /**
             * Ruft den Wert der stcSendOutputs-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.STCSendOutputs }
             *     
             */
            public DcpTestProcedure.Transition.Sending.STCSendOutputs getSTCSendOutputs() {
                return stcSendOutputs;
            }

            /**
             * Legt den Wert der stcSendOutputs-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.STCSendOutputs }
             *     
             */
            public void setSTCSendOutputs(DcpTestProcedure.Transition.Sending.STCSendOutputs value) {
                this.stcSendOutputs = value;
            }

            /**
             * Ruft den Wert der stcStop-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.STCStop }
             *     
             */
            public DcpTestProcedure.Transition.Sending.STCStop getSTCStop() {
                return stcStop;
            }

            /**
             * Legt den Wert der stcStop-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.STCStop }
             *     
             */
            public void setSTCStop(DcpTestProcedure.Transition.Sending.STCStop value) {
                this.stcStop = value;
            }

            /**
             * Ruft den Wert der stcReset-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.STCReset }
             *     
             */
            public DcpTestProcedure.Transition.Sending.STCReset getSTCReset() {
                return stcReset;
            }

            /**
             * Legt den Wert der stcReset-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.STCReset }
             *     
             */
            public void setSTCReset(DcpTestProcedure.Transition.Sending.STCReset value) {
                this.stcReset = value;
            }

            /**
             * Ruft den Wert der infState-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.INFState }
             *     
             */
            public DcpTestProcedure.Transition.Sending.INFState getINFState() {
                return infState;
            }

            /**
             * Legt den Wert der infState-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.INFState }
             *     
             */
            public void setINFState(DcpTestProcedure.Transition.Sending.INFState value) {
                this.infState = value;
            }

            /**
             * Ruft den Wert der infError-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.INFError }
             *     
             */
            public DcpTestProcedure.Transition.Sending.INFError getINFError() {
                return infError;
            }

            /**
             * Legt den Wert der infError-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.INFError }
             *     
             */
            public void setINFError(DcpTestProcedure.Transition.Sending.INFError value) {
                this.infError = value;
            }

            /**
             * Ruft den Wert der infLog-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.INFLog }
             *     
             */
            public DcpTestProcedure.Transition.Sending.INFLog getINFLog() {
                return infLog;
            }

            /**
             * Legt den Wert der infLog-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.INFLog }
             *     
             */
            public void setINFLog(DcpTestProcedure.Transition.Sending.INFLog value) {
                this.infLog = value;
            }

            /**
             * Ruft den Wert der datInputOutput-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.DATInputOutput }
             *     
             */
            public DcpTestProcedure.Transition.Sending.DATInputOutput getDATInputOutput() {
                return datInputOutput;
            }

            /**
             * Legt den Wert der datInputOutput-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.DATInputOutput }
             *     
             */
            public void setDATInputOutput(DcpTestProcedure.Transition.Sending.DATInputOutput value) {
                this.datInputOutput = value;
            }

            /**
             * Ruft den Wert der datParameter-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.Transition.Sending.DATParameter }
             *     
             */
            public DcpTestProcedure.Transition.Sending.DATParameter getDATParameter() {
                return datParameter;
            }

            /**
             * Legt den Wert der datParameter-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.Transition.Sending.DATParameter }
             *     
             */
            public void setDATParameter(DcpTestProcedure.Transition.Sending.DATParameter value) {
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGClear {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="target_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
             *       &lt;attribute name="source_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGInput {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "pos", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int pos;
                @XmlAttribute(name = "target_vr", required = true)
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger targetVr;
                @XmlAttribute(name = "source_data_type", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short sourceDataType;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der pos-Eigenschaft ab.
                 * 
                 */
                public int getPos() {
                    return pos;
                }

                /**
                 * Legt den Wert der pos-Eigenschaft fest.
                 * 
                 */
                public void setPos(int value) {
                    this.pos = value;
                }

                /**
                 * Ruft den Wert der targetVr-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTargetVr() {
                    return targetVr;
                }

                /**
                 * Legt den Wert der targetVr-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTargetVr(BigInteger value) {
                    this.targetVr = value;
                }

                /**
                 * Ruft den Wert der sourceDataType-Eigenschaft ab.
                 * 
                 */
                public short getSourceDataType() {
                    return sourceDataType;
                }

                /**
                 * Legt den Wert der sourceDataType-Eigenschaft fest.
                 * 
                 */
                public void setSourceDataType(short value) {
                    this.sourceDataType = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="log_category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="log_level" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="log_mode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGLogging {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "log_category", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short logCategory;
                @XmlAttribute(name = "log_level", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short logLevel;
                @XmlAttribute(name = "log_mode", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short logMode;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der logCategory-Eigenschaft ab.
                 * 
                 */
                public short getLogCategory() {
                    return logCategory;
                }

                /**
                 * Legt den Wert der logCategory-Eigenschaft fest.
                 * 
                 */
                public void setLogCategory(short value) {
                    this.logCategory = value;
                }

                /**
                 * Ruft den Wert der logLevel-Eigenschaft ab.
                 * 
                 */
                public short getLogLevel() {
                    return logLevel;
                }

                /**
                 * Legt den Wert der logLevel-Eigenschaft fest.
                 * 
                 */
                public void setLogLevel(short value) {
                    this.logLevel = value;
                }

                /**
                 * Ruft den Wert der logMode-Eigenschaft ab.
                 * 
                 */
                public short getLogMode() {
                    return logMode;
                }

                /**
                 * Legt den Wert der logMode-Eigenschaft fest.
                 * 
                 */
                public void setLogMode(short value) {
                    this.logMode = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="source_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGOutput {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "pos", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int pos;
                @XmlAttribute(name = "source_vr", required = true)
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger sourceVr;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der pos-Eigenschaft ab.
                 * 
                 */
                public int getPos() {
                    return pos;
                }

                /**
                 * Legt den Wert der pos-Eigenschaft fest.
                 * 
                 */
                public void setPos(int value) {
                    this.pos = value;
                }

                /**
                 * Ruft den Wert der sourceVr-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSourceVr() {
                    return sourceVr;
                }

                /**
                 * Legt den Wert der sourceVr-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSourceVr(BigInteger value) {
                    this.sourceVr = value;
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
             *         &lt;element name="Payload">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="Int8">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" use="required">
             *                             &lt;simpleType>
             *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Int16">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" use="required">
             *                             &lt;simpleType>
             *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Int32">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" use="required">
             *                             &lt;simpleType>
             *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" />
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Int64">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" use="required">
             *                             &lt;simpleType>
             *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Uint8">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" use="required">
             *                             &lt;simpleType>
             *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Uint16">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" use="required">
             *                             &lt;simpleType>
             *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Uint32">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" use="required">
             *                             &lt;simpleType>
             *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Uint64">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" use="required">
             *                             &lt;simpleType>
             *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Float32">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" use="required">
             *                             &lt;simpleType>
             *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Float64">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" use="required">
             *                             &lt;simpleType>
             *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="String">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Binary">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/choice>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="target_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="source_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "payload"
            })
            public static class CFGParameter {

                @XmlElement(name = "Payload", required = true)
                protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload payload;
                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "target_vr", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int targetVr;
                @XmlAttribute(name = "source_data_type", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short sourceDataType;

                /**
                 * Ruft den Wert der payload-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload }
                 *     
                 */
                public DcpTestProcedure.Transition.Sending.CFGParameter.Payload getPayload() {
                    return payload;
                }

                /**
                 * Legt den Wert der payload-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload }
                 *     
                 */
                public void setPayload(DcpTestProcedure.Transition.Sending.CFGParameter.Payload value) {
                    this.payload = value;
                }

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der targetVr-Eigenschaft ab.
                 * 
                 */
                public int getTargetVr() {
                    return targetVr;
                }

                /**
                 * Legt den Wert der targetVr-Eigenschaft fest.
                 * 
                 */
                public void setTargetVr(int value) {
                    this.targetVr = value;
                }

                /**
                 * Ruft den Wert der sourceDataType-Eigenschaft ab.
                 * 
                 */
                public short getSourceDataType() {
                    return sourceDataType;
                }

                /**
                 * Legt den Wert der sourceDataType-Eigenschaft fest.
                 * 
                 */
                public void setSourceDataType(short value) {
                    this.sourceDataType = value;
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
                 *       &lt;choice>
                 *         &lt;element name="Int8">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Int16">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Int32">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" />
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Int64">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Uint8">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Uint16">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Uint32">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Uint64">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Float32">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Float64">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="String">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Binary">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/choice>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "int8",
                    "int16",
                    "int32",
                    "int64",
                    "uint8",
                    "uint16",
                    "uint32",
                    "uint64",
                    "float32",
                    "float64",
                    "string",
                    "binary"
                })
                public static class Payload {

                    @XmlElement(name = "Int8")
                    protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int8 int8;
                    @XmlElement(name = "Int16")
                    protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16 int16;
                    @XmlElement(name = "Int32")
                    protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32 int32;
                    @XmlElement(name = "Int64")
                    protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64 int64;
                    @XmlElement(name = "Uint8")
                    protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 uint8;
                    @XmlElement(name = "Uint16")
                    protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16 uint16;
                    @XmlElement(name = "Uint32")
                    protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32 uint32;
                    @XmlElement(name = "Uint64")
                    protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64 uint64;
                    @XmlElement(name = "Float32")
                    protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32 float32;
                    @XmlElement(name = "Float64")
                    protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64 float64;
                    @XmlElement(name = "String")
                    protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload.String string;
                    @XmlElement(name = "Binary")
                    protected DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Binary binary;

                    /**
                     * Ruft den Wert der int8-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int8 }
                     *     
                     */
                    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int8 getInt8() {
                        return int8;
                    }

                    /**
                     * Legt den Wert der int8-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int8 }
                     *     
                     */
                    public void setInt8(DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int8 value) {
                        this.int8 = value;
                    }

                    /**
                     * Ruft den Wert der int16-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16 }
                     *     
                     */
                    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16 getInt16() {
                        return int16;
                    }

                    /**
                     * Legt den Wert der int16-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16 }
                     *     
                     */
                    public void setInt16(DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16 value) {
                        this.int16 = value;
                    }

                    /**
                     * Ruft den Wert der int32-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32 }
                     *     
                     */
                    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32 getInt32() {
                        return int32;
                    }

                    /**
                     * Legt den Wert der int32-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32 }
                     *     
                     */
                    public void setInt32(DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32 value) {
                        this.int32 = value;
                    }

                    /**
                     * Ruft den Wert der int64-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64 }
                     *     
                     */
                    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64 getInt64() {
                        return int64;
                    }

                    /**
                     * Legt den Wert der int64-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64 }
                     *     
                     */
                    public void setInt64(DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64 value) {
                        this.int64 = value;
                    }

                    /**
                     * Ruft den Wert der uint8-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 }
                     *     
                     */
                    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 getUint8() {
                        return uint8;
                    }

                    /**
                     * Legt den Wert der uint8-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 }
                     *     
                     */
                    public void setUint8(DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 value) {
                        this.uint8 = value;
                    }

                    /**
                     * Ruft den Wert der uint16-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16 }
                     *     
                     */
                    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16 getUint16() {
                        return uint16;
                    }

                    /**
                     * Legt den Wert der uint16-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16 }
                     *     
                     */
                    public void setUint16(DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16 value) {
                        this.uint16 = value;
                    }

                    /**
                     * Ruft den Wert der uint32-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32 }
                     *     
                     */
                    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32 getUint32() {
                        return uint32;
                    }

                    /**
                     * Legt den Wert der uint32-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32 }
                     *     
                     */
                    public void setUint32(DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32 value) {
                        this.uint32 = value;
                    }

                    /**
                     * Ruft den Wert der uint64-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64 }
                     *     
                     */
                    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64 getUint64() {
                        return uint64;
                    }

                    /**
                     * Legt den Wert der uint64-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64 }
                     *     
                     */
                    public void setUint64(DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64 value) {
                        this.uint64 = value;
                    }

                    /**
                     * Ruft den Wert der float32-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32 }
                     *     
                     */
                    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32 getFloat32() {
                        return float32;
                    }

                    /**
                     * Legt den Wert der float32-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32 }
                     *     
                     */
                    public void setFloat32(DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32 value) {
                        this.float32 = value;
                    }

                    /**
                     * Ruft den Wert der float64-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64 }
                     *     
                     */
                    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64 getFloat64() {
                        return float64;
                    }

                    /**
                     * Legt den Wert der float64-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64 }
                     *     
                     */
                    public void setFloat64(DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64 value) {
                        this.float64 = value;
                    }

                    /**
                     * Ruft den Wert der string-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.String }
                     *     
                     */
                    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.String getString() {
                        return string;
                    }

                    /**
                     * Legt den Wert der string-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.String }
                     *     
                     */
                    public void setString(DcpTestProcedure.Transition.Sending.CFGParameter.Payload.String value) {
                        this.string = value;
                    }

                    /**
                     * Ruft den Wert der binary-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Binary }
                     *     
                     */
                    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Binary getBinary() {
                        return binary;
                    }

                    /**
                     * Legt den Wert der binary-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Binary }
                     *     
                     */
                    public void setBinary(DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Binary value) {
                        this.binary = value;
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
                     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Binary {

                        @XmlAttribute(name = "value", required = true)
                        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
                        @XmlSchemaType(name = "hexBinary")
                        protected byte[] value;

                        /**
                         * Ruft den Wert der value-Eigenschaft ab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link java.lang.String }
                         *     
                         */
                        public byte[] getValue() {
                            return value;
                        }

                        /**
                         * Legt den Wert der value-Eigenschaft fest.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link java.lang.String }
                         *     
                         */
                        public void setValue(byte[] value) {
                            this.value = value;
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
                     *       &lt;attribute name="value" use="required">
                     *         &lt;simpleType>
                     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
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
                    @XmlType(name = "")
                    public static class Float32 {

                        @XmlAttribute(name = "value", required = true)
                        protected List<Float> value;

                        /**
                         * Gets the value of the value property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the value property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getValue().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Float }
                         * 
                         * 
                         */
                        public List<Float> getValue() {
                            if (value == null) {
                                value = new ArrayList<Float>();
                            }
                            return this.value;
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
                     *       &lt;attribute name="value" use="required">
                     *         &lt;simpleType>
                     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
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
                    @XmlType(name = "")
                    public static class Float64 {

                        @XmlAttribute(name = "value", required = true)
                        protected List<Double> value;

                        /**
                         * Gets the value of the value property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the value property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getValue().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Double }
                         * 
                         * 
                         */
                        public List<Double> getValue() {
                            if (value == null) {
                                value = new ArrayList<Double>();
                            }
                            return this.value;
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
                     *       &lt;attribute name="value" use="required">
                     *         &lt;simpleType>
                     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
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
                    @XmlType(name = "")
                    public static class Int16 {

                        @XmlAttribute(name = "value", required = true)
                        protected List<Short> value;

                        /**
                         * Gets the value of the value property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the value property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getValue().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Short }
                         * 
                         * 
                         */
                        public List<Short> getValue() {
                            if (value == null) {
                                value = new ArrayList<Short>();
                            }
                            return this.value;
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
                     *       &lt;attribute name="value" use="required">
                     *         &lt;simpleType>
                     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" />
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
                    @XmlType(name = "")
                    public static class Int32 {

                        @XmlAttribute(name = "value", required = true)
                        protected List<Integer> value;

                        /**
                         * Gets the value of the value property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the value property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getValue().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Integer }
                         * 
                         * 
                         */
                        public List<Integer> getValue() {
                            if (value == null) {
                                value = new ArrayList<Integer>();
                            }
                            return this.value;
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
                     *       &lt;attribute name="value" use="required">
                     *         &lt;simpleType>
                     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
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
                    @XmlType(name = "")
                    public static class Int64 {

                        @XmlAttribute(name = "value", required = true)
                        protected List<Long> value;

                        /**
                         * Gets the value of the value property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the value property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getValue().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Long }
                         * 
                         * 
                         */
                        public List<Long> getValue() {
                            if (value == null) {
                                value = new ArrayList<Long>();
                            }
                            return this.value;
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
                     *       &lt;attribute name="value" use="required">
                     *         &lt;simpleType>
                     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
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
                    @XmlType(name = "")
                    public static class Int8 {

                        @XmlAttribute(name = "value", required = true)
                        protected List<Byte> value;

                        /**
                         * Gets the value of the value property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the value property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getValue().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Byte }
                         * 
                         * 
                         */
                        public List<Byte> getValue() {
                            if (value == null) {
                                value = new ArrayList<Byte>();
                            }
                            return this.value;
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
                     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class String {

                        @XmlAttribute(name = "value", required = true)
                        protected java.lang.String value;

                        /**
                         * Ruft den Wert der value-Eigenschaft ab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link java.lang.String }
                         *     
                         */
                        public java.lang.String getValue() {
                            return value;
                        }

                        /**
                         * Legt den Wert der value-Eigenschaft fest.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link java.lang.String }
                         *     
                         */
                        public void setValue(java.lang.String value) {
                            this.value = value;
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
                     *       &lt;attribute name="value" use="required">
                     *         &lt;simpleType>
                     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
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
                    @XmlType(name = "")
                    public static class Uint16 {

                        @XmlAttribute(name = "value", required = true)
                        protected List<Integer> value;

                        /**
                         * Gets the value of the value property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the value property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getValue().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Integer }
                         * 
                         * 
                         */
                        public List<Integer> getValue() {
                            if (value == null) {
                                value = new ArrayList<Integer>();
                            }
                            return this.value;
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
                     *       &lt;attribute name="value" use="required">
                     *         &lt;simpleType>
                     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
                    @XmlType(name = "")
                    public static class Uint32 {

                        @XmlAttribute(name = "value", required = true)
                        protected List<Long> value;

                        /**
                         * Gets the value of the value property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the value property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getValue().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Long }
                         * 
                         * 
                         */
                        public List<Long> getValue() {
                            if (value == null) {
                                value = new ArrayList<Long>();
                            }
                            return this.value;
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
                     *       &lt;attribute name="value" use="required">
                     *         &lt;simpleType>
                     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
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
                    @XmlType(name = "")
                    public static class Uint64 {

                        @XmlAttribute(name = "value", required = true)
                        protected List<BigInteger> value;

                        /**
                         * Gets the value of the value property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the value property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getValue().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link BigInteger }
                         * 
                         * 
                         */
                        public List<BigInteger> getValue() {
                            if (value == null) {
                                value = new ArrayList<BigInteger>();
                            }
                            return this.value;
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
                     *       &lt;attribute name="value" use="required">
                     *         &lt;simpleType>
                     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                    @XmlType(name = "")
                    public static class Uint8 {

                        @XmlAttribute(name = "value", required = true)
                        protected List<Short> value;

                        /**
                         * Gets the value of the value property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the value property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getValue().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Short }
                         * 
                         * 
                         */
                        public List<Short> getValue() {
                            if (value == null) {
                                value = new ArrayList<Short>();
                            }
                            return this.value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGParamNetworkInformation {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "param_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int paramId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der paramId-Eigenschaft ab.
                 * 
                 */
                public int getParamId() {
                    return paramId;
                }

                /**
                 * Legt den Wert der paramId-Eigenschaft fest.
                 * 
                 */
                public void setParamId(int value) {
                    this.paramId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="bd_addr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGParamNetworkInformationBluetooth {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;
                @XmlAttribute(name = "port", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short port;
                @XmlAttribute(name = "bd_addr", required = true)
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger bdAddr;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
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
                 * Ruft den Wert der bdAddr-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getBdAddr() {
                    return bdAddr;
                }

                /**
                 * Legt den Wert der bdAddr-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setBdAddr(BigInteger value) {
                    this.bdAddr = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
            public static class CFGParamNetworkInformationTCPIPv4 {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "param_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int paramId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;
                @XmlAttribute(name = "ip_address", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long ipAddress;
                @XmlAttribute(name = "port", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int port;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der paramId-Eigenschaft ab.
                 * 
                 */
                public int getParamId() {
                    return paramId;
                }

                /**
                 * Legt den Wert der paramId-Eigenschaft fest.
                 * 
                 */
                public void setParamId(int value) {
                    this.paramId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
                }

                /**
                 * Ruft den Wert der ipAddress-Eigenschaft ab.
                 * 
                 */
                public long getIpAddress() {
                    return ipAddress;
                }

                /**
                 * Legt den Wert der ipAddress-Eigenschaft fest.
                 * 
                 */
                public void setIpAddress(long value) {
                    this.ipAddress = value;
                }

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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
            public static class CFGParamNetworkInformationUDPIPv4 {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "param_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int paramId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;
                @XmlAttribute(name = "ip_address", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long ipAddress;
                @XmlAttribute(name = "port", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int port;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der paramId-Eigenschaft ab.
                 * 
                 */
                public int getParamId() {
                    return paramId;
                }

                /**
                 * Legt den Wert der paramId-Eigenschaft fest.
                 * 
                 */
                public void setParamId(int value) {
                    this.paramId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
                }

                /**
                 * Ruft den Wert der ipAddress-Eigenschaft ab.
                 * 
                 */
                public long getIpAddress() {
                    return ipAddress;
                }

                /**
                 * Legt den Wert der ipAddress-Eigenschaft fest.
                 * 
                 */
                public void setIpAddress(long value) {
                    this.ipAddress = value;
                }

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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="endpoint_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGParamNetworkInformationUSB {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;
                @XmlAttribute(name = "endpoint_address", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short endpointAddress;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="scope" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGScope {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "scope", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short scope;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der scope-Eigenschaft ab.
                 * 
                 */
                public short getScope() {
                    return scope;
                }

                /**
                 * Legt den Wert der scope-Eigenschaft fest.
                 * 
                 */
                public void setScope(short value) {
                    this.scope = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGSourceNetworkInformation {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="bd_addr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGSourceNetworkInformationBluetooth {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;
                @XmlAttribute(name = "port", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short port;
                @XmlAttribute(name = "bd_addr", required = true)
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger bdAddr;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
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
                 * Ruft den Wert der bdAddr-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getBdAddr() {
                    return bdAddr;
                }

                /**
                 * Legt den Wert der bdAddr-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setBdAddr(BigInteger value) {
                    this.bdAddr = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
            public static class CFGSourceNetworkInformationTCPIPv4 {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;
                @XmlAttribute(name = "ip_address", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long ipAddress;
                @XmlAttribute(name = "port", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int port;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
                }

                /**
                 * Ruft den Wert der ipAddress-Eigenschaft ab.
                 * 
                 */
                public long getIpAddress() {
                    return ipAddress;
                }

                /**
                 * Legt den Wert der ipAddress-Eigenschaft fest.
                 * 
                 */
                public void setIpAddress(long value) {
                    this.ipAddress = value;
                }

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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
            public static class CFGSourceNetworkInformationUDPIPv4 {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;
                @XmlAttribute(name = "ip_address", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long ipAddress;
                @XmlAttribute(name = "port", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int port;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
                }

                /**
                 * Ruft den Wert der ipAddress-Eigenschaft ab.
                 * 
                 */
                public long getIpAddress() {
                    return ipAddress;
                }

                /**
                 * Legt den Wert der ipAddress-Eigenschaft fest.
                 * 
                 */
                public void setIpAddress(long value) {
                    this.ipAddress = value;
                }

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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="endpoint_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGSourceNetworkInformationUSB {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;
                @XmlAttribute(name = "endpoint_address", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short endpointAddress;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="steps" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGSteps {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "steps", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long steps;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der steps-Eigenschaft ab.
                 * 
                 */
                public long getSteps() {
                    return steps;
                }

                /**
                 * Legt den Wert der steps-Eigenschaft fest.
                 * 
                 */
                public void setSteps(long value) {
                    this.steps = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGTargetNetworkInformation {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="bd_addr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGTargetNetworkInformationBluetooth {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;
                @XmlAttribute(name = "port", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short port;
                @XmlAttribute(name = "bd_addr", required = true)
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger bdAddr;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
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
                 * Ruft den Wert der bdAddr-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getBdAddr() {
                    return bdAddr;
                }

                /**
                 * Legt den Wert der bdAddr-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setBdAddr(BigInteger value) {
                    this.bdAddr = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
            public static class CFGTargetNetworkInformationTCPIPv4 {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;
                @XmlAttribute(name = "ip_address", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long ipAddress;
                @XmlAttribute(name = "port", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int port;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
                }

                /**
                 * Ruft den Wert der ipAddress-Eigenschaft ab.
                 * 
                 */
                public long getIpAddress() {
                    return ipAddress;
                }

                /**
                 * Legt den Wert der ipAddress-Eigenschaft fest.
                 * 
                 */
                public void setIpAddress(long value) {
                    this.ipAddress = value;
                }

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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="ip_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
            public static class CFGTargetNetworkInformationUDPIPv4 {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;
                @XmlAttribute(name = "ip_address", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long ipAddress;
                @XmlAttribute(name = "port", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int port;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
                }

                /**
                 * Ruft den Wert der ipAddress-Eigenschaft ab.
                 * 
                 */
                public long getIpAddress() {
                    return ipAddress;
                }

                /**
                 * Legt den Wert der ipAddress-Eigenschaft fest.
                 * 
                 */
                public void setIpAddress(long value) {
                    this.ipAddress = value;
                }

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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="transport_protocol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="endpoint_address" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="slave_uuid" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="36"/>
             *             &lt;pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"/>
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
            @XmlType(name = "")
            public static class CFGTargetNetworkInformationUSB {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;
                @XmlAttribute(name = "transport_protocol", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transportProtocol;
                @XmlAttribute(name = "endpoint_address", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short endpointAddress;
                @XmlAttribute(name = "slave_uuid", required = true)
                protected java.lang.String slaveUuid;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
                }

                /**
                 * Ruft den Wert der transportProtocol-Eigenschaft ab.
                 * 
                 */
                public short getTransportProtocol() {
                    return transportProtocol;
                }

                /**
                 * Legt den Wert der transportProtocol-Eigenschaft fest.
                 * 
                 */
                public void setTransportProtocol(short value) {
                    this.transportProtocol = value;
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
                 * Ruft den Wert der slaveUuid-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.lang.String }
                 *     
                 */
                public java.lang.String getSlaveUuid() {
                    return slaveUuid;
                }

                /**
                 * Legt den Wert der slaveUuid-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String }
                 *     
                 */
                public void setSlaveUuid(java.lang.String value) {
                    this.slaveUuid = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="numerator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
            public static class CFGTimeRes {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "numerator", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long numerator;
                @XmlAttribute(name = "denominator", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long denominator;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der numerator-Eigenschaft ab.
                 * 
                 */
                public long getNumerator() {
                    return numerator;
                }

                /**
                 * Legt den Wert der numerator-Eigenschaft fest.
                 * 
                 */
                public void setNumerator(long value) {
                    this.numerator = value;
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


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="target_vr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *       &lt;attribute name="source_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CFGTunableParameter {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "param_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int paramId;
                @XmlAttribute(name = "pos", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int pos;
                @XmlAttribute(name = "target_vr", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int targetVr;
                @XmlAttribute(name = "source_data_type", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short sourceDataType;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der paramId-Eigenschaft ab.
                 * 
                 */
                public int getParamId() {
                    return paramId;
                }

                /**
                 * Legt den Wert der paramId-Eigenschaft fest.
                 * 
                 */
                public void setParamId(int value) {
                    this.paramId = value;
                }

                /**
                 * Ruft den Wert der pos-Eigenschaft ab.
                 * 
                 */
                public int getPos() {
                    return pos;
                }

                /**
                 * Legt den Wert der pos-Eigenschaft fest.
                 * 
                 */
                public void setPos(int value) {
                    this.pos = value;
                }

                /**
                 * Ruft den Wert der targetVr-Eigenschaft ab.
                 * 
                 */
                public int getTargetVr() {
                    return targetVr;
                }

                /**
                 * Legt den Wert der targetVr-Eigenschaft fest.
                 * 
                 */
                public void setTargetVr(int value) {
                    this.targetVr = value;
                }

                /**
                 * Ruft den Wert der sourceDataType-Eigenschaft ab.
                 * 
                 */
                public short getSourceDataType() {
                    return sourceDataType;
                }

                /**
                 * Legt den Wert der sourceDataType-Eigenschaft fest.
                 * 
                 */
                public void setSourceDataType(short value) {
                    this.sourceDataType = value;
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
             *       &lt;attribute name="numerator" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
            public static class ClockTime {

                @XmlAttribute(name = "numerator", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long numerator;
                @XmlAttribute(name = "denominator", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long denominator;

                /**
                 * Ruft den Wert der numerator-Eigenschaft ab.
                 * 
                 */
                public long getNumerator() {
                    return numerator;
                }

                /**
                 * Legt den Wert der numerator-Eigenschaft fest.
                 * 
                 */
                public void setNumerator(long value) {
                    this.numerator = value;
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
             *         &lt;element ref="{}SendingPayloadField"/>
             *       &lt;/sequence>
             *       &lt;attribute name="data_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "sendingPayloadField"
            })
            public static class DATInputOutput {

                @XmlElement(name = "SendingPayloadField", required = true)
                protected List<SendingPayloadField> sendingPayloadField;
                @XmlAttribute(name = "data_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int dataId;

                /**
                 * Gets the value of the sendingPayloadField property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the sendingPayloadField property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSendingPayloadField().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SendingPayloadField }
                 * 
                 * 
                 */
                public List<SendingPayloadField> getSendingPayloadField() {
                    if (sendingPayloadField == null) {
                        sendingPayloadField = new ArrayList<SendingPayloadField>();
                    }
                    return this.sendingPayloadField;
                }

                /**
                 * Ruft den Wert der dataId-Eigenschaft ab.
                 * 
                 */
                public int getDataId() {
                    return dataId;
                }

                /**
                 * Legt den Wert der dataId-Eigenschaft fest.
                 * 
                 */
                public void setDataId(int value) {
                    this.dataId = value;
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
             *         &lt;element ref="{}SendingPayloadField"/>
             *       &lt;/sequence>
             *       &lt;attribute name="param_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "sendingPayloadField"
            })
            public static class DATParameter {

                @XmlElement(name = "SendingPayloadField", required = true)
                protected List<SendingPayloadField> sendingPayloadField;
                @XmlAttribute(name = "param_id", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int paramId;

                /**
                 * Gets the value of the sendingPayloadField property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the sendingPayloadField property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSendingPayloadField().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SendingPayloadField }
                 * 
                 * 
                 */
                public List<SendingPayloadField> getSendingPayloadField() {
                    if (sendingPayloadField == null) {
                        sendingPayloadField = new ArrayList<SendingPayloadField>();
                    }
                    return this.sendingPayloadField;
                }

                /**
                 * Ruft den Wert der paramId-Eigenschaft ab.
                 * 
                 */
                public int getParamId() {
                    return paramId;
                }

                /**
                 * Legt den Wert der paramId-Eigenschaft fest.
                 * 
                 */
                public void setParamId(int value) {
                    this.paramId = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class INFError {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="log_category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="log_max_num" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class INFLog {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "log_category", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short logCategory;
                @XmlAttribute(name = "log_max_num", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short logMaxNum;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der logCategory-Eigenschaft ab.
                 * 
                 */
                public short getLogCategory() {
                    return logCategory;
                }

                /**
                 * Legt den Wert der logCategory-Eigenschaft fest.
                 * 
                 */
                public void setLogCategory(short value) {
                    this.logCategory = value;
                }

                /**
                 * Ruft den Wert der logMaxNum-Eigenschaft ab.
                 * 
                 */
                public short getLogMaxNum() {
                    return logMaxNum;
                }

                /**
                 * Legt den Wert der logMaxNum-Eigenschaft fest.
                 * 
                 */
                public void setLogMaxNum(short value) {
                    this.logMaxNum = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class INFState {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class STCConfigure {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "state_id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short stateId;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der stateId-Eigenschaft ab.
                 * 
                 */
                public short getStateId() {
                    return stateId;
                }

                /**
                 * Legt den Wert der stateId-Eigenschaft fest.
                 * 
                 */
                public void setStateId(short value) {
                    this.stateId = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class STCDeregister {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "state_id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short stateId;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der stateId-Eigenschaft ab.
                 * 
                 */
                public short getStateId() {
                    return stateId;
                }

                /**
                 * Legt den Wert der stateId-Eigenschaft fest.
                 * 
                 */
                public void setStateId(short value) {
                    this.stateId = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="steps" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class STCDoStep {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "state_id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short stateId;
                @XmlAttribute(name = "steps", required = true)
                @XmlSchemaType(name = "unsignedInt")
                protected long steps;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der stateId-Eigenschaft ab.
                 * 
                 */
                public short getStateId() {
                    return stateId;
                }

                /**
                 * Legt den Wert der stateId-Eigenschaft fest.
                 * 
                 */
                public void setStateId(short value) {
                    this.stateId = value;
                }

                /**
                 * Ruft den Wert der steps-Eigenschaft ab.
                 * 
                 */
                public long getSteps() {
                    return steps;
                }

                /**
                 * Legt den Wert der steps-Eigenschaft fest.
                 * 
                 */
                public void setSteps(long value) {
                    this.steps = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class STCInitialize {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "state_id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short stateId;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der stateId-Eigenschaft ab.
                 * 
                 */
                public short getStateId() {
                    return stateId;
                }

                /**
                 * Legt den Wert der stateId-Eigenschaft fest.
                 * 
                 */
                public void setStateId(short value) {
                    this.stateId = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class STCPrepare {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "state_id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short stateId;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der stateId-Eigenschaft ab.
                 * 
                 */
                public short getStateId() {
                    return stateId;
                }

                /**
                 * Legt den Wert der stateId-Eigenschaft fest.
                 * 
                 */
                public void setStateId(short value) {
                    this.stateId = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="slave_uuid">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="36"/>
             *             &lt;pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="op_mode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="major_version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="minor_version" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class STCRegister {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "state_id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short stateId;
                @XmlAttribute(name = "slave_uuid")
                protected java.lang.String slaveUuid;
                @XmlAttribute(name = "op_mode", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short opMode;
                @XmlAttribute(name = "major_version", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short majorVersion;
                @XmlAttribute(name = "minor_version", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short minorVersion;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der stateId-Eigenschaft ab.
                 * 
                 */
                public short getStateId() {
                    return stateId;
                }

                /**
                 * Legt den Wert der stateId-Eigenschaft fest.
                 * 
                 */
                public void setStateId(short value) {
                    this.stateId = value;
                }

                /**
                 * Ruft den Wert der slaveUuid-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.lang.String }
                 *     
                 */
                public java.lang.String getSlaveUuid() {
                    return slaveUuid;
                }

                /**
                 * Legt den Wert der slaveUuid-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String }
                 *     
                 */
                public void setSlaveUuid(java.lang.String value) {
                    this.slaveUuid = value;
                }

                /**
                 * Ruft den Wert der opMode-Eigenschaft ab.
                 * 
                 */
                public short getOpMode() {
                    return opMode;
                }

                /**
                 * Legt den Wert der opMode-Eigenschaft fest.
                 * 
                 */
                public void setOpMode(short value) {
                    this.opMode = value;
                }

                /**
                 * Ruft den Wert der majorVersion-Eigenschaft ab.
                 * 
                 */
                public short getMajorVersion() {
                    return majorVersion;
                }

                /**
                 * Legt den Wert der majorVersion-Eigenschaft fest.
                 * 
                 */
                public void setMajorVersion(short value) {
                    this.majorVersion = value;
                }

                /**
                 * Ruft den Wert der minorVersion-Eigenschaft ab.
                 * 
                 */
                public short getMinorVersion() {
                    return minorVersion;
                }

                /**
                 * Legt den Wert der minorVersion-Eigenschaft fest.
                 * 
                 */
                public void setMinorVersion(short value) {
                    this.minorVersion = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class STCReset {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "state_id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short stateId;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der stateId-Eigenschaft ab.
                 * 
                 */
                public short getStateId() {
                    return stateId;
                }

                /**
                 * Legt den Wert der stateId-Eigenschaft fest.
                 * 
                 */
                public void setStateId(short value) {
                    this.stateId = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="start_time" type="{http://www.w3.org/2001/XMLSchema}long" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class STCRun {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "state_id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short stateId;
                @XmlAttribute(name = "start_time")
                protected Long startTime;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der stateId-Eigenschaft ab.
                 * 
                 */
                public short getStateId() {
                    return stateId;
                }

                /**
                 * Legt den Wert der stateId-Eigenschaft fest.
                 * 
                 */
                public void setStateId(short value) {
                    this.stateId = value;
                }

                /**
                 * Ruft den Wert der startTime-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getStartTime() {
                    return startTime;
                }

                /**
                 * Legt den Wert der startTime-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setStartTime(Long value) {
                    this.startTime = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class STCSendOutputs {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "state_id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short stateId;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der stateId-Eigenschaft ab.
                 * 
                 */
                public short getStateId() {
                    return stateId;
                }

                /**
                 * Legt den Wert der stateId-Eigenschaft fest.
                 * 
                 */
                public void setStateId(short value) {
                    this.stateId = value;
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
             *       &lt;attribute name="receiver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="state_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class STCStop {

                @XmlAttribute(name = "receiver", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short receiver;
                @XmlAttribute(name = "state_id", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short stateId;

                /**
                 * Ruft den Wert der receiver-Eigenschaft ab.
                 * 
                 */
                public short getReceiver() {
                    return receiver;
                }

                /**
                 * Legt den Wert der receiver-Eigenschaft fest.
                 * 
                 */
                public void setReceiver(short value) {
                    this.receiver = value;
                }

                /**
                 * Ruft den Wert der stateId-Eigenschaft ab.
                 * 
                 */
                public short getStateId() {
                    return stateId;
                }

                /**
                 * Legt den Wert der stateId-Eigenschaft fest.
                 * 
                 */
                public void setStateId(short value) {
                    this.stateId = value;
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
     *       &lt;choice>
     *         &lt;element name="UDP_IPv4" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Control">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DAT_input_output" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="AvailablePortRange">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                       &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="AvailablePort">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                           &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DAT_parameter" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="AvailablePortRange">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                       &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="AvailablePort">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                           &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CAN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="USB" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="DataPipe">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="direction">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="In"/>
     *                                 &lt;enumeration value="Out"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="endpointAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="intervall" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Bluetooth" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Address">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="bd_addr" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;pattern value="([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="port" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
     *                                 &lt;minInclusive value="1"/>
     *                                 &lt;maxInclusive value="30"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TCP_IPv4" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Control">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                           &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DAT_input_output" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="AvailablePortRange">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                       &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="AvailablePort">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                           &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DAT_parameter" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="AvailablePortRange">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                       &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="AvailablePort">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                           &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
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
        "usb",
        "bluetooth",
        "tcpiPv4"
    })
    public static class TransportProtocols {

        @XmlElement(name = "UDP_IPv4")
        protected DcpTestProcedure.TransportProtocols.UDPIPv4 udpiPv4;
        @XmlElement(name = "CAN")
        protected Object can;
        @XmlElement(name = "USB")
        protected DcpTestProcedure.TransportProtocols.USB usb;
        @XmlElement(name = "Bluetooth")
        protected DcpTestProcedure.TransportProtocols.Bluetooth bluetooth;
        @XmlElement(name = "TCP_IPv4")
        protected DcpTestProcedure.TransportProtocols.TCPIPv4 tcpiPv4;

        /**
         * Ruft den Wert der udpiPv4-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 }
         *     
         */
        public DcpTestProcedure.TransportProtocols.UDPIPv4 getUDPIPv4() {
            return udpiPv4;
        }

        /**
         * Legt den Wert der udpiPv4-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 }
         *     
         */
        public void setUDPIPv4(DcpTestProcedure.TransportProtocols.UDPIPv4 value) {
            this.udpiPv4 = value;
        }

        /**
         * Ruft den Wert der can-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCAN() {
            return can;
        }

        /**
         * Legt den Wert der can-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCAN(Object value) {
            this.can = value;
        }

        /**
         * Ruft den Wert der usb-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpTestProcedure.TransportProtocols.USB }
         *     
         */
        public DcpTestProcedure.TransportProtocols.USB getUSB() {
            return usb;
        }

        /**
         * Legt den Wert der usb-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpTestProcedure.TransportProtocols.USB }
         *     
         */
        public void setUSB(DcpTestProcedure.TransportProtocols.USB value) {
            this.usb = value;
        }

        /**
         * Ruft den Wert der bluetooth-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpTestProcedure.TransportProtocols.Bluetooth }
         *     
         */
        public DcpTestProcedure.TransportProtocols.Bluetooth getBluetooth() {
            return bluetooth;
        }

        /**
         * Legt den Wert der bluetooth-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpTestProcedure.TransportProtocols.Bluetooth }
         *     
         */
        public void setBluetooth(DcpTestProcedure.TransportProtocols.Bluetooth value) {
            this.bluetooth = value;
        }

        /**
         * Ruft den Wert der tcpiPv4-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 }
         *     
         */
        public DcpTestProcedure.TransportProtocols.TCPIPv4 getTCPIPv4() {
            return tcpiPv4;
        }

        /**
         * Legt den Wert der tcpiPv4-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 }
         *     
         */
        public void setTCPIPv4(DcpTestProcedure.TransportProtocols.TCPIPv4 value) {
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
        @XmlType(name = "", propOrder = {
            "address"
        })
        public static class Bluetooth {

            @XmlElement(name = "Address", required = true)
            protected DcpTestProcedure.TransportProtocols.Bluetooth.Address address;

            /**
             * Ruft den Wert der address-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.TransportProtocols.Bluetooth.Address }
             *     
             */
            public DcpTestProcedure.TransportProtocols.Bluetooth.Address getAddress() {
                return address;
            }

            /**
             * Legt den Wert der address-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.TransportProtocols.Bluetooth.Address }
             *     
             */
            public void setAddress(DcpTestProcedure.TransportProtocols.Bluetooth.Address value) {
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
                protected java.lang.String bdAddr;
                @XmlAttribute(name = "port", required = true)
                protected short port;
                @XmlAttribute(name = "alias")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected java.lang.String alias;

                /**
                 * Ruft den Wert der bdAddr-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.lang.String }
                 *     
                 */
                public java.lang.String getBdAddr() {
                    return bdAddr;
                }

                /**
                 * Legt den Wert der bdAddr-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String }
                 *     
                 */
                public void setBdAddr(java.lang.String value) {
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
                 *     {@link java.lang.String }
                 *     
                 */
                public java.lang.String getAlias() {
                    return alias;
                }

                /**
                 * Legt den Wert der alias-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String }
                 *     
                 */
                public void setAlias(java.lang.String value) {
                    this.alias = value;
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
         *         &lt;element name="Control">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
         *                 &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DAT_input_output" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
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
         *                 &lt;sequence>
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
        @XmlType(name = "", propOrder = {
            "control",
            "datInputOutput",
            "datParameter"
        })
        public static class TCPIPv4 {

            @XmlElement(name = "Control", required = true)
            protected DcpTestProcedure.TransportProtocols.TCPIPv4 .Control control;
            @XmlElement(name = "DAT_input_output")
            protected DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput datInputOutput;
            @XmlElement(name = "DAT_parameter")
            protected DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter datParameter;

            /**
             * Ruft den Wert der control-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .Control }
             *     
             */
            public DcpTestProcedure.TransportProtocols.TCPIPv4 .Control getControl() {
                return control;
            }

            /**
             * Legt den Wert der control-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .Control }
             *     
             */
            public void setControl(DcpTestProcedure.TransportProtocols.TCPIPv4 .Control value) {
                this.control = value;
            }

            /**
             * Ruft den Wert der datInputOutput-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput }
             *     
             */
            public DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput getDATInputOutput() {
                return datInputOutput;
            }

            /**
             * Legt den Wert der datInputOutput-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput }
             *     
             */
            public void setDATInputOutput(DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput value) {
                this.datInputOutput = value;
            }

            /**
             * Ruft den Wert der datParameter-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter }
             *     
             */
            public DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter getDATParameter() {
                return datParameter;
            }

            /**
             * Legt den Wert der datParameter-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter }
             *     
             */
            public void setDATParameter(DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter value) {
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
            public static class Control {

                @XmlAttribute(name = "host")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected java.lang.String host;
                @XmlAttribute(name = "port", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int port;

                /**
                 * Ruft den Wert der host-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.lang.String }
                 *     
                 */
                public java.lang.String getHost() {
                    return host;
                }

                /**
                 * Legt den Wert der host-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String }
                 *     
                 */
                public void setHost(java.lang.String value) {
                    this.host = value;
                }

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
             *       &lt;sequence>
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
                "availablePortRange",
                "availablePort"
            })
            public static class DATInputOutput {

                @XmlElement(name = "AvailablePortRange")
                protected DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePortRange availablePortRange;
                @XmlElement(name = "AvailablePort")
                protected DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePort availablePort;
                @XmlAttribute(name = "host")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected java.lang.String host;

                /**
                 * Ruft den Wert der availablePortRange-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePortRange }
                 *     
                 */
                public DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePortRange getAvailablePortRange() {
                    return availablePortRange;
                }

                /**
                 * Legt den Wert der availablePortRange-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePortRange }
                 *     
                 */
                public void setAvailablePortRange(DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePortRange value) {
                    this.availablePortRange = value;
                }

                /**
                 * Ruft den Wert der availablePort-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePort }
                 *     
                 */
                public DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePort getAvailablePort() {
                    return availablePort;
                }

                /**
                 * Legt den Wert der availablePort-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePort }
                 *     
                 */
                public void setAvailablePort(DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePort value) {
                    this.availablePort = value;
                }

                /**
                 * Ruft den Wert der host-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.lang.String }
                 *     
                 */
                public java.lang.String getHost() {
                    return host;
                }

                /**
                 * Legt den Wert der host-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String }
                 *     
                 */
                public void setHost(java.lang.String value) {
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
             *       &lt;sequence>
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
                "availablePortRange",
                "availablePort"
            })
            public static class DATParameter {

                @XmlElement(name = "AvailablePortRange")
                protected DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePortRange availablePortRange;
                @XmlElement(name = "AvailablePort")
                protected DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePort availablePort;
                @XmlAttribute(name = "host")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected java.lang.String host;

                /**
                 * Ruft den Wert der availablePortRange-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePortRange }
                 *     
                 */
                public DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePortRange getAvailablePortRange() {
                    return availablePortRange;
                }

                /**
                 * Legt den Wert der availablePortRange-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePortRange }
                 *     
                 */
                public void setAvailablePortRange(DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePortRange value) {
                    this.availablePortRange = value;
                }

                /**
                 * Ruft den Wert der availablePort-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePort }
                 *     
                 */
                public DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePort getAvailablePort() {
                    return availablePort;
                }

                /**
                 * Legt den Wert der availablePort-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePort }
                 *     
                 */
                public void setAvailablePort(DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePort value) {
                    this.availablePort = value;
                }

                /**
                 * Ruft den Wert der host-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.lang.String }
                 *     
                 */
                public java.lang.String getHost() {
                    return host;
                }

                /**
                 * Legt den Wert der host-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String }
                 *     
                 */
                public void setHost(java.lang.String value) {
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
         *         &lt;element name="Control">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
         *                 &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DAT_input_output" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
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
         *                 &lt;sequence>
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
        @XmlType(name = "", propOrder = {
            "control",
            "datInputOutput",
            "datParameter"
        })
        public static class UDPIPv4 {

            @XmlElement(name = "Control", required = true)
            protected DcpTestProcedure.TransportProtocols.UDPIPv4 .Control control;
            @XmlElement(name = "DAT_input_output")
            protected DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput datInputOutput;
            @XmlElement(name = "DAT_parameter")
            protected DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter datParameter;

            /**
             * Ruft den Wert der control-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .Control }
             *     
             */
            public DcpTestProcedure.TransportProtocols.UDPIPv4 .Control getControl() {
                return control;
            }

            /**
             * Legt den Wert der control-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .Control }
             *     
             */
            public void setControl(DcpTestProcedure.TransportProtocols.UDPIPv4 .Control value) {
                this.control = value;
            }

            /**
             * Ruft den Wert der datInputOutput-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput }
             *     
             */
            public DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput getDATInputOutput() {
                return datInputOutput;
            }

            /**
             * Legt den Wert der datInputOutput-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput }
             *     
             */
            public void setDATInputOutput(DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput value) {
                this.datInputOutput = value;
            }

            /**
             * Ruft den Wert der datParameter-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter }
             *     
             */
            public DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter getDATParameter() {
                return datParameter;
            }

            /**
             * Legt den Wert der datParameter-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter }
             *     
             */
            public void setDATParameter(DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter value) {
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
            public static class Control {

                @XmlAttribute(name = "host")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected java.lang.String host;
                @XmlAttribute(name = "port", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int port;

                /**
                 * Ruft den Wert der host-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.lang.String }
                 *     
                 */
                public java.lang.String getHost() {
                    return host;
                }

                /**
                 * Legt den Wert der host-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String }
                 *     
                 */
                public void setHost(java.lang.String value) {
                    this.host = value;
                }

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
             *       &lt;sequence>
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
                "availablePortRange",
                "availablePort"
            })
            public static class DATInputOutput {

                @XmlElement(name = "AvailablePortRange")
                protected DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePortRange availablePortRange;
                @XmlElement(name = "AvailablePort")
                protected DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePort availablePort;
                @XmlAttribute(name = "host")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected java.lang.String host;

                /**
                 * Ruft den Wert der availablePortRange-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePortRange }
                 *     
                 */
                public DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePortRange getAvailablePortRange() {
                    return availablePortRange;
                }

                /**
                 * Legt den Wert der availablePortRange-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePortRange }
                 *     
                 */
                public void setAvailablePortRange(DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePortRange value) {
                    this.availablePortRange = value;
                }

                /**
                 * Ruft den Wert der availablePort-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePort }
                 *     
                 */
                public DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePort getAvailablePort() {
                    return availablePort;
                }

                /**
                 * Legt den Wert der availablePort-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePort }
                 *     
                 */
                public void setAvailablePort(DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePort value) {
                    this.availablePort = value;
                }

                /**
                 * Ruft den Wert der host-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.lang.String }
                 *     
                 */
                public java.lang.String getHost() {
                    return host;
                }

                /**
                 * Legt den Wert der host-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String }
                 *     
                 */
                public void setHost(java.lang.String value) {
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
             *       &lt;sequence>
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
                "availablePortRange",
                "availablePort"
            })
            public static class DATParameter {

                @XmlElement(name = "AvailablePortRange")
                protected DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePortRange availablePortRange;
                @XmlElement(name = "AvailablePort")
                protected DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePort availablePort;
                @XmlAttribute(name = "host")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected java.lang.String host;

                /**
                 * Ruft den Wert der availablePortRange-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePortRange }
                 *     
                 */
                public DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePortRange getAvailablePortRange() {
                    return availablePortRange;
                }

                /**
                 * Legt den Wert der availablePortRange-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePortRange }
                 *     
                 */
                public void setAvailablePortRange(DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePortRange value) {
                    this.availablePortRange = value;
                }

                /**
                 * Ruft den Wert der availablePort-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePort }
                 *     
                 */
                public DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePort getAvailablePort() {
                    return availablePort;
                }

                /**
                 * Legt den Wert der availablePort-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePort }
                 *     
                 */
                public void setAvailablePort(DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePort value) {
                    this.availablePort = value;
                }

                /**
                 * Ruft den Wert der host-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.lang.String }
                 *     
                 */
                public java.lang.String getHost() {
                    return host;
                }

                /**
                 * Legt den Wert der host-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String }
                 *     
                 */
                public void setHost(java.lang.String value) {
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
         *         &lt;element name="DataPipe">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="direction">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="In"/>
         *                       &lt;enumeration value="Out"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="endpointAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="intervall" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
            "dataPipe"
        })
        public static class USB {

            @XmlElement(name = "DataPipe", required = true)
            protected List<DcpTestProcedure.TransportProtocols.USB.DataPipe> dataPipe;

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
             * {@link DcpTestProcedure.TransportProtocols.USB.DataPipe }
             * 
             * 
             */
            public List<DcpTestProcedure.TransportProtocols.USB.DataPipe> getDataPipe() {
                if (dataPipe == null) {
                    dataPipe = new ArrayList<DcpTestProcedure.TransportProtocols.USB.DataPipe>();
                }
                return this.dataPipe;
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
                protected java.lang.String direction;
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
                 *     {@link java.lang.String }
                 *     
                 */
                public java.lang.String getDirection() {
                    return direction;
                }

                /**
                 * Legt den Wert der direction-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String }
                 *     
                 */
                public void setDirection(java.lang.String value) {
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

    }

}
