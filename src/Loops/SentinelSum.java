package Loops;

import java.util.Scanner;

public class SentinelSum {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = scanner.nextInt();


        int sum = 0;
        while (num != -1) {


            sum += num;
            System.out.print("Type a number: ");
            num = scanner.nextInt();



        }
        System.out.println("Sum is: " + sum);






        //    Scanner scanner = new Scanner(System.in);

        //    int sum = 0;
        //    int num = 0;
        //    while (num != -1) {

        //        System.out.print("Type a number: ");
        //        num = scanner.nextInt();
        //        if( num != -1){
        //            sum += num;
        //            }else{
        //            break;
        //        }

        //    }
        //    System.out.println("Sum is: " + sum);

    }
}
