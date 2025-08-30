import java.util.Scanner;

public class VotingEligibility {

    public static int[] getAges(int n) {
        int[] ages = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter age of student " + (i + 1) + ":");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    public static void display2DArray(String[][] arr) {
        System.out.println("Age\tVoting Status");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = getAges(10);
        String[][] votingStatus = checkVotingEligibility(ages);
        display2DArray(votingStatus);
    }
}

