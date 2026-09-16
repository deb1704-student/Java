import java.util.Random;
import java.util.Scanner;

public class Game {

    // Instance Variables (States of the game)
    private Scanner scanner;
    private Random random;
    private ScoreBoard scoreBoard;

    // Constructor: Initializes dependencies
    public Game(Scanner scanner) {
        this.scanner = scanner;
        this.random = new Random();
        this.scoreBoard = new ScoreBoard();
    }

    // Public Method to start the game loop
    public void start() {
        System.out.println("===Welcome to the Number Guessing Game===");

        boolean playAgain = true;

        while (playAgain) {
            playRound();
            playAgain = askToPlayAgain();
        }

        // Show final Stats when the player quits
        scoreBoard.printSummary();
        System.out.println("Thanks for playing! ");
    }

    // Handles a single Round of guessing
    private void playRound() {
        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int attempts = 0;
        int maxAttempts = 7;
        boolean guessedCorrectly = false;

        System.out.println("\n I'm thinking of a number between " + lowerBound + " and " + upperBound + ".You have "
                + maxAttempts + " attempts.");

        while (attempts < maxAttempts && !guessedCorrectly) {
            int guess = getValidGuess(lowerBound, upperBound);
            attempts++;

            guessedCorrectly = checkGuess(guess, secretNumber);

            if (!guessedCorrectly) {
                int remaining = maxAttempts - attempts;
                if (remaining > 0) {
                    System.out.println("Attempts left: " + remaining);
                }
            }
        }

        // Update Score Board based on result
        if (guessedCorrectly) {
            scoreBoard.recordWin(attempts);
        } else {
            System.out.println("Out of attempts! the number was: " + secretNumber);
            scoreBoard.recordLoss();
        }
    }

    // Reads and Validates user input so the game doesn't crash on bad input
    private int getValidGuess(int lower, int upper) {
        int guess = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Enter your guess (" + lower + "-" + upper + "):");
            String input = scanner.next();

            try {
                guess = Integer.parseInt(input);
                if (guess < lower || guess > upper) {
                    System.out.println("Please enter a number within range.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number. Try again.");
            }
        }
        return guess;
    }

    // Compare guess to secret number and give feedback
    private boolean checkGuess(int guess, int secretNumber) {
        if (guess == secretNumber) {
            System.out.println("Correct! You Guessed it!");
            return true;
        } else if (guess < secretNumber) {
            System.out.println("Too low.");
            return false;
        } else {
            System.out.println("Too high.");
            return false;
        }
    }

    // Asks the player if they want another round
    private boolean askToPlayAgain() {
        System.out.println("\nPlay again ? (y/n):");
        String response = scanner.next();
        return response.equalsIgnoreCase("y");
    }
}
