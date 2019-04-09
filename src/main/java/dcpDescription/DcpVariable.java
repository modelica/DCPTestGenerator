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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Properties of a scalar variable
 * 
 * <p>Java-Klasse für dcpVariable complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dcpVariable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Input">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="Int8">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpInteger8Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Int16">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpInteger16Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Int32">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpInteger32Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Int64">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpInteger64Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Uint8">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpUnsignedInteger8Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Uint16">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpUnsignedInteger16Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Uint32">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpUnsignedInteger32Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Uint64">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpUnsignedInteger64Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Float32">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpFloat32Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Float64">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpFloat64Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="String">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpStringType">
 *                               &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Binary">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpBinaryType">
 *                               &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                     &lt;element name="Dimensions" type="{}dcpDimensionsType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Output">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="Int8">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpInteger8Type">
 *                               &lt;attribute name="start">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Int16">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpInteger16Type">
 *                               &lt;attribute name="start">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Int32">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpInteger32Type">
 *                               &lt;attribute name="start">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Int64">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpInteger64Type">
 *                               &lt;attribute name="start">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Uint8">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpUnsignedInteger8Type">
 *                               &lt;attribute name="start">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Uint16">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpUnsignedInteger16Type">
 *                               &lt;attribute name="start">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Uint32">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpUnsignedInteger32Type">
 *                               &lt;attribute name="start">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Uint64">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpUnsignedInteger64Type">
 *                               &lt;attribute name="start">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Float32">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpFloat32Type">
 *                               &lt;attribute name="start">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Float64">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpFloat64Type">
 *                               &lt;attribute name="start">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="String">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpStringType">
 *                               &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Binary">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpBinaryType">
 *                               &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                     &lt;element name="Dimensions" type="{}dcpDimensionsType" minOccurs="0"/>
 *                     &lt;element name="Dependencies" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Initialization" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;element name="Dependency" type="{}dcpDependencyType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="Run" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;element name="Dependency" type="{}dcpDependencyType"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="defaultSteps" default="1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="fixedSteps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                   &lt;attribute name="minSteps">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="maxSteps">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                         &lt;minExclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="initialization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Parameter">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="Int8">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpInteger8Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Int16">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpInteger16Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Int32">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpInteger32Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Int64">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpInteger64Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Uint8">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpUnsignedInteger8Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Uint16">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpUnsignedInteger16Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Uint32">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpUnsignedInteger32Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Uint64">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpUnsignedInteger64Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Float32">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpFloat32Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Float64">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpFloat64Type">
 *                               &lt;attribute name="start" use="required">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="String">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpStringType">
 *                               &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Binary">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{}dcpBinaryType">
 *                               &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                     &lt;element name="Dimensions" type="{}dcpDimensionsType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="StructuralParameter">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="Uint8">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="start" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                                   &lt;minInclusive value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Uint16">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="start" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *                                   &lt;minInclusive value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Uint32">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="start" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                                   &lt;minInclusive value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Uint64">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="start" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;minInclusive value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Annotations" type="{}dcpAnnotation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}timeInstanceDeviation"/>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="valueReference" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="variability" default="continuous">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *             &lt;enumeration value="fixed"/>
 *             &lt;enumeration value="tunable"/>
 *             &lt;enumeration value="discrete"/>
 *             &lt;enumeration value="continuous"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute ref="{}declaredType"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dcpVariable", propOrder = {
    "input",
    "output",
    "parameter",
    "structuralParameter",
    "annotations"
})
public class DcpVariable {

