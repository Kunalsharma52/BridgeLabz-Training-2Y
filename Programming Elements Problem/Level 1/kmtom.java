import java.util.Scanner;

public class kmtom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        double km = sc.nextDouble();

        double miles = km * 0.621371;  // Convert km to miles

        System.out.println(km + " km is equal to " + miles + " miles.");

        sc.close();
    }
}
