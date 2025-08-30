import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[3][2];
        stats[0][0] = "User Wins"; stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins"; stats[1][1] = String.valueOf(computerWins);
        stats[2][0] = "Draws"; stats[2][1] = String.valueOf(draws);
        return stats;
    }

    public static void displayResults(String[] userChoices, String[] computerChoices, String[] winners, String[][] stats, int totalGames) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < totalGames; i++) {
            System.out.println((i+1) + "\t" + userChoices[i] + "\t" + computerChoices[i] + "\t\t" + winners[i]);
        }
        System.out.println("\nOverall Stats:");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + ": " + stats[i][1]);
        }
        double userPercent = ((double)Integer.parseInt(stats[0][1])/totalGames)*100;
        double computerPercent = ((double)Integer.parseInt(stats[1][1])/totalGames)*100;
        System.out.println("\nWinning Percentage:");
        System.out.printf("User: %.2f%%\n", userPercent);
        System.out.printf("Computer: %.2f%%\n", computerPercent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of games:");
        int totalGames = sc.nextInt();
        sc.nextLine();

        String[] userChoices = new String[totalGames];
        String[] computerChoices = new String[totalGames];
        String[] winners = new String[totalGames];
        int userWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.println("Game " + (i+1) + " - Enter your choice (Rock, Paper, Scissors):");
            String userChoice = sc.nextLine();
            String computerChoice = getComputerChoice();

            userChoices[i] = userChoice;
            computerChoices[i] = computerChoice;
            String winner = findWinner(userChoice, computerChoice);
            winners[i] = winner;
