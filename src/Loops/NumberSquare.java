package Loops;

import java.util.Scanner;

public class NumberSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Min? ");
        int firstNumber = scanner.nextInt();
        System.out.print("Max? ");
        int secondNumber = scanner.nextInt();

        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int k = i; k <= secondNumber; k++) {
                System.out.print(k);
            }
            for (int j = firstNumber; j <= i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
