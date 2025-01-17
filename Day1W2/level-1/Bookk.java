//importing util package for taking input from the users
import java.util.*;
//creating a class  Book with attributes title, author, and price
public class Book{
	String title;
	String author;
	int price;
	
	//creating a constructor of the class Book
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//creating a method displayDetails to display the details
	void displayDetails(){
		System.out.println("Title: " +title+ " Author: " +author+ " Price:" +price);
	}
}

public class Bookk{
	public static void main(String[] args){
		//creating an object of a scanner class to take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title of the book");
		String title = sc.nextLine();
		System.out.println("Enter the name of the author");
		String author = sc.nextLine();
		System.out.println("Enter the price of the book");
		int price = sc.nextInt();
		
		//creating an object of an Book class
		Book bo = new Book(title,author,price);
		
		//printing the result
		bo.displayDetails();
	}
}