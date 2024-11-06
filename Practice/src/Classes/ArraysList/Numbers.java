package Classes.ArraysList;

import java.util.ArrayList;

public class Numbers {
    public static void main(String[] args) {
//        ArrayList<Object> random = new ArrayList<>();
//        random.add(2);
//        random.add(4);
//        random.add(5);
//        random.add(10);
//        random.add(99);
//        random.add("3333");
//        for(Object a : random) {              //Change the data type of 'a' from 'int' to 'Object'
//            System.out.println(a);
//        }
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        System.out.println(random.contains(5f));

    }
}
