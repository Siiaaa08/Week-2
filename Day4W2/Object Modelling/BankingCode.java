import java.util.*;

class BankAccount{
	 private String accountNumber;
	 private double bankBalance;
	 
	 public BankAccount(String accountNumber){
		 this.accountNumber=accountNumber;
		 this.bankBalance=0.0;
	 }
	 
	 public double showBalance(){
		 return bankBalance;
	 }
	 
	 public void deposit(int amount){
		 if(amount>0){
		 bankBalance+=amount;
	 }
	 else{
		 System.out.println("Please enter the valid amount");
	 }
	 }
	 public void withdrawl(int amount){
		 if(bankBalance>amount&&amount>0){
			 bankBalance-=amount;
		 }
		 else{
		 System.out.println("Withdraw successfull");
	 }
	 }
	  public String getAccountNumber(){
		  return accountNumber;
	  }
	  
	 
}
class Customer{

	private String customerName;
    private String customerId;
    private ArrayList<BankAccount> Accounts;


	
	public Customer(String customerName,String customerId){
		this.customerName=customerName;
		this.customerId=customerId;
		this.Accounts=new ArrayList<>();
	}
	public void viewBalance() {
        for (BankAccount account : Accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + " Balance: " + account.showBalance());
        }
    }

	public void openAccount(BankAccount account){
		Accounts.add(account);
	}
	
	public void showBanks(){
		for(BankAccount account: Accounts){
			System.out.println(account);
		}
	}
	
	public String getCustomerName() {
        return customerName;
    }
}

class Bank{
	private String bankName;
	private ArrayList<BankAccount> Accounts;

     public Bank(String bankName) {
        this.bankName = bankName;
        this.Accounts = new ArrayList<>();
    }
	public BankAccount openAccount(Customer customer) {
        String accountNumber = "ACC0000" + (Accounts.size() + 1);
        BankAccount newAccount = new BankAccount(accountNumber);
        customer.openAccount(newAccount); 
        Accounts.add(newAccount); 
        System.out.println("New account opened for " + customer.getCustomerName() + " with Account Number: " + accountNumber);
        return newAccount;
    }

     public String getBankName() {
        return bankName;
    }
}
	

public class BankingCode{
	public static void main(String args[]){
	    Bank bank1 = new Bank("Swiss Bank");
        Bank bank2 = new Bank("Ujjwal bank of india");
        Bank bank3 = new Bank("Gupta ji bank of india");
	
		Customer customer1 = new Customer("Sandhya", "C123");
        Customer customer2 = new Customer("Devi", "C124");
        Customer customer3 = new Customer("Ram", "C125");
   
        BankAccount account1 = bank1.openAccount(customer1);
        BankAccount account2 = bank2.openAccount(customer2);
        BankAccount account3 = bank3.openAccount(customer3);
      
        account1.deposit(500);
        account2.deposit(1000);
        account3.deposit(1500);

        account1.withdrawl(200);
        account2.withdrawl(150);
        account3.withdrawl(100);

        System.out.println("\n" + customer1.getCustomerName() + "'s Accounts:");
        customer1.viewBalance();

        System.out.println("\n" + customer2.getCustomerName() + "'s Accounts:");
        customer2.viewBalance();

        System.out.println("\n" + customer3.getCustomerName() + "'s Accounts:");
        customer3.viewBalance();
    }
}