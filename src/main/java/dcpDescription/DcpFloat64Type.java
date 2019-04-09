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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für dcpFloat64Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dcpFloat64Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseType">
 *       &lt;attGroup ref="{}dcpFloat64Attributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dcpFloat64Type")
@XmlSeeAlso({
    dcpDescription.DcpVariable.Input.Float64 .class,
    dcpDescription.DcpVariable.Output.Float64 .class,
    dcpDescription.DcpVariable.Parameter.Float64 .class
})
public class DcpFloat64Type
    extends BaseType
{

    @XmlAttribute(name = "min")
    protected Double min;
    @XmlAttribute(name = "max")
    protected Double max;
    @XmlAttribute(name = "nominal")
    protected Double nominal;
    @XmlAttribute(name = "gradient")
    protected Double gradient;
    @XmlAttribute(name = "quantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String quantity;
    @XmlAttribute(name = "unit")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unit;
    @XmlAttribute(name = "displayUnit")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayUnit;

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
     * Ruft den Wert der nominal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNominal() {
        return nominal;
    }

    /**
     * Legt den Wert der nominal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNominal(Double value) {
        this.nominal = value;
    }

    /**
     * Ruft den Wert der gradient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGradient() {
        return gradient;
    }

    /**
     * Legt den Wert der gradient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGradient(Double value) {
        this.gradient = value;
    }

    /**
     * Ruft den Wert der quantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Legt den Wert der quantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Ruft den Wert der unit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Legt den Wert der unit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Ruft den Wert der displayUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayUnit() {
        return displayUnit;
    }

    /**
     * Legt den Wert der displayUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayUnit(String value) {
        this.displayUnit = value;
    }

}
