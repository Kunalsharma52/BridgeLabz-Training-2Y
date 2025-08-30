import java.util.Scanner;

public class CharFrequency {

    public static String[][] findCharFrequency(String str) {
        int[] freq = new int[256];
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        String[][] result = new String[256][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                index++;
            }
        }

        String[][] freqArr = new String[index][2];
        for (int i = 0; i < index; i++) {
            freqArr[i][0] = result[i][0];
            freqArr[i][1] = result[i][1];
        }
        return freqArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();

        String[][] freqResult = findCharFrequency(text);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < freqResult.length; i++) {
            System.out.println(freqResult[i][0] + "\t\t" + freqResult[i][1]);
        }
    }
}
