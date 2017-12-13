package wsdl;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.wsdl.Definition;
import javax.wsdl.WSDLException;
import javax.wsdl.xml.WSDLReader;


import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.ibm.wsdl.xml.WSDLReaderImpl;


public class WSDLGeneratorTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws XMLParseException 
	 * @throws WSDLException 
	 */
	public static void main(String[] args) throws Exception {

		Definition wsdldefinition = null;
		WSDLDefinition wsdlDefinition = null;
		WSDLReader reader=null;
		
		String zipFileExtractedDir="D:\\ProcessOrder_rev1.0";
		String parentFilename="validatepaymentprocess_client_ep.wsdl";
		
		reader = new  WSDLReaderImpl();
		
		File wsdlFileName = new File(zipFileExtractedDir+File.separator+parentFilename);
		InputStream entityStream=new FileInputStream(wsdlFileName);
		InputSource inputSource=new InputSource(entityStream);
		
		WSDLLocatorTest wsdlLocator = new WSDLLocatorTest(zipFileExtractedDir+File.separator   ,    inputSource);
		wsdldefinition = reader.readWSDL(wsdlLocator);
		wsdlDefinition = new WSDLDefinition();
		wsdlDefinition.setDefinition(wsdldefinition);
		
		System.out.println("******************************************************************************** ********************");
		System.out.println("*******************************   Printing Parent ********************");
		System.out.println(new String(wsdlDefinition.getArtifactDetail()));
		
	}

}

