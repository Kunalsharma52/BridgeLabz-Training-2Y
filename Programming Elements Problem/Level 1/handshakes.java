import java.util.Scanner;

public class handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int totalHandshakes = (n * (n - 1)) / 2;

        System.out.printf("Total handshakes: %d%n", totalHandshakes);

        sc.close();
    }
}
