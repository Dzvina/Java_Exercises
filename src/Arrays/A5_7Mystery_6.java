package Arrays;

import java.util.Arrays;

public class A5_7Mystery_6 {

    public static void arrayMysteryExam2(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                a[0]++;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a1 = {5, 2, 5, 2};
        arrayMysteryExam2(a1);
        int[] a2 = {30, 10, 20, 50, 40};
        arrayMysteryExam2(a2);
        int[] a3 = {99, 88, 77, 66, 55, 44};
        arrayMysteryExam2(a3);
    }
}
