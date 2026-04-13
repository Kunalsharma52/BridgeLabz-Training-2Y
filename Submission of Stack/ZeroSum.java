import java.util.*;

class ZeroSum {
    static void findSubarrays(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0 || map.containsKey(sum)) {
                System.out.println("Subarray exists");
            }
            map.put(sum, i);
        }
    }
}