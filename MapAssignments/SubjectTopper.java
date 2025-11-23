import java.util.*;

public class SubjectTopper {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();

        marks.put("Kunal", 85);
        marks.put("Aman", 92);
        marks.put("Riya", 78);

        int max = -1;
        String topper = "";

        for (String s : marks.keySet()) {
            if (marks.get(s) > max) {
                max = marks.get(s);
                topper = s;
            }
        }

        System.out.println("Topper: " + topper + " (" + max + ")");
    }
}
