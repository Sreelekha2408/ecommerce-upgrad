package Generics;

public class ComparableInterface<E extends Comparable<E>> {
    E object2;

    public ComparableInterface(E object2) {
        this.object2 = object2;
    }

    public E updateObject(E object1) {
        if(object2.compareTo(object1) < 0) {
            E prevObject2 = object2;
            object2 = object1;
            return prevObject2;
        }
        return object2;
    }

    void printObject2(){
        System.out.println("Final Object2 Value... " + object2);
    }

    public static void main(String[] args) {
        ComparableInterface cI = new ComparableInterface(9);
        System.out.println("Updating Object2 Value... "+cI.updateObject(6));
        System.out.println();
        cI.printObject2();
    }
}
