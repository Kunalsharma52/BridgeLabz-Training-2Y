class SeatUnavailableException extends Exception { public SeatUnavailableException(String m){ super(m); } }
class PaymentFailedException extends Exception { public PaymentFailedException(String m){ super(m); } }

public class FlightBooking {
    public static void checkSeatAvailability() throws SeatUnavailableException { throw new SeatUnavailableException("Seat unavailable"); }
    public static void processPayment() throws PaymentFailedException { throw new PaymentFailedException("Payment failed"); }
    public static void bookTicket() throws Exception { checkSeatAvailability(); processPayment(); }

    public static void main(String[] args) {
        try { bookTicket(); }
        catch(SeatUnavailableException e) { System.out.println(e.getMessage()); }
        catch(PaymentFailedException e) { System.out.println(e.getMessage()); }
        catch(Exception e) { System.out.println("Other error: " + e.getMessage()); }
        finally { System.out.println("Thank you for booking with us!"); }
    }
}
