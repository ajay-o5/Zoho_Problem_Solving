import java.util.Scanner;

public class ArrayMaximum {
    public static void main(String[] args) {

        int[] arr = {15, 25, 5, 45, 30};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}
