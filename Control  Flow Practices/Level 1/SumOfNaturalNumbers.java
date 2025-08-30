import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int sumUsingLoop = 0;
            int i = 1;

            while (i <= n) {
                sumUsingLoop += i;
                i++;
            }

            int sumUsingFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sumUsingLoop);
            System.out.println("Sum using formula: " + sumUsingFormula);

            if (sumUsingLoop == sumUsingFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a mismatch in computations.");
            }
        }
        sc.close();
    }
}
