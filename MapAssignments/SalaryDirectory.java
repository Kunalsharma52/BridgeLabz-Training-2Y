import java.util.*;

public class SalaryDirectory {
    public static void main(String[] args) {
        Map<String, Integer> salary = new HashMap<>();

        salary.put("Kunal", 35000);
        salary.put("Aman", 42000);
        salary.put("Riya", 38000);

        salary.put("Riya", 40000);

        for (String emp : salary.keySet())
            System.out.println(emp + " = " + salary.get(emp));
    }
}
