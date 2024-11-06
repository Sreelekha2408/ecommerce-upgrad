import java.util.Scanner;

public class StringToIntegerConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String input = scanner.nextLine();
            System.out.print("Enter a string: " + input + "\n");
            try {
                int number = Integer.parseInt(input);
                System.out.println("Converted integer: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. The string cannot be parsed as an integer.");
            }

        } catch (NullPointerException e) {
            System.out.println("Error: Empty string entered. Please provide a non-empty string.");
        }

        scanner.close();
    }
}
