package Collections;

        import java.util.ArrayList;

public class Mystery_1 {

    public static void mystery1(ArrayList<Integer> a) {
        for (int i = a.size() - 1; i > 0; i--) {
            if (a.get(i) < a.get(i - 1)) {
                int n = a.get(i);
                a.remove(i);
                a.add(0, n);
            }
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(6);
        a1.add(1);
        a1.add(8);
        mystery1(a1);
        System.out.println();
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(10);
        a2.add(30);
        a2.add(40);
        a2.add(20);
        a2.add(60);
        a2.add(50);
        mystery1(a2);
        System.out.println();
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(-4);
        a3.add(16);
        a3.add(9);
        a3.add(1);
        a3.add(64);
        a3.add(25);
        a3.add(36);
        a3.add(4);
        a3.add(49);
        mystery1(a3);
        System.out.println();
    }
}
