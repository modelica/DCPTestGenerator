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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Unit definition (with respect to SI base units) and default display units
 * 
 * <p>Java-Klasse für dcpUnit complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dcpUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseUnit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="kg" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *                 &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *                 &lt;attribute name="A" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *                 &lt;attribute name="K" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *                 &lt;attribute name="mol" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *                 &lt;attribute name="cd" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *                 &lt;attribute name="rad" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *                 &lt;attribute name="factor" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
 *                 &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="DisplayUnit">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                   &lt;attribute name="factor" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
 *                   &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dcpUnit", propOrder = {
    "baseUnit",
    "displayUnit"
})
public class DcpUnit {

    @XmlElement(name = "BaseUnit")
    protected DcpUnit.BaseUnit baseUnit;
    @XmlElement(name = "DisplayUnit")
    protected List<DcpUnit.DisplayUnit> displayUnit;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;

    /**
     * Ruft den Wert der baseUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DcpUnit.BaseUnit }
     *     
     */
    public DcpUnit.BaseUnit getBaseUnit() {
        return baseUnit;
    }

    /**
     * Legt den Wert der baseUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DcpUnit.BaseUnit }
     *     
     */
    public void setBaseUnit(DcpUnit.BaseUnit value) {
        this.baseUnit = value;
    }

    /**
     * Gets the value of the displayUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DcpUnit.DisplayUnit }
     * 
     * 
     */
    public List<DcpUnit.DisplayUnit> getDisplayUnit() {
        if (displayUnit == null) {
            displayUnit = new ArrayList<DcpUnit.DisplayUnit>();
        }
        return this.displayUnit;
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


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="kg" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *       &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *       &lt;attribute name="A" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *       &lt;attribute name="K" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *       &lt;attribute name="mol" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *       &lt;attribute name="cd" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *       &lt;attribute name="rad" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *       &lt;attribute name="factor" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
     *       &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BaseUnit {

        @XmlAttribute(name = "kg")
        protected Integer kg;
        @XmlAttribute(name = "m")
        protected Integer m;
        @XmlAttribute(name = "s")
        protected Integer s;
        @XmlAttribute(name = "A")
        protected Integer a;
        @XmlAttribute(name = "K")
        protected Integer k;
        @XmlAttribute(name = "mol")
        protected Integer mol;
        @XmlAttribute(name = "cd")
        protected Integer cd;
        @XmlAttribute(name = "rad")
        protected Integer rad;
        @XmlAttribute(name = "factor")
        protected Double factor;
        @XmlAttribute(name = "offset")
        protected Double offset;

        /**
         * Ruft den Wert der kg-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getKg() {
            if (kg == null) {
                return  0;
            } else {
                return kg;
            }
        }

        /**
         * Legt den Wert der kg-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setKg(Integer value) {
            this.kg = value;
        }

        /**
         * Ruft den Wert der m-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getM() {
            if (m == null) {
                return  0;
            } else {
                return m;
            }
        }

        /**
         * Legt den Wert der m-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setM(Integer value) {
            this.m = value;
        }

        /**
         * Ruft den Wert der s-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getS() {
            if (s == null) {
                return  0;
            } else {
                return s;
            }
        }

        /**
         * Legt den Wert der s-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setS(Integer value) {
            this.s = value;
        }

        /**
         * Ruft den Wert der a-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getA() {
            if (a == null) {
                return  0;
            } else {
                return a;
            }
        }

        /**
         * Legt den Wert der a-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setA(Integer value) {
            this.a = value;
        }

        /**
         * Ruft den Wert der k-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getK() {
            if (k == null) {
                return  0;
            } else {
                return k;
            }
        }

        /**
         * Legt den Wert der k-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setK(Integer value) {
            this.k = value;
        }

        /**
         * Ruft den Wert der mol-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getMol() {
            if (mol == null) {
                return  0;
            } else {
                return mol;
            }
        }

        /**
         * Legt den Wert der mol-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMol(Integer value) {
            this.mol = value;
        }

        /**
         * Ruft den Wert der cd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getCd() {
            if (cd == null) {
                return  0;
            } else {
                return cd;
            }
        }

        /**
         * Legt den Wert der cd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCd(Integer value) {
            this.cd = value;
        }

        /**
         * Ruft den Wert der rad-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getRad() {
            if (rad == null) {
                return  0;
            } else {
                return rad;
            }
        }

        /**
         * Legt den Wert der rad-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRad(Integer value) {
            this.rad = value;
        }

        /**
         * Ruft den Wert der factor-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getFactor() {
            if (factor == null) {
                return  1.0D;
            } else {
                return factor;
            }
        }

        /**
         * Legt den Wert der factor-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setFactor(Double value) {
            this.factor = value;
        }

        /**
         * Ruft den Wert der offset-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getOffset() {
            if (offset == null) {
                return  0.0D;
            } else {
                return offset;
            }
        }

        /**
         * Legt den Wert der offset-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setOffset(Double value) {
            this.offset = value;
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
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="factor" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
     *       &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DisplayUnit {

        @XmlAttribute(name = "name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlAttribute(name = "factor")
        protected Double factor;
        @XmlAttribute(name = "offset")
        protected Double offset;

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

        /**
         * Ruft den Wert der factor-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getFactor() {
            if (factor == null) {
                return  1.0D;
            } else {
                return factor;
            }
        }

        /**
         * Legt den Wert der factor-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setFactor(Double value) {
            this.factor = value;
        }

        /**
         * Ruft den Wert der offset-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public double getOffset() {
            if (offset == null) {
                return  0.0D;
            } else {
                return offset;
            }
        }

        /**
         * Legt den Wert der offset-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setOffset(Double value) {
            this.offset = value;
        }

    }

}
