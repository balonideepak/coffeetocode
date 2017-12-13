package wsdl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.wsdl.Binding;
import javax.wsdl.Definition;
import javax.wsdl.Operation;
import javax.wsdl.PortType;
import javax.wsdl.Types;
import javax.wsdl.WSDLException;
import javax.wsdl.extensions.schema.Schema;
import javax.wsdl.xml.WSDLLocator;
import javax.wsdl.xml.WSDLReader;
import javax.xml.namespace.QName;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.ibm.wsdl.xml.WSDLReaderImpl;
import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import com.sun.org.apache.xerces.internal.parsers.DOMParserImpl;

public class WSDLGenerator {
	public static void main(String[] args) throws WSDLException, SAXException, IOException {

		Definition definition = null;
		WSDLDefinition wsdlDefinition = null;
		File wsdlFileName = new File("D:/Eclipse_Workspace/JavaTestProject/test.wsdl");
		InputStream entityStream=new FileInputStream(wsdlFileName);
		WSDLLocator wsdlLocator=new MyWSDLLocator("D:/Eclipse_Workspace/JavaTestProject/",entityStream);

		WSDLReader wsdlReader=new WSDLReaderImpl();
		definition =wsdlReader.readWSDL(wsdlLocator);
		wsdlDefinition = new WSDLDefinition();
		wsdlDefinition.setDefinition(definition);
	
		System.out.println(" ******************   Printing file ******************");
		byte[] artifactDetail = wsdlDefinition.getArtifactDetail();
				for (byte b : artifactDetail) {
					System.out.print((char)b);
				}
				
				System.out.println(" ******************   File printing done !!! ******************");
				System.out.println();

		//		DOMParser parser = new DOMParser();
		//		File wsdlFileName1 = new File("D:/Eclipse_Workspace/JavaTestProject/test.xsd");
		//		InputStream entityStream1=new FileInputStream(wsdlFileName1);
		//		parser.parse(new InputSource(entityStream1));
		//		
		//		Import xsdimport=definition.createImport();
		//		xsdimport.setDefinition(definition);
		//		definition.addImport(xsdimport);
		//		
		//		wsdlDefinition.setDefinition(definition);

		//		byte[] artifactDetail = wsdlDefinition.getArtifactDetail();
		//		for (byte b : artifactDetail) {
		//			System.out.print((char)b);
		//		}

				Types types = definition.getTypes();
				List extensibilityElements = types.getExtensibilityElements();
				for(int i=0;i<extensibilityElements.size();i++){
					Schema schema = (Schema)extensibilityElements.get(i);
					Element element = schema.getElement();
					System.out.println("Node value ="+element.getElementsByTagName("import"));
					
					NodeList nodeList = element.getElementsByTagName("import");
					if(null!=nodeList){
						System.out.println("Got element");
						for(int j=0;j<nodeList.getLength();j++){
							Node item = nodeList.item(j);
							System.out.println(item.getLocalName());
						}
					}
					
					
					
					
				}

		 Iterator bindingIterator = definition.getBindings().values().iterator();
		 PrintWriter pw=new PrintWriter(System.out);
	      while (bindingIterator.hasNext())
	      {
	    	  Binding binding = (Binding)bindingIterator.next();

	    	  if (!binding.isUndefined())
	    	  {
	    		  QName name = binding.getQName();
	    		  PortType portType = binding.getPortType();
	    		  if (portType != null)
	    		  {
	    			  List operations = portType.getOperations();
	    			  for(int i=0;i<operations.size();i++){
	    				  System.out.println("############  Iteration ="+(i+1)+"    ############");
	    				  Operation op=(Operation)operations.get(i);
	    				  System.out.println("op.getName() =>"+op.getName());
	    				  //System.out.println("op.getInput().getMessage() =>"+op.getInput().getMessage());
	    				  System.out.println("op.getInput().getMessage().getQName() =>"+op.getInput().getMessage().getQName());
	    				  System.out.println("op.getStyle() =>"+op.getStyle());
	    			  }

	    		  }

	    	  }
	      }
		 
	}
}
