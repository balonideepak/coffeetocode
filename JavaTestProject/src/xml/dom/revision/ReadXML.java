package xml.dom.revision;

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

public class ReadXML {

	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse(new File("staff.xml"));
		NodeList elems = document.getElementsByTagName("staff");
		for (int i = 0; i < elems.getLength(); i++) {
			Node item = elems.item(i);
			Element elm = (Element) item;
			System.out.println("firstname ="
					+ elm.getElementsByTagName("firstname").item(0)
							.getTextContent()
					+ " , lastname="
					+ elm.getElementsByTagName("firstname").item(0)
							.getTextContent());
		}

	}
}
