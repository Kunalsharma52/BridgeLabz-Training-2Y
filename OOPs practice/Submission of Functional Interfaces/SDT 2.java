interface SensitiveData {}

class UserCredentials implements SensitiveData {
    String username;
    String password;

    UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class LogData {
    String message;

    LogData(String message) {
        this.message = message;
    }
}

class EncryptionProcessor {
    public void encrypt(Object obj) {
        if (obj instanceof SensitiveData)
            System.out.println("Encrypting sensitive data: " + obj.getClass().getSimpleName());
        else
            System.out.println("No encryption needed for: " + obj.getClass().getSimpleName());
    }
}

public class SDT{
    public static void main(String[] args) {
        UserCredentials user = new UserCredentials("Kunal", "pass123");
        LogData log = new LogData("System started successfully.");

        EncryptionProcessor processor = new EncryptionProcessor();
        processor.encrypt(user);
        processor.encrypt(log);
    }
}
