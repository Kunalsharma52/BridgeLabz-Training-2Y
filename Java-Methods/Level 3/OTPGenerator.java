import java.util.Arrays;

public class OTPGenerator {

    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000); // ensures 6-digit number
    }

    public static boolean checkUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // duplicate found
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are all OTPs unique? " + checkUnique(otps));
    }
}
