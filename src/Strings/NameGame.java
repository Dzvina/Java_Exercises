package Strings;

import java.util.Scanner;

public class NameGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String newFirst = firstName.substring(1);
        String newLast = lastName.substring(1);

        String question = "What is your name? ";
        System.out.println(question + firstName + " " + lastName);

        playGame(firstName, newFirst);
        System.out.println();
        playGame(lastName, newLast);

    }

    public static void playGame(String a, String b) {
        System.out.println(a + " " + a + ", " + "bo-B" + b);
        System.out.println("Banana-fana fo-F" + b);
        System.out.println("Fee-fi-mo-M" + b);
        System.out.println(a.toUpperCase() + "!");
    }
}
