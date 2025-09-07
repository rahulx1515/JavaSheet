public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        // Fill with numbers 1–9
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = num++;
            }
        }

        int primarySum = 0, secondarySum = 0;
        for (int i = 0; i < 3; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][2 - i];
        }

        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
    }
}
