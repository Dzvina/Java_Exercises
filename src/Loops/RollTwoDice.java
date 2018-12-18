package Loops;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Desired sum: ");
        int number = scanner.nextInt();

        Random random = new Random();

        int sum = 0;
        while (sum != number) {
            int firstDice = random.nextInt(6) + 1;
            int secondDice = random.nextInt(6) + 1;
            sum = firstDice + secondDice;
            if (firstDice + secondDice != number) {
                System.out.println(firstDice + " and " + secondDice + " = " + sum);
            }else{
                System.out.println(firstDice + " and " + secondDice + " = " + number);
            }
        }
    }
}
