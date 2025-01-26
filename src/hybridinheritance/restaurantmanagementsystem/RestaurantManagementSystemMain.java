package hybridinheritance.restaurantmanagementsystem;

public class RestaurantManagementSystemMain {
    public static void main(String[] args) {
        Chef chef = new Chef("Akshit", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Saloni", 202, "Main Dining");

        System.out.println("--- Chef Details ---");
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\n--- Waiter Details ---");
        waiter.displayDetails();
        waiter.performDuties();
    }
}
