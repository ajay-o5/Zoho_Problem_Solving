import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] arr = {60, 20, 80, 10, 40};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
