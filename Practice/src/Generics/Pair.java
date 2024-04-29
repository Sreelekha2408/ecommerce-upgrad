package Generics;

public class Pair<T, V>{
    T first;
    V second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<Integer,Integer> intergerPair = new Pair<>();
        intergerPair.setFirst(10); intergerPair.setSecond(20);
        Pair<String,String> stringPair = new Pair<>();
        stringPair.setFirst("Hello"); stringPair.setSecond("World");
        System.out.println("Integer Pair: "+ intergerPair.getFirst() +", "+ intergerPair.getSecond());
        System.out.println("String Pair: "+ stringPair.getFirst() +", "+stringPair.getSecond());
        intergerPair.setFirst(30);
        System.out.println("Updated Integer Pair: "+ intergerPair.getFirst() +", "+ intergerPair.getSecond());
        stringPair.setSecond("Java");
        System.out.println("Updated String Pair: "+ stringPair.getFirst() +", "+stringPair.getSecond());
    }
}
