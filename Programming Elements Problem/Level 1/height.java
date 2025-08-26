import java.util.Scanner;

public class height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        float h = sc.nextFloat();

        float inches = h / 2.54f;
        float feet = inches / 12;

        System.out.println("Your height is " + h + " cm");
        System.out.println("Your height in inches: " + inches);
        System.out.println("Your height in feet: " + feet);

        sc.close();
    }
}
