import java.util.Scanner;

public class FirstNPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of primes required to print
        int n = input.nextInt();

        // Initialize variables to track the count of prime numbers and the current number
        int count = 0;
        int num = 2;

        // Continue finding prime numbers until the count reaches the desired number 'n'
        while (count < n) {
            // Assume the current number is prime until proven otherwise
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                // If the current number is divisible by any factor,
                // set isPrime to false and break from the loop
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the current number is prime, print it and increment the count
            if (isPrime) {
                System.out.print(num);
                count++;

                // Add a comma if it is not the last prime
                if(count < n)
                    System.out.print(", ");
            }

            // Move on to the next number
            num++;
        }

        input.close();
    }
}
