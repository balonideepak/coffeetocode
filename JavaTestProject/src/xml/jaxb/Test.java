package xml.jaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Test {
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		JAXBContext jaxbInstance = JAXBContext.newInstance(CustomerAgain.class);
		Unmarshaller unmarshaller = jaxbInstance.createUnmarshaller();		
		CustomerAgain obj = (CustomerAgain)unmarshaller.unmarshal(new File("test123.xml"));
	    System.out.println(obj.getName());
	}
}
