package oopsassignment;
import java.util.*;

class Account {}
class SavingsAccount extends Account {}
class CurrentAccount extends Account {}

public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        System.out.println("Savings Account Created");
    }
}
