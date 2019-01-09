package Strings;

import java.util.Scanner;

public class Stutter {

    public static String stutter(String s) {
        String response = "";
        for (int i = 0; i < s.length(); i++) {
            response = response + s.charAt(i) + s.charAt(i);
        }
        System.out.println(response);
        return response;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write word ");
        String word = scanner.nextLine();

        stutter(word);
    }
}
