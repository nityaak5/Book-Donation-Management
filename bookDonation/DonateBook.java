package bookDonation;
import books.*;
import java.util.*;

public class DonateBook extends Book  {

	private static int maxBooks;
	private ArrayList<Book>bookArray;      // An ArrayList of type book
	
	public DonateBook() {
		this.bookArray= new ArrayList<Book>(maxBooks);    //To limit max no. of books donated
	}

	public static void setMaxBooks(int a) {
		maxBooks = a;
	}
	public static int getMaxBooks() {
		return maxBooks;
	}
	
	//Method to tell how many more books can be donated
	public int numAvailable() {
		return DonateBook.maxBooks - this.bookArray.size();
	}
	
	//Method to find no of donated books
	public int numDonated() {
		return this.bookArray.size();
	}
	
	//Method to donate a book
	
	public void addBook(Book book) {
		if(this.numAvailable()>0) {
			this.bookArray.add(book);
			book.DisplayDetails();
			System.out.println("__________ \n");
		}
		else {
			System.out.println("No more books can be donated");
		}
		
	}
	
	//Method to print details of all books donated

	public void printDonatedBooksDetails() {
		
		for(Book book: this.bookArray) {
			book.DisplayDetails();               //for each loop
			System.out.println("___________\n");
		}
	}
	
	
}
