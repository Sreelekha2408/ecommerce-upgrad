package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
//        for (String s : list) { //enhanced for loop
//            System.out.println(s);
//        }
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
