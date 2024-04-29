package Threads;

import java.util.Scanner;

public class TicketBooking {
//    private final ReentrantLock lock = new ReentrantLock();
// Tried to write the same program using ReentrantLock
    int availableTickets;
    public int getAvailableTickets() {
        return this.availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }
    public void bookTicket(int numOfTickets) {
        int availableTickets = getAvailableTickets();
        if(availableTickets < numOfTickets) {
            System.out.println("Insufficient tickets available.");
        } else {
            System.out.println("Tickets booked: " + numOfTickets);
            setAvailableTickets(availableTickets - numOfTickets);
        }
    }


    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();
        Scanner input = new Scanner(System.in);
        int a  = input.nextInt();
        booking.setAvailableTickets(a);
        BookTicket ticketBooking = new BookTicket(booking, 50);
        BookTicket ticketBooking1 = new BookTicket(booking, 50);
        BookTicket ticketBooking2 = new BookTicket(booking, 50);
        BookTicket ticketBooking3 = new BookTicket(booking, 50);
        BookTicket ticketBooking4 = new BookTicket(booking, 50);
        ticketBooking.start();
        ticketBooking1.start();
        ticketBooking2.start();
        ticketBooking3.start();
        ticketBooking4.start();
        try {
            ticketBooking.join();
            ticketBooking1.join();
            ticketBooking2.join();
            ticketBooking3.join();
            ticketBooking4.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Remaining tickets: " + booking.getAvailableTickets());
    }
}
