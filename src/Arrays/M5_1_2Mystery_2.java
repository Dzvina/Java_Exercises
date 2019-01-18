package Arrays;

public class M5_1_2Mystery_2 {

    public static void array2dMystery2(int[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = a[0].length - 2; c > 0; c--) {
                a[r][c] = a[r][c - 1] + a[r][c + 1];
                System.out.print(a[r][c]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] a1 = {{2, 1, 6}, {5, 8, 9}, {1, -5, -4}};
        array2dMystery2(a1);
        System.out.println();

        int[][] a2 = {{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {0, 1, 2, 3, 4}};
        array2dMystery2(a2);
    }
}
