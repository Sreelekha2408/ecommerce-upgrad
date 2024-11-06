package LambdaExpressions;

public class LambdaExpressionsClass {
    public static void main(String[] args) {
        Calculator add = ((a, b) -> a+b);
        System.out.println("Sum... "+add.compute(4,5));
        Calculator multiply = ((a, b) -> a*b);
        System.out.println("Multiply... "+ multiply.compute(4,5));
         Calculator addAndMultiply = (int a, int b) -> {
             int addition = a + b;
             int mul = a * b;
             return addition + mul;
         };
         System.out.println("SumAndMultiply... "+ addAndMultiply.compute(4,5));
    }
}
