import java.util.*;

public class BankSystem {
    public static void main(String[] args) {
        Map<String, Integer> balance = new HashMap<>();

        balance.put("Kunal", 5000);
        balance.put("Riya", 8000);

        balance.put("Kunal", balance.get("Kunal") + 2000);
        balance.put("Riya", balance.get("Riya") - 3000);

        for (String acc : balance.keySet())
            System.out.println(acc + " = " + balance.get(acc));
    }
}
