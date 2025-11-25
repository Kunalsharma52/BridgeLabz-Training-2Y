import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        Map<String, Boolean> attendance = new HashMap<>();

        attendance.put("Kunal", true);
        attendance.put("Riya", false);
        attendance.put("Aman", true);
        attendance.put("Neha", false);

        System.out.println("Present Students:");
        for (String name : attendance.keySet()) {
            if (attendance.get(name))
                System.out.println(name);
        }
    }
}