    @XmlElement(name = "Input")
    protected DcpVariable.Input input;
    @XmlElement(name = "Output")
    protected DcpVariable.Output output;
    @XmlElement(name = "Parameter")
    protected DcpVariable.Parameter parameter;
    @XmlElement(name = "StructuralParameter")
    protected DcpVariable.StructuralParameter structuralParameter;
    @XmlElement(name = "Annotations")
    protected DcpAnnotation annotations;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected java.lang.String name;
    @XmlAttribute(name = "valueReference", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger valueReference;
    @XmlAttribute(name = "description")
    protected java.lang.String description;
    @XmlAttribute(name = "variability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected java.lang.String variability;
    @XmlAttribute(name = "declaredType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected java.lang.String declaredType;
    @XmlAttribute(name = "preEdge")
    protected Double preEdge;
    @XmlAttribute(name = "postEdge")
    protected Double postEdge;
    @XmlAttribute(name = "maxConsecMissedPdus")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxConsecMissedPdus;

    /**
     * Ruft den Wert der input-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpVariable.Input }
     *     
     */
    public DcpVariable.Input getInput() {
        return input;
    }

    /**
     * Legt den Wert der input-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpVariable.Input }
     *     
     */
    public void setInput(DcpVariable.Input value) {
        this.input = value;
    }

    /**
     * Ruft den Wert der output-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpVariable.Output }
     *     
     */
    public DcpVariable.Output getOutput() {
        return output;
    }

    /**
     * Legt den Wert der output-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpVariable.Output }
     *     
     */
    public void setOutput(DcpVariable.Output value) {
        this.output = value;
    }

    /**
     * Ruft den Wert der parameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpVariable.Parameter }
     *     
     */
    public DcpVariable.Parameter getParameter() {
        return parameter;
    }

    /**
     * Legt den Wert der parameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpVariable.Parameter }
     *     
     */
    public void setParameter(DcpVariable.Parameter value) {
        this.parameter = value;
    }

    /**
     * Ruft den Wert der structuralParameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpVariable.StructuralParameter }
     *     
     */
    public DcpVariable.StructuralParameter getStructuralParameter() {
        return structuralParameter;
    }

    /**
     * Legt den Wert der structuralParameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpVariable.StructuralParameter }
     *     
     */
    public void setStructuralParameter(DcpVariable.StructuralParameter value) {
        this.structuralParameter = value;
    }

    /**
     * Ruft den Wert der annotations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpAnnotation }
     *     
     */
    public DcpAnnotation getAnnotations() {
        return annotations;
    }

    /**
     * Legt den Wert der annotations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpAnnotation }
     *     
     */
    public void setAnnotations(DcpAnnotation value) {
        this.annotations = value;
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
     * Ruft den Wert der valueReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValueReference() {
        return valueReference;
    }

    /**
     * Legt den Wert der valueReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValueReference(BigInteger value) {
        this.valueReference = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDescription(java.lang.String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der variability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVariability() {
        if (variability == null) {
            return "continuous";
        } else {
            return variability;
        }
    }

    /**
     * Legt den Wert der variability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVariability(java.lang.String value) {
        this.variability = value;
    }

    /**
     * Ruft den Wert der declaredType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDeclaredType() {
        return declaredType;
    }

    /**
     * Legt den Wert der declaredType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDeclaredType(java.lang.String value) {
        this.declaredType = value;
    }

    /**
     * Ruft den Wert der preEdge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreEdge() {
        return preEdge;
    }

    /**
     * Legt den Wert der preEdge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreEdge(Double value) {
        this.preEdge = value;
    }

    /**
     * Ruft den Wert der postEdge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPostEdge() {
        return postEdge;
    }

    /**
     * Legt den Wert der postEdge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPostEdge(Double value) {
        this.postEdge = value;
    }

    /**
     * Ruft den Wert der maxConsecMissedPdus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxConsecMissedPdus() {
        return maxConsecMissedPdus;
    }

    /**
     * Legt den Wert der maxConsecMissedPdus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxConsecMissedPdus(Long value) {
        this.maxConsecMissedPdus = value;
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
     *           &lt;element name="Int8">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpInteger8Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Int16">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpInteger16Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Int32">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpInteger32Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}integer" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Int64">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpInteger64Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Uint8">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpUnsignedInteger8Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Uint16">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpUnsignedInteger16Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Uint32">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpUnsignedInteger32Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Uint64">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpUnsignedInteger64Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Float32">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpFloat32Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Float64">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpFloat64Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="String">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpStringType">
     *                   &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Binary">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpBinaryType">
     *                   &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="Dimensions" type="{}dcpDimensionsType" minOccurs="0"/>
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
        "binary",
        "dimensions"
    })
    public static class Input {

        @XmlElement(name = "Int8")
        protected DcpVariable.Input.Int8 int8;
        @XmlElement(name = "Int16")
        protected DcpVariable.Input.Int16 int16;
        @XmlElement(name = "Int32")
        protected DcpVariable.Input.Int32 int32;
        @XmlElement(name = "Int64")
        protected DcpVariable.Input.Int64 int64;
        @XmlElement(name = "Uint8")
        protected DcpVariable.Input.Uint8 uint8;
        @XmlElement(name = "Uint16")
        protected DcpVariable.Input.Uint16 uint16;
        @XmlElement(name = "Uint32")
        protected DcpVariable.Input.Uint32 uint32;
        @XmlElement(name = "Uint64")
        protected DcpVariable.Input.Uint64 uint64;
        @XmlElement(name = "Float32")
        protected DcpVariable.Input.Float32 float32;
        @XmlElement(name = "Float64")
        protected DcpVariable.Input.Float64 float64;
        @XmlElement(name = "String")
        protected DcpVariable.Input.String string;
        @XmlElement(name = "Binary")
        protected DcpVariable.Input.Binary binary;
        @XmlElement(name = "Dimensions")
        protected DcpDimensionsType dimensions;

        /**
         * Ruft den Wert der int8-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Input.Int8 }
         *     
         */
        public DcpVariable.Input.Int8 getInt8() {
            return int8;
        }

        /**
         * Legt den Wert der int8-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Input.Int8 }
         *     
         */
        public void setInt8(DcpVariable.Input.Int8 value) {
            this.int8 = value;
        }

        /**
         * Ruft den Wert der int16-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Input.Int16 }
         *     
         */
        public DcpVariable.Input.Int16 getInt16() {
            return int16;
        }

        /**
         * Legt den Wert der int16-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Input.Int16 }
         *     
         */
        public void setInt16(DcpVariable.Input.Int16 value) {
            this.int16 = value;
        }

        /**
         * Ruft den Wert der int32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Input.Int32 }
         *     
         */
        public DcpVariable.Input.Int32 getInt32() {
            return int32;
        }

        /**
         * Legt den Wert der int32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Input.Int32 }
         *     
         */
        public void setInt32(DcpVariable.Input.Int32 value) {
            this.int32 = value;
        }

        /**
         * Ruft den Wert der int64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Input.Int64 }
         *     
         */
        public DcpVariable.Input.Int64 getInt64() {
            return int64;
        }

        /**
         * Legt den Wert der int64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Input.Int64 }
         *     
         */
        public void setInt64(DcpVariable.Input.Int64 value) {
            this.int64 = value;
        }

        /**
         * Ruft den Wert der uint8-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Input.Uint8 }
         *     
         */
        public DcpVariable.Input.Uint8 getUint8() {
            return uint8;
        }

        /**
         * Legt den Wert der uint8-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Input.Uint8 }
         *     
         */
        public void setUint8(DcpVariable.Input.Uint8 value) {
            this.uint8 = value;
        }

        /**
         * Ruft den Wert der uint16-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Input.Uint16 }
         *     
         */
        public DcpVariable.Input.Uint16 getUint16() {
            return uint16;
        }

        /**
         * Legt den Wert der uint16-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Input.Uint16 }
         *     
         */
        public void setUint16(DcpVariable.Input.Uint16 value) {
            this.uint16 = value;
        }

        /**
         * Ruft den Wert der uint32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Input.Uint32 }
         *     
         */
        public DcpVariable.Input.Uint32 getUint32() {
            return uint32;
        }

        /**
         * Legt den Wert der uint32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Input.Uint32 }
         *     
         */
        public void setUint32(DcpVariable.Input.Uint32 value) {
            this.uint32 = value;
        }

        /**
         * Ruft den Wert der uint64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Input.Uint64 }
         *     
         */
        public DcpVariable.Input.Uint64 getUint64() {
            return uint64;
        }

        /**
         * Legt den Wert der uint64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Input.Uint64 }
         *     
         */
        public void setUint64(DcpVariable.Input.Uint64 value) {
            this.uint64 = value;
        }

        /**
         * Ruft den Wert der float32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Input.Float32 }
         *     
         */
        public DcpVariable.Input.Float32 getFloat32() {
            return float32;
        }

        /**
         * Legt den Wert der float32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Input.Float32 }
         *     
         */
        public void setFloat32(DcpVariable.Input.Float32 value) {
            this.float32 = value;
        }

        /**
         * Ruft den Wert der float64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Input.Float64 }
         *     
         */
        public DcpVariable.Input.Float64 getFloat64() {
            return float64;
        }

        /**
         * Legt den Wert der float64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Input.Float64 }
         *     
         */
        public void setFloat64(DcpVariable.Input.Float64 value) {
            this.float64 = value;
        }

        /**
         * Ruft den Wert der string-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Input.String }
         *     
         */
        public DcpVariable.Input.String getString() {
            return string;
        }

        /**
         * Legt den Wert der string-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Input.String }
         *     
         */
        public void setString(DcpVariable.Input.String value) {
            this.string = value;
        }

        /**
         * Ruft den Wert der binary-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Input.Binary }
         *     
         */
        public DcpVariable.Input.Binary getBinary() {
            return binary;
        }

        /**
         * Legt den Wert der binary-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Input.Binary }
         *     
         */
        public void setBinary(DcpVariable.Input.Binary value) {
            this.binary = value;
        }

        /**
         * Ruft den Wert der dimensions-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpDimensionsType }
         *     
         */
        public DcpDimensionsType getDimensions() {
            return dimensions;
        }

        /**
         * Legt den Wert der dimensions-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpDimensionsType }
         *     
         */
        public void setDimensions(DcpDimensionsType value) {
            this.dimensions = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{}dcpBinaryType">
         *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Binary
            extends DcpBinaryType
        {

            @XmlAttribute(name = "start", required = true)
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            @XmlSchemaType(name = "hexBinary")
            protected byte[] start;

            /**
             * Ruft den Wert der start-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String }
             *     
             */
            public byte[] getStart() {
                return start;
            }

            /**
             * Legt den Wert der start-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String }
             *     
             */
            public void setStart(byte[] value) {
                this.start = value;
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
         *     &lt;extension base="{}dcpFloat32Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Float32
            extends DcpFloat32Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Float> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Float }
             * 
             * 
             */
            public List<Float> getStart() {
                if (start == null) {
                    start = new ArrayList<Float>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpFloat64Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Float64
            extends DcpFloat64Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Double> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            public List<Double> getStart() {
                if (start == null) {
                    start = new ArrayList<Double>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpInteger16Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Int16
            extends DcpInteger16Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Short> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Short }
             * 
             * 
             */
            public List<Short> getStart() {
                if (start == null) {
                    start = new ArrayList<Short>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpInteger32Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}integer" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Int32
            extends DcpInteger32Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<BigInteger> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getStart() {
                if (start == null) {
                    start = new ArrayList<BigInteger>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpInteger64Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Int64
            extends DcpInteger64Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Long> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            public List<Long> getStart() {
                if (start == null) {
                    start = new ArrayList<Long>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpInteger8Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Int8
            extends DcpInteger8Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Byte> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Byte }
             * 
             * 
             */
            public List<Byte> getStart() {
                if (start == null) {
                    start = new ArrayList<Byte>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpStringType">
         *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class String
            extends DcpStringType
        {

            @XmlAttribute(name = "start", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected java.lang.String start;

            /**
             * Ruft den Wert der start-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String }
             *     
             */
            public java.lang.String getStart() {
                return start;
            }

            /**
             * Legt den Wert der start-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String }
             *     
             */
            public void setStart(java.lang.String value) {
                this.start = value;
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
         *     &lt;extension base="{}dcpUnsignedInteger16Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Uint16
            extends DcpUnsignedInteger16Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Integer> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Integer }
             * 
             * 
             */
            public List<Integer> getStart() {
                if (start == null) {
                    start = new ArrayList<Integer>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpUnsignedInteger32Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Uint32
            extends DcpUnsignedInteger32Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Long> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            public List<Long> getStart() {
                if (start == null) {
                    start = new ArrayList<Long>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpUnsignedInteger64Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Uint64
            extends DcpUnsignedInteger64Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<BigInteger> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getStart() {
                if (start == null) {
                    start = new ArrayList<BigInteger>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpUnsignedInteger8Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Uint8
            extends DcpUnsignedInteger8Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Short> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Short }
             * 
             * 
             */
            public List<Short> getStart() {
                if (start == null) {
                    start = new ArrayList<Short>();
                }
                return this.start;
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
     *           &lt;element name="Int8">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpInteger8Type">
     *                   &lt;attribute name="start">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Int16">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpInteger16Type">
     *                   &lt;attribute name="start">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Int32">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpInteger32Type">
     *                   &lt;attribute name="start">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}integer" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Int64">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpInteger64Type">
     *                   &lt;attribute name="start">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Uint8">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpUnsignedInteger8Type">
     *                   &lt;attribute name="start">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Uint16">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpUnsignedInteger16Type">
     *                   &lt;attribute name="start">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Uint32">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpUnsignedInteger32Type">
     *                   &lt;attribute name="start">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Uint64">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpUnsignedInteger64Type">
     *                   &lt;attribute name="start">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Float32">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpFloat32Type">
     *                   &lt;attribute name="start">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Float64">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpFloat64Type">
     *                   &lt;attribute name="start">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="String">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpStringType">
     *                   &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Binary">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpBinaryType">
     *                   &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="Dimensions" type="{}dcpDimensionsType" minOccurs="0"/>
     *         &lt;element name="Dependencies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Initialization" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                             &lt;element name="Dependency" type="{}dcpDependencyType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Run" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                             &lt;element name="Dependency" type="{}dcpDependencyType"/>
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
     *       &lt;attribute name="defaultSteps" default="1">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
     *             &lt;minInclusive value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="fixedSteps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="minSteps">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
     *             &lt;minInclusive value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="maxSteps">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
     *             &lt;minExclusive value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="initialization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
        "binary",
        "dimensions",
        "dependencies"
    })
    public static class Output {

        @XmlElement(name = "Int8")
        protected DcpVariable.Output.Int8 int8;
        @XmlElement(name = "Int16")
        protected DcpVariable.Output.Int16 int16;
        @XmlElement(name = "Int32")
        protected DcpVariable.Output.Int32 int32;
        @XmlElement(name = "Int64")
        protected DcpVariable.Output.Int64 int64;
        @XmlElement(name = "Uint8")
        protected DcpVariable.Output.Uint8 uint8;
        @XmlElement(name = "Uint16")
        protected DcpVariable.Output.Uint16 uint16;
        @XmlElement(name = "Uint32")
        protected DcpVariable.Output.Uint32 uint32;
        @XmlElement(name = "Uint64")
        protected DcpVariable.Output.Uint64 uint64;
        @XmlElement(name = "Float32")
        protected DcpVariable.Output.Float32 float32;
        @XmlElement(name = "Float64")
        protected DcpVariable.Output.Float64 float64;
        @XmlElement(name = "String")
        protected DcpVariable.Output.String string;
        @XmlElement(name = "Binary")
        protected DcpVariable.Output.Binary binary;
        @XmlElement(name = "Dimensions")
        protected DcpDimensionsType dimensions;
        @XmlElement(name = "Dependencies")
        protected DcpVariable.Output.Dependencies dependencies;
        @XmlAttribute(name = "defaultSteps")
        protected Long defaultSteps;
        @XmlAttribute(name = "fixedSteps")
        protected Boolean fixedSteps;
        @XmlAttribute(name = "minSteps")
        protected Long minSteps;
        @XmlAttribute(name = "maxSteps")
        protected Long maxSteps;
        @XmlAttribute(name = "initialization")
        protected Boolean initialization;

        /**
         * Ruft den Wert der int8-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.Int8 }
         *     
         */
        public DcpVariable.Output.Int8 getInt8() {
            return int8;
        }

        /**
         * Legt den Wert der int8-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.Int8 }
         *     
         */
        public void setInt8(DcpVariable.Output.Int8 value) {
            this.int8 = value;
        }

        /**
         * Ruft den Wert der int16-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.Int16 }
         *     
         */
        public DcpVariable.Output.Int16 getInt16() {
            return int16;
        }

        /**
         * Legt den Wert der int16-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.Int16 }
         *     
         */
        public void setInt16(DcpVariable.Output.Int16 value) {
            this.int16 = value;
        }

        /**
         * Ruft den Wert der int32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.Int32 }
         *     
         */
        public DcpVariable.Output.Int32 getInt32() {
            return int32;
        }

        /**
         * Legt den Wert der int32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.Int32 }
         *     
         */
        public void setInt32(DcpVariable.Output.Int32 value) {
            this.int32 = value;
        }

        /**
         * Ruft den Wert der int64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.Int64 }
         *     
         */
        public DcpVariable.Output.Int64 getInt64() {
            return int64;
        }

        /**
         * Legt den Wert der int64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.Int64 }
         *     
         */
        public void setInt64(DcpVariable.Output.Int64 value) {
            this.int64 = value;
        }

        /**
         * Ruft den Wert der uint8-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.Uint8 }
         *     
         */
        public DcpVariable.Output.Uint8 getUint8() {
            return uint8;
        }

        /**
         * Legt den Wert der uint8-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.Uint8 }
         *     
         */
        public void setUint8(DcpVariable.Output.Uint8 value) {
            this.uint8 = value;
        }

        /**
         * Ruft den Wert der uint16-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.Uint16 }
         *     
         */
        public DcpVariable.Output.Uint16 getUint16() {
            return uint16;
        }

        /**
         * Legt den Wert der uint16-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.Uint16 }
         *     
         */
        public void setUint16(DcpVariable.Output.Uint16 value) {
            this.uint16 = value;
        }

        /**
         * Ruft den Wert der uint32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.Uint32 }
         *     
         */
        public DcpVariable.Output.Uint32 getUint32() {
            return uint32;
        }

        /**
         * Legt den Wert der uint32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.Uint32 }
         *     
         */
        public void setUint32(DcpVariable.Output.Uint32 value) {
            this.uint32 = value;
        }

        /**
         * Ruft den Wert der uint64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.Uint64 }
         *     
         */
        public DcpVariable.Output.Uint64 getUint64() {
            return uint64;
        }

        /**
         * Legt den Wert der uint64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.Uint64 }
         *     
         */
        public void setUint64(DcpVariable.Output.Uint64 value) {
            this.uint64 = value;
        }

        /**
         * Ruft den Wert der float32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.Float32 }
         *     
         */
        public DcpVariable.Output.Float32 getFloat32() {
            return float32;
        }

        /**
         * Legt den Wert der float32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.Float32 }
         *     
         */
        public void setFloat32(DcpVariable.Output.Float32 value) {
            this.float32 = value;
        }

        /**
         * Ruft den Wert der float64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.Float64 }
         *     
         */
        public DcpVariable.Output.Float64 getFloat64() {
            return float64;
        }

        /**
         * Legt den Wert der float64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.Float64 }
         *     
         */
        public void setFloat64(DcpVariable.Output.Float64 value) {
            this.float64 = value;
        }

        /**
         * Ruft den Wert der string-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.String }
         *     
         */
        public DcpVariable.Output.String getString() {
            return string;
        }

        /**
         * Legt den Wert der string-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.String }
         *     
         */
        public void setString(DcpVariable.Output.String value) {
            this.string = value;
        }

        /**
         * Ruft den Wert der binary-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.Binary }
         *     
         */
        public DcpVariable.Output.Binary getBinary() {
            return binary;
        }

        /**
         * Legt den Wert der binary-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.Binary }
         *     
         */
        public void setBinary(DcpVariable.Output.Binary value) {
            this.binary = value;
        }

        /**
         * Ruft den Wert der dimensions-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpDimensionsType }
         *     
         */
        public DcpDimensionsType getDimensions() {
            return dimensions;
        }

        /**
         * Legt den Wert der dimensions-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpDimensionsType }
         *     
         */
        public void setDimensions(DcpDimensionsType value) {
            this.dimensions = value;
        }

        /**
         * Ruft den Wert der dependencies-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Output.Dependencies }
         *     
         */
        public DcpVariable.Output.Dependencies getDependencies() {
            return dependencies;
        }

        /**
         * Legt den Wert der dependencies-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Output.Dependencies }
         *     
         */
        public void setDependencies(DcpVariable.Output.Dependencies value) {
            this.dependencies = value;
        }

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

        /**
         * Ruft den Wert der initialization-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isInitialization() {
            if (initialization == null) {
                return false;
            } else {
                return initialization;
            }
        }

        /**
         * Legt den Wert der initialization-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInitialization(Boolean value) {
            this.initialization = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{}dcpBinaryType">
         *       &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Binary
            extends DcpBinaryType
        {

            @XmlAttribute(name = "start")
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            @XmlSchemaType(name = "hexBinary")
            protected byte[] start;

            /**
             * Ruft den Wert der start-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String }
             *     
             */
            public byte[] getStart() {
                return start;
            }

            /**
             * Legt den Wert der start-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String }
             *     
             */
            public void setStart(byte[] value) {
                this.start = value;
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
         *         &lt;element name="Initialization" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
         *                   &lt;element name="Dependency" type="{}dcpDependencyType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Run" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
         *                   &lt;element name="Dependency" type="{}dcpDependencyType"/>
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
            "initialization",
            "run"
        })
        public static class Dependencies {

            @XmlElement(name = "Initialization")
            protected DcpVariable.Output.Dependencies.Initialization initialization;
            @XmlElement(name = "Run")
            protected DcpVariable.Output.Dependencies.Run run;

            /**
             * Ruft den Wert der initialization-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpVariable.Output.Dependencies.Initialization }
             *     
             */
            public DcpVariable.Output.Dependencies.Initialization getInitialization() {
                return initialization;
            }

            /**
             * Legt den Wert der initialization-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpVariable.Output.Dependencies.Initialization }
             *     
             */
            public void setInitialization(DcpVariable.Output.Dependencies.Initialization value) {
                this.initialization = value;
            }

            /**
             * Ruft den Wert der run-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DcpVariable.Output.Dependencies.Run }
             *     
             */
            public DcpVariable.Output.Dependencies.Run getRun() {
                return run;
            }

            /**
             * Legt den Wert der run-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DcpVariable.Output.Dependencies.Run }
             *     
             */
            public void setRun(DcpVariable.Output.Dependencies.Run value) {
                this.run = value;
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
             *         &lt;element name="Dependency" type="{}dcpDependencyType"/>
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
                "dependency"
            })
            public static class Initialization {

                @XmlElement(name = "Dependency")
                protected List<DcpDependencyType> dependency;

                /**
                 * Gets the value of the dependency property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dependency property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDependency().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DcpDependencyType }
                 * 
                 * 
                 */
                public List<DcpDependencyType> getDependency() {
                    if (dependency == null) {
                        dependency = new ArrayList<DcpDependencyType>();
                    }
                    return this.dependency;
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
             *         &lt;element name="Dependency" type="{}dcpDependencyType"/>
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
                "dependency"
            })
            public static class Run {

                @XmlElement(name = "Dependency")
                protected List<DcpDependencyType> dependency;

                /**
                 * Gets the value of the dependency property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dependency property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDependency().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DcpDependencyType }
                 * 
                 * 
                 */
                public List<DcpDependencyType> getDependency() {
                    if (dependency == null) {
                        dependency = new ArrayList<DcpDependencyType>();
                    }
                    return this.dependency;
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
         *     &lt;extension base="{}dcpFloat32Type">
         *       &lt;attribute name="start">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Float32
            extends DcpFloat32Type
        {

            @XmlAttribute(name = "start")
            protected List<Float> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Float }
             * 
             * 
             */
            public List<Float> getStart() {
                if (start == null) {
                    start = new ArrayList<Float>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpFloat64Type">
         *       &lt;attribute name="start">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Float64
            extends DcpFloat64Type
        {

            @XmlAttribute(name = "start")
            protected List<Double> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            public List<Double> getStart() {
                if (start == null) {
                    start = new ArrayList<Double>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpInteger16Type">
         *       &lt;attribute name="start">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Int16
            extends DcpInteger16Type
        {

            @XmlAttribute(name = "start")
            protected List<Short> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Short }
             * 
             * 
             */
            public List<Short> getStart() {
                if (start == null) {
                    start = new ArrayList<Short>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpInteger32Type">
         *       &lt;attribute name="start">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}integer" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Int32
            extends DcpInteger32Type
        {

            @XmlAttribute(name = "start")
            protected List<BigInteger> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getStart() {
                if (start == null) {
                    start = new ArrayList<BigInteger>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpInteger64Type">
         *       &lt;attribute name="start">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Int64
            extends DcpInteger64Type
        {

            @XmlAttribute(name = "start")
            protected List<Long> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            public List<Long> getStart() {
                if (start == null) {
                    start = new ArrayList<Long>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpInteger8Type">
         *       &lt;attribute name="start">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Int8
            extends DcpInteger8Type
        {

            @XmlAttribute(name = "start")
            protected List<Byte> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Byte }
             * 
             * 
             */
            public List<Byte> getStart() {
                if (start == null) {
                    start = new ArrayList<Byte>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpStringType">
         *       &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class String
            extends DcpStringType
        {

            @XmlAttribute(name = "start")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected java.lang.String start;

            /**
             * Ruft den Wert der start-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String }
             *     
             */
            public java.lang.String getStart() {
                return start;
            }

            /**
             * Legt den Wert der start-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String }
             *     
             */
            public void setStart(java.lang.String value) {
                this.start = value;
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
         *     &lt;extension base="{}dcpUnsignedInteger16Type">
         *       &lt;attribute name="start">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Uint16
            extends DcpUnsignedInteger16Type
        {

            @XmlAttribute(name = "start")
            protected List<Integer> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Integer }
             * 
             * 
             */
            public List<Integer> getStart() {
                if (start == null) {
                    start = new ArrayList<Integer>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpUnsignedInteger32Type">
         *       &lt;attribute name="start">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Uint32
            extends DcpUnsignedInteger32Type
        {

            @XmlAttribute(name = "start")
            protected List<Long> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            public List<Long> getStart() {
                if (start == null) {
                    start = new ArrayList<Long>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpUnsignedInteger64Type">
         *       &lt;attribute name="start">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Uint64
            extends DcpUnsignedInteger64Type
        {

            @XmlAttribute(name = "start")
            protected List<BigInteger> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getStart() {
                if (start == null) {
                    start = new ArrayList<BigInteger>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpUnsignedInteger8Type">
         *       &lt;attribute name="start">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Uint8
            extends DcpUnsignedInteger8Type
        {

            @XmlAttribute(name = "start")
            protected List<Long> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            public List<Long> getStart() {
                if (start == null) {
                    start = new ArrayList<Long>();
                }
                return this.start;
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
     *           &lt;element name="Int8">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpInteger8Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Int16">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpInteger16Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Int32">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpInteger32Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Int64">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpInteger64Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Uint8">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpUnsignedInteger8Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Uint16">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpUnsignedInteger16Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Uint32">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpUnsignedInteger32Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Uint64">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpUnsignedInteger64Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Float32">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpFloat32Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Float64">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpFloat64Type">
     *                   &lt;attribute name="start" use="required">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="String">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpStringType">
     *                   &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Binary">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{}dcpBinaryType">
     *                   &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="Dimensions" type="{}dcpDimensionsType" minOccurs="0"/>
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
        "binary",
        "dimensions"
    })
    public static class Parameter {

        @XmlElement(name = "Int8")
        protected DcpVariable.Parameter.Int8 int8;
        @XmlElement(name = "Int16")
        protected DcpVariable.Parameter.Int16 int16;
        @XmlElement(name = "Int32")
        protected DcpVariable.Parameter.Int32 int32;
        @XmlElement(name = "Int64")
        protected DcpVariable.Parameter.Int64 int64;
        @XmlElement(name = "Uint8")
        protected DcpVariable.Parameter.Uint8 uint8;
        @XmlElement(name = "Uint16")
        protected DcpVariable.Parameter.Uint16 uint16;
        @XmlElement(name = "Uint32")
        protected DcpVariable.Parameter.Uint32 uint32;
        @XmlElement(name = "Uint64")
        protected DcpVariable.Parameter.Uint64 uint64;
        @XmlElement(name = "Float32")
        protected DcpVariable.Parameter.Float32 float32;
        @XmlElement(name = "Float64")
        protected DcpVariable.Parameter.Float64 float64;
        @XmlElement(name = "String")
        protected DcpVariable.Parameter.String string;
        @XmlElement(name = "Binary")
        protected DcpVariable.Parameter.Binary binary;
        @XmlElement(name = "Dimensions")
        protected DcpDimensionsType dimensions;

        /**
         * Ruft den Wert der int8-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Parameter.Int8 }
         *     
         */
        public DcpVariable.Parameter.Int8 getInt8() {
            return int8;
        }

        /**
         * Legt den Wert der int8-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Parameter.Int8 }
         *     
         */
        public void setInt8(DcpVariable.Parameter.Int8 value) {
            this.int8 = value;
        }

        /**
         * Ruft den Wert der int16-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Parameter.Int16 }
         *     
         */
        public DcpVariable.Parameter.Int16 getInt16() {
            return int16;
        }

        /**
         * Legt den Wert der int16-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Parameter.Int16 }
         *     
         */
        public void setInt16(DcpVariable.Parameter.Int16 value) {
            this.int16 = value;
        }

        /**
         * Ruft den Wert der int32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Parameter.Int32 }
         *     
         */
        public DcpVariable.Parameter.Int32 getInt32() {
            return int32;
        }

        /**
         * Legt den Wert der int32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Parameter.Int32 }
         *     
         */
        public void setInt32(DcpVariable.Parameter.Int32 value) {
            this.int32 = value;
        }

        /**
         * Ruft den Wert der int64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Parameter.Int64 }
         *     
         */
        public DcpVariable.Parameter.Int64 getInt64() {
            return int64;
        }

        /**
         * Legt den Wert der int64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Parameter.Int64 }
         *     
         */
        public void setInt64(DcpVariable.Parameter.Int64 value) {
            this.int64 = value;
        }

        /**
         * Ruft den Wert der uint8-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Parameter.Uint8 }
         *     
         */
        public DcpVariable.Parameter.Uint8 getUint8() {
            return uint8;
        }

        /**
         * Legt den Wert der uint8-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Parameter.Uint8 }
         *     
         */
        public void setUint8(DcpVariable.Parameter.Uint8 value) {
            this.uint8 = value;
        }

        /**
         * Ruft den Wert der uint16-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Parameter.Uint16 }
         *     
         */
        public DcpVariable.Parameter.Uint16 getUint16() {
            return uint16;
        }

        /**
         * Legt den Wert der uint16-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Parameter.Uint16 }
         *     
         */
        public void setUint16(DcpVariable.Parameter.Uint16 value) {
            this.uint16 = value;
        }

        /**
         * Ruft den Wert der uint32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Parameter.Uint32 }
         *     
         */
        public DcpVariable.Parameter.Uint32 getUint32() {
            return uint32;
        }

        /**
         * Legt den Wert der uint32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Parameter.Uint32 }
         *     
         */
        public void setUint32(DcpVariable.Parameter.Uint32 value) {
            this.uint32 = value;
        }

        /**
         * Ruft den Wert der uint64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Parameter.Uint64 }
         *     
         */
        public DcpVariable.Parameter.Uint64 getUint64() {
            return uint64;
        }

        /**
         * Legt den Wert der uint64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Parameter.Uint64 }
         *     
         */
        public void setUint64(DcpVariable.Parameter.Uint64 value) {
            this.uint64 = value;
        }

        /**
         * Ruft den Wert der float32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Parameter.Float32 }
         *     
         */
        public DcpVariable.Parameter.Float32 getFloat32() {
            return float32;
        }

        /**
         * Legt den Wert der float32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Parameter.Float32 }
         *     
         */
        public void setFloat32(DcpVariable.Parameter.Float32 value) {
            this.float32 = value;
        }

        /**
         * Ruft den Wert der float64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Parameter.Float64 }
         *     
         */
        public DcpVariable.Parameter.Float64 getFloat64() {
            return float64;
        }

        /**
         * Legt den Wert der float64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Parameter.Float64 }
         *     
         */
        public void setFloat64(DcpVariable.Parameter.Float64 value) {
            this.float64 = value;
        }

        /**
         * Ruft den Wert der string-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Parameter.String }
         *     
         */
        public DcpVariable.Parameter.String getString() {
            return string;
        }

        /**
         * Legt den Wert der string-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Parameter.String }
         *     
         */
        public void setString(DcpVariable.Parameter.String value) {
            this.string = value;
        }

        /**
         * Ruft den Wert der binary-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.Parameter.Binary }
         *     
         */
        public DcpVariable.Parameter.Binary getBinary() {
            return binary;
        }

        /**
         * Legt den Wert der binary-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.Parameter.Binary }
         *     
         */
        public void setBinary(DcpVariable.Parameter.Binary value) {
            this.binary = value;
        }

        /**
         * Ruft den Wert der dimensions-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpDimensionsType }
         *     
         */
        public DcpDimensionsType getDimensions() {
            return dimensions;
        }

        /**
         * Legt den Wert der dimensions-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpDimensionsType }
         *     
         */
        public void setDimensions(DcpDimensionsType value) {
            this.dimensions = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{}dcpBinaryType">
         *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Binary
            extends DcpBinaryType
        {

            @XmlAttribute(name = "start", required = true)
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            @XmlSchemaType(name = "hexBinary")
            protected byte[] start;

            /**
             * Ruft den Wert der start-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String }
             *     
             */
            public byte[] getStart() {
                return start;
            }

            /**
             * Legt den Wert der start-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String }
             *     
             */
            public void setStart(byte[] value) {
                this.start = value;
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
         *     &lt;extension base="{}dcpFloat32Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Float32
            extends DcpFloat32Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Float> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Float }
             * 
             * 
             */
            public List<Float> getStart() {
                if (start == null) {
                    start = new ArrayList<Float>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpFloat64Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Float64
            extends DcpFloat64Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Double> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            public List<Double> getStart() {
                if (start == null) {
                    start = new ArrayList<Double>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpInteger16Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Int16
            extends DcpInteger16Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Short> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Short }
             * 
             * 
             */
            public List<Short> getStart() {
                if (start == null) {
                    start = new ArrayList<Short>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpInteger32Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Int32
            extends DcpInteger32Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Integer> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Integer }
             * 
             * 
             */
            public List<Integer> getStart() {
                if (start == null) {
                    start = new ArrayList<Integer>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpInteger64Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Int64
            extends DcpInteger64Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Long> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            public List<Long> getStart() {
                if (start == null) {
                    start = new ArrayList<Long>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpInteger8Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Int8
            extends DcpInteger8Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Byte> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Byte }
             * 
             * 
             */
            public List<Byte> getStart() {
                if (start == null) {
                    start = new ArrayList<Byte>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpStringType">
         *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class String
            extends DcpStringType
        {

            @XmlAttribute(name = "start", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected java.lang.String start;

            /**
             * Ruft den Wert der start-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String }
             *     
             */
            public java.lang.String getStart() {
                return start;
            }

            /**
             * Legt den Wert der start-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String }
             *     
             */
            public void setStart(java.lang.String value) {
                this.start = value;
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
         *     &lt;extension base="{}dcpUnsignedInteger16Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Uint16
            extends DcpUnsignedInteger16Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Integer> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Integer }
             * 
             * 
             */
            public List<Integer> getStart() {
                if (start == null) {
                    start = new ArrayList<Integer>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpUnsignedInteger32Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Uint32
            extends DcpUnsignedInteger32Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Long> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            public List<Long> getStart() {
                if (start == null) {
                    start = new ArrayList<Long>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpUnsignedInteger64Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Uint64
            extends DcpUnsignedInteger64Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<BigInteger> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getStart() {
                if (start == null) {
                    start = new ArrayList<BigInteger>();
                }
                return this.start;
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
         *     &lt;extension base="{}dcpUnsignedInteger8Type">
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Uint8
            extends DcpUnsignedInteger8Type
        {

            @XmlAttribute(name = "start", required = true)
            protected List<Short> start;

            /**
             * Gets the value of the start property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the start property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Short }
             * 
             * 
             */
            public List<Short> getStart() {
                if (start == null) {
                    start = new ArrayList<Short>();
                }
                return this.start;
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
     *         &lt;element name="Uint8">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="start" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
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
     *                 &lt;attribute name="start" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
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
     *                 &lt;attribute name="start" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
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
     *                 &lt;attribute name="start" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
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
        "uint8",
        "uint16",
        "uint32",
        "uint64"
    })
    public static class StructuralParameter {

        @XmlElement(name = "Uint8")
        protected DcpVariable.StructuralParameter.Uint8 uint8;
        @XmlElement(name = "Uint16")
        protected DcpVariable.StructuralParameter.Uint16 uint16;
        @XmlElement(name = "Uint32")
        protected DcpVariable.StructuralParameter.Uint32 uint32;
        @XmlElement(name = "Uint64")
        protected DcpVariable.StructuralParameter.Uint64 uint64;

        /**
         * Ruft den Wert der uint8-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.StructuralParameter.Uint8 }
         *     
         */
        public DcpVariable.StructuralParameter.Uint8 getUint8() {
            return uint8;
        }

        /**
         * Legt den Wert der uint8-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.StructuralParameter.Uint8 }
         *     
         */
        public void setUint8(DcpVariable.StructuralParameter.Uint8 value) {
            this.uint8 = value;
        }

        /**
         * Ruft den Wert der uint16-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.StructuralParameter.Uint16 }
         *     
         */
        public DcpVariable.StructuralParameter.Uint16 getUint16() {
            return uint16;
        }

        /**
         * Legt den Wert der uint16-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.StructuralParameter.Uint16 }
         *     
         */
        public void setUint16(DcpVariable.StructuralParameter.Uint16 value) {
            this.uint16 = value;
        }

        /**
         * Ruft den Wert der uint32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.StructuralParameter.Uint32 }
         *     
         */
        public DcpVariable.StructuralParameter.Uint32 getUint32() {
            return uint32;
        }

        /**
         * Legt den Wert der uint32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.StructuralParameter.Uint32 }
         *     
         */
        public void setUint32(DcpVariable.StructuralParameter.Uint32 value) {
            this.uint32 = value;
        }

        /**
         * Ruft den Wert der uint64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DcpVariable.StructuralParameter.Uint64 }
         *     
         */
        public DcpVariable.StructuralParameter.Uint64 getUint64() {
            return uint64;
        }

        /**
         * Legt den Wert der uint64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DcpVariable.StructuralParameter.Uint64 }
         *     
         */
        public void setUint64(DcpVariable.StructuralParameter.Uint64 value) {
            this.uint64 = value;
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
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
         *             &lt;minInclusive value="1"/>
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
        public static class Uint16 {

            @XmlAttribute(name = "start", required = true)
            protected int start;

            /**
             * Ruft den Wert der start-Eigenschaft ab.
             * 
             */
            public int getStart() {
                return start;
            }

            /**
             * Legt den Wert der start-Eigenschaft fest.
             * 
             */
            public void setStart(int value) {
                this.start = value;
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
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
         *             &lt;minInclusive value="1"/>
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
        public static class Uint32 {

            @XmlAttribute(name = "start", required = true)
            protected long start;

            /**
             * Ruft den Wert der start-Eigenschaft ab.
             * 
             */
            public long getStart() {
                return start;
            }

            /**
             * Legt den Wert der start-Eigenschaft fest.
             * 
             */
            public void setStart(long value) {
                this.start = value;
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
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *             &lt;minInclusive value="1"/>
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
        public static class Uint64 {

            @XmlAttribute(name = "start", required = true)
            protected BigInteger start;

            /**
             * Ruft den Wert der start-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getStart() {
                return start;
            }

            /**
             * Legt den Wert der start-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setStart(BigInteger value) {
                this.start = value;
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
         *       &lt;attribute name="start" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
         *             &lt;minInclusive value="1"/>
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
        public static class Uint8 {

            @XmlAttribute(name = "start", required = true)
            protected short start;

            /**
             * Ruft den Wert der start-Eigenschaft ab.
             * 
             */
            public short getStart() {
                return start;
            }

            /**
             * Legt den Wert der start-Eigenschaft fest.
             * 
             */
            public void setStart(short value) {
                this.start = value;
            }

        }

    }

}
