// A custom checked exception for when a withdrawal exceeds available Balance

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message){
        super(message); //pass message to parent Exception Class
    }
}
