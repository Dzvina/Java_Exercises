package ParametersAndReturn;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        int temp = 1;
        for (int i = 1; i <= n; i++ ){
            temp *= i;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number ");
        int num = scanner.nextInt();
        System.out.println(factorial(num));
    }
}
