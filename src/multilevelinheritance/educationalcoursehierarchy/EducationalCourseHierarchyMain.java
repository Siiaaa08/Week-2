package multilevelinheritance.educationalcoursehierarchy;

public class EducationalCourseHierarchyMain {
    public static void main(String[] args) {
        PaidOnlineCourse paidCourse = new PaidOnlineCourse(
                "Java Programming",
                40,
                "Infosys Springboard",
                true,
                199.99,
                20
        );
        paidCourse.displayDetails();
    }
}
