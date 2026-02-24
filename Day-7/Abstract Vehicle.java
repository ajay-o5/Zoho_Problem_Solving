package oopsassignment;
import java.util.*;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting...");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}
