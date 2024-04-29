package Classes.ArraysList;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class IteratorBackward {

    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        printList(random);
    }

    public static void printList(List<Float> arr) {
        ListIterator it = arr.listIterator(1);
        while (it.hasNext()) {
//            it.next();
            System.out.println(it.next());
        }
//           for(Float num : arr) {
//               System.out.println(num);
//           }
    }
}
