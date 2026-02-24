package oopsassignment;
import java.util.*;

class Parent {
    void show() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child Method");
    }
}

public class OverridingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
