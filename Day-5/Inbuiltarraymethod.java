import java.util.Arrays;

public class InBuiltArrayMethods {
    public static void main(String[] args) {

        int[] arr = {50, 20, 40, 10, 30};

        // Sort
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Binary Search
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Element 30 found at index: " + index);

        // Fill
        Arrays.fill(arr, 100);
        System.out.println("After fill: " + Arrays.toString(arr));
    }
}
