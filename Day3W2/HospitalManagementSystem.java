import java.util.Scanner;
import java.util.*;
class Patient{
	static String hospitalName="Dev Hospital";
	static int totalNumber=0;
	String name;
	String ailment;
	final int patientID;

	Patient(){
		name = "Raygan";
		ailment = "Fever";
		patientID = 347;
		totalNumber++;
      }
	 Patient(String name, String ailment, int patientID){
        this.name =name;
		this.ailment = ailment;
		this.patientID=patientID;
		totalNumber++;
		}
		
	
		
	public static void getTotalPatients(){
		System.out.println("Number of patients :- " + totalNumber);
		
	}
	public void displayDetails() {
        System.out.println("The name of patient :- " +name);
		System.out.println("The patientID number of patient :- " + patientID);
		System.out.println("Hospital Name of patient :- " + hospitalName);
		System.out.println("ailment of patient :- " + ailment);
		
        
    }
	
}
	
	


public class HospitalManagementSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the patient :- ");
		String name = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the ailment of the patient :- ");
		String ailment = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the patientID of the patient :- ");
		int patientID = sc.nextInt();
		System.out.println();
		
		
		Patient patient = new Patient(name,ailment,patientID);
		System.out.println();
		
		patient.displayDetails();
		System.out.println();
		
		
		Patient.getTotalPatients();
		 
		System.out.print("This object is type of :- " +(patient instanceof Patient));
		
	}
}