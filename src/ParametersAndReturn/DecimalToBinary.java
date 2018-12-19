package ParametersAndReturn;

import java.util.Scanner;

public class DecimalToBinary {

    public static String decimalToBinary(int digit){
        return Integer.toString(digit, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number ");
        int number = scanner.nextInt();
        System.out.println("Digit sum is " + decimalToBinary(number));
    }
}
