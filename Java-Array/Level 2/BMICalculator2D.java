import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
            double w = sc.nextDouble();
            while (w <= 0) {
                System.out.print("Invalid! Enter positive weight: ");
                w = sc.nextDouble();
            }

            System.out.print("Enter height of person " + (i + 1) + " in meters: ");
            double h = sc.nextDouble();
            while (h <= 0) {
                System.out.print("Invalid! Enter positive height: ");
                h = sc.nextDouble();
            }

            personData[i][0] = w;
            personData[i][1] = h;
        }

        for (int i = 0; i < n; i++) {
            double w = personData[i][0];
            double h = personData[i][1];
            double bmi = w / (h * h);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) +
                    ": Height = " + personData[i][1] + " m, " +
                    "Weight = " + personData[i][0] + " kg, " +
                    "BMI = " + personData[i][2] + ", " +
                    "Status = " + weightStatus[i]);
        }
    }
}
