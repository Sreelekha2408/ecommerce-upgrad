import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int flag =0;
        if(num==0 || num==1) {
            System.out.println(num + " is not a prime number.");
        } else {
            for(int i=2; i<=(num/2); i++) {
                if(num%i == 0){
                    flag = 1;
                    System.out.println(num + " is not a prime number.");
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(num + " is a prime number.");
            }
        }
    }
}
