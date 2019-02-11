package Collections;

import java.util.ArrayList;

public class Mystery_2 {

    public static void arrayListMystery1(ArrayList<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            if (n % 10 == 0) {
                v.remove(i);
                v.add(n);
            }
        }
        System.out.println(v);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(20);
        a1.add(3);
        a1.add(40);
       arrayListMystery1(a1);
        System.out.println();
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(80);
        a2.add(3);
        a2.add(40);
        a2.add(20);
        a2.add(7);
        arrayListMystery1(a2);
        System.out.println();
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(40);
        a3.add(20);
        a3.add(60);
        a3.add(1);
        a3.add(80);
        a3.add(30);
        arrayListMystery1(a3);
        System.out.println();
    }
}
