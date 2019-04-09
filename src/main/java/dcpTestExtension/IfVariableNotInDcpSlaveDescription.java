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
 *           &lt;element ref="{}AddTransition"/>
 *           &lt;element ref="{}ForEach"/>
 *           &lt;element ref="{}If"/>
 *           &lt;element ref="{}UpdateMaxStep"/>
 *           &lt;element ref="{}Update"/>
 *         &lt;/choice>
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
    "addTransitionOrForEachOrIf"
})
@XmlRootElement(name = "IfVariableNotInDcpSlaveDescription")
public class IfVariableNotInDcpSlaveDescription {

    @XmlElements({
        @XmlElement(name = "AddTransition", type = AddTransition.class),
        @XmlElement(name = "ForEach", type = ForEach.class),
        @XmlElement(name = "If", type = If.class),
        @XmlElement(name = "UpdateMaxStep", type = UpdateMaxStep.class),
        @XmlElement(name = "Update", type = Update.class)
    })
    protected List<Object> addTransitionOrForEachOrIf;

    /**
     * Gets the value of the addTransitionOrForEachOrIf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addTransitionOrForEachOrIf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddTransitionOrForEachOrIf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddTransition }
     * {@link ForEach }
     * {@link If }
     * {@link UpdateMaxStep }
     * {@link Update }
     * 
     * 
     */
    public List<Object> getAddTransitionOrForEachOrIf() {
        if (addTransitionOrForEachOrIf == null) {
            addTransitionOrForEachOrIf = new ArrayList<Object>();
        }
        return this.addTransitionOrForEachOrIf;
    }

}
