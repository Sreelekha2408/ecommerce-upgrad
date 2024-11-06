public class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void displayDetails() {
        System.out.println("Make: "+ this.make);
        System.out.println("Model: "+ this.model);
    }

    public static void main(String[] args) {
        Vehicle c = new Car("Toyota", "Corolla", 4);
        c.displayDetails();
    }
}

class  Car extends Vehicle {
    int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    @Override
    void displayDetails() {
        System.out.println("Make: "+ this.make);
        System.out.println("Model: "+ this.model);
        System.out.println("Number of Doors: "+ this.numDoors);
    }
}