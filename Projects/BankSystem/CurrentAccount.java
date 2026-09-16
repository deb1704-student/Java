// CurrentAccount IS-A Account, allows overdraft up to a limit

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String ownerName, double initialBalance, double overdraftLimit) {
        super(accountNumber, ownerName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (getBalance() - amount < -overdraftLimit) {
            throw new InsufficientFundsException("Withdrawal denied: exceeds overdraft limit of " + overdraftLimit);
        }
        setBalance(getBalance() - amount);
        logTransaction("WITHDRAW", amount);
        System.out.printf("Withdrew %.2f. New balance: %.2f%n", amount, getBalance());
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }
}
