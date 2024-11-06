package Generics;

public class ConstraitSubGenericClass<T, V> extends SingleGeneric<T>{
    V object2;

    public ConstraitSubGenericClass(T object1, V object2) {
        super(object1);
        this.object2 = object2;
    }

    public V getObject2() {
        return object2;
    }

    public static void main(String[] args) {
        ConstraitSubGenericClass csG1 = new ConstraitSubGenericClass("Value", 22);
        System.out.println(csG1.getObject());
        System.out.println(csG1.getObject2());
    }
}
