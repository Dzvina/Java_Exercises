package Collections;

import java.util.ArrayList;

public class Mystery_7 {

    public static void collectionMystery4(ArrayList<Integer> v) {
        for (int i = 1; i < v.size(); i += 2) {
            if (v.get(i - 1) >= v.get(i)) {
                v.remove(i);
                v.add(0, 0);
            }
        }
        System.out.println(v);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(10);
        a1.add(5);
        collectionMystery4(a1);
        System.out.println();
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(8);
        a2.add(2);
        a2.add(9);
        a2.add(7);
        a2.add(-1);
        a2.add(55);
        collectionMystery4(a2);
        System.out.println();
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(0);
        a3.add(16);
        a3.add(9);
        a3.add(1);
        a3.add(64);
        a3.add(25);
        a3.add(25);
        a3.add(14);
        a3.add(0);
        collectionMystery4(a3);
        System.out.println();
    }
}
