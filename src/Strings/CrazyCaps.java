package Strings;

import java.util.Scanner;

public class CrazyCaps {

    public static void crazyCaps(String word){

        System.out.println(ConvertToAltCaps.convertToAltCaps(word));
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Write your word: ");
        String type = console.nextLine();

        crazyCaps(type);
    }
}
