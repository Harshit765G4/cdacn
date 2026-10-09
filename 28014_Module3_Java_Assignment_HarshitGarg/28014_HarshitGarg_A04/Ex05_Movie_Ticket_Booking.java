import java.util.Scanner;

public class Ex05_Movie_Ticket_Booking {

    String customerName;
    String movieName;
    int numberOfTickets;
    double ticketPrice;
    double totalAmount;

    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Movie Name: ");
        movieName = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        numberOfTickets = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        ticketPrice = sc.nextDouble();
    }

    void calculateAmount() {
        totalAmount = numberOfTickets * ticketPrice;
    }

    void display() {
        System.out.println("\n----- Movie Ticket Booking -----");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Ticket Price: %.2f%n", ticketPrice);
        System.out.printf("Total Amount: %.2f%n", totalAmount);
    }

    public static void main(String[] args) {
        Ex05_Movie_Ticket_Booking booking =
                new Ex05_Movie_Ticket_Booking();

        booking.read();
        booking.calculateAmount();
        booking.display();
    }
}
