import java.util.Scanner;

public class SumNaturalNumbersComparison {
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursive(n - 1);
        }
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            int recursiveResult = sumRecursive(n);
            int formulaResult = sumFormula(n);

            System.out.println("Sum of first " + n + " natural numbers using recursion = " + recursiveResult);
            System.out.println("Sum of first " + n + " natural numbers using formula = " + formulaResult);

            if (recursiveResult == formulaResult) {
                System.out.println("Both computations are correct and match!");
            } else {
                System.out.println("Results do not match.");
            }
        }
    }
}
