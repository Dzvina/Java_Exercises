import java.util.Scanner;

public class ContainsTwice {

    public static boolean containsTwice(String string, char character) {
        int numberOfMatches = 0;
        char[] mas = string.toCharArray();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == character) {
                numberOfMatches++;
            }
        }
        return numberOfMatches > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write word ");
        String word = scanner.nextLine();
        System.out.print("Write character ");
        char ch = scanner.next().charAt(0);

        containsTwice(word, ch);
    }
}
