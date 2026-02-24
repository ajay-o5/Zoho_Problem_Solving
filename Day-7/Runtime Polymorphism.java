package oopsassignment;
import java.util.*;

class ShapeBase {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Square extends ShapeBase {
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class RuntimePolyTest {
    public static void main(String[] args) {
        ShapeBase s = new Square();
        s.draw();
    }
}
