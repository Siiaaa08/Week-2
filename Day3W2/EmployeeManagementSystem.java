
class Employee{
	static String companyName = "Capgemini";
	static int totalEmployee = 0;
	final int employeeId;
	String employeeName;
	String employeeDesignation;
	
	Employee(String employeeName,int employeeId,String employeeDesignation){
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeDesignation = employeeDesignation;
		totalEmployee++;
	}
	
	void displayTotalEmployees(){
		System.out.println("The total number of employees in :" +totalEmployee);
	}
	
    static void checkInstance(Object obj){
	       if(obj instanceof Employee){
				System.out.println("object is an instance of a class Employee");
			}
			else{
				System.out.println("object is not an instance of a class Employee");
			}
	}
	
	void displayDetails(){
		System.out.println("Employee Name: " +employeeName+ "\n Employee ID: " +employeeId+ "\n Employee Designation: " +employeeDesignation+ "\n Company Name: " +companyName);
	}
}
	
	public class EmployeeManagementSystem{
		public static void main(String[] args){
			Employee obj = new Employee("Muskan",139,"tester");
			Employee.checkInstance(obj);
			obj.displayDetails();
			
			
			Employee obj1 = new Employee("Khushi",501,"coder");
			Employee.checkInstance(obj1);
			obj1.displayDetails();
			
			Employee obj2 = new Employee("Meeshi",111,"consultant");
			Employee.checkInstance(obj2);
			obj2.displayDetails();
		}
	}
			
		
	
	