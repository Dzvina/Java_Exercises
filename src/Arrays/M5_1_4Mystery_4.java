package Arrays;

public class M5_1_4Mystery_4 {

    public static void array2dMystery4(int[][] a) {
        for (int r = 1; r < a.length - 1; r++) {
            for (int c = 1; c < a[0].length - 1; c++) {
                int sum1 = a[r - 1][c - 1] + a[r + 1][c + 1];
                int sum2 = a[r - 1][c + 1] + a[r + 1][c - 1];
                if (sum1 > sum2) {
                    a[r][c] = sum1;
                } else {
                    a[r][c] = sum2;
                }
                System.out.print(a[r][c]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a1 = {
                {3, 4, 5, 6, 2},
                {4, 2, 6, 1, 3},
                {5, 7, 4, 9, 1},
                {1, 6, 7, 2, 8}
        };

        int[][] a2 = {
                {0, 1, 0, 1, 0, 1},
                {2, 1, 2, 1, 2, 1},
                {0, 5, 0, 5, 0, 5},
                {3, 2, 3, 2, 3, 2},
                {1, 4, 1, 4, 1, 4}
        };

        array2dMystery4(a1);
        System.out.println();
        array2dMystery4(a2);
    }
}
