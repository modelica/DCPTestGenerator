package main;

import java.io.File;

import javax.net.ssl.HostnameVerifier;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import Loader.Loader;
import dcpDescription.DcpSlaveDescription;
import dcpTestExtension.DcpTestSuiteExtension;
import dcpTestProcedure.DcpTestProcedure;
import testTransformer.TestTransformer;

/**
 * This class starts the Template Parser program.
 * 
 * 
 *
 */
public class Launcher {
	static public final boolean DEBUG = false;


	public static void main(String[] args) {

		// command line arguments

		Options options = new Options();
		
		
		options.addOption(OptionBuilder.
				hasArg().
				withDescription("Path to dcpx file of the DCP slave which shall be tested.").
				isRequired(true).
				create("dcpx"));

		options.addOption(OptionBuilder.
				hasArg().
				withDescription("Path to extension file, with which the template will be extended. If not set the template will be determined by the other arguments automatically.").
				create("extension"));
		
		
		options.addOption(OptionBuilder.
				hasArg().
				withDescription("Basic Template which will be extended. If not set the template will be determined by the other arguments automatically.").
				create("template"));
		
		options.addOption(OptionBuilder.
				hasArg().
				withDescription("File where the generated test procedure will be saved. Default value: File name based on slave name and choosed options.").
				create("out"));
		
		OptionGroup transportProtocolOptions = new OptionGroup();
		transportProtocolOptions.setRequired(true);
		transportProtocolOptions.addOption(new Option("UDP", "Generate test procedure for UDP/IPv4 as transport protocol"));
		transportProtocolOptions.addOption(new Option("TCP", "Generate test procedure for TCP/IPv4 as transport protocol"));		
		options.addOptionGroup(transportProtocolOptions);
		
		options.addOption(OptionBuilder.withLongOpt("port").
				hasArg().
				withDescription("UDP/TCP port of the DCP slave. Needs to be set if UDP/TCP is selected and the slave description does not specify a port for UDP/TCP .").
				withType(Integer.class).
				create());
		options.addOption(OptionBuilder.withLongOpt("host").
				hasArg().
				withDescription("Host of the DCP slave. Needs to be set if UDP/TCP  is selected and the slave description does not specify a IP address for UDP/TCP .").
				create());
		
		options.addOption(OptionBuilder.withLongOpt("Tester.port").
				hasArg().
				withDescription("UDP/TCP port of the DCP tester. Default value: 32000").
				withType(Integer.class).
				create());
		options.addOption(OptionBuilder.withLongOpt("Tester.host").
				hasArg().
				withDescription("Host of the DCP tester. Default value: 127.0.0.1").
				create());
		
		
		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd;

		try {
			cmd = parser.parse(options, args);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			formatter.printHelp("DCP-Tester", options);

			System.exit(1);
			return;
		}

		String dcpx = cmd.getOptionValue("dcpx");
		String extension = cmd.getOptionValue("extension");
		String template = cmd.getOptionValue("template");
		boolean udp = cmd.hasOption("UDP");
		boolean tcp = cmd.hasOption("TCP");
		
		String outputPath = cmd.getOptionValue("out");
		
		String testerIp = "127.0.0.1";
		String testerPort = "25000";
		testerIp = cmd.getOptionValue("Tester.host", "127.0.0.1");
		testerPort = cmd.getOptionValue("Tester.port", "25000");
		String slavePort = cmd.getOptionValue("port");
		String slaveHost = cmd.getOptionValue("host");
	
		
		
		
		
		DcpSlaveDescription slaveDescription = null;
		DcpTestProcedure testTemplate = null;
		DcpTestSuiteExtension testExtension = null;

		ClassLoader classLoader = Launcher.class.getClassLoader();
		
		
		try {
			slaveDescription = Loader.loadSlaveDescriptionFromXml(dcpx, true);
		} catch (Exception e) {
			System.err.println("Error while loading dcpx: " + e.getMessage());
			System.exit(1);
		}
		
		if(udp) {
			if(slaveDescription.getTransportProtocols().getUDPIPv4() == null || 
					slaveDescription.getTransportProtocols().getUDPIPv4().getControl() == null){
				System.err.println("Error: UDP is selected to test, but the slave do not support UDP/Ipv4.");
				System.exit(1);
			}
			
			if(slaveDescription.getTransportProtocols().getUDPIPv4().getControl().getHost() == null && 
					(slaveHost == null || slaveHost.trim().length() == 0)){
				System.err.println("Error: UDP is selected but no host is specified. Use --host to specify the host of the DCP slave");
				System.exit(1);
			}
			
			if(slaveDescription.getTransportProtocols().getUDPIPv4().getControl().getPort() == null && 
					(slavePort == null || slavePort.trim().length() == 0)){
				System.err.println("Error: UDP is selected but no port is specified. Use --port to specify the UDP port of the DCP slave");
				System.exit(1);
			}
			
			if(slavePort == null) {
				slavePort = "" + slaveDescription.getTransportProtocols().getUDPIPv4().getControl().getPort();
			} else {
				try {
					int port = Integer.parseInt(slavePort);
					if(port < 0 || port > 65535) {
						System.err.println("Error: UDP port is out of range.");
						System.exit(1);
					}
				} catch (NumberFormatException e) {
					System.err.println("Error: UDP port is not a number.");
					System.exit(1);
				}
			}
		}
		if(tcp) {
			if(slaveDescription.getTransportProtocols().getTCPIPv4() == null || 
					slaveDescription.getTransportProtocols().getTCPIPv4().getControl() == null){
				System.err.println("Error: TCP is selected to test, but the slave do not support TCP/Ipv4.");
				System.exit(1);
			}
			
			if(slaveDescription.getTransportProtocols().getTCPIPv4().getControl().getHost() == null && 
					(slavePort == null || slavePort.trim().length() == 0)){
				System.err.println("Error: TCP is selected but no host is specified. Use --host to specify the host of the TCP slave");
				System.exit(1);
			}
			
			if(slaveDescription.getTransportProtocols().getTCPIPv4().getControl().getPort() == null && 
					(slavePort == null || slavePort.trim().length() == 0)){
				System.err.println("Error: TCP is selected but no port is specified. Use --port to specify the TCP port of the DCP slave");
				System.exit(1);
			}
			
			if(slavePort == null) {
				slavePort = "" + slaveDescription.getTransportProtocols().getTCPIPv4().getControl().getPort();
			} else {
				try {
					int port = Integer.parseInt(slavePort);
					if(port < 0 || port > 65535) {
						System.err.println("Error: TCP port is out of range.");
						System.exit(1);
					}
				} catch (NumberFormatException e) {
					System.err.println("Error: TCP port is not a number.");
					System.exit(1);
				}
			}
		}
		
		if(template == null) {
			
			String path = "templates/predefined_template";
			
			if(slaveDescription.getCapabilityFlags().isCanHandleReset()) {
				path += "_withReset";
			} else {
				path += "_withoutReset";
			}
			
			template = classLoader.getResource(path + ".xml").getPath();
		}
		
		try {
			testTemplate = Loader.loadTestTemplateFromXml(template, true);
		} catch (Exception e) {
			System.err.println("Error while loading template: " + e.getMessage());
			System.exit(1);
		}
		
		if(extension == null) {
			String extensionPath = "extensions/predefined_extension";

			if(slaveDescription.getOpMode().getSoftRealTime() != null) {
				extensionPath += "_SRT";
			} else {
				System.err.println("Error: Currently only the generation of test files with operation mode SRT is supported, but slave does not support SRT.");
				System.exit(1);
			}
			if(udp) {
				extensionPath += "_UDP";
			} else if(tcp) {
				extensionPath += "_TCP";
			}
			
			extension = classLoader.getResource(extensionPath + ".xml").getPath();
		}
		
		try {
			testExtension = Loader.loadTestTransformationFromXml(extension, true);
		} catch (Exception e) {
			System.err.println("Error while loading extension: " + e.getMessage());
			System.exit(1);
		}
		TestTransformer testTransformer = new TestTransformer(slaveDescription, testTemplate, testExtension, testerIp, testerPort, slavePort, slaveHost);
		boolean verboseOut = false;
		if(outputPath == null) {
			
			outputPath = "DCP-Test[";
			if(slaveDescription.getDcpSlaveName() != null) {
				outputPath += "dcpSlaveName=" + slaveDescription.getDcpSlaveName() + ", ";
			} else {
				outputPath += "uuid=" + slaveDescription.getUuid() + ", ";
			}
			String[] templateParts = template.split("/");
			if(templateParts.length == 0) {
				templateParts = template.split("\\");
				if(templateParts.length == 0) {
					templateParts = new String[] {template};
				}
			}
			outputPath += "template=" + templateParts[templateParts.length - 1] + ", ";
			String[] extensionParts = extension.split("/");
			if(extensionParts.length == 0) {
				extensionParts = extension.split("\\");
				if(extensionParts.length == 0) {
					extensionParts = new String[] {extension};
				}
			}
			outputPath += "extension=" + extensionParts[extensionParts.length - 1] + "]";
			if(!outputPath.endsWith(".xml")) {
				outputPath += ".xml";
			}
			verboseOut = true;
		} 
		testTransformer.generateFinalTestProcedure(outputPath, verboseOut);
	}

	static int currentIndex = -1;

	static synchronized int getNextFileIndex() {
		currentIndex++;
		return currentIndex;
	}

}
