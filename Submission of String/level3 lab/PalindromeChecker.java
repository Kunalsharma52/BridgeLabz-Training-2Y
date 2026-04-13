import java.util.Scanner;

public class PalindromeChecker {

    static boolean check(String text) {
        int i = 0, j = text.length() - 1;

        while (i < j) {
            if (text.charAt(i) != text.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(check(sc.next()));

        sc.close();
    }
}