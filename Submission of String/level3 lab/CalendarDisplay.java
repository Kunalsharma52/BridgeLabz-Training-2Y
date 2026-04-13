import java.util.Scanner;

public class CalendarDisplay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();

        String[] months = {"Jan","Feb","Mar","Apr","May","Jun",
                           "Jul","Aug","Sep","Oct","Nov","Dec"};

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println(months[month - 1] + " " + year);

        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.print(i + " ");
            if (i % 7 == 0) System.out.println();
        }

        sc.close();
    }
}