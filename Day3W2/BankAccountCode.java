
import java.util.*;
class BankAccount{
	static int totalNumber=0;
	static String bankName;
	 String accountHolder ;
    final int accountNumber  ;
	
	BankAccount(){
		this.accountHolder="Item";
		this.accountNumber=0;
		BankAccount.bankName="State Bank";
		BankAccount.totalNumber++;
		}
	BankAccount(String accountHolder,int accountNumber,String bankName){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		BankAccount.bankName=bankName;
		BankAccount.totalNumber++;
		
		
	}
		
		
	public static void getTotalAccounts(){
		System.out.println("The total number of account opened :- "+BankAccount.totalNumber);
	}
	public void displayBankAccountClassDetails() {
        System.out.println("Owner of Bank Account :- " + accountHolder);
		System.out.println("Bank Account number :- " + accountNumber);
		System.out.println("Name of Bank :- " + bankName);
		
		
        
    }
	//new function
}
	
	


public class BankAccountCode{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter your accountNumber :- ");
		int accountNumber=sc.nextInt();
		System.out.println();
		 sc.nextLine();
		
		System.out.print("Enter your accountHolder :- ");
		String accountHolder=sc.nextLine();
		System.out.println();
		
		System.out.print("Enter your bank name :- ");
		String bankName=sc.nextLine();
		System.out.println();
		 
		BankAccount bankAccount=new BankAccount(accountHolder,accountNumber,bankName);
	    bankAccount.displayBankAccountClassDetails();
		 
		BankAccount.getTotalAccounts();
		 
		System.out.print("This object is type of :- " +(bankAccount instanceof BankAccount));
		
		 
		 
	 }
 }
 
 