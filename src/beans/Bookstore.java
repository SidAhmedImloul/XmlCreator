package beans;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//This statement means that class "Bookstore.java" is the root-element of our example
@XmlRootElement(namespace = "Collaborative-exams.xml.jaxb")

public class Bookstore {

	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "bookList")
	@XmlElement(name = "book")
	private ArrayList<Book> bookList;
	private String name;
	@XmlElementWrapper(name = "adresseList")
	@XmlElement(name = "adresse")
	private ArrayList<Location> adresseList;

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public ArrayList<Book> getBooksList() {
		return bookList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
		public ArrayList<Location> getLocations() {
		return adresseList;
	}

	public void setLocation(ArrayList<Location> location) {
		this.adresseList = location;
	}
}