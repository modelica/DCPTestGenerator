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
 *         &lt;element name="Int8">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Int16">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Int32">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Int64">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Uint8">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Uint16">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Uint32">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Uint64">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Float32">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Float64">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="value">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="String">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" fixed="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Binary">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *                 &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" fixed="1" />
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
@XmlRootElement(name = "ReceivingPayloadField")
public class ReceivingPayloadField {

    @XmlElement(name = "Int8")
    protected ReceivingPayloadField.Int8 int8;
    @XmlElement(name = "Int16")
    protected ReceivingPayloadField.Int16 int16;
    @XmlElement(name = "Int32")
    protected ReceivingPayloadField.Int32 int32;
    @XmlElement(name = "Int64")
    protected ReceivingPayloadField.Int64 int64;
    @XmlElement(name = "Uint8")
    protected ReceivingPayloadField.Uint8 uint8;
    @XmlElement(name = "Uint16")
    protected ReceivingPayloadField.Uint16 uint16;
    @XmlElement(name = "Uint32")
    protected ReceivingPayloadField.Uint32 uint32;
    @XmlElement(name = "Uint64")
    protected ReceivingPayloadField.Uint64 uint64;
    @XmlElement(name = "Float32")
    protected ReceivingPayloadField.Float32 float32;
    @XmlElement(name = "Float64")
    protected ReceivingPayloadField.Float64 float64;
    @XmlElement(name = "String")
    protected ReceivingPayloadField.String string;
    @XmlElement(name = "Binary")
    protected ReceivingPayloadField.Binary binary;
    @XmlAttribute(name = "pos", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int pos;

    /**
     * Ruft den Wert der int8-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPayloadField.Int8 }
     *     
     */
    public ReceivingPayloadField.Int8 getInt8() {
        return int8;
    }

    /**
     * Legt den Wert der int8-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPayloadField.Int8 }
     *     
     */
    public void setInt8(ReceivingPayloadField.Int8 value) {
        this.int8 = value;
    }

    /**
     * Ruft den Wert der int16-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPayloadField.Int16 }
     *     
     */
    public ReceivingPayloadField.Int16 getInt16() {
        return int16;
    }

    /**
     * Legt den Wert der int16-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPayloadField.Int16 }
     *     
     */
    public void setInt16(ReceivingPayloadField.Int16 value) {
        this.int16 = value;
    }

    /**
     * Ruft den Wert der int32-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPayloadField.Int32 }
     *     
     */
    public ReceivingPayloadField.Int32 getInt32() {
        return int32;
    }

    /**
     * Legt den Wert der int32-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPayloadField.Int32 }
     *     
     */
    public void setInt32(ReceivingPayloadField.Int32 value) {
        this.int32 = value;
    }

    /**
     * Ruft den Wert der int64-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPayloadField.Int64 }
     *     
     */
    public ReceivingPayloadField.Int64 getInt64() {
        return int64;
    }

    /**
     * Legt den Wert der int64-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPayloadField.Int64 }
     *     
     */
    public void setInt64(ReceivingPayloadField.Int64 value) {
        this.int64 = value;
    }

    /**
     * Ruft den Wert der uint8-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPayloadField.Uint8 }
     *     
     */
    public ReceivingPayloadField.Uint8 getUint8() {
        return uint8;
    }

    /**
     * Legt den Wert der uint8-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPayloadField.Uint8 }
     *     
     */
    public void setUint8(ReceivingPayloadField.Uint8 value) {
        this.uint8 = value;
    }

    /**
     * Ruft den Wert der uint16-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPayloadField.Uint16 }
     *     
     */
    public ReceivingPayloadField.Uint16 getUint16() {
        return uint16;
    }

    /**
     * Legt den Wert der uint16-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPayloadField.Uint16 }
     *     
     */
    public void setUint16(ReceivingPayloadField.Uint16 value) {
        this.uint16 = value;
    }

    /**
     * Ruft den Wert der uint32-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPayloadField.Uint32 }
     *     
     */
    public ReceivingPayloadField.Uint32 getUint32() {
        return uint32;
    }

    /**
     * Legt den Wert der uint32-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPayloadField.Uint32 }
     *     
     */
    public void setUint32(ReceivingPayloadField.Uint32 value) {
        this.uint32 = value;
    }

    /**
     * Ruft den Wert der uint64-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPayloadField.Uint64 }
     *     
     */
    public ReceivingPayloadField.Uint64 getUint64() {
        return uint64;
    }

    /**
     * Legt den Wert der uint64-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPayloadField.Uint64 }
     *     
     */
    public void setUint64(ReceivingPayloadField.Uint64 value) {
        this.uint64 = value;
    }

    /**
     * Ruft den Wert der float32-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPayloadField.Float32 }
     *     
     */
    public ReceivingPayloadField.Float32 getFloat32() {
        return float32;
    }

    /**
     * Legt den Wert der float32-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPayloadField.Float32 }
     *     
     */
    public void setFloat32(ReceivingPayloadField.Float32 value) {
        this.float32 = value;
    }

    /**
     * Ruft den Wert der float64-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPayloadField.Float64 }
     *     
     */
    public ReceivingPayloadField.Float64 getFloat64() {
        return float64;
    }

    /**
     * Legt den Wert der float64-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPayloadField.Float64 }
     *     
     */
    public void setFloat64(ReceivingPayloadField.Float64 value) {
        this.float64 = value;
    }

    /**
     * Ruft den Wert der string-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPayloadField.String }
     *     
     */
    public ReceivingPayloadField.String getString() {
        return string;
    }

    /**
     * Legt den Wert der string-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPayloadField.String }
     *     
     */
    public void setString(ReceivingPayloadField.String value) {
        this.string = value;
    }

    /**
     * Ruft den Wert der binary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPayloadField.Binary }
     *     
     */
    public ReceivingPayloadField.Binary getBinary() {
        return binary;
    }

    /**
     * Legt den Wert der binary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPayloadField.Binary }
     *     
     */
    public void setBinary(ReceivingPayloadField.Binary value) {
        this.binary = value;
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
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
     *       &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" fixed="1" />
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

        @XmlAttribute(name = "value")
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] value;
        @XmlAttribute(name = "dimensionSize")
        @XmlSchemaType(name = "unsignedInt")
        protected Long dimensionSize;

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

        /**
         * Ruft den Wert der dimensionSize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getDimensionSize() {
            if (dimensionSize == null) {
                return  1L;
            } else {
                return dimensionSize;
            }
        }

        /**
         * Legt den Wert der dimensionSize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDimensionSize(Long value) {
            this.dimensionSize = value;
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
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}float" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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

        @XmlAttribute(name = "min")
        protected Float min;
        @XmlAttribute(name = "max")
        protected Float max;
        @XmlAttribute(name = "value")
        protected List<Float> value;
        @XmlAttribute(name = "dimensionSize")
        @XmlSchemaType(name = "unsignedInt")
        protected Long dimensionSize;

        /**
         * Ruft den Wert der min-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMin() {
            return min;
        }

        /**
         * Legt den Wert der min-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMin(Float value) {
            this.min = value;
        }

        /**
         * Ruft den Wert der max-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMax() {
            return max;
        }

        /**
         * Legt den Wert der max-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMax(Float value) {
            this.max = value;
        }

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

        /**
         * Ruft den Wert der dimensionSize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getDimensionSize() {
            if (dimensionSize == null) {
                return  1L;
            } else {
                return dimensionSize;
            }
        }

        /**
         * Legt den Wert der dimensionSize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDimensionSize(Long value) {
            this.dimensionSize = value;
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
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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

        @XmlAttribute(name = "min")
        protected Double min;
        @XmlAttribute(name = "max")
        protected Double max;
        @XmlAttribute(name = "value")
        protected List<Double> value;
        @XmlAttribute(name = "dimensionSize")
        @XmlSchemaType(name = "unsignedInt")
        protected Long dimensionSize;

        /**
         * Ruft den Wert der min-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getMin() {
            return min;
        }

        /**
         * Legt den Wert der min-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setMin(Double value) {
            this.min = value;
        }

        /**
         * Ruft den Wert der max-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getMax() {
            return max;
        }

        /**
         * Legt den Wert der max-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setMax(Double value) {
            this.max = value;
        }

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

        /**
         * Ruft den Wert der dimensionSize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getDimensionSize() {
            if (dimensionSize == null) {
                return  1L;
            } else {
                return dimensionSize;
            }
        }

        /**
         * Legt den Wert der dimensionSize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDimensionSize(Long value) {
            this.dimensionSize = value;
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
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}short" />
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}short" />
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}short" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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

        @XmlAttribute(name = "min")
        protected Short min;
        @XmlAttribute(name = "max")
        protected Short max;
        @XmlAttribute(name = "value")
        protected List<Short> value;
        @XmlAttribute(name = "dimensionSize")
        @XmlSchemaType(name = "unsignedInt")
        protected Long dimensionSize;

        /**
         * Ruft den Wert der min-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getMin() {
            return min;
        }

        /**
         * Legt den Wert der min-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setMin(Short value) {
            this.min = value;
        }

        /**
         * Ruft den Wert der max-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getMax() {
            return max;
        }

        /**
         * Legt den Wert der max-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setMax(Short value) {
            this.max = value;
        }

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

        /**
         * Ruft den Wert der dimensionSize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getDimensionSize() {
            if (dimensionSize == null) {
                return  1L;
            } else {
                return dimensionSize;
            }
        }

        /**
         * Legt den Wert der dimensionSize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDimensionSize(Long value) {
            this.dimensionSize = value;
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
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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

        @XmlAttribute(name = "min")
        protected Integer min;
        @XmlAttribute(name = "max")
        protected Integer max;
        @XmlAttribute(name = "value")
        protected List<Integer> value;
        @XmlAttribute(name = "dimensionSize")
        @XmlSchemaType(name = "unsignedInt")
        protected Long dimensionSize;

        /**
         * Ruft den Wert der min-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMin() {
            return min;
        }

        /**
         * Legt den Wert der min-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMin(Integer value) {
            this.min = value;
        }

        /**
         * Ruft den Wert der max-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMax() {
            return max;
        }

        /**
         * Legt den Wert der max-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMax(Integer value) {
            this.max = value;
        }

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

        /**
         * Ruft den Wert der dimensionSize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getDimensionSize() {
            if (dimensionSize == null) {
                return  1L;
            } else {
                return dimensionSize;
            }
        }

        /**
         * Legt den Wert der dimensionSize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDimensionSize(Long value) {
            this.dimensionSize = value;
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
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}long" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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

        @XmlAttribute(name = "min")
        protected Long min;
        @XmlAttribute(name = "max")
        protected Long max;
        @XmlAttribute(name = "value")
        protected List<Long> value;
        @XmlAttribute(name = "dimensionSize")
        @XmlSchemaType(name = "unsignedInt")
        protected Long dimensionSize;

        /**
         * Ruft den Wert der min-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMin() {
            return min;
        }

        /**
         * Legt den Wert der min-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMin(Long value) {
            this.min = value;
        }

        /**
         * Ruft den Wert der max-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMax() {
            return max;
        }

        /**
         * Legt den Wert der max-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMax(Long value) {
            this.max = value;
        }

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

        /**
         * Ruft den Wert der dimensionSize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getDimensionSize() {
            if (dimensionSize == null) {
                return  1L;
            } else {
                return dimensionSize;
            }
        }

        /**
         * Legt den Wert der dimensionSize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDimensionSize(Long value) {
            this.dimensionSize = value;
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
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}byte" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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

        @XmlAttribute(name = "min")
        protected Byte min;
        @XmlAttribute(name = "max")
        protected Byte max;
        @XmlAttribute(name = "value")
        protected List<Byte> value;
        @XmlAttribute(name = "dimensionSize")
        @XmlSchemaType(name = "unsignedInt")
        protected Long dimensionSize;

        /**
         * Ruft den Wert der min-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getMin() {
            return min;
        }

        /**
         * Legt den Wert der min-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setMin(Byte value) {
            this.min = value;
        }

        /**
         * Ruft den Wert der max-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getMax() {
            return max;
        }

        /**
         * Legt den Wert der max-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setMax(Byte value) {
            this.max = value;
        }

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

        /**
         * Ruft den Wert der dimensionSize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getDimensionSize() {
            if (dimensionSize == null) {
                return  1L;
            } else {
                return dimensionSize;
            }
        }

        /**
         * Legt den Wert der dimensionSize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDimensionSize(Long value) {
            this.dimensionSize = value;
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
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" fixed="1" />
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

        @XmlAttribute(name = "value")
        protected java.lang.String value;
        @XmlAttribute(name = "dimensionSize")
        @XmlSchemaType(name = "unsignedInt")
        protected Long dimensionSize;

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

        /**
         * Ruft den Wert der dimensionSize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getDimensionSize() {
            if (dimensionSize == null) {
                return  1L;
            } else {
                return dimensionSize;
            }
        }

        /**
         * Legt den Wert der dimensionSize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDimensionSize(Long value) {
            this.dimensionSize = value;
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
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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

        @XmlAttribute(name = "min")
        @XmlSchemaType(name = "unsignedShort")
        protected Integer min;
        @XmlAttribute(name = "max")
        @XmlSchemaType(name = "unsignedShort")
        protected Integer max;
        @XmlAttribute(name = "value")
        protected List<Integer> value;
        @XmlAttribute(name = "dimensionSize")
        @XmlSchemaType(name = "unsignedInt")
        protected Long dimensionSize;

        /**
         * Ruft den Wert der min-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMin() {
            return min;
        }

        /**
         * Legt den Wert der min-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMin(Integer value) {
            this.min = value;
        }

        /**
         * Ruft den Wert der max-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMax() {
            return max;
        }

        /**
         * Legt den Wert der max-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMax(Integer value) {
            this.max = value;
        }

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

        /**
         * Ruft den Wert der dimensionSize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getDimensionSize() {
            if (dimensionSize == null) {
                return  1L;
            } else {
                return dimensionSize;
            }
        }

        /**
         * Legt den Wert der dimensionSize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDimensionSize(Long value) {
            this.dimensionSize = value;
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
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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

        @XmlAttribute(name = "min")
        @XmlSchemaType(name = "unsignedInt")
        protected Long min;
        @XmlAttribute(name = "max")
        @XmlSchemaType(name = "unsignedInt")
        protected Long max;
        @XmlAttribute(name = "value")
        protected List<Long> value;
        @XmlAttribute(name = "dimensionSize")
        @XmlSchemaType(name = "unsignedInt")
        protected Long dimensionSize;

        /**
         * Ruft den Wert der min-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMin() {
            return min;
        }

        /**
         * Legt den Wert der min-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMin(Long value) {
            this.min = value;
        }

        /**
         * Ruft den Wert der max-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMax() {
            return max;
        }

        /**
         * Legt den Wert der max-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMax(Long value) {
            this.max = value;
        }

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

        /**
         * Ruft den Wert der dimensionSize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getDimensionSize() {
            if (dimensionSize == null) {
                return  1L;
            } else {
                return dimensionSize;
            }
        }

        /**
         * Legt den Wert der dimensionSize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDimensionSize(Long value) {
            this.dimensionSize = value;
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
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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

        @XmlAttribute(name = "min")
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger min;
        @XmlAttribute(name = "max")
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger max;
        @XmlAttribute(name = "value")
        protected List<BigInteger> value;
        @XmlAttribute(name = "dimensionSize")
        @XmlSchemaType(name = "unsignedInt")
        protected Long dimensionSize;

        /**
         * Ruft den Wert der min-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMin() {
            return min;
        }

        /**
         * Legt den Wert der min-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMin(BigInteger value) {
            this.min = value;
        }

        /**
         * Ruft den Wert der max-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMax() {
            return max;
        }

        /**
         * Legt den Wert der max-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMax(BigInteger value) {
            this.max = value;
        }

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

        /**
         * Ruft den Wert der dimensionSize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getDimensionSize() {
            if (dimensionSize == null) {
                return  1L;
            } else {
                return dimensionSize;
            }
        }

        /**
         * Legt den Wert der dimensionSize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDimensionSize(Long value) {
            this.dimensionSize = value;
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
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *       &lt;attribute name="value">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="dimensionSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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

        @XmlAttribute(name = "min")
        @XmlSchemaType(name = "unsignedByte")
        protected Short min;
        @XmlAttribute(name = "max")
        @XmlSchemaType(name = "unsignedByte")
        protected Short max;
        @XmlAttribute(name = "value")
        protected List<Short> value;
        @XmlAttribute(name = "dimensionSize")
        @XmlSchemaType(name = "unsignedInt")
        protected Long dimensionSize;

        /**
         * Ruft den Wert der min-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getMin() {
            return min;
        }

        /**
         * Legt den Wert der min-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setMin(Short value) {
            this.min = value;
        }

        /**
         * Ruft den Wert der max-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getMax() {
            return max;
        }

        /**
         * Legt den Wert der max-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setMax(Short value) {
            this.max = value;
        }

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

        /**
         * Ruft den Wert der dimensionSize-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public long getDimensionSize() {
            if (dimensionSize == null) {
                return  1L;
            } else {
                return dimensionSize;
            }
        }

        /**
         * Legt den Wert der dimensionSize-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDimensionSize(Long value) {
            this.dimensionSize = value;
        }

    }

}
