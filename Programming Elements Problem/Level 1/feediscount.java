import java.util.Scanner;

public class feediscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total fee: ");
        int totalFee = sc.nextInt();

        int discount = totalFee / 10;
        int finalFee = totalFee - discount;

        System.out.printf("The discount amount is INR %d and the final discounted fee is INR %d%n", discount, finalFee);

        sc.close();
    }
}
