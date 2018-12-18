package Loops;

public class FibonacciConstant {

    private static final int MAX_TERM_VALUE = 10000;

    public static void main(String[] args) {

        System.out.println("This program lists the Fibonacci sequence.");
        int temp1 = 0;
        int temp2 = 1;
        while (temp1 < MAX_TERM_VALUE) {

            System.out.println(temp1);
            int temp3 = temp1 + temp2;
            temp1 = temp2;
            temp2 = temp3;


        }
    }
}
