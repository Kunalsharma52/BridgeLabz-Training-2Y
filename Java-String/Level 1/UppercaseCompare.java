import java.util.Scanner;

public class UppercaseCompare {

    public static String toUpperWithCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result = result + ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String upperCharAt = toUpperWithCharAt(text);
        String upperBuiltIn = text.toUpperCase();

        boolean same = compareStrings(upperCharAt, upperBuiltIn);

        System.out.println("Uppercase using charAt(): " + upperCharAt);
        System.out.println("Uppercase using toUpperCase(): " + upperBuiltIn);
        System.out.println("Are both uppercase strings equal? " + same);
    }
}
