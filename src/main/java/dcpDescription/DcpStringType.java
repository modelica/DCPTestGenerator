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
 * <p>Java-Klasse für dcpStringType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dcpStringType">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseType">
 *       &lt;attGroup ref="{}dcpStringAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dcpStringType")
@XmlSeeAlso({
    dcpDescription.DcpVariable.Input.String.class,
    dcpDescription.DcpVariable.Output.String.class,
    dcpDescription.DcpVariable.Parameter.String.class
})
public class DcpStringType
    extends BaseType
{

    @XmlAttribute(name = "maxSize")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxSize;

    /**
     * Ruft den Wert der maxSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxSize() {
        return maxSize;
    }

    /**
     * Legt den Wert der maxSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxSize(Long value) {
        this.maxSize = value;
    }

}
