//importing util package
import java.util.*;
//creating a person class with attributes name, age, gender
class Person{
	String name;
	int age;
	String gender;
	
	//default constructor of a person class
	Person(){
		name = "Pihu";
		age = 13;
		gender = "Female";
	}
	
	//parameterized constructor of a person class
	Person(String name,int age,String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//copy constructor of a person class
	Person(Person details){
		this.name = details.name;
		this.age = details.age;
		this.gender = details.gender;
	}
	
	//displayDetails methods to display the details of a person
	void displayDetails(){
		System.out.println("Name: " +name+ " Age: " +age+ " Gender: " +gender);
	}
}

public class Constructor3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the person");
		String name = sc.nextLine();
		System.out.println("Enter the age of the person");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the gender of the person");
		String gender = sc.nextLine();
		
		Person c1 = new Person();
		System.out.println("Default Constructor:");
		c1.displayDetails();
		
		Person c2 = new Person(name,age,gender);
		System.out.println("Parameterized Constructor:");
		c2.displayDetails();
		
		Person c3 = new Person(c2);
		System.out.println("Copy Constructor:");
		c3.displayDetails();
	}
}
		