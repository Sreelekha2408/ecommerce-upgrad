package Generics;
public class GenericMinFinder {
    public static <T extends Comparable<T>> T findMin(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T min = array[0];
        for(int i=0; i< array.length; i++){
            if(array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return  min;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 9, 1, 7};
        String[] stringArray = {"apple", "banana", "orange", "grape"};
        Integer minInt = findMin(intArray);
        String minString = findMin(stringArray);
        System.out.println("Minimum element in the integer array: " + minInt);
        System.out.println("Minimum element in the string array: " + minString);
    }
}
