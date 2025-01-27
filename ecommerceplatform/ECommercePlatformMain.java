package ecommerceplatform;
import java.util.*;
public class ECommercePlatformMain {
    public static double bill(ArrayList<Product> p){
        double result=0;
        for(Product product: p){
            result=result+product.calculateFinalPrice();

        }
        return result;
    }
    public static void main(String[] args) {
        Product electronics1=new Electronics(13489217,"Hair Dryer",989,21);

        Product clothing1=new Clothing(64356217,676,"Loafers",24);
        Product groceries1=new Groceries(14096217,299,"Bowl Set",27);
        electronics1.displayDetails();
        System.out.println();
        clothing1.displayDetails();
        System.out.println();
        groceries1.displayDetails();
        System.out.println();
        ArrayList<Product> pr=new ArrayList();
        pr.add((Electronics)electronics1);
        pr.add((Clothing)clothing1);
        pr.add((Groceries)groceries1);
        System.out.println();
        System.out.println("Total bill :- "+bill(pr));

    }
}
