import java.util.Scanner;

public class CharacterType2DArray {

    static String check(char ch) {
        if (!Character.isLetter(ch))
            return "Not Letter";

        ch = Character.toLowerCase(ch);
        if ("aeiou".indexOf(ch) != -1)
            return "Vowel";

        return "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) + " -> " + check(text.charAt(i)));
        }

        sc.close();
    }
}