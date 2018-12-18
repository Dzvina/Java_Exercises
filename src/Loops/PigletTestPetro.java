package Loops;

import java.util.Random;
import java.util.Scanner;

public class PigletTestPetro {

    public static void main(String[] args) {
        System.out.println("Welcome to Piglet!!!");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number;
        int sum = 0;

        do {
            number = random.nextInt(6) + 1;
            System.out.println("You rolled a " + number);
            if (number == 1) {
                System.out.println("You got 0 points");
                return;
            } else {
                sum += number;
            }
            System.out.print("Roll again? ");
        } while (scanner.nextBoolean());
        System.out.println("You got " + sum + " points");
    }
}
