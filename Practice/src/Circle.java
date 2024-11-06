public class Circle {
    private double radius;
    double area;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    void calculateArea(){
        area = Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.calculateArea();
        System.out.println("Area of the circle: " + circle.area);
    }
}
