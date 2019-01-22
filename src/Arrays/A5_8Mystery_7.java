package Arrays;

import java.util.Arrays;

public class A5_8Mystery_7 {

    public static void arrayMysteryExam4(int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] = a[a.length - 1 - i] - a[i - 1];
        }
        System.out.println(Arrays.toString(a));
    }


    public static void main(String[] args) {
        int[] a1 = {6, 2, 4};
        arrayMysteryExam4(a1);
        int[] a2 = {4, 2, 3, 1, 2, 5};
        arrayMysteryExam4(a2);
        int[] a3 = {6, 0, -1, 3, -2, 0, 4};
        arrayMysteryExam4(a3);
    }
}
