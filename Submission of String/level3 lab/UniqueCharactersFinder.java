import java.util.Scanner;

public class UniqueCharactersFinder {

    static char[] unique(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique)
                temp[index++] = text.charAt(i);
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] res = unique(sc.next());

        for (char c : res)
            System.out.print(c + " ");

        sc.close();
    }
}