package ParametersAndReturn;

import java.util.Scanner;

public class IsPrimeNumber {

    public static boolean isPrimeNumber(int num) {
        if (num == 1) {
            System.out.println("False");
            return false;
        } else if (num == 2) {
            return true;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("False");
                return false;
            }
        }
        return num > 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write variable: ");
        int variable = scanner.nextInt();

        isPrimeNumber(variable);
    }
}
