package Arrays;

public class M5_1_3Mystery_3 {

    public static void array2dMystery3(int[][] a) {
        for (int r = 0; r < a.length - 1; r++) {
            for (int c = 0; c < a[0].length - 1; c++) {
                if (a[r][c + 1] > a[r][c]) {
                    a[r][c] = a[r][c + 1];
                } else if (a[r + 1][c] > a[r][c]) {
                    a[r][c] = a[r + 1][c];
                }
                System.out.print(a[r][c]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a1 = {{3, 4, 5, 6}, {4, 2, 6, 1},
                {1, 6, 7, 2}};
        array2dMystery3(a1);
        System.out.println();
        int[][] a2 = {{1, 2, 3, 0, 5}, {2, 4, 6, 8, 10}, {9, 5, 1, 2, 4}};
        array2dMystery3(a2);
    }
}
