package Loops;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Max value? ");
        int value = scanner.nextInt();

        for (int i = 1; i <= value; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
