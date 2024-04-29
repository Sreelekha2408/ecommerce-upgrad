package DataStructures;

import java.util.HashMap;

public class MapClass {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        students.put(1, "Damon");
        students.put(2, "Stefan");
        students.put(3, "Lexi");
        students.put(4, "Bonnie");
        System.out.println(students);
        System.out.println(students.get(1));
        System.out.println(students.keySet());
        students.put(4, "Bonnie Benette");
        System.out.println(students);
    }
}
