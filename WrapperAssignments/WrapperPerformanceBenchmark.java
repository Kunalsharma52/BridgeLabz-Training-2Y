import java.util.ArrayList;

public class WrapperPerformanceBenchmark {
    public static void main(String[] args) {
        int n = 1_000_000;

        // ArrayList<Integer>
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for(int i=0;i<n;i++) list.add(i); // auto-boxing
        long sum = 0;
        for(int x : list) sum += x; // auto-unboxing
        long end = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> sum = " + sum + " time = " + (end-start) + " ms");

        // int[]
        int[] arr = new int[n];
        start = System.currentTimeMillis();
        for(int i=0;i<n;i++) arr[i] = i;
        sum = 0;
        for(int x : arr) sum += x;
        end = System.currentTimeMillis();
        System.out.println("int[] sum = " + sum + " time = " + (end-start) + " ms");
    }
}
