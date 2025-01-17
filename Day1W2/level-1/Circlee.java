//importing util package for taking input from the users
import java.util.*;
import java.lang.*;
//creating a class Circle with attributes radius
public class Circle{
	double radius;


//creating a constructor of the class Circle
Circle(double radius){
	this.radius = radius;
}

//creating a method Displayarea to display the area of a circle
void displayArea(){
	double area = Math.PI*(radius*radius);
	System.out.println("The area of a circle is " +area);
}

//creating a method DisplayCircumference to display the circumference of a circle
void displayCircumference(){
	double circumference = 2*Math.PI*radius;
	System.out.println("The circumference of a circle is " +circumference);
}
}

public class Circlee{
	public static void main(String[] args){
		//creating an object of a scanner class to take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of a circle");
		double radius = sc.nextDouble();
		
		//creating an object of an Circle class
		Circle cir = new Circle(radius);
		
		//printing the result
        cir.displayArea();
        cir.displayCircumference();
	}
}	
	