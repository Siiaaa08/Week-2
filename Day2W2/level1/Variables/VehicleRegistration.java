import java.util.*;
class Vehicle{
// class varaible
private static int registrationFee=2500; 

// instance varaible 
private String ownerName;
private String vehicleType;

Vehicle(String ownerName, String vehicleType){

this.ownerName=ownerName;
this.vehicleType=vehicleType;

}
protected void displayVehicleDetails(){
System.out.println("Owner: "+ownerName+" vehicle: "+vehicleType);
}
protected static void updateRegistrationFee(){
 
registrationFee=4000;
}

}
public class VehicleRegistration{
public static void main(String args[]){

Vehicle ob=new Vehicle("john Doe","Sports");
ob.displayVehicleDetails();

Vehicle ob2=new Vehicle("Tester","Truck");
ob2.updateRegistrationFee();
ob2.displayVehicleDetails();

}

}


