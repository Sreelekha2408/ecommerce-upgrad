import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = input.nextInt();
        }
        int min = a[0];
        int max = a[1];
        for(int val: a) {
            if(min > val) {
                min = val;
            }
            if(max < val) {
                max = val;
            }
        }
        System.out.println("Maximum: "+ max +", " + "Minimum: "+ min);
    }
}
