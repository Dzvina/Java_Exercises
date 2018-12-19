package ParametersAndReturn;

import java.util.Scanner;

public class GetLastDigit {

    public static int getLastDigit(int digit) {
        return Math.abs(digit % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number ");
        int number = scanner.nextInt();
        System.out.println(getLastDigit(number));
    }
}
