package Strings;

import java.util.Scanner;

public class NameGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        String[] names = name.split(" ");


        String newFirst = names[0];
        String newLast = names[1];

        names[0] = newFirst.substring(1);
        names[1] = newLast.substring(1);


        playGame(newFirst, names[0]);
        System.out.println();
        playGame(newLast, names[1]);

    }

    public static void playGame(String a, String b) {
        System.out.println(a + " " + a + ", " + "bo-B" + b);
        System.out.println("Banana-fana fo-F" + b);
        System.out.println("Fee-fi-mo-M" + b);
        System.out.println(a.toUpperCase() + "!");
    }
}
