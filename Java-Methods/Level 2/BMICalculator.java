import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and update array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];         // weight in kg
            double heightCm = data[i][1];       // height in cm
            double heightM = heightCm / 100;    // convert to meters
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;                   // store BMI in 3rd column
        }
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] teamData = new double[10][3];  // 10 persons, 3 columns: weight, height, BMI

        // Take input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            teamData[i][1] = sc.nextDouble();
        }

        // Calculate BMI for all persons
        calculateBMI(teamData);

        // Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < 10; i++) {
            double weight = teamData[i][0];
            double height = teamData[i][1];
            double bmi = teamData[i][2];
            String status = getBMIStatus(bmi);

            System.out.printf("Person %d -> Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s\n",
                    (i + 1), weight, height, bmi, status);
        }
    }
}
