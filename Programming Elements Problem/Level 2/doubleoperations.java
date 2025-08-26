import java.util.Scanner;

public class doubleoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter number 2: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter number 3: ");
        double num3 = sc.nextDouble();

        double result1 = num1 + num2 * num3;
        double result2 = num1 * num2 + num3;
        double result3 = num3 + num1 / num2;
        double result4 = num1 % num2 + num3;

        System.out.println("Results of operations:");
        System.out.println("num1 + num2 * num3 = " + result1);
        System.out.println("num1 * num2 + num3 = " + result2);
        System.out.println("num3 + num1 / num2 = " + result3);
        System.out.println("num1 % num2 + num3 = " + result4);

        sc.close();
    }
}
