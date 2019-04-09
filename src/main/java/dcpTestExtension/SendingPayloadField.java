//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.04 um 04:23:37 PM CET 
//


package dcpTestExtension;

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
 *       &lt;choice>
 *         &lt;element name="Random">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="valueReference" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                 &lt;attribute name="valueReferenceVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Default">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="valueReference" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                 &lt;attribute name="valueReferenceVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Invalid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="valueReference" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                 &lt;attribute name="valueReferenceVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Value">
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
 *       &lt;/choice>
 *       &lt;attribute name="pos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "random",
    "_default",
    "invalid",
    "value"
})
@XmlRootElement(name = "SendingPayloadField")
public class SendingPayloadField {

    @XmlElement(name = "Random")
    protected SendingPayloadField.Random random;
    @XmlElement(name = "Default")
    protected SendingPayloadField.Default _default;
    @XmlElement(name = "Invalid")
    protected SendingPayloadField.Invalid invalid;
    @XmlElement(name = "Value")
    protected SendingPayloadField.Value value;
    @XmlAttribute(name = "pos", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int pos;

    /**
     * Ruft den Wert der random-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Random }
     *     
     */
    public SendingPayloadField.Random getRandom() {
        return random;
    }

    /**
     * Legt den Wert der random-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Random }
     *     
     */
    public void setRandom(SendingPayloadField.Random value) {
        this.random = value;
    }

    /**
     * Ruft den Wert der default-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Default }
     *     
     */
    public SendingPayloadField.Default getDefault() {
        return _default;
    }

    /**
     * Legt den Wert der default-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Default }
     *     
     */
    public void setDefault(SendingPayloadField.Default value) {
        this._default = value;
    }

    /**
     * Ruft den Wert der invalid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Invalid }
     *     
     */
    public SendingPayloadField.Invalid getInvalid() {
        return invalid;
    }

    /**
     * Legt den Wert der invalid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Invalid }
     *     
     */
    public void setInvalid(SendingPayloadField.Invalid value) {
        this.invalid = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Value }
     *     
     */
    public SendingPayloadField.Value getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Value }
     *     
     */
    public void setValue(SendingPayloadField.Value value) {
        this.value = value;
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
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="valueReference" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *       &lt;attribute name="valueReferenceVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Default {

        @XmlAttribute(name = "valueReference")
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger valueReference;
        @XmlAttribute(name = "valueReferenceVariable")
        protected java.lang.String valueReferenceVariable;

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
         * Ruft den Wert der valueReferenceVariable-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getValueReferenceVariable() {
            return valueReferenceVariable;
        }

        /**
         * Legt den Wert der valueReferenceVariable-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setValueReferenceVariable(java.lang.String value) {
            this.valueReferenceVariable = value;
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
     *       &lt;attribute name="valueReference" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *       &lt;attribute name="valueReferenceVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Invalid {

        @XmlAttribute(name = "valueReference")
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger valueReference;
        @XmlAttribute(name = "valueReferenceVariable")
        protected java.lang.String valueReferenceVariable;

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
         * Ruft den Wert der valueReferenceVariable-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getValueReferenceVariable() {
            return valueReferenceVariable;
        }

        /**
         * Legt den Wert der valueReferenceVariable-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setValueReferenceVariable(java.lang.String value) {
            this.valueReferenceVariable = value;
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
     *       &lt;attribute name="valueReference" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *       &lt;attribute name="valueReferenceVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Random {

        @XmlAttribute(name = "valueReference")
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger valueReference;
        @XmlAttribute(name = "valueReferenceVariable")
        protected java.lang.String valueReferenceVariable;

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
         * Ruft den Wert der valueReferenceVariable-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getValueReferenceVariable() {
            return valueReferenceVariable;
        }

        /**
         * Legt den Wert der valueReferenceVariable-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setValueReferenceVariable(java.lang.String value) {
            this.valueReferenceVariable = value;
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
    public static class Value {

        @XmlElement(name = "Int8")
        protected SendingPayloadField.Value.Int8 int8;
        @XmlElement(name = "Int16")
        protected SendingPayloadField.Value.Int16 int16;
        @XmlElement(name = "Int32")
        protected SendingPayloadField.Value.Int32 int32;
        @XmlElement(name = "Int64")
        protected SendingPayloadField.Value.Int64 int64;
        @XmlElement(name = "Uint8")
        protected SendingPayloadField.Value.Uint8 uint8;
        @XmlElement(name = "Uint16")
        protected SendingPayloadField.Value.Uint16 uint16;
        @XmlElement(name = "Uint32")
        protected SendingPayloadField.Value.Uint32 uint32;
        @XmlElement(name = "Uint64")
        protected SendingPayloadField.Value.Uint64 uint64;
        @XmlElement(name = "Float32")
        protected SendingPayloadField.Value.Float32 float32;
        @XmlElement(name = "Float64")
        protected SendingPayloadField.Value.Float64 float64;
        @XmlElement(name = "String")
        protected SendingPayloadField.Value.String string;
        @XmlElement(name = "Binary")
        protected SendingPayloadField.Value.Binary binary;

        /**
         * Ruft den Wert der int8-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SendingPayloadField.Value.Int8 }
         *     
         */
        public SendingPayloadField.Value.Int8 getInt8() {
            return int8;
        }

        /**
         * Legt den Wert der int8-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SendingPayloadField.Value.Int8 }
         *     
         */
        public void setInt8(SendingPayloadField.Value.Int8 value) {
            this.int8 = value;
        }

        /**
         * Ruft den Wert der int16-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SendingPayloadField.Value.Int16 }
         *     
         */
        public SendingPayloadField.Value.Int16 getInt16() {
            return int16;
        }

        /**
         * Legt den Wert der int16-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SendingPayloadField.Value.Int16 }
         *     
         */
        public void setInt16(SendingPayloadField.Value.Int16 value) {
            this.int16 = value;
        }

        /**
         * Ruft den Wert der int32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SendingPayloadField.Value.Int32 }
         *     
         */
        public SendingPayloadField.Value.Int32 getInt32() {
            return int32;
        }

        /**
         * Legt den Wert der int32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SendingPayloadField.Value.Int32 }
         *     
         */
        public void setInt32(SendingPayloadField.Value.Int32 value) {
            this.int32 = value;
        }

        /**
         * Ruft den Wert der int64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SendingPayloadField.Value.Int64 }
         *     
         */
        public SendingPayloadField.Value.Int64 getInt64() {
            return int64;
        }

        /**
         * Legt den Wert der int64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SendingPayloadField.Value.Int64 }
         *     
         */
        public void setInt64(SendingPayloadField.Value.Int64 value) {
            this.int64 = value;
        }

        /**
         * Ruft den Wert der uint8-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SendingPayloadField.Value.Uint8 }
         *     
         */
        public SendingPayloadField.Value.Uint8 getUint8() {
            return uint8;
        }

        /**
         * Legt den Wert der uint8-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SendingPayloadField.Value.Uint8 }
         *     
         */
        public void setUint8(SendingPayloadField.Value.Uint8 value) {
            this.uint8 = value;
        }

        /**
         * Ruft den Wert der uint16-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SendingPayloadField.Value.Uint16 }
         *     
         */
        public SendingPayloadField.Value.Uint16 getUint16() {
            return uint16;
        }

        /**
         * Legt den Wert der uint16-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SendingPayloadField.Value.Uint16 }
         *     
         */
        public void setUint16(SendingPayloadField.Value.Uint16 value) {
            this.uint16 = value;
        }

        /**
         * Ruft den Wert der uint32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SendingPayloadField.Value.Uint32 }
         *     
         */
        public SendingPayloadField.Value.Uint32 getUint32() {
            return uint32;
        }

        /**
         * Legt den Wert der uint32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SendingPayloadField.Value.Uint32 }
         *     
         */
        public void setUint32(SendingPayloadField.Value.Uint32 value) {
            this.uint32 = value;
        }

        /**
         * Ruft den Wert der uint64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SendingPayloadField.Value.Uint64 }
         *     
         */
        public SendingPayloadField.Value.Uint64 getUint64() {
            return uint64;
        }

        /**
         * Legt den Wert der uint64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SendingPayloadField.Value.Uint64 }
         *     
         */
        public void setUint64(SendingPayloadField.Value.Uint64 value) {
            this.uint64 = value;
        }

        /**
         * Ruft den Wert der float32-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SendingPayloadField.Value.Float32 }
         *     
         */
        public SendingPayloadField.Value.Float32 getFloat32() {
            return float32;
        }

        /**
         * Legt den Wert der float32-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SendingPayloadField.Value.Float32 }
         *     
         */
        public void setFloat32(SendingPayloadField.Value.Float32 value) {
            this.float32 = value;
        }

        /**
         * Ruft den Wert der float64-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SendingPayloadField.Value.Float64 }
         *     
         */
        public SendingPayloadField.Value.Float64 getFloat64() {
            return float64;
        }

        /**
         * Legt den Wert der float64-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SendingPayloadField.Value.Float64 }
         *     
         */
        public void setFloat64(SendingPayloadField.Value.Float64 value) {
            this.float64 = value;
        }

        /**
         * Ruft den Wert der string-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SendingPayloadField.Value.String }
         *     
         */
        public SendingPayloadField.Value.String getString() {
            return string;
        }

        /**
         * Legt den Wert der string-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SendingPayloadField.Value.String }
         *     
         */
        public void setString(SendingPayloadField.Value.String value) {
            this.string = value;
        }

        /**
         * Ruft den Wert der binary-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SendingPayloadField.Value.Binary }
         *     
         */
        public SendingPayloadField.Value.Binary getBinary() {
            return binary;
        }

        /**
         * Legt den Wert der binary-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SendingPayloadField.Value.Binary }
         *     
         */
        public void setBinary(SendingPayloadField.Value.Binary value) {
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
