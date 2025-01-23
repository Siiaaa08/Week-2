import java.util.*;
class Book{
	private String title;
	private String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void print(){
		System.out.println("Title: " +getTitle()+ "Author: " +getAuthor());
	}
	
}

class Library{
	private String name;
	private ArrayList<Book> books;
	
	Library(String name){
		this.name = name;
		this.books = new ArrayList<>();
	}
	
	public void addBook(Book book){
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            System.out.println("Book Title: "+book.getTitle()+"\nAuthor: "+book.getAuthor());
        }
    }
}
	
	public class LibraryAgression{
    public static void main(String[] args) {
        Book book1 = new Book("It ends with us", "Coollen Hoover");
        Book book2 = new Book("It starts with us", "Coollen Hover");
        Book book3 = new Book("I too had a love story", "Ravindra Singh");
        Library library1 = new Library("Central Library");
        Library library2 = new Library("Community Library");

        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);
        library2.addBook(book1); 
		
        library1.displayBooks();
        library2.displayBooks();
    }
}

	
	
	
	
