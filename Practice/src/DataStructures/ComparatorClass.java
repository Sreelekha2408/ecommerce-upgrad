package DataStructures;

import java.util.*;

class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
}
public class ComparatorClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        TreeSet<String> list1 = new TreeSet<>(new MyComp());
        list1.add("F");
        list1.add("B");
        list1.add("A");
        list1.add("E");
        list1.add("D");
        System.out.println("HashSet.. "+ list1);
        list.add("F");
        list.add("B");
        list.add("A");
        list.add("E");
        list.add("D");
        list.sort(new MyComp());
        System.out.println("Array List.... " +list);
    }
}
