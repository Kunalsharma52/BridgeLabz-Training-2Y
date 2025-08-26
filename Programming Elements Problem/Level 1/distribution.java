import java.util.Scanner;

public class distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of pens: ");
        int totalPens = sc.nextInt();

        System.out.print("Enter total number of students: ");
        int totalStudents = sc.nextInt();

        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        System.out.printf("Each student gets %d pen(s), and %d pen(s) remain undistributed.%n", pensPerStudent, remainingPens);

        sc.close();
    }
}
