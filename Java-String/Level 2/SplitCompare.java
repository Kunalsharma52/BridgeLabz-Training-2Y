import java.util.Scanner;

public class SplitCompare {

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

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] wordsCharAt = splitWithCharAt(text);
        String[] wordsSplit = text.split(" ");

        boolean same = compareStringArrays(wordsCharAt, wordsSplit);

        System.out.println("Words using charAt():");
        for (String word : wordsCharAt) {
            System.out.println(word);
        }

        System.out.println("\nWords using split():");
        for (String word : wordsSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both results equal? " + same);
    }
}
