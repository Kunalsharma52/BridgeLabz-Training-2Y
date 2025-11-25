import java.util.function.Function;

public class SLC {
    public static void main(String[] args) {
        int limit = 20;
        Function<String, Integer> getLength = msg -> msg.length();

        String message = "Hello, this is a long message.";

        int length = getLength.apply(message);

        if (length > limit)
            System.out.println("Message exceeds character limit.");
        else
            System.out.println("Message is within limit.");
    }
}
