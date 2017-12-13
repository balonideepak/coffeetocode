package xml.jaxb.revision;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BookStore {

	@XmlElementWrapper(name = "bookList")
	@XmlElement(name = "book")
	private List<Book> bookList;

	public List<Book> getbooksList() {
		return bookList;
	}

	public void setbooksList(List<Book> books) {
		this.bookList = books;
	}

}
