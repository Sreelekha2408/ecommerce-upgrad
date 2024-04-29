package Classes.ArraysList;

import java.util.ArrayList;

class FloatNumbers {

    public static void main(String[] args) {


        //Create an ArrayList using Generics here
        ArrayList<Double> random = new ArrayList<>();
        random.add(2.0);
        random.add(4.0);
        random.add(5.0);
        random.add(10.0);
        random.add(99.9);
        printArray(random);
    }

    public static void printArray(ArrayList<Double> arr) {
        for(Double obj : arr) {
//            Double floatValue = (Double) obj; // Cast Object to Float
            System.out.println(obj);
        }
    }
}
