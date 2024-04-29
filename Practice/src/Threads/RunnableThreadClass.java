package Threads;

public class RunnableThreadClass implements Runnable {
    String name;

    public RunnableThreadClass(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Runnable Thread " + name + " running at " + i);
                Thread.sleep(1000);
            }
            System.out.println("Thread has completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        RunnableThreadClass thread = new RunnableThreadClass("RThread1");
//        A direct call of a Thread object's run method does not start a separate thread.
//        The method is executed within the current thread. This is an unusual use because
//        Thread. run() is normally intended to be called from within a separate thread.
        Thread t = new Thread(thread);
        t.start();
    }
}
