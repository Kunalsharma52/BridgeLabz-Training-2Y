import java.util.Scanner;

public class purchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        int unitPrice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        int totalPrice = unitPrice * quantity;

        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: INR " + unitPrice);
        System.out.println("Total Purchase Price: INR " + totalPrice);

        sc.close();
    }
}
