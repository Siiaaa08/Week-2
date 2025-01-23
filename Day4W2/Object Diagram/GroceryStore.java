class Customer {
    String name;
    Product product1;
    Product product2;
 
    public Customer(String name) {
        this.name = name;
    }
    
    public void addProducts(Product p1, Product p2) {
        this.product1 = p1;
        this.product2 = p2;
    }  
}

class Product {
    String name;
    double quantity;
    double pricePerUnit;
    
    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
    
    public double calculatePrice() {
        return quantity * pricePerUnit;
    }
}

class BillGenerator {
    public double calculateTotal(Customer customer) {
        double total = 0;
        if (customer.product1 != null) {
            total += customer.product1.calculatePrice();
        }   
        if (customer.product2 != null) {
            total += customer.product2.calculatePrice();
        }
        return total;
    }
    
    public void generateReceipt(Customer customer) {
        System.out.println("Receipt for " + customer.name);
        
        if (customer.product1 != null) {
            System.out.println(customer.product1.name + ": Rs" + 
                             customer.product1.calculatePrice());
        }
        if (customer.product2 != null) {
            System.out.println(customer.product2.name + ": Rs" + 
                             customer.product2.calculatePrice());
        }
        System.out.println("Total: Rs" + calculateTotal(customer));
    }
}

class GroceryStore {
    public static void main(String[] args) {
        Customer customer = new Customer("Tina");
        Product orange = new Product("Orange", 2, 3); 
        Product bread = new Product("Bread", 1, 10);  
        customer.addProducts(orange, bread);

        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateReceipt(customer);
    }
}