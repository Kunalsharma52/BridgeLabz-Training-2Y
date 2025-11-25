import java.util.*;

public class WebsiteVisits {
    public static void main(String[] args) {
        Map<String, Integer> visits = new HashMap<>();

        visits.put("Google", 5);
        visits.put("Instagram", 3);
        visits.put("YouTube", 10);

        visits.put("Google", visits.get("Google") + 2);

        for (String site : visits.keySet())
            System.out.println(site + " = " + visits.get(site));
    }
}
