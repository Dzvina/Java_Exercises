package Arrays;

public class A5_2Mystery_1 {

    public static void mystery1(int[] a1, int[] a2) {
        for (int i = 0; i < a1.length; i++) {
            a1[i] += a2[a2.length - i - 1];
            System.out.println(a1[i]);
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {1, 4, 9, 16, 25};
        mystery1(a1, a2);
    }
}
