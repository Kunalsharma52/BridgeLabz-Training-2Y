import java.util.*;

public class PrerequisiteChecker {

    // Implementation A (Brute Force)
    static boolean checkA(int[] completed, int[] prereq) {

        for (int i = 0; i < prereq.length; i++) {
            boolean found = false;

            for (int j = 0; j < completed.length; j++) {
                if (prereq[i] == completed[j]) {
                    found = true;
                    break;
                }
            }

            if (!found)
                return false;
        }
        return true;
    }

    // Implementation B (HashSet)
    static boolean checkB(int[] completed, int[] prereq) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : completed)
            set.add(num);

        for (int num : prereq) {
            if (!set.contains(num))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int[] completed = {1, 2, 3, 4, 5};
        int[] prereq = {2, 3};

        System.out.println("Brute: " + checkA(completed, prereq));
        System.out.println("Hash: " + checkB(completed, prereq));
    }
}