package ParametersAndReturn;

import java.util.Scanner;

public class CountDigits {

    public static int countDigits(int value) {
        int temp = 0;

        while (value != 0) {
            value = value / 10;
            temp++;


        }
        System.out.println(temp);
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write the number: ");
        int number = scanner.nextInt();

        countDigits(number);
    }
}
