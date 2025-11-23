import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> capital = new HashMap<>();

        capital.put("India", "Delhi");
        capital.put("USA", "Washington DC");
        capital.put("Japan", "Tokyo");

        String search = "Japan";

        if (capital.containsKey(search))
            System.out.println("Capital: " + capital.get(search));
        else
            System.out.println("Country not found");
    }
}
