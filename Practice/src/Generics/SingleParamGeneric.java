package Generics;

public class SingleParamGeneric {
    public static void main(String[] args) {
        SingleGeneric<Integer> sG1 = new SingleGeneric<>(123);
        sG1.displayType();
        System.out.println("Value of sG1:  " + sG1.getObject());
        System.out.println();
        SingleGeneric<String> sG2 = new SingleGeneric<>("Sreelekha");
        sG2.displayType();
        System.out.println("Value of sG2:  " + sG2.getObject());
        System.out.println();
        SingleGeneric<Boolean> sG3 = new SingleGeneric<>(true);
        sG3.displayType();
        System.out.println("Value of sG3:  " + sG3.getObject());
    }
}
