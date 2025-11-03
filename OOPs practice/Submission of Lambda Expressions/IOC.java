import java.util.*;
import java.util.stream.*;

class Invoice {
    int transactionId;

    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice for Transaction ID: " + transactionId;
    }
}

public class IOC{
    public static void main(String[] args) {
        List<Integer> transactionIds = Arrays.asList(1001, 1002, 1003, 1004);
        transactionIds.stream()
                      .map(Invoice::new)
                      .forEach(System.out::println);
    }
}
