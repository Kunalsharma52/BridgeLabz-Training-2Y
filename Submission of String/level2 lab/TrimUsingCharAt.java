import java.util.Scanner;

public class TrimUsingCharAt {

    static String trim(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ')
            start++;

        while (end >= start && text.charAt(end) == ' ')
            end--;

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String manual = trim(text);
        String builtin = text.trim();

        System.out.println(manual.equals(builtin));

        sc.close();
    }
}