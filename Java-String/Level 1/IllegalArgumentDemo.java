import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e);
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception occurred: " + e);
        }

        handleException(input);
    }
}
