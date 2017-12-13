package xml.jaxb.nested;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadNestedXml {

	/**
	 * @author deepak.baloni
	 * @param args
	 * @throws JAXBException
	 */
	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(FosterHome.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		FosterHome fosterHomeObj = (FosterHome)unmarshaller.unmarshal(new File("nested_xml_input.txt"));
		System.out.println("Location ::"+fosterHomeObj.getLocation()+" , Orphanage ::"+fosterHomeObj.getOrphanage());
		List<Family> families = fosterHomeObj.getFamilies();

		for (Family family : families) {
			System.out.println("Family >> "+family);
		}
	}

}
