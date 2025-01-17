//importing util package for taking input from the users
import java.util.*;
//creating a class Item with attributes itemCode, itemName,quantity and price. 
public class Item{
	int itemCode;
	String itemName;
	int price;
	int quantity;
	
	//creating a constructor of the class Item
	Item(int itemCode,String itemName,int price,int quantity){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	//creating a method displayItems to display the items
	void displayItems(){
		int cost = price*quantity;
		System.out.println("Itemcode: " +itemCode+ " Itemname: " +itemName+ " Price: " +price+ " Cost: " +cost);
	}
}
	
	public class Inventory{
		public static void main(String[]args){
			//creating an object of a scanner class to take input from the user
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter itemCode");
			int itemCode = sc.nextInt();
			System.out.println("Enter itemName");
			String itemName = sc.nextLine();
			System.out.println("Enter price");
			int price = sc.nextInt();
			System.out.println("Enter quantity");
			int quantity = sc.nextInt();
			
			//creating an object of an Item class
			Item it = new Item(itemCode,itemName,price,quantity);
			
			//printing the result
			it.displayItems();
		}
	}