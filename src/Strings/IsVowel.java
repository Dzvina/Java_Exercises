package Strings;

import java.util.Scanner;

public class IsVowel {

    public static boolean isVowel(String sentence) {
        String vowels = "aeoui";
        return vowels.contains(sentence.toLowerCase());



        /*if (sentence.equalsIgnoreCase("a") || sentence.equalsIgnoreCase("e") || sentence.equalsIgnoreCase("i") ||
                sentence.equalsIgnoreCase("o") || sentence.equalsIgnoreCase("u")) {
            return true;
        }
        return false;*/
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write character: ");
        String character = scanner.nextLine();

        System.out.println(isVowel(character));
    }
}
