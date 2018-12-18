package Loops;

import java.util.Scanner;

public class ComputeSumOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type an integer: ");
        long number = scanner.nextLong();

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;

        }

        System.out.println("Digit sum is " + sum);


    }
}
