import java.util.Scanner;

public class StringLengthDemo {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();

        int lenManual = getLength(text);
        int lenBuiltIn = text.length();

        System.out.println("Length using charAt(): " + lenManual);
        System.out.println("Length using length(): " + lenBuiltIn);
    }
}
