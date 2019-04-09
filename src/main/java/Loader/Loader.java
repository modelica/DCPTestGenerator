package Loader;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXB;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

import dcpDescription.DcpSlaveDescription;
import dcpTestExtension.DcpTestSuiteExtension;
import dcpTestProcedure.DcpTestProcedure;
import main.Launcher;

public class Loader {

	public static DcpTestSuiteExtension loadTestTransformationFromXml(String xmlPath, boolean validateAgainstXsd)
			throws Exception {

		if (validateAgainstXsd) {
			boolean validateSuccess = validateXMLSchema(xmlPath, Loader.class.getClassLoader().getResource("xsd/DCP-Testsuite-extension.xsd").getPath());
			if (!validateSuccess) {

				throw new Exception("Transformation XML is not valid !");
			}
		}

		byte[] encoded = null;
		try {
			encoded = Files.readAllBytes(Paths.get(xmlPath));
		} catch (IOException e) {
			System.err.println("Error while parsing Transformation XML file");
			e.printStackTrace();
		}
		String fileContent = new String(encoded, Charset.defaultCharset());
		DcpTestSuiteExtension aciTestSuiteEx = JAXB.unmarshal(new StringReader(fileContent),
				DcpTestSuiteExtension.class);
		if (Launcher.DEBUG) {
			System.out.println("Extension loaded");
		}
		return aciTestSuiteEx;

	}

	public static DcpTestProcedure loadTestTemplateFromXml(String xmlPath, boolean validateAgainstXsd)
			throws Exception {

		if (validateAgainstXsd) {
			boolean validateSuccess = validateXMLSchema(xmlPath, Loader.class.getClassLoader().getResource("xsd/DcpTestProcedure.xsd").getPath());
			if (!validateSuccess) {

				throw new Exception("Test Template XML is not valid !");
			}
		}

		byte[] encoded = null;
		try {
			encoded = Files.readAllBytes(Paths.get(xmlPath));
		} catch (IOException e) {
			System.err.println("Error while parsing Test Template XML file");
			e.printStackTrace();
		}
		String fileContent = new String(encoded, Charset.defaultCharset());
		DcpTestProcedure aciTestProcedure = JAXB.unmarshal(new StringReader(fileContent), DcpTestProcedure.class);
		if (Launcher.DEBUG) {
			System.out.println("Template loaded");
		}
		return aciTestProcedure;

	}

	public static DcpSlaveDescription loadSlaveDescriptionFromXml(String xmlPath, boolean validateAgainstXsd)
			throws Exception {

		if (validateAgainstXsd) {
			boolean validateSuccess = validateXMLSchema(xmlPath,
					Loader.class.getClassLoader().getResource("xsd/dcpSlaveDescription.xsd").getPath());
			if (!validateSuccess) {

				throw new Exception("Slave Description XML is not valid !");
			}
		}

		byte[] encoded = null;
		try {
			encoded = Files.readAllBytes(Paths.get(xmlPath));
		} catch (IOException e) {
			System.err.println("Error while parsing Slave Description XML file");
			e.printStackTrace();
		}
		String fileContent = new String(encoded, Charset.defaultCharset());
		DcpSlaveDescription acuDescription = JAXB.unmarshal(new StringReader(fileContent), DcpSlaveDescription.class);
		if (Launcher.DEBUG) {
			System.out.println("Slave Description was loaded.");
		}
		return acuDescription;

	}

	public static boolean validateXMLSchema(String xmlFile, String schemaFile) {
		if (Launcher.DEBUG) {
			System.out.println("Checking : " + xmlFile);
		}
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		try {
			Schema schema = schemaFactory.newSchema(new File(schemaFile));

			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new File(xmlFile)));
			return true;
		} catch (SAXException | IOException e) {
			e.printStackTrace();
			return false;
		}

	}

}
