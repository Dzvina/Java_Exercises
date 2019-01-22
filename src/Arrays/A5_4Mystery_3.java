package Arrays;

public class A5_4Mystery_3 {

    public static void mystery(int[] list) {
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i] + list[i - 1];
            System.out.print(list[i]+", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a1 = {8};
        mystery(a1);
        int[] a2 = {6, 3};
        mystery(a2);
        int[] a3 = {2, 4, 6};
        mystery(a3);
        int[] a4 = {1, 2, 3, 4};
        mystery(a4);
        int[] a5 = {7, 3, 2, 0, 5};
        mystery(a5);
    }
}
