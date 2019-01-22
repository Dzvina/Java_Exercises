package Arrays;

public class A5_5Mystery_4 {

    public static void mystery2(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (i % 2 == 0) {
                list[i]++;
            } else {
                list[i]--;
            }

            System.out.print(list[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a1 = {6, 3};
        mystery2(a1);
        int[] a2 = {2, 4, 6};
        mystery2(a2);
        int[] a3 = {1, 2, 3, 4};
        mystery2(a3);
        int[] a4 = {2, 2, 2, 2, 2};
        mystery2(a4);
        int[] a5 = {7, 3, 2, 0, 5, 1};
        mystery2(a5);
    }
}
