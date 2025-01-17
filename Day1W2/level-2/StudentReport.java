//importing util package for taking input from the users
import java.util.*;
public class StudentReport{
	public static void main(String[]args){
		//creating an object of a scanner class to take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the student");
		String name = sc.nextLine();
		System.out.println("Enter the roll number of the student");
		int rollNumber = sc.nextInt();
		System.out.println("Enter the marks of the student out of 100");
		int marks = sc.nextInt();
		
		//creating an object of an student class
		Student st = new Student(name,rollNumber,marks);
		
		//printing the result
		st.displayDetails();
	}
}


//creating a class Student with attributes name, rollNumber, and marks 
public class Student{
	String name;
	int rollNumber;
	float marks;

//creating a constructor of the class Student
Student(String name,int rollNumber,float marks){
	this.name = name;
	this.rollNumber = rollNumber;
	this.marks = marks;
}

//creating a method calculateGrade to calculate the grade of the student
char calculateGrade(){
	if(marks>=90){
		return 'A';
	}
	else if(marks<=70 && marks>=80){
	    return 'B';
	}
	else{
		return 'C';
	}
}

//creating a method displayDetails to display the details
void displayDetails(){
	System.out.println("Name: " +name+ " RollNumber: " +rollNumber+ " Marks: " +marks+ " " +calculateGrade());
}
}

