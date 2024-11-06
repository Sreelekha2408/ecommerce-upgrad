package Classes.OOPS;

class Shape123 {
    public Shape123() {
        super();
        System.out.println("inside Shape class default constructor");
    }
}

class Rectangle123 extends Shape {
    public Rectangle123() {
        super();
        System.out.println("inside Rectangle class default constructor");
    }
}

class Square123 extends Rectangle {
    public Square123() {
        super();
        System.out.println("inside Square class default constructor");
    }
}

public class ConstructorChain1 {
    public static void main(String[] args) {
        Square123 sq = new Square123();
    }
}
