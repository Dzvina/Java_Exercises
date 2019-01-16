package Strings;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void removeDuplicates(String duplicates) {
        char[] characters = duplicates.toCharArray();
        int length = characters.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    int temp = j;

                    for (int k = temp; k < length - 1; k++) {
                        characters[k] = characters[k + 1];
                    }
                    j--;
                    length--;
                }
            }
        }
        String duplicates1 = new String(characters);
        duplicates1 = duplicates1.substring(0, length);
        System.out.println(duplicates1);


    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Write your word: ");
        String type = console.nextLine();

        removeDuplicates(type);
    }
}