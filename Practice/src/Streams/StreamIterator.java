package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StreamIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Sree", "Lekha", "Nossam"));
        System.out.println(list);
        Iterator<String> itr = list.stream().iterator();
        while (itr.hasNext()) {
            System.out.println("Stream: "+itr.next());
        }
        System.out.println();
        //ParallelStream
        Iterator<String> itr1 = list.parallelStream().iterator();
        while (itr1.hasNext()) {
            System.out.println("Parallel Stream: "+itr1.next());
        }
    }
}
