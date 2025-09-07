import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};

        // Reference copy
        int[] arr2 = arr1;
        arr2[0] = 99;

        System.out.println("arr1 (after modifying arr2): " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        // Real copy
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);
        arr3[1] = 77;

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr3 (real copy): " + Arrays.toString(arr3));
    }
}
