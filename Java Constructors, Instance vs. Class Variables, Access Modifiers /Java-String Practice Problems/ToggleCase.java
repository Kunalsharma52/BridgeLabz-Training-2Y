import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32); // convert to lowercase
            } else if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32); // convert to uppercase
            } else {
                result = result + ch; // keep other characters same
            }
        }

        System.out.println("Toggled string: " + result);
        sc.close();
    }
}
