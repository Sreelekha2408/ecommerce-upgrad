package Classes.OOPS;

import java.util.Scanner;

class Parallelogram extends Quadrilateral {
    protected double height;

    public Parallelogram(double side1, double side2, double height) {
        super(side1, height, side1, height);
        this.height = height;
    }

    @Override
    protected double getArea() {
        return side1 * height;
    }

    @Override
    protected double getPerimeter() {
        return 2*(side1 + side2);
    }
}

// Implement the Rhombus class
class Rhombus extends Parallelogram {

    public Rhombus(double side, double height) {
        super(side, side, height);
    }

    @Override
    protected double getPerimeter() {
        return 4*side1;
    }
}

// Implement the Rectangle class
class RectangleSize extends Quadrilateral{
    public RectangleSize(double length, double breadth) {
        super(length, breadth, length, breadth);
    }

    @Override
    public double getArea() {
        return side1*side2;
    }

    @Override
    protected double getPerimeter() {
        return 2*(side1+side2);
    }
}

// Implement the Square class
class SquareSize extends Quadrilateral{


    public SquareSize(double side) {
        super(side,side,side,side);
    }

    @Override
    protected double getArea() {
        return side1*side1;
    }

    @Override
    protected double getPerimeter() {
        return 4*side1;
    }
}
public class SizeClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Parallelogram
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double height = scan.nextDouble();
        Parallelogram parallelogram = new Parallelogram(side1, side2, height);
        System.out.println("Parallelogram Perimeter: " + parallelogram.getPerimeter());
        System.out.println("Parallelogram Area: " + parallelogram.getArea());

        //Rhombus
        double side = scan.nextDouble();
        height = scan.nextDouble();
        Rhombus rhombus = new Rhombus(side, height);
        System.out.println("Rhombus Perimeter: " + rhombus.getPerimeter());
        System.out.println("Rhombus Area: " + rhombus.getArea());

        //Rectangle
        double length = scan.nextDouble();
        double breadth = scan.nextDouble();
        RectangleSize rectangle = new RectangleSize(length, breadth);
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        //Square
        side = scan.nextDouble();
        SquareSize square = new SquareSize(side);
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Square Area: " + square.getArea());

        scan.close();
    }
}