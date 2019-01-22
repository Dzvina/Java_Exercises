package Arrays;

import java.util.Arrays;

public class A5_9Mystery_8 {

    public static void arrayMysteryExam6(int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            a[i] = a[i - 1] + a[i + 1];
            if (a[i] % 2 == 0) {
                a[i] = a[i] / 2;
            }
        }
        System.out.println(Arrays.toString(a));
    }


    public static void main(String[] args) {
        int[] a1 = {1, 3, 4, 6};
        arrayMysteryExam6(a1);
        int[] a2 = {8, 13, 0, 6, 11, 2};
        arrayMysteryExam6(a2);
    }
}
