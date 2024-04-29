import java.util.Scanner;

public class SumOfEvenNumsInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = input.nextInt();
        }
        int sum = 0;
        for(int el: a) {
            if(el%2 == 0) {
                sum = sum+el;
            }
        }
        System.out.println("Sum of even elements: "+ sum);
    }
}
