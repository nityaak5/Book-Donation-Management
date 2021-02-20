package bookDonation;
import books.*;
import java.util.*;

public class bookDonationManagement extends DonateBook {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the max capacity of books to be donated:");
		int x= sc.nextInt();
		
		if(x<1) {
			throw new ArithmeticException("Donate at least one book");     //exception handling
			
		}
		else {
			DonateBook.setMaxBooks(x);
		}
		
		//Creating a new object
		DonateBook b = new DonateBook();
		
		//Fiction f= new Fiction("The fault in our stars", "John Green", "YA");
		//NonFiction f1= new NonFiction("Atomic Habits", "James Clear", "Self help");
		
		//b.addBook(f);         //Method Overloading
		//b.addBook(f1);
		
		int option,choice=1;
		String genre;
		
		while(choice!=0 && b.numAvailable()!=0) {
			System.out.println(b.numDonated()+ " books have been donated already");
			System.out.println("Press 1 to donate , Press 0 to exit");
			choice= sc.nextInt();
			
			if(choice ==0)
				break;
			
			System.out.println("Enter book name: ");
			sc.nextLine();
			String bookName= sc.nextLine();
			System.out.println("Enter author:");
			String authorName= sc.nextLine();
			System.out.println("Is it 1. Fiction 2. Non fiction 3. Poetry ?");
			option= sc.nextInt();
			
			switch(option) {
			
			case 1: 
				genre="fiction";
				Fiction fic= new Fiction(bookName,authorName,genre);
				b.addBook(fic);     //method overloading
				break;
			
			case 2:
				genre="nonfiction";
				NonFiction nonfic= new NonFiction(bookName,authorName,genre);
				b.addBook(nonfic);
				break;
			case 3:
				genre="poetry";
				Poetry poem= new Poetry(bookName,authorName,genre);
				b.addBook(poem);
				break;
			
			default:
				System.out.println("Wrong choice");
					
			}
		}
		
		System.out.println("Total books donated: " + b.numDonated());
		System.out.println("You can donate "+ b.numAvailable()+ " more books");
		
		if(b.numAvailable()==0) {
			System.out.println("Sorry, can't donate more books");
		}
		
		//printing the final details
		
		System.out.println("***************** \n");
		System.out.println("DONATION DETAILS");
		b.printDonatedBooksDetails();
		
		
	}

}
