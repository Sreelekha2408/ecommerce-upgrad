package Threads;

public class ThreadClass extends Thread{
    String name;

    public ThreadClass(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0;i<=10; i++){
            try {
                System.out.println("Running thread "+ name + " at "+ i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread has completed");
    }

    public static void main(String[] args) {
        ThreadClass thread = new ThreadClass("Thread1");
        thread.start();
    }
}
