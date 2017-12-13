package xml.jaxb;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXML {

	/**
	 * @author deepak.baloni
	 * @param args
	 * @throws JAXBException
	 */
	public static void main(String[] args) throws JAXBException {
		Customer customer = new Customer();
		customer.setName("Alpha");
		customer.setId(1);
		customer.setAge(30);

		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true );
		marshaller.marshal(customer, new File("xml_file.txt"));
	}

}
