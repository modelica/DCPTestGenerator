//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.04 um 04:23:37 PM CET 
//


package dcpTestExtension;

import java.math.BigInteger;
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
 *       &lt;sequence>
 *         &lt;element name="ConditionFullfilled">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}Any"/>
 *                   &lt;element name="Value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="Int8">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Int16">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Int32">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Int64">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Uint8">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Uint16">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Uint32">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Uint64">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Float32">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Float64">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="String">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Binary">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{}Condition"/>
 *                   &lt;element ref="{}BetweenMinMax"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Else">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}Any"/>
 *                   &lt;element name="Value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="Int8">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Int16">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Int32">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Int64">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Uint8">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Uint16">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Uint32">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Uint64">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Float32">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Float64">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="String">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Binary">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{}Condition"/>
 *                   &lt;element ref="{}BetweenMinMax"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="condition" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conditionFullfilled",
    "_else"
})
@XmlRootElement(name = "Condition")
public class Condition {

    @XmlElement(name = "ConditionFullfilled", required = true)
    protected Condition.ConditionFullfilled conditionFullfilled;
    @XmlElement(name = "Else", required = true)
    protected Condition.Else _else;
    @XmlAttribute(name = "condition", required = true)
    protected java.lang.String condition;

    /**
     * Ruft den Wert der conditionFullfilled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Condition.ConditionFullfilled }
     *     
     */
    public Condition.ConditionFullfilled getConditionFullfilled() {
        return conditionFullfilled;
    }

    /**
     * Legt den Wert der conditionFullfilled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition.ConditionFullfilled }
     *     
     */
    public void setConditionFullfilled(Condition.ConditionFullfilled value) {
        this.conditionFullfilled = value;
    }

    /**
     * Ruft den Wert der else-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Condition.Else }
     *     
     */
    public Condition.Else getElse() {
        return _else;
    }

    /**
     * Legt den Wert der else-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition.Else }
     *     
     */
    public void setElse(Condition.Else value) {
        this._else = value;
    }

    /**
     * Ruft den Wert der condition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCondition() {
        return condition;
    }

    /**
     * Legt den Wert der condition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCondition(java.lang.String value) {
        this.condition = value;
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
     *         &lt;element ref="{}Any"/>
     *         &lt;element name="Value">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="Int8">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Int16">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Int32">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Int64">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Uint8">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Uint16">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Uint32">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Uint64">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Float32">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Float64">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
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
     *         &lt;element ref="{}Condition"/>
     *         &lt;element ref="{}BetweenMinMax"/>
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
        "any",
        "value",
        "condition",
        "betweenMinMax"
    })
    public static class ConditionFullfilled {

        @XmlElement(name = "Any")
        protected Any any;
        @XmlElement(name = "Value")
        protected Condition.ConditionFullfilled.Value value;
        @XmlElement(name = "Condition")
        protected Condition condition;
        @XmlElement(name = "BetweenMinMax")
        protected BetweenMinMax betweenMinMax;

        /**
         * Ruft den Wert der any-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Any }
         *     
         */
        public Any getAny() {
            return any;
        }

