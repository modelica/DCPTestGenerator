//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.04 um 04:23:37 PM CET 
//


package dcpTestExtension;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;choice>
 *           &lt;element ref="{}ExtensionSet"/>
 *           &lt;element ref="{}ForEach"/>
 *           &lt;element ref="{}AddTransition"/>
 *           &lt;element ref="{}If"/>
 *           &lt;element ref="{}Update"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="seed" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensionSetOrForEachOrAddTransition"
})
@XmlRootElement(name = "DcpTestSuiteExtension")
public class DcpTestSuiteExtension {

    @XmlElements({
        @XmlElement(name = "ExtensionSet", type = ExtensionSet.class),
        @XmlElement(name = "ForEach", type = ForEach.class),
        @XmlElement(name = "AddTransition", type = AddTransition.class),
        @XmlElement(name = "If", type = If.class),
        @XmlElement(name = "Update", type = Update.class)
    })
    protected List<Object> extensionSetOrForEachOrAddTransition;
    @XmlAttribute(name = "seed")
    protected Long seed;

    /**
     * Gets the value of the extensionSetOrForEachOrAddTransition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionSetOrForEachOrAddTransition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionSetOrForEachOrAddTransition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionSet }
     * {@link ForEach }
     * {@link AddTransition }
     * {@link If }
     * {@link Update }
     * 
     * 
     */
    public List<Object> getExtensionSetOrForEachOrAddTransition() {
        if (extensionSetOrForEachOrAddTransition == null) {
            extensionSetOrForEachOrAddTransition = new ArrayList<Object>();
        }
        return this.extensionSetOrForEachOrAddTransition;
    }

    /**
     * Ruft den Wert der seed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeed() {
        return seed;
    }

    /**
     * Legt den Wert der seed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeed(Long value) {
        this.seed = value;
    }

}
