package Collections.ArrayList;

import java.util.ArrayList;

public class Repeat {

    public static void repeat(ArrayList<String> list, int k){
        ArrayList<String> repeatList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j<k; j++){
                repeatList.add(list.get(i));
            }
        }
        System.out.println(repeatList);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("How");
        list.add("are");
        list.add("you?");
        repeat(list,4);
    }
}
