package ParametersAndReturn;

import java.util.Scanner;

public class ThreeConsecutive {

    public static boolean threeConsecutive(int a, int b, int c) {
        int max = 0;
        int min = 0;

       // int min = Math.min(a, Math.min(b, c));
       // int max = Math.max(a, Math.max(b, c));


        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else if (c > a && c > b) {
            max = c;
        }

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else if (c < a && c < b) {
            min = c;
        }

        return max - min == 2 && a != b && a != c && b != c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number one: ");
        int numA = scanner.nextInt();
        System.out.print("Write number two: ");
        int numB = scanner.nextInt();
        System.out.print("Write number three: ");
        int numC = scanner.nextInt();

        threeConsecutive(numA, numB, numC);
    }
}
