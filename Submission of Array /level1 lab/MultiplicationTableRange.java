import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] arr = new int[4];

        for (int i = 6; i <= 9; i++) {
            arr[i - 6] = num * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + arr[i - 6]);
        }

        sc.close();
    }
}