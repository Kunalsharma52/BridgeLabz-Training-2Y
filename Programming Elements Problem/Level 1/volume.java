import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Earth in km: ");
        float radiusKm = sc.nextFloat();

        float radiusMiles = radiusKm * 0.621371f; // Convert km to miles

        double volumeKm3 = (4.0 / 3) * Math.PI * radiusKm * radiusKm * radiusKm;
        double volumeMiles3 = (4.0 / 3) * Math.PI * radiusMiles * radiusMiles * radiusMiles;

        System.out.println("Volume of Earth in cubic kilometers: " + volumeKm3);
        System.out.println("Volume of Earth in cubic miles: " + volumeMiles3);

        sc.close();
    }
}
