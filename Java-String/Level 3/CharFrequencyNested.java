import java.util.Scanner;

public class CharFrequencyNested {

    public static String[][] charFrequency(String str) {
        int len = str.length();
        char[] chars = new char[len];
        int[] freq = new int[len];

        for (int i = 0; i < len; i++) {
            chars[i] = str.charAt(i);
            freq[i] = 1;
        }

        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') continue;
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') count++;
        }

        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index][0] = String.valueOf(chars[i]);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return result;
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
