package oopsassignment;
import java.util.*;

abstract class PaymentSystem {
    abstract void processPayment();
}

class UPI extends PaymentSystem {
    void processPayment() {
        System.out.println("Processing UPI Payment");
    }
}

public class AbstractPaymentTest {
    public static void main(String[] args) {
        PaymentSystem p = new UPI();
        p.processPayment();
    }
}
