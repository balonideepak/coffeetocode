package test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Test {

	static char[] charArray =null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// String format = MessageFormat.format("abc,{0}def,{1},{2}",
		// "1","2","3");
		// System.out.println(format);
//		String strWithSpaces="";
//		String str = System.currentTimeMillis() +"";
//		Long l = Long.parseLong(str);
//		long i = 43200 * 60 * 1000l;
//		long date2 = i + System.currentTimeMillis();
//		Date date = new Date(date2);
//		// System.out.println("l :: "+l+" , i :: "+i +" , date :: "+date);
//
//		String imagePreviewSmallFilePath = "";
//		String imagePreviewMediumFilePath = "";
//		String imagePreviewLargeFilePath = "";
//		String contentURL;
//		String CPC;
//		String CC;
//
//		String filePath = "/Mi-emocion_Button70*70.png,/Mi-emocion_Button50*50.png,/Mi-emocion_Button40*40.png";
//
//		// getImgPreviewFileArr(filePath,imagePreviewLargeFilePath,imagePreviewMediumFilePath,imagePreviewSmallFilePath);
//
//		//
//		String xmlData = "<response><lst name=\"responseHeader\"><int name=\"status\">0</int><int name=\"QTime\">2</int></lst><result name=\"response\" numFound=\"15914\" start=\"0\">"
//				+ "<doc><str name=\"id\">adfcb555ac83dccb</str></doc><doc><str name=\"id\">a2407e447747933a</str></doc><doc><str name=\"id\">4d33e4e26bca2205</str></doc>"
//				+ "<doc><str name=\"id\">5a23ae74db3f3fc8</str></doc><doc><str name=\"id\">1e1c06e314e34314</str></doc></result></response>";
//		// String ids=getCategoryIds(xmlData);
//
//		// System.out.println(new Date());
//
//		try {
//
//			String encode = URLEncoder.encode("Disparé", "UTF-8");
//			String decode1 = URLDecoder.decode("Dispar%C3%A9", "UTF-8");
//			String decode2 = URLDecoder.decode(encode, "UTF-8");
//
//			// System.out.println(decode2);
//			// System.out.println(encode);
//			// System.out.println(decode1);
//
//			
//			String inputStr="abc";//abcd ----->  97*31^3+98*31^2+99*31^1+100*31^0
//			double manualHashCode = 97*Math.pow(31,2)+98*Math.pow(31, 1)+99*Math.pow(31, 0);
//			//+99*Math.pow(31,1)+100*Math.pow(31, 0);
//			System.out.println("For formula :: 97*Math.pow(31,1)+98*Math.pow(31, 0)     hashcode is ::"+(int)manualHashCode);
//			
//			charArray = inputStr.toCharArray();
//			for (char c : charArray) {
//				//System.out.println(c +" , ascii value:: "+(byte)c);
//			}
//			System.out.println("hashcode for string from String class::"+inputStr.hashCode());
//			
//			
//			System.out.println("overriden hashcode :: "+new Test().hashCode());
//			
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		
		
	System.out.println(System.currentTimeMillis());
	String urlStr="/a/b/f.xsd";
	int indexOfXSD=urlStr.indexOf(".xsd");
	urlStr=urlStr.substring(indexOfXSD-1, urlStr.length());
System.out.println(urlStr);
	}

	class Category {
		List<String> list;

		/**
		 * @return the list
		 */
		public List<String> getList() {
			return list;
		}

		/**
		 * @param list
		 *            the list to set
		 */
		public void setList(List<String> list) {
			this.list = list;
		}

	}

	private static String getCategoryIds(String xmlData) {
		String ids = "";
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docbuilder = factory.newDocumentBuilder();
			ByteArrayInputStream bis = new ByteArrayInputStream(
					xmlData.getBytes());
			Document document = docbuilder.parse(bis);
			NodeList nodeList = document.getElementsByTagName("doc");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				String nodeValue = node.getTextContent();

				/*
				 * Element eElement = (Element) node;
				 * 
				 * nodeValue=eElement.getElementsByTagName("str").item(0).
				 * getTextContent();
				 */

				System.out.println(nodeValue);
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ids;
	}

	private static void getImgPreviewFileArr(String filePath, String... arg) {
		String[] imgFilePathArr = filePath.split(",");
		int imgFilePathArrLength = imgFilePathArr.length;
		int argLength = arg.length;
		for (int i = 0; i < argLength; i++) {
			try {
				arg[i] = imgFilePathArr[i];
			} catch (Exception e) {
				arg[i] = imgFilePathArr[imgFilePathArrLength - 1];
			}
		}
		for (String str : arg) {
			System.out.println(str);
		}
	}


	
    public  int hashCode() {
    	int h = 0;
    	if (h == 0) {
    	    int off = 0;
    	    char val[] = charArray ;
    	    int len = charArray.length;

                for (int i = 0; i < len; i++) {
                    h = 31*h + val[off++];
                    System.out.print(" h value::"+h+" ,");
                }
               // hash = h;
            }
    	System.out.println("\n");
            return h;
        }


}
