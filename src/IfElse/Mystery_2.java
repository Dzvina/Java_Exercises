package IfElse;

public class Mystery_2 {

    public void mystery2(int a, int b) {
        if (a % b == 0) {
            a = a / b;
            if (a < b) {
                b = b - a;
            }
        } else if (b % 2 == 0) {
            b = b / 2;
        } else {
            a = a - b;
        }
        System.out.println(a + " " + b);
    }
}
