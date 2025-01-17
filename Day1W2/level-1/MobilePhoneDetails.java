//importing util package for taking input from the users
import java.util.*;
//creating a class MobilePhone with attributes brand, model, and price. 
public class MobilePhone{
	String brand;
	String model;
	int price;

//creating a constructor of the class MobilePhone
MobilePhone(String brand,String model,int price){
	this.brand = brand;
	this.model = model;
	this.price = price;
}

//creating a method displayDetails to display the items
void displayDetails(){
	System.out.println("Brand: " +brand+ " model: " +model+ " price: " +price);
}
}

public class MobilePhoneDetails{
	public static void main(String[] args){
		//creating an object of a scanner class to take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brand of the mobile phone");
		String brand = sc.nextLine();
		System.out.println("Enter the model of the mobile phone");
		String model = sc.nextLine();
		System.out.println("Enter the price of the mobile phone");
		int price = sc.nextInt();
		
		//creating an object of an MobilePhone class
		MobilePhone mo = new MobilePhone(brand,model,price);
		
		//printing the result
		mo.displayDetails();
	}
}