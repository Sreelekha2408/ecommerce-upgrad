package DataStructures;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("A");
        //Won't allow duplicate elements
        System.out.println(hashSet);
        hashSet.remove("A");
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet);
    }
}
