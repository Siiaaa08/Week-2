package bankingsystem;

public interface Lonable {
    void applyForLoan(double amount);

    double calculateLoanEligibility();
}
