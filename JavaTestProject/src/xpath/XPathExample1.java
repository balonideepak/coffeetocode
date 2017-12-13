package xpath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XPathExample1 {
	public static void main(String[] args) throws ParserConfigurationException,	FileNotFoundException, SAXException, IOException, XPathExpressionException {
		XPath xpath = null;
		DocumentBuilder db = null;
		Document doc = null;
		XPathFactory xpathfactory=null;
		DocumentBuilderFactory dbf =null;

		dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		db = dbf.newDocumentBuilder();
		doc = db.parse(new FileInputStream(new File("in.xml")));

		xpathfactory = XPathFactory.newInstance();
		xpath=xpathfactory.newXPath();
		
		String expression = "//*[@key and @attr]";
		NodeList nl=(NodeList)xpath.evaluate(expression, doc,XPathConstants.NODESET);
		for(int i=0;i<nl.getLength();i++){
			Node node = nl.item(i);
			System.out.println(node.getNodeName());
		}
	
	}
}
