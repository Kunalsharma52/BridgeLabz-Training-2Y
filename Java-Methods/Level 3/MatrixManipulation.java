import java.util.Scanner;

public class MatrixManipulation {

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / (double) det;
        inv[0][1] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]) / (double) det;
        inv[0][2] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / (double) det;

        inv[1][0] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]) / (double) det;
        inv[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / (double) det;
        inv[1][2] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]) / (double) det;

        inv[2][0] = (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / (double) det;
        inv[2][1] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]) / (double) det;
        inv[2][2] = (m[0][0] * m[1][1] - m[0][1] * m[1][0]) / (double) det;

        return inv;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (2 or 3): ");
        int n = sc.nextInt();

        int[][] matrix = generateMatrix(n, n);
        System.out.println("\nMatrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose:");
        printMatrix(transpose(matrix));

        if (n == 2) {
            int det = determinant2x2(matrix);
            System.out.println("\nDeterminant: " + det);
            double[][] inv = inverse2x2(matrix);
            if (inv != null) {
                System.out.println("\nInverse:");
                printMatrix(inv);
            } else {
                System.out.println("\nInverse does not exist (det=0).");
            }
        } else if (n == 3) {
            int det = determinant3x3(matrix);
            System.out.println("\nDeterminant: " + det);
            double[][] inv = inverse3x3(matrix);
            if (inv != null) {
                System.out.println("\nInverse:");
                printMatrix(inv);
            } else {
                System.out.println("\nInverse does not exist (det=0).");
            }
        } else {
            System.out.println("Only 2x2 or 3x3 supported.");
        }
    }
}
