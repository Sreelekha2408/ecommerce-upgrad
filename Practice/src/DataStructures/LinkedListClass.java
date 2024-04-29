package DataStructures;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        //adding element at last and start of the list
        list.addFirst("First");
        list.addLast("Last");
        //index
        list.add(3, "Index");
        System.out.println(list);

        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.add("A");
        list.add("B");
        System.out.println(list);
        list.removeFirstOccurrence("A");
        System.out.println(list);
    }
}
