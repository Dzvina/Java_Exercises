package Strings;

import java.util.Scanner;

public class NameDiamond {

    public static void nameDiamond(String s) {

        for (int i = 0; i < s.length(); i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(s.charAt(k));
            }
            System.out.println();
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s = s.replace(s.charAt(i), ' '));
        }


    }


    public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
         System.out.print("Write your word: ");
         String type = console.nextLine();

        nameDiamond(type);
    }
}
