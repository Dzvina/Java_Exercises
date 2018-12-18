package ParametersAndReturn;

import java.util.Scanner;

public class PrintPay {

    public static void printPay(double salary, int hour) {

        double salary1;
        if (hour > 8) {
            salary1 = 8 * salary + (hour - 8) * (1.5 * salary);
        } else {
            salary1 = hour * salary;
        }

        System.out.println("Pay earned: $" + salary1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hours worked: ");
        int hour = scanner.nextInt();

        printPay(10.00, hour);
    }
}
