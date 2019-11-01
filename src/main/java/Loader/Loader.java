package Loader;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
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

	public static DcpTestSuiteExtension loadTestTransformationFromXml(URL xmlPath, boolean validateAgainstXsd)
			throws Exception {

		if (validateAgainstXsd) {
			boolean validateSuccess = validateXMLSchema(xmlPath, Loader.class.getClassLoader().getResource("xsd/DCP-Testsuite-extension.xsd"));
			if (!validateSuccess) {

				throw new Exception("Transformation XML is not valid !");
			}
		}

		DcpTestSuiteExtension aciTestSuiteEx = JAXB.unmarshal(xmlPath.openStream(),
				DcpTestSuiteExtension.class);
		if (Launcher.DEBUG) {
			System.out.println("Extension loaded");
		}
		return aciTestSuiteEx;

	}

	public static DcpTestProcedure loadTestTemplateFromXml(URL xmlPath, boolean validateAgainstXsd)
			throws Exception {

		if (validateAgainstXsd) {
			boolean validateSuccess = validateXMLSchema(xmlPath, Loader.class.getClassLoader().getResource("xsd/DcpTestProcedure.xsd"));
			if (!validateSuccess) {

				throw new Exception("Test Template XML is not valid !");
			}
		}

		DcpTestProcedure aciTestProcedure = JAXB.unmarshal(xmlPath.openStream(), DcpTestProcedure.class);
		if (Launcher.DEBUG) {
			System.out.println("Template loaded");
		}
		return aciTestProcedure;

	}

	public static DcpSlaveDescription loadSlaveDescriptionFromXml(URL xmlPath, boolean validateAgainstXsd)
			throws Exception {

		if (validateAgainstXsd) {
			boolean validateSuccess = validateXMLSchema(xmlPath,
					Loader.class.getClassLoader().getResource("xsd/dcpSlaveDescription.xsd"));
			if (!validateSuccess) {

				throw new Exception("Slave Description XML is not valid !");
			}
		}

		DcpSlaveDescription acuDescription = JAXB.unmarshal(xmlPath.openStream(), DcpSlaveDescription.class);
		if (Launcher.DEBUG) {
			System.out.println("Slave Description was loaded.");
		}
		return acuDescription;

	}

	public static boolean validateXMLSchema(URL xmlFile, URL schemaUrl) {
		if (Launcher.DEBUG) {
			System.out.println("Checking : " + xmlFile);
		}
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		try {
			Schema schema = schemaFactory.newSchema(schemaUrl);

			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(xmlFile.openStream()));
			return true;
		} catch (SAXException | IOException e) {
			e.printStackTrace();
			return false;
		}

	}

}
