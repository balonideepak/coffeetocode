package wsdl;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.wsdl.Definition;
import javax.wsdl.Import;
import javax.wsdl.xml.WSDLLocator;

import org.xml.sax.InputSource;

import com.ibm.wsdl.xml.WSDLReaderImpl;


public class MyWSDLLocator implements WSDLLocator {

	private String basePath;
	private InputSource baseInputSource;
	public MyWSDLLocator(String basePath, InputStream inputStream )
	{
		this.basePath = basePath;
		baseInputSource = new InputSource(inputStream);
	}


	@Override
	public InputSource getBaseInputSource() {
		return baseInputSource;
	}

	@Override
	public String getBaseURI() {
		return basePath;
	}

	@Override
	public InputSource getImportInputSource(String parentLocation, String importLocation) {
		try
		{

			System.out.println(" *********   Entering getImportInputSource() method  with parentLocation="+parentLocation+"  , importLocation="+importLocation);

			String modifiedImportLocation = importLocation;
			String pattern="../";
			if(importLocation.startsWith("/")){
				modifiedImportLocation = modifiedImportLocation.substring(modifiedImportLocation.indexOf("/")+1);
			}
			else if(modifiedImportLocation.contains("../")){
				while(modifiedImportLocation.contains(pattern)){
					modifiedImportLocation=modifiedImportLocation.substring(modifiedImportLocation.indexOf(pattern)+pattern.length(),modifiedImportLocation.length());
				}
			}


			String filePath = basePath+modifiedImportLocation;

			if(null!=filePath)
				filePath=filePath.replaceAll("//", "/");

			Path path = Paths.get(filePath);
			byte[] data = Files.readAllBytes(path);

			
			
			
//			Definition definition2 = wsdlDefinition.getDefinition();
//			Import importDef = definition2.createImport();
//			File wsdlFileName1 = new File("D:/Eclipse_Workspace/JavaTestProject/test.xsd");
//			InputStream entityStream1=new FileInputStream(wsdlFileName1);
//			WSDLLocator wsdlLocator1=new MyWSDLLocator("D:/Eclipse_Workspace/JavaTestProject/",entityStream1);
//
//			 Definition importedDef=new WSDLReaderImpl().readWSDL(wsdlLocator1);
//			importDef.setDefinition(importedDef);
//			definition2.addImport(importDef);
//			
//			byte[] artifactDetail = wsdlDefinition.getArtifactDetail();
//			for (byte b : artifactDetail) {
//				System.out.print((char)b);
//			}
			
			return new InputSource(new ByteArrayInputStream(data));

		}
		catch(Exception e)	{
			e.printStackTrace();
		}
		return null; 
	}

	@Override
	public String getLatestImportURI() {
		return basePath;
	}

	
	
}

