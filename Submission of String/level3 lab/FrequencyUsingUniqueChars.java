import java.util.Scanner;

public class FrequencyUsingUniqueChars {

    static void freq(String text) {
        for (int i = 0; i < text.length(); i++) {
            int count = 1;

            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j))
                    count++;
            }

            boolean printed = false;
            for (int k = 0; k < i; k++) {
                if (text.charAt(i) == text.charAt(k))
                    printed = true;
            }

            if (!printed)
                System.out.println(text.charAt(i) + " -> " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        freq(sc.nextLine());
        sc.close();
    }
}