package oopsassignment;
import java.util.*;

class AnimalBase {
    void eat() {
        System.out.println("Animal Eating");
    }
}

class Lion extends AnimalBase {}
class Tiger extends AnimalBase {}

public class AnimalHierarchyTest {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.eat();
    }
}
