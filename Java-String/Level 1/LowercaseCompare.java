import java.util.Scanner;

public class LowercaseCompare {

    public static String toLowerWithCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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

        String lowerCharAt = toLowerWithCharAt(text);
        String lowerBuiltIn = text.toLowerCase();

        boolean same = compareStrings(lowerCharAt, lowerBuiltIn);

        System.out.println("Lowercase using charAt(): " + lowerCharAt);
        System.out.println("Lowercase using toLowerCase(): " + lowerBuiltIn);
        System.out.println("Are both lowercase strings equal? " + same);
    }
}
