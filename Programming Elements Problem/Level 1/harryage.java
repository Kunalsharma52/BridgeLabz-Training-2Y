import java.util.Scanner;

public class harryage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the birth year: ");
        int birthYear = sc.nextInt();

        int ageIn2024 = 2024 - birthYear;

        System.out.printf("Harry's age in 2024 is %d%n", ageIn2024);

        sc.close();
    }
}

