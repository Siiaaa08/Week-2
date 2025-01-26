package assistedProbems.employeemanagementsystem;

public class Employee {
    String name;
    String id;
    double salary;

    Employee(String name,String id,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println(("Name: " +name+ " ID: " +id+ " Salary: " +salary));
    }
}




