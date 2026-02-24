package oopsassignment;
import java.util.*;

class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}

class Car {
    Engine engine = new Engine();
}

public class HasATest {
    public static void main(String[] args) {
        Car c = new Car();
        c.engine.start();
    }
}
