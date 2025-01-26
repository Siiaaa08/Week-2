package assistedProbems.employeemanagementsystem;

public class Developer extends Employee{
    private String programmingLanguage;

    Developer(String name, String id, double salary,String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: " +programmingLanguage);
    }
}
