package assistedProbems.employeemanagementsystem;

public class Intern extends Employee{
    private String skill;

    Intern(String name, String id, double salary, String skill){
        super(name, id, salary);
        this.skill = skill;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Skill: " +skill);
    }
}
