package Threads;

class Cook extends Thread {
    int id;

    public Cook( int i) {
        this.id = i;
//        this.cooking = cooking;
    }
    public void marinate() {
        System.out.println("Cook " + id + " is marinating...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cook " + id + " has finished marinating.");
    }

    public void cook() {
        System.out.println("Cook " + id + " is cooking...");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cook " + id + " has finished cooking.");
    }

    public void serve() {
        System.out.println("Cook " + id + " is serving...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cook " + id + " finished serving.");
    }

    @Override
    public void run() {
//        synchronized(cooking) {
            marinate();
            cook();
            serve();
//        }
    }
}

public class Cooking {

    public static void main(String[] args) {
        Cooking cooking = new Cooking();

        Cook cook1 = new Cook(3);
        Cook cook2 = new Cook(2);
        Cook cook3 = new Cook(1);

        cook1.start();
        cook2.start();
        cook3.start();

        try {
            cook1.join();
            cook2.join();
            cook3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All cooks have finished their tasks.");
    }
}
