import java.util.*;

public class VotingCount {
    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        String[] votingData = {
            "Aman", "Riya", "Aman", "Kunal", "Riya",
            "Aman", "Kunal", "Riya", "Aman", "Aman"
        };

        for (String c : votingData) {
            if (votes.containsKey(c))
                votes.put(c, votes.get(c) + 1);
            else
                votes.put(c, 1);
        }

        System.out.println("Total Votes:");
        for (String c : votes.keySet()) {
            System.out.println(c + " = " + votes.get(c));
        }

        String winner = "";
        int max = 0;

        for (String c : votes.keySet()) {
            if (votes.get(c) > max) {
                max = votes.get(c);
                winner = c;
            }
        }

        System.out.println("\nWinner: " + winner + " with " + max + " votes");
    }
}
