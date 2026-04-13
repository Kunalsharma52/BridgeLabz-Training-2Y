public class SubsetSumBacktracking {

    static boolean subset(int[] arr, int target, int index, int sum) {

        if (sum == target)
            return true;

        if (index >= arr.length || sum > target)
            return false;

        // include
        if (subset(arr, target, index + 1, sum + arr[index]))
            return true;

        // exclude
        return subset(arr, target, index + 1, sum);
    }

    public static void main(String[] args) {

        int[] arr = {3, 34, 4, 12, 5, 2};
        int target = 9;

        System.out.println("Subset exists: " + subset(arr, target, 0, 0));
    }
}