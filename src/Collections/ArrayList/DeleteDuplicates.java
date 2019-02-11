package Collections.ArrayList;

import java.util.ArrayList;

public class DeleteDuplicates {

    public static void deleteDuplicates(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.lastIndexOf(list.get(i)) != i) {
                list.remove(list.get(i));

            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("be");
        list.add("be");
        list.add("is");
        list.add("not");
        list.add("or");
        list.add("question");
        list.add("that");
        list.add("the");
        list.add("to");
        list.add("to");
        deleteDuplicates(list);
    }
}
