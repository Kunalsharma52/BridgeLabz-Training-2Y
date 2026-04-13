import java.util.Scanner;

public class MatrixToArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter cols: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int[] arr = new int[r * c];
        int index = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
                arr[index++] = matrix[i][j];
            }
        }

        System.out.println("1D Array:");
        for (int x : arr)
            System.out.print(x + " ");

        sc.close();
    }
}