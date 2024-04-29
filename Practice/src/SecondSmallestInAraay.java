import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestInAraay {
//    Write a Java program to find the second smallest element in an array of integers.
//    The program should get the size of the array as input, followed by the number of array elements.
    public static void main(String[] args) {
        Scanner input1  = new Scanner(System.in);
        int n = input1.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = input1.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Second largest: "+ a[a.length -2]);
    }
}
