package books;

public class Fiction extends Book {      //Inheritance
	
	private String genre;                // Access Modifier
	
	public Fiction() {
		super();
	}
	
	public Fiction(String name, String author, String genre) {
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
