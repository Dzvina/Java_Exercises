package Collections;

import java.util.ArrayList;

public class Mystery_3 {
    public static void mystery(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if (n % 10 == 0) {
                list.remove(i);
                list.add(n);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(20);
        a1.add(3);
        a1.add(40);
        mystery(a1);
        System.out.println();
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(80);
        a2.add(3);
        a2.add(40);
        a2.add(20);
        a2.add(7);
        mystery(a2);
        System.out.println();
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(40);
        a3.add(20);
        a3.add(60);
        a3.add(1);
        a3.add(80);
        a3.add(30);
       mystery(a3);
        System.out.println();
    }
}
