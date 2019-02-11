package Collections.ArrayList;

import java.util.ArrayList;

public class Mirror {

    public static void mirror(ArrayList<String> list) {
        ArrayList<String> mirrorList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            mirrorList.add(list.get(i));
        }
        list.addAll(mirrorList);
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("s");
        list.add("d");
        list.add("e");
        list.add("f");
        mirror(list);
    }
}
