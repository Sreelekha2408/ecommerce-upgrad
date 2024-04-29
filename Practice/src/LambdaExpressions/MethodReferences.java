package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodReferences {

    static class Printer {
        static void addTo(int a) {
            System.out.println(a+10);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        numbers.forEach((i) -> System.out.println(i+10));
        System.out.println();

        //Method Reference
        numbers.forEach(System.out :: println);

        System.out.println("\nMethod Reference using new class method: ");
        numbers.forEach(Printer:: addTo);
    }
}
