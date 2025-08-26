import java.util.Scanner;

public class intoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = sc.nextInt();

        int result1 = num1 + num2 * num3;
        int result2 = num1 * num2 + num3;
        int result3 = num3 + num1 / num2;
        int result4 = num1 % num2 + num3;

        System.out.println("Results of operations:");
        System.out.println("num1 + num2 * num3 = " + result1);
        System.out.println("num1 * num2 + num3 = " + result2);
        System.out.println("num3 + num1 / num2 = " + result3);
        System.out.println("num1 % num2 + num3 = " + result4);

        sc.close();
    }
}
