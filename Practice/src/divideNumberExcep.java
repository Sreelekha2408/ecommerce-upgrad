import java.util.InputMismatchException;
import java.util.Scanner;

public class divideNumberExcep {
    int division;
    int divisor;
    int division(int a, int b){
        if(b == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        } else {
            return a/b;
        }
    }

    public static void main(String[] args) {
        divideNumberExcep div = new divideNumberExcep();
        Scanner input  = new Scanner(System.in);
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            int result = div.division(a, b);
            System.out.println("Quotient: "+result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Division process completed.");
        }
    }
}
