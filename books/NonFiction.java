package books;

public class NonFiction extends Book {

	private String genre;                // Access Modifier
	
	public NonFiction() {
		super();
	}
	public NonFiction(String name, String author, String genre) {
		super(name,author);                                     //Super keyword
		this.genre=genre;
	}
 
	public String getGenre() {             //getter
		return genre;
	}

	public void setGenre(String genre) {      //setter
		this.genre = genre;
	}
	
	public void DisplayDetails() {
		super.DisplayDetails();
		System.out.println("Genre: "+ this.genre);
	}
}
