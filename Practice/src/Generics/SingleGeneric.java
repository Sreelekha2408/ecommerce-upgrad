package Generics;

public class SingleGeneric <T>{
    T object;

    public SingleGeneric(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    void displayType(){
        System.out.println("T's dataType.. "+ object.getClass().getName());
    }
}
