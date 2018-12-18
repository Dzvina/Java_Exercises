package Loops;

public class Pow {

    public static int Pow(int a, int b) {
        int k = 1;
        for (int i = 0; i < b; i++) {
            k = k * a;
            System.out.println(k);
        }
        return k;
    }

    public static void main(String[] args) {
        Pow(3, 4);

    }
}
