import java.util.Scanner;

public class ArrayMinimum {
    public static void main(String[] args) {

        int[] arr = {15, 25, 5, 45, 30};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }
}
