package oopsassignment;

import java.util.*;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        System.out.println("Balance: ₹" + account.getBalance());
    }
}
