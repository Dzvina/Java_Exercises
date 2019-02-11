package Collections.ArrayList;

import java.util.ArrayList;

public class Twice {
    public static void twice(ArrayList<String> list){
        list.addAll(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("How");
        list.add("are");
        list.add("you?");
        twice(list);
    }
}
