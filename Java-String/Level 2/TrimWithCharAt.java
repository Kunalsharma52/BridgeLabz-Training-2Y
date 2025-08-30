import java.util.Scanner;

public class TrimWithCharAt {

    public static int[] getTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String substringWithCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
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
        System.out.println("Enter text with spaces:");
        String text = sc.nextLine();

        int[] indices = getTrimIndices(text);
        String trimmedCharAt = substringWithCharAt(text, indices[0], indices[1]);
        String trimmedBuiltIn = text.trim();

        boolean same = compareStrings(trimmedCharAt, trimmedBuiltIn);

        System.out.println("Trimmed using charAt(): \"" + trimmedCharAt + "\"");
        System.out.println("Trimmed using trim():    \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both trimmed strings equal? " + same);
    }
}
