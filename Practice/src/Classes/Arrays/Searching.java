package Classes.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        search(arr, k);
    }

    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) {
        for(int a: arr) {
            if(a == k) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
