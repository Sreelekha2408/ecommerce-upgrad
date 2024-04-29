import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] =input.nextInt();
        }
        int total = 0;
        for (int i=0; i<a.length; i++) {
            total =  total + a[i];
        }
        System.out.println(total);
    }
}
