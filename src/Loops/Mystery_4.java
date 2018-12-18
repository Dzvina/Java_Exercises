package Loops;

public class Mystery_4 {

    public static void main(String[] args) {

        loopMysteryExam4(12,4);
        loopMysteryExam4(14,2);
        loopMysteryExam4(27,3);
    }

    public static void loopMysteryExam4(int x, int y) {
        int z = y;
        while (x % z == 0) {
            System.out.print("(" + x + " " + z + " )");
            x = x - z;
            z++;

        }
        System.out.println("(" + x + " " + z +") " + y);
    }
}
