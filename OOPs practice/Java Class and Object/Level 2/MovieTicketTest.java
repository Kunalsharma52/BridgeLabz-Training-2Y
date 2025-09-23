class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(String newSeat, double newPrice) {
        this.seatNumber = newSeat;
        this.price = newPrice;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class MovieTicketTest {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers", "A10", 250);
        ticket.displayTicket();
        ticket.bookTicket("B15", 300);
        ticket.displayTicket();
    }
}
