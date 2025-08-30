import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int[] digits = new int[count];
        int index = 0;
        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[i];
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }
        System.out.println();
    }
}
