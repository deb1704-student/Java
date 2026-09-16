// SavingsAccount IS-A Account, with a minimum balance rule and interest

public class SavingsAccount extends Account {

    private double minimumBalance;
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double initialBalance, double minimumBalance,
            double interestRate) {
        super(accountNumber, ownerName, initialBalance);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (getBalance() - amount < minimumBalance) {
            throw new InsufficientFundsException(
                    "Withdrawal denied: minimum balance of " + minimumBalance + " must be maintained.");
        }
        setBalance(getBalance() - amount);
        logTransaction("WITHDRAW", amount);
        System.out.printf("Withdrew %.2f. New balance: %.2f%n", amount, getBalance());
    }

    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.printf("Interest applied: %.2f%n", interest);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}
