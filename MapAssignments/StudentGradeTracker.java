import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {

        Map<String, Double> grades = new HashMap<>();

        grades.put("Kunal", 85.0);
        grades.put("Aman", 78.5);
        grades.put("Riya", 92.0);
        grades.put("Neha", 66.0);
        grades.put("Arjun", 88.0);

        grades.put("Aman", 82.0);

        grades.remove("Neha");

        Map<String, Double> sorted = new TreeMap<>(grades);

        for (String name : sorted.keySet()) {
            System.out.println(name + " = " + sorted.get(name));
        }
    }
}
