import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        if (numbers[0] == numbers[4]) {
            System.out.println("The first and last numbers are equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("The first number is greater than the last number");
        } else {
            System.out.println("The first number is less than the last number");
        }
    }
}
