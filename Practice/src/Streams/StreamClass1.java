package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamClass1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,45,34, 6,19, 3));
        System.out.println(list);
        Stream<Integer> myStream = list.stream();
        System.out.println(myStream);
        Optional<Integer> min = myStream.min(Integer::compare);
        System.out.println(min);
        Optional<Integer> max = list.stream().max(Integer::compare);
        System.out.println(max);
        Stream<Integer> filtered = list.stream().filter(n -> n > 20);
        System.out.println(filtered.toList());
        Stream<Integer> even = list.stream().filter(n -> n%2 ==0);
        System.out.println(even.toList());
        Stream<Integer> evenGreater = list.stream().filter(n -> n%2 ==0).filter(n -> n < 10);
        System.out.println(evenGreater.toList());

//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(url))
//                .POST(HttpRequest.BodyPublishers.ofStrind(data))
//                .build();
//        This is the correct answer. Run is not a Maven goal. Maven goals are used to specify actions that should be taken when building a project.



    }
}
