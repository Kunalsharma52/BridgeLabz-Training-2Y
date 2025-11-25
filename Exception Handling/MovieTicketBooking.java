import java.util.*;

class InvalidSeatException extends Exception { public InvalidSeatException(String m){ super(m); } }
class SeatAlreadyBookedException extends Exception { public SeatAlreadyBookedException(String m){ super(m); } }

public class MovieTicketBooking {
    static Map<Integer, Boolean> seats = new HashMap<>();
    static { for(int i=1;i<=5;i++) seats.put(i,true); }

    public static void bookSeat(int seat) throws InvalidSeatException, SeatAlreadyBookedException {
        if(!seats.containsKey(seat)) throw new InvalidSeatException("Seat does not exist");
        if(!seats.get(seat)) throw new SeatAlreadyBookedException("Seat already booked");
        seats.put(seat,false);
        System.out.println("Seat "+seat+" booked successfully");
    }

    public static void main(String[] args) {
        try { bookSeat(3); bookSeat(3); }
        catch(Exception e) { System.out.println(e.getMessage()); }
    }
}
