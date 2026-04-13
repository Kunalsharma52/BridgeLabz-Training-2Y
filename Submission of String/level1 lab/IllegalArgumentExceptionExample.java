import java.util.Scanner;

public class IllegalArgumentExceptionExample {

    static void handle(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (Exception e) {
            System.out.println("Handled Exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        handle(sc.next());
        sc.close();
    }
}