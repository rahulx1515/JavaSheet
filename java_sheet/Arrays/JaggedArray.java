public class JaggedArray {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];
        jagged[0] = new int[2]; // Row 1 → 2 elements
        jagged[1] = new int[4]; // Row 2 → 4 elements
        jagged[2] = new int[3]; // Row 3 → 3 elements

        // Fill sequential numbers
        int num = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = num++;
            }
        }

        // Print neatly
        System.out.println("Jagged Array:");
        for (int[] row : jagged) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
