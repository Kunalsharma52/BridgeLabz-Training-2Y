import java.util.Scanner;

public class DynamicDigitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int size = 5;
        int[] digits = new int[size];
        int index = 0;

        while (num != 0) {
            if (index == size) {
                size *= 2;
                int[] temp = new int[size];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = num % 10;
            num /= 10;
        }

        System.out.println("Digits stored successfully");
        sc.close();
    }
}