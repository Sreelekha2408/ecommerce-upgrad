package Threads;

public class ThreadSynchronization {
    public static void main(String[] args) {
        Counter count = new Counter();
        CounterThread class1 = new CounterThread(count);
        CounterThread class2 = new CounterThread(count);
        class1.start();
        class2.start();
        try {
            class1.join();
            class2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count.counter);
    }
}
