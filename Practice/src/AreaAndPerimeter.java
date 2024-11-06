public class AreaAndPerimeter {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. */
        Rectangle rec = new Rectangle();
        rec.setLength(5.0);
        rec.setWidth(3.0);
        double area = rec.calculateArea();
        double perimeter = rec.calculatePerimeter();
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
    }
}

class Rectangle {
    private double length;
    private double width;
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth()
    {
        return width;
    }

    public  double getLength()
    {
        return length;
    }

    public  double calculateArea() {
        return  this.length*this.width;
    }
    public double calculatePerimeter() {
        return 2*(this.length + this.width);
    }
}