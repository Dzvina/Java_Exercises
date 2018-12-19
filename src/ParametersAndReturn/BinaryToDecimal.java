package ParametersAndReturn;

import java.util.Scanner;

public class BinaryToDecimal {

    public static int binaryToDecimal(int number) {

        int dec_value = 0;
        int base = 1;

        while (number !=0)
        {
            int last_digit = number % 10;
            number = number/10;

            dec_value += last_digit*base;

            base = base*2;
        }

        return dec_value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number ");
        int number = scanner.nextInt();
        System.out.println(binaryToDecimal(number));
    }
}
