import java.util.*;
class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public void addFacultyToDepartment(String departmentName, Faculty faculty) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addFaculty(faculty);
            }
        }
    }

    public void showDetails() {
        System.out.println("University: " + name);
        for (Department department : departments) {
            department.showDetails();
        }
    }
}

class Department {
    private String name;
    private List<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDetails() {
        System.out.println("  Department: " + name);
        for (Faculty faculty : faculties) {
            System.out.println("    Faculty: " + faculty.getName());
        }
    }
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        University university = new University("Tech University");
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");

        Faculty faculty1 = new Faculty("Dr. ujjwal");
        Faculty faculty2 = new Faculty("Dr. Saloni");
        Faculty faculty3 = new Faculty("Dr. akshit");

        university.addFacultyToDepartment("Computer Science", faculty1);
        university.addFacultyToDepartment("Computer Science", faculty2);
        university.addFacultyToDepartment("Mechanical Engineering", faculty3);
        university.showDetails();
		
        System.out.println("\nIndependent Faculty: " + faculty1.getName());
        university = null;
        System.gc(); 
        System.out.println("\nThe University and its departments have been deleted!");
    }
}