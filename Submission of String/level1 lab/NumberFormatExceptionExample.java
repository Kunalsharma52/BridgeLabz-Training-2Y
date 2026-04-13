import java.util.Scanner;

public class NumberFormatExceptionExample {

    static void handle(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        handle(sc.next());
        sc.close();
    }
}