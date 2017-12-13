package xml.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLToObject {

	/**
	 * @author deepak.baloni 
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Object object = unmarshaller.unmarshal(new File("xml_file.txt"));
		Customer customer=(Customer)object;
		System.out.println(customer.toString());
		
	}

}
