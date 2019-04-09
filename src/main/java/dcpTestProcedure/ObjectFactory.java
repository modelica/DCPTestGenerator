//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.04 um 04:38:57 PM CET 
//


package dcpTestProcedure;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dcpTestProcedure package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dcpTestProcedure
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendingPayloadField }
     * 
     */
    public SendingPayloadField createSendingPayloadField() {
        return new SendingPayloadField();
    }

    /**
     * Create an instance of {@link DcpTestProcedure }
     * 
     */
    public DcpTestProcedure createDcpTestProcedure() {
        return new DcpTestProcedure();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField }
     * 
     */
    public ReceivingPayloadField createReceivingPayloadField() {
        return new ReceivingPayloadField();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition }
     * 
     */
    public DcpTestProcedure.Transition createDcpTestProcedureTransition() {
        return new DcpTestProcedure.Transition();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Receiving }
     * 
     */
    public DcpTestProcedure.Transition.Receiving createDcpTestProcedureTransitionReceiving() {
        return new DcpTestProcedure.Transition.Receiving();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending }
     * 
     */
    public DcpTestProcedure.Transition.Sending createDcpTestProcedureTransitionSending() {
        return new DcpTestProcedure.Transition.Sending();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter createDcpTestProcedureTransitionSendingCFGParameter() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload createDcpTestProcedureTransitionSendingCFGParameterPayload() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols }
     * 
     */
    public DcpTestProcedure.TransportProtocols createDcpTestProcedureTransportProtocols() {
        return new DcpTestProcedure.TransportProtocols();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.TCPIPv4 }
     * 
     */
    public DcpTestProcedure.TransportProtocols.TCPIPv4 createDcpTestProcedureTransportProtocolsTCPIPv4() {
        return new DcpTestProcedure.TransportProtocols.TCPIPv4();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter }
     * 
     */
    public DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter createDcpTestProcedureTransportProtocolsTCPIPv4DATParameter() {
        return new DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput }
     * 
     */
    public DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput createDcpTestProcedureTransportProtocolsTCPIPv4DATInputOutput() {
        return new DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.Bluetooth }
     * 
     */
    public DcpTestProcedure.TransportProtocols.Bluetooth createDcpTestProcedureTransportProtocolsBluetooth() {
        return new DcpTestProcedure.TransportProtocols.Bluetooth();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.USB }
     * 
     */
    public DcpTestProcedure.TransportProtocols.USB createDcpTestProcedureTransportProtocolsUSB() {
        return new DcpTestProcedure.TransportProtocols.USB();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.UDPIPv4 }
     * 
     */
    public DcpTestProcedure.TransportProtocols.UDPIPv4 createDcpTestProcedureTransportProtocolsUDPIPv4() {
        return new DcpTestProcedure.TransportProtocols.UDPIPv4();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter }
     * 
     */
    public DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter createDcpTestProcedureTransportProtocolsUDPIPv4DATParameter() {
        return new DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput }
     * 
     */
    public DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput createDcpTestProcedureTransportProtocolsUDPIPv4DATInputOutput() {
        return new DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput();
    }

    /**
     * Create an instance of {@link SendingPayloadField.Int8 }
     * 
     */
    public SendingPayloadField.Int8 createSendingPayloadFieldInt8() {
        return new SendingPayloadField.Int8();
    }

    /**
     * Create an instance of {@link SendingPayloadField.Int16 }
     * 
     */
    public SendingPayloadField.Int16 createSendingPayloadFieldInt16() {
        return new SendingPayloadField.Int16();
    }

    /**
     * Create an instance of {@link SendingPayloadField.Int32 }
     * 
     */
    public SendingPayloadField.Int32 createSendingPayloadFieldInt32() {
        return new SendingPayloadField.Int32();
    }

    /**
     * Create an instance of {@link SendingPayloadField.Int64 }
     * 
     */
    public SendingPayloadField.Int64 createSendingPayloadFieldInt64() {
        return new SendingPayloadField.Int64();
    }

    /**
     * Create an instance of {@link SendingPayloadField.Uint8 }
     * 
     */
    public SendingPayloadField.Uint8 createSendingPayloadFieldUint8() {
        return new SendingPayloadField.Uint8();
    }

    /**
     * Create an instance of {@link SendingPayloadField.Uint16 }
     * 
     */
    public SendingPayloadField.Uint16 createSendingPayloadFieldUint16() {
        return new SendingPayloadField.Uint16();
    }

    /**
     * Create an instance of {@link SendingPayloadField.Uint32 }
     * 
     */
    public SendingPayloadField.Uint32 createSendingPayloadFieldUint32() {
        return new SendingPayloadField.Uint32();
    }

    /**
     * Create an instance of {@link SendingPayloadField.Uint64 }
     * 
     */
    public SendingPayloadField.Uint64 createSendingPayloadFieldUint64() {
        return new SendingPayloadField.Uint64();
    }

    /**
     * Create an instance of {@link SendingPayloadField.Float32 }
     * 
     */
    public SendingPayloadField.Float32 createSendingPayloadFieldFloat32() {
        return new SendingPayloadField.Float32();
    }

    /**
     * Create an instance of {@link SendingPayloadField.Float64 }
     * 
     */
    public SendingPayloadField.Float64 createSendingPayloadFieldFloat64() {
        return new SendingPayloadField.Float64();
    }

    /**
     * Create an instance of {@link SendingPayloadField.String }
     * 
     */
    public SendingPayloadField.String createSendingPayloadFieldString() {
        return new SendingPayloadField.String();
    }

    /**
     * Create an instance of {@link SendingPayloadField.Binary }
     * 
     */
    public SendingPayloadField.Binary createSendingPayloadFieldBinary() {
        return new SendingPayloadField.Binary();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField.Int8 }
     * 
     */
    public ReceivingPayloadField.Int8 createReceivingPayloadFieldInt8() {
        return new ReceivingPayloadField.Int8();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField.Int16 }
     * 
     */
    public ReceivingPayloadField.Int16 createReceivingPayloadFieldInt16() {
        return new ReceivingPayloadField.Int16();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField.Int32 }
     * 
     */
    public ReceivingPayloadField.Int32 createReceivingPayloadFieldInt32() {
        return new ReceivingPayloadField.Int32();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField.Int64 }
     * 
     */
    public ReceivingPayloadField.Int64 createReceivingPayloadFieldInt64() {
        return new ReceivingPayloadField.Int64();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField.Uint8 }
     * 
     */
    public ReceivingPayloadField.Uint8 createReceivingPayloadFieldUint8() {
        return new ReceivingPayloadField.Uint8();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField.Uint16 }
     * 
     */
    public ReceivingPayloadField.Uint16 createReceivingPayloadFieldUint16() {
        return new ReceivingPayloadField.Uint16();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField.Uint32 }
     * 
     */
    public ReceivingPayloadField.Uint32 createReceivingPayloadFieldUint32() {
        return new ReceivingPayloadField.Uint32();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField.Uint64 }
     * 
     */
    public ReceivingPayloadField.Uint64 createReceivingPayloadFieldUint64() {
        return new ReceivingPayloadField.Uint64();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField.Float32 }
     * 
     */
    public ReceivingPayloadField.Float32 createReceivingPayloadFieldFloat32() {
        return new ReceivingPayloadField.Float32();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField.Float64 }
     * 
     */
    public ReceivingPayloadField.Float64 createReceivingPayloadFieldFloat64() {
        return new ReceivingPayloadField.Float64();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField.String }
     * 
     */
    public ReceivingPayloadField.String createReceivingPayloadFieldString() {
        return new ReceivingPayloadField.String();
    }

    /**
     * Create an instance of {@link ReceivingPayloadField.Binary }
     * 
     */
    public ReceivingPayloadField.Binary createReceivingPayloadFieldBinary() {
        return new ReceivingPayloadField.Binary();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Receiving.RSPAck }
     * 
     */
    public DcpTestProcedure.Transition.Receiving.RSPAck createDcpTestProcedureTransitionReceivingRSPAck() {
        return new DcpTestProcedure.Transition.Receiving.RSPAck();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Receiving.RSPErrorAck }
     * 
     */
    public DcpTestProcedure.Transition.Receiving.RSPErrorAck createDcpTestProcedureTransitionReceivingRSPErrorAck() {
        return new DcpTestProcedure.Transition.Receiving.RSPErrorAck();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Receiving.RSPNack }
     * 
     */
    public DcpTestProcedure.Transition.Receiving.RSPNack createDcpTestProcedureTransitionReceivingRSPNack() {
        return new DcpTestProcedure.Transition.Receiving.RSPNack();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Receiving.RSPStateAck }
     * 
     */
    public DcpTestProcedure.Transition.Receiving.RSPStateAck createDcpTestProcedureTransitionReceivingRSPStateAck() {
        return new DcpTestProcedure.Transition.Receiving.RSPStateAck();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Receiving.NTFStateChanged }
     * 
     */
    public DcpTestProcedure.Transition.Receiving.NTFStateChanged createDcpTestProcedureTransitionReceivingNTFStateChanged() {
        return new DcpTestProcedure.Transition.Receiving.NTFStateChanged();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Receiving.RSPLogAck }
     * 
     */
    public DcpTestProcedure.Transition.Receiving.RSPLogAck createDcpTestProcedureTransitionReceivingRSPLogAck() {
        return new DcpTestProcedure.Transition.Receiving.RSPLogAck();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Receiving.NTFLog }
     * 
     */
    public DcpTestProcedure.Transition.Receiving.NTFLog createDcpTestProcedureTransitionReceivingNTFLog() {
        return new DcpTestProcedure.Transition.Receiving.NTFLog();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Receiving.DATInputOutput }
     * 
     */
    public DcpTestProcedure.Transition.Receiving.DATInputOutput createDcpTestProcedureTransitionReceivingDATInputOutput() {
        return new DcpTestProcedure.Transition.Receiving.DATInputOutput();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Receiving.DATParameter }
     * 
     */
    public DcpTestProcedure.Transition.Receiving.DATParameter createDcpTestProcedureTransitionReceivingDATParameter() {
        return new DcpTestProcedure.Transition.Receiving.DATParameter();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.ClockTime }
     * 
     */
    public DcpTestProcedure.Transition.Sending.ClockTime createDcpTestProcedureTransitionSendingClockTime() {
        return new DcpTestProcedure.Transition.Sending.ClockTime();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGTimeRes }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGTimeRes createDcpTestProcedureTransitionSendingCFGTimeRes() {
        return new DcpTestProcedure.Transition.Sending.CFGTimeRes();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGSteps }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGSteps createDcpTestProcedureTransitionSendingCFGSteps() {
        return new DcpTestProcedure.Transition.Sending.CFGSteps();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGInput }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGInput createDcpTestProcedureTransitionSendingCFGInput() {
        return new DcpTestProcedure.Transition.Sending.CFGInput();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGOutput }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGOutput createDcpTestProcedureTransitionSendingCFGOutput() {
        return new DcpTestProcedure.Transition.Sending.CFGOutput();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformation }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformation createDcpTestProcedureTransitionSendingCFGSourceNetworkInformation() {
        return new DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformation();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUDPIPv4 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUDPIPv4 createDcpTestProcedureTransitionSendingCFGSourceNetworkInformationUDPIPv4() {
        return new DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUDPIPv4();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUSB }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUSB createDcpTestProcedureTransitionSendingCFGSourceNetworkInformationUSB() {
        return new DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationUSB();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationBluetooth }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationBluetooth createDcpTestProcedureTransitionSendingCFGSourceNetworkInformationBluetooth() {
        return new DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationBluetooth();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationTCPIPv4 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationTCPIPv4 createDcpTestProcedureTransitionSendingCFGSourceNetworkInformationTCPIPv4() {
        return new DcpTestProcedure.Transition.Sending.CFGSourceNetworkInformationTCPIPv4();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformation }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformation createDcpTestProcedureTransitionSendingCFGTargetNetworkInformation() {
        return new DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformation();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUDPIPv4 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUDPIPv4 createDcpTestProcedureTransitionSendingCFGTargetNetworkInformationUDPIPv4() {
        return new DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUDPIPv4();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUSB }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUSB createDcpTestProcedureTransitionSendingCFGTargetNetworkInformationUSB() {
        return new DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationUSB();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationBluetooth }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationBluetooth createDcpTestProcedureTransitionSendingCFGTargetNetworkInformationBluetooth() {
        return new DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationBluetooth();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationTCPIPv4 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationTCPIPv4 createDcpTestProcedureTransitionSendingCFGTargetNetworkInformationTCPIPv4() {
        return new DcpTestProcedure.Transition.Sending.CFGTargetNetworkInformationTCPIPv4();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGClear }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGClear createDcpTestProcedureTransitionSendingCFGClear() {
        return new DcpTestProcedure.Transition.Sending.CFGClear();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGTunableParameter }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGTunableParameter createDcpTestProcedureTransitionSendingCFGTunableParameter() {
        return new DcpTestProcedure.Transition.Sending.CFGTunableParameter();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformation }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParamNetworkInformation createDcpTestProcedureTransitionSendingCFGParamNetworkInformation() {
        return new DcpTestProcedure.Transition.Sending.CFGParamNetworkInformation();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUDPIPv4 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUDPIPv4 createDcpTestProcedureTransitionSendingCFGParamNetworkInformationUDPIPv4() {
        return new DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUDPIPv4();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUSB }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUSB createDcpTestProcedureTransitionSendingCFGParamNetworkInformationUSB() {
        return new DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationUSB();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationBluetooth }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationBluetooth createDcpTestProcedureTransitionSendingCFGParamNetworkInformationBluetooth() {
        return new DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationBluetooth();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationTCPIPv4 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationTCPIPv4 createDcpTestProcedureTransitionSendingCFGParamNetworkInformationTCPIPv4() {
        return new DcpTestProcedure.Transition.Sending.CFGParamNetworkInformationTCPIPv4();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGLogging }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGLogging createDcpTestProcedureTransitionSendingCFGLogging() {
        return new DcpTestProcedure.Transition.Sending.CFGLogging();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGScope }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGScope createDcpTestProcedureTransitionSendingCFGScope() {
        return new DcpTestProcedure.Transition.Sending.CFGScope();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.STCRegister }
     * 
     */
    public DcpTestProcedure.Transition.Sending.STCRegister createDcpTestProcedureTransitionSendingSTCRegister() {
        return new DcpTestProcedure.Transition.Sending.STCRegister();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.STCDeregister }
     * 
     */
    public DcpTestProcedure.Transition.Sending.STCDeregister createDcpTestProcedureTransitionSendingSTCDeregister() {
        return new DcpTestProcedure.Transition.Sending.STCDeregister();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.STCPrepare }
     * 
     */
    public DcpTestProcedure.Transition.Sending.STCPrepare createDcpTestProcedureTransitionSendingSTCPrepare() {
        return new DcpTestProcedure.Transition.Sending.STCPrepare();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.STCConfigure }
     * 
     */
    public DcpTestProcedure.Transition.Sending.STCConfigure createDcpTestProcedureTransitionSendingSTCConfigure() {
        return new DcpTestProcedure.Transition.Sending.STCConfigure();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.STCInitialize }
     * 
     */
    public DcpTestProcedure.Transition.Sending.STCInitialize createDcpTestProcedureTransitionSendingSTCInitialize() {
        return new DcpTestProcedure.Transition.Sending.STCInitialize();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.STCRun }
     * 
     */
    public DcpTestProcedure.Transition.Sending.STCRun createDcpTestProcedureTransitionSendingSTCRun() {
        return new DcpTestProcedure.Transition.Sending.STCRun();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.STCDoStep }
     * 
     */
    public DcpTestProcedure.Transition.Sending.STCDoStep createDcpTestProcedureTransitionSendingSTCDoStep() {
        return new DcpTestProcedure.Transition.Sending.STCDoStep();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.STCSendOutputs }
     * 
     */
    public DcpTestProcedure.Transition.Sending.STCSendOutputs createDcpTestProcedureTransitionSendingSTCSendOutputs() {
        return new DcpTestProcedure.Transition.Sending.STCSendOutputs();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.STCStop }
     * 
     */
    public DcpTestProcedure.Transition.Sending.STCStop createDcpTestProcedureTransitionSendingSTCStop() {
        return new DcpTestProcedure.Transition.Sending.STCStop();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.STCReset }
     * 
     */
    public DcpTestProcedure.Transition.Sending.STCReset createDcpTestProcedureTransitionSendingSTCReset() {
        return new DcpTestProcedure.Transition.Sending.STCReset();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.INFState }
     * 
     */
    public DcpTestProcedure.Transition.Sending.INFState createDcpTestProcedureTransitionSendingINFState() {
        return new DcpTestProcedure.Transition.Sending.INFState();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.INFError }
     * 
     */
    public DcpTestProcedure.Transition.Sending.INFError createDcpTestProcedureTransitionSendingINFError() {
        return new DcpTestProcedure.Transition.Sending.INFError();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.INFLog }
     * 
     */
    public DcpTestProcedure.Transition.Sending.INFLog createDcpTestProcedureTransitionSendingINFLog() {
        return new DcpTestProcedure.Transition.Sending.INFLog();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.DATInputOutput }
     * 
     */
    public DcpTestProcedure.Transition.Sending.DATInputOutput createDcpTestProcedureTransitionSendingDATInputOutput() {
        return new DcpTestProcedure.Transition.Sending.DATInputOutput();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.DATParameter }
     * 
     */
    public DcpTestProcedure.Transition.Sending.DATParameter createDcpTestProcedureTransitionSendingDATParameter() {
        return new DcpTestProcedure.Transition.Sending.DATParameter();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int8 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int8 createDcpTestProcedureTransitionSendingCFGParameterPayloadInt8() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int8();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16 createDcpTestProcedureTransitionSendingCFGParameterPayloadInt16() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32 createDcpTestProcedureTransitionSendingCFGParameterPayloadInt32() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64 createDcpTestProcedureTransitionSendingCFGParameterPayloadInt64() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 createDcpTestProcedureTransitionSendingCFGParameterPayloadUint8() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16 createDcpTestProcedureTransitionSendingCFGParameterPayloadUint16() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32 createDcpTestProcedureTransitionSendingCFGParameterPayloadUint32() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64 createDcpTestProcedureTransitionSendingCFGParameterPayloadUint64() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32 createDcpTestProcedureTransitionSendingCFGParameterPayloadFloat32() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64 }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64 createDcpTestProcedureTransitionSendingCFGParameterPayloadFloat64() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.String }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.String createDcpTestProcedureTransitionSendingCFGParameterPayloadString() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.String();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Binary }
     * 
     */
    public DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Binary createDcpTestProcedureTransitionSendingCFGParameterPayloadBinary() {
        return new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Binary();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .Control }
     * 
     */
    public DcpTestProcedure.TransportProtocols.TCPIPv4 .Control createDcpTestProcedureTransportProtocolsTCPIPv4Control() {
        return new DcpTestProcedure.TransportProtocols.TCPIPv4 .Control();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePortRange }
     * 
     */
    public DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePortRange createDcpTestProcedureTransportProtocolsTCPIPv4DATParameterAvailablePortRange() {
        return new DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePortRange();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePort }
     * 
     */
    public DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePort createDcpTestProcedureTransportProtocolsTCPIPv4DATParameterAvailablePort() {
        return new DcpTestProcedure.TransportProtocols.TCPIPv4 .DATParameter.AvailablePort();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePortRange }
     * 
     */
    public DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePortRange createDcpTestProcedureTransportProtocolsTCPIPv4DATInputOutputAvailablePortRange() {
        return new DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePortRange();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePort }
     * 
     */
    public DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePort createDcpTestProcedureTransportProtocolsTCPIPv4DATInputOutputAvailablePort() {
        return new DcpTestProcedure.TransportProtocols.TCPIPv4 .DATInputOutput.AvailablePort();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.Bluetooth.Address }
     * 
     */
    public DcpTestProcedure.TransportProtocols.Bluetooth.Address createDcpTestProcedureTransportProtocolsBluetoothAddress() {
        return new DcpTestProcedure.TransportProtocols.Bluetooth.Address();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.USB.DataPipe }
     * 
     */
    public DcpTestProcedure.TransportProtocols.USB.DataPipe createDcpTestProcedureTransportProtocolsUSBDataPipe() {
        return new DcpTestProcedure.TransportProtocols.USB.DataPipe();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .Control }
     * 
     */
    public DcpTestProcedure.TransportProtocols.UDPIPv4 .Control createDcpTestProcedureTransportProtocolsUDPIPv4Control() {
        return new DcpTestProcedure.TransportProtocols.UDPIPv4 .Control();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePortRange }
     * 
     */
    public DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePortRange createDcpTestProcedureTransportProtocolsUDPIPv4DATParameterAvailablePortRange() {
        return new DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePortRange();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePort }
     * 
     */
    public DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePort createDcpTestProcedureTransportProtocolsUDPIPv4DATParameterAvailablePort() {
        return new DcpTestProcedure.TransportProtocols.UDPIPv4 .DATParameter.AvailablePort();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePortRange }
     * 
     */
    public DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePortRange createDcpTestProcedureTransportProtocolsUDPIPv4DATInputOutputAvailablePortRange() {
        return new DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePortRange();
    }

    /**
     * Create an instance of {@link DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePort }
     * 
     */
    public DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePort createDcpTestProcedureTransportProtocolsUDPIPv4DATInputOutputAvailablePort() {
        return new DcpTestProcedure.TransportProtocols.UDPIPv4 .DATInputOutput.AvailablePort();
    }

}
