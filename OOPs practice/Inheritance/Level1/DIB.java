class Payment {
    void processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}

public class DIB {
    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        p.processPayment(5000);
    }
}
