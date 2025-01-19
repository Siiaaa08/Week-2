//importing util package
import java.util.*;
//creating a class Product
class Product{

	private static int totalProducts=0;

	public static void displayProductDetails(String name){
	System.out.println("THe product is: "+name);
	totalProducts++;
	}

	public static void displayTotalProducts(){
	
	System.out.println("The total products are: "+totalProducts);
	
	}


}

public class ProductInventory{
public static void main(String args[]){
Product ob=new Product();
ob.displayProductDetails("Maggie");

ob.displayProductDetails("Cookie");

ob.displayProductDetails("pasta");


ob.displayProductDetails("Paneer");


Product ob2=new Product();
ob2.displayTotalProducts();
}
}


