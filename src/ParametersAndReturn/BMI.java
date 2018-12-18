package ParametersAndReturn;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {

    public static void BMI(double weight, double neight) {
        double bmi = weight / (neight * neight) * 703;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("BMI = " + f.format(bmi));
        if (bmi <= 18.4){
            System.out.println("class 1");
        }else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("class 2");
        }else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("class 3");
        }else if (bmi >= 30) {
            System.out.println("class 4");
        }

    }

    public static void human(Scanner scanner){
        System.out.println("Person information:");
        System.out.print("height (in inches)? ");
        double height = scanner.nextDouble();

        System.out.print("weight (in pounds)? ");
        double weight = scanner.nextDouble();
        BMI(weight, height);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        human(scanner);
        human(scanner);
    }


}
