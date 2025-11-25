import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class  NF{
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Low oxygen level detected."),
            new Alert("Normal", "Daily checkup reminder."),
            new Alert("Emergency", "Heart rate irregularity detected."),
            new Alert("Info", "Appointment confirmed.")
        );

        Predicate<Alert> showCriticalAndEmergency = a -> a.type.equals("Critical") || a.type.equals("Emergency");

        alerts.stream()
              .filter(showCriticalAndEmergency)
              .forEach(System.out::println);
    }
}
