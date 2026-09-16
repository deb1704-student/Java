import java.util.ArrayList;
import java.util.List;

// Abstract Class: blueprint for all account types
public abstract class Account {

    private String accountNumber;
    private String ownerName;
    private double balance;
    private List<Transaction> transactionHistory; // composition: Account HAS-A history

    public Account(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    // Protected: only this class and subclass can adjust balance directly
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Helper so every subclass logs transactions the same way
    protected void logTransaction(String type, double amount) {
        transactionHistory.add(new Transaction(type, amount, balance));
    }

    // Shared deposit logic
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
            return;
        }
        balance += amount;
        logTransaction("DEPOSIT", amount);
        System.out.printf("Deposited %.2f. New balance: %.2f%n", amount, balance);
    }

    // Each account type enforces its own withdrawal rules
    public abstract void withdraw(double amount) throws InsufficientFundsException;

    public abstract String getAccountType();

    public void displayInfo() {
        System.out.println("----------------------------------");
        System.out.println("Account No : " + accountNumber);
        System.out.println("Owner      : " + ownerName);
        System.out.println("Type       : " + getAccountType());
        System.out.printf("Balance    : %.2f%n", balance);
        System.out.println("----------------------------------");
    }

    // Prints the full transaction history (mini bank statement)

    public void printStatement() {
        System.out.println("\n=== Statement for " + accountNumber + " (" + ownerName + ") ===");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        for (Transaction t : transactionHistory) {
            System.out.println(t);
        }
    }

}