        /**
         * Legt den Wert der any-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Any }
         *     
         */
        public void setAny(Any value) {
            this.any = value;
        }

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Condition.ConditionFullfilled.Value }
         *     
         */
        public Condition.ConditionFullfilled.Value getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Condition.ConditionFullfilled.Value }
         *     
         */
        public void setValue(Condition.ConditionFullfilled.Value value) {
            this.value = value;
        }

        /**
         * Ruft den Wert der condition-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Condition }
         *     
         */
        public Condition getCondition() {
            return condition;
        }

        /**
         * Legt den Wert der condition-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Condition }
         *     
         */
        public void setCondition(Condition value) {
            this.condition = value;
        }

        /**
         * Ruft den Wert der betweenMinMax-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BetweenMinMax }
         *     
         */
        public BetweenMinMax getBetweenMinMax() {
            return betweenMinMax;
        }

        /**
         * Legt den Wert der betweenMinMax-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BetweenMinMax }
         *     
         */
        public void setBetweenMinMax(BetweenMinMax value) {
            this.betweenMinMax = value;
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
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Int16">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Int32">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Int64">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Uint8">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Uint16">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Uint32">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Uint64">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Float32">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Float64">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
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
            protected Condition.ConditionFullfilled.Value.Int8 int8;
            @XmlElement(name = "Int16")
            protected Condition.ConditionFullfilled.Value.Int16 int16;
            @XmlElement(name = "Int32")
            protected Condition.ConditionFullfilled.Value.Int32 int32;
            @XmlElement(name = "Int64")
            protected Condition.ConditionFullfilled.Value.Int64 int64;
            @XmlElement(name = "Uint8")
            protected Condition.ConditionFullfilled.Value.Uint8 uint8;
            @XmlElement(name = "Uint16")
            protected Condition.ConditionFullfilled.Value.Uint16 uint16;
            @XmlElement(name = "Uint32")
            protected Condition.ConditionFullfilled.Value.Uint32 uint32;
            @XmlElement(name = "Uint64")
            protected Condition.ConditionFullfilled.Value.Uint64 uint64;
            @XmlElement(name = "Float32")
            protected Condition.ConditionFullfilled.Value.Float32 float32;
            @XmlElement(name = "Float64")
            protected Condition.ConditionFullfilled.Value.Float64 float64;
            @XmlElement(name = "String")
            protected Condition.ConditionFullfilled.Value.String string;
            @XmlElement(name = "Binary")
            protected Condition.ConditionFullfilled.Value.Binary binary;

            /**
             * Ruft den Wert der int8-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.ConditionFullfilled.Value.Int8 }
             *     
             */
            public Condition.ConditionFullfilled.Value.Int8 getInt8() {
                return int8;
            }

            /**
             * Legt den Wert der int8-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.ConditionFullfilled.Value.Int8 }
             *     
             */
            public void setInt8(Condition.ConditionFullfilled.Value.Int8 value) {
                this.int8 = value;
            }

            /**
             * Ruft den Wert der int16-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.ConditionFullfilled.Value.Int16 }
             *     
             */
            public Condition.ConditionFullfilled.Value.Int16 getInt16() {
                return int16;
            }

            /**
             * Legt den Wert der int16-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.ConditionFullfilled.Value.Int16 }
             *     
             */
            public void setInt16(Condition.ConditionFullfilled.Value.Int16 value) {
                this.int16 = value;
            }

            /**
             * Ruft den Wert der int32-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.ConditionFullfilled.Value.Int32 }
             *     
             */
            public Condition.ConditionFullfilled.Value.Int32 getInt32() {
                return int32;
            }

            /**
             * Legt den Wert der int32-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.ConditionFullfilled.Value.Int32 }
             *     
             */
            public void setInt32(Condition.ConditionFullfilled.Value.Int32 value) {
                this.int32 = value;
            }

            /**
             * Ruft den Wert der int64-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.ConditionFullfilled.Value.Int64 }
             *     
             */
            public Condition.ConditionFullfilled.Value.Int64 getInt64() {
                return int64;
            }

            /**
             * Legt den Wert der int64-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.ConditionFullfilled.Value.Int64 }
             *     
             */
            public void setInt64(Condition.ConditionFullfilled.Value.Int64 value) {
                this.int64 = value;
            }

            /**
             * Ruft den Wert der uint8-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.ConditionFullfilled.Value.Uint8 }
             *     
             */
            public Condition.ConditionFullfilled.Value.Uint8 getUint8() {
                return uint8;
            }

            /**
             * Legt den Wert der uint8-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.ConditionFullfilled.Value.Uint8 }
             *     
             */
            public void setUint8(Condition.ConditionFullfilled.Value.Uint8 value) {
                this.uint8 = value;
            }

            /**
             * Ruft den Wert der uint16-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.ConditionFullfilled.Value.Uint16 }
             *     
             */
            public Condition.ConditionFullfilled.Value.Uint16 getUint16() {
                return uint16;
            }

            /**
             * Legt den Wert der uint16-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.ConditionFullfilled.Value.Uint16 }
             *     
             */
            public void setUint16(Condition.ConditionFullfilled.Value.Uint16 value) {
                this.uint16 = value;
            }

            /**
             * Ruft den Wert der uint32-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.ConditionFullfilled.Value.Uint32 }
             *     
             */
            public Condition.ConditionFullfilled.Value.Uint32 getUint32() {
                return uint32;
            }

            /**
             * Legt den Wert der uint32-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.ConditionFullfilled.Value.Uint32 }
             *     
             */
            public void setUint32(Condition.ConditionFullfilled.Value.Uint32 value) {
                this.uint32 = value;
            }

            /**
             * Ruft den Wert der uint64-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.ConditionFullfilled.Value.Uint64 }
             *     
             */
            public Condition.ConditionFullfilled.Value.Uint64 getUint64() {
                return uint64;
            }

            /**
             * Legt den Wert der uint64-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.ConditionFullfilled.Value.Uint64 }
             *     
             */
            public void setUint64(Condition.ConditionFullfilled.Value.Uint64 value) {
                this.uint64 = value;
            }

            /**
             * Ruft den Wert der float32-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.ConditionFullfilled.Value.Float32 }
             *     
             */
            public Condition.ConditionFullfilled.Value.Float32 getFloat32() {
                return float32;
            }

            /**
             * Legt den Wert der float32-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.ConditionFullfilled.Value.Float32 }
             *     
             */
            public void setFloat32(Condition.ConditionFullfilled.Value.Float32 value) {
                this.float32 = value;
            }

            /**
             * Ruft den Wert der float64-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.ConditionFullfilled.Value.Float64 }
             *     
             */
            public Condition.ConditionFullfilled.Value.Float64 getFloat64() {
                return float64;
            }

            /**
             * Legt den Wert der float64-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.ConditionFullfilled.Value.Float64 }
             *     
             */
            public void setFloat64(Condition.ConditionFullfilled.Value.Float64 value) {
                this.float64 = value;
            }

            /**
             * Ruft den Wert der string-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.ConditionFullfilled.Value.String }
             *     
             */
            public Condition.ConditionFullfilled.Value.String getString() {
                return string;
            }

            /**
             * Legt den Wert der string-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.ConditionFullfilled.Value.String }
             *     
             */
            public void setString(Condition.ConditionFullfilled.Value.String value) {
                this.string = value;
            }

            /**
             * Ruft den Wert der binary-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.ConditionFullfilled.Value.Binary }
             *     
             */
            public Condition.ConditionFullfilled.Value.Binary getBinary() {
                return binary;
            }

            /**
             * Legt den Wert der binary-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.ConditionFullfilled.Value.Binary }
             *     
             */
            public void setBinary(Condition.ConditionFullfilled.Value.Binary value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
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
                protected float value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public float getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(float value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
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
                protected double value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public double getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(double value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                protected short value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public short getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(short value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                protected int value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public int getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(int value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
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
                protected long value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public long getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(long value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
                protected byte value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public byte getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(byte value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
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
                @XmlSchemaType(name = "unsignedShort")
                protected int value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public int getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(int value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
                @XmlSchemaType(name = "unsignedInt")
                protected long value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public long getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(long value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
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
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setValue(BigInteger value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                @XmlSchemaType(name = "unsignedByte")
                protected short value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public short getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(short value) {
                    this.value = value;
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
     *         &lt;element ref="{}Any"/>
     *         &lt;element name="Value">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="Int8">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Int16">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Int32">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Int64">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Uint8">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Uint16">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Uint32">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Uint64">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Float32">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Float64">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
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
     *         &lt;element ref="{}Condition"/>
     *         &lt;element ref="{}BetweenMinMax"/>
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
        "any",
        "value",
        "condition",
        "betweenMinMax"
    })
    public static class Else {

        @XmlElement(name = "Any")
        protected Any any;
        @XmlElement(name = "Value")
        protected Condition.Else.Value value;
        @XmlElement(name = "Condition")
        protected Condition condition;
        @XmlElement(name = "BetweenMinMax")
        protected BetweenMinMax betweenMinMax;

        /**
         * Ruft den Wert der any-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Any }
         *     
         */
        public Any getAny() {
            return any;
        }

        /**
         * Legt den Wert der any-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Any }
         *     
         */
        public void setAny(Any value) {
            this.any = value;
        }

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Condition.Else.Value }
         *     
         */
        public Condition.Else.Value getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Condition.Else.Value }
         *     
         */
        public void setValue(Condition.Else.Value value) {
            this.value = value;
        }

        /**
         * Ruft den Wert der condition-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Condition }
         *     
         */
        public Condition getCondition() {
            return condition;
        }

        /**
         * Legt den Wert der condition-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Condition }
         *     
         */
        public void setCondition(Condition value) {
            this.condition = value;
        }

        /**
         * Ruft den Wert der betweenMinMax-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BetweenMinMax }
         *     
         */
        public BetweenMinMax getBetweenMinMax() {
            return betweenMinMax;
        }

        /**
         * Legt den Wert der betweenMinMax-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BetweenMinMax }
         *     
         */
        public void setBetweenMinMax(BetweenMinMax value) {
            this.betweenMinMax = value;
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
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Int16">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Int32">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Int64">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Uint8">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Uint16">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Uint32">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Uint64">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Float32">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Float64">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
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
            protected Condition.Else.Value.Int8 int8;
            @XmlElement(name = "Int16")
            protected Condition.Else.Value.Int16 int16;
            @XmlElement(name = "Int32")
            protected Condition.Else.Value.Int32 int32;
            @XmlElement(name = "Int64")
            protected Condition.Else.Value.Int64 int64;
            @XmlElement(name = "Uint8")
            protected Condition.Else.Value.Uint8 uint8;
            @XmlElement(name = "Uint16")
            protected Condition.Else.Value.Uint16 uint16;
            @XmlElement(name = "Uint32")
            protected Condition.Else.Value.Uint32 uint32;
            @XmlElement(name = "Uint64")
            protected Condition.Else.Value.Uint64 uint64;
            @XmlElement(name = "Float32")
            protected Condition.Else.Value.Float32 float32;
            @XmlElement(name = "Float64")
            protected Condition.Else.Value.Float64 float64;
            @XmlElement(name = "String")
            protected Condition.Else.Value.String string;
            @XmlElement(name = "Binary")
            protected Condition.Else.Value.Binary binary;

            /**
             * Ruft den Wert der int8-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.Else.Value.Int8 }
             *     
             */
            public Condition.Else.Value.Int8 getInt8() {
                return int8;
            }

            /**
             * Legt den Wert der int8-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.Else.Value.Int8 }
             *     
             */
            public void setInt8(Condition.Else.Value.Int8 value) {
                this.int8 = value;
            }

            /**
             * Ruft den Wert der int16-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.Else.Value.Int16 }
             *     
             */
            public Condition.Else.Value.Int16 getInt16() {
                return int16;
            }

            /**
             * Legt den Wert der int16-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.Else.Value.Int16 }
             *     
             */
            public void setInt16(Condition.Else.Value.Int16 value) {
                this.int16 = value;
            }

            /**
             * Ruft den Wert der int32-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.Else.Value.Int32 }
             *     
             */
            public Condition.Else.Value.Int32 getInt32() {
                return int32;
            }

            /**
             * Legt den Wert der int32-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.Else.Value.Int32 }
             *     
             */
            public void setInt32(Condition.Else.Value.Int32 value) {
                this.int32 = value;
            }

            /**
             * Ruft den Wert der int64-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.Else.Value.Int64 }
             *     
             */
            public Condition.Else.Value.Int64 getInt64() {
                return int64;
            }

            /**
             * Legt den Wert der int64-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.Else.Value.Int64 }
             *     
             */
            public void setInt64(Condition.Else.Value.Int64 value) {
                this.int64 = value;
            }

            /**
             * Ruft den Wert der uint8-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.Else.Value.Uint8 }
             *     
             */
            public Condition.Else.Value.Uint8 getUint8() {
                return uint8;
            }

            /**
             * Legt den Wert der uint8-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.Else.Value.Uint8 }
             *     
             */
            public void setUint8(Condition.Else.Value.Uint8 value) {
                this.uint8 = value;
            }

            /**
             * Ruft den Wert der uint16-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.Else.Value.Uint16 }
             *     
             */
            public Condition.Else.Value.Uint16 getUint16() {
                return uint16;
            }

            /**
             * Legt den Wert der uint16-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.Else.Value.Uint16 }
             *     
             */
            public void setUint16(Condition.Else.Value.Uint16 value) {
                this.uint16 = value;
            }

            /**
             * Ruft den Wert der uint32-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.Else.Value.Uint32 }
             *     
             */
            public Condition.Else.Value.Uint32 getUint32() {
                return uint32;
            }

            /**
             * Legt den Wert der uint32-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.Else.Value.Uint32 }
             *     
             */
            public void setUint32(Condition.Else.Value.Uint32 value) {
                this.uint32 = value;
            }

            /**
             * Ruft den Wert der uint64-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.Else.Value.Uint64 }
             *     
             */
            public Condition.Else.Value.Uint64 getUint64() {
                return uint64;
            }

            /**
             * Legt den Wert der uint64-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.Else.Value.Uint64 }
             *     
             */
            public void setUint64(Condition.Else.Value.Uint64 value) {
                this.uint64 = value;
            }

            /**
             * Ruft den Wert der float32-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.Else.Value.Float32 }
             *     
             */
            public Condition.Else.Value.Float32 getFloat32() {
                return float32;
            }

            /**
             * Legt den Wert der float32-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.Else.Value.Float32 }
             *     
             */
            public void setFloat32(Condition.Else.Value.Float32 value) {
                this.float32 = value;
            }

            /**
             * Ruft den Wert der float64-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.Else.Value.Float64 }
             *     
             */
            public Condition.Else.Value.Float64 getFloat64() {
                return float64;
            }

            /**
             * Legt den Wert der float64-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.Else.Value.Float64 }
             *     
             */
            public void setFloat64(Condition.Else.Value.Float64 value) {
                this.float64 = value;
            }

            /**
             * Ruft den Wert der string-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.Else.Value.String }
             *     
             */
            public Condition.Else.Value.String getString() {
                return string;
            }

            /**
             * Legt den Wert der string-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.Else.Value.String }
             *     
             */
            public void setString(Condition.Else.Value.String value) {
                this.string = value;
            }

            /**
             * Ruft den Wert der binary-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Condition.Else.Value.Binary }
             *     
             */
            public Condition.Else.Value.Binary getBinary() {
                return binary;
            }

            /**
             * Legt den Wert der binary-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Condition.Else.Value.Binary }
             *     
             */
            public void setBinary(Condition.Else.Value.Binary value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
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
                protected float value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public float getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(float value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
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
                protected double value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public double getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(double value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
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
                protected short value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public short getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(short value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                protected int value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public int getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(int value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
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
                protected long value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public long getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(long value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
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
                protected byte value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public byte getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(byte value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
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
                @XmlSchemaType(name = "unsignedShort")
                protected int value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public int getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(int value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
                @XmlSchemaType(name = "unsignedInt")
                protected long value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public long getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(long value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
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
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setValue(BigInteger value) {
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
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                @XmlSchemaType(name = "unsignedByte")
                protected short value;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 */
                public short getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 */
                public void setValue(short value) {
                    this.value = value;
                }

            }

        }

    }

}
