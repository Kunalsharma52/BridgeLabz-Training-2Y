import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) { super(message); }
}

public class LoginSystem {
    public static void validate(String user, String pass) throws InvalidCredentialsException {
        String validUser = "admin", validPass = "1234";
        if(!user.equals(validUser) || !pass.equals(validPass))
            throw new InvalidCredentialsException("Invalid credentials!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: "); String user = sc.nextLine();
        System.out.print("Password: "); String pass = sc.nextLine();

        try {
            validate(user, pass);
            System.out.println("Login successful!");
        } catch(InvalidCredentialsException e) {
            System.out.println(e.getMessage() + " Please try again.");
        }
    }
}

