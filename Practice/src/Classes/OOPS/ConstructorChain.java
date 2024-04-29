package Classes.OOPS;

class Shape {
    public Shape() {
        System.out.println("inside Shape class default constructor");
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        System.out.println("inside Rectangle class default constructor");
    }
}

class Square12 extends Rectangle {
    public Square12() {
        System.out.println("inside Square class default constructor");
    }
}

public class ConstructorChain {
    public static void main(String[] args) {
        Square12 sq = new Square12();
    }
}