import java.util.Scanner;

public class CharFrequencyUnique {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] uniqueCharacters(String str) {
        int len = getLength(str);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[index] = ch;
                index++;
            }
        }

        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    public static String[][] charFrequency(String str) {
        int len = getLength(str);
        char[] uniqueChars = uniqueCharacters(str);
        String[][] freqArr = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (str.charAt(j) == ch) count++;
            }
            freqArr[i][0] = String.valueOf(ch);
            freqArr[i][1] = String.valueOf(count);
        }
        return freqArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();

        String[][] freqResult = charFrequency(text);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < freqResult.length; i++) {
            System.out.println(freqResult[i][0] + "\t\t" + freqResult[i][1]);
        }
    }
}
