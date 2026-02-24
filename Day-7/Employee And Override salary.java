package oopsassignment;
import java.util.*;

class Employee {
    double salary() {
        return 20000;
    }
}

class Manager extends Employee {
    @Override
    double salary() {
        return 50000;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Manager();
        System.out.println("Salary: " + emp.salary());
    }
}
