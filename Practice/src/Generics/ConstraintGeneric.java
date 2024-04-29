package Generics;

public class ConstraintGeneric<T extends Number> {
    T[] number;

    public ConstraintGeneric(T[] number) {
        this.number = number;
    }
     double calculateAverage() {
        double sum = 0.0;
         for (T t : number) {
             sum = sum + t.doubleValue();
         }
        return sum/ number.length;
     }
}
