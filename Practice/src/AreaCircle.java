import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaCircle {
    void calculateArea(double r) throws NegativeRadiusException {
        if(r<0) {
            throw new NegativeRadiusException("Error: Radius cannot be negative.");
        }
        if(r==0) {
            throw  new IllegalArgumentException("Error: Radius cannot be zero.");
        }
        double area = Math.PI * r * r;

        System.out.println("Area of the circle: "+area);
    }

    public static void main(String[] args) {
        AreaCircle area =  new AreaCircle();
        Scanner input = new Scanner(System.in);
        try {
            double r = input.nextDouble();
            area.calculateArea(r);
        } catch (IllegalArgumentException | NegativeRadiusException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
    }

    private static class NegativeRadiusException extends Throwable {
        public NegativeRadiusException(String s) {
            super(s);
        }
    }
}
