package ParametersAndReturn;

public class Mystery_3 {

    public static void main(String[] args) {

        int a = 4;
        int b = 2;
        int c = 5;
        a = mystery(c, b);
        c = mystery(b, a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static int mystery(int b, int c) {
        return c + 2 * b;
    }
}
