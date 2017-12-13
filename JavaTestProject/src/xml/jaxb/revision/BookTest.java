package xml.jaxb.revision;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class BookTest {

	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbInstance = JAXBContext.newInstance(BookStore.class);
		Marshaller marshaller = jaxbInstance.createMarshaller();
		
		Book book = new Book("John", "Learning java", "12345");
		List<Book> books=new ArrayList<Book>();
		books.add(book);
		
		BookStore bookstore=new BookStore();
		bookstore.setbooksList(books);
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal(bookstore, new File("book.xml"));
		

	}

}
