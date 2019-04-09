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


/**
 * <p>Java-Klasse für dcpUnsignedInteger32Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dcpUnsignedInteger32Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseType">
 *       &lt;attGroup ref="{}dcpUnsignedInteger32Attributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dcpUnsignedInteger32Type")
@XmlSeeAlso({
    dcpDescription.DcpVariable.Input.Uint32 .class,
    dcpDescription.DcpVariable.Output.Uint32 .class,
    dcpDescription.DcpVariable.Parameter.Uint32 .class
})
public class DcpUnsignedInteger32Type
    extends BaseType
{

    @XmlAttribute(name = "min")
    @XmlSchemaType(name = "unsignedInt")
    protected Long min;
    @XmlAttribute(name = "max")
    @XmlSchemaType(name = "unsignedInt")
    protected Long max;
    @XmlAttribute(name = "gradient")
    @XmlSchemaType(name = "unsignedInt")
    protected Long gradient;

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
     * Ruft den Wert der gradient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGradient() {
        return gradient;
    }

    /**
     * Legt den Wert der gradient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGradient(Long value) {
        this.gradient = value;
    }

}
