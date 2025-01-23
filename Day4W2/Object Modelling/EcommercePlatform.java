import java.util.*;
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int id;
    private Customer customer;
    private List<Product> products;

    public Order(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }
}

class Customer {
    private int id;
    private String name;
    private String email;
    private List<Order> orders;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Order> getOrders() {
        return orders;
    }
}


public class EcommercePlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer ID:");
        int customerId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Customer Name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter Customer Email:");
        String customerEmail = scanner.nextLine();

        Customer customer = new Customer(customerId, customerName, customerEmail);
        System.out.println("How many orders does the customer want to place?");
        int orderCount = scanner.nextInt();

        for (int i = 1; i <= orderCount; i++) {
            System.out.println("\nCreating Order #" + i);
            Order order = new Order(i, customer);

            System.out.println("How many products in this order?");
            int productCount = scanner.nextInt();
            scanner.nextLine();

            for (int j = 1; j <= productCount; j++) {
                System.out.println("Enter details for Product #" + j);

                System.out.println("Enter Product ID:");
                int productId = scanner.nextInt();
                scanner.nextLine(); 

                System.out.println("Enter Product Name:");
                String productName = scanner.nextLine();

                System.out.println("Enter Product Price:");
                double productPrice = scanner.nextDouble();
                scanner.nextLine();
				
                Product product = new Product(productId, productName, productPrice);
                order.addProduct(product);
            }
            customer.placeOrder(order);
        }

        System.out.println("\nCustomer Details:");
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
        System.out.println("Total Orders: " + customer.getOrders().size());

        System.out.println("\nOrder Details:");
        for (Order order : customer.getOrders()) {
            System.out.println("\nOrder ID: " + order.getId());
            System.out.println("Order for Customer: " + order.getCustomer().getName());
            System.out.println("Products in Order:");
            for (Product product : order.getProducts()) {
                System.out.println("  - Product ID: " + product.getId() +
                                   ", Name: " + product.getName() +
                                   ", Price: " + product.getPrice());
            }
            System.out.println("Total Price: " + order.calculateTotalPrice());
        }
    }
}