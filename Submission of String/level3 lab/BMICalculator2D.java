import java.util.Scanner;

public class BMICalculator2D {

    static String[][] calculate(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;

            double bmi = weight / (height * height);
            String status = (bmi < 18.5) ? "Underweight" :
                            (bmi < 25) ? "Normal" : "Overweight";

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[3][2];

        for (int i = 0; i < 3; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] res = calculate(data);

        for (String[] r : res)
            System.out.println(r[0] + " " + r[1] + " " + r[2] + " " + r[3]);

        sc.close();
    }
}