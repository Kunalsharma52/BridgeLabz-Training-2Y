import java.util.Scanner;

public class ShortestLongestWord {

    public static int getLength(String str) {
        int count = 0;
        while (true) {
            try {
                str.charAt(count);
                count++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    public static String[] splitWithCharAt(String str) {
        int len = getLength(str);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount + 2];
        spaceIndexes[0] = -1;
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[idx] = i;
                idx++;
            }
        }
        spaceIndexes[spaceCount + 1] = len;

        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word = word + str.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestLongest(String[][] wordsWithLengths) {
        int minLen = Integer.parseInt(wordsWithLengths[0][1]);
        int maxLen = Integer.parseInt(wordsWithLengths[0][1]);
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];

        for (int i = 1; i < wordsWithLengths.length; i++) {
            int len = Integer.parseInt(wordsWithLengths[i][1]);
            if (len < minLen) {
                minLen = len;
                shortest = wordsWithLengths[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = wordsWithLengths[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] words = splitWithCharAt(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        String[] result = findShortestLongest(wordsWithLengths);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
