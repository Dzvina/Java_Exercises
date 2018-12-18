package Loops;

public class NumberLoops_1_2_3 {

    private static final int COUNT = 9;

    public static void main(String[] args) {



        System.out.println();
        System.out.println("2.2");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("2.3.");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j > 0; j--)
                System.out.print(".");

            for (int j = 0; j < i; j++)
                System.out.print(i);

            System.out.println();
        }
        System.out.println();
        System.out.println("2.3.1");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (-1 * i + 5); j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("2.4.");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (-1 * i + 5); j++) {
                System.out.print(".");
            }
            System.out.print(i);
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(".");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("2.5.");
        System.out.println();

        for (int i = 1; i <= COUNT; i++) {
            for (int j = 1; j <= (-1 * i + COUNT); j++) {
                System.out.print(".");
            }
            System.out.print(i);
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
