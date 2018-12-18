package ParametersAndReturn;

public class Mystery_11 {

    public static void main(String[] args) {

        bludger(2001);
    }
    private static void bludger(int y) {
        int x = y / 1000;
        int z = (x + y);
        x = quaffle(z, y);
        System.out.println("bludger: x = " + x + ", y = " + y + ", z = " + z);
    }
    private static int quaffle(int x, int y) {
        int z = snitch(x + y, y);
        y /= z;
        System.out.println("quaffle: x = " + x + ", y = " + y + ", z = " + z);
        return z;
    }
    private static int snitch(int x, int y) {
        y = x / (x % 10);
        System.out.println("snitch: x = " + x + ", y = " + y);
        return y;
    }
}
