package ParametersAndReturn;

public class ShoeTwos {

    public static void showTwos(int num) {

        System.out.print(num + " = ");

        while (num % 2 == 0) {

            System.out.print("2 * ");
            num = num / 2;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {

        showTwos(7);
        showTwos(18);
        showTwos(68);
        showTwos(120);
    }
}
