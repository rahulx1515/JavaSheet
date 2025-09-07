public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 3;
        int[][] table = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("3x3 Multiplication Table:");
        for (int[] row : table) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}
