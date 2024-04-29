package Classes.OOPS;

class Square1 {
    protected double length, breadth;
    Square1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Length=" + length + "Breadth=" + breadth);
    }
}
//public class Cube extends Square {
//    double height;
//    Cube(double length, double breadth, double height) {
////        super(length, breadth);
//        this.height = height;
//        System.out.println("Height=" + height);
//    }
//    public static void main(String args[]) {
//        Cube obj = new Cube(4,5,6);
//    }
//}