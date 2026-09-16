public class ScoreBoard {
    private int wins = 0;
    private int losses = 0;
    private int totalAttemptsOnWins = 0;

    // Called when the player guess correctly
    public void recordWin(int attempts) {
        wins++;
        totalAttemptsOnWins += attempts;
        System.out.println("Solved in " + attempts + " attempts ");
    }

    // Called when the player runs out of attempts
    public void recordLoss() {
        losses++;
    }

    // Prints a Summary of overall performance
    public void printSummary() {
        System.out.println("\n===Game Summary===");
        System.out.println("Wins : " + wins);
        System.out.println("Losses : " + losses);

        if (wins > 0) {
            double avgAttempts = (double) totalAttemptsOnWins / wins;
            System.out.printf("Average attempts per win : %.2f%n", avgAttempts);
        }
    }
}
