import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Represents a single transaction record for an account
public class Transaction {
    private String type;
    private double amount;
    private double balanceAfter;
    private LocalDateTime timestamp;

    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.timestamp = LocalDateTime.now(); // captures the exact amount
    }

    // Formats the transaction as a readable line for statements
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return String.format("[%s] %-14s Amount: %10.2f | Balance After: %10.2f", timestamp.format(formatter), type,
                amount, balanceAfter);
    }
}
