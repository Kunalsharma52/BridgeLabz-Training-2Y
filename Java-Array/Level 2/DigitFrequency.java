import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        int[] digits = new int[count];
        int index = 0;
        temp = number;
        while (temp > 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("Digit Frequency in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
