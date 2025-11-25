interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[@#$%^&+=!].*");
    }
}

public class PSV {
    public static void main(String[] args) {
        String password1 = "Abc@1234";
        String password2 = "weakpass";

        if (SecurityUtils.isStrongPassword(password1))
            System.out.println(password1 + " is a strong password.");
        else
            System.out.println(password1 + " is a weak password.");

        if (SecurityUtils.isStrongPassword(password2))
            System.out.println(password2 + " is a strong password.");
        else
            System.out.println(password2 + " is a weak password.");
    }
}
