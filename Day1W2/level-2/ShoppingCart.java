import java.util.*;
class CartItem {
    private int numOfItem;
    private int index = 0;
    private String[] items;

    // Constructor
    CartItem(int numOfItem) {
        this.numOfItem = numOfItem;
        items = new String[numOfItem];
    }

    // Method to add an item to the cart
    void addItem(String itemName) {
        if (index < numOfItem) {
            items[index++] = itemName;
            System.out.println("Item added: " + itemName);
        } else {
            System.out.println("Cart is full! Cannot add more items.");
        }
    }

    // Method to remove the last item
    void remove() {
        if (index > 0) {
            System.out.println("Item removed: " + items[--index]);
        } else {
            System.out.println("No items to remove!");
        }
    }

    // Method to display items
    void display() {
        if (index == 0) {
            System.out.println("Cart is empty!");
        } else {
            System.out.println("List of Items in Cart:");
            for (int i = 0; i < index; i++) {
                System.out.println((i + 1) + ". " + items[i]);
            }
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input 
        System.out.print("Enter the number of items in the cart: ");
        int numItems = sc.nextInt();
        sc.nextLine(); 

        CartItem shop = new CartItem(numItems);

        // Adding in cart
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter the name of item " + (i + 1) + ": ");
            String itemName = sc.nextLine();
            shop.addItem(itemName);
        }

        // Menu for operations
        System.out.print("Press 'R' to remove items or 'D' to display items: ");
        String op = sc.nextLine().toUpperCase();

        switch (op) {
            case "R":
                System.out.print("Enter the number of items to remove: ");
                int removeCount = sc.nextInt();
                for (int i = 0; i < removeCount; i++) {
                    shop.remove();
                }
                shop.display();
                break;
            case "D":
                shop.display();
                break;
            default:
                System.out.println("Invalid operation. Please try again.");
                break;
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}