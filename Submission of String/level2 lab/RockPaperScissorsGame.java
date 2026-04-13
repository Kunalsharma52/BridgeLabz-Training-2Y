import java.util.*;

public class RockPaperScissorsGame {

    static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[new Random().nextInt(3)];
    }

    static String winner(String user, String comp) {
        if (user.equals(comp)) return "Draw";

        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int games = sc.nextInt();
        int userWin = 0, compWin = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = getComputerChoice();

            String result = winner(user, comp);

            if (result.equals("User")) userWin++;
            else if (result.equals("Computer")) compWin++;

            System.out.println(user + " vs " + comp + " -> " + result);
        }

        System.out.println("User Wins: " + userWin);
        System.out.println("Computer Wins: " + compWin);

        sc.close();
    }
}