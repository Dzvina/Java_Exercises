package ParametersAndReturn;

import java.util.Scanner;

public class IsMultiple {

    public static boolean isMultiple(int a, int b) {
        if (a <= 0 || b <= 0) {
            System.out.println("False value is negative");
        } else if (a % b == 0) {
            System.out.println("True");
            return true;
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number one: ");
        int numA = scanner.nextInt();
        System.out.print("Write number two: ");
        int numB = scanner.nextInt();

        isMultiple(numA, numB);


    }
}
