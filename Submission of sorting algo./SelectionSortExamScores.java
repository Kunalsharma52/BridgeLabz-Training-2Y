public class SelectionSortExamScores {

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {70, 85, 60, 90};

        selectionSort(scores);

        for (int s : scores)
            System.out.print(s + " ");
    }
}