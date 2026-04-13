import java.util.Arrays;

public class SortingDecisionDemo {

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 3};

        insertionSort(arr);
        System.out.println("Insertion: " + Arrays.toString(arr));

        int[] arr2 = {5, 2, 9, 1, 3};
        bubbleSort(arr2);
        System.out.println("Bubble: " + Arrays.toString(arr2));
    }
}