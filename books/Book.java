package books;

public abstract class Book {    //Abstract Class
	private String name;
	private String author;
	
	public Book() {
		
	}
	public Book(String name, String author) {   //Constructor
		this.name=name;
		this.author=author;
	}

	public String getName() {                //getter
		return name;
	}

	public void setName(String name) {      //setter
		this.name = name;
	}

	public String getAuthor() {           //getter
		return author;
	}

	public void setAuthor(String author) {     //setter
		this.author = author;
	}
	
	public void DisplayDetails() {
		System.out.println("Book Name: "+ this.name);
		System.out.println("Book Author: "+ this.author);
	}
	
}
