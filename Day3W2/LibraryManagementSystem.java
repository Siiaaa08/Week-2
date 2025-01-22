
import java.util.*;
class Book{
	static String libraryName="Dev Library";
	String title;
	String author;
	int isbn;
	boolean availability;
	
	Book(){
		title = "Raygan";
		author = "Dev";
		isbn = 347;
        availability = true;
	}
	Book(String title, String author, int isbn, boolean availability){
        this.title = title;
		this.author = author;
		this.isbn=isbn;
		this.availability = availability;
	}
		void borrow(){
		if(availability){
			System.out.println("The book " +title+ "is available to borrow");
			availability = false;
		}
		else{
			System.out.println("The book " +title+ "is not available");
		}
	}
	
		
	public static void displayLibraryName(){
		System.out.println("Name of Library :- " + libraryName);
		
	}
	public void displayDetails() {
        System.out.println("Author of book :- " + author);
		System.out.println("The title of book :- " + title);
		System.out.println("The isbn number of book :- " + isbn);
		
		
		
        
    }
	//new function
}
	
	


public class LibraryManagementSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the title of the book :- ");
		String title = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the author of the book :- ");
		String author = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the isbn of the book :- ");
		int isbn = sc.nextInt();
		System.out.println();
		
		
		Book book = new Book(title,author,isbn,true);
		book.displayDetails();
		System.out.println();
		
		
		Book.displayLibraryName();
		 
		System.out.print("This object is type of :- " +(book instanceof Book));
		
	}
}