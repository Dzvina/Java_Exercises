package ParametersAndReturn;

import java.util.Scanner;

public class GetDaysInMonth {

    public static int getDaysInMonth(int month){
        if (month == 2) {
            return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else {
            System.out.println("non-existent month");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number from 1 to 12 - ");
        int num = scanner.nextInt();
        System.out.println(getDaysInMonth(num));
    }
}
