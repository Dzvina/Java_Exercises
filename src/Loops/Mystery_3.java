package Loops;

public class Mystery_3 {
    public static void main(String[] args) {

        loopMysteryExam2(40, 10);
    }

    public static int loopMysteryExam2(int x, int y) {

        int z = x + y;
        while (x > 0 && y > 0) {
            x = x - y;
            y--;
            System.out.print(x + " " + y + " ");
        }

        System.out.println(y);
        return z;
    }
}
