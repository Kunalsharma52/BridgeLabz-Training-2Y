import java.util.Scanner;

public class VotingEligibility2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[10];

        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();
        }

        for (int a : age) {
            if (a >= 18)
                System.out.println(a + " -> Can Vote");
            else
                System.out.println(a + " -> Cannot Vote");
        }

        sc.close();
    }
}