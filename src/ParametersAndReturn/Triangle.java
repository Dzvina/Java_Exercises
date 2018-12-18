package ParametersAndReturn;

import java.util.Scanner;

public class Triangle {

    public static void triangle(int size) {

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= (-1 * i + size); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write parameter ");
        int parameter = scanner.nextInt();

        triangle(parameter);
    }
}
