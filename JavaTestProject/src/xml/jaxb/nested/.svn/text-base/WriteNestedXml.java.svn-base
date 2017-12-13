package xml.jaxb.nested;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class WriteNestedXml {
	public static void main(String[] args) throws JAXBException,
			FileNotFoundException {
		JAXBContext jaxbContext = JAXBContext.newInstance(FosterHome.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		FosterHome fosterhomeobj = new FosterHome();
		fosterhomeobj.setLocation("San-Jose");
		fosterhomeobj.setOrphanage("Saint-Maria");

		List<Family> families = new ArrayList<Family>();
		Family family = new Family();
		family.setParentId("1234");
		List<String> childid = new ArrayList<String>();
		childid.add("child1");
		childid.add("child2");
		family.setChildid(childid);
		families.add(family);

		fosterhomeobj.setFamilies(families);
		marshaller.marshal(fosterhomeobj, new FileOutputStream(new File(
				"nested_xml_output.txt")));

		System.out.println("Finished ....");
	}

}
