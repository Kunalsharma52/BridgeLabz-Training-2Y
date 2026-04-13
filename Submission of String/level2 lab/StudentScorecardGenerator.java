import java.util.*;

public class StudentScorecardGenerator {

    static String grade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();

            double percent = (p + c + m) / 3.0;
            percent = Math.round(percent * 100.0) / 100.0;

            System.out.println(percent + " -> " + grade(percent));
        }

        sc.close();
    }
}