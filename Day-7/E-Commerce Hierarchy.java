package oopsassignment;
import java.util.*;

class Product {}
class Electronics extends Product {}
class Clothing extends Product {}

public class EcommerceTest {
    public static void main(String[] args) {
        Electronics e = new Electronics();
        System.out.println("Electronics Product Created");
    }
}
