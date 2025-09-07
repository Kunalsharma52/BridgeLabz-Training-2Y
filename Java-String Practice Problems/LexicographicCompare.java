import java.util.Scanner;

public class LexicographicCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int minLength = Math.min(str1.length(), str2.length());
        int result = 0;

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }

        if (result == 0 && str1.length() != str2.length()) {
            result = str1.length() - str2.length();
        }

        if (result == 0) {
            System.out.println("The strings are equal.");
        } else if (result < 0) {
            System.out.println("First string comes before the second string.");
        } else {
            System.out.println("First string comes after the second string.");
        }

        sc.close();
    }
}
