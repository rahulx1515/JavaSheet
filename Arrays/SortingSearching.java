import java.util.Arrays;

public class SortingSearching {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1};

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 4);
        System.out.println("Index of 4: " + index);

        // Challenge: parallel sort
        int[] bigArr = new int[1000000];
        for (int i = 0; i < bigArr.length; i++) bigArr[i] = bigArr.length - i;

        long start = System.nanoTime();
        Arrays.sort(bigArr);
        long end = System.nanoTime();
        System.out.println("Arrays.sort() took: " + (end - start) / 1e6 + " ms");

        for (int i = 0; i < bigArr.length; i++) bigArr[i] = bigArr.length - i;
        start = System.nanoTime();
        Arrays.parallelSort(bigArr);
        end = System.nanoTime();
        System.out.println("Arrays.parallelSort() took: " + (end - start) / 1e6 + " ms");
    }
}
