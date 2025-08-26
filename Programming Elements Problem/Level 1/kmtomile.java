import java.util.Scanner;

public class kmtomile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        float km = sc.nextFloat();

        float miles = km * 0.621371f;  // Convert km to miles

        System.out.println(km + " km is equal to " + miles + " miles.");

        sc.close();
    }
}
