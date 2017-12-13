package xml.jaxb.revision;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name = "book")
@XmlType(propOrder={"bookName","authorName","ISBN"})
public class Book {
	private String authorName;
	private String bookName;
	private String ISBN;
	
	public Book() {
	}
	
	public Book(String authorName, String bookName, String iSBN) {
		this.authorName = authorName;
		this.bookName = bookName;
		ISBN = iSBN;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

}
