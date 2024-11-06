package Classes.ArraysList;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList mix = new ArrayList();
        mix.add("Hari");
        mix.add(2);
        printMixList(mix);
    }

    public static void printMixList(ArrayList elements) {
        for(Object o : elements) {
            System.out.println(o);
        }
    }
}
