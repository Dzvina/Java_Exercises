package ParametersAndReturn;

import java.util.Scanner;

public class BoxOfStars {

    public static int boxOfStars(int width, int height) {

        for (int j = 1; j <= height; j++) {
            for (int i = 1; i <= width; i++) {
                if (j == 1 || j == height || i == 1 || i == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the rectangle: ");
        int h = scanner.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int w = scanner.nextInt();

        boxOfStars(w, h);

    }
}
