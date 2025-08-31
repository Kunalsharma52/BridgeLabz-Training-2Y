import java.util.Scanner;

public class CollinearPoints {

    // Method using slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // To avoid division, use cross multiplication
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1) &&
               (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    // Method using area of triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1, y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3, y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean slopeCheck = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaCheck = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nUsing Slope Formula: " + (slopeCheck ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Formula: " + (areaCheck ? "Collinear" : "Not Collinear"));
    }
}
