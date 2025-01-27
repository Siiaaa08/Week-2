package onlinefooddeliverysystem;

import java.util.ArrayList;
public class OnlineFoodDeliverySystemMain {
    public static void processOrder(ArrayList<FoodItem> order) {
        double totalOrderCost = 0;

        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println();
            totalOrderCost += item.calculateTotalPrice() - ((item instanceof Discountable) ? ((Discountable) item).applyDiscount() : 0);
        }

        System.out.println("Total Order Cost :- " + totalOrderCost);
    }

    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 250, 2, 10);
        FoodItem nonVegItem = new NonVegItem("Chicken Curry", 300, 3, 50, 5);

        ArrayList<FoodItem> order = new ArrayList<>();
        order.add(vegItem);
        order.add(nonVegItem);

        processOrder(order);

    }
}
