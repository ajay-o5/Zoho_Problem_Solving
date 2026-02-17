import java.util.Scanner;

public class ReverseStringArray {
    public static void main(String[] args) {

        String[] arr = {"Java", "Python", "C", "C++", "HTML"};

        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nReversed Array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
