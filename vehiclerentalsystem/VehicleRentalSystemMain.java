package vehiclerentalsystem;
import java.util.*;
public class VehicleRentalSystemMain {
    public static void main(String[] args) {
        Vehicle car = new Car("C098780", "Petrol", 160, "Car-118--8-1878771");
        Vehicle truck = new Truck("T274709", "Petrol", 200, "Truck-1e298090987");
        Vehicle bike = new Bike("B963188", "Petrol", 30, "Bike-0-10288u1234");
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(bike);
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("Rental Cost for 5 days :- " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost :- " + insurable.calculateInsurance());
                insurable.getInsuranceDetails();
            }

        }

    }
}
