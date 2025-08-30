import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static boolean isPalindromeReverseArray(String str) {
        int len = str.length();
        char[] original = str.toCharArray();
        char[] reverse = new char[len];
        for (int i = 0; i < len; i++) {
            reverse[i] = str.charAt(len - 1 - i);
        }
        for (int i = 0; i < len; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();

        boolean resultIterative = isPalindromeIterative(text);
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean resultReverseArray = isPalindromeReverseArray(text);

        System.out.println("Palindrome check (Iterative): " + resultIterative);
        System.out.println("Palindrome check (Recursive): " + resultRecursive);
        System.out.println("Palindrome check (Reverse Array): " + resultReverseArray);
    }
}
