package xml.dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLXIncludeDOMRead {

	/**
	 * @author deepak.baloni 
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		 factory.setXIncludeAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new File("example.xml"));
		NodeList nodeList = doc.getElementsByTagName("p");
		
		for(int i=0;i<nodeList.getLength();i++){
			Node item = nodeList.item(i);
			
			Element element=(Element)item;
			//System.out.println("id = "+element.getAttribute("id") +" , "+element.getElementsByTagName("firstname").item(0).getTextContent());
			System.out.println(element.getTextContent());
			
		}
		
	}
}
