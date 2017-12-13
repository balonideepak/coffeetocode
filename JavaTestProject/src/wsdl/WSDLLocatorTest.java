package wsdl;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.wsdl.xml.WSDLLocator;

import org.xml.sax.InputSource;


public class WSDLLocatorTest implements WSDLLocator {

	private String baseURI;

	private String lastimport = "";

	private InputSource inputsource = null;

	public WSDLLocatorTest(String baseURI, InputSource inputsource) {
		this.inputsource = inputsource;
		this.baseURI = baseURI;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.wsdl.xml.WSDLLocator#getBaseInputSource()
	 */
	public InputSource getBaseInputSource() {
		return inputsource;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.wsdl.xml.WSDLLocator#getBaseURI()
	 */
	public String getBaseURI() {
		return baseURI;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.wsdl.xml.WSDLLocator#getImportInputSource(java.lang.String,
	 * java.lang.String)
	 */
	public InputSource getImportInputSource(String arg0, String name) {
		InputSource result = null;

		// Set the last imported value.
		lastimport = name;

		System.out.println("   FileName =" + name);
		try {
			String filePath = baseURI + name;
			Path path = Paths.get(filePath);
			byte[] data = Files.readAllBytes(path);
			InputStream is = new ByteArrayInputStream(data);

			if (is != null) {
				result = new InputSource(is);
			}
			

			System.out.println("**********************************************************************************************");
			System.out.println("************************   Printing the imported Resource *********************************");
			data = Files.readAllBytes(path);
			 is = new ByteArrayInputStream(data);
			 BufferedReader br = new BufferedReader(new InputStreamReader(is));
			 String line=null;
			 while((line=br.readLine())!=null){
				 System.out.println(line);
			 }
			 
			 
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.wsdl.xml.WSDLLocator#getLatestImportURI()
	 */
	public String getLatestImportURI() {
		return lastimport;
	}

}
