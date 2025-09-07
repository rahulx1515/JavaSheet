import java.util.Arrays;

public class ArrayInitialization {
    public static void main(String[] args) {
        // Dynamic initialization: size 5, values = squares of indices
        int[] dynamicArray = new int[5];
        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = i * i; // fill with square of index
        }

        // Static initialization: predefined values
        int[] staticArray = {10, 20, 30, 40, 50};

        // Print both arrays
        System.out.println("Dynamic Array (squares of indices): " + Arrays.toString(dynamicArray));
        System.out.println("Static Array: " + Arrays.toString(staticArray));
    }
}

