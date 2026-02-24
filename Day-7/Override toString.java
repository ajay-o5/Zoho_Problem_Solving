package oopsassignment;
import java.util.*;

class PersonInfo {
    String name = "Ajay";

    public String toString() {
        return "Name: " + name;
    }
}

public class ToStringTest {
    public static void main(String[] args) {
        PersonInfo p = new PersonInfo();
        System.out.println(p);
    }
}
