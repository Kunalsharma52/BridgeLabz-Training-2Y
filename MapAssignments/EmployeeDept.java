import java.util.*;

public class EmployeeDept {
    public static void main(String[] args) {
        Map<String, String> dept = new HashMap<>();

        dept.put("Kunal", "IT");
        dept.put("Aman", "Finance");
        dept.put("Riya", "HR");

        for (String emp : dept.keySet())
            System.out.println(emp + " → " + dept.get(emp));
    }
}
