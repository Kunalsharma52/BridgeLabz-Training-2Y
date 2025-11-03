import java.util.*;
import java.util.stream.*;

public class NUC {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Amit", "Neha", "Kunal", "Riya");
        employees.stream()
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
    }
}
