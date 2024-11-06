import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n;
//        int[] result = new ArrayList<>();
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.print(n1 + ", " + n2);
        for (int i = 0; i < n; i++) {
            int n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
