package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAll {

    public static void removeAll(String text, char character) {
        ArrayList<Character> mas = new ArrayList<>();
        for (char c : text.toCharArray()) {
            mas.add(c);
        }

        for (int i = 0; i < mas.size(); i++) {
            if (mas.get(i) == character) {
                mas.remove(i);
            }
        }
        for (Character c : mas) {
            System.out.print(c);
        }

    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Write your text: ");
        String type = console.nextLine();

        System.out.print("Write your character: ");
        char character = console.next().charAt(0);

        removeAll(type.toLowerCase(), character);

    }
}
