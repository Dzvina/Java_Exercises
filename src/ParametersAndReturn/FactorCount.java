package ParametersAndReturn;

import java.util.Scanner;

public class FactorCount {

    public static int factorCount(int value) {
        int count = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number ");
        int number = scanner.nextInt();
        System.out.println(factorCount(number));
    }
}
