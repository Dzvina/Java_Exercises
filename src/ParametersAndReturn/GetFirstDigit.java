package ParametersAndReturn;

import java.util.Scanner;

public class GetFirstDigit {

    public static int getFirstDigit(int digit){
        while (Math.abs(digit) >= 10 ) {
            digit = digit / 10;
        }
        return Math.abs(digit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number ");
        int number = scanner.nextInt();
        System.out.println(getFirstDigit(number));
    }
}
