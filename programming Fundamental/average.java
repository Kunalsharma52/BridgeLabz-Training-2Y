import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter number 2: ");
        float num2 = sc.nextFloat();

        System.out.print("Enter number 3: ");
        float num3 = sc.nextFloat();

        float average = (num1 + num2 + num3) / 3;

        System.out.println("Average: " + average);

        sc.close();
    }
}
