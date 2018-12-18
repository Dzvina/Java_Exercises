package Loops;

import java.util.Random;
import java.util.Scanner;

public class Piglet {

    public static void main(String[] args) {
        System.out.println("Welcome to Piglet!!!");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(6) + 1;
        System.out.println("You rolled a " + number);
        int sum = number;
        if (number == 1) {
            System.out.println("You got 0 points");
        } else {
            System.out.print("Roll again? ");
            boolean answer = scanner.nextBoolean();

            while (answer) {

                number = random.nextInt(6) + 1;
                System.out.println("You rolled a " + number);
                sum += number;
                if (number == 1) {
                    System.out.println("You got 0 points");
                    return;
                }
                System.out.print("Roll again? ");
                answer = scanner.nextBoolean();
            }
            System.out.println("You got " + sum + " points");


        }
    }
}
