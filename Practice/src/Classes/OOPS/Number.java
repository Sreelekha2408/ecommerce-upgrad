package Classes.OOPS;

import java.util.Scanner;

public class Number {
    private double realNumber;
    private double imaginary;
    public Number(double realNumber, double imaginary) {
        this.imaginary = imaginary;
        this.realNumber = realNumber;
    }

    public double getRealNumber() {
        return realNumber;
    }

    public double getImaginary() {
        return imaginary;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginary());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();
    }
}
class Complex extends Number{

    public Complex(double realNumber, double imaginary) {
        super(realNumber, imaginary);
    }
    public boolean checkComplex() {
        return getRealNumber() == 0;
    }
}
class PurelyImaginary extends Complex {
    public PurelyImaginary(double real, double imaginary) {
        super(real, imaginary);
    }

    public void checkPurelyImaginaryNumber() {
        boolean isReal = checkComplex();
        if(isReal) {
            System.out.println(getImaginary() != 0 ? "The given number is complex":"The given number is real");
            if(getImaginary() != 0) {
                System.out.println("i"+getImaginary());
                System.out.println("The number is purely imaginary");
            }
            else {
                System.out.println(getRealNumber()+"+i"+getImaginary());
                System.out.println("The number is not purely imaginary");
            }
        } else {
            System.out.println("The given number is complex");
            System.out.println(getRealNumber()+"+i"+getImaginary());
            System.out.println("The number is not purely imaginary");
        }
    }
}

