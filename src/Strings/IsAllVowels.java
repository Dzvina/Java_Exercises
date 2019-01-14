package Strings;

import java.util.Scanner;

public class IsAllVowels {

    public static boolean isAllVowels(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (IsVowel.isVowel(String.valueOf(word.charAt(i)))) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write word: ");
        String word = scanner.nextLine();

        System.out.println(isAllVowels(word));
    }
}
