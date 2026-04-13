import java.util.Scanner;

public class WordsWithLength2DArray {

    static String[][] getWordsWithLength(String text) {
        String[] words = text.split(" ");
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String[][] result = getWordsWithLength(text);

        for (String[] row : result) {
            System.out.println(row[0] + " -> " + row[1]);
        }

        sc.close();
    }
}