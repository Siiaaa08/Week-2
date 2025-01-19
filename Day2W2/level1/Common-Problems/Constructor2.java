//importing util package
import java.util.*;
//Circle class with a radius attribute.
class Circle{
	double radius;
	
	//default constructor of a circle class
	Circle(){
		radius = 50;
		System.out.println("The default radius of the circle: " +radius);
	
	}
	
	//parameterized constructor of a circle class
	Circle(double radius){
		this();
		this.radius = radius;
	}
	
	//displayDetails method to display the radius of the circle
	void displayDetails(){
		System.out.println("The radius of the circle is: " +radius);
	}
}

public class Constructor2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double radius = sc.nextDouble();
		
		//creating an object of the circle class
		Circle c1 = new Circle(radius);
		c1.displayDetails();
	}
}