import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price (CP): ");
        int cp = sc.nextInt();

        System.out.print("Enter selling price (SP): ");
        int sp = sc.nextInt();

        int profit = sp - cp;
        int profitPercentage = (profit * 100) / cp;

        System.out.println("Cost Price: INR " + cp);
        System.out.println("Selling Price: INR " + sp);
        System.out.println("Profit: INR " + profit);
        System.out.println("Profit Percentage: " + profitPercentage + "%");

        sc.close();
    }
}
