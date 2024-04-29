import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double area = Math.PI * r * r;
        System.out.println(area);
    }
}
