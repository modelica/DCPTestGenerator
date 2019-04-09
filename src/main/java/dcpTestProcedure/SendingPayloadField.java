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
@XmlRootElement(name = "SendingPayloadField")
public class SendingPayloadField {

    @XmlElement(name = "Int8")
    protected SendingPayloadField.Int8 int8;
    @XmlElement(name = "Int16")
    protected SendingPayloadField.Int16 int16;
    @XmlElement(name = "Int32")
    protected SendingPayloadField.Int32 int32;
    @XmlElement(name = "Int64")
    protected SendingPayloadField.Int64 int64;
    @XmlElement(name = "Uint8")
    protected SendingPayloadField.Uint8 uint8;
    @XmlElement(name = "Uint16")
    protected SendingPayloadField.Uint16 uint16;
    @XmlElement(name = "Uint32")
    protected SendingPayloadField.Uint32 uint32;
    @XmlElement(name = "Uint64")
    protected SendingPayloadField.Uint64 uint64;
    @XmlElement(name = "Float32")
    protected SendingPayloadField.Float32 float32;
    @XmlElement(name = "Float64")
    protected SendingPayloadField.Float64 float64;
    @XmlElement(name = "String")
    protected SendingPayloadField.String string;
    @XmlElement(name = "Binary")
    protected SendingPayloadField.Binary binary;
    @XmlAttribute(name = "pos", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int pos;

    /**
     * Ruft den Wert der int8-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Int8 }
     *     
     */
    public SendingPayloadField.Int8 getInt8() {
        return int8;
    }

    /**
     * Legt den Wert der int8-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Int8 }
     *     
     */
    public void setInt8(SendingPayloadField.Int8 value) {
        this.int8 = value;
    }

    /**
     * Ruft den Wert der int16-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Int16 }
     *     
     */
    public SendingPayloadField.Int16 getInt16() {
        return int16;
    }

    /**
     * Legt den Wert der int16-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Int16 }
     *     
     */
    public void setInt16(SendingPayloadField.Int16 value) {
        this.int16 = value;
    }

    /**
     * Ruft den Wert der int32-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Int32 }
     *     
     */
    public SendingPayloadField.Int32 getInt32() {
        return int32;
    }

    /**
     * Legt den Wert der int32-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Int32 }
     *     
     */
    public void setInt32(SendingPayloadField.Int32 value) {
        this.int32 = value;
    }

    /**
     * Ruft den Wert der int64-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Int64 }
     *     
     */
    public SendingPayloadField.Int64 getInt64() {
        return int64;
    }

    /**
     * Legt den Wert der int64-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Int64 }
     *     
     */
    public void setInt64(SendingPayloadField.Int64 value) {
        this.int64 = value;
    }

    /**
     * Ruft den Wert der uint8-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Uint8 }
     *     
     */
    public SendingPayloadField.Uint8 getUint8() {
        return uint8;
    }

    /**
     * Legt den Wert der uint8-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Uint8 }
     *     
     */
    public void setUint8(SendingPayloadField.Uint8 value) {
        this.uint8 = value;
    }

    /**
     * Ruft den Wert der uint16-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Uint16 }
     *     
     */
    public SendingPayloadField.Uint16 getUint16() {
        return uint16;
    }

    /**
     * Legt den Wert der uint16-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Uint16 }
     *     
     */
    public void setUint16(SendingPayloadField.Uint16 value) {
        this.uint16 = value;
    }

    /**
     * Ruft den Wert der uint32-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Uint32 }
     *     
     */
    public SendingPayloadField.Uint32 getUint32() {
        return uint32;
    }

    /**
     * Legt den Wert der uint32-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Uint32 }
     *     
     */
    public void setUint32(SendingPayloadField.Uint32 value) {
        this.uint32 = value;
    }

    /**
     * Ruft den Wert der uint64-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Uint64 }
     *     
     */
    public SendingPayloadField.Uint64 getUint64() {
        return uint64;
    }

    /**
     * Legt den Wert der uint64-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Uint64 }
     *     
     */
    public void setUint64(SendingPayloadField.Uint64 value) {
        this.uint64 = value;
    }

    /**
     * Ruft den Wert der float32-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Float32 }
     *     
     */
    public SendingPayloadField.Float32 getFloat32() {
        return float32;
    }

    /**
     * Legt den Wert der float32-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Float32 }
     *     
     */
    public void setFloat32(SendingPayloadField.Float32 value) {
        this.float32 = value;
    }

    /**
     * Ruft den Wert der float64-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Float64 }
     *     
     */
    public SendingPayloadField.Float64 getFloat64() {
        return float64;
    }

    /**
     * Legt den Wert der float64-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Float64 }
     *     
     */
    public void setFloat64(SendingPayloadField.Float64 value) {
        this.float64 = value;
    }

    /**
     * Ruft den Wert der string-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.String }
     *     
     */
    public SendingPayloadField.String getString() {
        return string;
    }

    /**
     * Legt den Wert der string-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.String }
     *     
     */
    public void setString(SendingPayloadField.String value) {
        this.string = value;
    }

    /**
     * Ruft den Wert der binary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SendingPayloadField.Binary }
     *     
     */
    public SendingPayloadField.Binary getBinary() {
        return binary;
    }

    /**
     * Legt den Wert der binary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingPayloadField.Binary }
     *     
     */
    public void setBinary(SendingPayloadField.Binary value) {
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
