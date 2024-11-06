package Generics;

public class Constraints {
    public static void main(String[] args) {
        Integer[] cG1Numbers = {1,2,3,4,5};
        ConstraintGeneric<Integer> cG1 = new ConstraintGeneric<>(cG1Numbers);
        System.out.println(cG1.calculateAverage()+"\n");
        Double[] cG2Numbers = {1.1,2.2,3.3,4.4,5.5};
        ConstraintGeneric<Double> cG2 = new ConstraintGeneric<>(cG2Numbers);
        System.out.println(cG2.calculateAverage()+"\n");
    }
}
