package bankingsystem;

import java.util.ArrayList;
public class BankingSystemMain {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("Acc2919896", "Dev", 5000, 3.5);
        BankAccount currentAccount = new CurrentAccount("Acc0394856", "Aditya", 10000, 5000);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println();
        }

        // Demonstrating loan functionality
        if (currentAccount instanceof Lonable) {
            Lonable loanable = (Lonable) currentAccount;
            loanable.applyForLoan(20000);
            System.out.println("Loan Eligibility :- " + loanable.calculateLoanEligibility());
        }
    }
}
