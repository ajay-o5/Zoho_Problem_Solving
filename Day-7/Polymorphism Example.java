package oopsassignment;
import java.util.*;

class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class PolymorphismTest {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
