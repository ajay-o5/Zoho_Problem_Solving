package oopsassignment;
import java.util.*;

class ParentBase {}
class ChildBase extends ParentBase {}

public class DowncastingTest {
    public static void main(String[] args) {
        ParentBase p = new ChildBase();
        ChildBase c = (ChildBase) p;
        System.out.println("Downcasting Done");
    }
}
