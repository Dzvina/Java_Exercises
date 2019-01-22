package Arrays;

import java.util.Arrays;

public class A5_10Mystery_9 {

    public static void run() {
        int y = 1;
        int x = 3;
        int[] a = new int[4];
        mystery(a, y, x);
        System.out.println(x + " " + y + " " + Arrays.toString(a));
        x = y - 1;
        mystery(a, y, x);
        System.out.println(x + " " + y + " " + Arrays.toString(a));
    }

    public static void mystery(int[] a, int x, int y) {
        if (x < y) {
            x++;
            a[x] = 17;
        } else {
            a[y] = 17;
        }
        System.out.println(x + " " + y + " " + Arrays.toString(a));
    }

    public static void main(String[] args) {
        run();
    }
}
