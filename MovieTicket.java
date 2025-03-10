import java.util.Scanner;

public class MovieTicket {
    private final String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully.");
        } else {
            System.out.println("This ticket is already booked.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: Rs " + price);
        } else {
            System.out.println("No ticket booked yet for movie: " + movieName);
            System.out.println("Book a ticket now.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket("Inception");

        System.out.println("----Movie ticket details before booking----");
        ticket.displayTicketDetails();
        System.out.print("Enter seat number to book: ");
        String seatNumber = sc.nextLine();
        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();
        System.out.println();
        ticket.bookTicket(seatNumber, price);

        // Display updated ticket details
        System.out.println("----Movie ticket details after booking----");
        ticket.displayTicketDetails();
    }
}
