package DataStructures;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class TicketQueue {
    Queue<String> customers;

    public TicketQueue() {
        this.customers = new ArrayDeque<>();
    }

    public void enqueueRequest(String customerName) {
        customers.add(customerName);
    }
    public void dequeueRequest() {
        customers.remove();
    }
    public boolean hasRequests() {
        return !customers.isEmpty();
    }

    public static void main(String[] args) {
        TicketQueue tickets = new TicketQueue();
        tickets.enqueueRequest("Sree");
        tickets.enqueueRequest("Ramya");
        tickets.dequeueRequest();
        System.out.println("Has requests? " + tickets.hasRequests());
    }
}
