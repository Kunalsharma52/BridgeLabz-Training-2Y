import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        int base = sc.nextInt();

        System.out.print("Enter height in cm: ");
        int height = sc.nextInt();

        double areaInInches = 0.5 * (base / 2.54) * (height / 2.54);
        int areaInCm = (int)(0.5 * base * height);

        System.out.println("Area in square centimeters: " + areaInCm);
        System.out.println("Area in square inches: " + areaInInches);

        sc.close();
    }
}
