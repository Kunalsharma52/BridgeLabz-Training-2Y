import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter perimeter of the square: ");
        int perimeter = sc.nextInt();

        int side = perimeter / 4;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Length of each side: " + side);

        sc.close();
    }
}
