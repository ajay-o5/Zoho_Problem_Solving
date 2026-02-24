package oopsassignment;
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " ₹" + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Ajay",50000);
        e1.display();
    }
}
