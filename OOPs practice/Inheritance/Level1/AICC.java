abstract class Payment {
    abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}

class UpiPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}

public class AICC {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UpiPayment();
        p1.processPayment(1000);
        p2.processPayment(500);
    }
}
