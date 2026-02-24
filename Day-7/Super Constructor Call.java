package oopsassignment;
import java.util.*;

class Person {
    Person() {
        System.out.println("Person Constructor");
    }
}

class Student extends Person {
    Student() {
        super();
        System.out.println("Student Constructor");
    }
}

public class SuperTest {
    public static void main(String[] args) {
        new Student();
    }
}
