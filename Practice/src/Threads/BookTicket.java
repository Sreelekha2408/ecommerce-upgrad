package Threads;

public class BookTicket extends Thread {

    final TicketBooking ticketBooking;
    int noOfTickets;

    public BookTicket(TicketBooking ticketBooking, int noOfTickets) {
        this.ticketBooking = ticketBooking;
        this.noOfTickets = noOfTickets;
    }

    @Override
    public void run() {
        synchronized(ticketBooking) {
            ticketBooking.bookTicket(noOfTickets);
        }
    }
}
