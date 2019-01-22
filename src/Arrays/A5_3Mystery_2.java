package Arrays;

public class A5_3Mystery_2 {

    public static void arrayMystery2(int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            a[i] = a[i - 1] - a[i] + a[i + 1];
            System.out.println(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a1 = {42, 42};
        arrayMystery2(a1);
        int[] a2 = {6, 2, 4};
        arrayMystery2(a2);
        int[] a3 = {7, 7, 3, 8, 2};
        arrayMystery2(a3);
        int[] a4 = {4, 2, 3, 1, 2, 5};
        arrayMystery2(a4);
        int[] a5 = {6, 0, -1, 3, 5, 0, -3};
        arrayMystery2(a5);
    }
}

