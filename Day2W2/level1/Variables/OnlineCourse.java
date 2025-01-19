import java.util.*;

class Course{

// Instance varaible

private String courseName;
private int duration;
private int fee;  


private static String instituteName="TIT";

Course(String courseName, int duration, int fee){

this.courseName=courseName;
this.duration=duration;
this.fee=fee;
}

public void displayCourseDetails(){
System.out.println("Course: "+courseName+ " Duration: "+duration+" fee: "+fee+ " Institute: "+instituteName); 
}
public static void  updateInstituteName(String change){
	instituteName=change;

}
}


public class OnlineCourse{
public static void main(String args[]){

Course ob=new Course("aiml",3,150000);
ob.displayCourseDetails();

Course ob2=new Course("cs",4,70000);
ob2.displayCourseDetails();

Course ob3=new Course("aids",4,30000);
ob3.displayCourseDetails();
ob3.updateInstituteName("IIT");

Course ob4=new Course("mecha",4,30230);
ob4.displayCourseDetails();

}

}






