import java.io.*;

public class InputStreamReaderExample {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter text:");
        String input = br.readLine();

        System.out.println("You entered: " + input);
    }
}