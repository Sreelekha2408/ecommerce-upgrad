package Generics;

public class MultipleParamGeneric {
    public static void main(String[] args) {
        MultipleGeneric<String, Number> mG1= new MultipleGeneric<>("Sreelekha", 23);
        mG1.displayTypes();
        System.out.println("Data1: " + mG1.getData1() + "\nData2: "+ mG1.getData2());
    }
}
