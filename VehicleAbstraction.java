abstract class Vehicle
{
    abstract void start();
    abstract void stop();
    String fuelType() {
        return "Vehicle fuelType";
    }
}
class Car extends Vehicle
{
    void start() {
        System.out.println("Car has start method");
    }

    void stop() {
        System.out.println("Car has stop method");
    }
    String fuelType() {
        return "Car needs Petrol/Diesel";
    }
}
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike has start method");
    }
    void stop() {
        System.out.println("Bike has stop method");
    }
}
public class VehicleAbstraction
{
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.start();
        obj1.stop();
        Vehicle obj2 =new Bike();
        obj2.start();
        obj2.stop();
        System.out.println(obj1.fuelType());
    }
}
