import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        System.out.println("Manual: " + findLength(text));
        System.out.println("Built-in: " + text.length());

        sc.close();
    }
}