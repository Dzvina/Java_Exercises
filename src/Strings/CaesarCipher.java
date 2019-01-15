package Strings;

import java.util.Scanner;

public class CaesarCipher {

    public static void CaesarCipher(String text, int shift) {

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter + shift);

                if (letter > 'z') {
                    letter = (char) (letter - 26);
                } else if (letter < 'a') {
                    letter = (char) (letter + 26);
                }
            }
            System.out.print(letter);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Your secret message: ");
        String message = console.nextLine();
        message = message.toLowerCase();

        System.out.print("Your secret key: ");
        int key = console.nextInt();

        CaesarCipher(message, key);
    }
}
