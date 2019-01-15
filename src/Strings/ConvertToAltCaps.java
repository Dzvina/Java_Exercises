package Strings;

import java.util.Scanner;

public class ConvertToAltCaps {

    public static String convertToAltCaps(String word) {
        char[] mas = word.toCharArray();
        String finish = "";
        if (mas[0] <= 'z' && mas[0] >= 'a') {
            for (int i = 0; i < mas.length; i++) {
                if (i % 2 == 0) {
                    finish += Character.toUpperCase(mas[i]);
                } else {
                    finish += Character.toLowerCase(mas[i]);
                }
            }
            return finish;
        } else {
            for (int i = 0; i < mas.length; i++) {
                if (i % 2 == 0) {
                    finish += Character.toLowerCase(mas[i]);
                } else {
                    finish += Character.toUpperCase(mas[i]);
                }
            }
            return finish;
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Write your word: ");
        String type = console.nextLine();

        System.out.println(convertToAltCaps(type));
    }
}
