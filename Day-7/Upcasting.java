package oopsassignment;
import java.util.*;

class ParentClass {}
class ChildClass extends ParentClass {}

public class UpcastingTest {
    public static void main(String[] args) {
        ParentClass obj = new ChildClass();
        System.out.println("Upcasting Done");
    }
}
