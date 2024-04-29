public class Vehicle2 {
    String model;
    int year;

    public Vehicle2(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayDetails(){
        System.out.println("Model: " + this.model + ", Year: "+ this.year);
    }

    public static void main(String[] args) {
        Vehicle2 car =  new CarClass("Toyota Camry", 2022,4);
        Vehicle2 truck = new Truck("Ford F-150", 2020, 2.5);
        Vehicle2 motorCycle = new MotorCycle("Harley Davidson", 2021, false);
        Vehicle2[] vehicles = new Vehicle2[3];
        vehicles[0] = car;
        vehicles[1] = motorCycle;
        vehicles[2] = truck;
        for (Vehicle2 vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println();
        }
    }
}
class CarClass extends Vehicle2 {
    int numberOfDoors;

    public CarClass(String model, int year, int numberOfDoors) {
        super(model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
class Truck extends Vehicle2 {
    double cargoCapacity;

    public Truck(String model, int year, double cargoCapacity) {
        super(model, year);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}

class MotorCycle extends Vehicle2 {
    boolean hasSideCar;

    public MotorCycle(String model, int year, boolean hasSideCar) {
        super(model, year);
        this.hasSideCar = hasSideCar;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Has Sidecar: "+ hasSideCar);
    }
}
