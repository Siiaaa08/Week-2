import java.util.*;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;
    double totalCost;

    // Default Constructor
    CarRental() {
        customerName = "Mihir";
        carModel = "Nano";
        rentalDays = 2;
        dailyRate = 50; 
        totalCost = 100;
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
        calculateTotalCost(); 
    }

    // Copy Constructor
    CarRental(CarRental rental) {
        this.customerName = rental.customerName;
        this.carModel = rental.carModel;
        this.rentalDays = rental.rentalDays;
        this.dailyRate = rental.dailyRate;
        this.totalCost = rental.totalCost;
    }

    // Method to calculate total cost
    void calculateTotalCost() {
        totalCost = rentalDays * dailyRate;
    }

    // Method to display rental details
    void displayDetails() {
        System.out.println("Customer Name: " +customerName+ " carModel: " +carModel+ " rentalDays: " +rentalDays+ " dailyRate: " +dailyRate+ "Total Cost: " +totalCost);
    }
}

public class CarRentalSystem{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the customer");
		String customerName = sc.nextLine();
		System.out.println("Enter the model of the car");
		String carModel = sc.nextLine();
		System.out.println("Enter number of rentalDays");
		int rentalDays = sc.nextInt();
		System.out.println("Enter the daily rate of renting");
		double dailyRate = sc.nextDouble();
		
        CarRental c1= new CarRental();
        c1.displayDetails();
		
		CarRental c2 = new CarRental(customerName,carModel,rentalDays,dailyRate);
		c2.displayDetails();
		
		CarRental c3 = new CarRental(c2);
		c3.displayDetails();
	}
}

       
    

