import java.util.*;

public class MissingPositiveAndBinarySearch {

    static int missing(int[] arr) {
        Arrays.sort(arr);

        int expected = 1;

        for (int num : arr) {
            if (num == expected)
                expected++;
        }
        return expected;
    }

    static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (arr[m] == target) return m;
            else if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};

        System.out.println("Missing: " + missing(arr));

        Arrays.sort(arr);
        System.out.println("Index: " + binarySearch(arr, 3));
    }
}