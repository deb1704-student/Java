import java.util.Scanner;

public class Main {

    private static Bank bank = new Bank();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println(" WELCOME TO JAVA CONSOLE BANK ");
        System.out.println("===============================");

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Enter Your Choice : ");

            switch (choice) {
                case 1 -> openAccount();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> transferMoney();
                case 5 -> checkBalance();
                case 6 -> printStatement();
                case 7 -> applyInterest();
                case 8 -> bank.displayAllAccounts();
                case 9 -> {
                    System.out.println("Thank you for banking with us. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please select a valid option. ");
            }
        }
        scanner.close();
    }

    // Display the main menu
    private static void printMenu() {
        System.out.println("\n---------- MAIN MENU ----------");
        System.out.println("1. Open New Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Transfer Money");
        System.out.println("5. Check Balance");
        System.out.println("6. View Mini Statement");
        System.out.println("7. Apply Interest (Savings Only)");
        System.out.println("8. View All Accounts");
        System.out.println("9. Exit");
        System.out.println("--------------------------------");
    }

    // Handles opening a new account, Savings or Current
    private static void openAccount() {
        System.out.println("\n--- Open New Account ---");
        System.out.print("Enter account type (1 = Savings, 2 = Current): ");
        int type = readInt("");

        System.out.print("Enter Your Name : ");
        String name = scanner.next();
        while (scanner.hasNextLine() && !scanner.nextLine().isBlank()) {
            break; // consumes rest of line if the name had space; safeguard
        }

        double initialBalance = readDouble("Enter initial deposit amount : ");

        if (type == 1) {
            double minBalance = readDouble("Enter minimum balance to maintain : ");
            double interestRate = readDouble("Enter annual interest rate (%): ");
            String accNo = bank.addSavingsAccount(name, initialBalance, minBalance, interestRate);
            System.out.println("Savings Account created successfully! Account No: " + accNo);
        } else if (type == 2) {
            double overdraftLimit = readDouble("Enter overdraft limit: ");
            String accNo = bank.addCurrentAccount(name, initialBalance, overdraftLimit);
            System.out.println("Current Account created successfully! Account No: " + accNo);
        } else {
            System.out.println("Invalid account type selected.");
        }
    }

    // Handles deposits based on account number entered by user
    private static void depositMoney() {
        if (bank.isEmpty()) {
            System.out.println("No accounts exist yet. Please open an account first.");
            return;
        }
        Account acc = findAccountByPrompt();
        if (acc == null) {
            return;
        }
        double amount = readDouble("Enter amount to deposit: ");
        acc.deposit(amount);
    }

    // Handles withdrawals , catching the custom exception
    private static void withdrawMoney() {
        if (bank.isEmpty()) {
            System.out.println("No accounts exist yet. Please open an account first.");
            return;
        }
        Account acc = findAccountByPrompt();
        if (acc == null) {
            return;
        }
        double amount = readDouble("Enter amount to deposit: ");
        try {
            acc.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Handles money transfer between two accounts
    private static void transferMoney() {
        if (bank.isEmpty()) {
            System.out.println("No accounts exist yet. Please open an account first.");
            return;
        }
        System.out.println("Enter sender account number: ");
        String from = scanner.next();
        System.out.print("Enter receiver account number: ");
        String to = scanner.next();
        double amount = readDouble("Enter amount to transfer: ");

        bank.transfer(from, to, amount);
    }

    // Displays current balance for a given account
    private static void checkBalance() {
        if (bank.isEmpty()) {
            System.out.println("No accounts exist yet. Please open an account first.");
            return;
        }
        Account acc = findAccountByPrompt();
        if (acc == null) {
            return;
        }
        System.out.printf("Current Balance: %.2f%n", acc.getBalance());
    }

    // Prints transaction history for an account
    private static void printStatement() {
        if (bank.isEmpty()) {
            System.out.println("No accounts exist yet. Please open an account first.");
            return;
        }
        Account acc = findAccountByPrompt();
        if (acc == null) {
            return;
        }

        acc.printStatement();
    }

    // Applies interest, but only works if the account is actually a SavingsAccount
    private static void applyInterest() {
        if (bank.isEmpty()) {
            System.out.println("No accounts exist yet. Please open an account first.");
            return;
        }
        Account acc = findAccountByPrompt();
        if (acc == null) {
            return;
        }

        // instanceof check + downcast: needed because applyInterest() only exists on
        // SavingsAccount
        if (acc instanceof SavingsAccount savings) {
            savings.applyInterest();
        } else {
            System.out.println("Interest can only be applied to Savings Accounts.");
        }
    }

    // Shared helper: prompts for an account number and looks it up
    private static Account findAccountByPrompt() {
        System.out.print("Enter account number: ");
        String accNo = scanner.next();
        Account acc = bank.findAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found.");
        }
        return acc;
    }

    // Safe integer input — won't crash the program on bad input
    private static int readInt(String prompt) {
        if (!prompt.isEmpty()) {
            System.out.print(prompt);
        }
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Safe double input — won't crash the program on bad input
    private static double readDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

}
