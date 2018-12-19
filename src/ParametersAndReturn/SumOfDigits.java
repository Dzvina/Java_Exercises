package ParametersAndReturn;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(int digits) {
        int sum = 0;
        if (digits < 0){
            digits *= -1;
        }
        while (digits > 0) {
            sum += digits % 10;
            digits /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number ");
        int number = scanner.nextInt();
        System.out.println("Digit sum is " + sumOfDigits(number));
    }
}
