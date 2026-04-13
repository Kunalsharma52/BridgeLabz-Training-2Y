import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number");
            return;
        }

        int[] odd = new int[n];
        int[] even = new int[n];
        int o = 0, e = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                even[e++] = i;
            else
                odd[o++] = i;
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < o; i++)
            System.out.print(odd[i] + " ");

        System.out.println("\nEven Numbers:");
        for (int i = 0; i < e; i++)
            System.out.print(even[i] + " ");

        sc.close();
    }
}