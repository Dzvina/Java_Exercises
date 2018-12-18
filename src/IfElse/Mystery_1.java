package IfElse;

public class Mystery_1 {

    public void mystery(int n) {
        System.out.print(n + " ");
        if (n > 0) {
            n = n - 5;
        }
        if (n < 0) {
            n = n + 7;
        } else {
            n = n * 2;
        }
        System.out.println(n);
    }
}
