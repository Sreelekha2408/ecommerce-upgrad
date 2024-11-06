import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            int num = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter a positive integer: " + num + "\n");
            int factorial = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is: " + factorial);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a positive integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static int calculateFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Error: Factorial is not defined for negative numbers.");
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
