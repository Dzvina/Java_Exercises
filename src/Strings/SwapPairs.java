package Strings;

import java.util.Scanner;

public class SwapPairs {

    public static String swapPairs(String text){
        char[] newText = text.toCharArray();

        for(int i = 0; i <= newText.length - 2; i += 2) {
            char temp = newText[i];
            newText[i] = newText[i+1];
            newText[i+1] = temp;
        }

        return new String(newText);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Write your word: ");
        String type = console.nextLine();

        System.out.println(swapPairs(type));
    }
}
