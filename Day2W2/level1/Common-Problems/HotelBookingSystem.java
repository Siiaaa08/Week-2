//importing util package
import java.util.*;
//creating hotelBooking class with attributes guestName, roomType, nights
class HotelBooking{
	String guestName;
	String roomType;
	int nights;
	
	//Default Constructor
	HotelBooking(){
		guestName = "Neel khana";
		roomType = "2 Bed";
		nights = 5;
	}
	
	//Parameterized constructor
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	//copy constructor
	HotelBooking(HotelBooking booking){
		this.guestName = booking.guestName;
		this.roomType = booking.roomType;
		this.nights = booking.nights;
	}
	
	//method to display the booking
	void displayDetails(){
		System.out.println("GuestName: " +guestName+ " RoomType: " +roomType+ " Nights: " +nights);
	}
}

public class HotelBookingSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the guest");
		String guestName = sc.nextLine();
		System.out.println("Enter the type of room");
		String roomType = sc.nextLine();
		System.out.println("Enter the number of nights");
		int nights = sc.nextInt();
		
		HotelBooking c1 = new HotelBooking();
		System.out.println("Default Constructor:");
		c1.displayDetails();
		
		HotelBooking c2 = new HotelBooking(guestName,roomType,nights);
		System.out.println("Parameterized Constructor:");
		c2.displayDetails();
		
		HotelBooking c3 = new HotelBooking(c2);
		System.out.println("Copy Constructor:");
		c3.displayDetails();
	}
}