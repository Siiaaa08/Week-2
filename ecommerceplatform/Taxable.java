package ecommerceplatform;

public interface Taxable {
    double calculateTax();
    default void getTaxableDetails(int tax){
        System.out.println("Taxable Amount :- "+tax);
    };
}
