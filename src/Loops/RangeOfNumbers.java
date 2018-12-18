package Loops;

import java.util.Scanner;

public class RangeOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Start? ");
        int firstNumber = scanner.nextInt();
        System.out.print("End? ");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                System.out.print(i + ", ");
            }
        } else {
            for (int i = firstNumber; i >= secondNumber; i--) {
                System.out.print(i + ", ");
            }
        }
    }
}
