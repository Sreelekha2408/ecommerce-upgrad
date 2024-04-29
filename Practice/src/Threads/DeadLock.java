package Threads;

public class DeadLock {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String[] args) {
        DeadLockThread1 thread1 = new DeadLockThread1();
        DeadLockThread2 thread2 = new DeadLockThread2();
        thread1.start();
        thread2.start();
    }
    public  static class DeadLockThread1 extends Thread {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread1 holding lock1...");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { }
            System.out.println("Thread1 waiting for Lock2");
            synchronized (Lock2) {
                System.out.println("Thread1 holding Lock 1 & 2");
            }
        }
    }
    public  static class DeadLockThread2 extends Thread {
        public void run() {
            synchronized (Lock2) { // change 1 to 2 to create deadlock along with sout text
                System.out.println("Thread2 holding lock2...");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { }
            System.out.println("Thread2 waiting for Lock1");
            synchronized (Lock1) { // 2 to 1 to recreate deadlock along with sout text
                System.out.println("Thread2 holding Lock 1 & 2");
            }
        }
    }
}
