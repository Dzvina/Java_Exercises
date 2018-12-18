package Loops;

import java.util.Scanner;

public class BiggestAndSmallest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of numbers? ");
        int numbers = scanner.nextInt();


        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= numbers; i++) {
            System.out.print("Number " + i + ": ");
            int number = scanner.nextInt();


            if (number < smallest) {
                smallest = number;
            }
            if (number > biggest) {
                biggest = number;
            }


        }
        System.out.println("Biggest = " + biggest);
        System.out.println("Smallest = " + smallest);
    }
}
