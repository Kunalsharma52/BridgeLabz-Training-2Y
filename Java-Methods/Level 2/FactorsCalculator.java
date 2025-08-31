import java.util.Scanner;

public class FactorsCalculator {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum = sum + factors[i];
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product = product * factors[i];
        }
        return product;
    }

    public static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum = sum + (int)Math.pow(factors[i], 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("The factors are: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        int sum = sumOfFactors(factors);
        int product = productOfFactors(factors);
        int sumSquares = sumOfSquares(factors);

        System.out.println("Sum of factors = " + sum);
        System.out.println("Product of factors = " + product);
        System.out.println("Sum of squares of factors = " + sumSquares);
    }
}
