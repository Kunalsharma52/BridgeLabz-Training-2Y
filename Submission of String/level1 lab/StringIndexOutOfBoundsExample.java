import java.util.Scanner;

public class StringIndexOutOfBoundsExample {

    static void handle(String text) {
        try {
            System.out.println(text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled Exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        handle(sc.next());
        sc.close();
    }
}