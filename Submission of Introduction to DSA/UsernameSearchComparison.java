import java.util.*;

public class UsernameSearchComparison {

    static boolean linearSearch(String[] arr, String target) {
        for (String s : arr) {
            if (s.equals(target))
                return true;
        }
        return false;
    }

    static boolean binarySearch(String[] arr, String target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int cmp = arr[mid].compareTo(target);

            if (cmp == 0)
                return true;
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

    static boolean hashSearch(HashSet<String> set, String target) {
        return set.contains(target);
    }

    public static void main(String[] args) {

        String[] users = {"alice", "bob", "charlie", "david"};
        String target = "bob";

        Arrays.sort(users);

        System.out.println("Linear: " + linearSearch(users, target));
        System.out.println("Binary: " + binarySearch(users, target));

        HashSet<String> set = new HashSet<>(Arrays.asList(users));
        System.out.println("Hash: " + hashSearch(set, target));
    }
}