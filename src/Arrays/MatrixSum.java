package Arrays;

public class MatrixSum {

    public static void matrixSum(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[2][3];

        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j <= matrix2.length; j++) {

                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{1, 2, 3}, {4, 4, 4}};
        int[][] matrix2 = new int[][]{{5, 5, 6}, {0, -1, 2}};
        matrixSum(matrix1, matrix2);
    }
}
