package Collections;

import java.util.ArrayList;

public class Mystery_6 {
    public static void collectionMystery1(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            list.remove(i);
            if (n % 2 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(5);
        a1.add(2);
        a1.add(5);
        a1.add(2);
        collectionMystery1(a1);
        System.out.println();
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(3);
        a2.add(5);
        a2.add(8);
        a2.add(9);
        a2.add(2);
        collectionMystery1(a2);
        System.out.println();
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(0);
        a3.add(1);
        a3.add(4);
        a3.add(3);
        a3.add(1);
        a3.add(3);
        collectionMystery1(a3);
        System.out.println();
    }
}
