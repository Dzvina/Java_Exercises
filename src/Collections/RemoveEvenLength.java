package Collections;

import java.util.ArrayList;

public class RemoveEvenLength {

    public static void removeEvenLength(ArrayList<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() % 2 == 0) {
                stringList.remove(i);
                i -= 1;
            }
        }
        System.out.println(stringList);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hi");
        list.add("there");
        list.add("how");
        list.add("is");
        list.add("it");
        list.add("going");
        list.add("good");
        list.add("sirs");
        removeEvenLength(list);
    }
}
