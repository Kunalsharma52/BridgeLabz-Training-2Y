import java.util.Scanner;

public class SubstringCompare {
    public static String substringWithCharAt(String str, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub = sub + str.charAt(i);
        }
        return sub;
    }

    public static boolean compareWithCharAt(String s1, String s2) {
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
        System.out.println("Enter a string:");
        String text = sc.next();
        System.out.println("Enter start index:");
        int start = sc.nextInt();
        System.out.println("Enter end index:");
        int end = sc.nextInt();

        String subCharAt = substringWithCharAt(text, start, end);
        String subBuiltIn = text.substring(start, end);

        System.out.println("Substring using charAt(): " + subCharAt);
        System.out.println("Substring using substring(): " + subBuiltIn);

        boolean same = compareWithCharAt(subCharAt, subBuiltIn);
        System.out.println("Are both substrings equal? " + same);
    }
}
