import java.util.*;
class Book{
	String title;
	String author;
	double prize;
	boolean availability;
	
	Book(){
		title = "The palace of illusions";
		author = "Chitra Bannerjee";
		prize = 347;
        availability = true;
	}

    Book(String title, String author, double prize, boolean availability){
        this.title = title;
		this.author = author;
		this.prize = prize;
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
	
	void displayDetails(){
		System.out.println("Title: " +title+ " Author: " +author+ " Prize: " +prize);
		System.out.println("Available: " + (availability ? "Yes" : "No"));
	}
}

public class LibrarySysem{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title of the book");
		String title = sc.nextLine();
		System.out.println("Enter the author of the book");
		String author = sc.nextLine();
		System.out.println("Enter the prize of the book");
		double prize = sc.nextDouble();
		
		Book c1 = new Book();
		c1.displayDetails();
		
		Book c2 = new Book(title,author,prize,true);
		c2.displayDetails();
	}
}