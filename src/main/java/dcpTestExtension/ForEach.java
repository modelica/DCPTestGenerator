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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
 *         &lt;element name="Set">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="DcpStates" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="DcpOpModes" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="DcpTransportProtocols" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="Slave.Outputs" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="Slave.Inputs" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="Slave.Parameters" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="Slave.TunableParameters" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="IntegerRange">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Test.steps" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="Test.transitions" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="Test.successor">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="stepVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;choice>
 *             &lt;element ref="{}AddTransition"/>
 *             &lt;element ref="{}IfVariableNotInDcpSlaveDescription"/>
 *             &lt;element ref="{}If"/>
 *             &lt;element ref="{}ForEach"/>
 *             &lt;element ref="{}UpdateMaxStep"/>
 *             &lt;element ref="{}Update"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="variableName" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "set",
    "addTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf"
})
@XmlRootElement(name = "ForEach")
public class ForEach {

    @XmlElement(name = "Set", required = true)
    protected ForEach.Set set;
    @XmlElements({
        @XmlElement(name = "AddTransition", type = AddTransition.class),
        @XmlElement(name = "IfVariableNotInDcpSlaveDescription", type = IfVariableNotInDcpSlaveDescription.class),
        @XmlElement(name = "If", type = If.class),
        @XmlElement(name = "ForEach", type = ForEach.class),
        @XmlElement(name = "UpdateMaxStep", type = UpdateMaxStep.class),
        @XmlElement(name = "Update", type = Update.class)
    })
    protected List<Object> addTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf;
    @XmlAttribute(name = "variableName", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String variableName;

    /**
     * Ruft den Wert der set-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ForEach.Set }
     *     
     */
    public ForEach.Set getSet() {
        return set;
    }

    /**
     * Legt den Wert der set-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ForEach.Set }
     *     
     */
    public void setSet(ForEach.Set value) {
        this.set = value;
    }

    /**
     * Gets the value of the addTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddTransition }
     * {@link IfVariableNotInDcpSlaveDescription }
     * {@link If }
     * {@link ForEach }
     * {@link UpdateMaxStep }
     * {@link Update }
     * 
     * 
     */
    public List<Object> getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf() {
        if (addTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf == null) {
            addTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf = new ArrayList<Object>();
        }
        return this.addTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf;
    }

    /**
     * Ruft den Wert der variableName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * Legt den Wert der variableName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableName(String value) {
        this.variableName = value;
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
     *         &lt;element name="DcpStates" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="DcpOpModes" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="DcpTransportProtocols" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="Slave.Outputs" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="Slave.Inputs" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="Slave.Parameters" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="Slave.TunableParameters" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="IntegerRange">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Test.steps" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="Test.transitions" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="Test.successor">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="stepVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "dcpStates",
        "dcpOpModes",
        "dcpTransportProtocols",
        "slaveOutputs",
        "slaveInputs",
        "slaveParameters",
        "slaveTunableParameters",
        "integerRange",
        "testSteps",
        "testTransitions",
        "testSuccessor"
    })
    public static class Set {

        @XmlElement(name = "DcpStates")
        protected Object dcpStates;
        @XmlElement(name = "DcpOpModes")
        protected Object dcpOpModes;
        @XmlElement(name = "DcpTransportProtocols")
        protected Object dcpTransportProtocols;
        @XmlElement(name = "Slave.Outputs")
        protected Object slaveOutputs;
        @XmlElement(name = "Slave.Inputs")
        protected Object slaveInputs;
        @XmlElement(name = "Slave.Parameters")
        protected Object slaveParameters;
        @XmlElement(name = "Slave.TunableParameters")
        protected Object slaveTunableParameters;
        @XmlElement(name = "IntegerRange")
        protected ForEach.Set.IntegerRange integerRange;
        @XmlElement(name = "Test.steps")
        protected Object testSteps;
        @XmlElement(name = "Test.transitions")
        protected Object testTransitions;
        @XmlElement(name = "Test.successor")
        protected ForEach.Set.TestSuccessor testSuccessor;

        /**
         * Ruft den Wert der dcpStates-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDcpStates() {
            return dcpStates;
        }

        /**
         * Legt den Wert der dcpStates-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDcpStates(Object value) {
            this.dcpStates = value;
        }

        /**
         * Ruft den Wert der dcpOpModes-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDcpOpModes() {
            return dcpOpModes;
        }

        /**
         * Legt den Wert der dcpOpModes-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDcpOpModes(Object value) {
            this.dcpOpModes = value;
        }

        /**
         * Ruft den Wert der dcpTransportProtocols-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDcpTransportProtocols() {
            return dcpTransportProtocols;
        }

        /**
         * Legt den Wert der dcpTransportProtocols-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDcpTransportProtocols(Object value) {
            this.dcpTransportProtocols = value;
        }

        /**
         * Ruft den Wert der slaveOutputs-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSlaveOutputs() {
            return slaveOutputs;
        }

        /**
         * Legt den Wert der slaveOutputs-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSlaveOutputs(Object value) {
            this.slaveOutputs = value;
        }

        /**
         * Ruft den Wert der slaveInputs-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSlaveInputs() {
            return slaveInputs;
        }

        /**
         * Legt den Wert der slaveInputs-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSlaveInputs(Object value) {
            this.slaveInputs = value;
        }

        /**
         * Ruft den Wert der slaveParameters-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSlaveParameters() {
            return slaveParameters;
        }

        /**
         * Legt den Wert der slaveParameters-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSlaveParameters(Object value) {
            this.slaveParameters = value;
        }

        /**
         * Ruft den Wert der slaveTunableParameters-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSlaveTunableParameters() {
            return slaveTunableParameters;
        }

        /**
         * Legt den Wert der slaveTunableParameters-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSlaveTunableParameters(Object value) {
            this.slaveTunableParameters = value;
        }

        /**
         * Ruft den Wert der integerRange-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ForEach.Set.IntegerRange }
         *     
         */
        public ForEach.Set.IntegerRange getIntegerRange() {
            return integerRange;
        }

        /**
         * Legt den Wert der integerRange-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ForEach.Set.IntegerRange }
         *     
         */
        public void setIntegerRange(ForEach.Set.IntegerRange value) {
            this.integerRange = value;
        }

        /**
         * Ruft den Wert der testSteps-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTestSteps() {
            return testSteps;
        }

        /**
         * Legt den Wert der testSteps-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTestSteps(Object value) {
            this.testSteps = value;
        }

        /**
         * Ruft den Wert der testTransitions-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTestTransitions() {
            return testTransitions;
        }

        /**
         * Legt den Wert der testTransitions-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTestTransitions(Object value) {
            this.testTransitions = value;
        }

        /**
         * Ruft den Wert der testSuccessor-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ForEach.Set.TestSuccessor }
         *     
         */
        public ForEach.Set.TestSuccessor getTestSuccessor() {
            return testSuccessor;
        }

        /**
         * Legt den Wert der testSuccessor-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ForEach.Set.TestSuccessor }
         *     
         */
        public void setTestSuccessor(ForEach.Set.TestSuccessor value) {
            this.testSuccessor = value;
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class IntegerRange {

            @XmlAttribute(name = "min")
            protected Integer min;
            @XmlAttribute(name = "max")
            protected Integer max;

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
         *       &lt;attribute name="stepVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TestSuccessor {

            @XmlAttribute(name = "stepVariable")
            protected String stepVariable;

            /**
             * Ruft den Wert der stepVariable-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStepVariable() {
                return stepVariable;
            }

            /**
             * Legt den Wert der stepVariable-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStepVariable(String value) {
                this.stepVariable = value;
            }

        }

    }

}
