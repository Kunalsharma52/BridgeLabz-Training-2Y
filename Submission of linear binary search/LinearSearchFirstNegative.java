public class LinearSearchFirstNegative {

    static int find(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, -2, 9};

        System.out.println(find(arr));
    }
}