//importing util package for taking input from the users
import java.util.*;
//creating a class PalindromeChecker with an attribute text. 
class PalindromeChecker {
	String input;
	boolean result=true;
	
	
//creating a constructor of the class PalindromeChecker
	 PalindromeChecker(String input){
		this.input=input;
		int start=0,end=input.length()-1;
		while(start<=end){
		if(input.charAt(start)!=input.charAt(end)){
				result=false;
	}
	start++;
	end--;
	}
	
	System.out.println("The given string "+input+" is "+(result?"palindrome":"not palindrome"));
	}
	
}
class Palindrome{
	public static void main(String args[]){
		//Program to Check Palindrome String

		Scanner sc = new Scanner(System.in);
      System.out.print("Enter the string :- ");
		String m=sc.nextLine();
		
		//creating an object of an MobilePhone class
		PalindromeChecker palindrome=new PalindromeChecker(m);
		
		
		
    }
}
	