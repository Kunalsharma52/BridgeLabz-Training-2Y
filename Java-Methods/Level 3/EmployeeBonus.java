import java.util.Random;

public class EmployeeBonus {

    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000);
            int years = 1 + rand.nextInt(15);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] empData) {
        int n = empData.length;
        double[][] result = new double[n][2];
        for (int i = 0; i < n; i++) {
            int salary = empData[i][0];
            int years = empData[i][1];
            double bonus;
            if (years > 5) bonus = salary * 0.05;
            else bonus = salary * 0.02;
            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }
        return result;
    }

    public static void displayResults(int[][] empData, double[][] bonusData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.printf("%-5s %-10s %-10s %-12s %-12s %-12s%n",
                "ID", "Salary", "Years", "Bonus", "New Salary", "Company");
        for (int i = 0; i < empData.length; i++) {
            int oldSalary = empData[i][0];
            int years = empData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
            System.out.printf("%-5d %-10d %-10d %-12.2f %-12.2f %-12s%n",
                    (i + 1), oldSalary, years, bonus, newSalary, "Zara");
        }
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-5s %-10.2f %-10s %-12.2f %-12.2f%n",
                "Total", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] empData = generateEmployeeData(n);
        double[][] bonusData = calculateBonus(empData);
        displayResults(empData, bonusData);
    }
}
