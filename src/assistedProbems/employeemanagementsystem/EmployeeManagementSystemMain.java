package assistedProbems.employeemanagementsystem;

public class EmployeeManagementSystemMain {
    public static void main(String[] args) {
        Employee developer = new Developer("Saloni", "sa51", 50000, "Java");
        developer.displayDetails();
        Employee manager = new Manager("Tina", "ti08", 100000, 8);
        manager.displayDetails();
        Employee intern = new Intern("Siaa", "si10", 80000, "Leadership");
        intern.displayDetails();
    }
}
