package oopsassignment;
import java.util.*;

class User {}
class Admin extends User {}
class Customer extends User {}

public class UserRoleTest {
    public static void main(String[] args) {
        Admin a = new Admin();
        System.out.println("Admin Created");
    }
}
