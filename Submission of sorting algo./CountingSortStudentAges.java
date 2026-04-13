public class CountingSortStudentAges {

    static void countingSort(int[] arr) {
        int max = 18;
        int min = 10;

        int[] count = new int[max + 1];

        for (int num : arr)
            count[num]++;

        int index = 0;

        for (int i = min; i <= max; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 10, 14};

        countingSort(ages);

        for (int a : ages)
            System.out.print(a + " ");
    }
}