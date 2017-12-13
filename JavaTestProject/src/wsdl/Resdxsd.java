package wsdl;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Resdxsd {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		try {

			// read the xsd file from the location
			File file = new File("D:\\test.xsd");

			// parse the document
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder;
			docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new File("D:\\back_up\\CanonicalOrder_1.xsd"));
			NodeList list = doc.getElementsByTagName("xs:element");

			// loop to print data
			for (int i = 0; i < list.getLength(); i++) {
				Element first = (Element) list.item(i);
				if (first.hasAttributes()) {
					String nm = first.getAttribute("name");
					System.out.println(nm);
					String nm1 = first.getAttribute("type");
					System.out.println(nm1);
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException ed) {
			ed.printStackTrace();
		}
	}

}
