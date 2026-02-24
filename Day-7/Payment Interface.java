package oopsassignment;
import java.util.*;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        p.pay(5000);
    }
}
