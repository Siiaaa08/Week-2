import java.util.*;
class School{
public String name;
private ArrayList<Student> std; 

School(String name){
this.name=name;
this.std=new ArrayList<>();
}

public void addStd(Student student){
std.add(student);
}

public void display(){
System.out.println("School Name: "+name);
for(Student s:std){
System.out.println("Student name: "+s.getName());
}
}



}

class Student{
public String name;
private ArrayList<Course> course;

Student(String name){
this.name=name;
this.course=new ArrayList<>();
}

public void addCourse(Course ob){
course.add(ob);
ob.enrolled(this);

}

public String getName(){
return name;
}

public void display(){
System.out.println("Student name: "+name);
for(Course c:course){
System.out.println("Enrolled in Subjects: "+c.getCourse());
}
}


}

class Course{
public String name;
private ArrayList<Student> student;

Course(String name){
this.name=name;
this.student=new ArrayList<>();
}
 
public String getCourse(){
return name;
}

public void enrolled(Student s){
student.add(s);
}


public void display(){
System.out.println("course: "+name);
for(Student s:student){
System.out.println("Studen name enrolled in the course: "+s.getName());
}
}



}
public class SchoolAndStudent{
public static void main(String args[]){


School school=new School("Maharishi");

Student s1=new Student("Saloni");
Student s2=new Student("Steve jobs");

school.addStd(s1);
school.addStd(s2);
school.display();

Course c1=new Course("Maths");
Course c2=new Course("AI");

s1.addCourse(c1);
s2.addCourse(c2);
System.out.println("--------------------");
s1.display();
s2.display();


}
}
