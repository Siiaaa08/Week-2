class Subject {
    String subjectName;
    int marks;
    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }
   
    public String getSubjectName() {
        return subjectName;
    }
    
    public int getMarks() {
        return marks;
    }
}
class GradeCalculator {
    public String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else {
            return "F";
        }
    }
}
class Student {
    String studentName;
    Subject subject1;
    Subject subject2;

    public Student(String studentName, Subject subject1, Subject subject2) {
        this.studentName = studentName;
        this.subject1 = subject1;
        this.subject2 = subject2;
    }
   
    public String getStudentName() {
        return studentName;
    }
  
    public void showResults() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade1 = gradeCalculator.calculateGrade(subject1.getMarks());
        System.out.println("Subject: " + subject1.getSubjectName() + " - Marks: " + subject1.getMarks() + " - Grade: " + grade1);
        String grade2 = gradeCalculator.calculateGrade(subject2.getMarks());
        System.out.println("Subject: " + subject2.getSubjectName() + " - Marks: " + subject2.getMarks() + " - Grade: " + grade2);
    }
}
public class SchoolResultsApplication {
    public static void main(String[] args) {
        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 95);
        Student student1 = new Student("Saloni Baruaa", maths, science);
        System.out.println("Student: " + student1.getStudentName());
        student1.showResults(); 
    }
}