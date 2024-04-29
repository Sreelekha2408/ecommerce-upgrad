package Generics;

public class MultipleGeneric<T,U> {
    T data1;
    U data2;

    public MultipleGeneric(T data1, U data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public T getData1() {
        return data1;
    }

    public U getData2() {
        return data2;
    }
    void displayTypes() {
        System.out.println("Data1's Type: " + data1.getClass().getName());
        System.out.println("Data2's Type: " + data2.getClass().getName());
    }
}
