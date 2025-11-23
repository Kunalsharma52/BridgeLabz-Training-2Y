import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {25, 32, 28, 45, 21};
        ArrayList<Integer> ageList = new ArrayList<>();

        for(int age : ages) ageList.add(age); // Auto-boxing

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Youngest: " + youngest);
        System.out.println("Oldest: " + oldest);
    }
}
