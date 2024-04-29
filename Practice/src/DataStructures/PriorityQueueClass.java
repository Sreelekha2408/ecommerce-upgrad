package DataStructures;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        //First In First Out
        //poll method: retrives first element and removes from the queue
        //offer method:
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.offer("A");
        pq.offer("B");
        pq.offer("C");
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.add("Check");
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.remove("C");
        System.out.println(pq);
    }
}
