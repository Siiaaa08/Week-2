//importing util package for taking input from the users
import java.util.*;
//creating a class Employee with attributes name, id, and salary
public class Employee{
	String name;
    int id;
    double salary;

//creating a constructor of the class employee
Employee(String name, int id, double salary){
  this.name = name;
  this.id = id;
  this.salary = salary;
}
//creating a method DisplayDetailsto display the details
void DisplayDetails(){
	System.out.println("Employee Name : " +name+ "Employee id : " +id+ "Employee salary : " +salary);
}
}

public class Employer{
public static void main(String[] args){
	//creating an object of a scanner class to take input from the user
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name of the employee");
	String name = sc.nextLine();
	System.out.println("Enter the id of the employee");
	int id = sc.nextInt();
	System.out.println("Enter the salary of the employee");
	double salary = sc.nextDouble();
	
	//creating an object of an employee class
	Employee em = new Employee(name,id,salary);
	
	//printing the result
	em.DisplayDetails();
}
}

	
