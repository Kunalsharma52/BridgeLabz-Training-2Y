import java.util.Scanner;

public class MatrixOperations {

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols for Matrix A: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter rows and cols for Matrix B: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        int[][] A = generateMatrix(r1, c1);
        int[][] B = generateMatrix(r2, c2);

        System.out.println("\nMatrix A:");
        printMatrix(A);
        System.out.println("\nMatrix B:");
        printMatrix(B);

        if (r1 == r2 && c1 == c2) {
            System.out.println("\nAddition:");
            printMatrix(addMatrix(A, B));
            System.out.println("\nSubtraction:");
            printMatrix(subtractMatrix(A, B));
        } else {
            System.out.println("\nAddition/Subtraction not possible due to dimension mismatch.");
        }

        if (c1 == r2) {
            System.out.println("\nMultiplication:");
            printMatrix(multiplyMatrix(A, B));
        } else {
            System.out.println("\nMultiplication not possible due to dimension mismatch.");
        }
    }
}
