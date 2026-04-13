import java.util.Scanner;

public class AverageTemperatureCalculator {

    static double calculateAverage(int[] temp) {
        int sum = 0;

        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }

        return (double) sum / temp.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println(calculateAverage(temp));
        }

        sc.close();
    }
}