package Threads;;

public class CounterThread extends Thread {
    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
//            synchronized(counter) {
                counter.increment();
//            }
            {/**
             Commenting the line 13 and 15 make the ThreadSynchronization class lost synchronization.
             Our result should be 20000 count but due to unsynchronized thread execution the count not
             becoming 20000, consider two threads are executing counter at a time instead of taking result
             two times, the process will take only one result so the counter is less.
             */}
        }
    }
}
