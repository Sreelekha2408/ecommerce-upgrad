package Threads;

public class ThreadJoinClass extends Thread{
    String name;

    public ThreadJoinClass(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("running thread: "+name+ " at :"+ i);
        }
    }

    public static void main(String[] args) {
        ThreadJoinClass tJC1 = new ThreadJoinClass("thread1");
        ThreadJoinClass tJC2 = new ThreadJoinClass("thread2");
        ThreadJoinClass tJC3 = new ThreadJoinClass("thread3");
        tJC1.start();
        tJC2.start();
        tJC3.start();
        try {
            tJC1.join();
            tJC2.join();
            tJC3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread has completed");
    }
}
