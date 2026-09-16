import java.util.ArrayList;
import java.util.List;

// Bank HAS-A list of accounts (composition)
public class Bank {

    private List<Account> accounts;
    private int nextAccountNumber; // used to auto-generate account numbers

    public Bank() {
        accounts = new ArrayList<>();
        nextAccountNumber = 1001; // starting account number
    }

    // Generates a simple unique account number like "ACC1001"
    private String generateAccountNumber() {
        String accNo = "ACC" + nextAccountNumber;
        nextAccountNumber++;
        return accNo;
    }

    public String addSavingsAccount(String ownerName, double initialBalance, double minimumBalance,
            double interestRate) {
        String accNo = generateAccountNumber();
        SavingsAccount acc = new SavingsAccount(accNo, ownerName, initialBalance, minimumBalance, interestRate);
        accounts.add(acc);
        return accNo;
    }

    public String addCurrentAccount(String ownerName, double initialBalance, double overdraftLimit) {
        String accNo = generateAccountNumber();
        CurrentAccount acc = new CurrentAccount(accNo, ownerName, initialBalance, overdraftLimit);
        accounts.add(acc);
        return accNo;
    }

    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equalsIgnoreCase(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return accounts.isEmpty();
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank yet.");
            return;
        }

        System.out.println("\n=== All Bank Accounts ===");
        for (Account acc : accounts) {
            acc.displayInfo();
        }
    }

    // Transfer between two accounts, logging both sides of the transaction
    public void transfer(String fromAccNo, String toAccNo, double amount) {
        Account from = findAccount(fromAccNo);
        Account to = findAccount(toAccNo);

        if (from == null || to == null) {
            System.out.println("One or both account numbers not found.");
            return;
        }
        if (from == to) {
            System.out.println("Cannot transfer to the same account.");
            return;
        }

        try {
            from.withdraw(amount);
            from.getTransactionHistory().set(from.getTransactionHistory().size() - 1,
                    new Transaction("TRANSFER-OUT", amount, from.getBalance()));
            to.deposit(amount);
            to.getTransactionHistory().set(to.getTransactionHistory().size() - 1,
                    new Transaction("TRANSFER-IN", amount, to.getBalance()));
            System.out.println("Transfer Successful.");
        } catch (InsufficientFundsException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }

}
